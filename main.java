import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class main {
    public static void main(String[] args) {

        List<noteBooks> noteBooks = new ArrayList<>();

        noteBooks note1 = new noteBooks("Acer", "Windows", "sdh7865", "8", "512", "Radeon");       
        noteBooks.add(note1);
        noteBooks note2 = new noteBooks("Apple", "MacOS", "h98998w", "32", "1028", "Nvidia");        
        noteBooks.add(note2);
        noteBooks note3 = new noteBooks("Asus", "Windows", "asd2023", "8", "256", "Nvidia");        
        noteBooks.add(note3);
        noteBooks note4 = new noteBooks("Apple", "MacOS", "drr555", "16", "512", "Radeon");        
        noteBooks.add(note4);
        noteBooks note5 = new noteBooks("Acer", "Windows", "1233sd", "8", "512", "Radeon");       
        noteBooks.add(note5);
        noteBooks note6 = new noteBooks("Dell", "Linux", "sdgsg14545", "16", "256", "Nvidia");       
        noteBooks.add(note6);

        System.out.println("Дорогой покупатель! Вас приветствует интернет-магазин <NoteBook-ONE>! ");
        System.out.println("В наличии доступны следующие варианты:");
        for (noteBooks elem : noteBooks) {
            System.out.println(elem);
        }
        
        select(noteBooks);

    }

    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        // scanner.close();
        return scan;
    }


        public static void select (List<noteBooks> noteBooks) {           
            
            System.out.println("Введите желаемые характеристики: 1 - производитель, 2 - ОС, 3 - модель, 4 - оперативная память, 5 - жесткий диск , 6 - видеокарта");
            String userSelect = scanner();
                if( userSelect.equals("1")){                   
                   
                    selectManufacturer(noteBooks);
                }
                if  (userSelect.equals("2")){
                    selectOS(noteBooks);
                }
                if (userSelect.equals("3")){
                    selectModel(noteBooks);
                }
                if (userSelect.equals("4")){
                    selectRAM(noteBooks);
                }
                if (userSelect.equals("5")){
                    selectHardDrive(noteBooks);
                }
                if (userSelect.equals("6")){
                    selectVideo(noteBooks);
                }
        }

      
        public static void  selectManufacturer(List<noteBooks> noteBooks) {  
            Set<String> select = new HashSet<>();
            System.out.println("Введите производителя Apple/Asus/Acer/Dell: ");
            String manufacturer = scanner();
            System.out.println("Доступные варианты:");
            for (noteBooks elem : noteBooks) {
                String str = elem.toString();
                if (str.contains(manufacturer)) {                    
                    System.out.println(str);
                }                 
            }
        }
    

        public static void selectOS(List<noteBooks> noteBooks) {
        System.out.println("Введите желаемые характеристики: OC(Windows, MacOS, Linux): ");
        String OS = scanner();
        System.out.println("Доступные варианты:");
        for (noteBooks elem : noteBooks) {
                String str = elem.toString();
                if (str.contains(OS)) {                    
                    System.out.println(str);
                }                
            }
        }


        public static void selectModel(List<noteBooks> noteBooks) {
            System.out.println("Введите модель: ");
            String model = scanner();
            System.out.println("Доступные варианты:");
            for (noteBooks elem : noteBooks) {
                String str = elem.toString();
                if (str.contains(model)) {                   
                    System.out.println(str);                
                }            
            }
        }

        public static void selectRAM(List<noteBooks> noteBooks) {
            System.out.println("Введите оперативную память 4/8/16 Гб: ");
            String RAM = scanner();
            System.out.println("Доступные варианты:");
            for (noteBooks elem : noteBooks) {
                String str = elem.toString();
                if (str.contains(RAM)) {                 
                    System.out.println(str);                
                }
            }
        }

        public static void selectHardDrive(List<noteBooks> noteBooks) {
            System.out.println("Жесткий диск 128/256/512 Гб: ");
            String HardDrive = scanner();
            System.out.println("Доступные варианты:");
            for (noteBooks elem : noteBooks) {
                String str = elem.toString();
                if (str.contains(HardDrive)) {                
                    System.out.println(str);                
                }
            }
        }

        public static void selectVideo(List<noteBooks> noteBooks) {
            System.out.println("Видеокарта Nvidia/Radeon: ");
            String Video = scanner();
            System.out.println("Доступные варианты:");
            for (noteBooks elem : noteBooks) {
                String str = elem.toString();
                if (str.contains(Video)) {                
                    System.out.println(str);                
                }
            }
        }
}