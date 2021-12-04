import java.util.Scanner;
public class  Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Дано текст и определенное  слово. Посчитать сколько раз заданное слово встречается в тексте.";
        String s1 = s.replace(".", "").replace("!", "").replace("?", "").toLowerCase();
        String[] sArr = s1.split(" ");
        System.out.println("Введите слово для поиска: ");
        String word = sc.nextLine();
        int count = 0;
        for (int i = 0; i < sArr.length; i++) {
        //    if (sArr.contains(word))
                count++;
        }
        System.out.println("'" + word + "' повторяется " + count + " раз");
    }
}