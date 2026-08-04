package defpackage;

/* JADX INFO: renamed from: lۣؕۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3737l {
    public final int amazon;
    public final C0327l billing;
    public final int crashlytics;
    public final int loadAd;
    public final int purchase;
    public final long yandex;

    public C3737l(long j, int i, int i2, int i3, int i4, C0327l c0327l) {
        this.yandex = j;
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = i3;
        this.purchase = i4;
        this.billing = c0327l;
    }

    public final C3242l crashlytics(int i, int i2) {
        return new C3242l(yandex(i), yandex(i2), i > i2);
    }

    public final int loadAd() {
        int i = this.crashlytics;
        int i2 = this.amazon;
        if (i < i2) {
            return 2;
        }
        return i > i2 ? 1 : 3;
    }

    public final String toString() {
        C0327l c0327l = this.billing;
        int i = this.crashlytics;
        int iCrashlytics = AbstractC7798l.crashlytics(c0327l, i);
        int i2 = this.amazon;
        return "SelectionInfo(id=" + this.yandex + ", range=(" + i + "-" + AbstractC4338l.m1536throw(iCrashlytics) + "," + i2 + "-" + AbstractC4338l.m1536throw(AbstractC7798l.crashlytics(c0327l, i2)) + "), prevOffset=" + this.purchase + ")";
    }

    public final C15812l yandex(int i) {
        return new C15812l(AbstractC7798l.crashlytics(this.billing, i), this.yandex, i);
    }
}
