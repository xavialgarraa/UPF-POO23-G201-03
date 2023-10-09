public class Main {
    public static void main(String[] args) {
        // Nacionalidades
        Country espanya = new Country("Espanya");
        Country argentina = new Country("Argentina");
        Country portugal = new Country("Portugal");
        Country brasil = new Country("Brasil");
        Country francia = new Country("Francia");
        Country polonia = new Country("Polonia");
        Country estadosUnidos = new Country("Estados Unidos");
        Country australia = new Country("Australia");
        Country dinamarca = new Country("Dinamarca");

        // Jugadores masculinos 
        Player jugador1 = new Player(false, "Messi", 34, argentina);
        Player jugador2 = new Player(false, "Ronaldo", 36, portugal);
        Player jugador3 = new Player(false, "Neymar", 29, brasil);
        Player jugador4 = new Player(false, "Mbappé", 22, francia);
        Player jugador5 = new Player(false, "Lewandowski", 33, polonia);

        // Jugadoras femeninas 
        Player jugadora1 = new Player(true, "Marta", 35, brasil);
        Player jugadora2 = new Player(true, "Alex Morgan", 32, estadosUnidos);
        Player jugadora3 = new Player(true, "Carli Lloyd", 39, estadosUnidos);
        Player jugadora4 = new Player(true, "Sam Kerr", 28, australia);
        Player jugadora5 = new Player(true, "Pernille Harder", 29, dinamarca);
  
        //Agregar equipos
        Team t1 = new Team("FC Barcelona",espanya , Team.Gender.MASCULINO);
        Team t2 = new Team("C.D.Tacón",espanya , Team.Gender.FEMENINO);
        Team t3 = new Team("C.F.Igualtat",brasil , Team.Gender.MIXTO);

        // Agregar jugadores a los equipos
        t1.addPlayer(jugador1);
        t1.addPlayer(jugador2);   
        t1.addPlayer(jugadora5);    // Esto debería fallar porque player2 es genero femenino
        t1.addPlayer(jugador5);   
       

        t2.addPlayer(jugador3);     //También falla
        t2.addPlayer(jugadora1); 
        t2.addPlayer(jugadora2);
        t2.addPlayer(jugadora4);


        t3.addPlayer(jugador3);
        t3.addPlayer(jugadora3);
        t3.addPlayer(jugador4);

        // Actualizar estadísticas de los equipos después de un partido
        t1.updateStatistics(3, 1); // Ganó el partido
        t2.updateStatistics(2, 2); // Empató el partido

        // Actualizar estadísticas de los jugadores después de un partido
        jugador1.updateStatistics(6, 41, 4, 1, 0); // 2 goles, 3 pases, 1 asistencia, 0 tackles, 2 tiros a puerta
        jugador2.updateStatistics(1, 28, 8, 0, 1); // 1 gol, 4 pases, 0 asistencias, 0 tackles, 0 tiros a puerta
        jugadora1.updateStatistics(9, 72, 0, 0, 0); // 0 goles, 2 pases, 0 asistencias, 0 tackles, 0 tiros a puerta

        // Mostrar información de los equipos
        t1.PrintStats();

        t2.PrintStats();

        t3.PrintStats();

        jugador1.PrintStats();
    }
    

}

