package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: lْۙؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13615l {
    public final C8688l amazon;
    public final C6507l billing;
    public final C8688l crashlytics;
    public final C4865l loadAd;
    public final C8688l purchase;
    public final Context yandex;

    public C13615l(Context context, C4865l c4865l, C8688l c8688l, C8688l c8688l2, C8688l c8688l3, C6507l c6507l) {
        this.yandex = context;
        this.loadAd = c4865l;
        this.crashlytics = c8688l;
        this.amazon = c8688l2;
        this.purchase = c8688l3;
        this.billing = c6507l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13615l) {
            C13615l c13615l = (C13615l) obj;
            return AbstractC8576l.yandex(this.yandex, c13615l.yandex) && this.loadAd.equals(c13615l.loadAd) && this.crashlytics == c13615l.crashlytics && this.amazon == c13615l.amazon && this.purchase == c13615l.purchase && this.billing == c13615l.billing;
        }
        return false;
    }

    public final int hashCode() {
        return (this.billing.hashCode() + ((C3010l.f6524l.hashCode() + ((this.purchase.hashCode() + ((this.amazon.hashCode() + ((this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "Options(application=" + this.yandex + ", defaults=" + this.loadAd + ", mainCoroutineContextLazy=" + this.crashlytics + ", memoryCacheLazy=" + this.amazon + ", diskCacheLazy=" + this.purchase + ", eventListenerFactory=" + C3010l.f6524l + ", componentRegistry=" + this.billing + ", logger=null)";
    }
}
