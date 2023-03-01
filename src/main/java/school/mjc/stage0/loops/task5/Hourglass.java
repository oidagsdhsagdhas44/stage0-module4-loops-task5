package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int repeatWhiteSpace = 0;
        for(int i=height;i>=1;i-=2){
            System.out.println(" ".repeat(repeatWhiteSpace)+"8".repeat(i)+" ".repeat(repeatWhiteSpace));
            repeatWhiteSpace++;
        }
        repeatWhiteSpace-=2;
        for(int i=height%2==0?4:3;i<=height;i+=2){
            System.out.println(" ".repeat(repeatWhiteSpace)+"8".repeat(i)+" ".repeat(repeatWhiteSpace));
            repeatWhiteSpace--;
        }
    }
}
