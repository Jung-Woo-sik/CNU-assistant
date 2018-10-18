#include "Cookie.h"
#include <string>
#include <iostream>

using namespace std;

Cookie::Cookie(int num, double price, string dessertName)
	: dessertItem(dessertName)
{
	dessertItem::setName(dessertName);
	setNumberOfCookies(num);
	setPricePerDozen(price);
}//end constructor

void Cookie::setNumberOfCookies(int num)
{
	numberOfCookies = num;
}//end function setNumberOfCookies

double Cookie::getNumberOfCookies()
{
	return numberOfCookies;
}//end function getNumberOfCookies

void Cookie::setPricePerDozen(double price)
{
	pricePerDozen = price;
}//end function setPricePerDozen

double Cookie::getPricePerDozen()
{
	return pricePerDozen;
}//end function getPricePerDozen

void Cookie::print()
{
	dessertItem::print();
	cout << numberOfCookies << " cookies @" << pricePerDozen << " per dozen" << endl;
}//end function print

double Cookie::getCost()
{
	double dozen = numberOfCookies / 12;
	return dozen * pricePerDozen;
}//end function getCost
