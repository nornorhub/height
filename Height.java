package height;

import java.util.*;

import java.text.DecimalFormat;

public class Height {
    public static final DecimalFormat df2 = new DecimalFormat( "#.00" );

    public static void printArray(double[] heightArray) {
        for (int i = 0; i < heightArray.length; i++) {
            System.out.println("Age " + i + ": " + df2.format(heightArray[i]));
        }
    }
    
    public static void adjustHeights(int age, double height, double[] heightArray) {
        heightArray[age] = height;
        for (int i = 0; i < (heightArray.length-age); i++) {
            heightArray[i+age] = heightArray[i]+ (height-heightArray[age]);
        }
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double[] heightArray = {19.6, 29.8, 34.2, 37.5, 40.3, 43, 45.5, 48, 50.4, 52.5, 54.5};

        printArray(heightArray);

        for (int x = 0; x < heightArray.length; x++) {

            System.out.print("What is the child's height at age " + x + ": ");

            double height = scan.nextDouble();

            adjustHeights(x, height, heightArray);

            printArray(heightArray);

        }
    }
}
