package defpackage;

/* JADX INFO: renamed from: lّٔٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14986l implements InterfaceC14220l {
    public AbstractC10759l crashlytics;
    public final C12855l loadAd;
    public final Object yandex;

    public C14986l(Object obj, C12855l c12855l) {
        this.yandex = obj;
        this.loadAd = c12855l;
        this.crashlytics = c12855l.metrica;
    }

    @Override // defpackage.InterfaceC14220l
    public final AbstractC10759l crashlytics() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC14220l
    public final Object loadAd() {
        return this.yandex;
    }
}
