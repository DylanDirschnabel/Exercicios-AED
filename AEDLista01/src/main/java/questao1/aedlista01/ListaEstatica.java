
package questao1.aedlista01;
import java.lang.IndexOutOfBoundsException;

public class ListaEstatica {
    private int[] info;
    private int tamanho;    
    
    public int getTamanho() {
        return tamanho;
    }
    
    public ListaEstatica() {
        info = new int[10];
        tamanho = 0;
    }
    
    private void redimensionar() {
        int[] novo = new int[tamanho + 10];
        
        for(int i = 0; i < tamanho; i++) {
            novo[i] = info[i];
        }
        
        info = novo;

    }
    
    public void inserir(int valor) {
        if(tamanho == info.length) {
            redimensionar();
        }
        
        info[tamanho] = valor;
        tamanho++;

    }
    
    public void exibir() {
        String texto = "";
        for(int i = 0; i < tamanho; i++) {
            texto += info[i] + " ";
        }
        System.out.println(texto);

    }
    
    public int buscar(int valor) {
        for(int i = 0; i < tamanho; i++) {
            if(info[i] == valor) {
                return i;
            }
        }
        return -1;
    }
    
    public void retirar(int valor) {
        int posicao = buscar(valor);
        if(posicao == -1) {
            return;
        }
        
        int tmp[] = new int[tamanho - posicao];
        for(int i = posicao + 1; i < tamanho; i++) {
            tmp[i - posicao - 1] = info[i];
        }
        tamanho--;
        for(int i = posicao; i < tamanho; i++) {
            info[i] = tmp[i - posicao];
        }
    }
    
    public void liberar() {
        info = new int[10];
        tamanho = 0;
    }
    
    public int obterElemento(int posicao) {
        if(posicao < 0 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Posição Inválida!");
        }
        return info[posicao];
    }
    
    public boolean estaVazia() {
        if(tamanho == 0) {
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        String texto = "";
        for(int i = 0; i < tamanho; i++) {
            texto += info[i];
            if(i < tamanho - 1) {
                texto += ",";
            }
        }
        return texto;
    }
}
