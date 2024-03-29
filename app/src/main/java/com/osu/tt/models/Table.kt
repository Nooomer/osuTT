package com.osu.tt.models

data class Table (
    val KODGROUP : Int,
    val NAMEGROUP : String,
    val KODSPEC : Int,
    val POTOK : Int,
    val NAMESUBJ : String,
    val KODSUBJ : Int,
    val SHORT_NAME_SUB : String,
    val ROOM_ID : Int,
    val AUD_ALL_LPAD : String,
    val TYPEZAN_NAME : String,
    val TYPEZAN_ID : Int,
    val TYPEZAN_SHORT_NAME : String,
    val DESCRIPTION : String,
    val NUM_PARE : Int,
    val NAME_DAY : String,
    val ID_DAY_OF_WEEK : Int,
    val NAME_TYPE_WEEK : String,
    val ID_TYPE_WEEK : Int,
    val FIO : String,
    val MAN_ID : Int,
    val NUM_PODGR : Int,
    val NUM_UNION : String,
    val COUNT_PODGR_ALL : Int,
    val CNT_GROUP_ON_ZAN : Int,
    val RAZOVOE : Int,
    val CONCRETN_DATE : String,
    val KURS : Int,
    val FIO_SOKR : String,
    val YEAR_CUR : Int,
    val TYPE_SEM_CUR : Int,
    val IS_BY_DAY_NOT_BY_DAY_OF_WEEK : Int,
    val DAY : String,
    val KODFILIAL : Int,
    val CARRY_FROM : String,
    val ABBR_DESCR_PODGRS : String,
    val NAME_DESCR_PODGRS : String,
    val KODOTDEL : Int
)
