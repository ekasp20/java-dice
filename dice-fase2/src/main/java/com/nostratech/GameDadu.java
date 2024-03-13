package com.nostratech;

import java.util.Scanner;

public class GameDadu {
    private int jumlahPemain;
    private String[] namaPemain;
    private int[] dadu;
    private int maksDadu;
    private String pemenang;
    private boolean adaPemenang;


    public void mainGame() {
        inputJumlahPemain();
        inputNamaPemain();
        kocokDadu();
        tentukanPemenang();
    }

    private void inputJumlahPemain() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah pemain yang ikut (2-4): ");
        jumlahPemain = scanner.nextInt();
        while (jumlahPemain < 2 || jumlahPemain > 4) {
            System.out.println("Jumlah pemain harus antara 2 dan 4.");
            System.out.print("Masukkan jumlah pemain yang ikut (2-4): ");
            jumlahPemain = scanner.nextInt();
        }
        scanner.nextLine();
    }

    private void inputNamaPemain() {
        Scanner scanner = new Scanner(System.in);
        namaPemain = new String[jumlahPemain];
        System.out.println("Masukkan nama masing-masing peserta yang ikut:");
        for (int i = 0; i < jumlahPemain; i++) {
            System.out.print("Pemain " + (i + 1) + ": ");
            namaPemain[i] = scanner.nextLine();
        }
    }
    
    private void kocokDadu() {
        dadu = new int[jumlahPemain];
        for (int i = 0; i < jumlahPemain; i++) {
            dadu[i] = (int) (Math.random() * 6) + 1;
            System.out.println(namaPemain[i] + " mendapatkan dadu " + dadu[i]);
        }
    }

    private void tentukanPemenang() {
        maksDadu = 0;
        pemenang = "";
        for (int i = 0; i < jumlahPemain; i++) {
            if (dadu[i] > maksDadu) {
                maksDadu = dadu[i];
                pemenang = namaPemain[i];
            } else if (dadu[i] == maksDadu) {
                pemenang = "Seri";
            }
        }
        if (pemenang.equals("Seri")) {
            System.out.println("\nPermainan seri, ulangi untuk pemain dengan dadu tertinggi");
            kocokDaduMaksimum();
        } else {
            System.out.println("\nPemenang permainan ini adalah " + pemenang);
        }
    }
    
    private void kocokDaduMaksimum() {
        boolean adaPemenang = false;
        for (int i = 0; i < jumlahPemain; i++) {
            if (dadu[i] == maksDadu) {
                dadu[i] = (int) (Math.random() * 6) + 1;
                System.out.println(namaPemain[i] + " mendapatkan dadu " + dadu[i]);
                if (dadu[i] != maksDadu) {
                    adaPemenang = true;
                }
            }
        }
        if (adaPemenang = true) {
            maksDadu = 0; 
            for (int i = 0; i < jumlahPemain; i++) {
                if (dadu[i] > maksDadu) {
                    maksDadu = dadu[i];
                }
            }
            pemenang = "";
            for (int i = 0; i < jumlahPemain; i++) {
                if (dadu[i] == maksDadu) {
                    pemenang = namaPemain[i];
                    break;
                }
            }
            System.out.println("\nPemenang permainan ini adalah " + pemenang);
        }
    }
}
