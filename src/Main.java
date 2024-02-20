public class Main {
    public static void main(String[] args) {
        int clientScore = 52_000;
        int depositAmount = 1400;
        int bonusScore;


        if (depositAmount > 1000) {
            bonusScore = depositAmount / 100;
        }
        else {
            bonusScore = 0;
        }

        int clientTotalScore = clientScore + depositAmount + bonusScore;
        System.out.println(clientTotalScore);
    }
}
