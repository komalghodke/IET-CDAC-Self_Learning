#include <iostream>
#include <fstream>
#include <string> 
using namespace std;

int main() {
    ofstream fout("data.txt", ios::out);
    if (!fout) {
        cout << "File could not be opened!" << endl;
        return 1;
    }

    fout << "Hello Komal\n";
    fout << "CDAC Assignment on Files\n";
    fout.close();

    ifstream fin("data.txt", ios::in);    
    string line;
    cout << "Reading from file:\n";
    while (getline(fin, line)) {
        cout << line << endl;
    }
    fin.close();

    return 0;
}