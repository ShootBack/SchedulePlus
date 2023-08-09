package com.shootback.scheduleplus.domain.day

import com.shootback.scheduleplus.R
import com.shootback.scheduleplus.domain.subject.Subject

sealed class Day(val id: Int, val nameResId: Int, var listOfSubjects: List<Subject>? = null) {
    object Monday : Day(0, R.string.day_of_week_monday)
    object Tuesday : Day(1, R.string.day_of_week_tuesday)
    object Wednesday : Day(2, R.string.day_of_week_wednesday)
    object Thursday : Day(3, R.string.day_of_week_thursday)
    object Friday : Day(4, R.string.day_of_week_friday)
    object Saturday : Day(5, R.string.day_of_week_saturday)
    object Sunday : Day(6, R.string.day_of_week_sunday)
}