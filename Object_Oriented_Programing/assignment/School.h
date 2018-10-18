#ifndef SCHOOL_H
#define SCHOOL_H

#include <string>
#include <iostream>
#include "Building.h"

using namespace std;

class School: public Building
{
	private:
		int classrooms;

	public:
		School(string, int, int, double, int);
		//parameters: name, squareFootage, stories, assessmentValue, classrooms
		void setClassrooms(int);
		int getClassrooms();
		void print();
};

#endif
