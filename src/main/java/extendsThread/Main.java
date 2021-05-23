package extendsThread;

public class Main extends Thread{
    public static int amount=0;

    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        //wait for the thread to finish
        while(thread.isAlive()){
            System.out.println("\n Waiting...");
        }
        //update amount and print its value
        System.out.println("\n Main: "+amount);
        amount++;
        System.out.println("\n Main: "+amount);
    }
    public void run(){
        amount++;
    }
}
