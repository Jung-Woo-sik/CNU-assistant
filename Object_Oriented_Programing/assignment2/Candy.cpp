#include "Candy.h"
#include <string>
#include <iostream>

using namespace std;

Candy::Candy(double weight, double price, string dessertName)
	: dessertItem(dessertName)
{
	dessertItem::setName(dessertName);
	setWeight(weight);
	setPrice(price);
}//end constructor

void Candy::setWeight(double weight)
{
	candyWeight = weight;
}//end function setWeight

double Candy::getWeight()
{
	return candyWeight;
}//end function getWeight

void Candy::setPrice(double price)
{
	pricePerPound = price;
}//end function setPrice

double Candy::getPrice()
{
	return pricePerPound;
}//end function getPrice

void Candy::print()
{
	dessertItem::print();
	cout << getWeight() << " pounds @" << getPrice() << " per pound" << endl;
}//end function print

double Candy::getCost()
{
	return candyWeight * pricePerPound;
}
