class test{

    private int count=0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static int count2=1;
    
}
public class staticDemo {
    public static void main(String[] args){
        test t1=new test();
        System.out.println(t1.getCount());
        t1.setCount(t1.getCount()+1);
        System.out.println(t1.getCount());
        test.count2++;
        System.out.println(test.count2);
    }
}
