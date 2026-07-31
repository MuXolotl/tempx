package defpackage;

/* JADX INFO: renamed from: lِۚۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12108l implements InterfaceC9608l {
    public final C0264l crashlytics;
    public final C2195l loadAd;
    public final AbstractC9446l yandex;

    public C12108l(C2195l c2195l, C0264l c0264l, AbstractC9446l abstractC9446l) {
        this.loadAd = c2195l;
        c0264l.getClass();
        this.crashlytics = c0264l;
        this.yandex = abstractC9446l;
    }

    @Override // defpackage.InterfaceC9608l
    public final void admob(Object obj, byte[] bArr, int i, int i2, C16292l c16292l) {
        AbstractC12946l abstractC12946l = (AbstractC12946l) obj;
        if (abstractC12946l.unknownFields == C11788l.billing) {
            abstractC12946l.unknownFields = C11788l.crashlytics();
        }
        throw AbstractC12589l.signatures(obj);
    }

    @Override // defpackage.InterfaceC9608l
    public final AbstractC12946l amazon() {
        AbstractC9446l abstractC9446l = this.yandex;
        return abstractC9446l instanceof AbstractC12946l ? ((AbstractC12946l) abstractC9446l).isPro() : ((AbstractC7858l) ((AbstractC12946l) abstractC9446l).amazon(5)).loadAd();
    }

    @Override // defpackage.InterfaceC9608l
    public final void billing(C13161l c13161l, Object obj) {
        this.crashlytics.getClass();
        AbstractC12589l.m3424strictfp(obj);
        throw null;
    }

    @Override // defpackage.InterfaceC9608l
    public final boolean crashlytics(Object obj) {
        this.crashlytics.getClass();
        AbstractC12589l.m3424strictfp(obj);
        throw null;
    }

    @Override // defpackage.InterfaceC9608l
    public final void isPro(Object obj, C12676l c12676l, C1466l c1466l) {
        this.loadAd.getClass();
        C2195l.yandex(obj);
        this.crashlytics.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.InterfaceC9608l
    public final void loadAd(Object obj) {
        this.loadAd.getClass();
        C11788l c11788l = ((AbstractC12946l) obj).unknownFields;
        if (c11788l.purchase) {
            c11788l.purchase = false;
        }
        this.crashlytics.getClass();
        AbstractC12589l.m3424strictfp(obj);
        throw null;
    }

    @Override // defpackage.InterfaceC9608l
    public final int mopub(AbstractC12946l abstractC12946l) {
        this.loadAd.getClass();
        return abstractC12946l.unknownFields.hashCode();
    }

    @Override // defpackage.InterfaceC9608l
    public final int purchase(AbstractC12946l abstractC12946l) {
        this.loadAd.getClass();
        C11788l c11788l = abstractC12946l.unknownFields;
        int i = c11788l.amazon;
        if (i != -1) {
            return i;
        }
        int iYandex = 0;
        for (int i2 = 0; i2 < c11788l.yandex; i2++) {
            int i3 = c11788l.loadAd[i2] >>> 3;
            iYandex += AbstractC11078l.yandex(3, (AbstractC16071l) c11788l.crashlytics[i2]) + AbstractC11078l.billing(i3) + AbstractC11078l.purchase(2) + (AbstractC11078l.purchase(1) * 2);
        }
        c11788l.amazon = iYandex;
        return iYandex;
    }

    @Override // defpackage.InterfaceC9608l
    public final boolean subs(AbstractC12946l abstractC12946l, AbstractC12946l abstractC12946l2) {
        this.loadAd.getClass();
        return abstractC12946l.unknownFields.equals(abstractC12946l2.unknownFields);
    }

    @Override // defpackage.InterfaceC9608l
    public final void yandex(Object obj, Object obj2) {
        AbstractC9883l.firebase(this.loadAd, obj, obj2);
    }
}
