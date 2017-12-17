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

int mat[row][col];

int cal_sum (int r, int c){
    int i, j, sum = 0;
    //printf ("Row = %d	Col = %d\n", r, c);
    for (i = r; i < 3; i++)
        for (j = c; j < 3; j++)
            sum += mat[i][j];
    // printf ("Sum = %d\n", sum);
    return sum;
}


int main() {

    int i, j, maxn = -100, sum = 0;

    for (i = 0; i < 6; i++)
        for (j = 0; j < 6; j++)
            scanf ("%d", &mat[i][j]);

    for (i = 0; i < 4; i++){
        for (j = 0; j < 4; j++){

            sum = mat[i][j] + mat[i][j+1] + mat[i][j+2] + mat[i+1][j+1] + mat[i+2][j] + mat[i+2][j+1] + mat[i+2][j+2];
            //printf ("SUM = %d\n", sum);

            if (maxn < sum){
                maxn = sum;
                //printf ("MAXN = %d\n", maxn);
            }
        }
    }

    printf ("%d\n", maxn);
    /*
    for (i = 0; i < 4; i++){
        if (i == 0){
            res[cnt++] = cal_sum (0, 0);
        }
        else if (i == 2){
            res[cnt++] = cal_sum (3, 0);
        }
        else if (i == 3){
            res[cnt++] = cal_sum (0, 3);
        }
        else{
            res[cnt++] = cal_sum (3, 3);
        }

    }

    sort (res, res + cnt);

    printf ("%d\n", res[cnt-1]);*/

    return 0;
}