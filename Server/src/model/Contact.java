package model;

import java.io.Serializable;

public class Contact implements Serializable {

    private String name;
    private String telefone;

    public Contact(String name, String telefone) {

        this.name = name;
        this.telefone = telefone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
