#include <stdio.h>

int prtln(FILE *fp){
  char ch = getc(fp);
  if (ch == EOF) return 1;
  while (ch != EOF){
    printf("%c", ch);
    if (ch == "\n"){
      printf("Printing loop\n");
      return 0;
    }
    ch = getc(fp);
  }
}

int skpln(FILE *fp){
  char ch = getc(fp);
  if (ch == EOF) return 1;
  while (ch != EOF){
    ch = getc(fp);
    if (ch == "\n") return 0;
  }
}

int main()
{
  char file[50], ch;
  // printf("\nEnter filename to print lines from in odd first, even after format:");
  scanf("%s", &file);
  // fflush(stdin);
  FILE *fp = fopen(file, "r");
  int flag = 1;
  ch = getc(fp);
  while (ch != EOF){
    if (flag){
      printf("%c", ch);
      if (ch == "\n"){
        flag = 0;
        printf("Odd loop\n");
      }
      ch = getc(fp);
    }
    else{
      ch = getc(fp);
      if (ch == "\n") flag = 1;
    }
  }
  rewind(fp);
  flag = 0;
  ch = getc(fp);
  while (ch != EOF){
    if (flag){
      printf("%c", ch);
      if (ch == "\n"){
        flag = 0;
        printf("Even loop\n");
      }
    }
    else{
      ch = getc(fp);
	  if (ch == "\n") flag = 1;
    }
  }
  return 0;
}