package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lُۦۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11496l {
    public final boolean admob;
    public final long amazon;
    public final long billing;
    public final long crashlytics;
    public final boolean firebase;
    public final boolean isPro;
    public final long loadAd;
    public final boolean mopub;
    public final long purchase;
    public final boolean subs;
    public final C5019l yandex;

    public C11496l(C5019l c5019l, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        AbstractC12442l.admob(!z5 || z3);
        AbstractC12442l.admob(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        AbstractC12442l.admob(z6);
        this.yandex = c5019l;
        this.loadAd = j;
        this.crashlytics = j2;
        this.amazon = j3;
        this.purchase = j4;
        this.billing = j5;
        this.mopub = z;
        this.admob = z2;
        this.subs = z3;
        this.isPro = z4;
        this.firebase = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C11496l.class == obj.getClass()) {
            C11496l c11496l = (C11496l) obj;
            if (this.loadAd == c11496l.loadAd && this.amazon == c11496l.amazon && this.purchase == c11496l.purchase && this.billing == c11496l.billing && this.mopub == c11496l.mopub && this.admob == c11496l.admob && this.subs == c11496l.subs && this.isPro == c11496l.isPro && this.firebase == c11496l.firebase && Objects.equals(this.yandex, c11496l.yandex)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.yandex.hashCode() + 527) * 31) + ((int) this.loadAd)) * 31) + ((int) this.amazon)) * 31) + ((int) this.purchase)) * 31) + ((int) this.billing)) * 31) + (this.mopub ? 1 : 0)) * 31) + (this.admob ? 1 : 0)) * 31) + (this.subs ? 1 : 0)) * 31) + (this.isPro ? 1 : 0)) * 31) + (this.firebase ? 1 : 0);
    }

    public final C11496l loadAd(long j, long j2) {
        if (j == this.loadAd && j2 == this.crashlytics) {
            return this;
        }
        return new C11496l(this.yandex, j, j2, this.amazon, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.isPro, this.firebase);
    }

    public final C11496l yandex(long j) {
        if (j == this.amazon) {
            return this;
        }
        return new C11496l(this.yandex, this.loadAd, this.crashlytics, j, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.isPro, this.firebase);
    }
}
