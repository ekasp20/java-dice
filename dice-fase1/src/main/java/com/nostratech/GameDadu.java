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
}
