package ar.edu.undec.veterinaryhairdresser.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pet", schema = "public", catalog = "veterinaryhairdresser")
public class PetEntity {
    private int id;
    private String comments;
    private String name;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "comments", nullable = true, length = 100)
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PetEntity petEntity = (PetEntity) o;
        return id == petEntity.id && Objects.equals(comments, petEntity.comments) && Objects.equals(name, petEntity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, comments, name);
    }
}
