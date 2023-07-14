#include <stdio.h>
#include <math.h>

int BtD(int bin, int mul){
    if (bin == 0) return 0;
    return bin%10*pow(2, mul) + BtD(bin/10, mul+1);
}

int main() {
    int a;
    printf("Enter Binary Number: ");
    scanf("%d", &a);
    printf("Binary %d is %d in Decimal\n", a, BtD(a, 0));
    return 0;
}