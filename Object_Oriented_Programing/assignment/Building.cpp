#include <string>
#include <iostream>
#include <iomanip>
#include "Building.h"

using namespace std;

Building::Building(string name, int squareFootage, int stories, double assessmentValue)
{
	setSquareFootage(squareFootage);
	setStories(stories);
	setAssessmentValue(assessmentValue);
	setName(name);
}
//end constructor

void Building::setSquareFootage(int sf)
{
	squareFootage = sf;
}
//end mutator setSquareFootage

void Building::setStories(int s)
{
	stories = s;
}
//end mutator setStories

void Building::setAssessmentValue(double av)
{
	assessmentValue = av;
}
//end mutator setAssessmentValue

void Building::setName(string n)
{
	name = n;
}
//end mutator setName

int Building::getSquareFootage()
{
	return squareFootage;
}
//end accessor getSquareFootage

int Building::getStories()
{
	return stories;
}
//end accessor getStories

double Building::getAssessmentValue()
{
	return assessmentValue;
}
//end accessor getAssessmentValue

string Building::getName()
{
	return name;
}
//end accessor getName

double Building::calculateRealEstateTaxes()
{
	double taxes = assessmentValue*.03;
	return taxes;
}
//end function calculateRealEstateTaxes

void Building::print()
{
	cout << setw(34) << setfill('-') << "-" << endl;
	cout << "Name: " << getName() << endl;
	cout << "Square Footage: " << getSquareFootage() << endl;
	cout << "Stories: " << getStories() << endl;
	cout << "AssessmentValue: " << getAssessmentValue() << endl;
	cout << "Real Estate Taxes: " << calculateRealEstateTaxes() << endl;
}
