package DataStructure;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class SuperviseTask {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String introduction;
    private String deadline;

    protected SuperviseTask(){}

    public SuperviseTask(String introduction, String deadline) {
        this.introduction = introduction;
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return String.format(
                "SuperviseTask[id=%d,introduction=%s,deadline=%s]",
                this.id,this.introduction,this.deadline
        );
    }

    public long getId() {
        return id;
    }

    public String getIntroduction() {
        return introduction;
    }

    public String getDeadline() {
        return deadline;
    }
}
