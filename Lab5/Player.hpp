#ifndef _PLAYER_
#define _PLAYER_

#include <cstdlib>
#include <iostream>
#include <list>
#include "Match.hpp"
#include "Team.hpp"

class Player {
protected:
    std::string name;
    int age;
    bool female;
    Country * nationality;

public:
    Player(bool g, std::string n, int a, Country * c) {
        female = g;
        name = n;
        age = a;
        nationality = c;
    }

    bool isFemale() {
        return female;
    }

    int getAge() {
        return age;
    }

    std::string getName(){
        return name;
    }

    Country * getNationality() {
        return nationality;
    }

    virtual void updateStats(Match * m) = 0;
    virtual void printStats() = 0;
};





#endif