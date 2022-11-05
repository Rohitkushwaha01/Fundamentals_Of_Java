#include<bits/stdc++.h>
using namespace std;

int largestElement(vector<int> arr) {
    int largest = 0;
    for(int i = 0; i < arr.size(); i++){
        if(largest < arr[i]){
            largest = arr[i];
        }
    }
    return largest;
}


int main(){
    vector<int> arr = {11000, -2, 3000, 203, 8};
    cout<< largestElement(arr);
}