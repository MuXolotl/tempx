package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؔۢۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2986l {
    public final ArrayList loadAd;
    public final String yandex;

    public C2986l(String str, ArrayList arrayList) {
        if (str == null) {
            C6541l.subs("Null userAgent");
            throw null;
        }
        this.yandex = str;
        this.loadAd = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2986l)) {
            return false;
        }
        C2986l c2986l = (C2986l) obj;
        return this.yandex.equals(c2986l.yandex) && this.loadAd.equals(c2986l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() ^ ((this.yandex.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.yandex + ", usedDates=" + this.loadAd + "}";
    }
}
