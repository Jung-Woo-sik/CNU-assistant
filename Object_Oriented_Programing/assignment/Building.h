#ifndef BUILDING_H
#define BUILDING_H

#include <string>
#include <iostream>

using namespace std;

class Building
{
	private:
		int squareFootage;
		int stories;
		double assessmentValue;
		string name;

	public:
		Building(string name, int squareFootage, int stories, double assessmentValue);
		void setSquareFootage(int);
		void setStories(int);
		void setAssessmentValue(double);
		void setName(string);
		int getSquareFootage();
		int getStories();
		double getAssessmentValue();
		string getName();
		double calculateRealEstateTaxes();
		void print();
};

#endif
