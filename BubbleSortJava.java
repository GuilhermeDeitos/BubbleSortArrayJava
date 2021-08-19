/*
Aluno: Guilherme Augusto Deitos Alves 3° Info
IFPR Cascavel
*/
import javax.swing.JOptionPane;

public class AtividadeRemota07{


  public static void main(String[] args) {
    int[] notas = new int[5];
    int soma = 0,aux = 0,contador = 0;
    double media = 0;

    for(int i = 0; i < notas.length;i++){
      notas[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a nota do aluno: "));
      soma += notas[i]; //Vai somar a nota atual com as que tem lá, assim resultando em uma soma total

    }
    media = soma/notas.length; //media das notas dividindo a soma pela quantidade de notas

    //Iniciando a ordenação das notas de forma decrescente (no caso utilizei bubblesort pois é o unico que conheço)
    for(int i = 0; i < 5;i++){
      for(int j = 0;j < 4;j++){

        if(notas[j] < notas[j+1]){
          aux = notas[j];
          notas[j] = notas[j+1];
          notas[j+1] = aux;
        }

      }
    }
    System.out.println("Notas decrescentes:");

    for(int i = 0; i < 5;i++){
      System.out.println(notas[i]);
    }
    System.out.println("A média das notas é: "+media);
  }


}