package practice10;

public class Student extends Person{

    int id, age;
    String name;
    Klass klass;

    public Student(int number, String array, int num, Klass klass){
        super(num, array, num);
        id = super.id;
        age = super.age;
        name = super.name;
        this.klass = klass;
    }
    public Student(int number, String array, int num){
        super(num, array, num);
        id = super.id;
        age = super.age;
        name = super.name;
        this.klass = new Klass(-1);
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
