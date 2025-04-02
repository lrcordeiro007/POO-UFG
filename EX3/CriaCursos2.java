import java.util.Scanner;
import javax.swing.JOptionPane;

public class CriaCursos2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String nome;
        String UA;
        String coord;
        int data;
        
        System.out.println("Digite nome do curso");
        nome = sc.nextLine();                               //git config --global user.email "lrcordeiro007@gmail.com"
        System.out.println("Digite unidade academica");     //git config --global user.name "lrcordeiro007"
        UA= sc.nextLine();
        System.out.println("Digite nome do coordenador");
        coord = sc.nextLine();
        System.out.println("Digite ano do curso");
        data = Integer.parseInt(sc.nextLine());
        Curso curso1 = new Curso(nome, UA, data, coord);
        
        JOptionPane.showMessageDialog(null,curso1);
        

    }
    
}