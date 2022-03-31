import javax.persistence.*;

@Entity
public class Car {
    @Column(name = "model")
    private String mogel;

    @Column(name = "series")
    private int series;

    @Column(name = "user")
    private User user;

    public Car() {
    }

    public Car(String mogel, int series) {
        this.mogel = mogel;
        this.series = series;
    }

    public String getMogel() {
        return mogel;
    }

    public void setMogel(String mogel) {
        this.mogel = mogel;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Car{" +
                "mogel='" + mogel + '\'' +
                ", series=" + series +
                ", user=" + user +
                '}';
    }
}