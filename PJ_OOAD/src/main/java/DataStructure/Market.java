package DataStructure;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String nameOfManager;

    protected Market(){}

    public Market(String name, String nameOfManager) {
        this.name = name;
        this.nameOfManager = nameOfManager;
    }

    @Override
    public String toString() {
        return String.format(
                "Market[id=%d,name=%s,nameOfManger=%s]",
                this.id,this.name,this.nameOfManager
        );
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNameOfManager() {
        return nameOfManager;
    }
}
