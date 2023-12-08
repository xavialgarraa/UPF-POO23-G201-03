// Outfielder.hpp
#ifndef OUTFIELDER_HPP
#define OUTFIELDER_HPP

#include "Player.hpp"
#include "Match.hpp"

class Outfielder : public Player {
public:
    // Constructor
    Outfielder(bool gender, std::string name, int age, Country nationality)
        : Player(gender, name, age, nationality), tackles(0), passes(0), shots(0), assists(0) {}

    // Other methods
    void updateStats(Match m);
    void printStats();
    void asistir() { assists++; }
    int getTackles() { return tackles; }
    int getPasses() { return passes; }
    int getShots() { return shots; }
    int getAssists() { return assists; }

private:
    int tackles;
    int passes;
    int shots;
    int assists;
};

#endif // OUTFIELDER_HPP
