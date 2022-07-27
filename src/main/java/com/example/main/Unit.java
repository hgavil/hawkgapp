package com.example.main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Unit {

    private @Id @GeneratedValue Long id;
    private String name;
    private String unitClass;

    private Unit() {}

    public Unit(String name, String unitClass) {
        this.name = name;
        this.unitClass = unitClass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, unitClass);
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getUnitClass() {
        return unitClass;
    }
    public void setUnitClass(String unitClass) {
        this.unitClass = unitClass;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", unitClass='" + unitClass + '\'' +
                '}';
    }
}