package defpackage;

/* JADX INFO: renamed from: lؚۣٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7404l implements InterfaceC16067l {
    public final C5109l amazon;
    public final C5109l crashlytics;
    public final String loadAd;

    public C7404l(String str) {
        this.loadAd = str;
        this.crashlytics = new C5109l(str);
        this.amazon = new C5109l(str.concat(" maximum"));
    }

    public final String toString() {
        return this.loadAd;
    }
}
