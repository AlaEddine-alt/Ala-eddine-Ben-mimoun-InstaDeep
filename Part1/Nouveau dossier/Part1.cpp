#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
#define f(i, j, k, l) for (ll i = j; i < k; i += l)
#define yes cout << "YES" << endl
#define no cout << "NO" << endl
#define endl "\n"

string Remove_Special_Caracters_And_transform_it_To_lower_Case_letters(string ch)
{
    string newCh;
    for (auto caracter : ch)
    {
        if (isalpha(caracter)) // Return true only if the caracter is lower case caracter or upper case caracter, false if not
        {
            char c = (char)tolower(caracter); // transform upper case caracter to lower case caracter
            newCh.push_back(c);               // add it to new string
        }
    }
    return newCh;
    // example: Given String : Madam, in Eden, I'm Adam
    //          result: madaminedenimadamtrue
}
string Palindrome(string ch)
{
    string newCh = Remove_Special_Caracters_And_transform_it_To_lower_Case_letters(ch);
    string newCh2 = newCh, ans;
    reverse(newCh2.begin(), newCh2.end()); // reverse a given string, Example: Alaa -> aalA
    if (newCh == newCh2)
        ans = "true";
    else
        ans = "false";
    return ans;
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    // Test cases ( provided in the problem)
    string Test1 = "Madam, in Eden, I'm Adam";
    cout << "the provided Test 1 is " + Palindrome(Test1) << "\n";
    string Test2 = "Complete the project report";
    cout << "the provided Test 2 is " + Palindrome(Test2) << "\n";
    // in case you want to test another example
    string ch;
    getline(cin, ch);
    cout << "Your Test is " + Palindrome(ch);
}