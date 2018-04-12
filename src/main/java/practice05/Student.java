package practice05;

public class Student extends Person{
    int klass;

    public Student(String array, int num, int number){
        super(array, num);
        klass = number;
    }

    int getKlass(){
        return klass;
    }
    String introduce(){
        String result = super.introduce();

        result += " I am a Student. I am at Class ";
        result += String.valueOf(klass);
        result += ".";
        return result;
    }
}
