import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {
        //  nikolajUge4();
        //  jonUge5Lix();


        String s1 = "indsigelser.\n" + "\n" + "Resultatet";

        String eks = " rod skal findes i den teoretiske          nydannelse, der         kaldes poststrukturalisme,      der foretager et angreb";

        String teksten = "1                 2";

        teksten = eks;


        String demoTekst = "I dag er Gitte Seeberg administrerende direktør i interesseorganisationen";


        String [] strings = Tekst.tekstSplit(demoTekst);

        int maxindex = findMaxIndex(demoTekst);

        System.out.println(strings[maxindex]);

         String maxOrdRød = Tekst.markerOrd(strings[maxindex]);
        System.out.println(maxOrdRød);
        System.out.println(maxOrdRød.substring(5, maxOrdRød.length() - 4));



//          String s2 = fixLinjeSkift(s1);
//
//        System.out.println("før fix " + Tekst.findMaxOrd(s1));
//        System.out.println("efter fix " + Tekst.findMaxOrd(s2));

//        String tekst = Tools.læsFil("teksten.txt");
//
//        System.out.println(Tekst.findMaxOrd(tekst));
//
//
//        String s = " å#.ø€l osw.%e, lkjrd. nsdk' fjh a.åæe";
//        System.out.println(s);
//
//        System.out.println(rensTekst(s));


//        String s = Tools.læsFil("teksten.txt");
//               s = prepare(s);
//
//        System.out.println(findMaxIndex(s));
//
//        String [] t = Tekst.tekstSplit(s);
//
//        System.out.println(t[findMaxIndex(s)]);
//
//        int maxIndex = findMaxIndex(s);
//
////        System.out.println(Tekst.markerOrd(t[maxIndex]));
//         t[maxIndex] =  Tekst.markerOrd(t[maxIndex]);
//
//         String samletTekst = Tekst.join(t);
//
//        System.out.println(samletTekst);


    }   // her slutter min main;


    private static void a()
    {
        b();
    }

    private static void b()
    {
        c();
    }

    private static void c()
    {
        d();
    }
    private static void d()
    {
    }


    public static int findMaxIndex(String s) {

        String [] strings = Tekst.tekstSplit(s);

        String maxord ="";
        int maxIndex = -1;

        for (int i = 0; i < strings.length  ; i++) {

            if (maxord.length() < strings[i].length()) {

                maxord = strings[i];
                maxIndex = i;
            }


        }
        return maxIndex;
    }

    public static String prepare (String s) {

//        s = fixLinjeSkift(s);
//
//        s = fixMellemrum(s);
//
//        s = rensTekst(s);

      //return s;

       return rensTekst(fixMellemrum(fixLinjeSkift(s)));
    }


    public static String findMaxOrd(String s)
    {

        String max = "";

        String[] strings = Tekst.tekstSplit(s);

        for (int i = 0; i < strings.length; i++) {

            if (max.length() < strings[i].length()) {

                max = strings[i];
                System.out.println("forløbig længste ord " + max);
            }

        }

     return max;
    }


    public static String fixMellemrum(String teksten)
    {

        while (teksten.contains("  ")) {
            teksten = teksten.replace("  ", " ");
            System.out.println(teksten);
        }

        return teksten;
    }


    public static String fixLinjeSkift(String s)
    {

        // s = s.replace("\n" , " \n");

        return s.replace("\n", " \n");

    }

    public static String rensTekst(String s)
    {

        String specialtegn = "!\"#€%&/()=?*^'.,»«";
        String[] tegn = specialtegn.split("");

        for (int i = 0; i < tegn.length; i++) {

            s = s.replace(tegn[i], "");

        }

        return s;

    }


    private static void jonUge5Lix()
    {
        System.out.println("*********** Gitte lix tekstanalyse ****************");
        String tekst = Tools.læsFil("gitte.txt");
        System.out.println("Længde: " + tekst.length() + " tegn");
        System.out.println("Antal sætninger: " + Tekst.findAntalSætninger(tekst));
        System.out.println("Antal ord: " + Tekst.findAntalOrd(tekst));
        String[] alleOrd = Tekst.findAlleOrd(tekst);
        System.out.println("Antal lange ord: " + Tekst.findAntalLangeOrd(alleOrd));
        System.out.println("Lix-tal: " + Tekst.lix(tekst));
        System.out.println(Tekst.findAlleOrdOgMarkerDeLange(alleOrd));
        //System.out.println(Tekst.findAlleOrdOgMarkerDeLange(Tekst.tekstSplit(tekst)));

    }

    private static void nikolajUge4()
    {
        String sætning = "snydetampen. Eller Vaskebjørn alt, ";
        String analyse = "0123456789  12345 0123456789 ";

        String[] ord = Tekst.tekstSplit(sætning);

//        String s = "0123456789";
//        String subS = s.substring(s.length()-1, s.length() );
//        System.out.println(subS);

        //  System.out.println(specialTegn(ord[0]));

        System.out.println(Tekst.findMaxIndex(sætning));
        System.out.println(Tekst.findMaxOrd(sætning));

        //Farver farver = new Farver();
        //String rød = farver.RED_ANSI;
        // String rød = Farver.RED_ANSI;

        System.out.println((Tekst.markerOrd(ord[0])));
        System.out.println(Tekst.markerOrd(ord[1]));
        System.out.println(Tekst.markerOrd(ord[2]));

        System.out.println(Tekst.markerAlleMaxOrd(sætning));
    }


}
