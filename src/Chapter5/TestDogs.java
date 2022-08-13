package Chapter5;

public class TestDogs {
    public static void main(String[] args) {
        DogTriathlonParticipant2 dog1 = new DogTriathlonParticipant2(
                "Daisy", 3,
                5, 75, 98
        );
        dog1.display();
        DogTriathlonParticipant2 dog2 = new DogTriathlonParticipant2(
                "Napkin", 3,
                70, 80, 85
        );

        dog1.display();
        dog2.display();
    }
}
