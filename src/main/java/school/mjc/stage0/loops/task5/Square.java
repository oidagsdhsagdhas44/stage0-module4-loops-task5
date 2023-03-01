package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        for(int i=0;i<sideLength;i++){
            if(i==0 || i==sideLength-1) System.out.println("8".repeat(sideLength));
            else{
                System.out.println("8"+" ".repeat(sideLength-2)+"8");
            }
        }
    }
}
