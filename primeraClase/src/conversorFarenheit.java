public class conversorFarenheit {
    public static void main(String[] args) {
        System.out.println("Conversor de grados celcius a Fahrenheit");
        int gradosCelsius = 34;
        double gradosFahrenheit = (gradosCelsius * 1.8) + 32;
        System.out.println(gradosCelsius + "grados celsius a grados Fahrenheit es igual a: "+ gradosFahrenheit+ " grados Fahrenheit");

        int gradosFahrenheitEntero = (int) (gradosCelsius*1.8) + 32;
        System.out.println("Grados Fahrenheit convertido a entero: "+ gradosFahrenheitEntero);
    }
}
