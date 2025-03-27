
import java.util.Scanner;

public class CriarCursos3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nCursos = 0;

        System.out.println("Digite o numero de cursos:");
        nCursos = Integer.parseInt(sc.nextLine());
        Curso cursos [] = new Curso[nCursos];

        String nome;
        String UA;
        String coord;
        int data;

        for(int i=0;i<nCursos;i++ ){
            System.out.println("Digite nome do curso "+ (i+1));
            nome = sc.nextLine();
            System.out.println("Digite unidade academica");
            UA= sc.nextLine();
            System.out.println("Digite nome do coordenador");
            coord = sc.nextLine();
            System.out.println("Digite ano do curso");
            data = Integer.parseInt(sc.nextLine());
            cursos[i] = new Curso(nome, UA, data, coord);
        }

        for (int i=0;i<nCursos;i++){
            System.out.println(cursos[i]);
        }
    }
}