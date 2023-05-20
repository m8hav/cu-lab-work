// 2 - Jan 11, 2023

#include <iostream>
#include <cstdio>
#include <cmath>

using namespace std;

void rotate_array(int arr[], int s, int r){
    int temp;
    while (r--){
        temp = arr[0];
        for (int i = 0; i < s-1; i++){
            arr[i] = arr[i+1];
        }
        arr[s-1] = temp;
    }
}

int main()
{
	int t, s, r;
    cin >> t;
    while (t--){
      cin >> s;
      int arr[s];
      for (int i = 0; i < s; i++){
        cin >> arr[i];
      } 
      cin >> r;
      rotate_array(arr, s, r);
      for (int j = 0; j < s-1; j++){
        cout << arr[j] << " ";
      }
      cout << arr[s-1] << endl;
    }
    return 0;
}
