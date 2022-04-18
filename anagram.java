public class anagram{  
    static void isAnagram(String n, String m) {  
        String n = n.replaceAll("\\s", "");  
        String m = m.replaceAll("\\s", "");  
        boolean d=true;  
        if (n.length()!=m.length()) {  //different lengths then not anagram
             d=false;  
        } 
        else{  
            char[] a1 = n.toLowerCase().toCharArray();  
            Arrays.sort(a1);
            char[] a2 = m.toLowerCase().toCharArray();  
            Arrays.sort(a2);
            d= Arrays.equals(a1, a2);  
        }  
        if(d) {  
            System.out.println("anagrams");  
        } 
        else{  
            System.out.println("not anagrams");  
        }  
    }  
   
    public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        String m=sc.next();
        isAnagram(n,m);    
    }  
}  