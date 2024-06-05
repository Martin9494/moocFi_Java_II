


public class Program {

    public static void main(String[] args) {
        // Test
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");
        dictionary.add("bow", "jousi");
        dictionary.add("bow", "kumartaa");
        System.out.println("lie:");
        System.out.println(dictionary.translate("lie"));
        System.out.println("bow:");
        System.out.println(dictionary.translate("bow"));
        dictionary.remove("bow");
        System.out.println(dictionary.translate("bow"));


        
    }
}
