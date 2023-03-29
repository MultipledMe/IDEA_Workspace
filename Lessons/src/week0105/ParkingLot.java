package week0105;

import java.text.DecimalFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class ParkingLot {
    private SqStack S = new SqStack(100);
    private LinkQueue Q = new LinkQueue();
    private double fee = 2;
    public final static int DEPARTURE = 0;
    public final static int ARRIVAL = 1;

    public class CarInfo{
        public int state;
        public GregorianCalendar arrTime;
        public GregorianCalendar depTime;
        public String license;

    }
    public void parkingManag(String license, String action) throws Exception{
        if("arrive".equals(action)){
            CarInfo info = new CarInfo();
            info.license = license;
            if(S.length() < 33){
                info.arrTime = (GregorianCalendar) GregorianCalendar.getInstance();
                info.state = ARRIVAL;
                S.push(info);
                System.out.println(info.license + "号停放在停车场第" + S.length() + "个位置!");

            }
            else {
                Q.offer(info);
                System.out.println(info.license + "号停放在便道第" + Q.length() + "个位置!");
            }
        }
        else if ("depart".equals(action)) {
            CarInfo info = null;
            int location = 0;
            SqStack s2 = new SqStack(S.length());
            for (int i = S.length(); i > 0 ; i--) {
                info = (CarInfo)S.pop();
                if (info.license.equals(license)){
                    info.depTime = (GregorianCalendar) GregorianCalendar.getInstance();
                    info.state = DEPARTURE;
                    location = i;
                    break;
                }
                else
                    s2.push(info);
            }
            while (!s2.isEmpty()){
                S.push(s2.pop());
                if (location != 0){
                    double time = (info.depTime.getTimeInMillis() - info.arrTime.getTimeInMillis()) / (1000 * 60);
                    DecimalFormat df = new DecimalFormat("0.0");
                    System.out.println(info.license + "停放：" + df.format(time) + "分钟，费用为"+ df.format(time * fee));

                }
                if (!Q.isEmpty()){
                    info = (CarInfo) Q.poll();
                    info.arrTime = (GregorianCalendar) GregorianCalendar.getInstance();
                    info.state = ARRIVAL;
                    S.push(info);
                }
            }

        }

    }

    public static void main(String[] args) throws Exception {
        ParkingLot pm = new ParkingLot();
        for (int i = 1; i <= 50; i++)//人为规定第1-50号的，素数在停车场内，非素数在便道
            pm.parkingManag(String.valueOf(i),"arrive");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入车牌号：");
        String license = sc.next();
        System.out.println("arrive or depart ? ");
        String action = sc.next();
        pm.parkingManag(license,action);
    }
}
