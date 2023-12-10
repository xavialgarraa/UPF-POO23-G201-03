#include "Country.hpp"
#include "Player.hpp"
#include "Outfielder.hpp"
#include "Team.hpp"
#include "Match.hpp"
#include <iostream>

int main() {
    // Crear algunos países
    Country spain("Spain");
    Country france("France");
    Country germany("Germany");

    // Crear algunos jugadores de campo de diferentes países
    Outfielder player1(false, "Player 1", 25, &spain);
    Outfielder player2(false, "Player 2", 27, &france);
    Outfielder player3(false, "Player 3", 24, &germany);
    Outfielder player4(false, "Player 4", 26, &spain);
    Outfielder player5(false, "Player 5", 23, &france);

    // Crear dos equipos que incluyan algunos jugadores de campo
    Team team1("Team 1", &spain, Team::Gender::MIXED);
    team1.addPlayer(&player1);
    team1.addPlayer(&player2);

    Team team2("Team 2", &france, Team::Gender::MIXED);
    team2.addPlayer(&player3);
    team2.addPlayer(&player4);
    team2.addPlayer(&player5);

    // Crear un partido entre los dos equipos
    Match match(&team1, &team2);

    // Simular el partido y imprimir el resultado
    match.simulateMatch();
    match.printMatch();

    // Actualizar las estadísticas de cada jugador como resultado de jugar el partido
    for (Player* player : team1.getPlayers()) {
        player->updateStats(&match);
    }
    for (Player* player : team2.getPlayers()) {
        player->updateStats(&match);
    }

    // Imprimir las estadísticas de cada jugador
    for (Player* player : team1.getPlayers()) {
        player->printStats();
    }
    for (Player* player : team2.getPlayers()) {
        player->printStats();
    }

    return 0;
}
