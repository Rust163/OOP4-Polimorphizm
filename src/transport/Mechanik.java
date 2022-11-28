package transport;

public class Mechanik<T extends Transport> {
    String fullName;
    String company;

    public Mechanik(String fullName, String company) {
        this.fullName = fullName;
        this.company = company;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean passDiagnostics(T t) {
        return t.passDiagnostics();
    }

    public void carRepair(T t){
        t.carRepair();
    }
}
