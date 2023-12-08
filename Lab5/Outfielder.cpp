// Outfielder.cpp
#include "Outfielder.hpp"
#include <random>

void Outfielder::updateStats(Match m) {
    matchesPlayed++;
    std::random_device rd;
    std::mt19937 gen(rd());
    std::uniform_int_distribution<> dis1(0, 6), dis2(0, 19), dis3(0, 49), dis4(0, 1);
    shots += dis1(gen);
    tackles += dis2(gen);
    passes += dis3(gen);
    assists += dis4(gen);
}

void Outfielder::printStats() {
    std::cout << "\nInformación de " << getName() << ":\n";
    std::cout << "Partidos jugados: " << getMatchesPlayed() << "\n";
    std::cout << "Goles: " << getGoals() << "\n";
    std::cout << "Pases: " << getPasses() << "\n";
    std::cout << "Asistencias: " << getAssists() << "\n";
    std::cout << "Entradas: " << getTackles() << "\n";
}
