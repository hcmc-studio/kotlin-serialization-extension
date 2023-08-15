package studio.hcmc.kotlin.serialization

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.JsonPrimitive

val Boolean?.json: JsonPrimitive get() = JsonPrimitive(this)

val Number?.json: JsonPrimitive get() = JsonPrimitive(this)

@ExperimentalSerializationApi
val UByte.json: JsonPrimitive get() = JsonPrimitive(this)

@ExperimentalSerializationApi
val UShort.json: JsonPrimitive get() = JsonPrimitive(this)

@ExperimentalSerializationApi
val UInt.json: JsonPrimitive get() = JsonPrimitive(this)

@ExperimentalSerializationApi
val ULong.json: JsonPrimitive get() = JsonPrimitive(this)

val String?.json: JsonPrimitive get() = JsonPrimitive(this)

@ExperimentalSerializationApi
val Nothing?.json: JsonPrimitive get() = JsonPrimitive(this)