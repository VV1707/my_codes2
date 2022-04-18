public class except1{
    public static void main(String args[]){
        int arr[] = new int[4];
        try{
            arr[4]=9;
            System.out.println(arr[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array index is wrong");
        }
        String s="abc";
        try{
            char c=s.charAt(3);
            System.out.println("char at 3rd position is"+c);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("String index is wrong");
        }

    }
}