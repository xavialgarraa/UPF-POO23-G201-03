// Goalkeeper.cpp
#include "Goalkeeper.hpp"
#include <random>

void Goalkeeper::updateStats(Match m) {
    matchesPlayed++;
    std::random_device rd;
    std::mt19937 gen(rd());
    std::uniform_int_distribution<> dis(0, 6);
    saves += dis(gen);
    for (Player* player : m.getTeamTwo()->getPlayers()) {
        if (player->getName() == this->name) {
            goalsAgainst += m.getGoalOne();
        }
    }
    for (Player* player : m.getTeamOne()->getPlayers()) {
        if (player->getName() == this->name) {
            goalsAgainst += m.getGoalTwo();
        }
    }
}

void Goalkeeper::printStats() {
    std::cout << "\nInformación de " << getName() << ":\n";
    std::cout << "Goles: " << getGoals() << "\n";
    std::cout << "Paradas: " << getSaves() << "\n";
    std::cout << "Goles Recibidos: " << getGoalsAgainst() << "\n";
}
