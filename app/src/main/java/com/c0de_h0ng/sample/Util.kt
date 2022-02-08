package com.c0de_h0ng.sample

import java.lang.NullPointerException
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*
import kotlin.jvm.Throws

object Util {

    @Throws(NullPointerException::class)
    private fun getDateFormat(originalFormat: String): SimpleDateFormat {
        return SimpleDateFormat(originalFormat, Locale.KOREA)
    }

    private fun formatToString(format: String, d: Date?): String {
        val sdf = getDateFormat(format)
        if (d == null) return ""
        return sdf.format(d)
    }

    @Throws(ParseException::class)
    fun parseToDate(format: String, date: String?): Date? {
        val sdf = getDateFormat(format)
        if (date == null) return null
        return sdf.parse(date)
    }

    @JvmStatic
    @Throws(ParseException::class)
    fun getConvertedFormatStr(date: String?, originalFormat: String, convertFormat: String): String {
        val d = parseToDate(originalFormat, date)
        return formatToString(convertFormat, d)
    }
    
}