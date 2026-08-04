package defpackage;

/* JADX INFO: renamed from: lؘٕۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15511l implements InterfaceC6269l {
    public final long amazon;
    public final long crashlytics;
    public final InterfaceC8097l loadAd;
    public final int yandex;

    public C15511l(int i, int i2, InterfaceC8097l interfaceC8097l) {
        this.yandex = i;
        this.loadAd = interfaceC8097l;
        this.crashlytics = ((long) i) * 1000000;
        this.amazon = ((long) i2) * 1000000;
    }

    @Override // defpackage.InterfaceC6269l
    public final float amazon(float f, float f2, float f3) {
        return crashlytics(f, f2, f3, loadAd(f, f2, f3));
    }

    @Override // defpackage.InterfaceC6269l
    public final float crashlytics(float f, float f2, float f3, long j) {
        long j2 = j - this.amazon;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.crashlytics;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (purchase(f, f2, f3, j4) - purchase(f, f2, f3, j4 - 1000000)) * 1000.0f;
    }

    @Override // defpackage.InterfaceC6269l
    public final long loadAd(float f, float f2, float f3) {
        return this.amazon + this.crashlytics;
    }

    @Override // defpackage.InterfaceC6269l
    public final float purchase(float f, float f2, float f3, long j) {
        long j2 = j - this.amazon;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.crashlytics;
        if (j2 > j3) {
            j2 = j3;
        }
        float fYandex = this.loadAd.yandex(this.yandex == 0 ? 1.0f : j2 / j3);
        return (f2 * fYandex) + ((1.0f - fYandex) * f);
    }

    @Override // defpackage.InterfaceC1489l
    public final InterfaceC15930l yandex(C0010l c0010l) {
        return new C12014l(this);
    }
}
