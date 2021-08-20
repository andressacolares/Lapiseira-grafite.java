public class Lapiseira {

    private Grafite grafite = null;
    private int folhasEscritas;
    private float calibre;
    private int outrasFolhas;

    public Lapiseira (float calibre){
        this.calibre=calibre;
    }
    public int getOutrasFolhas() {
        return outrasFolhas;
    }
    public float getCalibre() {
        return calibre;
    }
    public int getFolhasEscritas() {
        return folhasEscritas;
    }
    public Grafite getGrafite() {
        return grafite;
    }
    public boolean escrever (int folhas){
        if(this.grafite ==null){
        outrasFolhas = grafite.getTamanho() / grafite.desgastePorFolha();
        outrasFolhas -= getFolhasEscritas();
        return false;
    } else if ((outrasFolhas - folhas)<=0){
        this.folhasEscritas += outrasFolhas;
        this.grafite=null;
    } else {
        this.folhasEscritas += outrasFolhas;
        return (outrasFolhas - folhas) <=0; }
    return false;
    }

    public  boolean inserir (Grafite grafite){
            if (this.calibre!=grafite.getCalibre())
            return false;
            if (getGrafite() != null)
            return false;
            this.folhasEscritas = 0;
            this.grafite = grafite;
            return true;
    }

    public boolean remover (){
        if (this.grafite ==null)
        return false;
        this.grafite = null;
        return true;
    }
}