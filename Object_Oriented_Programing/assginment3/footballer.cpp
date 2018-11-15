#include <iostream>
#include <string>
#include "footballer.h"

using namespace std;

footballer::footballer(string profession, int age) : person(profession, age)
{
    person::setProfession(profession);
    person::setAge(age);
}

void footballer::playFootball()
{
    cout << "I can play Football." << endl;
}

