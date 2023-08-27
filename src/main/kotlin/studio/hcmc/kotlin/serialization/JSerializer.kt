package studio.hcmc.kotlin.serialization

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi

/**
 * Serializer가 존재하지 않는 class에 대해 Java Object serialization: Object -> byte[] -> Base64
 */
@ExperimentalEncodingApi
class JSerializer<T> : KSerializer<T> {
    override val descriptor = PrimitiveSerialDescriptor("JSerializer", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, value: T) {
        val bytes = ByteArrayOutputStream().use { byteArrayOutputStream ->
            ObjectOutputStream(byteArrayOutputStream).use { objectOutputStream ->
                objectOutputStream.writeObject(value)
            }

            byteArrayOutputStream.toByteArray()
        }
        encoder.encodeString(Base64.encode(bytes))
    }

    @Suppress("UNCHECKED_CAST")
    override fun deserialize(decoder: Decoder): T {
        return ByteArrayInputStream(Base64.decode(decoder.decodeString())).use { byteArrayInputStream ->
            ObjectInputStream(byteArrayInputStream).use { objectInputStream ->
                objectInputStream.readObject()
            }
        } as T
    }
}