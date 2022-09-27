// Online C compiler to run C program online
#include <stdio.h>

int func1(int a) {
    int m, n;
    if (a < 10){
        return ((10*a) + a);
    }else{
        m = func1(a/10);
        n = func1(a%10);
        return ((100*m) + n);
    }
}

int func2(int a){
    if (a < 0){
        return (-func2(-a));
    }else{
        if (a < 10){
            return (a+1) % 10;
        }else{
            return (100 * func2(a/10));
        }
    }
}

int fib(int p){
    if (p == 0 || p == 1){
        return 0;
    }
    else if(p == 2){
        return 1;
    }else{
        return fib(p - 1) + fib(p - 2);
        return result;
    }
}

void main(){
    // printf("%d\n", func1(348));
    // printf("%d\n", func1(234));
    
    // printf("%d\n", func2(348));
    // printf("%d\n", func2(-234));
    // printf("%d\n", func2(123));
    // printf("%d\n", func2(385));
    
    printf("%d\n", fib(0));
    printf("%d\n", fib(1));
    printf("%d\n", fib(2));
    printf("%d\n", fib(3));
    printf("%d\n", fib(7));
}