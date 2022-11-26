// Return 1 if the string is palindrome, else return 0
int isPalindrome(char *str) {
  int size = strlen(str);
  for (int i = 0; i < size/2; i++){
    if (str[i] != str[size-1 - i]) return 0;
  }
  return 1;
}