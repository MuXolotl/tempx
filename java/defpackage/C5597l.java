package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؘُؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5597l {
    public final C5019l admob;
    public final C5019l amazon;
    public final AbstractC10759l billing;
    public final int crashlytics;
    public final long isPro;
    public final AbstractC10759l loadAd;
    public final int mopub;
    public final long purchase;
    public final long subs;
    public final long yandex;

    public C5597l(long j, AbstractC10759l abstractC10759l, int i, C5019l c5019l, long j2, AbstractC10759l abstractC10759l2, int i2, C5019l c5019l2, long j3, long j4) {
        this.yandex = j;
        this.loadAd = abstractC10759l;
        this.crashlytics = i;
        this.amazon = c5019l;
        this.purchase = j2;
        this.billing = abstractC10759l2;
        this.mopub = i2;
        this.admob = c5019l2;
        this.subs = j3;
        this.isPro = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5597l.class != obj.getClass()) {
            return false;
        }
        C5597l c5597l = (C5597l) obj;
        return this.yandex == c5597l.yandex && this.crashlytics == c5597l.crashlytics && this.purchase == c5597l.purchase && this.mopub == c5597l.mopub && this.subs == c5597l.subs && this.isPro == c5597l.isPro && this.loadAd.equals(c5597l.loadAd) && Objects.equals(this.amazon, c5597l.amazon) && Objects.equals(this.billing, c5597l.billing) && Objects.equals(this.admob, c5597l.admob);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.yandex), this.loadAd, Integer.valueOf(this.crashlytics), this.amazon, Long.valueOf(this.purchase), this.billing, Integer.valueOf(this.mopub), this.admob, Long.valueOf(this.subs), Long.valueOf(this.isPro));
    }
}
