package defpackage;

/* JADX INFO: renamed from: lؚٜؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1962l implements InterfaceC3457l {
    public final int loadAd;

    public C1962l(int i) {
        this.loadAd = i;
        if (i > 0) {
            return;
        }
        C8339l.metrica("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.InterfaceC3457l
    public final InterfaceC11152l yandex(InterfaceC7623l interfaceC7623l, InterfaceC11509l interfaceC11509l) {
        if (interfaceC11509l instanceof C6165l) {
            return ((C6165l) interfaceC11509l).crashlytics == 1 ? new C1870l(interfaceC7623l, interfaceC11509l) : new C10920l(interfaceC7623l, interfaceC11509l, this.loadAd);
        }
        return new C1870l(interfaceC7623l, interfaceC11509l);
    }
}
