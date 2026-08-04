package defpackage;

/* JADX INFO: renamed from: lؕۚؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3614l {
    public final C3964l amazon;
    public C5978l billing;
    public final InterfaceC8979l crashlytics;
    public final C9267l loadAd;
    public int purchase;
    public final C11436l yandex;

    public C3614l(C11436l c11436l, C9267l c9267l, InterfaceC8979l interfaceC8979l) {
        this.yandex = c11436l;
        this.loadAd = c9267l;
        this.crashlytics = interfaceC8979l;
        this.amazon = "audio/true-hd".equals(c11436l.mopub.metrica) ? new C3964l() : null;
    }
}
