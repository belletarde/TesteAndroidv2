package projects.kevin.bankapp.utils

import android.annotation.SuppressLint
import java.math.BigDecimal
import java.math.RoundingMode
import java.text.SimpleDateFormat

fun formatMoney(balance: BigDecimal): String {
    val numberFormat = java.text.DecimalFormat(",#00.00#")
    return numberFormat.format(balance.setScale(2, RoundingMode.HALF_UP))
}

fun turnToPositiveValue(value: BigDecimal): BigDecimal {
    if(value < BigDecimal(0)) {
        return value.multiply(BigDecimal(-1))
    }

    return value
}

@SuppressLint("SimpleDateFormat")
fun parseDate(dateString: String): String {
    val initDate = SimpleDateFormat("yyyy-MM-dd").parse(dateString)
    val formatter = SimpleDateFormat("dd/MM/yyyy")
    return formatter.format(initDate)
}