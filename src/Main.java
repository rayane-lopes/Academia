public class Main {
    public static void main (String [] args) {
            int myList[] = {2,4,1,3,5};
            int aux;
            boolean controle;

            //meu break ta dando erro: https://www.youtube.com/watch?v=J6hTSBc4Phs&t=602s

            for (int i = 0; i < myList.length; i++){
                controle = true;
                for (int j = 0; j < (myList.length - 1); j++){

                    if (myList[j] > myList[j+1]){
                        aux = myList[j];
                        myList[j] = myList[j + 1];
                        myList[j + 1] = aux;
                        controle = false;
                    }
                }
                if (controle){}
                break;
            }
            for (int i = 0; i < myList.length; i++){
                System.out.println(myList[i]);}
        }
    }
