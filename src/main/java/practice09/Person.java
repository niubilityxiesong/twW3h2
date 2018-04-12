package practice09;

public class Person {

    int id, age;
    String name = new String();

    public Person(int number, String array, int num){
       id = number;
       name = array;
       age = num;
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

    @Override
    public int hashCode(){
        int hash = 0;
        hash += id;
        return hash;
    }

    @Override
    public boolean equals(Object object){
        if(!(object instanceof Person)){
            return false;
        }
        Person other = (Person) object;
        if((this.id == 0 && other.id != 0) || (this.id!= 0 && this.id != other.id)){
            return false;
        }
        return true;
    }
}
