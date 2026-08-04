package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘؖٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4116l {
    public static volatile C4116l crashlytics = new C4116l();
    public final Function1 loadAd;
    public final boolean yandex;

    public C4116l() {
        C12250l c12250l = C12250l.f24307l;
        this.yandex = true;
        this.loadAd = c12250l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4116l)) {
            return false;
        }
        C4116l c4116l = (C4116l) obj;
        return this.yandex == c4116l.yandex && AbstractC8576l.yandex(this.loadAd, c4116l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + ((38347 + (this.yandex ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "DecomposeSettings(duplicateConfigurationsEnabled=false, mainThreadCheckEnabled=" + this.yandex + ", onDecomposeError=" + this.loadAd + ')';
    }
}
