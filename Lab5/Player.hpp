// Player.hpp
#ifndef PLAYER_HPP
#define PLAYER_HPP

#include "Country.hpp"
class Match; // Declaración directa de Match

class Player {
public:
    // Constructor
    Player(bool gender, std::string name, int age, Country nationality)
        : gender(gender), name(name), age(age), nationality(nationality), matchesPlayed(0), goals(0) {}

    // Getters for player attributes
    bool getGender() { return gender; }
    std::string getName() { return name; }
    int getAge() { return age; }
    std::string getNationality() { return nationality.getName(); }

    // Getters for player statistics
    int getMatchesPlayed() { return matchesPlayed; }
    int getGoals() { return goals; }

    // Other methods
    void marcarGol() { goals++; }
    virtual void updateStats(Match m) = 0; // Método abstracto
    bool equals(Player* o) { return name == o->getName(); }

protected:
    bool gender;
    std::string name;
    int age;
    Country nationality;
    int matchesPlayed;
    int goals;
};

#endif // PLAYER_HPP

