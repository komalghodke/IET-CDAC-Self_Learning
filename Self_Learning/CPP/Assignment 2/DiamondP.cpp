#include <iostream>
using namespace std;

/*
Problem Statement:
Implement diamond problem with a real-life example.
*/

class Device {
public:
    void info() { cout << "Generic Device\n"; }
};

class Scanner : virtual public Device {
public:
    void scan() { cout << "Scanning...\n"; }
};

class Copier : virtual public Device {
public:
    void copy() { cout << "Copying...\n"; }
};

class MultiFunctionPrinter : public Scanner, public Copier {
public:
    void print() { cout << "Printing...\n"; }
};

int main() {
    MultiFunctionPrinter mfp;
    mfp.info();  // Diamond problem solved with virtual inheritance
    mfp.scan();
    mfp.copy();
    mfp.print();
}