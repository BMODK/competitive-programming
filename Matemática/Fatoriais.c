#include <stdio.h>

long long fatorial(int x){
    if(x == 0 || x == 1)
        return 1;
    else
        return x * fatorial(x - 1);
}

int main(){
    int n, m;
    while(scanf("%d %d", &n, &m) != EOF){
        printf("%d\n", fatorial(n) + fatorial(m));
    }
}