import java.util.*;

public class setman{
    public static void main(String[] args){
        Set<Integer> hash_set1= new HashSet<Integer>();
        //Declaring elements for first set
        hash_set1.add(17);
        hash_set1.add(13);
        hash_set1.add(21);
        hash_set1.add(30);
        hash_set1.add(42);
        hash_set1.add(56);
        System.out.println(hash_set1);
        
        Set<Integer> hash_set2= new HashSet<Integer>();
        //Declaring elements for the second set
        hash_set2.add(54);
        hash_set2.add(17);
        hash_set2.add(13);
        hash_set2.add(44);
        hash_set1.add(62);
        hash_set1.add(10);
        System.out.println(hash_set2);


        hash_set1.remove(42);//remove particular element
        System.out.println(hash_set1);//print entire set

        Set<Integer> union= new HashSet<Integer>(hash_set1); //union set declaration
        union.addAll(hash_set2); //hash_set1||hash_set2 elements
        System.out.println(union);

        Set<Integer> intersection= new HashSet<Integer>(hash_set1); //intersection set declaration
        intersection.retainAll(hash_set2); //hash_set1 && hash_set2 elements
        System.out.println(intersection);

        Set<Integer> difference= new HashSet<Integer>(hash_set1); //difference set declaration
        difference.removeAll(hash_set2); //hash_set1 - hash_set2 elements
        System.out.println(difference);
    }

}