void multiplyMatrix(int A[SIZE][SIZE],int B[SIZE][SIZE],int R1,int C1,int R2,int C2)
{
  int C[R1][C2];
  int sum;
  for (int i = 0; i < R1; i++){
    for (int j = 0; j < C2; j++){
      sum = 0;
      for (int k = 0; k < C1; k++){	// k = C1 or R2
        sum += A[i][k] * B[k][j];
      }
      C[i][j] = sum;
    }
  }
  for (int l = 0; l < R1; l++){
    for (int m = 0; m < C2; m++){
      printf("%d ", C[l][m]);
    }
    printf("\n");
  }
}