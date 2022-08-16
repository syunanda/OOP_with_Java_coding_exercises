package Ch10_Inheritance;

public class DinnerParty extends Party{
    private int dinnerChoice;
    public void setDinnerChoice(int dinnerChoice){
        this.dinnerChoice = dinnerChoice;
    }
    public int getDinnerChoice(){
        return this.dinnerChoice;
    }
    @Override
    public void displayInvitation() {
        System.out.println("Please come to my dinner party!");
    }
}
