import java.util.LinkedList;


public class NationalTeam extends Team{


    public NationalTeam(String name, Country country, Gender gender){
        super(name, country, gender);
        this.players = new LinkedList<>();
        
    }
    public void addPlayer(Player player){
        

        
        if (player.nationality.equals(this.country)){//POODEM CRIDAR LA NOVA FUNCIÓ DE COUNTRY, MIRAR
            // Verificar si el jugador es del mismo género que el equipo
            if (this.gender == Gender.MIXTO) {
                players.add(player);
                System.out.println(player.getName()+" fue añadido/a\n");

            } 
            else if (this.gender == Gender.FEMENINO && player.getGender()){
                players.add(player);
                System.out.println(player.getName()+" fue añadido/a\n");

            }
            else if (this.gender == Gender.MASCULINO && player.getGender() == false){
                players.add(player);
                System.out.println(player.getName()+" fue añadido/a\n");

            }
            else{
                System.out.println(player.getName()+" no es del género adecuado\n");
            }
        }
    
        else{
            System.out.println(player.getName()+" no es del país adecuado\n");

        }   
    }
}
