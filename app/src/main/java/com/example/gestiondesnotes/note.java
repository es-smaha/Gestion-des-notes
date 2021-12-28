package com.example.gestiondesnotes;

public class note {

    private Double note;
    private String Module;

    public note() {
    }

    public note(Double note, String module) {
        this.note = note;
        this.Module = module;
    }

    public Double getNote() {
        return note;
    }

    public void setNote(Double note) {
        this.note = note;
    }

    public String getModule() {
        return Module;
    }



    public void setModule(String module) {
        Module = module;
    }

    @Override
    public String toString() {
        return  Module + "\t\t\t\t"+ note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof note)) return false;
        note note1 = (note) o;
        return  Module.equals(note1.Module);
    }


}

