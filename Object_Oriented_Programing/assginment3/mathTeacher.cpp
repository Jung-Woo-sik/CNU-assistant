#include <iostream>
#include <string>
#include "mathTeacher.h"

using namespace std;

mathTeacher::mathTeacher(string profession, int age) : person(profession, age)
{
    person::setProfession(profession);
    person::setAge(age);
}


void mathTeacher::teachMath()
{
    cout << "I can teach Maths." << endl;
}

