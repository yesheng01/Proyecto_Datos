/**
 * PACKAGE_NAME
 * Nombre_project: Proyecto Datos
 * DiesEntreDates_Sheng_Ye
 * Created by: sheng
 * Date : 15/12/2020
 * Description:
 **/
public class DiesEntreDates_Sheng_Ye extends CalcularDiesEntreDates {

    //Array que contiene dia de meses.
    protected int[] diaMes = new int[]{
            31, 28, 31,
            30, 31, 30,
            31, 31, 30,
            31, 30, 31
    };

    //Dia que tocaria en los meses
    protected int diesMes(int mes) {
        return this.diaMes[mes - 1];
    }

    //Se resta los dias de los meses con el numero de dia que le pasemos luego.
    protected int diesMesInicial(DataXS datainicial) {
        return  this.diesMes(datainicial.mes) - datainicial.dia;
    }

    //Calcula restando los dias que han pasado desde el destino.
    protected int diesMesDesti(DataXS datainicial) {
        return datainicial.dia;
    }

    //Calcula el resto de dias que quedan del año
    protected int diesResteAnyInicial(DataXS datainicial) {
        int diarestantsinicial = this.diesMesInicial(datainicial);
        for (int i = datainicial.mes +1; i <=12; i++) {
            diarestantsinicial = diarestantsinicial + this.diaMes[i];
        }
        return diarestantsinicial - this.diesMesInicial(datainicial);
    }

    //Calcular los dias que han pasado del año
    protected int diesResteAnyDesti(DataXS datadesti) {
        int diesrestantsdestino = this.diesMesDesti(datadesti);
        for (int i = 0; i < datadesti.mes - 1; i++) {
            diesrestantsdestino = diesrestantsdestino + diaMes[i];
        }
        return diesrestantsdestino - this.diesMesDesti(datadesti);
    }

    //Calcular los dias entre dos fechas en que no sean bisiestos
    protected int diesNumAnysComplets(DataXS datainicial, DataXS datadesti) {
        return (((datadesti.any) - (datainicial.any + 1)) * 365);
    }

    //Calcular los dias entre dos fechas si son bisiestos
    protected int numDiesPerAnysdeTraspas(DataXS datainicial, DataXS datadesti) {
        int AnyTraspass = 0;
        for (int i = datainicial.any + 1; i < datainicial.any + (datadesti.any - datainicial.any); i++){
            if (anyDeTraspas(i)) AnyTraspass += 366;
        }
        return AnyTraspass;
    }

    //pasa a calcular el año si es bisiesto
    protected boolean anyDeTraspas(int any) {
        return (any % 400 == 0) || ((any % 4 == 0) && !(any % 100 == 0));
    }
}
