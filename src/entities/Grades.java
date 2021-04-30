package entities;

public class Grades {

    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;

    public double finalGrade() {
        return firstGrade + secondGrade + thirdGrade;
    }

    public double pointsMissing() {
        if(finalGrade() < 60) {
            return 60.00 - finalGrade();
        } else {
            return 0.00;
        }
    }
    public String toString() {
        return
                "FINAL GRADE= "
                        + String.format("%.2f",finalGrade());

    }
}
