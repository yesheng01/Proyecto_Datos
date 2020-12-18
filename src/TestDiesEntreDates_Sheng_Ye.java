/**
 * PACKAGE_NAME
 * Nombre_project: Proyecto Datos
 * TestDiesEntreDates_Sheng_Ye
 * Created by: sheng
 * Date : 15/12/2020
 * Description:
 **/
public class TestDiesEntreDates_Sheng_Ye {
        public static void main(String[] args) {
            DiesEntreDates_Sheng_Ye c1 = new DiesEntreDates_Sheng_Ye();
            try {
                DataXS Fechaprincipal = new DataXS("12/12/2017");
                DataXS FechaFinal = new DataXS("01/01/2018");
                System.out.println("Los dias entre dos fechas han sido: " +c1.nombreDiesTotals(Fechaprincipal,FechaFinal));
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

}
