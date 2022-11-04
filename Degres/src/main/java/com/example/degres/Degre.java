package com.example.degres;

import javafx.scene.control.TextArea;

import java.util.Scanner;



import java.util.ArrayList;


public class Degre {
    String S;
    String A;
    ArrayList<String>Sommets;
    ArrayList<String>Arcs;


    public Degre(){
        char tmp='a';
        Scanner s = new Scanner(System.in);
        Sommets=new ArrayList<>();
        Arcs=new ArrayList<>();

    }
    public void split(){

        String[] dataStringArr = S.split("\\s");
        for (String data : dataStringArr) {
            Sommets.add(data);

        }
        String[] dataStringArr2 = A.split("\\s");
        for (String data : dataStringArr2) {
            Arcs.add(data);

        }}
    public void Afficher() {

       System.out.println("Vos Sommets sont : ");
        for(int i=0;i<Sommets.size();i++) {
            System.out.println(Sommets.get(i));
        }
        System.out.println("Vos Arcs sont :");
        for(int i=0;i<Arcs.size();i++) {
            System.out.println(Arcs.get(i));
        }
    }


    public void AfficherDegre(TextArea ZID) {
        ZID.appendText("------------------------------ Deg + ------------------------------ \n");
        int tmp=0;
        for(int i=0;i<(Sommets.size())-1;i++) {
            ZID.appendText("Les degrés + de "+Sommets.get(i)+" sont: ");
            for(int y=0;y<(Arcs.size());y++) {
                if(Sommets.get(i).charAt(0)==Arcs.get(y).charAt(0)) {
                    tmp++;
                    ZID.appendText("("+Arcs.get(y)+")");
                }}
            if(tmp==0) {
                ZID.appendText("Aucun ");}
            ZID.appendText("/ Totale => "+tmp+"\n");
            tmp=0;
        }
        tmp=0;
        ZID.appendText(       "------------------------------ Deg - ------------------------------ \n");
        for(int i=0;i<(Sommets.size());i++) {
            ZID.appendText("Les degrés - de "+Sommets.get(i)+" sont: ");
            for(int y=0;y<(Arcs.size())-1;y++) {
                if(Sommets.get(i).charAt(0)==Arcs.get(y).charAt(1)) {
                    tmp++;
                    ZID.appendText("("+Arcs.get(y)+")");
                }}
            if(tmp==0) {ZID.appendText("Aucun ");}
            ZID.appendText("/ Totale => "+tmp+"\n");
            tmp=0;
        }
    }
   /* public static void main(String[] args) {
        Degre d = new Degre();
        d.split();
        d.AfficherDegre();
    }*/

    public ArrayList<String> getSommets() {
        return Sommets;
    }

    public void setSommets(ArrayList<String> sommets) {
        Sommets = sommets;
    }

    public ArrayList<String> getArcs() {
        return Arcs;
    }

    public void setArcs(ArrayList<String> arcs) {
        Arcs = arcs;
    }

    public String getS() {
        return S;
    }

    public void setS(String s) {
        S = s;
    }

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }
}

