enum alpha {
    a,
    e,
    i,
    o,
    u
}
public class enumIteration{
    public static void main(String [] args){
        for(alpha e: alpha.values()){
            System.out.print(e+" ");
        }
    }
}