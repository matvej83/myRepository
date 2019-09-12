import java.util.*;

public class Chess {
    //from start position white horse can move on six string in positions A6, C6, F6, H6
    //and the black horse - on third string in positions A3, C3, F3, H3
    //writing to the arrays the indexes of columns equivalents letters (a, c, f, h)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the letter of new position and press <Enter> key ");
        char column = sc.next().charAt(0);
        System.out.println("Input the number of new position and press <Enter> key ");
        int row = sc.nextInt();
        int[][] whiteHorseCorrectMoving = {
                //A, C, F, H
                {1, 3, 6, 8},
                {6, 6, 6, 6},
        };
        int[][] blackHorseCorrectMoving = {
                //A, C, F, H
                {1, 3, 6, 8},
                {3, 3, 3, 3},
        };
        switch (row) {
            case 3:
                if (column == 'a' | column == 'c' | column == 'f' | column == 'h') {
                    System.out.println((String.valueOf(column)) + row + " it's a correct move");
                } else System.out.println((String.valueOf(column)) + row + " it's a incorrect move");
                break;
            case 6:
                if (column == 'a' | column == 'c' | column == 'f' | column == 'h') {
                    System.out.println((String.valueOf(column)) + row + " it's a correct move");
                } else System.out.println((String.valueOf(column)) + row + " it's a incorrect move ");
                break;
            default:
                System.out.println((String.valueOf(column)) + row + " it's a incorrect move");
        }
        sc.close();
    }
}
