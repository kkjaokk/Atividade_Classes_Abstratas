package Joao_Henrique_AtvPolimorfismo;

public class ContaPoupanca extends Conta{
    
     @Override
    void atualiza(double taxa) {
        super.deposita(this.getSaldo() * (taxa * 3));
    }
    
}