package abstractpack;
abstract class vehicle{
    abstract public void colour();

    public void ACon(){
        System.out.println("AC is switched on");
    }

}

class ford extends vehicle{
    public void colour(){
        System.out.println("RED");

    }
}
class suzuki extends vehicle{
    public void colour(){
        System.out.println("Green");
    }
}    

public class AbstractTest{
    public static void main(String[] args) {
        ford f=new ford();
        f.colour();
        vehicle v1 =new suzuki();
        v1.colour();
        };
    }
