
public class Cidade
{
   //declaracao de variaveis   
   private int codigo;
   private String descricao;
   private String uf;
   private int quantEstudantes;

   //construtor
   public Cidade(int cod, String desc, String ufed){
       codigo = cod;
       descricao = desc;
       uf = ufed;
}

   //gets e sets
   public int getCodigo(){
       return codigo;
   }
   
   public String getDescricao(){
       return descricao;
   }
   
   public void setDescricao(String novaDescricao){
       descricao = novaDescricao;
   }
   
   public String getUf(){
       return uf;
   }
   
   public void setUf(String novaUf){
       uf = novaUf;
   }
   
   // metodo adiciona estudante
   public void addEstudante(){
       quantEstudantes = quantEstudantes+1;
   }
   
   //metodo exibe dados
   public void exibeDados(){
       System.out.println("Código: " + codigo);
       System.out.println("Descrição: " + descricao);
       System.out.println("Unidade Federal: " + uf);
       System.out.println("Quantidade de estudantes: " + quantEstudantes);
       
   }
    
}
