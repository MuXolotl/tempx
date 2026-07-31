package defpackage;

import android.os.Build;

/* JADX INFO: renamed from: lٔٔۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14900l extends AbstractC12432l {
    public static final String loadAd = C14513l.applovin("NetworkNotRoamingCtrlr");

    @Override // defpackage.AbstractC12432l
    public final int amazon() {
        return 7;
    }

    @Override // defpackage.InterfaceC4117l
    public final boolean crashlytics(C7718l c7718l) {
        return c7718l.isPro.yandex == 4;
    }

    @Override // defpackage.AbstractC12432l
    public final boolean purchase(Object obj) {
        C9415l c9415l = (C9415l) obj;
        boolean z = c9415l.purchase;
        boolean z2 = c9415l.yandex;
        if (Build.VERSION.SDK_INT >= 24) {
            return (z2 && c9415l.amazon && !z) ? false : true;
        }
        C14513l.tapsense().vip(loadAd, "Not-roaming network constraint is not supported before API 24, only checking for connected state.");
        return !z2 || z;
    }
}
