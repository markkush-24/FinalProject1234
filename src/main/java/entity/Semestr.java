package entity;

public class Semestr {
    private int id;
    private String name;
    private String duration;
    private boolean status = true;

    public Semestr() {
    }

    public Semestr(int id, String name, String duration, boolean status) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
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

        Semestr semestr = (Semestr) o;

        if (id != semestr.id) return false;
        if (status != semestr.status) return false;
        if (name != null ? !name.equals(semestr.name) : semestr.name != null) return false;
        return duration != null ? duration.equals(semestr.duration) : semestr.duration == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (status ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Semestr{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", status=" + status +
                '}';
    }
}
