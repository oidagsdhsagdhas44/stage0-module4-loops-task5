package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for(int i=0;i<height;i++){
            if(i==0 || i==height-1) System.out.println("8".repeat(length));
            else{
                System.out.println("8"+" ".repeat(length-2)+"8");
            }
        }
    }
    
}
