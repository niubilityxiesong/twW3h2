package practice01;

public class Person {
    int age;
    String name = new String();

    public Person(String array, int num){
        age = num;
        name = array;
    }

    int getAge(){
        if(age > 0)
            return age;
        else
            return -1;
    }

    String getName(){
        if(name.length() > 0)
            return name;
        else
            return null;
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
