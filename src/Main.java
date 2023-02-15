/*        Backend деген класс тузүңүз жана бир метод кошуңуз.
        Анын 3 мурас класстарын түзүңүз.
        Java деген класска spring(), CSharp деген класска dotNet() жана Python деген класска django() методторун түзөсүз.
        Backend тибин колдонуп массив түзүңүз жана ал жакка анын мурастарын кошуңуз.
        instanceOf жана getClass() колдонуп Backend массивиндеги тилдердин өздөрүнүн методдорун чыгарыңыз.*/
public class Main {
    public static void main(String[] args) {

        Java java = new Java();
        CSharp cSharp = new CSharp();
        Python python = new Python();

        boolean jv = java instanceof Java;
        boolean cSh = cSharp instanceof CSharp;
        boolean py = python instanceof Python;
        System.out.println(jv + "\n" + cSh + "\n" + py);

        Backand[] back = {java, cSharp, python};
        for (Backand b : back) {
            System.out.println(b.getClass());
        }
        System.out.println("\n" + java.spring() + "\n" + cSharp.dotNet() + "\n" + python.django());

    }
}