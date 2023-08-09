package ch13;

import java.util.Comparator;

class Mycompare implements Comparator<String>{
    @Override
    public int compare(String s1, String s2){
        return s1.compareTo(s2);
    }
}
public class MemberTreeSetTest {
    public static void main(String[] args) {

        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberKim = new Member(1003, "김유신");
        Member memberLee = new Member(1001, "이순신");
        Member memberKang = new Member(1002, "강감찬");
        Member memberHong = new Member(1004, "홍길동");

        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKang);
        memberTreeSet.addMember(memberHong);
        memberTreeSet.showAllMember();

    }

}
