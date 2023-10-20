public class Main {
    public static void main (String [] args) {
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
