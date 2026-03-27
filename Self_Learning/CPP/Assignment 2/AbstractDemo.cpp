#include <iostream>
using namespace std;

/*
Problem Statement:
Implement abstract classes in your program.
*/

class Shape {
public:
    virtual void draw() = 0;
};

class Circle : public Shape {
public:
    void draw() override { cout << "Drawing Circle\n"; }
};

int main() {
    Shape* s = new Circle();
    s->draw();
    delete s;
}