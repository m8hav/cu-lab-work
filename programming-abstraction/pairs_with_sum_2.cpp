// Jan 18, 2023

#include <iostream>
using namespace std;

// SECOND METHOD
int find_pairs_with_sum(int arr[], int s, int sum){
    int pairs = 0;
    int j = s-1;
    for (int i = 0; i < s; i++){
        if (arr[i] + arr[j] == sum){
            pairs++;
            i++;
            j--;
        }else if(arr[i] + arr[j] > sum) j--;
        else i++;
    }

    return pairs;
}

int main(){
    
    int arr[] = {1, 1, 1, 2, 2, 3, 4, 5, 6, 7};
    int sum = 8;
    int s = sizeof(arr)/sizeof(arr[0]);

    int pairs = find_pairs_with_sum(arr, s, sum);

    cout << pairs;

    return 0;
}