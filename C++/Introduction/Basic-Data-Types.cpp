#include <iostream>
#include <cstdio>
using namespace std;

int main() {
    int a;
    long int b;
    long long int c;
    char ch;
    float x;
    double y;

    scanf ("%d %ld %lld %c %f %lf", &a, &b, &c, &ch, &x, &y);
//    scanf ("%c", &ch);
//    scanf ("%f", &x);
//    scanf ("%lf", &y);

    printf ("%d\n%ld\n%lld\n%c\n%f\n%lf\n", a, b, c, ch, x, y);
//    printf ("%c\n", ch);
//    printf ("%f\n", x);
//    printf ("%lf\n", y);

    return 0;
}
