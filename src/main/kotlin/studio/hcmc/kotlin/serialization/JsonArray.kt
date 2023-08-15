package studio.hcmc.kotlin.serialization

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.JsonArray

@JvmName("toBooleanJsonArray")
fun List<Boolean?>.toJsonArray(): JsonArray {
    return JsonArray(map(Boolean?::json))
}

@JvmName("toNumberJsonArray")
fun List<Number?>.toJsonArray(): JsonArray {
    return JsonArray(map(Number?::json))
}

@JvmName("toUByteJsonArray")
@ExperimentalSerializationApi
fun List<UByte>.toJsonArray(): JsonArray {
    return JsonArray(map(UByte::json))
}

@JvmName("toUShortJsonArray")
@ExperimentalSerializationApi
fun List<UShort>.toJsonArray(): JsonArray {
    return JsonArray(map(UShort::json))
}

@JvmName("toUIntJsonArray")
@ExperimentalSerializationApi
fun List<UInt>.toJsonArray(): JsonArray {
    return JsonArray(map(UInt::json))
}

@JvmName("toULongJsonArray")
@ExperimentalSerializationApi
fun List<ULong>.toJsonArray(): JsonArray {
    return JsonArray(map(ULong::json))
}

@JvmName("toStringJsonArray")
fun List<String?>.toJsonArray(): JsonArray {
    return JsonArray(map(String?::json))
}

@JvmName("toNothingJsonArray")
@ExperimentalSerializationApi
fun List<Nothing?>.toJsonArray(): JsonArray {
    return JsonArray(map(Nothing?::json))
}