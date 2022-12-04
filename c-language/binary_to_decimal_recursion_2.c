#include <stdio.h>
#include <math.h>

int BtD(int bin){
    int mul = 0, dec = 0;
    while (bin){
        dec += bin%10*pow(2, mul++);
        bin /= 10;
    }
    return dec;
}

int main() {
    int a;
    printf("Enter Binary Number: ");
    scanf("%d", &a);
    printf("Binary %d is %d in Decimal\n", a, BtD(a));
    return 0;
}