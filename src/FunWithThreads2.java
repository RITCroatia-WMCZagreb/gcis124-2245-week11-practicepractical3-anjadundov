public class FunWithThreads2 {


    //Constructor of FunWithThreads
    public FunWithThreads2(){
        System.out.println("MAIN START");

        Thread t1= new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread start: Thread 1");
                for (int i=0; i<10; i++){

                    if (i==5) continue;

                    System.out.println("Thread 1 " + i);

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Thread end:Thread 1");
            }
        });
        t1.start();
        
        try {
            Thread.sleep(2100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread t2= new Thread(new Runnable(){
            public void run() {
                System.out.println("Thread start: Thread 2");
                for (int i=0; i<10; i++){
                    System.out.println("Thread 2 " + i);

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Thread end:Thread 2");
            }
        });
        t2.start();

        System.out.println("MAIN END");
    }

    public static void main(String[] args) throws Exception {
        
        new FunWithThreads2();

    }


}

/*
 * 
 * 
 * Main Thread START
Thread start:Thread 1
Thread 1 0
Thread 1 1
Thread 1 2
Thread 1 3
Thread start:Thread 2
Thread 1 4
Thread 2 0
Thread 1 5
Thread 2 1
Thread 2 2
Thread 1 7
Thread 2 3
Thread 1 8
Thread 2 4
Thread 1 9
Thread end:Thread 1
Main Thread END
Thread 2 5
Thread 2 6
Thread 2 7
Thread 2 8
Thread 2 9
Thread end:Thread 2
 */