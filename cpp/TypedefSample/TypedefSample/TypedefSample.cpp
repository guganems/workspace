#include "pch.h"
#include <iostream>
#include <ostream>
#include <vector>
#include <algorithm>
#include "pchar.h"

typedef std::vector<int> WidgetIdVector;

bool ContainsWidgetId (WidgetIdVector idVector, int id) {
	return (std::end(idVector) != std::find(std::begin(idVector), std::end(idVector), id));
}

int _pmain(int, _pchar*[])
{
	WidgetIdVector idVector;

	idVector.push_back(5);
	idVector.push_back(8);

	std::wcout << L"Contains 8: " << (ContainsWidgetId(idVector, 8) ? L"True." : L"False.") << std::endl;

	return 0;
}
