public class FootballAplication3 {
    public static void main(String[] args) {
        // Nacionalidades
        Country espanya = new Country("Espanya");
        Country argentina = new Country("Argentina");
        Country portugal = new Country("Portugal");
        Country brasil = new Country("Brasil");
        Country francia = new Country("Francia");
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

        //Jugadores Barça 
        Goalkeeper FCB1 = new Goalkeeper(false, "Ter Stegen" , 31, alemania); 
        Outfilder FCB2 = new Outfilder(false, "Piqué", 34, espanya);
        Outfilder FCB3 = new Outfilder(false, "Jordi Alba", 32, espanya);
        Outfilder FCB4 = new Outfilder(false, "Sergio Busquets", 33, espanya);
        Outfilder FCB5 = new Outfilder(false, "Frenkie de Jong", 24, holanda);
        Outfilder FCB6 = new Outfilder(false, "Sergi Roberto", 29, espanya);
        Outfilder FCB7 = new Outfilder(false, "Ansu Fati", 18, espanya);
        Outfilder FCB8 = new Outfilder(false, "Lionel Messi", 34, argentina);
        Outfilder FCB9 = new Outfilder(false, "Ousmane Dembélé", 24, francia);
        Outfilder FCB10 = new Outfilder(false, "Ronald Araújo", 22, uruguay);
        Outfilder FCB11 = new Outfilder(false, "Pedri", 18, espanya);


        // Jugadores Real Madrid
        Goalkeeper RM1 = new Goalkeeper(false, "Courtois", 29, belgica);
        Outfilder RM2 = new Outfilder(false, "Carvajal", 30, espanya);
        Outfilder RM3 = new Outfilder(false, "Sergio Ramos", 35, espanya);
        Outfilder RM4 = new Outfilder(false, "Varane", 28, francia);
        Outfilder RM5 = new Outfilder(false, "Marcelo", 33, brasil);
        Outfilder RM6 = new Outfilder(false, "Casemiro", 29, brasil);
        Outfilder RM7 = new Outfilder(false, "Kroos", 31, alemania);
        Outfilder RM8 = new Outfilder(false, "Modric", 35, croacia);
        Outfilder RM9 = new Outfilder(false, "Vinicius Jr.", 21, brasil);
        Outfilder RM10 = new Outfilder(false, "Benzema", 33, francia);
        Outfilder RM11 = new Outfilder(false, "Asensio", 25, espanya);

        // Jugadores Atlético de Madrid
        Goalkeeper ATM1 = new Goalkeeper(false, "Oblak", 28, eslovenia);
        Outfilder ATM2 = new Outfilder(false, "Trippier", 31, inglaterra);
        Outfilder ATM3 = new Outfilder(false, "Giménez", 26, uruguay);
        Outfilder ATM4 = new Outfilder(false, "Lodi", 23, brasil);
        Outfilder ATM5 = new Outfilder(false, "Koke", 29, espanya);
        Outfilder ATM6 = new Outfilder(false, "Herrera", 31, mexico);
        Outfilder ATM7 = new Outfilder(false, "Llorente", 26, espanya);
        Outfilder ATM8 = new Outfilder(false, "Carrasco", 28, belgica);
        Outfilder ATM9 = new Outfilder(false, "Suárez", 34, uruguay);
        Outfilder ATM10 = new Outfilder(false, "João Félix", 21, portugal);
        Outfilder ATM11 = new Outfilder(false, "Correa", 26, argentina);

        // Jugadores Real Sociedad (RS)
        Goalkeeper RS1 = new Goalkeeper(false, "Remiro", 24, espanya);
        Outfilder RS2 = new Outfilder(false, "Silva", 35, espanya);
        Outfilder RS3 = new Outfilder(false, "Merino", 25, espanya);
        Outfilder RS4 = new Outfilder(false, "Isak", 21, suecia);
        Outfilder RS5 = new Outfilder(false, "Portu", 29, espanya);
        Outfilder RS6 = new Outfilder(false, "Elustondo", 26, espanya);
        Outfilder RS7 = new Outfilder(false, "Monreal", 35, espanya);
        Outfilder RS8 = new Outfilder(false, "Guevara", 24, espanya);
        Outfilder RS9 = new Outfilder(false, "Oyarzabal", 24, espanya);
        Outfilder RS10 = new Outfilder(false, "Le Normand", 24, francia);
        Outfilder RS11 = new Outfilder(false, "Zubeldia", 23, espanya);

        // Jugadores Sevilla (SEV)
        Outfilder SEV1 = new Outfilder(false, "Navas", 35, espanya);
        Goalkeeper SEV2 = new Goalkeeper(false, "Bounou", 29, marruecos);
        Outfilder SEV3 = new Outfilder(false, "Carlos", 28, brasil);
        Outfilder SEV4 = new Outfilder(false, "Koundé", 22, francia);
        Outfilder SEV5 = new Outfilder(false, "Acuña", 29, argentina);
        Outfilder SEV6 = new Outfilder(false, "Jordán", 26, espanya);
        Outfilder SEV7 = new Outfilder(false, "Fernando", 33, brasil);
        Outfilder SEV8 = new Outfilder(false, "Suso", 27, espanya);
        Outfilder SEV9 = new Outfilder(false, "Papu Gómez", 33, argentina);
        Outfilder SEV10 = new Outfilder(false, "Ocampos", 26, argentina);
        Outfilder SEV11 = new Outfilder(false, "En-Nesyri", 24, marruecos);

        // Jugadores Villarreal (VIL)
        Goalkeeper VIL1 = new Goalkeeper(false, "Asenjo", 31, espanya);
        Outfilder VIL2 = new Outfilder(false, "Mario Gaspar", 30, espanya);
        Outfilder VIL3 = new Outfilder(false, "Albiol", 35, espanya);
        Outfilder VIL4 = new Outfilder(false, "Pau Torres", 23, espanya);
        Outfilder VIL5 = new Outfilder(false, "Alberto Moreno", 28, espanya);
        Outfilder VIL6 = new Outfilder(false, "Iborra", 32, espanya);
        Outfilder VIL7 = new Outfilder(false, "Trigueros", 28, espanya);
        Outfilder VIL8 = new Outfilder(false, "Moïse Kean", 20, italia);
        Outfilder VIL9 = new Outfilder(false, "Gerard Moreno", 28, espanya);
        Outfilder VIL10 = new Outfilder(false, "Chukwueze", 21, nigeria);
        Outfilder VIL11 = new Outfilder(false, "Bacca", 34, colombia);

        // Jugadores Valencia (VAL)
        Goalkeeper VAL1 = new Goalkeeper(false, "Cillessen", 31, holanda);
        Outfilder VAL2 = new Outfilder(false, "Piccini", 28, italia);
        Outfilder VAL3 = new Outfilder(false, "Garay", 33, argentina);
        Outfilder VAL4 = new Outfilder(false, "Diakhaby", 24, francia);
        Outfilder VAL5 = new Outfilder(false, "Gayà", 25, espanya);
        Outfilder VAL6 = new Outfilder(false, "Kondogbia", 27, francia);
        Outfilder VAL7 = new Outfilder(false, "Solá", 29, espanya);
        Outfilder VAL8 = new Outfilder(false, "Carlos Soler", 23, espanya);
        Outfilder VAL9 = new Outfilder(false, "Maxi Gómez", 24, uruguay);
        Outfilder VAL10 = new Outfilder(false, "Kang In-lee", 19, corea);
        Outfilder VAL11 = new Outfilder(false, "Gameiro", 33, francia);

        // Betis
        Goalkeeper BET1 = new Goalkeeper(false, "Cluadio Barvo", 29, espanya);
        Outfilder BET2 = new Outfilder(false, "Víctor Ruiz", 32, espanya);
        Outfilder BET3 = new Outfilder(false, "Álex Moreno", 28, espanya);
        Outfilder BET4 = new Outfilder(false, "Marc Bartra", 31, espanya);
        Outfilder BET5 = new Outfilder(false, "Joaquín", 41, espanya);
        Outfilder BET6 = new Outfilder(false, "Sergio León", 32, espanya);
        Outfilder BET7 = new Outfilder(false, "William Carvalho", 29, portugal);
        Outfilder BET8 = new Outfilder(false, "Guardado", 35, mexico);
        Outfilder BET9 = new Outfilder(false, "Aitor Ruibal", 26, espanya);
        Outfilder BET10 = new Outfilder(false, "Isco", 30, espanya);
        Outfilder BET11 = new Outfilder(false, "Juanmi", 28, espanya);

        // Athletic club
        Goalkeeper ATH1 = new Goalkeeper(false, "Unai Simón", 25, espanya);
        Outfilder ATH2 = new Outfilder(false, "Yeray", 27, espanya);
        Outfilder ATH3 = new Outfilder(false, "Iñigo Martínez", 31, espanya);
        Outfilder ATH4 = new Outfilder(false, "Ander Capa", 30, espanya);
        Outfilder ATH5 = new Outfilder(false, "Balenziaga", 33, espanya);
        Outfilder ATH6 = new Outfilder(false, "Dani García", 31, espanya);
        Outfilder ATH7 = new Outfilder(false, "Williams", 27, espanya);
        Outfilder ATH8 = new Outfilder(false, "Raúl García", 35, espanya);
        Outfilder ATH9 = new Outfilder(false, "Berenguer", 27, espanya);
        Outfilder ATH10 = new Outfilder(false, "Vencedor", 24, espanya);
        Outfilder ATH11 = new Outfilder(false, "Iñaki Williams", 28, espanya);

        // Girona FC
        Goalkeeper GIR1 = new Goalkeeper(false, "Gazzaniga", 22, argentina);
        Outfilder GIR2 = new Outfilder(false, "Samu Sáiz", 30, espanya);
        Outfilder GIR3 = new Outfilder(false, "Aday", 35, espanya);
        Outfilder GIR4 = new Outfilder(false, "Stuani", 35, uruguay);
        Outfilder GIR5 = new Outfilder(false, "Kebe", 24, senegal);
        Outfilder GIR6 = new Outfilder(false, "Pablo Maffeo", 24, espanya);
        Outfilder GIR7 = new Outfilder(false, "Aleix Garcia", 26, espanya);
        Outfilder GIR8 = new Outfilder(false, "Gumbau", 27, espanya);
        Outfilder GIR9 = new Outfilder(false, "Cristhian Stuani", 33, uruguay);
        Outfilder GIR10 = new Outfilder(false, "Franquesa", 25, espanya);
        Outfilder GIR11 = new Outfilder(false, "Oscar Mingueza", 22, espanya);

        // Celta de Vigo
        Goalkeeper CEL1 = new Goalkeeper(false, "Iván Villar", 25, espanya);
        Outfilder CEL2 = new Outfilder(false, "Joseph Aidoo", 26, ghana);
        Outfilder CEL3 = new Outfilder(false, "Néstor Araujo", 30, mexico);
        Outfilder CEL4 = new Outfilder(false, "Fontán", 24, espanya);
        Outfilder CEL5 = new Outfilder(false, "Carlos Domínguez", 26, espanya);
        Outfilder CEL6 = new Outfilder(false, "Renato Tapia", 26, peru);
        Outfilder CEL7 = new Outfilder(false, "Brais Méndez", 25, espanya);
        Outfilder CEL8 = new Outfilder(false, "Santi Mina", 26, espanya);
        Outfilder CEL9 = new Outfilder(false, "Nolito", 35, espanya);
        Outfilder CEL10 = new Outfilder(false, "Augusto Solari", 29, uruguay);
        Outfilder CEL11 = new Outfilder(false, "Denis Suárez", 28, espanya);

        // Rayo Vallecano
        Goalkeeper RAY1 = new Goalkeeper(false, "Dimitrievski", 27, ghana);
        Outfilder RAY2 = new Outfilder(false, "Mario Suárez", 35, espanya);
        Outfilder RAY3 = new Outfilder(false, "Advíncula", 31, peru);
        Outfilder RAY4 = new Outfilder(false, "Bebé", 31, portugal);
        Outfilder RAY5 = new Outfilder(false, "Catena", 27, espanya);
        Outfilder RAY6 = new Outfilder(false, "Isi Palazón", 26, espanya);
        Outfilder RAY7 = new Outfilder(false, "Tito", 34, espanya);
        Outfilder RAY8 = new Outfilder(false, "Trejo", 33, espanya);
        Outfilder RAY9 = new Outfilder(false, "Álvaro García", 28, espanya);
        Outfilder RAY10 = new Outfilder(false, "Andrés Martín", 23, espanya);
        Outfilder RAY11 = new Outfilder(false, "Sergio Arribas", 21, espanya);

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

        //Selecciones
        NationalTeam ARG = new NationalTeam("Argentina", argentina, Team.Gender.MASCULINO);
        NationalTeam ESP = new NationalTeam("Espanya", espanya, Team.Gender.MASCULINO);
        NationalTeam FRA = new NationalTeam("Francia", francia, Team.Gender.MASCULINO);

        ESP.addPlayer(RAY11);
        ESP.addPlayer(RAY3);

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
        League LALIGA = new League("LA LIGA EA SPORTS", espanya, League.L_Gender.MASCULINO, true);
        

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

        Cup COPA_DEL_REY = new Cup("Copa del rey", espanya, League.L_Gender.MASCULINO, true);
        GroupPlay CHAMPIONS = new GroupPlay("Champions League", espanya, League.L_Gender.MASCULINO, true);

        COPA_DEL_REY.addTeam(BET);
        COPA_DEL_REY.addTeam(GIR);
        COPA_DEL_REY.addTeam(CEL);
        COPA_DEL_REY.addTeam(RAY);
        COPA_DEL_REY.addTeam(RM);
        COPA_DEL_REY.addTeam(FCB);

        CHAMPIONS.addTeam(BET);
        CHAMPIONS.addTeam(GIR);
        CHAMPIONS.addTeam(CEL);
        CHAMPIONS.addTeam(RAY);
        CHAMPIONS.addTeam(FCB);

        //Metodos grouPlay
        CHAMPIONS.printTeams();
        CHAMPIONS.generateMatches();
        CHAMPIONS.printGroups();
        CHAMPIONS.simulateMatches();
        //CHAMPIONS.printGroupPlayMatches();
        
        COPA_DEL_REY.TeamstoCompetition();
        COPA_DEL_REY.generateMatches();
        COPA_DEL_REY.simulateMatches();
        
        FCB8.stats.get(COPA_DEL_REY).PrintStats();
        FCB1.stats.get(COPA_DEL_REY).PrintStats();
        FCB8.stats.get(CHAMPIONS).PrintStats();


        //METODOS DE LIGA
        //LALIGA.printTeams();
        //LALIGA.generateMatches();
        //LALIGA.printRounds();
       
        //LALIGA.generateMatches(); 
        //LALIGA.simulateMatches();
        //LALIGA.printMatches();
        FCB.stats.get(COPA_DEL_REY).PrintStats();
        FCB.stats.get(CHAMPIONS).PrintStats();
        //LALIGA.printTopScorers();
        //RM9.PrintStats();

    }
    

}