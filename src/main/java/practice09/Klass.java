package practice09;

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
    Student getLeader(){
        if(this.leader){
            return stdin;
        }
        else
            return null;
    }
    void appendMember(Student std){
        stdin = std;
        std.klass.klassnum = klassnum;
    }

}
