package practice08;

public class Klass {

    int klassnum;
    boolean leader;
    Student stdin;

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
        stdin = std;
        std.klass.leader = true;
    }
    Student getLeader(){
        if(leader)
            return stdin;
        else
            return null;
    }
}
