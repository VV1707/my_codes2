class data{ 
    //private modifier
    private void show(){ 
           System.out.println("Private Scope"); 
       } 
} 
 
public class priv{ 
    public static void main(String args[]){   
          data o = new data(); 
          //access privatemethod
          o.show();
       } 
}