package defpackage;

/* JADX INFO: renamed from: lؘُۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11413l extends AbstractC0775l {
    public final C13975l amazon;
    public final AbstractC0576l crashlytics;

    public C11413l(AbstractC0576l abstractC0576l, AbstractC8237l abstractC8237l) {
        this.crashlytics = abstractC0576l;
        this.amazon = abstractC8237l.loadAd;
    }

    @Override // defpackage.InterfaceC14988l
    public final int admob(InterfaceC18035l interfaceC18035l) {
        throw new IllegalStateException("unsupported");
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final short applovin() {
        C15717l c15717l;
        AbstractC0576l abstractC0576l = this.crashlytics;
        String strMetrica = abstractC0576l.metrica();
        try {
            C12524l c12524lIsPro = AbstractC3474l.isPro(strMetrica);
            if (c12524lIsPro != null) {
                int i = c12524lIsPro.f24675l;
                c15717l = Integer.compare(Integer.MIN_VALUE ^ i, -2147418113) > 0 ? null : new C15717l((short) i);
            }
            if (c15717l != null) {
                return c15717l.f30858l;
            }
            AbstractC16648l.pro(strMetrica);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC0576l.tapsense(abstractC0576l, AbstractC14814l.smaato('\'', "Failed to parse type 'UShort' for input '", strMetrica), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final long license() {
        AbstractC0576l abstractC0576l = this.crashlytics;
        String strMetrica = abstractC0576l.metrica();
        try {
            C10882l c10882lFirebase = AbstractC3474l.firebase(strMetrica);
            if (c10882lFirebase != null) {
                return c10882lFirebase.f21996l;
            }
            AbstractC16648l.pro(strMetrica);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC0576l.tapsense(abstractC0576l, AbstractC14814l.smaato('\'', "Failed to parse type 'ULong' for input '", strMetrica), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.InterfaceC14988l
    public final C13975l loadAd() {
        return this.amazon;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final byte signatures() {
        C15962l c15962l;
        AbstractC0576l abstractC0576l = this.crashlytics;
        String strMetrica = abstractC0576l.metrica();
        try {
            C12524l c12524lIsPro = AbstractC3474l.isPro(strMetrica);
            if (c12524lIsPro != null) {
                int i = c12524lIsPro.f24675l;
                c15962l = Integer.compare(Integer.MIN_VALUE ^ i, -2147483393) > 0 ? null : new C15962l((byte) i);
            }
            if (c15962l != null) {
                return c15962l.f31334l;
            }
            AbstractC16648l.pro(strMetrica);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC0576l.tapsense(abstractC0576l, AbstractC14814l.smaato('\'', "Failed to parse type 'UByte' for input '", strMetrica), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final int vip() {
        AbstractC0576l abstractC0576l = this.crashlytics;
        String strMetrica = abstractC0576l.metrica();
        try {
            C12524l c12524lIsPro = AbstractC3474l.isPro(strMetrica);
            if (c12524lIsPro != null) {
                return c12524lIsPro.f24675l;
            }
            AbstractC16648l.pro(strMetrica);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC0576l.tapsense(abstractC0576l, AbstractC14814l.smaato('\'', "Failed to parse type 'UInt' for input '", strMetrica), 0, null, 6);
            throw null;
        }
    }
}
