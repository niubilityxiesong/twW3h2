package practice06;

public class Teacher extends Person{

    int age, klass;
    String name;

    public Teacher(String array, int num, int number){
        super(array, num);
        age = super.getAge();
        name = super.getName();
        klass = number;
    }
    public Teacher(String array, int num){
        super(array, num);
        age = super.getAge();
        name = super.getName();
        klass = -1;
    }

    int getKlass(){
        return klass;
    }
    String introduce(){
        String result = super.introduce();
        if(klass > 0){
            result += " I am a Teacher. I teach Class ";
            result += String.valueOf(klass);
            result += ".";
        }
        else {
            result += " I am a Teacher. I teach No Class.";
        }
        return result;
    }
}
