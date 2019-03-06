#include <iostream>
#include <ostream>
#include <string>
#include "pch.h"
#include "pchar.h"

enum Flavor : unsigned short int {
	Vanilla,
	Chocolate,
	Strawberry,
	Mint
};


enum class Color {
	Red,
	Orange,
	Yellow,
	Blue,
	Indigo,
	Violet
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
		case Color::Yellow: color = L"Yellow"; break;
		case Color::Blue: color = L"Blue"; break;
		case Color::Indigo: color = L"Indigo"; break;
		case Color::Violet: color = L"Violet"; break;
		default: color = L"Unknown"; break;
	}

	switch (f) {
		case Vanilla: flavor = L"Vanilla"; break;
		case Chocolate: flavor = L"Chocolate"; break;
		case Strawberry: flavor = L"Strawberry"; break;
		case Mint: flavor = L"Mint"; break;
		default: break;
	}

	std::wcout << L"Flavor is " << flavor.c_str() << L" (" << f << L"). Color is " << color.c_str() << L"( " << static_cast<int>(c) << L"). " << std::endl << L"The size of flavor is " << sizeof(Flavor) << L"." << std::endl << L"The size of Color is " << sizeof(Color) << L"." << std::endl;

	return 0;
}
