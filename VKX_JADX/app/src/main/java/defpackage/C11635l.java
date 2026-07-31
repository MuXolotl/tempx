package defpackage;

/* JADX INFO: renamed from: lِؖۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11635l implements InterfaceC11295l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C13145l[] f23349l;

    public C11635l(C13145l[] c13145lArr) {
        this.f23349l = c13145lArr;
    }

    public final void loadAd() {
        for (C13145l c13145l : this.f23349l) {
            InterfaceC11791l interfaceC11791l = c13145l.f25710l;
            if (interfaceC11791l == null) {
                interfaceC11791l = null;
            }
            interfaceC11791l.yandex();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f23349l + ']';
    }

    @Override // defpackage.InterfaceC11295l
    public final void yandex(Throwable th) {
        loadAd();
    }
}
