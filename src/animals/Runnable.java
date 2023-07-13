package animals;

public interface Runnable {

    default void run(){
        System.out.println("it's running");
    }
}
