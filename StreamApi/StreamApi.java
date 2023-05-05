package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;;
public class StreamApi {
    public static void main(String[] args) {
        List<Integer> lis=new ArrayList<>(); 
        lis.add(10);
        lis.add(30);
        lis.add(12);
        lis.add(78);
        lis.add(34);


       Stream<Integer> str=lis.stream();
       
       int res=str.filter(k->k%2==0).map(k->k/2).reduce(1,(p,q)->(p*q));
       System.out.println(res);
    }
}
