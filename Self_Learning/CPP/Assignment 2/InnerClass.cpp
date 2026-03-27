/*
Problem Statement:
Write a program to implement an inner class in C++.
*/

#include <iostream>
using namespace std;

class Outer {
public:
    class Inner {
    public:
        void show() { cout << "Inner class function\n"; }
    };
};

int main() {
    Outer::Inner obj;
    obj.show();
}