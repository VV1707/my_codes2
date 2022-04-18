class GrandParent{
    public void display(){
        System.out.println("Family name : EFG");
    }
}
class Parent extends GrandParent{
    public void show(){
        System.out.println("Initial : A");
    }
}
class Child extends Parent{
    public void print(){
        System.out.println("Name : BCD");
    }
}

public class multipleinheritance{
    public static void main(String [] args){
        Child c=new Child();
        c.show();
        c.print();
        c.display();

    }
}