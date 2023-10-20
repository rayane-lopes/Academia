public class TreinoBreakContinue {
    public void treinoBreak (){
        //Caso sinta dores nas articulaçõoes durante o ciclo de treino de adaptação de 20 dias,
//parar o treino durante 10 dias.
        System.out.println("\nPausa de exercícios físicos");
        for (int treino=1; treino<=20; treino++){
            if (treino == 11){
                break;
            }
            System.out.println("\nQuantidade de dias sem treinar: " + treino);
        }
        System.out.println("\nMelhoras! Você vai se recuperar.");
    }

    public void treinoContinue (){

    }
}
