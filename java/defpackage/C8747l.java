package defpackage;

/* JADX INFO: renamed from: lٌْٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8747l implements InterfaceC7270l {
    public final int crashlytics = 2;
    public final String loadAd;
    public final String yandex;

    public C8747l(String str) {
        this.yandex = str;
        this.loadAd = AbstractC14814l.startapp("section_", str);
    }

    @Override // defpackage.InterfaceC7270l
    public final String getId() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC7270l
    public final int yandex() {
        return this.crashlytics;
    }
}
