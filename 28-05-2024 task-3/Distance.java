// 5. Create a class to find out the distance b/w 
// two coordinates. (d=√((x2 – x1)² + (y2 – y1)²).


import java.util.Scanner;

public class Distance {

      // Method to calculate the distance between two coordinates
      public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
    public static void main(String[] args, Object Scanner) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first coordinate:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter the second coordinate:");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("The distance between the two coordinates is: " + distance);
        
        
      
    }
}
