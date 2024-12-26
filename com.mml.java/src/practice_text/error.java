package practice_text;
 class  Person{
    String name;
    int age;

    public  Person(){
        System.out.println("line 9：" +this);
        this.name = "狗蛋";
    }

    public void eat(){
        this.test();
    }
    public void test(){
        System.out.println("嘻嘻");
    }
}
public class error{
    public static void main(String[] args){
        Person person1 = new Person();
        System.out.println(person1);
        System.out.println(person1.name);
        person1.eat();

        Person person2 = new Person();
        System.out.println(person2);
        System.out.println(person2.name);
    }
}