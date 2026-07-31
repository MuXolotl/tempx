package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِٔۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14843l {
    public final boolean amazon;
    public final boolean crashlytics;
    public final int loadAd;
    public final Function1 purchase;
    public final int yandex;

    public C14843l(int i, int i2, boolean z, boolean z2, Function1 function1) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = z;
        this.amazon = z2;
        this.purchase = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14843l)) {
            return false;
        }
        C14843l c14843l = (C14843l) obj;
        return this.yandex == c14843l.yandex && this.loadAd == c14843l.loadAd && this.crashlytics == c14843l.crashlytics && this.amazon == c14843l.amazon && this.purchase.equals(c14843l.purchase);
    }

    public final int hashCode() {
        return this.purchase.hashCode() + (((((((this.yandex * 31) + this.loadAd) * 31) + (this.crashlytics ? 1231 : 1237)) * 31) + (this.amazon ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "Button(icon=" + this.yandex + ", name=" + this.loadAd + ", accented=" + this.crashlytics + ", plusGray=" + this.amazon + ", clickAction=" + this.purchase + ')';
    }
}
