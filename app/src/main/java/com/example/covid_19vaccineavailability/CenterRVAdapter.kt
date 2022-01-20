package com.example.covid_19vaccineavailability

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CenterRVAdapter(private val centerList:List<CenterRVModel>):RecyclerView.Adapter<CenterRVAdapter.CenterRVViewHolder>() {


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CenterRVViewHolder {
       val itemView=LayoutInflater.from(p0.context).inflate(R.layout.center_rv_item,p0,false)
        return CenterRVViewHolder(itemView)
    }

    override fun onBindViewHolder(p0: CenterRVViewHolder, p1: Int) {
        val center=centerList[p1]

        p0.centerNameTV.text=center.centerName
        p0.centerAddressTV.text=center.centerAddress
        p0.centerTimingsTV.text=("From: ${center.centerFromTime} To: ${center.centerToTime}")
        p0.vaccineNameTV.text=center.vaccineName
        p0.vaccineFeesTV.text=center.fee_type
        p0.ageLimitTv.text="Age Limit : ${center.ageLimit}"
        p0.avaliabilityTv.text="Availability : ${center.availiableCapacity}"
    }

    override fun getItemCount(): Int {
        return centerList.size
    }

    class CenterRVViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val centerNameTV:TextView=itemView.findViewById(R.id.idTVCenterName)
        val centerAddressTV:TextView=itemView.findViewById(R.id.idTVCenterLocation)
        val centerTimingsTV:TextView=itemView.findViewById(R.id.idTVCenterTimings)
        val vaccineNameTV:TextView=itemView.findViewById(R.id.idTVaccineName)
        val vaccineFeesTV:TextView=itemView.findViewById(R.id.idTVVaccinesFees)
        val ageLimitTv:TextView=itemView.findViewById(R.id.idTVAgeLimit)
        val avaliabilityTv:TextView=itemView.findViewById(R.id.idTVAvaliability)


    }
}