// Goalkeeper.hpp
#ifndef GOALKEEPER_HPP
#define GOALKEEPER_HPP

#include "Player.hpp"
#include "Match.hpp"

class Goalkeeper : public Player {
public:
    // Constructor
    Goalkeeper(bool gender, std::string name, int age, Country nationality)
        : Player(gender, name, age, nationality), saves(0), goalsAgainst(0) {}

    // Other methods
    void updateStats(Match m);
    void printStats();
    int getSaves() { return saves; }
    int getGoalsAgainst() { return goalsAgainst; }

private:
    int saves;
    int goalsAgainst;
};

#endif // GOALKEEPER_HPP
