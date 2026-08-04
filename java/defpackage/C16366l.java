package defpackage;

/* JADX INFO: renamed from: lٍْٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C16366l implements InterfaceC15189l {
    public final /* synthetic */ C16930l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C16366l(C16930l c16930l, int i) {
        this.yandex = i;
        this.loadAd = c16930l;
    }

    @Override // defpackage.InterfaceC15189l
    public final Object get() {
        int i = this.yandex;
        int i2 = 25;
        C16930l c16930l = this.loadAd;
        switch (i) {
            case 0:
                return c16930l.yandex("FIREBASE_ML_SDK", new C7017l("json"), C11140l.f22363l);
            case 1:
                return c16930l.yandex("FIREBASE_ML_SDK", new C7017l("proto"), C6168l.f12982l);
            case 2:
                return c16930l.yandex("FIREBASE_ML_SDK", new C7017l("json"), new C14529l(i2));
            default:
                return c16930l.yandex("FIREBASE_ML_SDK", new C7017l("proto"), new C4269l(i2));
        }
    }
}
