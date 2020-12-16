/**
 * PACKAGE_NAME
 * Nombre_project: Proyecto Datos
 * CalcularDiesEntreDates
 * Created by: sheng
 * Date : 15/12/2020
 * Description:
 **/
public abstract class CalcularDiesEntreDates {
    protected abstract int diesMes(int mes);
    protected abstract int diesMesInicial(DataXS dataXS);
    protected abstract int diesMesDesti(DataXS dataXS);
    protected abstract int diesResteAnyInicial(DataXS datainicial);
    protected abstract int diesResteAnyDesti(DataXS datadesti);
    protected abstract int diesNumAnysComplets(DataXS datainicial, DataXS datadesti);
    protected abstract int numDiesPerAnysdeTraspas(DataXS datainicial, DataXS datadesti);
    protected abstract boolean anyDeTraspas(int any);
    public final int nombreDiesTotals(DataXS datainicial, DataXS datadesti) {
        return this.diesMesInicial(datainicial)+
                this.diesResteAnyInicial(datainicial)+
                this.diesNumAnysComplets(datainicial,datadesti)+
                this.diesResteAnyDesti(datadesti)+
                this.diesMesDesti(datadesti)+
                this.numDiesPerAnysdeTraspas(datainicial,datadesti);
    }
}
