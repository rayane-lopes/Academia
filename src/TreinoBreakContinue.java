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
//Aos domingos você deve descansar seu corpo. Não treine!
//Em minha semana, domingo é o primeiro dia.

        System.out.println("\nDurante a semana, lembre-se de não treinar aos domingos.");
        int diasSemana=1;
        while (diasSemana<7){
            if (diasSemana == 1){
                System.out.println("\nDia: " + diasSemana + "não faça exercícios físicos. Hoje é seu dia de descanso.");
            }
            diasSemana++;
            System.out.println("\nDia: " + diasSemana + " treine hoje");
        }
        System.out.println("\nParabéns! Mais um semana se passou. Você treinou de seg a sábado e descansou no domingo.");
    }
}
