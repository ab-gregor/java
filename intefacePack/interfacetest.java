package intefacePack;

interface Computer{
    public void graphicsCard();
    public void CPU();
    public void display();

}

class asusVivobook implements Computer{

    public void graphicsCard(){
            System.out.println("gtx 1050ti");
    }
    @Override
    public void CPU() {
        System.out.println("i5 10th gen");
    }
    @Override
    public void display() {
        System.out.println("srgb");
        
    }
}

public class interfacetest{
public static void main(String[] args) {
    

    asusVivobook as=new asusVivobook();
    as.graphicsCard();
    as.CPU();
}
}