package utilities;

public class Flow {
    //create a static method wait that acccepts integer millisecond
    // the method simply uses Thread sleep with exception handled
    //Flow.wait(500);


    public static void wait (int milliseconds){
        try{
            Thread.sleep(milliseconds);
        }catch(InterruptedException e){
            System.out.println("Interruption happened");
        }

    }
}
