#include <stdio.h>
#include <string.h>

int main() {
    char *str = "abc";
    
    int size = strlen(str);
    for (int i = 0; i < size; i++){
        int ascii = str[i];
        printf("%d\n", ascii);
    }
    return 0;
}