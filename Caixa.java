public class Caixa {
    
    private int abrir;
    private int fechar;

    public int getAbrir() {
        return abrir;
    }

    public void setAbrir(int abrir) {
        this.abrir = abrir;
    }

    public int getFechar() {
        return fechar;
    }

    public void setFechar(int fechar) {
        this.fechar = fechar;
    }
    
    public void abrirCaixa(int abrir) {
        if(abrir == 1) {
            System.out.println("Caixa aberta com sucesso!");
        } else {
            System.out.println("Erro ao abrir a caixa!");
        }
    }

    public void fecharCaixa(int fechar) {
        if(fechar == 2) {
            System.out.println("Caixa fechada com sucesso!");
        } else {
            System.out.println("Erro ao fechar a caixa!");
        }
    }
}