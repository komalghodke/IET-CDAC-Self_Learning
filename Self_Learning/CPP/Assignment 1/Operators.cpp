#include<iostream>
using namespace std;
/* Q. Implement Operators (Logical, Unary, Ternary, )*/

int main() {
    bool a=true, b=false;
    cout<<"Logical Operators:\n";
    cout<<"Logical AND a&&b ="<<(a&&b)<<endl;
    cout<<"Logical OR a||b ="<<(a||b)<<endl;
    cout<<"Logical NOT !x ="<<(a&&b)<<endl;
    
    cout<<"Unary Operators:\n\n";
    int num;
    cout<<"Enter Number:\t";
    cin>>num;
    cout<<"Unary Minus: "<<-num<<endl;
    cout<<"Unary Plus: "<<+num<<endl;
    cout<<"Pre increment: "<<++num<<endl;
    cout<<"Post increment: "<<num++<<endl;
    cout<<"Value After Post Increment: "<<num<<endl;
    cout<<"Pre decrement: "<<--num<<endl;
    cout<<"Post increment: "<<num--<<endl;

    cout<<"Ternary Operators:\n";
    int x, y;
    cout<<"Enter Value for X and Y: ";
    cin>>x>>y;
    int max = (x>y) ? x : y;
    cout<<"Maximum = "<<max<<endl;
    return 0;
}