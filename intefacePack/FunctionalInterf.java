package intefacePack;

@FunctionalInterface
interface I1{
    public int show(int i,int j);
}
public class FunctionalInterf{
    public static void main(String[] args) {
        I1 i1=(int i,int j) -> i+j;
        System.out.println(i1.show(1, 7));

        I1 i2=new I1() {
            public int show(int i,int j){
                return i+j;
            }
        };
        System.out.println(i2.show(3, 8));
        
    }
}