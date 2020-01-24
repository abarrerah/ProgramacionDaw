import java.util.Arrays;

public class libreriaEJ3T3 {
    public static String invertir(String cad){
        cad=cad.toUpperCase();
        int cont=0;
        for (int i=0;i<cad.length();i++){
            cont++;
        }
        String cadin="";
        String[] resultado= new String[cont];
        for (int i=0;i<resultado.length;i++){
            cadin=(Character.toString(cad.charAt(cont-i)));
        }
        Arrays.toString(resultado);
      return cadin;
    }

    public static String desplazarVocales(String cad){
        int cont=0;
        for (int i = 0; i <cad.length() ; i++) {
            cont++;
        }
        String []resultado= new String[cont];
        for (int i=0;i<resultado.length;i++){
            if (cad.charAt(i)=='a'){
                resultado[i]=Character.toString('e');
            }
            if (cad.charAt(i)=='e'){
                    resultado[i]=Character.toString('i');
            }
            if (cad.charAt(i)=='i'){
                resultado[i]=Character.toString('o');
            }

            if (cad.charAt(i)=='o'){
                    resultado[i]=Character.toString('u');
            }
            if (cad.charAt(i)=='u'){
                resultado[i]=Character.toString('a');
            }
            if (cad.charAt(i)=='h'){
                resultado[i]=Character.toString('h');

        }if (cad.charAt(i)=='c'){
                resultado[i]=Character.toString('c');
        }if (cad.charAt(i)=='l'){
                resultado[i]=Character.toString('l');
            }
            if (cad.charAt(i)=='b'){
                resultado[i]=Character.toString('b');
            } if (cad.charAt(i)=='d'){
                resultado[i]=Character.toString('d');
            }
            if (cad.charAt(i)=='f'){
                resultado[i]=Character.toString('f');
            }
            if (cad.charAt(i)=='g'){
                resultado[i]=Character.toString('g');
            }
            if (cad.charAt(i)=='j'){
                resultado[i]=Character.toString('j');
            }
            if (cad.charAt(i)=='k'){
                resultado[i]=Character.toString('k');
            }
            if (cad.charAt(i)=='m'){
                resultado[i]=Character.toString('m');
            }
            if (cad.charAt(i)=='n'){
                resultado[i]=Character.toString('n');
            }
            if (cad.charAt(i)=='p'){
                resultado[i]=Character.toString('p');
            }
            if (cad.charAt(i)=='q'){
                resultado[i]=Character.toString('q');
            }
            if (cad.charAt(i)=='r'){
                resultado[i]=Character.toString('r');
            }
            if (cad.charAt(i)=='s'){
                resultado[i]=Character.toString('s');
            }
            if (cad.charAt(i)=='t'){
                resultado[i]=Character.toString('t');
            }
            if (cad.charAt(i)=='v'){
                resultado[i]=Character.toString('v');
            }
            if (cad.charAt(i)=='w'){
                resultado[i]=Character.toString('w');
            } if (cad.charAt(i)=='y'){
                resultado[i]=Character.toString('y');
            } if (cad.charAt(i)=='x'){
                resultado[i]=Character.toString('x');
            } if (cad.charAt(i)=='z'){
                resultado[i]=Character.toString('z');
            }
            if (cad.charAt(i)=='ñ'){
                resultado[i]=Character.toString('ñ');
            }
        }
        String rotar=Arrays.toString(resultado);
        return rotar;
    }
}
