package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٖؕۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16179l {
    public final Function1 crashlytics;
    public final int loadAd;
    public final int yandex;

    public C16179l(int i, int i2, Function1 function1) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16179l)) {
            return false;
        }
        C16179l c16179l = (C16179l) obj;
        return this.yandex == c16179l.yandex && this.loadAd == c16179l.loadAd && this.crashlytics.equals(c16179l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + (((this.yandex * 31) + this.loadAd) * 31);
    }

    public final String toString() {
        return "SuggestedAction(name=" + this.yandex + ", icon=" + this.loadAd + ", onClick=" + this.crashlytics + ')';
    }
}
