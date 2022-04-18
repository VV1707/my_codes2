public class destructor{

    protected void finalize(){
        System.out.println("Object is destroyed");  //will be printed when the object is deallocated
    }
    public static void main(String [] args){

        destructor object1= new destructor(); //create new object

        System.out.println("Object is created");

        object1.finalize(); //deallocate using explicit finalize method invocation
        
        object1=null; //initialize again

        System.out.println("Object is created again");

        System.gc(); //deallocate using gc() method of jvm indicating full heap condition
    }
    
}