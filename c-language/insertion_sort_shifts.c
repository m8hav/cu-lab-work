#include <stdio.h>
int insertionSort(int arr[], int s){
    int key, j, swaps, shifts = 0;
    for (int i = 1; i < s; i++){
        swaps = 0;
        key = arr[i];
      	j = i - 1;
      	while (j >= 0 && arr[j] > key){
            arr[j+1] = arr[j];
          	j--;
          	swaps++;
      	}
      	arr[j+1] = key;
        if (swaps > 0) shifts += ++swaps;
    }
    return shifts;
}

int main() {
    int t, s;
    scanf("%d", &t);
    while (t--){
        scanf("%d", &s);
        int arr[s];
        for (int y = 0; y<s; y++){
          scanf("%d", &arr[y]);
        }
        printf("\n%d", insertionSort(arr, s));
    }
}