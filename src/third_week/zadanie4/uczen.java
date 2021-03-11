package third_week.zadanie4;

class uczen {
    private int numerzdziennika;
    private String imie;
    private int wiek;
    public int getNumerzdziennika(){
        return numerzdziennika;
    }
    public void setNumerzdziennika(int numerzdziennika){
        this.numerzdziennika = numerzdziennika;
    }
    public String getImie(){
        return imie;
    }
    public void setImie(String imie){
        this.imie = imie;
    }
    public int getwiek(){
        return wiek;
    }
    public void setwiek(int wiek){
        this.wiek=wiek;
    }
}
    class privateExample{

        public static void main(String args[] ) {
            uczen e=new uczen();
            e.setNumerzdziennika(24);
            e.setImie("Jacek Sus");
            e.setwiek(17);
            System.out.println(e.getNumerzdziennika()+" "+e.getImie()+" "+e.getwiek());
        }

    }


