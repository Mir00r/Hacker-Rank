#include <iostream>
#include <string>
using namespace std;

int main() {
   // Complete the program
    string a, b, c;
    int alen, blen;
    
    cin >> a;
    cin >> b;
    
    alen = a.length();
    blen = b.length();
    
    c = a + b;
    swap (a[0], b[0]);
    
    printf ("%d %d\n", alen, blen);
    cout << c << endl;
    cout << a << " " << b << endl;
    
    return 0;
}