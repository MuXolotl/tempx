package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lًؖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3981l {
    public final ArrayList loadAd;
    public final int yandex;

    public C3981l(int i, ArrayList arrayList) {
        this.yandex = i;
        this.loadAd = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3981l)) {
            return false;
        }
        C3981l c3981l = (C3981l) obj;
        return this.yandex == c3981l.yandex && this.loadAd.equals(c3981l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex * 31);
    }

    public final String toString() {
        return "MiniPlayerTrackElements(index=" + this.yandex + ", elements=" + this.loadAd + ')';
    }
}
