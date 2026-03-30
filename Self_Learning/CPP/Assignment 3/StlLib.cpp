#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    vector<int> v;

    cout << "Original Vector: ";
    v.push_back(100);
    v.push_back(678);
    if(!v.empty()) {
        for(int i=0; i<v.size(); i++) {
            cout<<v[i]<<" ";
        }
    }
}