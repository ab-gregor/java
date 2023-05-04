package threadpack;
public class ThreadClass{

    public static void main(String[] args) {
        ChildThread c1=new ChildThread();
        ChildThread2 c2 = new ChildThread2();
        c1.start();
        c2.start();
        
        
        
    }
}
class ChildThread extends Thread{
    public void run(){

    for(int i=0;i<=5;i++){
        System.out.println("sagar"+i);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            
        }
    }
    
}}
class ChildThread2 extends Thread{
    public void run(){
    for(int i=0;i<=5;i++){
        System.out.println("thoma"+i);
    
    try {
        Thread.sleep(500);
    } catch (Exception e) {
        // TODO: handle exception
    }
}
}

}