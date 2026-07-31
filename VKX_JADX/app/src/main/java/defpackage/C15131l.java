package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lْٔۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15131l {
    public final C2673l amazon;
    public final C2401l crashlytics;
    public final Boolean loadAd;
    public final C2673l purchase;
    public final EnumC5421l yandex;

    public /* synthetic */ C15131l(C3557l c3557l) {
        this.yandex = (EnumC5421l) c3557l.f7480l;
        this.loadAd = (Boolean) c3557l.f7479l;
        this.crashlytics = (C2401l) c3557l.f7478l;
        this.amazon = (C2673l) c3557l.f7482l;
        this.purchase = (C2673l) c3557l.f7481l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15131l)) {
            return false;
        }
        C15131l c15131l = (C15131l) obj;
        return AbstractC7236l.amazon(this.yandex, c15131l.yandex) && AbstractC7236l.amazon(null, null) && AbstractC7236l.amazon(this.loadAd, c15131l.loadAd) && AbstractC7236l.amazon(null, null) && AbstractC7236l.amazon(this.crashlytics, c15131l.crashlytics) && AbstractC7236l.amazon(this.amazon, c15131l.amazon) && AbstractC7236l.amazon(this.purchase, c15131l.purchase);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.yandex, null, this.loadAd, null, this.crashlytics, this.amazon, this.purchase});
    }
}
