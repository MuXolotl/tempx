package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lّٓ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14459l {
    public final List loadAd;
    public final C3624l yandex;

    public C14459l(C3624l c3624l, List list) {
        this.yandex = c3624l;
        this.loadAd = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14459l)) {
            return false;
        }
        C14459l c14459l = (C14459l) obj;
        return AbstractC8576l.yandex(this.yandex, c14459l.yandex) && this.loadAd.equals(c14459l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassRequest(classId=");
        sb.append(this.yandex);
        sb.append(", typeParametersCount=");
        return AbstractC0653l.subscription(sb, this.loadAd, ')');
    }
}
