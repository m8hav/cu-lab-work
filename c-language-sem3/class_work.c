#include <stdio.h>

long int find_reverse(){
    long int num;
    printf("Enter the number to find it's reverse\n>>> ");
    scanf("%ld", &num);
    
    long int rev = 0; // 0 + 
    while (num){
        rev = rev*10 + num%10;
        num /= 10;
    }
    // printf("Reverse is %d", rev);
    return rev;
}

long int add_one_to_each_place(){
    long int num;
    printf("\n\n--------------------\n\nEnter the number to add 1 to each digit of\n>>> ");
    scanf("%ld", &num);
    
    // long int result = 0;
    // long int multiplier = 1;
    // while (num){
    //     long int adder = (num%10 + 1)%10;
    //     result = result + (adder)*multiplier;
    //     multiplier *= 10;
    //     num /= 10;
    // }
    
    long int adder = 0;
    long int temp = num;
    while (temp){
        temp /= 10;
        adder = adder*10 + 1;
    }
    long int result = num + adder;
    // printf("Result is %ld", result);
    return result;
}

int factorial(){
    
}

int main() {
    printf("%ld", find_reverse());
    printf("%ld", add_one_to_each_place());
    // find_reverse();
    // add_one_to_each_place();
}