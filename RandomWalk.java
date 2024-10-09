import java.util.*;

public class RandomWalk{
    public static void main(String[]args){
        double pos = 3;
        int trials = 50;
        int steps = 0;
        int gstep = 0;
        for (int i = 0; i<=50; i++){
            int nstep = 0;
            while( pos>=0 || pos<7){
                int step = (int)(Math.random()*1);
                if (step == 1){
                    pos = pos -1;
                }
                else{
                    pos = pos +1;
                }
                nstep ++;             
            }
            steps += nstep;
            if (nstep>gstep){
                gstep = steps;
            }

        }
        double ave = (double)steps/trials;
        System.out.println("The average number of steps is "+ave);
        System.out.println("The greatest number of steps was "+gstep);
    }
}