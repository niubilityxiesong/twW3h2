package practice03;

public class Worker extends Person{
    int age;
    String name = new String();

    public Worker(String array, int num){
        super(array,num);
        age = super.age;
        name = super.name;
        super.getAge();
        super.getName();
    }

    String introduce(){
        String result = "I am a Worker. I have a job.";
        return result;
    }
}
