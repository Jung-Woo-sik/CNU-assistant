#include "ShapePattern.h"

//set up the default pattern as '*' star
ShapePattern::ShapePattern()
{
	pattern = '*';
}

void ShapePattern::set_pattern(char c)
{
	pattern = c;
}

char ShapePattern::get_pattern() const
{
	return pattern;
}
