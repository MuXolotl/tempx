package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lؓۜۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2139l {
    public C2256l amazon;
    public C2139l billing;
    public int crashlytics;
    public int loadAd;
    public C2139l mopub;
    public boolean purchase;
    public final byte[] yandex;

    public C2139l() {
        this.yandex = new byte[8192];
        this.purchase = true;
        this.amazon = null;
    }

    public final void amazon(C2139l c2139l) {
        c2139l.mopub = this;
        c2139l.billing = this.billing;
        C2139l c2139l2 = this.billing;
        if (c2139l2 != null) {
            c2139l2.mopub = c2139l;
        }
        this.billing = c2139l;
    }

    public final void billing(C2139l c2139l, int i) {
        if (!c2139l.purchase) {
            C8339l.smaato("only owner can write");
            return;
        }
        if (c2139l.crashlytics + i > 8192) {
            C2256l c2256l = c2139l.amazon;
            if (c2256l != null && c2256l.yandex > 0) {
                C11983l.crashlytics();
                return;
            }
            int i2 = c2139l.crashlytics;
            int i3 = c2139l.loadAd;
            if ((i2 + i) - i3 > 8192) {
                C11983l.crashlytics();
                return;
            }
            byte[] bArr = c2139l.yandex;
            AbstractC8669l.applovin(bArr, 0, i3, bArr, i2, 2);
            c2139l.crashlytics -= c2139l.loadAd;
            c2139l.loadAd = 0;
        }
        byte[] bArr2 = this.yandex;
        byte[] bArr3 = c2139l.yandex;
        int i4 = c2139l.crashlytics;
        int i5 = this.loadAd;
        AbstractC8669l.advert(bArr2, i4, i5, bArr3, i5 + i);
        c2139l.crashlytics += i;
        this.loadAd += i;
    }

    public final byte crashlytics(int i) {
        return this.yandex[this.loadAd + i];
    }

    public final int loadAd() {
        return this.crashlytics - this.loadAd;
    }

    public final C2139l purchase() {
        C2256l c2256l = this.amazon;
        if (c2256l == null) {
            C2139l c2139l = AbstractC7163l.yandex;
            c2256l = new C2256l();
            this.amazon = c2256l;
        }
        int i = this.loadAd;
        int i2 = this.crashlytics;
        C2256l.loadAd.incrementAndGet(c2256l);
        Unit unit = Unit.INSTANCE;
        return new C2139l(this.yandex, i, i2, c2256l);
    }

    public final int yandex() {
        return this.yandex.length - this.crashlytics;
    }

    public C2139l(byte[] bArr, int i, int i2, C2256l c2256l) {
        this.yandex = bArr;
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = c2256l;
        this.purchase = false;
    }
}
