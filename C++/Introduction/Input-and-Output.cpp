#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int arr[100], i, sum =0;
    for (i = 0; i < 3; i++){
        scanf ("%d", &arr[i]);
        sum += arr[i];
    }
    printf ("%d\n", sum);
    return 0;
}