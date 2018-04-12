package practice09;

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
        String result = new String();

        result += "Class ";
        result += String.valueOf(klassnum);
        return result;
    }
    void assignLeader(Student std){
        if(std.klass.klassnum != klassnum){
            System.out.print("It is not one of us.\n");
            return;
        }
        std.klass.leader = true;
    }
    Student getLeader(Student std){
        if(std.klass.leader){
            return std;
        }
        else
            return null;
    }
    void appendMember(Student std){
        std.klass.klassnum = klassnum;
    }

}
