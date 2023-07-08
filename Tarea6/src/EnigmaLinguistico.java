import java.util.*;

public class EnigmaLinguistico
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> groups = new LinkedHashMap<>();

        for (int i = 0; i < N; i++)
        {
            String word = scanner.nextLine().trim();
            String setOfWords = generarRepresentacion(word);

            if (groups.containsKey(setOfWords))
            {
                groups.get(setOfWords).add(word);
            }
            else
            {
                List<String> group = new ArrayList<>();
                group.add(word);
                groups.put(setOfWords, group);
            }
        }

        for (List<String> group : groups.values())
        {
            StringBuilder sb = new StringBuilder();
            for (String word : group)
            {
                sb.append(word).append(" ");
            }
            sb.deleteCharAt(sb.length() - 1);
            System.out.println(sb.toString());
        }
    }

    private static String generarRepresentacion(String palabra) {
        char[] caracteres = palabra.toCharArray();
        for (int i = 0; i < caracteres.length / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[caracteres.length - 1 - i];
            caracteres[caracteres.length - 1 - i] = temp;
        }
        return new String(caracteres);
    }
}