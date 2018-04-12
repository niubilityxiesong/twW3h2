package practice06;

public class Person {

    int age;
    String name = new String();

    public Person(String array, int num){
        age = num;
        name = array;
    }
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
    String introduce(){
        String result = "My name is ";

        result += name;
        result += ". I am ";
        result += String.valueOf(age);
        result += " years old.";
        return result;
    }
}
