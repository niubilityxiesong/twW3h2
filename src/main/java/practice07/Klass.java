package practice07;

public class Klass {

    int klass;

    public Klass(int num){
        klass = num;
    }

    int getNumber(){
        return klass;
    }
    String getDisplayName(){
        String result = new String();

        result += "Class ";
        result += String.valueOf(klass);
        return result;
    }
}
