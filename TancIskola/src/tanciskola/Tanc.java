/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tanciskola;

import java.util.Objects;

/**
 *
 * @author Hp
 */
public class Tanc {
     private String nev;
     private String lany;
     private String fiu;

     public Tanc(String nev, String lany, String fiu) {
          this.nev = nev;
          this.lany = lany;
          this.fiu = fiu;
     }

     public String getNev() {
          return nev;
     }

     public void setNev(String nev) {
          this.nev = nev;
     }

     public String getLany() {
          return lany;
     }

     public void setLany(String lany) {
          this.lany = lany;
     }

     public String getFiu() {
          return fiu;
     }

     public void setFiu(String fiu) {
          this.fiu = fiu;
     }

     @Override
     public String toString() {
          return "Tanc{" + "nev=" + nev + ", lany=" + lany + ", fiu=" + fiu + '}';
     }

     @Override
     public int hashCode() {
          int hash = 5;
          hash = 61 * hash + Objects.hashCode(this.nev);
          hash = 61 * hash + Objects.hashCode(this.lany);
          hash = 61 * hash + Objects.hashCode(this.fiu);
          return hash;
     }

     @Override
     public boolean equals(Object obj) {
          if (this == obj) {
               return true;
          }
          if (obj == null) {
               return false;
          }
          if (getClass() != obj.getClass()) {
               return false;
          }
          final Tanc other = (Tanc) obj;
          if (!Objects.equals(this.nev, other.nev)) {
               return false;
          }
          if (!Objects.equals(this.lany, other.lany)) {
               return false;
          }
          return Objects.equals(this.fiu, other.fiu);
     }

     public boolean vanBenne(String ertek) {
          return this.fiu.equals(ertek) || this.lany.equals(ertek) || this.nev.equals(ertek);
     }

public String masikKetto(String ertek) {
          if(this.fiu.equals(ertek)){
               return "A tánc neve "+ this.nev+ " és a párja "+ this.lany + " volt.";
          }
          if(this.lany.equals(ertek)){
               return "A tánc neve "+ this.nev+ " és a párja "+ this.fiu + " volt.";
          }
          if(this.nev.equals(ertek)){
               return this.lany +" partnere "+ this.fiu+" volt benne a táncban.";
          }
          return "";
     }
     
     
     
     
     
     
}
