package practice10;

import java.util.HashSet;

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
        stdin = std;
        if(std.klass.klassnum != klassnum){
            System.out.print("It is not one of us.\n");
            return;
        }
        std.klass.leader = true;
    }
    Student getLeader(){
        if(leader){
            return stdin;
        }
        else
            return null;
    }
    void appendMember(Student std){
        std.klass.klassnum = klassnum;
    }
    boolean isin(Student std, HashSet<Klass> buff){
        boolean judge;
        int sizebuff = buff.size();

        if(sizebuff == 0)
            judge = false;
        else {
            for(int i = 0; i < sizebuff; i++){
                if(std.klass == buff.toArray()[i]){
                    judge = true;
                    return judge;
                }
            }
        }
        return false;
    }
}
