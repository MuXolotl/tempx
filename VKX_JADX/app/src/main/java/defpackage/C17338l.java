package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lِٗۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17338l extends AbstractC14971l implements InterfaceC3703l {

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public C13301l f33670l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C13301l f33671l = new C13301l(this, 0);

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public InterfaceC14371l f33672l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public C11601l f33673l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public EnumC7283l f33674l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public Function0 f33675l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public boolean f33676l;

    public C17338l(Function0 function0, InterfaceC14371l interfaceC14371l, EnumC7283l enumC7283l, boolean z) {
        this.f33675l = function0;
        this.f33672l = interfaceC14371l;
        this.f33674l = enumC7283l;
        this.f33676l = z;
        m4320l();
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: catch */
    public final /* synthetic */ boolean mo490catch() {
        return false;
    }

    @Override // defpackage.InterfaceC3703l
    public final void isPro(InterfaceC17593l interfaceC17593l) {
        AbstractC3668l.adcel(interfaceC17593l);
        interfaceC17593l.amazon(AbstractC0424l.f1540catch, this.f33671l);
        EnumC7283l enumC7283l = this.f33674l;
        C11601l c11601l = this.f33673l;
        if (enumC7283l == EnumC7283l.f15126l) {
            if (c11601l == null) {
                c11601l = null;
            }
            C4707l c4707l = AbstractC0424l.pro;
            InterfaceC13922l interfaceC13922l = AbstractC3668l.yandex[13];
            interfaceC17593l.amazon(c4707l, c11601l);
        } else {
            if (c11601l == null) {
                c11601l = null;
            }
            C4707l c4707l2 = AbstractC0424l.license;
            InterfaceC13922l interfaceC13922l2 = AbstractC3668l.yandex[12];
            interfaceC17593l.amazon(c4707l2, c11601l);
        }
        C13301l c13301l = this.f33670l;
        if (c13301l != null) {
            interfaceC17593l.amazon(AbstractC16601l.billing, new C7629l(null, c13301l));
        }
        interfaceC17593l.amazon(AbstractC16601l.applovin, new C7629l(null, new C10065l(0, new C7767l(this, 2))));
        C11907l c11907lBilling = this.f33672l.billing();
        C4707l c4707l3 = AbstractC0424l.billing;
        InterfaceC13922l interfaceC13922l3 = AbstractC3668l.yandex[24];
        interfaceC17593l.amazon(c4707l3, c11907lBilling);
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: lۣؒٞ */
    public final /* synthetic */ boolean mo491l() {
        return false;
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final void m4320l() {
        this.f33673l = new C11601l(new C7767l(this, 0), new C7767l(this, 1));
        this.f33670l = this.f33676l ? new C13301l(this, 1) : null;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final boolean mo512l() {
        return false;
    }

    @Override // defpackage.InterfaceC3703l
    public final /* synthetic */ boolean remoteconfig() {
        return true;
    }
}
