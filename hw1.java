/* given a square matrix, ie 5x5
[5,5,5,5,5
 5,5,5,5,5
 5,5,5,5,5
 5,5,5,5,5
 5,5,5,5,5]
 calculate absolute difference between the sum of the diagonals
 */
Class hw1 {
public static int rightDiagnolDifference(int[][] matrix) {
 /* two for loops, one for row, one for column
 first for loop goes thru the rows, second for loop goes thru the columns
 */
int sum = 0;
 for (int i = 0; i < matrix.length; i++)    // Goes thru rows 
 {
    for (int j = 0; j <= i; j++) // Goes thru columns
    {
        if j == i {
            sum += matrix[i][j];
        }
    }
 }2
 return sum;
}

public static void main (String[] args) {
    int[][] matrix = new int[5][5];
    System.out.println(rightDiagnolDifference(matrix));
}
}
```

