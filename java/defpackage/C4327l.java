package defpackage;

/* JADX INFO: renamed from: lؖۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4327l extends AbstractC2523l {
    public final Object crashlytics;
    public final String loadAd;
    public final C1243l yandex;

    public C4327l(C1243l c1243l, C17707l c17707l, int i) {
        String str = c1243l.loadAd;
        c17707l = (i & 4) != 0 ? null : c17707l;
        this.yandex = c1243l;
        this.loadAd = str;
        this.crashlytics = c17707l;
    }

    @Override // defpackage.AbstractC2523l
    public final C4195l amazon() {
        return null;
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
