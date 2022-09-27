#include <stdio.h>

int main(){
    int amt;
    // printf("Enter the amount to find the notes for\n>>>");
    scanf("%d", &amt);
    // printf("Amount entered is %d\n\n", amt);
    
    int note_array[8] = {};
    
    note_array[0] = amt / 2000;
    if (note_array[0] > 0){
        amt -= note_array[0]*2000;
    }
    // printf("Number of Rs. 2000 notes required: %d\n\n", note_array[0]);
    
    note_array[1] = amt / 500;
    if (note_array[1] > 0){
        amt -= note_array[1]*500;
    }
    // printf("Number of Rs. 500 notes required: %d\n\n", note_array[1]);
    
    note_array[2] = amt / 100;
    if (note_array[2] > 0){
        amt -= note_array[2]*100;
    }
    // printf("Number of Rs. 100 notes required: %d\n\n", note_array[2]);
    
    note_array[3] = amt / 50;
    if (note_array[3] > 0){
        amt -= note_array[3]*50;
    }
    // printf("Number of Rs. 50 notes required: %d\n\n", note_array[3]);
    
    note_array[4] = amt / 20;
    if (note_array[4] > 0){
        amt -= note_array[4]*20;
    }
    // printf("Number of Rs. 20 notes required: %d\n\n", note_array[4]);
    
    note_array[5] = amt / 10;
    if (note_array[5] > 0){
        amt -= note_array[5]*10;
    }
    // printf("Number of Rs. 10 notes required: %d\n\n", note_array[5]);
    
    note_array[6] = amt / 5;
    if (note_array[6] > 0){
        amt -= note_array[6]*5;
    }
    // printf("Number of Rs. 5 notes required: %d\n\n", note_array[6]);
    
    note_array[7] = amt / 2;
    if (note_array[7] > 0){
        amt -= note_array[7]*2;
    }
    // printf("Number of Rs. 2 notes required: %d\n\n", note_array[7]);
    
    note_array[8] = amt / 1;
    if (note_array[8] > 0){
        amt -= note_array[8]*1;
    }
    // printf("Number of Rs. 1 notes required: %d\n\n", note_array[7]);

    for (int j = 0; j <= 8; j++){
        printf("%d", note_array[j]);
        if (j < 8){printf(" ");}
    }
    
    return 0;
};