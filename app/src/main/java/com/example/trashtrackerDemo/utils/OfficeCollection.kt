package com.example.trashtrackerDemo.utils

import com.example.trashtrackerDemo.contants.DustbinPosition
import com.example.trashtrackerDemo.contants.OfficePosition

object OfficeCollection {
    fun getOfficeList():ArrayList<OfficePosition>
    {
        val officeList = ArrayList<OfficePosition>()
        officeList.add(OfficePosition(25.5941947,85.1275645))
        officeList.add(OfficePosition(25.5141947,85.2275645))
        officeList.add(OfficePosition(25.6941947,85.3275645))
        officeList.add(OfficePosition(25.5991947,85.1275645))
        officeList.add(OfficePosition(13.4033513,74.70888152))
        officeList.add(OfficePosition(13.571765,74.700812))
        officeList.add(OfficePosition(13.3369,74.7395))

        return officeList
    }
}