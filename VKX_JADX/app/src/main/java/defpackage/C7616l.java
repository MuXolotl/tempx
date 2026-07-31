package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؙؚۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l
public final class C7616l {
    public static final C12193l Companion = new C12193l();
    public final C3919l yandex;

    public C7616l(C13520l c13520l) {
        int[] iArr = AbstractC15453l.yandex;
        byte[] bArr = c13520l.f26534l;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2 += 3) {
            int i3 = ((bArr[i2] & 255) << 16) & 16777215;
            int i4 = i2 + 1;
            if (i4 < bArr.length) {
                i3 |= (bArr[i4] & 255) << 8;
            } else {
                i++;
            }
            int i5 = i2 + 2;
            if (i5 < bArr.length) {
                i3 |= bArr[i5] & 255;
            } else {
                i++;
            }
            int i6 = 4 - i;
            for (int i7 = 0; i7 < i6; i7++) {
                arrayList.add(Byte.valueOf((byte) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((16515072 & i3) >> 18)));
                i3 <<= 6;
            }
        }
        for (int i8 = 0; i8 < i; i8++) {
            arrayList.add((byte) 61);
        }
        this.yandex = new C3919l(AbstractC16648l.ads(AbstractC16901l.m4246transient(arrayList)), AbstractC8669l.m2397case(new byte[]{c13520l.f26535l}, "", C16274l.f31848l, 30));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7616l) && AbstractC8576l.yandex(this.yandex, ((C7616l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "BsonValueJson(data=" + this.yandex + ')';
    }

    public C7616l(int i, C3919l c3919l) {
        if (1 == (i & 1)) {
            this.yandex = c3919l;
        } else {
            AbstractC11036l.isPro(i, 1, C14887l.loadAd);
            throw null;
        }
    }
}
