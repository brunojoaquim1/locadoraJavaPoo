
package locadora_carros;

 import java.util.Scanner;
 import java.util.ArrayList;


public class Locadora_carros {

    public static void main(String[] args)throws Exception{
        Scanner ler = new Scanner(System.in);
        Scanner ler1 = new Scanner(System.in);
        Scanner ler2 = new Scanner(System.in);
        Scanner ler3 = new Scanner(System.in);
        Scanner ler4 = new Scanner(System.in);
        
            //Variavéis de controle e passagem de parâmetros 
            
            int menu =  0;
            boolean sair_subMenu;
            
            sair_subMenu = false;
            int ix = 0 ;
            
            String xNome;
            String xCPF;
            
            int xTipo;
            String xPlaca;
            double xValorBase;
            int xAno;
                        
            Carro CarroList[] = new Carro [100];
            int cont = 0 ;
            
            ArrayList<Alugar> list_alugueis = new ArrayList<>();

            int c = 0;

            Cliente pessoa[] = new Cliente [100];
            int b = 0;


        System.out.println("============================================");
        System.out.println("============ATENÇÃO=========================");
        System.out.println("APERTAR O ENTER ENTRE A TRANSIÇÃO DOS MENUS");
        System.out.println("============================================");
        while(menu != 7){
            sair_subMenu = false;
            ix = 0;
            clearBuffer(ler);
            
            System.out.println("============================================");
            System.out.println("====LOCADORA DE CARROS VELOZES E FURIOSOS===");
            System.out.println("============================================");
            System.out.println("[1] Para Cadastrar Clientes:");
            System.out.println("[2] Para Cadastrar Carros:");
            System.out.println("[3] Apresentar Clientes Cadastrados: ");
            System.out.println("[4] Apresentar Carros Cadastrados: ");
            System.out.println("[5] Realizar Locação: ");
            System.out.println("[6] Realizar Devolução: ");
            System.out.println("[7] SAIR: ");
            menu = ler.nextInt();
        
            switch (menu){
                case 1:
                    clearBuffer(ler1);
                    clearBuffer(ler2); //Limpa Scanner
                    while(sair_subMenu == false){
                        System.out.println("[CADASTRO DE CLIENTE]");
                        System.out.println("Informe o nome:");
                        xNome = ler1.nextLine();
                        System.out.println("Informe o CPF:");
                        xCPF = ler2.nextLine();
                        pessoa[b] = new Cliente(xNome,xCPF);
                        
                        b = b + 1;
                        
                        System.out.println("Sair?(1-Sim / 2-Não)");
                        ix = ler3.nextInt();
                        
                        if(ix == 1){
                            sair_subMenu = true;
                        }
                        
                    }
               break;
                case 2:
                    clearBuffer(ler1);
                    clearBuffer(ler2);
                    clearBuffer(ler3);
                    clearBuffer(ler4);
                    while(sair_subMenu == false){
                        System.out.println("[CADASTRO DE CARROS]");
                        System.out.println("Informe o modelo do Carro:");
                        
                        System.out.println("1-Carro Popular | 2-Carro Médio | 3- Carro Grande:");
                        xTipo = ler1.nextInt();
                        
                        System.out.println("Informe a placa do Carro:");
                        xPlaca = ler2.nextLine();
                        
                        System.out.println("Informe o valor de locação:");
                        xValorBase = ler3.nextDouble();                        
                        
                        System.out.println("Informe o ano do carro:");
                        xAno = ler4.nextInt();
                        
                    switch (xTipo) {
                        case 1:
                            //Instancia Carro Popular
                            CarroList[cont] = new Carro_popular(xPlaca,xTipo,xValorBase,xAno,cont);
                            cont = cont + 1;
                            
                            break;
                        case 2:
                            //Instancia Carro Médio
                            CarroList[cont] = new Carro_medio(xPlaca,xTipo,xValorBase,xAno,cont);
                            cont = cont + 1;
                            
                            break;
                        case 3:
                            //Instancia Carro Grande
                            CarroList[cont] = new Carro_grande(xPlaca,xTipo,xValorBase,xAno,cont);
                            cont = cont + 1;
                            break;
                        default:
                            System.out.println("Modelo digitado não existe, infome os dados novamente");
                            break;
                            }
                        
                        System.out.println("Sair?(1-Sim / 2-Não)");
                        ix = ler3.nextInt();
                        
                        if(ix == 1){
                            sair_subMenu = true;
                        }
                       
                    }
                break;
                case 3:
                    System.out.println("[LISTA DE CLIENTES CADASTRADOS]");
                    for(int z = 0; cont < z; cont++){
                        System.out.println("Código de Cadastro:" + z);
                        System.out.println("Nome:" + pessoa[cont].getNome());
                        System.out.println("CPF:" + pessoa[cont].getCpf());
                        System.out.println("============================:");

                    }
                break;
                case 4:
                    System.out.println("[LISTA DE CARROS CADASTRADOS]");
                    for(int i = 0; i < cont; i++){
                        System.out.println("CODIGO CARRO: " + i );
                        System.out.println("PLACA: " + CarroList[i].getPlaca());
                        System.out.println("ANO: " + CarroList[i].getAno());
                        if(CarroList[i].getModelo() == 1 ){
                            System.out.println("CARRO POPULAR");
                        }else if(CarroList[i].getModelo() == 2){
                            System.out.println("CARRO MÉDIO");
                        }else if(CarroList[i].getModelo() == 3){
                            System.out.println("CARRO GRANDE");
                        }
                        System.out.println("VALOR FINAL: " + CarroList[i].getValor_final());
                        System.out.println("============================:");
                    }
                    
                case 5:
                    clearBuffer(ler);
                    clearBuffer(ler2);
                    clearBuffer(ler3);
                    clearBuffer(ler4);
                    int xDias;
                    String iCPF;
                    System.out.println("[LOCAÇÃO DE CARROS]");
                    System.out.println("Digite o CPF:");
                    iCPF = ler2.nextLine();
                    int iCodLocacao;
                    for(int i = 0; i < b ; i++){
                        System.out.println("CLIENTE ENCONTRADO: " + pessoa[i].getNome() );
                        System.out.println("===========================================");
                        if(iCPF.equals(pessoa[i].getCpf())){
                                    System.out.println("[CARROS POPULARES DIPONIVEIS]");
                                    for(int n = 0; n < cont; n++){
                                        if (CarroList[n].isDisponivel()){
                                        System.out.println("CODIGO CARRO: " + n );
                                        System.out.println("PLACA: " + CarroList[n].getPlaca());
                                        System.out.println("ANO: " + CarroList[n].getAno());
                                        if(CarroList[i].getModelo() == 1 ){
                                            System.out.println("CARRO POPULAR");
                                        }else if(CarroList[i].getModelo() == 2){
                                            System.out.println("CARRO MÉDIO");
                                        }else if(CarroList[i].getModelo() == 3){
                                            System.out.println("CARRO GRANDE");
                                        }
                                        System.out.println("VALOR FINAL: " + CarroList[n].getValor_final());
                                        System.out.println("============================:");
                                        }
                                    }
                                        
                                         System.out.println("DIGITE QUAL O CARRO QUE DESEJA ALUGAR (CODIGO)");
                                         iCodLocacao = ler4.nextInt();                                         
                                         
                                         System.out.println("DIGITE A QUANTIDADE DE DIAS QUE DESEJA FICAR COM O CARRO");
                                         xDias = ler.nextInt();
                                        

                                         list_alugueis.add(new Alugar(CarroList[iCodLocacao], pessoa[i], xDias));      
                                         
                    }else{
                        System.out.println("CPF NÃO ENCONTRADO!!");
                        }
                    }
                break;
                case 6:
                    clearBuffer(ler);
                    clearBuffer(ler1);
                    
                    String _CPF;
                    String _DataDevol; 
                    
                    System.out.println("[DEVOLUCAO DE LOCACAO]");
                    System.out.println("[DEVOLUCAO INFORME O CPF:]");
                    _CPF = ler.nextLine();
                     
                    for(Alugar alugar : list_alugueis){
                        if(alugar.getCliente().getCpf().equals(_CPF)){
                            System.out.println("Olá :" + alugar.getCliente().getNome());
                            System.out.println("Digite a Data de devolução: ");
                            _DataDevol = ler1.nextLine();
                            
                            alugar.devolver_carro(_DataDevol);
                            
                            if(alugar.isAtrasado()){
                                System.out.println("SUA DEVOLUCAO ESTÁ ATRASADA: ");
                            }
                        }
                        
                        System.out.println("DATA devolucao_prevista: " + alugar.getData_devolucao_prevista());

                        System.out.println("VALOR FINAL FICOU: " + alugar.getValor_total_realizado());

                    }
                   
                break;

             }//FIM SWITCH
        
    }//FIM WHILE
}// FIM MÉTODO PRINCIPAL 
    
      private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
     // FIM MÉTODO CLEARBUFFER
}
}//FIM CLASSE
        
       