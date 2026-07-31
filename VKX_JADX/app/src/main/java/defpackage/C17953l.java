package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lٖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17953l {
    public final int admob;
    public final boolean amazon;
    public final int billing;
    public final int crashlytics;
    public final boolean firebase;
    public final boolean isPro;
    public final int loadAd;
    public final C13736l mopub;
    public final boolean purchase;
    public final int subs;
    public final int yandex;

    public C17953l(C0734l c0734l) {
        this.yandex = c0734l.yandex;
        this.loadAd = c0734l.loadAd;
        this.crashlytics = c0734l.crashlytics;
        this.amazon = c0734l.amazon;
        this.purchase = c0734l.purchase;
        this.billing = c0734l.billing;
        this.mopub = c0734l.mopub;
        this.admob = c0734l.admob;
        this.subs = c0734l.subs;
        this.isPro = c0734l.isPro;
        this.firebase = c0734l.firebase;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17953l.class != obj.getClass()) {
            return false;
        }
        C17953l c17953l = (C17953l) obj;
        return this.yandex == c17953l.yandex && this.loadAd == c17953l.loadAd && this.crashlytics == c17953l.crashlytics && this.amazon == c17953l.amazon && this.purchase == c17953l.purchase && this.billing == c17953l.billing && this.admob == c17953l.admob && this.subs == c17953l.subs && this.isPro == c17953l.isPro && this.firebase == c17953l.firebase && this.mopub.equals(c17953l.mopub);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.yandex), Integer.valueOf(this.loadAd), Integer.valueOf(this.crashlytics), Boolean.valueOf(this.amazon), Boolean.valueOf(this.purchase), Integer.valueOf(this.billing), this.mopub, Integer.valueOf(this.admob), Integer.valueOf(this.subs), Boolean.valueOf(this.firebase), Boolean.valueOf(this.isPro));
    }

    public final C0734l yandex() {
        C0734l c0734l = new C0734l();
        c0734l.yandex = this.yandex;
        c0734l.loadAd = this.loadAd;
        c0734l.crashlytics = this.crashlytics;
        c0734l.amazon = this.amazon;
        c0734l.purchase = this.purchase;
        c0734l.billing = this.billing;
        c0734l.mopub = this.mopub;
        c0734l.admob = this.admob;
        c0734l.subs = this.subs;
        c0734l.isPro = this.isPro;
        c0734l.firebase = this.firebase;
        return c0734l;
    }
}
