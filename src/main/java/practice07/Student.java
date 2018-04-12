package practice07;

public class Student extends Person{

    int age;
    String name = new String();
    Klass klass;

    public Student(String array, int num, Klass number){
        super(array, num);
        age = super.getAge();
        name = super.getName();
        klass = number;
    }

    Klass getKlass(){
        return klass;
    }
    String introduce(){
        String result = super.introduce();

        result += " I am a Student. I am at ";
        result += klass.getDisplayName();
        result += ".";
        return result;
    }
}
