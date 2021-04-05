
public class TesteFun4Study
{
    public static void main(String args[]){
        
        int respCid = 0;
        int respEst = 1;
        int respAlt = 0;
        int respOpi = 0;
        int qtdEstudante = 0;
        Cidade c1;
        Estudante e1;
        
            do{
                qtdEstudante = 0;
                System.out.println("******************");
                System.out.println("Cadastre a Cidade:");
                System.out.println("******************\n");
                c1 = new Cidade(Teclado.leInt("Informe o código: "),
                Teclado.leString("Informe a descrição: "),
                Teclado.leString("Informe a UF: "));
                System.out.println("********************\n");
                System.out.println("Cidade criada com sucesso!\n");
                c1.exibeDados();
                System.out.println("**************************\n");
            
    
            while(qtdEstudante < 4 || respEst == 1){
                System.out.println("\n**********************");
                System.out.println("Cadastre um Estudante:");
                System.out.println("**********************\n");
                e1 = new Estudante(Teclado.leInt("Informe o codigo: "),
                Teclado.leString("Nome: "),
                Teclado.leString("Data de nascimento: "),
                Teclado.leString("E-mail: "),
                Teclado.leString("Senha: "),
                c1);
                qtdEstudante++;
                System.out.println("\n*********************************");
                System.out.println("\nEstudante cadastrado com sucesso!\n");
                e1.exibeDados();
                System.out.println("\n******************************************************");
                respAlt = Teclado.leInt("Deseja alterar algum dado do estudante? 1-Sim  / 0-Não   \n");
                    while(respAlt == 1){
                        System.out.println("\n1 - Código");
                        System.out.println("2 - Nome");
                        System.out.println("3 - Data de Nascimento");
                        System.out.println("4 - E-mail");
                        System.out.println("5 - Senha");
                        respOpi = Teclado.leInt("\nQual dado deseja alterar?   \n");
                   
                        switch(respOpi){
                            case 1:
                                e1.setCodigo(Teclado.leInt("Digite o novo código\n"));
                                break;
                            case 2:
                                e1.setNome(Teclado.leString("Digite o novo nome\n"));
                                break;
                            case 3:
                                e1.setDataNascimento(Teclado.leString("Digite nova data de nascimento\n"));
                                break;
                            case 4:
                                e1.setEmail(Teclado.leString("Digite novo e-mail\n"));
                                break;
                            case 5:
                                String senhaAntiga1;
                                String novaSenha1;
                                String confirmaNovaSenha1;
                                do{ 
                                    System.out.println("\n" + e1.getNome() + ", por favor, atualizar senha... ");
                                    senhaAntiga1 = Teclado.leString("Digite a Senha Anterior: ");
                                    novaSenha1 = Teclado.leString("Digite a Nova Senha: ");
                                    confirmaNovaSenha1 = Teclado.leString("Confirme a Nova Senha: ");
        
                                        
                                        if(e1.getSenha().equals(senhaAntiga1) && novaSenha1.equals(confirmaNovaSenha1)){
                                        System.out.println("Sua senha foi atualizada!\n");
                                        }else
                                        System.out.println("Senhas incorretas, verifique e tente novamente!\n");
                                }while(!novaSenha1.equals(confirmaNovaSenha1)||!e1.getSenha().equals(senhaAntiga1));
                                e1.setSenha(confirmaNovaSenha1);
                                break;
                            default:
                                System.out.println("Opção inválida, escolha novamente!\n");
                            }
                respAlt = Teclado.leInt("Deseja alterar mais algum dado do estudante? 1-Sim  / 0-Não   \n");
            }
            System.out.println("Dados gravados com sucesso!\n");
            e1.exibeDados();
            System.out.println("*************************************************\n");
            respEst = Teclado.leInt("Deseja cadastrar um novo Estudante? 1-Sim / 0-Não    \n");
        
                if(respEst == 0 && qtdEstudante < 4)
                     System.out.println("Quantidade de Estudantes insuficiente!\n");
    }
            respCid = Teclado.leInt("Você deseja cadastrar outra cidade? 1-Sim / 0-Não   \n");
            respEst = 1;
        }while(respCid!= 0);
            System.out.println("\n**********************************");
            System.out.println("Cadastro fianlizado com sucesso!!!");
            System.out.println("**********************************\n");
    }
}