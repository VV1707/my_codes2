import java.util.*;

public class setop{
    public static void main(String[] args){
        Set<Integer> hash_set= new HashSet<Integer>();
        hash_set.add(17);
        hash_set.add(13);
        hash_set.add(21);
        System.out.println(hash_set);//print entire set
        for(Integer x:hash_set){
            System.out.print(x+" ");//print elements of the set
        }
    }

}