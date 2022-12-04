#include <stdio.h>
#include <stdlib.h>

int main() {
    int a;
    char b;
    printf("Enter an integer: ");
    scanf("%d", &a);
    fflush(stdin);
    printf("Enter a character: ");
    scanf("%c", &b);
    
    printf("Inputs were: %d, %c", a, b);
    return 0;
}