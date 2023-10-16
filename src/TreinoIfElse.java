public class TreinoIfElse {
    public void TreinoIfElse (){
        System.out.println("\nO que irei treinar hoje?\n");
        int terca_feira = 1;
        int quinta_feira = 2;
        if (terca_feira == 8){
            System.out.println ("Hoje é terça-feira. Você irá treinar costas.");
        } else if (quinta_feira == 9){
            System.out.println("Hoje é quinta-feira. Você irá treinar bíceps.");
        } else {
            System.out.println("Hoje não é terça nem quinta-feira. Você irá treinar inferiores.");
        }
    }
}
