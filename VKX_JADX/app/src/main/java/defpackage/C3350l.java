package defpackage;

/* JADX INFO: renamed from: lّؕؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3350l extends AbstractC2523l {
    public final C4195l amazon;
    public final Integer crashlytics;
    public final String loadAd;
    public final int purchase;
    public final C1243l yandex;

    public C3350l(C1243l c1243l, int i, C4195l c4195l, int i2) {
        int i3;
        String str = c1243l.loadAd;
        Integer num = (i2 & 16) != 0 ? null : 0;
        c4195l = (i2 & 32) != 0 ? null : c4195l;
        this.yandex = c1243l;
        this.loadAd = str;
        this.crashlytics = num;
        this.amazon = c4195l;
        if (i < 10) {
            i3 = 1;
        } else if (i < 100) {
            i3 = 2;
        } else {
            if (i >= 1000) {
                C8339l.metrica(AbstractC15560l.tapsense("Max value ", i, " is too large"));
                throw null;
            }
            i3 = 3;
        }
        this.purchase = i3;
    }

    @Override // defpackage.AbstractC2523l
    public final C4195l amazon() {
        return this.amazon;
    }

    @Override // defpackage.AbstractC2523l
    public final String crashlytics() {
        return this.loadAd;
    }

    @Override // defpackage.AbstractC2523l
    public final Object loadAd() {
        return this.crashlytics;
    }

    @Override // defpackage.AbstractC2523l
    public final C1243l yandex() {
        return this.yandex;
    }
}
