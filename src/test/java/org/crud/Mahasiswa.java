package org.crud;

public class Mahasiswa {

    private String name;
    private String jurusan;
    private String angkatan;

    Mahasiswa(String inputName, String inputJurusan, String inputAngkatan){
        this.name = inputName;
        this.jurusan = inputJurusan;
        this.angkatan = inputAngkatan;
    }

    //this one is to get the properties
    public String getName() {
        return name;
    }

    public String getJurusan(){
        return jurusan;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public String showAllData(){
        System.out.println("Nama : " + this.name);
        System.out.println("Jurusan : " + this.jurusan);
        System.out.println("Angkatan : " + this.angkatan);
        return null;
    }

    //this one is for update
    public void setName(String name) {
        this.name = name;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }
}
