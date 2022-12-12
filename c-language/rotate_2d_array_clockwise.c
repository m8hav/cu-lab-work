#include <stdio.h>
int main()
{
	int t, n;
  	scanf("%d", &t);
  	while (t--){
      // getting array elements
      scanf("%d", &n);
      int arr[n][n];
      for (int i = 0; i < n; i++){
        for (int j = 0; j < n; j++){
          scanf("%d", &arr[i][j]);
        }
      }
     
    // transposing array
    int temp;
    for (int i = 0; i < n; i++){
      for (int j = 0; j < i; j++){
        temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }
    // switching columns
    for (int i = 0; i < n; i++){
      for (int j = 0; j < n/2; j++){
        temp = arr[i][j];
        arr[i][j] = arr[i][n-j-1];
        arr[i][n-j-1] = temp;
      }
    }
      
    // printing
    for (int i = 0; i < n; i++){
      for (int j = 0; j < n; j ++){
        printf("%d", arr[i][j]);
        if (j < n-1) printf(" ");
      }
      printf("\n");
    }
    printf("\n");
    }
    return 0;
}