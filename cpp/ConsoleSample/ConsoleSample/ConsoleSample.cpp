#include "pch.h"
#include <iostream>
#include <ostream>
#include <string>

struct Color {
	float ARGB[4];

	void A(float value) { ARGB[0] = value; }
	float A(void) const { return ARGB[0]; }
	void R(float value) { ARGB[1] = value; }
	float R(void) const { return ARGB[1]; }
};

int main()
{
    std::cout << "Hello World!\n"; 
}
