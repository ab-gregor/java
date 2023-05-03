package abstractpack;
abstract class Vehicle{
    abstract public void colour();

    public void ACon(){
        System.out.println("AC is switched on");
    }

}

class ford extends Vehicle{
    public void colour(){
        System.out.println("RED");

    }
}
class suzuki extends Vehicle{
    public void colour(){
        System.out.println("Green");
    }
}    

public class AbstractTest{
    public static void main(String[] args) {
        ford f=new ford();
        f.colour();
        Vehicle v1 =new suzuki();
        v1.colour();
        };
    }
