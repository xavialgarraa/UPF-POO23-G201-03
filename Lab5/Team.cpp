// Team.cpp
#include "Team.hpp"

Team::Team(std::string n, Country* c, Gender g)
    : name(n), country(c), gender(g) {}

std::string Team::getName() {
    return name;
}

Country* Team::getCountry() {
    return country;
}

Team::Gender Team::getGender() {
    return gender;
}

std::list<Player*>& Team::getPlayers() {
    return players;
}

void Team::addPlayer(Player* p) {
    if ((gender == Gender::MALE && !p->getGender()) ||
        (gender == Gender::FEMALE && p->getGender()) ||
        gender == Gender::MIXED)
        players.push_back(p);
}
