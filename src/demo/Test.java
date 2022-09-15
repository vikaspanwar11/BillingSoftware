/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

public class Test
{
    public static void main(String[] args)
    {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("task");
            }
        }).start();
    }
}


//------------------------------------------------------

//public class Test implements Runnable
//{
//    public void run()
//    {
//        System.out.println("task");
//    }
//    public static void main(String[] args)
//    {
//        Test t=new Test();
//        Thread thread=new Thread(t);
//        thread.start();
//    }
//}


//----------------------------------------------------


//public class Test extends Thread
//{
//    public void run()
//    {
//        System.out.println("task");
//    }
//    public static void main(String[] args)
//    {
//        Test t=new Test();
//        t.start();
//    }
//}
