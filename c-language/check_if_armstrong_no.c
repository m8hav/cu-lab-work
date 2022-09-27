#include <stdio.h>

int main(){
    int num;
    // printf("Enter number to check if it's an armstrong's number\n>>>");
    scanf("%d", &num);
    // printf("\n");
    
    int n_digits = 0;
    int temp = num;

    while (temp > 0){
        temp /= 10;
        n_digits++;
    }
    // printf("Number of digits is %d\n\n", n_digits);

    int sum = 0;
    temp = num;
    while (temp > 0) {
        sum += pow(temp%10, n_digits);
        temp /= 10;
    }
    // printf("Sum is %d\n\n", sum);
    
    if (sum == num){
        // printf("IS Armstrong Number");
        printf("yes");
    }else{
        // printf("IS NOT Armstrong Number");
        printf("no");
    }
    return 0;
};