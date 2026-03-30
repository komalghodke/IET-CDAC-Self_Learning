#include <iostream>
#include <stdexcept>
using namespace std;

/*
Assignment 14:
Implement Custom exception class.
*/

class MyException : public exception {
public:
    const char* what() const noexcept override {
        return "Custom Exception Occurred!";
    }
};

int main() {
    cout << "Assignment 14: Custom Exception Class\n";
    cout << "-------------------------------------\n";

    try {
        throw MyException();
    }
    catch (MyException &e) {
        cout << e.what() << endl;
    }

    return 0;
}
