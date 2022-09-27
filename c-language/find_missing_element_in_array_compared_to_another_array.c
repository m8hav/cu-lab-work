#include <stdio.h>

int getMissingElement(int arr1[], int s1, int arr2[], int s2){
	int sum1 = 0, sum2 = 0;
	for (int i = 0; i<s1; i++){
		sum1 += arr1[i];
	}
	for (int j = 0; j<s2; j++){
		sum2 += arr2[j];
	}
	return sum1-sum2;
}

int main(){
	int arr1[] = {1, 2, 3, 4, 5, 6};
	int s1 = sizeof(arr1)/sizeof(arr1[0]);
	int arr2[] = {1, 2, 3, 4, 6};
	int s2 = sizeof(arr2)/sizeof(arr2[0]);
	printf("%d", getMissingElement(arr1, arr2, s1, s2));

	return 0;
}