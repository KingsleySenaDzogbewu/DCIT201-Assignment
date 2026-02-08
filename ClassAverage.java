public class ClassAverage {
    public double calculateClassAverage(double score1, double score2){
        return (score1 + score2)/2;
    }

    public double calculateClassAverage(double score1, double score2, double score3){
        return (score1 + score2 + score3)/3;
    }

    public double calculateClassAverage(double [] scores){
        double total = 0;
        for(double s : scores){
            total += s;
        }

        return total / scores.length;
    }
}
