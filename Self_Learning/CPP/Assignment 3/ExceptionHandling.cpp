#include <iostream>
using namespace std;

/*
Assignment 13:
Implement exceptions and do proper management through your program.
*/

int main() {
    cout << "Assignment 13: Exception Handling\n";
    cout << "---------------------------------\n";

    try {
        int a, b;
        cout << "Enter two numbers: ";
        cin >> a >> b;
        if (b == 0) {
            throw "Division by zero not allowed!";
        }
        cout << "Result = " << a / b << endl;
    }
    catch (const char *msg) {
        cout << "Exception caught: " << msg << endl;
    }

    return 0;
}
