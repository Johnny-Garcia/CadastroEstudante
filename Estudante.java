public class Estudante
{
    private int codigo;
    private String nome;
    private String dataNascimento;
    private String email;
    private String senha;
    private Cidade cidade;
    
    public Estudante(int cod, String nom, String dNa, String mail, String sen,Cidade cid){
        codigo = cod;
        nome = nom;
        dataNascimento = dNa;
        email = mail;
        senha = sen;
        cidade = cid;
        cidade.addEstudante(); //Método inserido da classe Cidade
    }
    
    public int getCodigo(){
       return codigo;
   }
   
   public void setCodigo(int novoCodigo){
       codigo = novoCodigo;
   }
   
   public String getNome(){
       return nome;
   }
   
   public void setNome(String novoNome){
       nome = novoNome;
   }
   
   public String getDataNascimento(){
       return dataNascimento;
   }
   
   public void setDataNascimento(String novaDataNascimento){
       dataNascimento = novaDataNascimento;
   }
   
   public String getEmail(){
       return email;
   }
   
   public void setEmail(String novoEmail){
       email = novoEmail;
   }
   
   public String getSenha(){
       return senha;
   }
   
   public void setSenha(String novaSenha){
       senha = novaSenha;
   }
   
   public Cidade getCidade(){
       return cidade;
   }
   
   public void setCidade(Cidade novaCidade){
       cidade = novaCidade;
   }
   
   public void exibeDados(){
       System.out.println("Código: " + codigo);
       System.out.println("Nome: " + nome);
       System.out.println("Data de nascimento: " + dataNascimento);
       System.out.println("E-mail: " + email);
       System.out.println("Senha: " + senha);
       System.out.println("Cidade: " + cidade.getCodigo() + ", " + cidade.getDescricao());
   }
   
}
