package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙٓۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6449l extends AbstractC17054l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C7504l f13476l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public boolean f13477l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Function2 f13478l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final InterfaceC2262l f13479l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C7119l f13480l;

    public C6449l(InterfaceC2262l interfaceC2262l, C5541l c5541l) {
        super(c5541l);
        this.f13479l = interfaceC2262l;
        this.f13478l = new C0071l(2, null, 4);
    }

    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters */
    public final void m2011l(boolean z) {
        C7504l c7504l;
        if (!z && super.m4254l() && (c7504l = this.f13476l) != null && !c7504l.mopub()) {
            mo2014l();
        }
        ((C4983l) this.f33215l).purchase(z);
        ((C11541l) this.f33214l).mopub(z);
    }

    @Override // defpackage.AbstractC17054l
    /* JADX INFO: renamed from: lؙؕؕ, reason: contains not printable characters */
    public final void mo2012l(C0560l c0560l) {
        C7119l c7119l = this.f13480l;
        if (c7119l != null) {
            c7119l.amazon(c0560l);
        }
    }

    @Override // defpackage.AbstractC17054l
    /* JADX INFO: renamed from: lٍ۟ۨ, reason: contains not printable characters */
    public final void mo2013l() {
        if (this.f13480l != null && !this.f13477l) {
            mo2014l();
        }
        InterfaceC14029l interfaceC14029l = null;
        if (this.f13480l == null) {
            this.f13477l = false;
            this.f13480l = AbstractC12098l.yandex(-2, 1, null, 4);
            this.f13476l = AbstractC10999l.mopub(this.f13479l, null, 0, new C6637l(this, interfaceC14029l, 6), 3);
        }
        C7119l c7119l = this.f13480l;
        if (c7119l != null) {
            c7119l.crashlytics(null);
        }
        this.f13477l = false;
    }

    @Override // defpackage.AbstractC17054l
    /* JADX INFO: renamed from: lَٜؑ, reason: contains not printable characters */
    public final void mo2014l() {
        C7119l c7119l = this.f13480l;
        if (c7119l != null) {
            c7119l.firebase(new CancellationException("onBack cancelled"), true);
        }
        C7504l c7504l = this.f13476l;
        if (c7504l != null) {
            c7504l.ads(null);
        }
        this.f13480l = null;
        this.f13476l = null;
        this.f13477l = false;
    }

    @Override // defpackage.AbstractC17054l
    /* JADX INFO: renamed from: lٕؖؔ, reason: contains not printable characters */
    public final void mo2015l() {
        mo2014l();
        if (super.m4254l()) {
            this.f13477l = true;
            this.f13480l = AbstractC12098l.yandex(-2, 1, null, 4);
            this.f13476l = AbstractC10999l.mopub(this.f13479l, null, 0, new C6637l(this, null, 6), 3);
        }
    }
}
