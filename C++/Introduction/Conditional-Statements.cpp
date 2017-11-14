#include <iostream>
#include <cstdio>
using namespace std;

void print (int n){
    if (n == 1)
        puts ("one");
    else if (n == 2)
        puts("two");
   else if (n == 3)
        puts("three");
            else if (n == 4)
        puts("four");
            else if (n == 5)
        puts("five");
            else if (n == 6)
        puts("six");
            else if (n == 7)
        puts("seven");
            else if (n == 8)
        puts("eight");
            else if (n == 9)
        puts("nine");
    
}



int main() {
    // Complete the code.
    int num;
    
    scanf ("%d", &num);
    
    if (num >= 1 && num <= 9)
        print (num);
    else
        puts ("Greater than 9");
    
    return 0;
}