// Match.cpp
#include "Match.hpp"
#include <cstdlib> // Para rand()
#include <iostream> // Para std::cout

Match::Match(Team* o, Team* t) {
    teamOne = o;
    teamTwo = t;
    goalOne = 0;
    goalTwo = 0;
}

Team* Match::getTeamOne() {
    return teamOne;
}

Team* Match::getTeamTwo() {
    return teamTwo;
}

int Match::getGoalOne() {
    return goalOne;
}

int Match::getGoalTwo() {
    return goalTwo;
}

std::list<Player*>& Match::getScorersOne() {
    return scorersOne;
}

std::list<Player*>& Match::getScorersTwo() {
    return scorersTwo;
}

void Match::simulateScorers(Team* t, std::list<Player*>& l, int g) {
    for (int i = 0; i < g; ++i) {
        int ix = rand() % t->getPlayers().size();
        std::list<Player*>::iterator it = t->getPlayers().begin();
        std::advance(it, ix);
        l.push_back(*it);
    }
}

void Match::simulateMatch() {
    goalOne = rand() % 6;
    goalTwo = rand() % 6;
    simulateScorers(teamOne, scorersOne, goalOne);
    simulateScorers(teamTwo, scorersTwo, goalTwo);
}

void Match::printMatch() {
    std::cout << teamOne->getName() + "-" + teamTwo->getName() + ": ";
    std::cout << goalOne << "-" << goalTwo << "\n";
}

