
public class Curso {
    String nome;
    String UA;
    int data;
    String coord;

    Curso ( String nome,String UA,int data,String coord){
        this.nome = nome ;
        this.UA = UA;
        this.data = data;
        this.coord = coord;
    }

    public String toString(){
        return "Curso  " + this.nome +"\n"+
        "Unidade academica  "+ this.UA +"\n"+
        "Ano de criacao  "+ this.data +"\n"+
        "Nome do coordenador  "+ this.coord +"\n";
    }
}