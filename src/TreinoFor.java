public class TreinoFor {
    public void TreinoFor (){
        System.out.println("\nTreino de Perna - AGACHAMENTO");
        for (int i=0; i<3; i++){
            System.out.println("\n" + "\nSérie: " + (i+1));
            for (int j=0; j<15; j++){
                System.out.print((j+1) + " ");
            }
        }

        System.out.println("\n" + "\nTreino de Braço - ELEVAÇÃO FRONTAL");
        for (int c=0; c<3; c++){
            System.out.println("\n" + "\nSérie: " + (c+1));
            for (int d=0; d<15; d++){
                System.out.print((d+1) + " ");
            }
        }
        System.out.println ("\n" + "\nParabéns! Você concluiu seu treino.");
    }
}
