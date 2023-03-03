import kotlin.math.roundToInt

class Operator(_operatorName: String, _costMinuteConversation: Double, _coverageArea: Double,
               _internetPower: String, _isCashFee: Boolean) :
    MobileOperator() {
    override var operatorName: String = _operatorName;
    override var costMinuteConversation: Double = _costMinuteConversation;
    override var coverageArea: Double = _coverageArea;

    override val internetPower: String = _internetPower;
    override val isCashFee: Boolean = _isCashFee;

    override fun getQp(): Double {
        if(isCashFee) {
            return (0.7 * getQ() * 100.0).roundToInt() / 100.0;
        } else {
            return (1.5 * getQ() * 100.0).roundToInt() / 100.0;
        }
    }
}
