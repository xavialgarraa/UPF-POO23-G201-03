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
        Country senegal = new Country("Senagal");
        Country peru = new Country("Perú");
        Country ghana = new Country("Ghana");

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

        //Betis
        Player BET1 = new Player(false, "Portillo", 29, espanya);
        Player BET2 = new Player(false, "Víctor Ruiz", 32, espanya);
        Player BET3 = new Player(false, "Álex Moreno", 28, espanya);
        Player BET4 = new Player(false, "Marc Bartra", 31, espanya);
        Player BET5 = new Player(false, "Joaquín", 41, espanya);
        Player BET6 = new Player(false, "Sergio León", 32, espanya);
        Player BET7 = new Player(false, "William Carvalho", 29, portugal);
        Player BET8 = new Player(false, "Guardado", 35, mexico);
        Player BET9 = new Player(false, "Aitor Ruibal", 26, espanya);
        Player BET10 = new Player(false, "Isco", 30, espanya);
        Player BET11 = new Player(false, "Juanmi", 28, espanya);

        //Athletic club
        Player ATH1 = new Player(false, "Unai Simón", 25, espanya);
        Player ATH2 = new Player(false, "Yeray", 27, espanya);
        Player ATH3 = new Player(false, "Iñigo Martínez", 31, espanya);
        Player ATH4 = new Player(false, "Ander Capa", 30, espanya);
        Player ATH5 = new Player(false, "Balenziaga", 33, espanya);
        Player ATH6 = new Player(false, "Dani García", 31, espanya);
        Player ATH7 = new Player(false, "Williams", 27, espanya);
        Player ATH8 = new Player(false, "Raúl García", 35, espanya);
        Player ATH9 = new Player(false, "Berenguer", 27, espanya);
        Player ATH10 = new Player(false, "Vencedor", 24, espanya);
        Player ATH11 = new Player(false, "Iñaki Williams", 28, espanya);

        //Girona FC
        Player GIR1 = new Player(false, "Jordi Mboula", 22, espanya);
        Player GIR2 = new Player(false, "Samu Sáiz", 30, espanya);
        Player GIR3 = new Player(false, "Aday", 35, espanya);
        Player GIR4 = new Player(false, "Stuani", 35, uruguay);
        Player GIR5 = new Player(false, "Kebe", 24, senegal);
        Player GIR6 = new Player(false, "Pablo Maffeo", 24, espanya);
        Player GIR7 = new Player(false, "Aleix Garcia", 26, espanya);
        Player GIR8 = new Player(false, "Gumbau", 27, espanya);
        Player GIR9 = new Player(false, "Cristhian Stuani", 33, uruguay);
        Player GIR10 = new Player(false, "Franquesa", 25, espanya);
        Player GIR11 = new Player(false, "Oscar Mingueza", 22, espanya);

        //Celta de Vigo
        Player CEL1 = new Player(false, "Iván Villar", 25, espanya);
        Player CEL2 = new Player(false, "Joseph Aidoo", 26, ghana);
        Player CEL3 = new Player(false, "Néstor Araujo", 30, mexico);
        Player CEL4 = new Player(false, "Fontán", 24, espanya);
        Player CEL5 = new Player(false, "Carlos Domínguez", 26, espanya);
        Player CEL6 = new Player(false, "Renato Tapia", 26, peru);
        Player CEL7 = new Player(false, "Brais Méndez", 25, espanya);
        Player CEL8 = new Player(false, "Santi Mina", 26, espanya);
        Player CEL9 = new Player(false, "Nolito", 35, espanya);
        Player CEL10 = new Player(false, "Augusto Solari", 29, uruguay);
        Player CEL11 = new Player(false, "Denis Suárez", 28, espanya);

        //Rayo Vallecano
        Player RAY1 = new Player(false, "Dimitrievski", 27, ghana);
        Player RAY2 = new Player(false, "Mario Suárez", 35, espanya);
        Player RAY3 = new Player(false, "Advíncula", 31, peru);
        Player RAY4 = new Player(false, "Bebé", 31, portugal);
        Player RAY5 = new Player(false, "Catena", 27, espanya);
        Player RAY6 = new Player(false, "Isi Palazón", 26, espanya);
        Player RAY7 = new Player(false, "Tito", 34, espanya);
        Player RAY8 = new Player(false, "Trejo", 33, espanya);
        Player RAY9 = new Player(false, "Álvaro García", 28, espanya);
        Player RAY10 = new Player(false, "Andrés Martín", 23, espanya);
        Player RAY11 = new Player(false, "Sergio Arribas", 21, espanya);

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
        Team BET = new Team("Betis", espanya, Team.Gender.MASCULINO);
        Team ATH = new Team("Athletic Club", espanya, Team.Gender.MASCULINO);
        Team GIR = new Team("Girona FC", espanya, Team.Gender.MASCULINO);
        Team CEL = new Team("Celta de Vigo", espanya, Team.Gender.MASCULINO);
        Team RAY = new Team("Rayo Vallecano", espanya, Team.Gender.MASCULINO);

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

        BET.addPlayer(BET1);
        BET.addPlayer(BET2);
        BET.addPlayer(BET3);
        BET.addPlayer(BET4);
        BET.addPlayer(BET5);
        BET.addPlayer(BET6);
        BET.addPlayer(BET7);
        BET.addPlayer(BET8);
        BET.addPlayer(BET9);
        BET.addPlayer(BET10);
        BET.addPlayer(BET11);
               
        ATH.addPlayer(ATH1);
        ATH.addPlayer(ATH2);
        ATH.addPlayer(ATH3);
        ATH.addPlayer(ATH4);
        ATH.addPlayer(ATH5);
        ATH.addPlayer(ATH6);
        ATH.addPlayer(ATH7);
        ATH.addPlayer(ATH8);
        ATH.addPlayer(ATH9);
        ATH.addPlayer(ATH10);
        ATH.addPlayer(ATH11);

        GIR.addPlayer(GIR1);
        GIR.addPlayer(GIR2);
        GIR.addPlayer(GIR3);
        GIR.addPlayer(GIR4);
        GIR.addPlayer(GIR5);
        GIR.addPlayer(GIR6);
        GIR.addPlayer(GIR7);
        GIR.addPlayer(GIR8);
        GIR.addPlayer(GIR9);
        GIR.addPlayer(GIR10);
        GIR.addPlayer(GIR11);

        RAY.addPlayer(RAY1);
        RAY.addPlayer(RAY2);
        RAY.addPlayer(RAY3);
        RAY.addPlayer(RAY4);
        RAY.addPlayer(RAY5);
        RAY.addPlayer(RAY6);
        RAY.addPlayer(RAY7);
        RAY.addPlayer(RAY8);
        RAY.addPlayer(RAY9);
        RAY.addPlayer(RAY10);
        RAY.addPlayer(RAY11);

        CEL.addPlayer(CEL1);
        CEL.addPlayer(CEL2);
        CEL.addPlayer(CEL3);
        CEL.addPlayer(CEL4);
        CEL.addPlayer(CEL5);
        CEL.addPlayer(CEL6);
        CEL.addPlayer(CEL7);
        CEL.addPlayer(CEL8);
        CEL.addPlayer(CEL9);
        CEL.addPlayer(CEL10);
        CEL.addPlayer(CEL11);
        


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
        LALIGA.addTeam(BET);
        LALIGA.addTeam(GIR);
        LALIGA.addTeam(CEL);
        LALIGA.addTeam(RAY);
        LALIGA.addTeam(ATH);

        LALIGA.printTeams();



        // Actualizar estadísticas de los jugadores después de un partido
        jugador1.updateStatistics(6, 41, 4, 1, 0); // 2 goles, 3 pases, 1 asistencia, 0 tackles, 2 tiros a puerta
        jugador2.updateStatistics(1, 28, 8, 0, 1); // 1 gol, 4 pases, 0 asistencias, 0 tackles, 0 tiros a puerta
        jugadora1.updateStatistics(9, 72, 0, 0, 0); // 0 goles, 2 pases, 0 asistencias, 0 tackles, 0 tiros a puerta


    }
    

}
