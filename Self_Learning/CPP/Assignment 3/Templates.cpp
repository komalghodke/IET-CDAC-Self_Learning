#include <iostream>
using namespace std;

/*
Assignment 17:
Assignments on templates.
*/

template <class T>
T add(T a, T b) {
    return a + b;
}

int main() {
    cout << "Assignment 17: Templates\n";
    cout << "-------------------------\n";

    cout << "Int Add: " << add<int>(5, 10) << endl;
    cout << "Double Add: " << add<double>(2.5, 3.7) << endl;

    return 0;
}
