package defpackage;

/* JADX INFO: renamed from: lؘؘۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5494l implements InterfaceC12940l {
    public final C8565l loadAd;
    public final AbstractC12570l yandex;

    public C5494l(C8565l c8565l, AbstractC12570l abstractC12570l) {
        C6096l c6096l = AbstractC9206l.yandex;
        this.loadAd = c8565l;
        this.yandex = abstractC12570l;
    }

    @Override // defpackage.InterfaceC12940l
    public final void admob(Object obj, C12676l c12676l, C11337l c11337l) {
        this.loadAd.getClass();
        C8565l.signatures(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.InterfaceC12940l
    public final int amazon(AbstractC12570l abstractC12570l) {
        C10096l c10096l = ((AbstractC0288l) abstractC12570l).zzc;
        int i = c10096l.amazon;
        if (i != -1) {
            return i;
        }
        int iApplovin = 0;
        for (int i2 = 0; i2 < c10096l.yandex; i2++) {
            int i3 = c10096l.loadAd[i2] >>> 3;
            AbstractC15619l abstractC15619l = (AbstractC15619l) c10096l.crashlytics[i2];
            int iYandex = AbstractC10908l.yandex(8);
            int iYandex2 = AbstractC10908l.yandex(i3) + AbstractC10908l.yandex(16);
            int iYandex3 = AbstractC10908l.yandex(24);
            int iBilling = abstractC15619l.billing();
            iApplovin = AbstractC5020l.applovin(iYandex + iYandex, iYandex2, AbstractC9029l.admob(iBilling, iBilling, iYandex3), iApplovin);
        }
        c10096l.amazon = iApplovin;
        return iApplovin;
    }

    @Override // defpackage.InterfaceC12940l
    public final void billing(Object obj, byte[] bArr, int i, int i2, C16292l c16292l) {
        AbstractC0288l abstractC0288l = (AbstractC0288l) obj;
        if (abstractC0288l.zzc == C10096l.billing) {
            abstractC0288l.zzc = C10096l.yandex();
        }
        throw AbstractC12589l.signatures(obj);
    }

    @Override // defpackage.InterfaceC12940l
    public final void crashlytics(Object obj, C15714l c15714l) {
        throw AbstractC12589l.signatures(obj);
    }

    @Override // defpackage.InterfaceC12940l
    public final void loadAd(Object obj) {
        this.loadAd.getClass();
        C10096l c10096l = ((AbstractC0288l) obj).zzc;
        if (c10096l.purchase) {
            c10096l.purchase = false;
        }
        C6096l c6096l = AbstractC9206l.yandex;
        throw AbstractC12589l.signatures(obj);
    }

    @Override // defpackage.InterfaceC12940l
    public final int mopub(AbstractC0288l abstractC0288l) {
        return abstractC0288l.zzc.hashCode();
    }

    @Override // defpackage.InterfaceC12940l
    public final boolean purchase(Object obj) {
        throw AbstractC12589l.signatures(obj);
    }

    @Override // defpackage.InterfaceC12940l
    public final boolean subs(AbstractC0288l abstractC0288l, AbstractC0288l abstractC0288l2) {
        return abstractC0288l.zzc.equals(abstractC0288l2.zzc);
    }

    @Override // defpackage.InterfaceC12940l
    public final void yandex(Object obj, Object obj2) {
        AbstractC9626l.loadAd(obj, obj2);
    }

    @Override // defpackage.InterfaceC12940l
    public final AbstractC0288l zza() {
        AbstractC12570l abstractC12570l = this.yandex;
        if (abstractC12570l instanceof AbstractC0288l) {
            return ((AbstractC0288l) abstractC12570l).subs();
        }
        AbstractC10050l abstractC10050l = (AbstractC10050l) ((AbstractC0288l) abstractC12570l).subscription(5);
        boolean zMopub = abstractC10050l.f20498l.mopub();
        AbstractC0288l abstractC0288l = abstractC10050l.f20498l;
        if (!zMopub) {
            return abstractC0288l;
        }
        abstractC0288l.getClass();
        C8307l.crashlytics.yandex(abstractC0288l.getClass()).loadAd(abstractC0288l);
        abstractC0288l.admob();
        return abstractC10050l.f20498l;
    }
}
