#include "Outfielder.hpp"
#include "Match.hpp"

void Outfielder::updateStats(Match * m) {
    NoMatches++;
    tackles += rand() % 20;
    passes += rand() % 50;
    shots += rand() % 7;
    assists += rand() % 1;
    for (Player* p : m->getScorersOne()){
        if(p->getName() == this->name){
            goals++;
        }
    }
    for (Player* p : m->getScorersTwo()){
        if(p->getName() == this->name){
            goals++;
        }
    }
}

void Outfielder::printStats() {
    std::cout << "Nombre: " << name << std::endl;
    std::cout << "Edad: " << age << std::endl;
    std::cout << "Tackles: " << tackles << std::endl;
    std::cout << "Pases: " << passes << std::endl;
    std::cout << "Tiros: " << shots << std::endl;
    std::cout << "Asistencias: " << assists << std::endl;
    std::cout << "Goles: " << goals << std::endl;
    std::cout << "Partidos jugados: " << NoMatches << std::endl;
}
