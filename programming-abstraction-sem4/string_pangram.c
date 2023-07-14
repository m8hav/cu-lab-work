#include <stdio.h>
#include <string.h>

// PANGRAM IS A STRING THAT CONTAINS ALL THE ALPHABETS
int is_pangram(char pangram_string[], int s){
    int hash[26] = {0};

    for (int i = 0; i < s; i++){
        int sascii = pangram_string[i];
        if (pangram_string[i] != ' '){
            hash[sascii - 97]++;
        }
    }
    for (int j = 0; j < 26; j++){
        if (hash[j] == 0){
            return 0;
        }
    }
    return 1;
}

int main(){
    
    // char pangram_string[] = "abcdefghijklmnopqrstuvwxyz";
    char pangram_string[] = "a quick brown fox jumps over the lazy dog";
    int s = strlen(pangram_string);

    if (s >= 26){
        if (is_pangram(pangram_string, s)){
            printf("\nString IS pangram\n");
        }else printf("\nString IS NOT pangram\n");
    }else printf("\nString IS NOT pangram\n");

    return 0;
}