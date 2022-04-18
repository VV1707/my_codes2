public class s3{
	public static void main (String[] args) {
        try{
                try{
                    int[] array={1,2,3};
                    System.out.println(array[4]);
                }
   catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("ArrayIndexOutOfBoundsException is generated");
                }
              System.out.println(4/0);
        }
       catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException is generated");
        }
	}
    }