package JavaCore;

import java.util.Random;

public class Team {
        private String nameTeam = "Masha";
        Champions[] winers = {new Runner("Kate"), new Swimmer("Bob"), new Boxer("Pol")};
        public Champions[] teamChampions = new Champions[4];
        Random random = new Random();

        public Team(String nameTeam) {
            this.nameTeam = nameTeam;
            for(int i = 0; i < 4; i++){
                int ran = random.nextInt(3);
                teamChampions[i] = winers [ran];
            }
        }

        public void printInformationAboutTheTeam() {
            System.out.println("Team: " + nameTeam);
            for(Champions a : teamChampions) {
                System.out.println(a);
                System.out.println("Run limit: " + a.run_limit);
                if (a instanceof Swimable)
                    System.out.println("Swim limit: " + ((Swimable) a).getSwimLimit());
                if (a instanceof Jumpable)
                    System.out.println("Jump limit: " + ((Jumpable) a).getJumpLimit());
            }
            System.out.println();
        }

        public void passedTheDistance(){
            System.out.println(nameTeam + "\n");
            for (Champions a : teamChampions){
                if(a.passing){
                    System.out.println(a + " successfully passed the distance.\n");
                } else {
                    System.out.println(a + " did not pass the distance.\n");
                }
            }
            System.out.println();
        }
}
