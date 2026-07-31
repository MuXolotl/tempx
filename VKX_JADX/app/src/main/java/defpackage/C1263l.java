package defpackage;

/* JADX INFO: renamed from: lؒۖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1263l implements InterfaceC15189l {
    public volatile InterfaceC15189l loadAd;
    public InterfaceC2785l yandex;
    public static final C18073l crashlytics = new C18073l();
    public static final C15616l amazon = new C15616l(5);

    public C1263l(C18073l c18073l, InterfaceC15189l interfaceC15189l) {
        this.yandex = c18073l;
        this.loadAd = interfaceC15189l;
    }

    @Override // defpackage.InterfaceC15189l
    public final Object get() {
        return this.loadAd.get();
    }

    public final void yandex(InterfaceC2785l interfaceC2785l) {
        InterfaceC15189l interfaceC15189l;
        InterfaceC15189l interfaceC15189l2;
        InterfaceC15189l interfaceC15189l3 = this.loadAd;
        C15616l c15616l = amazon;
        if (interfaceC15189l3 != c15616l) {
            interfaceC2785l.loadAd(interfaceC15189l3);
            return;
        }
        synchronized (this) {
            interfaceC15189l = this.loadAd;
            if (interfaceC15189l != c15616l) {
                interfaceC15189l2 = interfaceC15189l;
            } else {
                this.yandex = new C15263l(this.yandex, interfaceC2785l, 12);
                interfaceC15189l2 = null;
            }
        }
        if (interfaceC15189l2 != null) {
            interfaceC2785l.loadAd(interfaceC15189l);
        }
    }
}
