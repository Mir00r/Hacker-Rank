#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    
    int arr[10000], i, n;
    
    scanf ("%d", &n);
    if ( n < 1 || n > 1000)
        return -1;
    
    for (i = 0; i < n; i++)
        scanf ("%d", &arr[i]);
    
    for (i = n-1; i >= 0; i--)
        printf ("%d ", arr[i]);
    puts ("");
    return 0;
}