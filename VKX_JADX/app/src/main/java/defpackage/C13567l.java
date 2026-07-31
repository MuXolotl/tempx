package defpackage;

import android.os.Build;

/* JADX INFO: renamed from: lْۖؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13567l implements InterfaceC13564l {
    public final InterfaceC1465l loadAd;

    public C13567l() {
        this.loadAd = Build.VERSION.SDK_INT >= 34 ? C17621l.f34290l : C6928l.f14514l;
        AbstractC14055l.crashlytics(1, 2, 4, 8, 16, 32, 64, 128);
    }
}
