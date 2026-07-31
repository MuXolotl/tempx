package defpackage;

import java.util.UUID;

/* JADX INFO: renamed from: lٖٓٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14258l extends AbstractC13868l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f27855l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f27856l;

    public C14258l(InterfaceC15879l interfaceC15879l) {
        super(interfaceC15879l);
        this.f27856l = "virtual-" + interfaceC15879l.mopub() + "-" + UUID.randomUUID().toString();
    }

    @Override // defpackage.AbstractC13868l, defpackage.InterfaceC15879l
    public final int crashlytics() {
        return tapsense(0);
    }

    @Override // defpackage.AbstractC13868l, defpackage.InterfaceC15879l
    public final String mopub() {
        return this.f27856l;
    }

    @Override // defpackage.AbstractC13868l, defpackage.InterfaceC15879l
    public final int tapsense(int i) {
        return AbstractC18611l.isPro(super.tapsense(i) - this.f27855l);
    }
}
