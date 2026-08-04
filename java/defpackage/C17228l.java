package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٗٚۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17228l extends AbstractC10022l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Function1 f33436l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC10022l f33437l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C2693l f33438l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final InterfaceC12932l f33439l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final InterfaceC4539l f33440l;

    public C17228l(C2693l c2693l, AbstractC10022l abstractC10022l, Function1 function1, InterfaceC4539l interfaceC4539l) {
        this.f33438l = c2693l;
        this.f33437l = abstractC10022l;
        this.f33436l = function1;
        this.f33440l = interfaceC4539l;
        this.f33439l = abstractC10022l.vip();
    }

    @Override // defpackage.AbstractC10022l
    public final C2369l admob() {
        return this.f33437l.admob();
    }

    @Override // defpackage.AbstractC10022l
    public final C8485l amazon() {
        return this.f33437l.amazon();
    }

    @Override // defpackage.AbstractC10022l
    public final InterfaceC9354l crashlytics() {
        return (InterfaceC9354l) this.f33436l.invoke(this.f33437l);
    }

    @Override // defpackage.AbstractC10022l
    public final C14249l loadAd() {
        return this.f33438l;
    }

    @Override // defpackage.AbstractC10022l
    public final C2759l mopub() {
        return this.f33437l.mopub();
    }

    @Override // defpackage.AbstractC10022l
    public final C8485l purchase() {
        return this.f33437l.purchase();
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f33439l;
    }

    @Override // defpackage.InterfaceC13536l
    public final InterfaceC4539l yandex() {
        return this.f33440l;
    }
}
