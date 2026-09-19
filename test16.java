class animal{
        public void eat()
        {
             System.out.println("animal eats");
        }
        public void sleep()
        {
             System.out.println("animal sleeps");
        }
}
class bird extends animal 
{
    @Override
    public void eat()
    {
       System.out.println("bird eats");
    }
    @Override
    public void sleep()
    {
       System.out.println("bird sleeps");
    }
    public void fly()
    {
       System.out.println("bird can only fly");
    }
}
class test16
{
     public static void main(String a[])
     {
      animal ob = new animal();
      ob.eat();
      ob.sleep();
      
      bird ob1 = new bird();
     ob1.eat();
     ob1.sleep();
     ob1.fly();
     }
}