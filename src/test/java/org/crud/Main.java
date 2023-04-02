package org.crud;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static String message;

    public static void main(String[] args) throws JsonProcessingException {

        Boolean status = true;
        ArrayList<Mahasiswa> listArray = new ArrayList<Mahasiswa>();

        while (status.equals(true)) {

            Scanner scanner = new Scanner(System.in);
            ObjectMapper mapper = new ObjectMapper();

            System.out.println("Selamat datang di 'APLIKASI MAHASISWA'");
            System.out.println("Version = 1.0.0\n");
            System.out.println("Silahkan pilih aksi dibawah ini dengan menginput angka di depan\n");

            System.out.println("1. Input Mahasiswa");
            System.out.println("2. Edit Mahasiswa");
            System.out.println("3. Delete Mahasiswa");
            System.out.println("4. Get Mahasiswa");
            System.out.println("5. Exit Aplikasi");

            System.out.print("Silahkan pilih angka : ");

            String selectedNumber = scanner.nextLine();
            System.out.println(selectedNumber);

            switch (selectedNumber) {
                 case "1":
                    Boolean statusAnswer = true;

                    while (statusAnswer.equals(true)) {

                        message = "Silahkan masukkan nama : ";
                        Methods.show(message);
                        String name = scanner.next();

                        message = "Silahkan masukkan angkatan : ";
                        Methods.show(message);
                        String angkatan = scanner.next();

                        message = "Silahkan masukkan major : ";
                        Methods.show(message);
                        String major = scanner.next();

                        Mahasiswa mahasiswa = new Mahasiswa(name, major, angkatan);

                        System.out.println("Apakah anda yakin dengan data ini?");
                        mahasiswa.showAllData();

                        System.out.println("Ketikkan Ya/Tidak/Ulang");
                        String answer = scanner.next();

                        if (answer.equals("Ya")) {
//                            String jsonClass = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(mahasiswa);
                            listArray.add(mahasiswa);
//                            statusAnswer = false;

                            System.out.println("Data berhasil disimpan!");
                            break;

                        } else if (answer.equals("Tidak")) {
                            break;

                        } else {
                            System.out.println("Silahkan isi ulang kembali");
                        }
                    }

                    break;

                case "2":

                    Boolean editName = true;

                    while (editName.equals(true)) {
                        System.out.println("Masukkan nama yang akan diedit");

                        String nameEdit = scanner.next();

                        for (int i = 0; i < listArray.size(); i++) {

                            if (listArray.get(i).getName().equals(nameEdit)) {

                                System.out.println("Nama ditemukan!");
                                System.out.println(listArray.get(i).showAllData());
                                System.out.println("Pilih field yang ingin diubah");
                                System.out.println("1. Nama\n2. Angkatan\n3. Major");

                                int selectedEdit = scanner.nextInt();

                                if (selectedEdit == 1) {

                                    System.out.print("Ketikkan nama yang baru : ");
                                    String newName = scanner.next();
                                    listArray.get(i).setName(newName);
                                    System.out.println("Nama berhasil dirubah");
                                    editName = false;

                                    break;

                                } else if (selectedEdit == 2) {

                                    System.out.print("Ketikkan angkatan yang baru : ");
                                    String newAngkatan = scanner.next();
                                    listArray.get(i).setAngkatan(newAngkatan);
                                    System.out.println("Angkatan berhasil dirubah");
                                    editName = false;

                                    break;

                                } else if (selectedEdit == 3) {

                                    System.out.print("Ketikkan major yang baru : ");
                                    String newMajor = scanner.next();
                                    listArray.get(i).setJurusan(newMajor);
                                    System.out.println("Major berhasil dirubah");
                                    editName = false;

                                    break;

                                } else {

                                    editName = false;
                                    break;
                                }
                            }
                        }
                    }
                    break;

                case "3":
                    System.out.println("Masukkan nama yang akan didelete");

                    String nameEdit = scanner.next();

                    for (int i = 0; i < listArray.size(); i++) {

                        if (listArray.get(i).getName().equals(nameEdit)) {

                            System.out.println("Nama ditemukan!");

                            System.out.println("Apakah anda yakin akan menghapus data ini?");
                            String confirmDelete = scanner.next();

                            if (confirmDelete.equals("Ya")) {
                                System.out.println(listArray.remove(i));
                                break;
                            }
                        }
                    }

                case "4":
                    System.out.println("Nama yang terdaftar");

                    for (int i = 0; i < listArray.size(); i++){
                        System.out.println(i + 1 + ". " + listArray.get(i).getName());
                    }
                    break;
                case "5":
                    System.out.println("Exit");

                    status = false;
                    break;
            }
        }


    }
}