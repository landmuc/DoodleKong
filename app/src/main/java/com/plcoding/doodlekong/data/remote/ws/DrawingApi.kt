package com.plcoding.doodlekong.data.remote.ws

import com.plcoding.doodlekong.data.remote.ws.models.BaseModel
import com.tinder.scarlet.WebSocket
import com.tinder.scarlet.ws.Receive
import com.tinder.scarlet.ws.Send
import kotlinx.coroutines.flow.Flow

// 1) fun to observer websocket events
// 2) fun to send a piece of websocket data
// 3) fun observe all incoming messages
interface DrawingApi {

    @Receive
    fun observeEvents(): Flow<WebSocket.Event>

    // all of our websocket messages are of type BaseModel()
    @Send
    fun sendBaseModel(baseModel: BaseModel): Boolean

    @Receive
    fun observeBaseModels(): Flow<BaseModel>
}