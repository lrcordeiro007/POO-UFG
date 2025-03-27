public class Intervalo {

    int numi;
    int numf;

    Intervalo (int numi, int numf) {
        if (numi < numf) {
            this.numi = numi;
            this.numf = numf;
        }
        else{
            this.numi = numf;
            this.numf = numi;
        }
    }

    double soma() {
        double soma = 0;
        for (int i = numi; i < numf + 1; i++) {
            soma = soma + i;
        }
        return soma;
    }

    double media() {
        return soma()/(numf-numi+1);
    }

    int qtdePares() {
        int qtde = 0;
        for (int i = numi; i < numf + 1; i++) {
            if ((i % 2) == 0)
                qtde++;
        }
        return qtde;
    }

    int qtdeImpares() {
        int qtde = 0;
        for (int i = numi; i < numf + 1; i++) {
            if ((i % 2) > 0)
                qtde++;
        }
        return qtde;
    }

    int qtdeIntervalo(){
        int qtde = numf - numi + 1;
        return qtde;
        
    }

    double somaInicial(){
        double soma = 0 ;
        for(int i =numi +1;i <numf +1 ;i++){
            soma = soma + i ;
        }
        return soma;
    }

    public String toString(){
        return "Intervalo entre "+ numi + " e "+ numf;
    }

    int diferença(){
        int dif =0;
        dif= numf - numi;
        return dif;
    }
}

