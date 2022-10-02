import java.util.HashSet;
public class Celebrity {

    private String firstName;

    private String lastName;

    private HashSet<Production> works;

    public Celebrity(String firstName, String lastName, HashSet<Production> works){
        this.firstName = firstName;
        this.lastName = lastName;
        this.works = works;
    }

    public Celebrity(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){return this.firstName;}

    public String getLastName(){return this.lastName;}

    public HashSet<Production> getWorks(){return this.works;}

    public void setFirstName(String firstName){this.firstName = firstName;}

    public void setLastName(String lastName){this.lastName = lastName;}

    public void setWorks(HashSet works){this.works = works;}

    public void addWork(Production work){this.works.add(work);}

    public void removeWork(Production work){this.works.remove(work);}
}
