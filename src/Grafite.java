public class Grafite {
    private int tamanho;
    private float calibre;
    private final Dureza dureza;

        public enum Dureza{
            G_HB,
            G_2B,
            G_4B,
            G_6B;
        }
        public Grafite (float calibre, Dureza dureza, int tamanho){
            this.calibre=calibre;
            this.dureza=dureza;
            this.tamanho=tamanho;
        }
        
        public int getTamanho (){
            return tamanho;
        }
        public Dureza getDureza (){
            return dureza;
        }
        public float getCalibre (){
            return calibre;
        }
        public int desgastePorFolha (){
            if (dureza==Dureza.G_HB) 
            return 1;
            else if (dureza==Dureza.G_2B)
            return 2;
            else if (dureza==Dureza.G_4B)
            return 4;
            else if (dureza==Dureza.G_6B)
            return 6;
            else
            return -1;
        }
}