#include <string>
#include <iostream>
//#include "Building.h"
#include "School.h"

using namespace std;

School::School(string name, int squareFootage, int stories, double assessmentValue, int classrooms)
	:Building(name, squareFootage, stories, assessmentValue)
{
	setClassrooms(classrooms);
}
//end constructor

void School::setClassrooms(int c)
{
	classrooms = c;
}
//end mutator setClassrooms

int School::getClassrooms()
{
	return classrooms;
}
//end accessor getClassrooms

void School::print()
{
	Building::print();
	cout << "Classrooms: " << getClassrooms() << endl;
}
