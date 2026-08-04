package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lٕؕٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3408l extends AbstractC14165l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C12136l f7258l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public float f7259l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C10086l f7260l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public AbstractC8939l f7262l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C10086l f7261l = AbstractC8020l.smaato(new C14174l(0));

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C10086l f7257l = AbstractC8020l.smaato(Boolean.FALSE);

    public C3408l(C8006l c8006l) {
        C12136l c12136l = new C12136l(c8006l);
        c12136l.billing = new C11029l(20, this);
        this.f7258l = c12136l;
        this.f7260l = new C10086l(Unit.INSTANCE, C18450l.f36015l);
        this.f7259l = 1.0f;
    }

    @Override // defpackage.AbstractC14165l
    public final boolean amazon(float f) {
        this.f7259l = f;
        return true;
    }

    @Override // defpackage.AbstractC14165l
    public final void isPro(InterfaceC13349l interfaceC13349l) {
        AbstractC8939l abstractC8939l = this.f7262l;
        C12136l c12136l = this.f7258l;
        if (abstractC8939l == null) {
            abstractC8939l = (AbstractC8939l) c12136l.mopub.getValue();
        }
        if (((Boolean) this.f7257l.getValue()).booleanValue() && interfaceC13349l.getLayoutDirection() == EnumC9931l.f20222l) {
            long jMo2070l = interfaceC13349l.mo2070l();
            C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
            long jM4551private = c18449lMo2065break.m4551private();
            c18449lMo2065break.m4555synchronized().mopub();
            try {
                ((C16543l) c18449lMo2065break.f36010l).isVip(-1.0f, 1.0f, jMo2070l);
                c12136l.purchase(interfaceC13349l, this.f7259l, abstractC8939l);
                AbstractC0653l.license(c18449lMo2065break, jM4551private);
            } catch (Throwable th) {
                AbstractC0653l.license(c18449lMo2065break, jM4551private);
                throw th;
            }
        } else {
            c12136l.purchase(interfaceC13349l, this.f7259l, abstractC8939l);
        }
        this.f7260l.getValue();
        Unit unit = Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC14165l
    public final boolean purchase(AbstractC8939l abstractC8939l) {
        this.f7262l = abstractC8939l;
        return true;
    }

    @Override // defpackage.AbstractC14165l
    public final long subs() {
        return ((C14174l) this.f7261l.getValue()).yandex;
    }
}
