package br.sesi.sdf.poo;

import br.sesi.sdf.poo.cabeca.Cabeca;
import br.sesi.sdf.poo.interior.Membrosinferiores;
import br.sesi.sdf.poo.tronco.Tronco;

public class Pessoa {
   public Cabeca cabeca;
   public Tronco tronco;
   public Membrosinferiores inferiores;

   public Pessoa () {
      this.cabeca = new Cabeca();
      this.tronco = new Tronco();
      this.inferiores = new Membrosinferiores();


   }
}
