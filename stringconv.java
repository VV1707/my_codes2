public class stringconv{
    public static void main(String [] args){
        String str ="1256";
        try{
            Integer number = Integer.valueOf(str);
            System.out.println(number);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }

    }
}