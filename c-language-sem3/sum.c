#include <stdio.h>

int main() {
    int num1;
    int num2;
    
    scanf("%d \n", &num1);
    scanf("%d", &num2);

    printf("You entered %d and %d", num1, num2);
    // printf(num1 + num2);
    int sum = num1 + num2;
    printf(sum);
    // return sum;
}