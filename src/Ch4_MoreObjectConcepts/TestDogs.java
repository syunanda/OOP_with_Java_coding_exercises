package Ch4_MoreObjectConcepts;

public class TestDogs {
    public static void main(String[] args) {
        DogTriathlonParticipant dog1 = new DogTriathlonParticipant(
                "Oreo", 2, 85,
                89, 0);
        dog1.display();

        DogTriathlonParticipant dog2 = new DogTriathlonParticipant(
                "Mochi", 3,
                70, 91, 85);
        dog2.display();
    }
}
