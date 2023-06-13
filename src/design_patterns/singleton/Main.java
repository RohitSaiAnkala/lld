package design_patterns.singleton;

public class Main {
    public static void main(String[] args) {
//        DBConnection connection1 = DBConnection.getInstance();
//        DBConnection connection2 = DBConnection.getInstance();
       Thread t1 = new Thread(()->{
            DBConnection.getInstance();
        });
        Thread t2 = new Thread(()->{
            DBConnection.getInstance();
        });
      t1.start();
      t2.start();
     /*in the above case of multi-threading 2 objects will be created, but we want singleton object
     */


    }
}
