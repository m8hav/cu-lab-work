#include <stdio.h>

struct shopping {
    int qty;
    int p1;
    int p2;
};

int main() {
    int t, sum = 0;
    char temp;
    scanf("%d", &t);
    while (t--){
        struct shopping s;
        scanf("%s", &temp);
        scanf("%d", &s.qty);
        scanf("%d", &s.p1);
        scanf("%d", &s.p2);
        if (s.qty*s.p1 < s.qty*s.p2) sum += s.qty*s.p1;
        else sum += s.qty*s.p2;
    }
    
    return 0;
}