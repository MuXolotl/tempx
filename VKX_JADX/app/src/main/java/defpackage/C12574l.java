package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lّْٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12574l implements InterfaceC15782l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C2982l f24756l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C2982l f24757l;

    public C12574l(C2982l c2982l, C2982l c2982l2) {
        this.f24757l = c2982l;
        this.f24756l = c2982l2;
    }

    @Override // defpackage.InterfaceC15782l
    /* JADX INFO: renamed from: lّؗؑ */
    public final AbstractC4383l mo1225l() {
        return new C6317l(this.f24757l.mo1225l(), this.f24756l.mo1225l());
    }

    @Override // defpackage.InterfaceC15782l
    /* JADX INFO: renamed from: lٍؘؘ */
    public final List mo209l() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.InterfaceC15782l
    /* JADX INFO: renamed from: lٖۥۡ */
    public final boolean mo231l() {
        return this.f24757l.mo231l() && this.f24756l.mo231l();
    }
}
