#include <stdio.h>

int main(){
	int as = 4, bs = 6;
	int a[] = {1, 3, 5, 7};
	int b[] = {2, 4, 6, 8, 10, 12};

	int cs = as + bs;
	int c[cs];

	int i = 0, j = 0, k = 0;
	while (i < as && j < bs){
		if(a[i] < b[j]){
			c[k++] = a[i++];
		}else{
			c[k++] = b[j++];
		}
	}
// 	printf("%d %d \n",i ,j);
	while(i<as)
	{
	  c[k++]=a[i++];
	}
	while(j<bs)
	{
	  c[k++]=b[j++];
	}
	for (int l = 0; l < cs; l++){
		printf("%d, ", c[l]);
	}
}