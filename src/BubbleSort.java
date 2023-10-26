public class BubbleSort {
    public static void bubbleSort(String[] args) {
        int myList[] = {2, 4, 1, 3, 5};
        int aux;
        boolean controle;
        // "i" é a quantidade de repetição do meu laço 'for'.

            /* ?? Por que a regra do for tem que ser < apenas e não <= ?? Ex.: j <= myList.length
            Resposta: Porque minha repetição 'i' começa em 0 e não em 1. Portanto, fica:
             0,1,2,3,4 (minha lista 5 posições que começa em 0) */

        for (int i = 0; i < myList.length; i++) {
            // ?? pq tem esse 'controle' aqui ??
            controle = true;
            for (int j = 0; j < (myList.length - 1); j++) {

                if (myList[j] > myList[j + 1]) {
                    aux = myList[j];
                    myList[j] = myList[j + 1];
                    myList[j + 1] = aux;
                    controle = false;
                }

                        /*se o 'if' for verdadeiro, eu continuo percorrendo meu 'for' e meu 'if',
                        por isso coloco 'controle' como false. Mas, se o 'if' for false eu pulo
                        para meu último 'if' que. quando recebe 'controle' como verdadeiro ele
                        da um 'break' e sai do laço 'for'. */
            }
            if (controle) {
            }
            break;
        }
        // ?? Por que tenho que repetir essa estrutura dor 'for' para por o println?
        //Não bastava colocá-lo dentro da estrutura do primeiro for i ??
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
    }
}
