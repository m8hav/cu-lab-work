#include <iostream>
using namespace std;

bool check_prime(int n){
    for (int i = 2; i < n/i; i++){
        if (n%i==0) return false;
    }
    return true;
}

/*
IN STOP CONDITION WE USE i <= n/i OR i*i <= n OR i <= root(n)
BECAUSE SOMEHOW root(n) IS THE TURNING POINT FOR i WHERE
ALL THE UPCOMING FACTORS ARE ACTUALLY COEFFICIENT FACTORS
FROM i <= root(n) MEANING WE'VE ALREADY CHECKED FOR THOSE BY
CHECKING THE MAIN FACTORS, SO NO NEED TO CHECK THEM AGAIN AFTER 
root(n)

Examples:
64
    1 64
    2 32
    4 16
    8 8
    16 4 (repeated)
    ...
90
    1 90
    2 45
    3 30
    5 18
    6 15
    9 10
    10 9 (repeated)
    ...
*/
int main(){
    int n = 53;
    
    cout << check_prime(n);
    // ^ PRINTS 0 FOR FALSE AND 1 FOR TRUE
    return 0;
}