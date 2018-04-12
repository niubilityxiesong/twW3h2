package practice09;

public class Teacher extends Person{

    int age, id;
    Klass klass;
    String name;

    public Teacher(int number, String array, int num, Klass klass){
        super(number, array, num);
        age = super.age;
        name = super.name;
        this.klass = klass;
        id = super.id;
    }
    public Teacher(int number, String array, int num){
        super(number, array, num);
        age = super.age;
        name = super.name;
        this.klass = new Klass(-1);
        id = super.id;
    }

    Klass getKlass(){
        return klass;
    }
    String introduce(){
        String result = super.introduce();

        if(klass.klassnum > 0){
            result += " I am a Teacher. I teach Class ";
            result += String.valueOf(klass.klassnum);
            result += ".";
        }
        else {
            result += " I am a Teacher. I teach No Class.";
        }
        return result;
    }
    String introduceWith(Student std){
        String result = super.introduce();

        if(klass.klassnum == std.klass.klassnum){
            result += " I am a Teacher. I teach ";
        }
        else {
            result += " I am a Teacher. I don't teach ";
        }
        result += std.name;
        result += ".";
        return result;
    }
}
