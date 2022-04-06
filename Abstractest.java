public class Abstractest{
    public static void main(String[] args){
        person obj = new student();
        obj.name="moulali";
        obj.interest="Cricket";
        obj.mobile_no=1234567890;

        stringDisplay(obj);
        obj.cooking();
        obj.walk();
        obj.eat();
    }
    public static void stringDisplay(person person){
        System.out.println("my name is :"+ person.name);
        System.out.println(person.name+" I'm interested to paly "+person.interest);
        System.out.println("My mobile numbr is :"+person.mobile_no);
    }

}

//class Abstractest {
//    public static void main(String[] args){
//        person obj =new student();
//        obj.first();
//        obj.second();
//        obj.third();
//        person.thank();
//    }
//}

//class Abstractest extends student {
//    public void third(){
//        System.out.println("this is the last abstract method");
//    }
//    public static void main(String[] args){
//        Abstractest obj =new Abstractest();
//        obj.first();
//        obj.second();
//        obj.third();
//        person.thank();
//    }
//}