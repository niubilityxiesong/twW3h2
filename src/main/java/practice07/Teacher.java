package practice07;

public class Teacher extends Person{

    int age;
    String name = new String();
    Klass klass;

    public Teacher(String array, int num, Klass number){
        super(array, num);
        age = super.getAge();
        name = super.getName();
        klass = number;
    }
    public Teacher(String array, int num){
        super(array, num);
        age = super.getAge();
        name = super.getName();
        klass = new Klass(-1);
    }

    Klass getKlass(){
        return klass;
    }
    String introduce(){
        String result = super.introduce();
        if(klass.klass > 0){
            result += " I am a Teacher. I teach Class ";
            result += klass.getNumber();
            result += ".";
        }
        else {
            result += " I am a Teacher. I teach No Class.";
        }
        return result;
    }
    String introduceWith(Student std){
        String result = super.introduce();

        if(std.klass.klass == this.klass.klass){
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
