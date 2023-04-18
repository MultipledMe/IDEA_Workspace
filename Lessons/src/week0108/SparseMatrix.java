package week0108;

public class SparseMatrix {
    public TripleNode data[];
    public int rows;
    public int cols;
    public int nums;
    public SparseMatrix(int maxSize){
        data = new TripleNode[maxSize];
        for (int i = 0; i < data.length; i++) {
            data[i] = new TripleNode();
        }
        rows = 0;
        cols = 0;
        nums = 0;
    }
    public void printMatrix(){
        int i;
        System.out.println("稀疏矩阵的三元组存储结构：");
        System.out.println("行数：" + rows + ",列数：" + cols +",非零元素个数：" + nums);
        System.out.println("行下标 列下标 元素值");
        for (int j = 0; j < nums; j++) {
            System.out.println(data[j] + "\t" + data[j].column + "\t" + data[j].value);
        }
    }
}
