package Assignment_3;

public class Synchronized {
    public static void main(String[] args) throws InterruptedException {
        SubThread obj1 = new SubThread();
        Method a = new Method();
        obj1.setname("one", a);
        SubThread obj2 = new SubThread();
        obj2.setname("two", a);

        obj1.start();
        obj2.start();
        obj1.join();
        obj2.join();

        System.out.println(a.num);
    }
    
}
