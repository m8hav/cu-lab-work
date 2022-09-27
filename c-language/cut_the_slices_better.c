#include <stdio.h>

int main(){
    int n = 6;
    int arr[] = {3, 3, 4, 5, 5, 6};
    
    int r = n;
    for(int i = 0; i < n; i++){
    	printf("%d\n", r);
    	int count = 1;
    	while (i < n-1 && arr[i] == arr[i+1]){
    		count++;
    		i++;
    	}
    	r = r-count;
    }
    return 0;
}