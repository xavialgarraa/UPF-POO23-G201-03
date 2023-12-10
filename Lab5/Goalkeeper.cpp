#include "Goalkeeper.hpp"
#include "Match.hpp"

void Goalkeeper::updateStats(Match * m) {
    NoMatches++;
    saves += rand() % 7;
    goalsAgainst += (name == m->getTeamOne()->getName()) ? m->getGoalTwo() : m->getGoalOne();
}

void Goalkeeper::printStats() {
    std::cout << "Nombre: " << name << std::endl;
    std::cout << "Edad: " << age << std::endl;
    std::cout << "Paradas: " << saves << std::endl;
    std::cout << "Goles en contra: " << goalsAgainst << std::endl;
    std::cout << "Partidos jugados: " << NoMatches << std::endl;
}

