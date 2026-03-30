#include <iostream>
using namespace std;

/*
Assignment 15:
Implement console I/O operations through your program.
*/

int main() {
    cout << "Assignment 15: Console I/O Operations\n";
    cout << "-------------------------------------\n";

    char name[50];
    int age;

    cout << "Enter your name: ";
    cin.getline(name, 50);

    cout << "Enter your age: ";
    cin >> age;

    cout << "\nOutput using console I/O:\n";
    cout << "Name: " << name << endl;
    cout << "Age: " << age << endl;

    return 0;
}