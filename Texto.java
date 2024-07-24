public class Texto {
      static String substr (String stringParametro, int ...indices){
        String resultado="";

        if (indices.length%2==0 && indices.length>1){
          for (int i=0; i<indices.length; i=i+2){
          
              int indice1 = indices[i];
              int indice2 = indices[i+1];

              if (indice1<0){
                indice1 += stringParametro.length();
              }

              if (indice2<0){
                indice2 += stringParametro.length();
              }

              if (indice2>stringParametro.length()){
                indice2=stringParametro.length();
              }

            resultado += substrPar(stringParametro, indice1, indice2);
          } 
        } else if (indices.length>1) {
          for (int i=0; i<indices.length-1; i=i+2){
            int indice1 = indices[i];
            int indice2 = indices[i+1];

            if (indice1<0){
              
            resultado += substrPar(stringParametro, indice1, indice2);

            }

          int indiceFinal = indices[indices.length-1];

          resultado += substrImpar(stringParametro, indiceFinal);
          
          } 
        } else {

          int indiceFinal = indices[indices.length-1];

          if(indiceFinal<0){
            indiceFinal+=stringParametro.length();
          }

          resultado += substrImpar(stringParametro, indiceFinal);

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