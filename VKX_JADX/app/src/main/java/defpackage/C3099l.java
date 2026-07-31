package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lؕؐٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3099l implements InterfaceC5068l {
    public static final List billing = AbstractC14055l.remoteconfig(0, 0, 0, 0, 0, 0, 0, 0, 0);
    public final AbstractC2523l yandex = AbstractC12080l.amazon;
    public final int loadAd = 1;
    public final int crashlytics = 9;
    public final int amazon = 1;
    public final int purchase = 9;

    static {
        AbstractC14055l.remoteconfig(2, 1, 0, 2, 1, 0, 2, 1, 0);
    }

    @Override // defpackage.InterfaceC5068l
    public final AbstractC2523l crashlytics() {
        return this.yandex;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3099l)) {
            return false;
        }
        C3099l c3099l = (C3099l) obj;
        return this.amazon == c3099l.amazon && this.purchase == c3099l.purchase;
    }

    public final int hashCode() {
        return (this.amazon * 31) + this.purchase;
    }

    @Override // defpackage.InterfaceC5068l
    public final C14329l loadAd() {
        AbstractC2523l abstractC2523l = this.yandex;
        return new C14329l(Collections.singletonList(new C6994l(Collections.singletonList(new C14388l(this.loadAd, this.crashlytics, abstractC2523l.yandex(), abstractC2523l.crashlytics())))), C2580l.f5619l);
    }

    @Override // defpackage.InterfaceC5068l
    public final C1094l yandex() {
        this.yandex.yandex();
        C1094l c1094l = new C1094l();
        int i = this.loadAd;
        if (1 > i || i >= 10) {
            C10754l.metrica(AbstractC15560l.tapsense("The minimum number of digits (", i, ") is not in range 1..9"));
            return null;
        }
        int i2 = this.crashlytics;
        if (i <= i2 && i2 < 10) {
            return c1094l;
        }
        C10754l.metrica(AbstractC12589l.applovin(i2, i, "The maximum number of digits (", ") is not in range ", "..9"));
        return null;
    }
}
