package defpackage;

import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٟؗۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5073l implements InterfaceC8714l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC15829l f11084l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2262l f11085l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f11086l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Function3 f11087l;

    public C5073l(InterfaceC8714l interfaceC8714l, InterfaceC2262l interfaceC2262l, InterfaceC15829l interfaceC15829l, Function3 function3) {
        this.f11086l = interfaceC8714l;
        this.f11085l = interfaceC2262l;
        this.f11084l = interfaceC15829l;
        this.f11087l = function3;
    }

    @Override // defpackage.InterfaceC12244l
    public final Object getValue() {
        return this.f11086l.getValue();
    }

    @Override // defpackage.InterfaceC8714l
    public final void setValue(Object obj) {
        AbstractC10999l.mopub(this.f11085l, null, 0, new C4647l(this.f11084l, this.f11087l, obj, (InterfaceC14029l) null), 3);
    }
}
