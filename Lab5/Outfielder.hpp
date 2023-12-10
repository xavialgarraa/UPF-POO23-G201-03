#ifndef _OUTFIELDER_
#define _OUTFIELDER_

#include "Player.hpp"
#include "Match.hpp"

class Outfielder : public Player {
private:
    int tackles;
    int passes;
    int shots;
    int assists;
    int goals;
    int NoMatches;

public:
    Outfielder(bool gender, std::string name, int age, Country* nationality)
        : Player(gender, name, age, nationality) {}

    void updateStats(Match * m) override;
    void printStats() override;
    int getTackles() const { return tackles; }
    int getPasses() const { return passes; }
    int getShots() const { return shots; }
    int getAssists() const { return assists; }
    int getNoMatches() const { return NoMatches; }

};

#endif
