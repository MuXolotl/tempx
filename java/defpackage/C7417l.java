package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: lؚٞۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7417l {
    public final long loadAd;
    public final InterfaceC1525l[] yandex;

    public C7417l(List list) {
        this((InterfaceC1525l[]) list.toArray(new InterfaceC1525l[0]));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7417l.class == obj.getClass()) {
            C7417l c7417l = (C7417l) obj;
            if (Arrays.equals(this.yandex, c7417l.yandex) && this.loadAd == c7417l.loadAd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3105l.billing(this.loadAd) + (Arrays.hashCode(this.yandex) * 31);
    }

    public final C7417l loadAd(C7417l c7417l) {
        return c7417l == null ? this : yandex(c7417l.yandex);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.yandex));
        long j = this.loadAd;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public final C7417l yandex(InterfaceC1525l... interfaceC1525lArr) {
        if (interfaceC1525lArr.length == 0) {
            return this;
        }
        String str = AbstractC15323l.yandex;
        InterfaceC1525l[] interfaceC1525lArr2 = this.yandex;
        Object[] objArrCopyOf = Arrays.copyOf(interfaceC1525lArr2, interfaceC1525lArr2.length + interfaceC1525lArr.length);
        System.arraycopy(interfaceC1525lArr, 0, objArrCopyOf, interfaceC1525lArr2.length, interfaceC1525lArr.length);
        return new C7417l(this.loadAd, (InterfaceC1525l[]) objArrCopyOf);
    }

    public C7417l(long j, InterfaceC1525l... interfaceC1525lArr) {
        this.loadAd = j;
        this.yandex = interfaceC1525lArr;
    }

    public C7417l(InterfaceC1525l... interfaceC1525lArr) {
        this(-9223372036854775807L, interfaceC1525lArr);
    }
}
