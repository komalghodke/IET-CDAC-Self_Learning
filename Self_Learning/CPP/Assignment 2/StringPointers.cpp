#include <iostream>
using namespace std;

/*
Problem Statement:
Write functions using pointers for:
1. String comparison
2. String concatenation
3. String copy
4. String length
Do not use built-in string functions.
*/

int strCompare(const char* s1, const char* s2) {
    while (*s1 && *s2) {
        if (*s1 != *s2) return *s1 - *s2;
        s1++; s2++;
    }
    return *s1 - *s2;
}

void strConcat(char* dest, const char* src) {
    while (*dest) dest++;
    while (*src) {
        *dest = *src;
        dest++; src++;
    }
    *dest = '\0';
}

void strCopy(char* dest, const char* src) {
    while (*src) {
        *dest = *src;
        dest++; src++;
    }
    *dest = '\0';
}

int strLength(const char* s) {
    int len = 0;
    while (*s) {
        len++;
        s++;
    }
    return len;
}

int main() {
    char str1[50] = "Hello";
    char str2[50] = "World";

    cout << "Compare result: " << strCompare(str1, str2) << endl;
    strConcat(str1, str2);
    cout << "Concatenated: " << str1 << endl;
    strCopy(str2, str1);
    cout << "Copied: " << str2 << endl;
    cout << "Length: " << strLength(str1) << endl;
}