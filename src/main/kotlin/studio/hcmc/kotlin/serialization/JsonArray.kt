package studio.hcmc.kotlin.serialization

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.JsonArray

fun List<Boolean?>.toJsonArray(): JsonArray {
    return JsonArray(map(Boolean?::json))
}

fun List<Number?>.toJsonArray(): JsonArray {
    return JsonArray(map(Number?::json))
}

@ExperimentalSerializationApi
fun List<UByte>.toJsonArray(): JsonArray {
    return JsonArray(map(UByte::json))
}

@ExperimentalSerializationApi
fun List<UShort>.toJsonArray(): JsonArray {
    return JsonArray(map(UShort::json))
}

@ExperimentalSerializationApi
fun List<UInt>.toJsonArray(): JsonArray {
    return JsonArray(map(UInt::json))
}

@ExperimentalSerializationApi
fun List<ULong>.toJsonArray(): JsonArray {
    return JsonArray(map(ULong::json))
}

fun List<String?>.toJsonArray(): JsonArray {
    return JsonArray(map(String?::json))
}

@ExperimentalSerializationApi
fun List<Nothing?>.toJsonArray(): JsonArray {
    return JsonArray(map(Nothing?::json))
}