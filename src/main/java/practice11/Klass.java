package practice11;

import javafx.scene.media.SubtitleTrack;

import java.util.HashSet;

public class Klass{

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
    boolean assignLeader(Student std){
        stdin = std;
        if(std.klass.klassnum != klassnum){
            System.out.print("It is not one of us.\n");
            return false;
        }
        std.klass.leader = true;
        HashSet<Klass> temp = new HashSet<>();
        Teacher teacher = new Teacher(1,"Tom",1,temp);
        teacher.Welcomleader(std);
        return true;
    }
    Student getLeader(){
        if(leader)
            return stdin;
        else
            return null;
    }
    boolean appendMember(Student std){
        std.klass.klassnum = klassnum;
        HashSet<Klass> temp = new HashSet<>();
        Teacher teacher = new Teacher(1,"Tom",1,temp);
        teacher.Welcomstd(std);
        return true;
    }
    boolean isin(Student std, HashSet<Klass> buff){
        if(buff.size() == 0)
            return false;
        for(int i = 0; i < buff.size(); i++){
            if(std.klass == buff.toArray()[i]){
                return true;
            }
        }
        return false;
    }
}
