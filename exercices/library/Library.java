package library;

public class Library {
    public static void main(String[] args) {
        Member memberOne = Database.members.get(0);

        memberOne.showInfos();

    }
}
