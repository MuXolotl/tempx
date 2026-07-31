package org.mongodb.kbson;

import defpackage.AbstractC14814l;
import defpackage.C10754l;
import defpackage.C16003l;
import defpackage.C17918l;
import defpackage.C8339l;
import defpackage.InterfaceC16588l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\n\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"org/mongodb/kbson/BsonObjectId$Companion", "", "Llؘٖۘ;", "Llٌ٘ٔ;", "serializer", "()Llؘٖۘ;", "", "LOW_ORDER_THREE_BYTES", "I", "MILLIS_IN_SECOND", "NEXT_COUNTER", "Ljava/lang/Object;", "OBJECT_ID_LENGTH", "RANDOM_VALUE1", "", "RANDOM_VALUE2", "S", "kbson_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BsonObjectId$Companion {
    public static int loadAd(byte... bArr) {
        if (bArr.length == 4) {
            return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
        }
        C8339l.metrica("The byte array must be 4 bytes long.");
        return 0;
    }

    public static C17918l yandex(byte[] bArr) {
        if (bArr.length != 12) {
            C10754l.metrica(AbstractC14814l.remoteconfig(bArr.length, " != 12", new StringBuilder("invalid byteArray.size() ")));
            return null;
        }
        int iLoadAd = loadAd(bArr[0], bArr[1], bArr[2], bArr[3]);
        int iLoadAd2 = loadAd(0, bArr[4], bArr[5], bArr[6]);
        byte[] bArr2 = {bArr[7], bArr[8]};
        return new C17918l(iLoadAd, iLoadAd2, (short) (((bArr2[0] & 255) << 8) | (bArr2[1] & 255)), loadAd(0, bArr[9], bArr[10], bArr[11]));
    }

    public final InterfaceC16588l serializer() {
        return C16003l.yandex;
    }
}
