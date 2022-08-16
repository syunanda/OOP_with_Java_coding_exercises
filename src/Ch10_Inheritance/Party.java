package Ch10_Inheritance;

public class Party {
    private int guest;
    public void setGuest(int numOfGuest){
        guest = numOfGuest;
    }
    public int getGuest(){
        return guest;
    }
    public void displayInvitation(){
        System.out.println("Please come to my party!");
    }
}
