package day4;

/**
 * Day 4 Control Structure in Java
 * @author Nur Rohman Fajri
 */
public class Main {
    public static void main(String[] args) {
        
        // Conditional if
        boolean statement1 = 3 > 2;
        
        if (statement1) {
            System.out.println("Statement 1 true");
        }
        
        // Conditional if..else
        boolean statement2 = 3 < 2;
        
        if (statement2) {
            System.out.println("Statement 2 true");
        } else {
            System.out.println("Statement 2 false");
        }
        
        // Conditional if..else if..else
        boolean statement3 = 3 == 2;
        boolean statement4 = 3 > 2;
        
        if (statement3) {
            System.out.println("Statement 3 true");
        } else if (statement4) {
            System.out.println("Statement 4 true");
        } else {
            System.out.println("Statement 3 dan 4 false");
        }
        
        // Conditional switch
        int n = 1;
        
        switch (n) {
            case 0: 
                System.out.println("n = 0");
                break;
            case 1:
                System.out.println("n = 1");
                break;
            case 2:
                System.out.println("n = 2");
                break;
            default:
                System.out.println("n tidak terdaftar");
        }
        
        // Conditional operator ?
        String result = 3 > 2 ? "3 lebih besar dari 2" : "3 tidak lebih besar dari 2";
        System.out.println(result);
        
        // Looping for
        for (int i = 0; i < 10; i++) {
            System.out.println("Looping for ke " + i);
        }
        
        // Looping while
        int i = 0;
        while (i < 10) {
            System.out.println("Looping while ke " + i);
            i++;
        }
    }
}
