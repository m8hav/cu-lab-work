#include <stdio.h>

void printArray(int arr[], int size){    
	for (int i = 0; i < size; i++){
		printf("%d", arr[i]);
		if (i < size-1) printf(", ");
	}
}

int merge(int a[], int t[], int left, int right){
	int mid, i, j, k, l, target;
	mid = (right + left)/2;
	i = left;
	j = mid + 1;
	target = left;
	while (i<= mid && j <= right){
		if (a[i] <= a[j]){
			t[target] = a[i];
			i++;
		}else {
			t[target] = a[j];
			j++;
		}
		target++;
	}
	if (i > mid){	// left completed
		for (k = left; k < target; k++){
			a[k] = t[k];
		}
	}
	if (j > right){	// right completed
		k = mid;
		l = right;
		for (k = left; k < target; k++){
			a[k] = t[k];
		}
	}
	return 0;
}

int mergeSort(int a[],int t[], int left, int right){
	if (left < right){
		int mid = (left + right)/2;
		mergeSort(a, t, left, mid);
		mergeSort(a, t, mid + 1, right);
		merge(a, t, left, right);
	}
	return 0;
}

int mainMergeSort(int a[], int n){
	int t[n];
	mergeSort(a, t, 0, n - 1);
	return 0;
}

int main(){
	int a[] = {7, 3, 4, 9, 6, 2, 1, 4};
	int a_size = sizeof(a)/sizeof(a[0]);

	mainMergeSort(a, a_size);

	printArray(a, a_size);
	return 0;
}