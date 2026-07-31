package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lًۨۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8453l extends AbstractC11340l implements InterfaceC13202l, InterfaceC10653l, InterfaceC12556l {

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C4566l f17461l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public Function0 f17462l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public boolean f17463l;

    public C8453l(Function0 function0) {
        this.f17462l = function0;
        C7795l c7795l = new C7795l(6, this);
        C9185l c9185l = AbstractC1782l.yandex;
        C4566l c4566l = new C4566l(null, null, null, c7795l);
        m3069l(c4566l);
        this.f17461l = c4566l;
    }

    @Override // defpackage.InterfaceC13202l
    public final void appmetrica(C9185l c9185l, EnumC9065l enumC9065l, long j) {
        this.f17461l.appmetrica(c9185l, enumC9065l, j);
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lٍؚۖ */
    public final void mo1495l() {
        mo1500throw();
    }

    @Override // defpackage.InterfaceC13202l
    /* JADX INFO: renamed from: lْ٘ۚ */
    public final /* synthetic */ boolean mo1497l() {
        return false;
    }

    @Override // defpackage.InterfaceC13202l
    /* JADX INFO: renamed from: lٍٔ۠ */
    public final void mo1498l() {
        mo1500throw();
    }

    @Override // defpackage.InterfaceC10653l
    /* JADX INFO: renamed from: native */
    public final void mo1231native(EnumC11822l enumC11822l) {
        this.f17463l = enumC11822l.loadAd();
    }

    @Override // defpackage.InterfaceC13202l
    public final long tapsense() {
        InterfaceC13490l interfaceC13490l = AbstractC5573l.metrica(this).f7668l;
        AbstractC6900l.yandex.getClass();
        int i = AbstractC10549l.loadAd;
        return C6760l.startapp(interfaceC13490l.mo870l(10.0f), interfaceC13490l.mo870l(40.0f), interfaceC13490l.mo870l(10.0f), interfaceC13490l.mo870l(40.0f));
    }

    @Override // defpackage.InterfaceC13202l
    /* JADX INFO: renamed from: throw */
    public final void mo1500throw() {
        this.f17461l.mo1500throw();
    }

    @Override // defpackage.InterfaceC13202l
    /* JADX INFO: renamed from: class */
    public final /* synthetic */ void mo1493class() {
    }
}
