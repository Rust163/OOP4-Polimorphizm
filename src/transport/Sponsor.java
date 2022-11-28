package transport;

public class Sponsor {
    String sponsorName;
    int amountOfSupport;

    public Sponsor(String sponsorName, int amountOfSupport) {
        this.sponsorName = sponsorName;
        this.amountOfSupport = amountOfSupport;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public int getAmountOfSupport() {
        return amountOfSupport;
    }

    public void setAmountOfSupport(int amountOfSupport) {
        this.amountOfSupport = amountOfSupport;
    }
    public void paySponsor() {
        System.out.println("Спонсор " + sponsorName + " проспонсировал гонку в размере " + amountOfSupport + " руб.");
    }
}
