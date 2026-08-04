package defpackage;

/* JADX INFO: renamed from: lَؚٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10147l {
    public C9138l[] amazon;
    public boolean crashlytics;
    public boolean loadAd;
    public int purchase;
    public InterfaceC11545l yandex;

    public final C8662l yandex() {
        boolean z = true;
        AbstractC1051l.crashlytics(this.yandex != null, "execute parameter required");
        if (!this.crashlytics) {
            C9138l[] c9138lArr = this.amazon;
            if (c9138lArr == null || (c9138lArr.length) == 0) {
                z = false;
                break;
            }
            for (C9138l c9138l : c9138lArr) {
                if (!c9138l.f18790l) {
                    z = false;
                    break;
                }
            }
            this.loadAd = z;
        }
        return new C8662l(this, this.amazon, this.loadAd, this.purchase);
    }
}
