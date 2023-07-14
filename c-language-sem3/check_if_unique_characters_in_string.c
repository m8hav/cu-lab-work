// Return 1 if string contains all unique characters, else return 0
int isUniqueChars(char *str){
  int size = strlen(str);
  int map[128] = {0};
  for (int i = 0; i < size; i++){
    int ascii = str[i];
    map[ascii] += 1;
    if (map[ascii] > 1){
      return 0;
    }
  }
  return 1;
}