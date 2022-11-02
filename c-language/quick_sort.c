#include <stdio.h>

// is it binary that the complexity is either O(n log n) or O(n^2) which only works for one case and all others have the other complexity

int partition(int a, int p, int r){
    int temp, x = a[r];
    int i = p - 1;
    for (int j = p; j < r; j++){
        if (a[j] <= x){
            i++;
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
    temp = a[i+1];
    a[i+1] = a[r];
    a[r] = temp;
    return i+1;
}

int quickSort(int a , int p, int r){
    if (p < r){
        int q = partition(a, p, r);
        quicksort(a, p, q-1);
        quickSort(a, q+1, r);
    }
}

int main(){
    int a = [2, 4, 0, 1, 5, 3];
    int s = sizeof(a)/sizeof(a[0]);
    
}