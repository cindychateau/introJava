class StringManipulator {

    public static String trimAndConcat(String cadena1, String cadena2) {
        return cadena1.trim() + cadena2.trim();
    }

    public static int getIndexOrNull(String palabra, char letra) {
       return palabra.indexOf(letra); 
    }

    public static int getIndexOrNull(String cadena, String subcadena) {
        return cadena.indexOf(subcadena);
    }

    public static String concatSubstring(String palabra1, int inicio, int fin, String palabra2) {
        return palabra1.substring(inicio, fin)+palabra2;
    }

}