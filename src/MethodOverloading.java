public class MethodOverloading {

    public static void main(String args[]){
        int newScore = calculateScore("Jigna",500);
        System.out.println("New score is: "+newScore);
        calculateScore(85);
        calculateScore();
    }

    public static int calculateScore(String playerName,int score){
        System.out.println("Player "+playerName+" scored "+ score +" points");
        return score * 1000;
    }
    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored "+ score +" points");
        return score * 1000;
    }
    public static int calculateScore(){
        System.out.println("No Player name,No Score");
        return 0;
    }
}
