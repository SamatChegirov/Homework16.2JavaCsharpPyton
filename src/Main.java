/*        Backend деген класс тузүңүз жана бир метод кошуңуз.
        Анын 3 мурас класстарын түзүңүз.
        Java деген класска spring(), CSharp деген класска dotNet() жана Python деген класска django() методторун түзөсүз.
        Backend тибин колдонуп массив түзүңүз жана ал жакка анын мурастарын кошуңуз.
        instanceOf жана getClass() колдонуп Backend массивиндеги тилдердин өздөрүнүн методдорун чыгарыңыз.*/
public class Main {
    public static void main(String[] args) {



        Backand java = new Java();
        Backand cSharp = new CSharp();
        Backand python = new Python();

        boolean jv = java instanceof CSharp;
        System.out.println(jv);

        Backand[] back = {java, cSharp, python};
        for (Backand b : back) {
            System.out.println(b.getClass());
        }



    }
}