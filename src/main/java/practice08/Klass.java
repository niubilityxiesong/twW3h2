package practice08;

public class Klass {

    int klassnum;
    boolean leader;

    public Klass(int num){
        klassnum = num;
        leader = false;
    }

    int getNumber(){
        return klassnum;
    }
    String getDisplayName(){
        String result = "Class ";

        result += String.valueOf(klassnum);
        return result;
    }
    void assignLeader(Student std){
        std.klass.leader = true;
    }
    Student getLeader(Student std){
        if(std.klass.leader)
            return std;
        else
            return null;
    }
}
