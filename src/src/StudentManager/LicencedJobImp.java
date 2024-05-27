package src.StudentManager;

public class LicencedJobImp implements LicencedJob {
    //create fields
    private String Liscence;

    @Override
    public String getLinscence() {
        return Liscence;
    }

    @Override
    public String toString() {
        return "LicenecedJobImp{" + "Liscence='" + Liscence + '\'' + '}';
    }
}
