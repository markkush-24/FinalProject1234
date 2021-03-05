package entity;

import java.util.Objects;

public class Discipline {
    private int id;
    private String discipline;
    private boolean status = true;

    public Discipline(int id, String discipline, boolean status) {
        this.id = id;
        this.discipline = discipline;
        this.status = status;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Discipline that = (Discipline) o;
        return id == that.id &&
                status == that.status &&
                Objects.equals(discipline, that.discipline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, discipline, status);
    }

    public Discipline() {



    }

    @Override
    public String toString() {
        return "Discipline{" +
                "id=" + id +
                ", discipline='" + discipline + '\'' +
                ", status=" + status +
                '}';
    }
}
