package practice_text;
 abstract class Animal{
    int x = 0;
    public void print(){
        System.out.println("111");
    }
}
class Cat extends Animal {
    public Cat() {
        super();  
        this.x = 2;  
    }

    @Override
    public void print() {
        System.out.println("Meow");  
    }

    public void Simple(){
        System.out.println("123");
    }
}
public class Extends {
    public static void main (String[] args){
        Cat cat1 = new Cat();
        cat1.print();
        cat1.Simple();
        System.out.println(cat1.x);
        
    }
}
