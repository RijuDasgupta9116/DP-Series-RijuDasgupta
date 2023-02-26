/*

QUESTION LINK - https://www.codingninjas.com/codestudio/problems/nth-fibonacci-number_74156?leftPanelTab=0&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbar

*/


#include<bits/stdc++.h>
using namespace std;

int fib(int n){
        if(n == 0 || n == 1){
                return n;
        }
        vector<int> dp(n+1,-1);
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
                dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
}

int main()
{
        int n;
        cin>>n;
        cout<<fib(n);
}
