#include <stdio.h>

int main(){
    // printf("Enter the number of electricity units\n>>>");
    int units;
    scanf("%d", &units);
    // printf("\n\nNumber of units: %d\n\n", units);
    
    // int unit_segment_arr[] = {50, 100, 100, 250};
    // int rate_arr[] =      {2.50, 2.75, 4.20, 4.50};
    float bill = 0;

    if (units <= 50){
        bill += units*2.50;
    }else{
        bill += 50*2.50;
        units -= 50;
        if (units <= 100){
            bill += units*2.75;
        }else{
            bill += 100*2.75;
            units -= 100;
            if (units <= 100){
                bill += units*4.20;
            }else{
                bill += 100*4.20;
                units -= 100;
                bill += units*4.50;
            }
        }
    }

    bill *= 1.1;
    // printf("\nYour bill is %.2f", bill);
    printf("%.2f", bill);
    return 0;
}   