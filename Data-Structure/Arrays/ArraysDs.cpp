#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>
#include <stdio.h>
using namespace std;


int main(){
    int n, i, arr[10005];

    scanf ("%d", &n);
    for (i = 0; i < n; i++)
        scanf ("%d", &arr[i]);

    for ( i = n-1; i >= 0; i--)
        printf ("%d ", arr[i]);
    puts ("");
    return 0;
}