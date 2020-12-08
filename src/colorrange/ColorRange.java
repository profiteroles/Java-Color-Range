
package colorrange;

import java.util.Scanner;

public class ColorRange {

    
    public static void main(String[] args) {
        double waveLength;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type your the number");
        waveLength = sc.nextDouble();
        
        
        if (waveLength >= 380.0 && waveLength <= 450.0){
            System.out.println("The Colour Code : ");
            System.out.println("#" + waveLength);
            System.out.println("The Colour is Viloet");
        }
        else if (waveLength > 450 && waveLength <= 495){
            System.out.println("The Colour Code : ");
            System.out.println("#" + waveLength);
            System.out.println("The Colour is Blue");
        }
        else if (waveLength > 495 && waveLength <= 570){
            System.out.println("The Colour Code : ");
            System.out.println("#" + waveLength);
            System.out.println("The Colour is Green");
        }
        else if (waveLength > 570 && waveLength <= 590){
            System.out.println("The Colour Code : ");
            System.out.println("#" + waveLength);
            System.out.println("The Colour is Yellow");
        }
        else if (waveLength > 590 && waveLength <= 620){
            System.out.println("The Colour Code : ");
            System.out.println("#" + waveLength);
            System.out.println("The Colour is Orange");
        }
        else if (waveLength > 620 && waveLength <= 750){
            System.out.println("The Colour Code : ");
            System.out.println("#" + waveLength);
            System.out.println("The Colour is Red");
        }
        
    }
    
}
/**
 *
 * @author 30023737
 */