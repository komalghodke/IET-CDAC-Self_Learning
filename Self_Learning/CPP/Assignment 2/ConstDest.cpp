#include <iostream>
using namespace std;

/*
Problem Statement:
Write a program to implement constructors and destructors.
*/

class Demo {
public:
    Demo() { cout << "Constructor called\n"; }
    ~Demo() { cout << "Destructor called\n"; }
};

int main() {
    Demo obj;
}
