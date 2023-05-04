package threadpack;

public class RunnableInterface {
    public static void main(String[] args) {
        
    
    ChildThrea c1=new ChildThrea();
    ChildThrea2 c2 = new ChildThrea2();
    Thread t1=new Thread(c1);
    Thread t2 =  new Thread(c2);
    t1.start();
    t2.start();
    }
}
class ChildThrea implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Sagar"+i);
        }
    }
}

class ChildThrea2 implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Thoma "+i);
        }
    }
}

