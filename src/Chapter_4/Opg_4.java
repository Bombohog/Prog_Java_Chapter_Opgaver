/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 06-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_4;

import java.util.Scanner;

public class Opg_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of a side: ");
        double s = input.nextDouble();

        double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));

        System.out.printf("The area of the hexagon is %.2f", area);

    }

}
