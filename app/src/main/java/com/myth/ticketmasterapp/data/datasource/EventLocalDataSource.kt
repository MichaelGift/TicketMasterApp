package com.myth.ticketmasterapp.data.datasource

import androidx.lifecycle.LiveData
import com.myth.ticketmasterapp.data.eventdatamodels.Event

interface EventLocalDataSource {

    suspend fun getEventsFromDB(): List<Event>
    suspend fun saveEventToDB(events:Event)
    suspend fun deleteEvent(events: Event)
    suspend fun getEventById(eventId: String): List<Event>?
}