#include <stdio.h>

int main(){
	// int a_size = 4, b_size = 6;
	// int a[] = {1, 3, 5, 7};
	// int b[] = {2, 4, 6, 8, 10, 12};

	int a_size = 0, b_size = 2;
	int a[] = {};
	int b[] = {1, 2};

	int c_size = a_size + b_size;
	int c[c_size];

	int i = 0, j = 0, k = 0;
	while (i < a_size && j < b_size){
		if(a[i] < b[j]){
			c[k++] = a[i++];
		}else{
			c[k++] = b[j++];
		}
	}
	while(i<a_size)
	{
	  c[k++]=a[i++];
	}
	while(j<b_size)
	{
	  c[k++]=b[j++];
	}
	for (int l = 0; l < c_size; l++){
		printf("%d, ", c[l]);
	}
}