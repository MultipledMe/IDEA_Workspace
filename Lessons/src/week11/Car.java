package week11;

public class Car implements Comparable{
    int weight;
    String brand;
    Color color;
    Car(String b, int w, Color c){
        this.weight =w;
        this.brand =b;
        this.color = c;
    }

//    @Override
//    public int compareTo(Object o) {
   //     Car c = (Car)o;
      //  return this.weight-c.weight;
    //}


    @Override
    public int compareTo(Object s) {
        return this.color.ordinal()-((Car)s).color.ordinal();
    }
}
