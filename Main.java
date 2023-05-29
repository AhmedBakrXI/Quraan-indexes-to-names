/*
 *
 * @author: Ahmed Bakr
 * This program was used to rename Quraan names on my computer from indexes as 001 -> 1.الفاتحة
 * for example
 *
 */


import java.io.File;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String[] surahNames = {
                "الفاتحة",
                "البقرة",
                "آل عمران",
                "النساء",
                "المائدة",
                "الأنعام",
                "الأعراف",
                "الأنفال",
                "التوبة",
                "يونس",
                "هود",
                "يوسف",
                "الرعد",
                "إبراهيم",
                "الحجر",
                "النحل",
                "الإسراء",
                "الكهف",
                "مريم",
                "طه",
                "الأنبياء",
                "الحج",
                "المؤمنون",
                "النور",
                "الفرقان",
                "الشعراء",
                "النمل",
                "القصص",
                "العنكبوت",
                "الروم",
                "لقمان",
                "السجدة",
                "الأحزاب",
                "سبأ",
                "فاطر",
                "يس",
                "الصافات",
                "ص",
                "الزمر",
                "غافر",
                "فصلت",
                "الشورى",
                "الزخرف",
                "الدخان",
                "الجاثية",
                "الأحقاف",
                "محمد",
                "الفتح",
                "الحجرات",
                "ق",
                "الذاريات",
                "الطور",
                "النجم",
                "القمر",
                "الرحمن",
                "الواقعة",
                "الحديد",
                "المجادلة",
                "الحشر",
                "الممتحنة",
                "الصف",
                "الجمعة",
                "المنافقون",
                "التغابن",
                "الطلاق",
                "التحريم",
                "الملك",
                "القلم",
                "الحاقة",
                "المعارج",
                "نوح",
                "الجن",
                "المزمل",
                "المدثر",
                "القيامة",
                "الإنسان",
                "المرسلات",
                "النبأ",
                "النازعات",
                "عبس",
                "التكوير",
                "الإنفطار",
                "المطففين",
                "الإنشقاق",
                "البروج",
                "الطارق",
                "الأعلى",
                "الغاشية",
                "الفجر",
                "البلد",
                "الشمس",
                "الليل",
                "الضحى",
                "الشرح",
                "التين",
                "العلق",
                "القدر",
                "البينة",
                "الزلزلة",
                "العاديات",
                "القارعة",
                "التكاثر",
                "العصر",
                "الهمزة",
                "الفيل",
                "قريش",
                "الماعون",
                "الكوثر",
                "الكافرون",
                "النصر",
                "المسد",
                "الإخلاص",
                "الفلق",
                "الناس"

        };

        File appFile = new File("src/القرآن الكريم");
        if(appFile.mkdir()){
            System.out.print("Creating Directory: " + appFile.getAbsolutePath());
            Thread.sleep(1000); // All delays are only for view purposes
        }
        for (int i = 114; i >= 100; i--) {
            File oldName = new File("src/Quraan/" + i + ".mp3");
            File newName = new File("src/القرآن الكريم/" + i + ". " + surahNames[i - 1] + ".mp3");
            if(oldName.renameTo(newName)) {
                System.out.println("Old name: " + oldName.getName());
                System.out.println("New name: " + newName.getName());
                Thread.sleep(100);
            }
        }
        for (int i = 99; i >= 10; i--) {
            File oldName = new File("src/Quraan/0" + i + ".mp3");
            File newName = new File("src/القرآن الكريم/" + i + ". " + surahNames[i - 1] + ".mp3");
            if(oldName.renameTo(newName)) {
                System.out.println("Old name: " + oldName.getName());
                System.out.println("New name: " + newName.getName());
                Thread.sleep(100);
            }
        }
        for (int i = 9; i >= 1; i--) {
            File oldName = new File("src/Quraan/00" + i + ".mp3");
            File newName = new File("src/القرآن الكريم/" + i + ". " + surahNames[i - 1] + ".mp3");
            if(oldName.renameTo(newName)) {
                System.out.println("Old name: " + oldName.getName());
                System.out.println("New name: " + newName.getName());
                Thread.sleep(100);
            }
        }
    }
}