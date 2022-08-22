package day09_practice.restoruant;

public class Mutfak {

public String yemekler="adanakebab, urfaciger,kusbasi, kusleme";

public String araSicak="yaylacorba, mercimek,duguncorba, corba";

public String tatlilar="baklava, sutlac,gullac, kazandibi, kunefe";

public String icecekler="ayran, salgam,kola";

    public Mutfak(String adanakebab, String mercimek, String kunefe, String salgam) {
        this.yemekler=adanakebab;
        this.araSicak=mercimek;
        this.tatlilar=kunefe;
        this.icecekler=salgam;


    }

    public Mutfak() {
        this("adanakebab","mercimek","kunefe","salgam");
    }

    @Override
    public String toString() {
        return "Mutfak{" +
                "\nyemekler='" + yemekler + '\'' +
                ", \naraSicak='" + araSicak + '\'' +
                ", \ntatlilar='" + tatlilar + '\'' +
                ", \nicecekler='" + icecekler + '\'' +
                '}';
    }
}
