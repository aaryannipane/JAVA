#include<stdio.h>
#include<stdlib.h>

int main(){

    int a = 10;
    int *p;
    p = &a;
    printf("%d", *p);

    return 0;
}

