#include <bits/stdc++.h>


using namespace std;

#define LI long int
#define LLI long long int
#define LL __int64
#define ULL unsigned long long
#define LLU long long unsigned
#define row 100
#define col 100
#define MAX 100000
#define jora pair <int, int>
#define memo(arr, value) memset(arr, value, sizeof(arr))
#define pb push_back
#define eb emplace_back
#define NL puts ("")
#define inf (1 << 28)
#define eps 1e9
#define MOD 7477777
#define PI 3.1415926535897932384626433832795
#define PrimeRange 1000000
#define CharRange 255
#define LIMIT 1000
#define MINX INT_MAX
#define MAXN INT_MIN
#define null NULL


int sparseArrrays(string a[], string q, int n) {
    int res = 0;

    for (int i = 0; i < n; i++) {
        if (a[i] == q) {
            res++;
        }
    }

    return res;
}

int main() {
    int n;
    int q;
    cin >> n;
    string a[n];
    for (int a_i = 0; a_i < n; a_i++) {
        cin >> a[a_i];
    }

    cin >> q;
    string qStr;
    for (int i = 0; i < q; ++i) {
        cin >> qStr;
        cout << sparseArrrays(a, qStr, n) << endl;
    }

    return 0;
}
