package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: lؔۥَ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3026l {
    public final C7972l amazon;
    public final C4015l billing;
    public final C18595l crashlytics;
    public final C10717l loadAd;
    public final C9066l purchase;
    public final Context yandex;

    public C3026l(Context context, C10717l c10717l, C9066l c9066l) {
        C18595l c18595l = new C18595l(11);
        C7972l c7972l = new C7972l(5);
        C4015l c4015l = new C4015l();
        this.yandex = context;
        this.loadAd = c10717l;
        this.crashlytics = c18595l;
        this.amazon = c7972l;
        this.purchase = c9066l;
        this.billing = c4015l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3026l)) {
            return false;
        }
        C3026l c3026l = (C3026l) obj;
        return AbstractC8576l.yandex(this.yandex, c3026l.yandex) && AbstractC8576l.yandex(this.loadAd, c3026l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c3026l.crashlytics) && AbstractC8576l.yandex(this.amazon, c3026l.amazon) && AbstractC8576l.yandex(this.purchase, c3026l.purchase) && AbstractC8576l.yandex(this.billing, c3026l.billing);
    }

    public final int hashCode() {
        int iHashCode = (this.purchase.hashCode() + ((this.amazon.hashCode() + ((this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31)) * 31)) * 31)) * 961;
        this.billing.getClass();
        return (1237 + iHashCode) * 31;
    }

    public final String toString() {
        return "Config(appContext=" + this.yandex + ", threadConfig=" + this.loadAd + ", cameraMetadataConfig=" + this.crashlytics + ", cameraBackendConfig=" + this.amazon + ", cameraInteropConfig=" + this.purchase + ", imageSources=null, flags=" + this.billing + ", platformApiCompat=null)";
    }
}
