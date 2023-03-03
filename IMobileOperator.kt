interface IMobileOperator {
    val operatorName: String;
    val costMinuteConversation: Double;
    val coverageArea: Double;

    fun getFullInfo()
    fun getOperatorName()
}