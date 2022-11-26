void sortStrings(int n, char str[][50]) {
  char temp[50];
  for (int i = 0; i < n; i++){
    for (int j = i; j < n; j++){
	  if (strcmp(str[i], str[j]) > 0){
        strcpy(temp, str[i]);
        strcpy(str[i], str[j]);
        strcpy(str[j], temp);
      }
    }
  }
  for (int k = 0; k < n-1; k++){
    printf("%s ", str[k]);
  }
  printf("%s", str[n-1]);
}
