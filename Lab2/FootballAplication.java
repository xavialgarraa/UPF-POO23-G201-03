public class FootballAplication {
    public static void footballAplication(String[] args) {
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
        Country holanda = new Country("Holanda");
        Country alemania = new Country("Alemania");
        Country uruguay = new Country("Uruguay");
        Country marruecos = new Country("Marruecos");
        Country belgica = new Country("Belgica");
        Country croacia = new Country("Croacia");
        Country eslovenia = new Country("Eslovenia");
        Country mexico = new Country("Mexico");
        Country suecia = new Country("Suecia");
        Country inglaterra = new Country("Inglaterra");
        Country corea = new Country("Corea");
        Country italia = new Country("Italia");
        Country colombia = new Country("Colombia");
        Country nigeria = new Country("Nigeria");

        // Jugadores masculinos 
        Player jugador1 = new Player(false, "Messi", 34, argentina);
        Player jugador2 = new Player(false, "Ronaldo", 36, portugal);
        Player jugador3 = new Player(false, "Neymar", 29, brasil);
        Player jugador4 = new Player(false, "Mbappé", 22, francia);
        Player jugador5 = new Player(false, "Lewandowski", 33, polonia);

        //Jugadores Barça 
        Player FCB1 = new Player(false, "Ter Stegen" , 31, alemania); 
        Player FCB2 = new Player(false, "Piqué", 34, espanya);
        Player FCB3 = new Player(false, "Jordi Alba", 32, espanya);
        Player FCB4 = new Player(false, "Sergio Busquets", 33, espanya);
        Player FCB5 = new Player(false, "Frenkie de Jong", 24, holanda);
        Player FCB6 = new Player(false, "Sergi Roberto", 29, espanya);
        Player FCB7 = new Player(false, "Ansu Fati", 18, espanya);
        Player FCB8 = new Player(false, "Lionel Messi", 34, argentina);
        Player FCB9 = new Player(false, "Ousmane Dembélé", 24, francia);
        Player FCB10 = new Player(false, "Ronald Araújo", 22, uruguay);
        Player FCB11 = new Player(false, "Pedri", 18, espanya);

        //Jugadores Real Madrid
        Player RM1 = new Player(false, "Courtois", 29, belgica);
        Player RM2 = new Player(false, "Carvajal", 30, espanya);
        Player RM3 = new Player(false, "Sergio Ramos", 35, espanya);
        Player RM4 = new Player(false, "Varane", 28, francia);
        Player RM5 = new Player(false, "Marcelo", 33, brasil);
        Player RM6 = new Player(false, "Casemiro", 29, brasil);
        Player RM7 = new Player(false, "Kroos", 31, alemania);
        Player RM8 = new Player(false, "Modric", 35, croacia);
        Player RM9 = new Player(false, "Vinicius Jr.", 21, brasil);
        Player RM10 = new Player(false, "Benzema", 33, francia);
        Player RM11 = new Player(false, "Asensio", 25, espanya);

        //Jugadores Atlético de Madrid
        Player ATM1 = new Player(false, "Oblak", 28, eslovenia);
        Player ATM2 = new Player(false, "Trippier", 31, inglaterra);
        Player ATM3 = new Player(false, "Giménez", 26, uruguay);
        Player ATM4 = new Player(false, "Lodi", 23, brasil);
        Player ATM5 = new Player(false, "Koke", 29, espanya);
        Player ATM6 = new Player(false, "Herrera", 31, mexico);
        Player ATM7 = new Player(false, "Llorente", 26, espanya);
        Player ATM8 = new Player(false, "Carrasco", 28, belgica);
        Player ATM9 = new Player(false, "Suárez", 34, uruguay);
        Player ATM10 = new Player(false, "João Félix", 21, portugal);
        Player ATM11 = new Player(false, "Correa", 26, argentina);

        //Jugadores Real Sociedad (RS)
        Player RS1 = new Player(false, "Remiro", 24, espanya);
        Player RS2 = new Player(false, "Silva", 35, espanya);
        Player RS3 = new Player(false, "Merino", 25, espanya);
        Player RS4 = new Player(false, "Isak", 21, suecia);
        Player RS5 = new Player(false, "Portu", 29, espanya);
        Player RS6 = new Player(false, "Elustondo", 26, espanya);
        Player RS7 = new Player(false, "Monreal", 35, espanya);
        Player RS8 = new Player(false, "Guevara", 24, espanya);
        Player RS9 = new Player(false, "Oyarzabal", 24, espanya);
        Player RS10 = new Player(false, "Le Normand", 24, francia);
        Player RS11 = new Player(false, "Zubeldia", 23, espanya);

        //Jugadores Sevilla (SEV)
        Player SEV1 = new Player(false, "Navas", 35, espanya);
        Player SEV2 = new Player(false, "Bounou", 29, marruecos);
        Player SEV3 = new Player(false, "Carlos", 28, brasil);
        Player SEV4 = new Player(false, "Koundé", 22, francia);
        Player SEV5 = new Player(false, "Acuña", 29, argentina);
        Player SEV6 = new Player(false, "Jordán", 26, espanya);
        Player SEV7 = new Player(false, "Fernando", 33, brasil);
        Player SEV8 = new Player(false, "Suso", 27, espanya);
        Player SEV9 = new Player(false, "Papu Gómez", 33, argentina);
        Player SEV10 = new Player(false, "Ocampos", 26, argentina);
        Player SEV11 = new Player(false, "En-Nesyri", 24, marruecos);

        //Jugadores Villarreal (VIL)
        Player VIL1 = new Player(false, "Asenjo", 31, espanya);
        Player VIL2 = new Player(false, "Mario Gaspar", 30, espanya);
        Player VIL3 = new Player(false, "Albiol", 35, espanya);
        Player VIL4 = new Player(false, "Pau Torres", 23, espanya);
        Player VIL5 = new Player(false, "Alberto Moreno", 28, espanya);
        Player VIL6 = new Player(false, "Iborra", 32, espanya);
        Player VIL7 = new Player(false, "Trigueros", 28, espanya);
        Player VIL8 = new Player(false, "Moïse Kean", 20, italia);
        Player VIL9 = new Player(false, "Gerard Moreno", 28, espanya);
        Player VIL10 = new Player(false, "Chukwueze", 21, nigeria);
        Player VIL11 = new Player(false, "Bacca", 34, colombia);

        //Jugadores Valencia (VAL)
        Player VAL1 = new Player(false, "Cillessen", 31, holanda);
        Player VAL2 = new Player(false, "Piccini", 28, italia);
        Player VAL3 = new Player(false, "Garay", 33, argentina);
        Player VAL4 = new Player(false, "Diakhaby", 24, francia);
        Player VAL5 = new Player(false, "Gayà", 25, espanya);
        Player VAL6 = new Player(false, "Kondogbia", 27, francia);
        Player VAL7 = new Player(false, "Solá", 29, espanya);
        Player VAL8 = new Player(false, "Carlos Soler", 23, espanya);
        Player VAL9 = new Player(false, "Maxi Gómez", 24, uruguay);
        Player VAL10 = new Player(false, "Kang In-lee", 19, corea);
        Player VAL11 = new Player(false, "Gameiro", 33, francia);

        


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
        
        //Equipos liga española
        Team FCB = new Team("FC Barcelona", espanya, Team.Gender.MASCULINO);
        Team ATM = new Team("Atlético de Madrid", espanya, Team.Gender.MASCULINO);
        Team RS = new Team("Real Sociedad", espanya, Team.Gender.MASCULINO);
        Team SEV = new Team("Sevilla", espanya, Team.Gender.MASCULINO);
        Team VIL = new Team("Villarreal", espanya, Team.Gender.MASCULINO);
        Team VAL = new Team("Valencia", espanya, Team.Gender.MASCULINO);
        Team RM = new Team("Real Madrid", espanya, Team.Gender.MASCULINO);

        // Agregar jugadores a los equipos
        FCB.addPlayer(FCB1);
        FCB.addPlayer(FCB2);
        FCB.addPlayer(FCB3);
        FCB.addPlayer(FCB4);
        FCB.addPlayer(FCB5);
        FCB.addPlayer(FCB6);
        FCB.addPlayer(FCB7);
        FCB.addPlayer(FCB8);
        FCB.addPlayer(FCB9);
        FCB.addPlayer(FCB10);
        FCB.addPlayer(FCB11);

        RM.addPlayer(RM1);
        RM.addPlayer(RM2);
        RM.addPlayer(RM3);
        RM.addPlayer(RM4);
        RM.addPlayer(RM5);
        RM.addPlayer(RM6);
        RM.addPlayer(RM7);
        RM.addPlayer(RM8);
        RM.addPlayer(RM9);
        RM.addPlayer(RM10);
        RM.addPlayer(RM11);

        ATM.addPlayer(ATM1);
        ATM.addPlayer(ATM2);
        ATM.addPlayer(ATM3);
        ATM.addPlayer(ATM4);
        ATM.addPlayer(ATM5);
        ATM.addPlayer(ATM6);
        ATM.addPlayer(ATM7);
        ATM.addPlayer(ATM8);
        ATM.addPlayer(ATM9);
        ATM.addPlayer(ATM10);
        ATM.addPlayer(ATM11);

        RS.addPlayer(RS1);
        RS.addPlayer(RS2);
        RS.addPlayer(RS3);
        RS.addPlayer(RS4);
        RS.addPlayer(RS5);
        RS.addPlayer(RS6);
        RS.addPlayer(RS7);
        RS.addPlayer(RS8);
        RS.addPlayer(RS9);
        RS.addPlayer(RS10);
        RS.addPlayer(RS11);

        SEV.addPlayer(SEV1);
        SEV.addPlayer(SEV2);
        SEV.addPlayer(SEV3);
        SEV.addPlayer(SEV4);
        SEV.addPlayer(SEV5);
        SEV.addPlayer(SEV6);
        SEV.addPlayer(SEV7);
        SEV.addPlayer(SEV8);
        SEV.addPlayer(SEV9);
        SEV.addPlayer(SEV10);
        SEV.addPlayer(SEV11);

        VIL.addPlayer(VIL1);
        VIL.addPlayer(VIL2);
        VIL.addPlayer(VIL3);
        VIL.addPlayer(VIL4);
        VIL.addPlayer(VIL5);
        VIL.addPlayer(VIL6);
        VIL.addPlayer(VIL7);
        VIL.addPlayer(VIL8);
        VIL.addPlayer(VIL9);
        VIL.addPlayer(VIL10);
        VIL.addPlayer(VIL11);

        VAL.addPlayer(VAL1);
        VAL.addPlayer(VAL2);
        VAL.addPlayer(VAL3);
        VAL.addPlayer(VAL4);
        VAL.addPlayer(VAL5);
        VAL.addPlayer(VAL6);
        VAL.addPlayer(VAL7);
        VAL.addPlayer(VAL8);
        VAL.addPlayer(VAL9);
        VAL.addPlayer(VAL10);
        VAL.addPlayer(VAL11);

        //Crear liga
        League LALIGA = new League("LA LIGA EA SPORTS", espanya, League.L_Gender.MASCULINO);

        //Añadir equipos a la liga
        LALIGA.addTeam(FCB);
        LALIGA.addTeam(RM);
        LALIGA.addTeam(ATM);
        LALIGA.addTeam(VAL);
        LALIGA.addTeam(VIL);
        LALIGA.addTeam(SEV);
        LALIGA.addTeam(RS);


        // Actualizar estadísticas de los equipos después de un partido
        FCB.updateStatistics(3, 1); // Ganó el partido
        t2.updateStatistics(2, 2); // Empató el partido

        // Actualizar estadísticas de los jugadores después de un partido
        jugador1.updateStatistics(6, 41, 4, 1, 0); // 2 goles, 3 pases, 1 asistencia, 0 tackles, 2 tiros a puerta
        jugador2.updateStatistics(1, 28, 8, 0, 1); // 1 gol, 4 pases, 0 asistencias, 0 tackles, 0 tiros a puerta
        jugadora1.updateStatistics(9, 72, 0, 0, 0); // 0 goles, 2 pases, 0 asistencias, 0 tackles, 0 tiros a puerta

        // Mostrar información de los equipos
        FCB.PrintStats();

        t2.PrintStats();

        t3.PrintStats();

        jugador1.PrintStats();
    }
    

}
