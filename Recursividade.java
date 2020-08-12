public class Recursividade {
    
    //1. Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4).
    public int Ex1(int mult, int num) {
        int soma = 0;
        return Ex1Aux(mult, num, soma);
    }
    public int Ex1Aux (int mult, int num, int soma) {
        if (mult==0) return soma;
        soma += num;
        mult--;
        return Ex1Aux(mult, num, soma);
    }
    
    //2. Soma de dois números naturais, através de incrementos sucessivos (Ex.: 3 + 2 = + + (+ + + 1)).
    
    public int Ex2(int num1, int num2) {
        int soma = 0;
        return Ex2Aux(num1, num2, soma);
    }
    private int Ex2Aux(int num1, int num2, int soma) {
        if (num1!=0) {
            num1--;
            return 1 + Ex2Aux(num1, num2, soma);
        }else if (num2!=0) {
            num2--;
            return 1 + Ex2Aux(num1, num2, soma);
        }
        return 0;
    }

    //3. Cálculo de 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.
    public double Ex3(int qntd){
        return Ex3Aux(qntd);
    }
    private double Ex3Aux(int qntd){
            if(qntd == 1) {
                return 1;
            }
        return (1/qntd) + Ex3Aux(qntd - 1);  
    }

    //4. Inversão de uma string.
    public String Ex4(String word){
        return Ex4Aux(word);
    }
    private String Ex4Aux(String word){
        if(word.length() == 1){
            return String.valueOf(word.charAt(word.length()-1));
        }
        return String.valueOf(word.charAt(word.length()-1)) 
             + Ex4Aux(word.substring(0, word.length()-1));

    }   
    //5. Gerador da sequência dada por:
    //  * F(1) = 1
    //  * F(2) = 2
    //  * F(n) = 2 ∗ F(n − 1) + 3 ∗ F(n − 2).
    public double Ex5(double result){
        return Ex5Aux(result);
    }
    
    private double Ex5Aux(double result){
        if(result == 1){
            return 1;
        }
        else if(result == 2){
            return 2;
        }
        return 2 * Ex5Aux(result - 1) + 3 * Ex5Aux(result - 2);
    }

    public double Ex6(double m, double n){
        return Ex6Aux(m, n);
    }

    private double Ex6Aux(double m, double n){
        if(m == 0 ){
            return n + 1;
        }
        else if(m != 0 && n==0){
            return Ex6Aux(m-1, 1);
        }
        return Ex6Aux(m-1, Ex6Aux(m, n-1));
    }

}

//    6.  Gerador de Sequência de Ackerman:
//          * A(m, n) = n + 1, se m = 0
//          * A(m, n) = A(m − 1, 1), se m != 0 e n = 0
//          * A(m, n) = A(m − 1, A(m, n − 1)), se m != 0 e n != 0.
         
//    7. A partir de um vetor de números inteiros, calcule a soma e o produto dos elementos
// do vetor.

//    8. Verifique se uma palavra é palíndromo (Ex. aba, abcba, xyzzyx).

//    9. Dado um número n, gere todas as possíveis combinações com as n primeiras letras
// do alfabeto. Ex.: n = 3. Resposta: ABC, ACB, BAC, BCA, CAB, CBA.

//    10. Defina uma sequência de Fibonacci generalizada, de f0 a f1 como sequência
// fibg(f0, f1, 0), fibg(f0, f1, 1), fibg(f0, f1, 2), ..., onde:
//          * fibg(f0, f1, 0) = f0
//          * fibg(f0, f1, 1) = f1
//          * fibg(f0, f1, n) = fibg(f0, f1, n − 1) + fibg(f0, f1, n − 2), se n > 1.
