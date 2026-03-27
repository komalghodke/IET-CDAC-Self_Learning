#include <iostream>
using namespace std;

/*
Problem Statement:
Design a hierarchy of computer printers using multiple inheritance.
Also use friend functions and classes.
*/

class Printer {
public:
    virtual void print() = 0; // pure virtual
};

class Inkjet {
public:
    void inkjetFeature() { cout << "Inkjet printing\n"; }
};

class Laser {
public:
    void laserFeature() { cout << "Laser printing\n"; }
};

class HybridPrinter : public Printer, public Inkjet, public Laser {
public:
    void print() override {
        inkjetFeature();
        laserFeature();
    }
    friend class PrinterFriend;
};

class PrinterFriend {
public:
    void access(HybridPrinter& hp) {
        cout << "Friend accessing HybridPrinter\n";
        hp.print();
    }
};

int main() {
    HybridPrinter hp;
    PrinterFriend pf;
    pf.access(hp);
}