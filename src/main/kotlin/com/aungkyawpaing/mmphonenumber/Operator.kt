package com.aungkyawpaing.mmphonenumber

enum class Operator(val operatorName: String, val regex: Regex) {

  OOREDOO("Ooredoo", Regex("^(09|\\+?959)9(5|7|6)\\d{7}\$")),

  TELENOR("Telenor", Regex("^(09|\\+?959)7(9|8|7|6)\\d{7}\$")),

  MPT(
    "Myanmar Posts and Telecommunications",
    Regex("^(09|\\+?959)(5\\d{6}|4\\d{7,8}|2\\d{6,8}|3\\d{7,8}|6\\d{6}|8\\d{6}|7\\d{7}|9(0|1|9)\\d{5,6}|2[0-4]\\d{5}|5[0-6]\\d{5}|8[13-7]\\d{5}|3[0-369]\\d{6}|34\\d{7}|4[1379]\\d{6}|73\\d{6}|91\\d{6}|25\\d{7}|26[0-5]\\d{6}|40[0-4]\\d{6}|42\\d{7}|45\\d{7}|89[6789]\\d{6}|)\$")
  ),

  MYTEL("MyTel", Regex("^(09|\\+?959)6\\d{8}\$")),

  UNKNOWN("Unknown", Regex(""));
}
