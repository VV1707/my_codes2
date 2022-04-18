public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        char[] c=new char[S.length()];
        for(int i=0;i<S.length();i++){
            c[i]=S.charAt(i);
        }
        for(int i=start;i<end;i++){
            System.out.print(c[i]);
        }
    }
}