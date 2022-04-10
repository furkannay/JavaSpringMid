package com.midt.java;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teachers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String field;

    public Teachers() {}

    public Teachers(Integer id, String name, String email,  String field) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.field = field;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setFname(String firstname) {
        this.name = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getField() {
        return field;
    }

    public void setField(String faculty) {
        this.field = faculty;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + email.hashCode()+ field.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (((Teachers) obj).getName().equals(name))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return name + ":" + email+":" + field;
    }


}













