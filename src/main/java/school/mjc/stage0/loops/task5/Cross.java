package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for(int i=0;i<sideLength;i++){
            if(i==sideLength/2) System.out.println("8".repeat(sideLength));
            else{
                System.out.println(" ".repeat(sideLength/2)+"8"+" ".repeat(sideLength/2));
            }
        }
    }
}
