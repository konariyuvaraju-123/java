class E{
void run()
{
System.out.println("not dynamic method dispatch");
} 
}
class F extends E{
void run()
{
System.out.println("this is dynamic method dispatch");
}
}
interface A
{
  public void read();
  static int a=10;
    
}
abstract class C
{
  abstract void display();
} 
class D extends C 
{
      
       void display()
       {
        System.out.println("this is super method");
       }
       D()
       {
        System.out.println("this is constructor method");
       }
       D(int a, int b)
       {
         System.out.println(a+" "+b);
       }
}

class B extends D implements A
{
    static void inter()
  {
   System.out.println("static block");
  }
    
       
    public void read()
    {
      System.out.println("hello");
    }
    void display()
    {
        System.out.println("this is abstract method ");
        super.display();
    }
    public static void main(String[] args){
        B obj=new B();
        obj.read();
        obj.display();
        System.out.println(a);
        D sc=new D(10,20);
        E dn=new F();
        dn.run();
        inter();

    }
}