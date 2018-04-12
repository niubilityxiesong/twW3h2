package practice11;

import java.util.HashSet;

public class Teacher extends Person{

    int age, id;
    String name;
    HashSet<Klass> classes;

    public Teacher(int number, String array, int num, HashSet<Klass> classes){
        super(number, array, num);
        age = super.age;
        id = super.id;
        name = super.name;
        this.classes = classes;
    }
    public Teacher(int number, String array, int num){
        super(number, array, num);
        age = super.age;
        id = super.id;
        name = super.name;
        this.classes = new HashSet<>();
    }

    HashSet<Klass> getClasses(){
        return classes;
    }
    String introduce(){
        String result = super.introduce();

        if(classes.size() == 0){
            result += " I am a Teacher. I teach No Class.";
        }
        else{
            result += " I am a Teacher. I teach Class ";
            for(Klass klass:classes){
                result += String.valueOf(klass.klassnum);
                result += ", ";
            }
            result = result.substring(0,result.length() - 2);
            result += ".";
        }
        return  result;
    }
    boolean isTeaching(Student std){
        boolean judge = std.klass.isin(std, classes);
        return judge;
    }
    String introduceWith(Student std){
        String result = super.introduce();
        int sizebuff = classes.size();

        for(int i = 0; i < sizebuff; i++){
            if(std.klass == classes.toArray()[i]){
                result += " I am a Teacher. I teach ";
                break;
            }
        }
        if(result.equals(super.introduce())){
            result += " I am a Teacher. I don't teach ";
        }
        result += std.name;
        result += ".";
        return result;
    }
    void Welcomstd(Student std){
        String result = new String();

        result += "I am ";
        result += name;
        result += ". I know ";
        result += std.name;
        result += " has joined Class ";
        result += String.valueOf(std.klass.klassnum);
        result += ".";
        System.out.println(result);
    }
    void Welcomleader(Student std){
        String result = new String();

        result += "I am ";
        result += name;
        result += ". I know ";
        result += std.name;
        result += " become Leader of Class ";
        result += String.valueOf(std.klass.klassnum);
        result += ".";
        System.out.println(result);
    }
}
