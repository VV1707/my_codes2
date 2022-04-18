public class doublet{
    public static int isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static int isDoublet(char[] array){
        int d=0;
        for(int i=0;i<array.length-1;i++){
            if(isVowel(array[i])==1 && isVowel(array[i+1])==1)
            d++;
        }
        return d;
    }
    public static int isTriplet(char[] array){
        int t=0;
        for(int i=0;i<array.length-2;i++){
            if(isVowel(array[i])==1 && isVowel(array[i+1])==1 && isVowel(array[i+2])==1)
            t++;
        }
        return t;
    }
    public static void main(String args[]){
        String s="adaefaei";
        int n=s.length();
        char[] array=new char[n];
        for(int i=0;i<n;i++){
            array[i]=s.charAt(i);
        }
        int doubletCount=isDoublet(array);
        System.out.println(doubletCount);
        int tripletCount=isTriplet(array);
        System.out.println(tripletCount);
    }
        

    }