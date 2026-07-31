package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lْٕٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15652l extends C12981l {

    /* JADX INFO: renamed from: lؒٓؐ, reason: contains not printable characters */
    public boolean f30596l;

    /* JADX INFO: renamed from: lؕۦؓ, reason: contains not printable characters */
    public Function1 f30597l;

    /* JADX INFO: renamed from: lؚؗٞ, reason: contains not printable characters */
    public final C5767l f30598l;

    public C15652l(boolean z, C2403l c2403l, InterfaceC2186l interfaceC2186l, boolean z2, C6402l c6402l, Function1 function1) {
        super(c2403l, interfaceC2186l, false, z2, null, c6402l, new C1926l(6, function1, z));
        this.f30596l = z;
        this.f30597l = function1;
        this.f30598l = new C5767l(28, this);
    }

    @Override // defpackage.AbstractC14569l
    /* JADX INFO: renamed from: l٘ۦۢ */
    public final void mo1507l(InterfaceC17593l interfaceC17593l) {
        AbstractC3668l.startapp(interfaceC17593l, this.f30596l ? EnumC13846l.f27083l : EnumC13846l.f27082l);
        AbstractC3668l.billing(interfaceC17593l, C11485l.f23090l);
        C5828l c5828lSmaato = AbstractC5941l.smaato(this.f30596l);
        if (c5828lSmaato != null) {
            AbstractC3668l.subs(interfaceC17593l, c5828lSmaato);
        }
        AbstractC3668l.amazon(interfaceC17593l, new C11846l(interfaceC17593l, 1));
    }
}
