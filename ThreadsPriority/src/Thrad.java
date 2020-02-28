public class Thrad implements Runnable {
    private String name;
    private int priority;

    Thrad(String nameta , int priority){
        this.name=nameta;
        this.priority = priority;
    }




    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println(name+ "=" + i);
            try {
                Thread.sleep(1000 * priority);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }


    }
}
