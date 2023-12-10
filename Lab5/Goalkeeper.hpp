#ifndef _GOALKEEPER_
#define _GOALKEEPER_

#include "Player.hpp"

class Goalkeeper : public Player {
private:
    int saves;
    int goalsAgainst;
    int NoMatches;

public:
    Goalkeeper(bool gender, std::string name, int age, Country* nationality)
        : Player(gender, name, age, nationality), saves(0), goalsAgainst(0) {}

    void updateStats(Match * m) override;
    void printStats() override;
    int getSaves() const { return saves; }
    int getGoalsAgainst() const { return goalsAgainst; }
    int getNoMatches() const { return NoMatches; }

};

#endif
