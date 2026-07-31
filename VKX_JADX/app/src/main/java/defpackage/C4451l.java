package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؖۡۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4451l extends AbstractC11340l implements InterfaceC16031l, InterfaceC15209l {

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public C7504l f9058l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public Function1 f9059l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public Function1 f9060l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public C10715l f9061l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public Function1 f9062l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C8610l f9057l = AbstractC8020l.mopub(new C5767l(22, this));

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public C8896l f9063l = C8896l.purchase;

    public C4451l(C10715l c10715l, Function1 function1, Function1 function2, Function1 function3) {
        this.f9061l = c10715l;
        this.f9062l = function1;
        this.f9060l = function2;
        this.f9059l = function3;
    }

    @Override // defpackage.InterfaceC15209l
    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final C2863l mo1544default() {
        return (C2863l) this.f9057l.getValue();
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo535l() {
        C10715l c10715l = this.f9061l;
        c10715l.loadAd = 2;
        c10715l.yandex = null;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        C10715l c10715l = this.f9061l;
        c10715l.loadAd = 3;
        c10715l.yandex = this;
    }

    @Override // defpackage.InterfaceC15209l
    public final C8896l metrica(InterfaceC18212l interfaceC18212l) {
        if (!this.f29462l) {
            return this.f9063l;
        }
        C8896l c8896l = (C8896l) this.f9059l.invoke(interfaceC18212l);
        if (c8896l == null) {
            return this.f9063l;
        }
        this.f9063l = c8896l;
        return c8896l;
    }

    @Override // defpackage.InterfaceC15209l
    public final long smaato(InterfaceC18212l interfaceC18212l) {
        return metrica(interfaceC18212l).admob();
    }
}
