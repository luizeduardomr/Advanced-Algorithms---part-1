public class Recursividade {
    

    
    public int Ex1(int mult, int num) {
        int soma = 0;
        return Ex1Aux(mult, num, soma);
    }
    public int Ex1Aux (int mult, int num, int soma) {
        if (mult==0) return soma;
        soma += num;
        mult--;
        soma += Ex1Aux(mult, num, soma);
        return soma;
    }

    public int Ex2(int num1, int num2) {
        int soma = 0;
        return Ex2Aux(num1, num2, soma)
    }
    public int Ex2Aux(int num1, int num2, int soma) {
        if (num1!=0) {

        }if (num2!=0) {
            // como que abre os files to perdido
            nao vo sai agora vamos codar tudo a vida intira
        }
    }
}