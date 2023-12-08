// Player.cpp
#include "Player.hpp"

Player::Player(bool gender, std::string name, int age, Country nationality)
    : gender(gender), name(name), age(age), nationality(nationality), matchesPlayed(0), goals(0) {}

bool Player::getGender() { return gender; }

std::string Player::getName() { return name; }

int Player::getAge() { return age; }

std::string Player::getNationality() { return nationality.getName(); }

int Player::getMatchesPlayed() { return matchesPlayed; }

int Player::getGoals() { return goals; }

void Player::marcarGol() { goals++; }

bool Player::equals(Player* o) { return name == o->getName(); }
