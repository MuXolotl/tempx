package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٍؚۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7165l implements InterfaceC16902l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f14994l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC10607l f14995l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC16902l f14996l;

    public C7165l(InterfaceC16902l interfaceC16902l, InterfaceC10607l interfaceC10607l, int i) {
        this.f14996l = interfaceC16902l;
        this.f14995l = interfaceC10607l;
        this.f14994l = i;
    }

    @Override // defpackage.InterfaceC8371l
    public final InterfaceC8371l Signature() {
        return this.f14995l;
    }

    @Override // defpackage.InterfaceC15234l
    public final AbstractC15211l ad() {
        return this.f14996l.ad();
    }

    @Override // defpackage.InterfaceC10233l
    public final InterfaceC5706l billing() {
        return this.f14996l.billing();
    }

    @Override // defpackage.InterfaceC16902l
    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final boolean mo2180extends() {
        return this.f14996l.mo2180extends();
    }

    @Override // defpackage.InterfaceC2853l
    public final InterfaceC3841l getAnnotations() {
        return this.f14996l.getAnnotations();
    }

    @Override // defpackage.InterfaceC16902l
    public final int getIndex() {
        return this.f14996l.getIndex() + this.f14994l;
    }

    @Override // defpackage.InterfaceC8371l
    public final C3498l getName() {
        return this.f14996l.getName();
    }

    @Override // defpackage.InterfaceC16902l
    public final List getUpperBounds() {
        return this.f14996l.getUpperBounds();
    }

    @Override // defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: import */
    public final Object mo1008import(InterfaceC15600l interfaceC15600l, Object obj) {
        return this.f14996l.mo1008import(interfaceC15600l, obj);
    }

    @Override // defpackage.InterfaceC15234l, defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: loadAd */
    public final InterfaceC15234l mo864l() {
        return this.f14996l.mo864l();
    }

    @Override // defpackage.InterfaceC16902l
    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public final boolean mo2181l() {
        return true;
    }

    @Override // defpackage.InterfaceC16902l
    /* JADX INFO: renamed from: lْ٘ۚ, reason: contains not printable characters */
    public final int mo2182l() {
        return this.f14996l.mo2182l();
    }

    @Override // defpackage.InterfaceC16902l, defpackage.InterfaceC15234l
    public final InterfaceC1925l metrica() {
        return this.f14996l.metrica();
    }

    @Override // defpackage.InterfaceC16902l
    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public final C16412l mo2183protected() {
        return this.f14996l.mo2183protected();
    }

    public final String toString() {
        return this.f14996l + "[inner-copy]";
    }

    @Override // defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: loadAd */
    public final InterfaceC8371l mo864l() {
        return this.f14996l.mo864l();
    }

    @Override // defpackage.InterfaceC16902l, defpackage.InterfaceC15234l, defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: loadAd */
    public final InterfaceC16902l mo864l() {
        return this.f14996l.mo864l();
    }
}
