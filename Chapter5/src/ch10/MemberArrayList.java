package ch10;

import javax.sound.midi.MetaMessage;
import java.util.ArrayList;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList(){
        arrayList = new ArrayList<>();
    }

    public MemberArrayList(int size){
        arrayList = new ArrayList<>(size);
    }

    public void addMember(Member member){
        arrayList.add(member);
    }

    public boolean removeMember(int memberId){
        for(int i=0; i<arrayList.size(); i++){
            Member member = arrayList.get(i);

            int id = member.getMemberId();
            if(id == memberId){
                arrayList.remove(i);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        for(Member m : arrayList){
            System.out.println(m);
        }
    }
}
