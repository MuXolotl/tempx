package defpackage;

/* JADX INFO: renamed from: lؗؐؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4565l {
    public static final C4565l subs;
    public final boolean admob;
    public final boolean amazon;
    public final boolean billing;
    public final boolean crashlytics;
    public final boolean loadAd;
    public final boolean mopub;
    public final boolean purchase;
    public final boolean yandex;

    static {
        boolean z = false;
        subs = new C4565l(255, z, z);
    }

    public /* synthetic */ C4565l(int i, boolean z, boolean z2) {
        this((i & 1) == 0, (i & 2) == 0, (i & 4) == 0, (i & 8) == 0, (i & 16) != 0 ? false : z, (i & 32) == 0, (i & 64) != 0 ? false : z2, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4565l.class != obj.getClass()) {
            return false;
        }
        C4565l c4565l = (C4565l) obj;
        return this.yandex == c4565l.yandex && this.loadAd == c4565l.loadAd && this.crashlytics == c4565l.crashlytics && this.amazon == c4565l.amazon && this.purchase == c4565l.purchase && this.billing == c4565l.billing && this.mopub == c4565l.mopub && this.admob == c4565l.admob;
    }

    public final int hashCode() {
        return ((((((((((((((this.yandex ? 1231 : 1237) * 31) + (this.loadAd ? 1231 : 1237)) * 31) + (this.crashlytics ? 1231 : 1237)) * 31) + (this.amazon ? 1231 : 1237)) * 31) + (this.purchase ? 1231 : 1237)) * 31) + (this.billing ? 1231 : 1237)) * 31) + (this.mopub ? 1231 : 1237)) * 31) + (this.admob ? 1231 : 1237);
    }

    public C4565l(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.yandex = z;
        this.loadAd = z2;
        this.crashlytics = z3;
        this.amazon = z4;
        this.purchase = z5;
        this.billing = z6;
        this.mopub = z7;
        this.admob = z8;
    }
}
