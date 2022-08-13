package Ch8_Arrays;

public class BowlingTeam {
    private String teamName;
    private String[] members = new String[4];


    public void setTeamName(String team){
        teamName = team;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setMember(int number, String member) {
        members[number] = member;
    }
    public String getMember(int number) {
        return members[number];
    }
}
