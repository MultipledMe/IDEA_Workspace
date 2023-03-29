import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
//并发数据结构
public class ThreadMapDemo1 {
    public static void main(String[] args) throws InterruptedException {
        // 线程不安全
        MapThread111 t1 = new MapThread111(new HashMap<>());
        // 线程安全
        MapThread111 t2 = new MapThread111(Collections.synchronizedMap(new HashMap<>()));
        // 线程安全
        MapThread111 t3 = new MapThread111(new ConcurrentHashMap<>());

        // 分别启动十个线程, 运行测试
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(t1);
            t.start();
        }
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(t2);
            t.start();
        }
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(t3);
            t.start();
        }

        // 等待子线程执行完
        Thread.sleep(2000);
        System.out.println(LocalDateTime.now() + " => " + t1.map.size());
        System.out.println(LocalDateTime.now() + " => " + t2.map.size());
        System.out.println(LocalDateTime.now() + " => " + t3.map.size());

        // 输出 map 中的值
        System.out.println(LocalDateTime.now() + " => " + "unsafeMap:");
        Iterator<Map.Entry<Integer, String>> iterator = t1.map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.print(entry.getKey() + ":" + entry.getValue() + "  ");
        }
        System.out.println();

        System.out.println(LocalDateTime.now() + " => " + "safeMap:");
        iterator = t2.map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.print(entry.getKey() + ":" + entry.getValue() + "  ");
        }
        System.out.println();

        System.out.println(LocalDateTime.now() + " => " + "safeMap2:");
        iterator = t3.map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.print(entry.getKey() + ":" + entry.getValue() + "  ");
        }
        System.out.println();
        System.out.println(LocalDateTime.now() + " => " + "mapThread1.map.size()" + t1.map.size());
        System.out.println(LocalDateTime.now() + " => " + "mapThread2.map.size()" + t2.map.size());
        System.out.println(LocalDateTime.now() + " => " + "mapThread3.map.size()" + t3.map.size());


    }
}

class MapThread111 implements Runnable {
    public Map<Integer, String> map;

    public MapThread111(Map<Integer, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 把当前线程名称放入map中
            map.put(++i, Thread.currentThread().getName());
        }
    }
}
