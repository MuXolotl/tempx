package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lًؗؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7800l {
    public final String amazon;
    public final InterfaceC13945l crashlytics;
    public final C3797l loadAd;
    public final int yandex;

    public C7800l(C3797l c3797l, InterfaceC13945l interfaceC13945l, String str) {
        this.loadAd = c3797l;
        this.crashlytics = interfaceC13945l;
        this.amazon = str;
        this.yandex = Arrays.hashCode(new Object[]{c3797l, interfaceC13945l, str, null});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7800l)) {
            return false;
        }
        C7800l c7800l = (C7800l) obj;
        return AbstractC7236l.amazon(this.loadAd, c7800l.loadAd) && AbstractC7236l.amazon(this.crashlytics, c7800l.crashlytics) && AbstractC7236l.amazon(this.amazon, c7800l.amazon) && AbstractC7236l.amazon(null, null);
    }

    public final int hashCode() {
        return this.yandex;
    }
}
