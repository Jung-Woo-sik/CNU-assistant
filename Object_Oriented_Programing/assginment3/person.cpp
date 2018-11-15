#include <iostream>
#include <string>
#include "person.h"

using namespace std;

person::person(string profession, int age)
{
    person::setProfession(profession);
    person::setAge(age);
}

void person::setProfession(string profession2)
{
    profession = profession2;
}

void person::setAge(int age2)
{
    age = age2;    
}

string person::getProfession()
{
    return profession;    
}

int person::getAge()
{
    return age;
}

void person::display()
{
    cout << "My profession is: " << getProfession() << endl;
    cout << "My age is: " << getAge() << endl;
    person::walk();
    person::talk();
}

void person::walk()
{
    cout << "I can walk." << endl;
}

void person::talk()
{
    cout << "I can talk." << endl;
}

