public class n4q1 {
    double width ,length,area;



    public double getLength() {
      return length;
    }
    public double getWidth() {
      return width;
   }
   // public double getArea(){

     //   return length*width;
  //  }

    public static void main(String[] args) {

        n4q1  p1=new n4q1();

        p1.length=4;
        p1.width=5;

        System.out.println("the area rectangle= "+p1.getWidth()*p1.getLength());

        System.out.println("the concert of the rectangle= "+(p1.getLength()+ p1.getLength())*2);
    }




}
