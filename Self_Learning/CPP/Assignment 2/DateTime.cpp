#include <iostream>
using namespace std;

/*
Problem Statement:
Write Date and Time classes that allow add, subtract, read and print
simple dates in dd/mm/yyyy and time in hh:mm:ss formats.
Use function overloading.
*/

class Date {
    int d, m, y;
public:
    Date(int dd=1, int mm=1, int yy=2000): d(dd), m(mm), y(yy) {
        
    }
    void print() { 
        cout << d << "/" << m << "/" << y << endl;
     }
    Date operator+(int days) {
         return Date(d+days, m, y); 
        }
};

class Time {
    int h, m, s;
public:
    Time(int hh=0, int mm=0, int ss=0): h(hh), m(mm), s(ss) {}
    void print() { cout << h << ":" << m << ":" << s << endl; }
    Time operator-(int sec) { return Time(h, m, s-sec); }
};

int main() {
    Date d1(26,3,2026);
    d1.print();
    Date d2 = d1 + 5;
    d2.print();

    Time t1(11,32,0);
    t1.print();
    Time t2 = t1 - 30;
    t2.print();
}