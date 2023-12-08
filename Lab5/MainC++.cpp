#include <iostream>
#include <string>
#include <vector>

int main() {
    // Crear países
    Country country1("Country1");
    Country country2("Country2");

    // Crear jugadores
    Player player1(true, "Player1", 25, country1);
    Player player2(false, "Player2", 28, country1);
    Player player3(true, "Player3", 22, country2);

    // Crear equipos
    Team team1("Team1", country1, Team::Gender::MASCULINO);
    Team team2("Team2", country2, Team::Gender::FEMENINO);

    // Añadir jugadores a los equipos
    team1.addPlayer(player1);
    team1.addPlayer(player2);
    team2.addPlayer(player3);

    // Crear un partido entre los equipos
    Match match(team1, team2);

    // Simular el partido
    match.simulateMatch();

    // Imprimir estadísticas del partido
    match.printMatch();

    // Imprimir estadísticas de los equipos
    team1.PrintStats();
    team2.PrintStats();

    // Imprimir estadísticas de los jugadores
    for (const Player& player : team1.getPlayers()) {
        std::cout << "\nEstadísticas de " << player.getName() << ":\n";
        if (dynamic_cast<Goalkeeper*>(&player) != nullptr) {
            dynamic_cast<Goalkeeper*>(&player)->PrintStats();
        } else {
            dynamic_cast<Outfielder*>(&player)->PrintStats();
        }
    }

    for (const Player& player : team2.getPlayers()) {
        std::cout << "\nEstadísticas de " << player.getName() << ":\n";
        if (dynamic_cast<Goalkeeper*>(&player) != nullptr) {
            dynamic_cast<Goalkeeper*>(&player)->PrintStats();
        } else {
            dynamic_cast<Outfielder*>(&player)->PrintStats();
        }
    }

    return 0;
}
