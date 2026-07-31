package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: lَٓؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14049l implements InterfaceC10466l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C14461l f27389l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC15897l f27390l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27391l = 1;

    public C14049l(C14461l c14461l, InterfaceC2661l interfaceC2661l) {
        this.f27389l = c14461l;
        this.f27390l = interfaceC2661l;
    }

    @Override // defpackage.InterfaceC15897l
    public final Object get() {
        int i = this.f27391l;
        C14461l c14461l = this.f27389l;
        InterfaceC15897l interfaceC15897l = this.f27390l;
        switch (i) {
            case 0:
                return new C4288l((Context) c14461l.f28328l, (C15435l) interfaceC15897l.get());
            default:
                return new C13335l((C6579l) interfaceC15897l.get(), (InterfaceC12932l) c14461l.f28328l);
        }
    }

    public C14049l(InterfaceC2661l interfaceC2661l, C14461l c14461l) {
        this.f27390l = interfaceC2661l;
        this.f27389l = c14461l;
    }
}
