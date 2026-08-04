package defpackage;

/* JADX INFO: renamed from: lٍٜ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9848l extends AbstractC9601l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final EnumC9931l f20045l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f20046l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final float f20047l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final float f20048l;

    public C9848l(int i, EnumC9931l enumC9931l, float f, float f2) {
        this.f20046l = i;
        this.f20045l = enumC9931l;
        this.f20048l = f;
        this.f20047l = f2;
    }

    @Override // defpackage.AbstractC9601l
    public final int billing() {
        return this.f20046l;
    }

    @Override // defpackage.InterfaceC13490l
    public final float loadAd() {
        return this.f20048l;
    }

    @Override // defpackage.AbstractC9601l
    public final EnumC9931l purchase() {
        return this.f20045l;
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: super */
    public final float mo873super() {
        return this.f20047l;
    }
}
