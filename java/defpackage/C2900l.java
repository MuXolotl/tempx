package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؔۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2900l {
    public final Function1 crashlytics;
    public final String loadAd;
    public final int yandex;

    public C2900l(int i, String str, Function1 function1) {
        this.yandex = i;
        this.loadAd = str;
        this.crashlytics = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2900l)) {
            return false;
        }
        C2900l c2900l = (C2900l) obj;
        return this.yandex == c2900l.yandex && AbstractC8576l.yandex(this.loadAd, c2900l.loadAd) && this.crashlytics.equals(c2900l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + AbstractC12589l.advert(this.yandex * 31, 31, this.loadAd);
    }

    public final String toString() {
        return "Element(icon=" + this.yandex + ", name=" + this.loadAd + ", clickAction=" + this.crashlytics + ')';
    }
}
