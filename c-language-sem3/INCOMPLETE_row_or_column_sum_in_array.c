/*     
 * Complete the 'solveQuery' function below.
 * @params
 *   N -> Total numbers from 1 to N
 *   W -> Maximum numbers in each row
 *   i -> First part of the query, denoting row or column number
 *   ch -> Second part of the query (i.e 'R' or 'C')
 * 
 * @return
 *   The sum of numbers in the row or column, as per the query
 */
long solveQuery(int N, int W, int i, char ch) {
  int r = (N/W)+1, c = W;
  int arr[r][c], num = 1, sum = 0;
  int a;
  for (int l = 0; l < r; l++){
    for (int m = 0; m < c; m++){
      a = num++;
      arr[l][m] = a;
      if (a <= N){
        if (ch == "C" && m == i) sum += arr[l][m];
        else if (ch == "R" && l == i) sum += arr[l][m];
      }
    }
  }
  return sum;
}