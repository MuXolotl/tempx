package defpackage;

/* JADX INFO: renamed from: lؘؖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3936l implements InterfaceC0060l {
    public final C8705l crashlytics;
    public final C18155l loadAd;
    public final AbstractC15944l yandex;

    public C3936l(C18155l c18155l, C8705l c8705l, AbstractC15944l abstractC15944l) {
        this.loadAd = c18155l;
        c8705l.getClass();
        this.crashlytics = c8705l;
        this.yandex = abstractC15944l;
    }

    @Override // defpackage.InterfaceC0060l
    public final boolean admob(AbstractC13399l abstractC13399l, AbstractC13399l abstractC13399l2) {
        this.loadAd.getClass();
        return abstractC13399l.unknownFields.equals(abstractC13399l2.unknownFields);
    }

    @Override // defpackage.InterfaceC0060l
    public final Object amazon() {
        AbstractC15944l abstractC15944l = this.yandex;
        return abstractC15944l instanceof AbstractC13399l ? ((AbstractC13399l) abstractC15944l).ads() : abstractC15944l.amazon().crashlytics();
    }

    @Override // defpackage.InterfaceC0060l
    public final int billing(AbstractC13399l abstractC13399l) {
        this.loadAd.getClass();
        C7565l c7565l = abstractC13399l.unknownFields;
        int i = c7565l.amazon;
        if (i != -1) {
            return i;
        }
        int iYandex = 0;
        for (int i2 = 0; i2 < c7565l.yandex; i2++) {
            int i3 = c7565l.loadAd[i2] >>> 3;
            iYandex += AbstractC15335l.yandex(3, (AbstractC15257l) c7565l.crashlytics[i2]) + AbstractC15335l.billing(i3) + AbstractC15335l.purchase(2) + (AbstractC15335l.purchase(1) * 2);
        }
        c7565l.amazon = iYandex;
        return iYandex;
    }

    @Override // defpackage.InterfaceC0060l
    public final boolean crashlytics(Object obj) {
        this.crashlytics.getClass();
        AbstractC12589l.m3424strictfp(obj);
        throw null;
    }

    @Override // defpackage.InterfaceC0060l
    public final void isPro(C5138l c5138l, Object obj) {
        this.crashlytics.getClass();
        AbstractC12589l.m3424strictfp(obj);
        throw null;
    }

    @Override // defpackage.InterfaceC0060l
    public final void loadAd(Object obj) {
        this.loadAd.getClass();
        C7565l c7565l = ((AbstractC13399l) obj).unknownFields;
        if (c7565l.purchase) {
            c7565l.purchase = false;
        }
        this.crashlytics.getClass();
        AbstractC12589l.m3424strictfp(obj);
        throw null;
    }

    @Override // defpackage.InterfaceC0060l
    public final void mopub(Object obj, byte[] bArr, int i, int i2, C16292l c16292l) {
        AbstractC13399l abstractC13399l = (AbstractC13399l) obj;
        if (abstractC13399l.unknownFields == C7565l.billing) {
            abstractC13399l.unknownFields = C7565l.crashlytics();
        }
        throw AbstractC12589l.signatures(obj);
    }

    @Override // defpackage.InterfaceC0060l
    public final void purchase(Object obj, C12676l c12676l, C7597l c7597l) {
        this.loadAd.getClass();
        C18155l.yandex(obj);
        this.crashlytics.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.InterfaceC0060l
    public final int subs(AbstractC13399l abstractC13399l) {
        this.loadAd.getClass();
        return abstractC13399l.unknownFields.hashCode();
    }

    @Override // defpackage.InterfaceC0060l
    public final void yandex(Object obj, Object obj2) {
        AbstractC5067l.firebase(this.loadAd, obj, obj2);
    }
}
