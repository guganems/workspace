# cmake_minimum_required(VERSION <specify CMake version here>)
project(GettingStarted C)

set(CMAKE_C_STANDARD 11)

add_executable(GettingStarted helloWorld/hello.c helloWorld/hello.c)