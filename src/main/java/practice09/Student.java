package practice09;

public class Student extends Person{

    int id, age;
    String name = new String();
    Klass klass;

    public Student(int number, String array, int num, Klass klass){
        super(number, array, num);
        id = super.id;
        age = super.getAge();
        name = super.getName();
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
        result += klass.klassnum;
        result += ".";
        return result;
    }

}
