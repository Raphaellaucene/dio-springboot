package ware.demo.SysMensageria;

import org.springframework.beans.factory.annotation.Autowired;

public class SysMensageria {
    @Autowired
    private Remetente noreply;
    @Autowired
    private Remetente financeiro;

    public void enviarConfirmacao() {
        System.out.println(noreply);
        System.out.println("Seu cadastro foi aprovado!");
    }

    public void enviarBoasVindas() {
        financeiro.setEmail("teste.ware.com.br");
        System.out.println(financeiro);
        System.out.println("Seja bem-vindo!");
    }
}
