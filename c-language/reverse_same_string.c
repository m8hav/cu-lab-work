// Do not print anything, just reverse the given string
void reverseString (char str[]) {
  int size = strlen(str);
  for (int i = 0; i < size/2; i++){
    char temp = str[i];
    str[i] = str[size-1 - i];
    str[size-1 - i] = temp;
  }
}
