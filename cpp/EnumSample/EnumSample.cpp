#include <iostream>
#include <ostream>
#include <string>
#include "../pchar.h"

enum class Color {
	Red,
	Orange,
	Yellow,
	Blue,
	Indigo,
	Violet
};

enum Flavor : unsigned short int {
	Vanilla,
	Chocolate,
	Strawberry,
	Mint
};

int _pmain(int, _pchar[]) {
	Flavor f = Vanilla;
	f = Mint;
	
	Color c = Color::Orange;
	
	std::wstring flavor;
	std::wstring color;
	
	switch (c) {
		case Color::Red: color = L"Red"; break;
		case Color::Orange: color = L"Orange"; break;
		case Color::Yellow: color = 
	}
}

















