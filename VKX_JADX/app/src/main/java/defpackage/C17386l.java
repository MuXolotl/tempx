package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٗۚؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17386l {
    public final String amazon;
    public final int crashlytics;
    public final int loadAd;
    public final Function0 purchase;
    public final int yandex;

    public C17386l(int i, int i2, int i3, String str, Function0 function0, int i4) {
        i3 = (i4 & 4) != 0 ? -1 : i3;
        str = (i4 & 8) != 0 ? "" : str;
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = i3;
        this.amazon = str;
        this.purchase = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17386l)) {
            return false;
        }
        C17386l c17386l = (C17386l) obj;
        return this.yandex == c17386l.yandex && this.loadAd == c17386l.loadAd && this.crashlytics == c17386l.crashlytics && this.amazon.equals(c17386l.amazon) && this.purchase.equals(c17386l.purchase);
    }

    public final int hashCode() {
        return this.purchase.hashCode() + ((((this.amazon.hashCode() + (((((this.yandex * 31) + this.loadAd) * 31) + this.crashlytics) * 31)) * 31) + 1237) * 31);
    }

    public final String toString() {
        return "StaticMenuItem(icon=" + this.yandex + ", title=" + this.loadAd + ", text=" + this.crashlytics + ", textString=" + this.amazon + ", prominent=false, onClick=" + this.purchase + ')';
    }
}
