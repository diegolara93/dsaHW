import java.util.*;
public class Diego_Lara_hw1 {
       /* given a square matrix, ie 5x5
[5,5,5,5,5
 5,5,5,5,5
 5,5,5,5,5
 5,5,5,5,5
 5,5,5,5,5]
 calculate absolute difference between the sum of the diagonals
 */
public static int diagonalDifference(List<List<Integer>> arr) { 
    int sumRight = 0;
    int sumLeft = 0;
    int length = arr.size() - 1;
    for (int i = 0; i <= length; i++)    // Goes thru rows 
    {
       sumLeft+=(arr.get(i).get(i));
    }
    for (int i = 0; i <= length; i++)    // Goes thru rows 
    {
       sumRight+=(arr.get(i).get(length - i));
    }
    int sum = Math.abs(sumLeft - sumRight);
    return sum;
   }
   public static void main(String[] args) {
    List<List<Integer>> matrix = new ArrayList<>();
    List<Integer> row1 = new ArrayList<>();
    row1.add(30);
    row1.add(5);
    row1.add(10);
    matrix.add(row1);
    List<Integer> row2 = new ArrayList<>();
    row2.add(5);
    row2.add(10);
    row2.add(5);
    matrix.add(row2);
    List<Integer> row3 = new ArrayList<>();
    row3.add(5);
    row3.add(5);
    row3.add(10);
    matrix.add(row3);
    System.out.println(matrix);
    System.out.println(matrix.get(0).get(0));
    System.out.println(diagonalDifference(matrix));
   }
}
