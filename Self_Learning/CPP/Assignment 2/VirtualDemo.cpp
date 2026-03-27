#include <iostream>
using namespace std;

/*
Problem Statement:
Using virtual and pure virtual functions implement hierarchy of printers.
*/

class Printer {
public:
    virtual void print() = 0; // pure virtual
};

class InkjetPrinter : public Printer {
public:
    void print() override { cout << "Inkjet Printer printing...\n"; }
};

class LaserPrinter : public Printer {
public:
    void print() override { cout << "Laser Printer printing...\n"; }
};

int main() {
    Printer* p1 = new InkjetPrinter();
    Printer* p2 = new LaserPrinter();
    p1->print();
    p2->print();
    delete p1;
    delete p2;
}