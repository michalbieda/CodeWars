package JadenCase;

public class JadenCase {

    public static void main(String[] args) {
        System.out.println(toJadenCase("siema na flache nie ma"));
    }

    public static String toJadenCase(String phrase) {

        if (phrase != null && phrase.length()>0) {
            String[] stringArray = phrase.split(" ");
            for (int i = 0; i < stringArray.length; i++) {
                String word = stringArray[i].substring(0,1).toUpperCase();
                String wordCapitalized = word + stringArray[i].substring(1);
                stringArray[i]=wordCapitalized;
            }


            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < stringArray.length; i++) {
                stringBuilder.append(stringArray[i] + " ");


            }
            String result = stringBuilder.toString();
            result = result.substring(0,result.length()-1);
            // System.out.println(result);
            return result;

        }

        return null;
    }

}