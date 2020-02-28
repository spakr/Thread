
public class Main {
    public static void  main(String[] args)  {
        Thread t1 = new Thread(new Thrad("T1", 2));
        Thread t2 = new Thread(new Thrad("T2", 1));
        Thread t3 = new Thread(new Thrad("T3", 3));

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

    }
}
