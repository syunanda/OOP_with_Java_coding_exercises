package Ch5_MakingDecisions;

public class DogTriathlonParticipant2
{
    private final int NUM_EVENTS;
    private static int totalCumulativeScore = 0;

    private String name;
    private int obedienceScore;
    private int conformationScore;
    private int agilityScore;
    private int total;
    private double average;
    private boolean doScoresAgree;

    public DogTriathlonParticipant2(String name,
                                    int numEvents,
                                    int score1,
                                    int score2,
                                    int score3)
    {
        this.name = name;
        NUM_EVENTS = numEvents;



        int totalNot0 = 0;
        if(score1 != 0)
            totalNot0 = totalNot0 + 1;
        if(score2 != 0)
            totalNot0 = totalNot0 + 1;
        if(score3 !=0)
            totalNot0 = totalNot0 +1;
        if(NUM_EVENTS == totalNot0)
            doScoresAgree = true;
        else
            doScoresAgree = false;

        if (doScoresAgree) {
            obedienceScore = score1;
            conformationScore = score2;
            agilityScore = score3;
        }
        else {
            obedienceScore = 0;
            conformationScore = 0;
            agilityScore = 0;
        }

        total = obedienceScore + conformationScore + agilityScore;

        if (NUM_EVENTS == 0) {
            average = 0;
        }
        else {
            average = (double) total / NUM_EVENTS;
        }

        totalCumulativeScore = totalCumulativeScore + total;

    }

    public void display()
    {
        if(doScoresAgree) {
            System.out.println(name + " participated in " + NUM_EVENTS +
                    " events and has an average score of " + average);
            System.out.println(" " + name +
                " has a total score of " + total +
                " bringing the total cumulative score to " +
                totalCumulativeScore);
        }
        else {
            System.out.println("Notice! Number of events for " + name +
                    "does not agree with scores reported");
        }
    }
}
