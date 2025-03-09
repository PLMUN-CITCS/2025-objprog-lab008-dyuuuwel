public class BooleanStatements{

    public static void main(String[] args) {
        // Boolean Variables
        boolean isSunny = true;
        boolean hasClouds = false;

        // Integer Variables
        int temperature = 25;
        int windSpeed = 15;

        // Relational Expression (Greater than)
        boolean isHot = temperature > 30;

        // Relational Expression (Less Than or Equal To)
        boolean isBreezy = windSpeed <= 20;

        // Logical AND
        boolean goodWeather = isSunny && !hasClouds;

        // Logical OR
        boolean okWeather = isSunny || isBreezy;

        // Logical NOT
        boolean isCloudy = !isSunny;

        // Logical XOR
        boolean variableWeather = isSunny ^ hasClouds;

        // Output
        System.out.println("Is it Sunny?: " + isSunny);
        System.out.println("Are there clouds?: " + hasClouds);
        System.out.println("Is it Hot?: " + isHot);
        System.out.println("Is it Breezy?: " + isBreezy);
        System.out.println("Is the weather good?: " + goodWeather);
        System.out.println("Is the weather ok?: " + okWeather);
        System.out.println("Is it Cloudy?: " + isCloudy);
        System.out.println("Is the Weather variable?: " + variableWeather);
    }
}