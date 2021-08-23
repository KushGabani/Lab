class mul extends Thread
{
     Thread t;
     mul(String s)
     {
           t=new Thread(this,s);
           System.out.println("Thread name is"+t);
           t.start();
     }
     public void run()
     {    
     try
     {
       for(int i=1;i<=10;i++)
       {
          System.out.println(i);
          t.sleep(2000);
        }
      }
      catch(InterruptedException e)
      {}
     }     
}

class threadDemo12
{
    public static void main(String args[])
    {
             new mul("one");
             new mul("two");
             new mul("three");
      }
}