#include "Country.hpp"
#include "Player.hpp"
#include "Outfielder.hpp"
#include "Team.hpp"
#include "Match.hpp"
#include <iostream>

int main() {
    // Nacionalidades
    Country espanya("Espanya");
    Country argentina("Argentina");
    Country portugal("Portugal");
    Country brasil("Brasil");
    Country francia("Francia");
    Country polonia("Polonia");
    Country estadosUnidos("Estados Unidos");
    Country australia("Australia");
    Country dinamarca("Dinamarca");

    // Jugadores masculinos 
    Outfielder jugador1(false, "Messi", 34, argentina);
    Outfielder jugador2(false, "Ronaldo", 36, portugal);
    Outfielder jugador3(false, "Neymar", 29, brasil);
    Outfielder jugador4(false, "Mbappé", 22, francia);
    Outfielder jugador5(false, "Lewandowski", 33, polonia);

    // Jugadoras femeninas 
    Outfielder jugadora1(true, "Marta", 35, brasil);
    Outfielder jugadora2(true, "Alex Morgan", 32, estadosUnidos);
    Outfielder jugadora3(true, "Carli Lloyd", 39, estadosUnidos);
    Outfielder jugadora4(true, "Sam Kerr", 28, australia);
    Outfielder jugadora5(true, "Pernille Harder", 29, dinamarca);
  
    //Agregar equipos
    Team t1("FC Barcelona", &espanya, Team::Gender::MALE);
    Team t2("C.D.Tacón", &espanya, Team::Gender::FEMALE);
    Team t3("C.F.Igualtat", &brasil, Team::Gender::MIXED);

    // Agregar jugadores a los equipos
    t1.addPlayer(&jugador1);
    t1.addPlayer(&jugador2);   
    t1.addPlayer(&jugador5);   

    t2.addPlayer(&jugadora1); 
    t2.addPlayer(&jugadora2);
    t2.addPlayer(&jugadora4);

    t3.addPlayer(&jugador3);
    t3.addPlayer(&jugadora3);
    t3.addPlayer(&jugador4);

    // Crear un partido entre los dos equipos
    Match m(&t1, &t2);

    // Simular el partido y imprimir el resultado
    m.simulateMatch();
    m.printMatch();

    // Actualizar las estadísticas de cada jugador como resultado de jugar el partido
    jugador1.updateStats(m);
    jugador2.updateStats(m);
    jugadora1.updateStats(m);

    // Imprimir las estadísticas de cada jugador
    jugador1.printStats();

    return 0;
}
