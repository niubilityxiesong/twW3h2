package practice10;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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
        List<Klass> numbe1 = classes.stream().sorted((x, y) -> x.klassnum - y.klassnum).collect(Collectors.toList());

        if(length > 0){
            result += " I am a Teacher. I teach Class ";
            for(int i = 0; i < length; i++){
                result += String.valueOf(numbe1.get(i).klassnum);
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
