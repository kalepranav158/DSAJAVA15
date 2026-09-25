package interfaces;

class car implements brake,engine,media {

    @Override
    public void start(){
        System.out.println("I start like a normal car");
    }

    @Override
    public  void stop(){
        System.out.println("I stop like a normal car");
    }
}

public class Main {
    public static void main(String[] args) {
        car c = new car();
        c.start();
         c.stop();

         media c2  = new car();
         c2.start();;

    }
}
