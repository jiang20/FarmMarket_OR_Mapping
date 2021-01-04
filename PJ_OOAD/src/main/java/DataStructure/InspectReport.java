package DataStructure;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InspectReport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int numOfUnqualified;

    protected InspectReport(){}

    public InspectReport(int numOfUnqualified) {
        this.numOfUnqualified = numOfUnqualified;
    }

    @Override
    public String toString() {
        return String.format(
                "InspectReport[id=%d,number of unqualified products[%d]",
                this.id,this.numOfUnqualified
        );
    }

    public long getId() {
        return id;
    }

    public int getNumOfUnqualified() {
        return numOfUnqualified;
    }
}
