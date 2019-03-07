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
	void G(float value) { ARGB[2] = value; }
	float G(void) const { return ARGB[2]; }
	void B(float value) { ARGB[3] = value; }
	float B(void) const { return ARGB[3]; }
};

int main()
{
    std::cout << "Hello World!\n"; 
}
