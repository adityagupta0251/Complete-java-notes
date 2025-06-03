public class typecasting {
    public static void main(String[] args) {

        

        int maxScore = 500;
        int userScore = 411;
        double userscorePercentage = (double)userScore/(double)maxScore*100.0;
        System.out.println("User Score Percentage(before typecasting): " + userscorePercentage);
        // Now use of Type Casting for evaluating in lumb sumb or approx
        float approxortypecasting =  (float)userscorePercentage;
        System.out.println("after Type Casting: " + approxortypecasting);





    }
}
