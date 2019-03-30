package Assignment_3;

public class Method {
    int num=0;
    
    synchronized  public void operation(int num, String ThreadName) {
        if (ThreadName.equalsIgnoreCase("One")) {
            this.num += num;
        } else {
            this.num -= num;
        }
    }
    
}
