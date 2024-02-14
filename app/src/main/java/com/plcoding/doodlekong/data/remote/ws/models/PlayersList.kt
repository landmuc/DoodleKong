package com.plcoding.doodlekong.data.remote.ws.models

import com.plcoding.doodlekong.util.Constants.TYPE_PLAYERS_LIST


// no need to add this to the websocket when expression
// because the players list is only send by the server to the clients
// and not the other way around
data class PlayersList(
    val players: List<PlayerData>
): BaseModel(TYPE_PLAYERS_LIST)
