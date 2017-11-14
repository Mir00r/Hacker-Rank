#include <iostream>
#include <cstdio>
using namespace std;

void check (int n){
    if (n == 1)
        puts ("one");
    if (n == 2)
        puts ("two");
        if (n == 3)
        puts ("three");
        if (n == 4)
        puts ("four");
        if (n == 5)
        puts ("five");
        if (n == 6)
        puts ("six");
        if (n == 7)
        puts ("seven");   
    if (n == 8)
        puts ("eight");   
    if (n == 9)
        puts ("nine");
    
}

int main() {
    // Complete the code.
    int a, b, i;
    
    scanf ("%d %d", &a, &b);
    
    for (i = a; i <= b; i++){
        if (i >= 1 && i <= 9)
            check (i);
        else{
            if (i % 2 == 0)
                puts ("even");
            else
                puts ("odd");
        }
    }
    
    return 0;
}