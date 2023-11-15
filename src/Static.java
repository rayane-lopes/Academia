public class Static {
    static String message = "Hoje é dia de treino!";

    public void dia (String diaDaSemana){
        System.out.println("Porque é: " + diaDaSemana);
    }
}

/* Como ficaria na Main:
public class Main {
    public static void main (String [] args) {
        System.out.println(Static2.message + "\n");

        Static2 myObj = new Static2();
        myObj.dia("Segunda-feira");

        }
    }
 */
