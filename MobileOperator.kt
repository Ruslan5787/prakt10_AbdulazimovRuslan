import kotlin.math.roundToInt

abstract class MobileOperator(

) : IMobileOperator {

    abstract val internetPower: String;
    abstract val isCashFee: Boolean;

    override var operatorName: String = "";
    override val costMinuteConversation: Double = 0.0;
    override val coverageArea: Double = 0.0;

    fun getQ(): Double {
        return (100 * coverageArea / costMinuteConversation * 100.0).roundToInt() / 100.0;
    }

    abstract fun getQp(): Double


    override fun getFullInfo() {
        println("Имя оператора - ${operatorName}. Цена за 1 минуты - ${costMinuteConversation}. Площадь покрытия - ${coverageArea}.");
    }

    override fun getOperatorName() {
        println("Имя оператора - ${operatorName}.");
    }
}
