/**
 * PACKAGE_NAME
 * Nombre_project: Proyecto Datos
 * TestDiesEntreDates_Sheng_Ye
 * Created by: sheng
 * Date : 15/12/2020
 * Description:
 **/
public class TestDiesEntreDates_Sheng_Ye {
        private static DiesEntreDates_Sheng_Ye calcul;
        private static DataXS inici, desti;

        public static void main(String[] args) {
            calcul = new DiesEntreDates_Sheng_Ye();
            try {
                inici = new DataXS("12/12/2017");
                desti = new DataXS("1/1/2018");
                System.out.println(calcul.nombreDiesTotals(inici,desti));
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }


}
