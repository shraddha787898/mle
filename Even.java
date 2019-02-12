class Even extends Thread 
{ 
  Thread t;
  Even()
  {
    t=new Thread();
  }
  public void run()
 { 
  try 
     { 
       for(int i=0;i<=5;i=i+2);
        System.out.println("Even no"+i);
        t.sleep(5000);
     }
   catch(InterruptedExceptions e)
    { 
       System.out.println("exception"+e);
    }
   }
}
 class Multi
{
  public static void main(string a[])
  { 
    Even E=new Even();
    E.start();
   }
}