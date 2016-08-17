
import java.util.Scanner;

public class Pessoa {
    
    private String nome, id;
    private int idade;
    
    public Pessoa(String id, String nome, int idade){ // sirnande@alunos.utfpr.edu.br
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }
    
    public static Pessoa criar(){
        Scanner input = new Scanner(System.in);
        int idade;
        String nome, id = "";
        
        id += GeraId.geraId();
        System.out.println("ID --------   "+ id);
        System.out.print("Nome.: ");
        nome = input.next();
        System.out.print("Idade.: ");
        idade = input.nextInt();
        
        return new Pessoa(id, nome, idade);
    }
    
    public String getId(){
        
        return this.id;
    }
    
    public String getNome(){
        
        return this.nome;
    }
    
    public int getIdade(){
        
        
        return this.idade;
    }
    

    public String toString(){
        
        return "ID  "+ this.id +" || NOME: "+ this.nome + " || IDADE "+ this.idade;
    }
    
}
