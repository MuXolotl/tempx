package defpackage;

/* JADX INFO: renamed from: lؚٔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7263l implements InterfaceC17896l {
    public final InterfaceC7233l yandex;
    public static final C1223l loadAd = new C1223l();
    public static final C9782l crashlytics = new C9782l(10);
    public static final C7842l amazon = new C7842l(3);

    public C7263l(InterfaceC7233l interfaceC7233l) {
        this.yandex = interfaceC7233l;
    }

    @Override // defpackage.InterfaceC17896l
    public final void crashlytics(String str, C6344l c6344l) throws C2584l {
        InterfaceC7233l interfaceC7233l = this.yandex;
        if (interfaceC7233l.yandex() && str.indexOf(":") != interfaceC7233l.loadAd().length() + 1) {
            throw C2584l.yandex(interfaceC7233l.loadAd(), 27, str);
        }
    }
}
