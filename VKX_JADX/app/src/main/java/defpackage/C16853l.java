package defpackage;

import android.util.Size;

/* JADX INFO: renamed from: lٗؒ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16853l {
    public final C15617l admob;
    public final String amazon;
    public final C4220l billing;
    public final int crashlytics;
    public C9494l isPro;
    public final Size loadAd;
    public final C5565l mopub;
    public final C8259l purchase;
    public final C5959l subs;
    public final int yandex;

    public C16853l(int i, int i2, C15617l c15617l, C4220l c4220l, C8259l c8259l, C5565l c5565l, C5959l c5959l, Size size, String str) {
        this.yandex = i;
        this.loadAd = size;
        this.crashlytics = i2;
        this.amazon = str;
        this.purchase = c8259l;
        this.billing = c4220l;
        this.mopub = c5565l;
        this.admob = c15617l;
        this.subs = c5959l;
    }

    public final String toString() {
        return C13172l.yandex(this.yandex);
    }

    public final boolean yandex() {
        C5959l c5959l;
        C5565l c5565l = this.mopub;
        if (c5565l == null) {
            return true;
        }
        long j = c5565l.yandex;
        if (C5565l.yandex(j, 0L) || C5565l.yandex(j, 1L) || C5565l.yandex(j, 3L) || (c5959l = this.subs) == null) {
            return true;
        }
        long j2 = c5959l.yandex;
        return C5959l.yandex(j2, 0L) || C5959l.yandex(j2, 1L);
    }
}
