package practice10;

import java.util.HashSet;

public class Teacher extends Person{

    int id, age;
    String name;
    HashSet<Klass> classes;

    public Teacher(int number, String array, int num, HashSet<Klass> classes){
        super(number, array, num);
        id = super.id;
        age = super.age;
        name = super.name;
        this.classes = classes;
    }
    public Teacher(int number, String array, int num){
        super(number, array, num);
        id = super.id;
        age = super.age;
        name = super.name;
        this.classes = new HashSet<>();
    }

    HashSet getClasses(){
        return classes;
    }
    String introduce(){
        String result = super.introduce();
        int length = classes.size();

        if(length > 0){
            result += " I am a Teacher. I teach Class ";
            for(Klass klass:classes){
                result += String.valueOf(klass.getNumber());
                result += ", ";
            }
            result = result.substring(0,result.length() - 2);
            result += ".";
        }
        else {
            result += " I am a Teacher. I teach No Class.";
        }
        return  result;
    }
    boolean isTeaching(Student std){
        boolean judge = std.klass.isin(std, classes);
        return judge;
    }
    String introduceWith(Student std){
        String result = super.introduce();
        int sizeofclass = classes.size();

        for(int i = 0; i < sizeofclass; i++){
            if(std.klass == classes.toArray()[i]){
                result += " I am a Teacher. I teach ";
            }
        }
        if(result.equals(super.introduce())){
            result += " I am a Teacher. I don't teach ";
        }
        result += std.name;
        result += ".";
        return result;
    }

}
