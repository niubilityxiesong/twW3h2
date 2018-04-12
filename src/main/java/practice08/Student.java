package practice08;

public class Student extends Person{

    int age, id;
    String name;
    Klass klass;

    public Student(int number, String array, int num, Klass klass){
        super(number, array, num);
        age = super.getAge();
        name = super.getName();
        id = super.id;
        this.klass = klass;
    }

    Klass getKlass(){
        return klass;
    }
    String introduce(){
        String result = super.introduce();

        if(klass.leader){
            result += " I am a Student. I am Leader of Class ";
        }
        else {
            result += " I am a Student. I am at Class ";
        }
        result += String.valueOf(klass.klassnum);
        result += ".";
        return result;
    }
}
