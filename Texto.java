public class Texto {
      static String substr (String stringParametro, int ...indices){
        String resultado="";
      for (int i=0; i<indices.length; i=i+2){
        int indice1 = indices[i];
        int indice2 = indices[i+1]; //Como fazer o algoritmo reconhecer que é o fim do array e não entrar em out of bounds?

        resultado += substrPar(stringParametro, indice1, indice2);
            
        // resultado += substrImpar(stringParametro, indice1); >Como aplicar o substring par depois de resolver o out of bounds
      }

      return resultado;
    }

    static String substrPar (String stringParametro, int indice1, int indice2){
      String resultado ="";

      for(int i=indice1; i<indice2; i++){ 
        resultado += stringParametro.charAt(i);
      }

      return resultado;

    }

    static String substrImpar (String stringParametro, int indice1) {

      String resultado="";

      for(int i=indice1; i<stringParametro.length(); i++){ 
        resultado += stringParametro.charAt(i);
      }

    return resultado;
  }
}