/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arvoreab;

/**
 *
 * @author caio.gflima
 */
public class ArvoreAB {

    private No raiz;

    public ArvoreAB() {
        this.raiz = null;
    }

//   validação da arvore vazia
    public boolean ehNoVazia(No aux) {
        return (aux == null);
    }

    public void insereNo(double valor) {
        if (ehNoVazia(this.raiz)) {
            //inicializando objeto e adicionando a um auxiliar
            No aux = new No(valor);
            this.raiz = aux;
            return;
        } else {
           insere(valor, raiz);

        }
    }

    public boolean insere(double valor, No temp) {

        //lado direito da arvore
        if ((temp.getValor() < valor) && (temp.getDireita() == null)) {
            No aux = new No(valor);
            temp.setDireita(aux);
            return true;
            
        } else if ((temp.getValor() < valor) && (temp.getDireita() != null)) {
            insere(valor, temp.getDireita());
            
        } else if ((temp.getValor() > valor) && (temp.getEsquerda() == null)) {
            No aux = new No(valor);
            temp.setDireita(aux);
            return true;
            
        } else if ((temp.getValor() > valor) && (temp.getEsquerda() != null)) {
            insere(valor, temp.getEsquerda());
        }
        return false;
                
    }
}