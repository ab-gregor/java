public class AdvancedClac extends BasicCalc{

@Override
public int add(int a, int b) {
    System.out.println("Overridden");
    return super.add(a, b);
}
@Override
public int subtract(int a, int b) {
    System.out.println("Overridden");
    return super.subtract(a, b);
}
@Override
public int multiply(int a, int b) {
    System.out.println("Overridden");
    return super.multiply(a, b);
}
@Override
public int divide(int a, int b) {
    System.out.println("Overridden");
    return super.divide(a, b);
}
public static void main(String[] args) {
    AdvancedClac adv=new AdvancedClac();
    System.out.println(adv.add(1,2));
    System.out.println(adv.divide(8, 2));
}

}