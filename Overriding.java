class A{
  public int a;
  public int gautam(){
    return  4;
  }
  public void math2(){
  System.out.println("i am a mathod 2 of class A");
}
}
class B extends A{
  public void math2(){
    System.out.println("i am a mathod 2 of class B");
  }
  public void math3(){
    System.out.println("i am a mathod 3 of class B");
  }
}
public class Overriding{
public static void main(String [] args){
A  a = new A();
a.math2();
B b = new B();
b.math2();
}
}