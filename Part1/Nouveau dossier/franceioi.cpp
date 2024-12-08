#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
#define f(i, y, k, l) for (ll i = j; i < k; i += l)
#define yes cout << "YES" << endl
#define no cout << "NO" << endl
#define endl "\n"



int main()
{
    int n; // Number of disks
    cin >> n;
    hanoi(n, '1', '2', '3'); // A, B and C are names of rods
    return 0;
}
