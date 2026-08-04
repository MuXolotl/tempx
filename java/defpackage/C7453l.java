package defpackage;

/* JADX INFO: renamed from: lؚۗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7453l implements InterfaceC5100l {
    public final C1558l crashlytics;
    public final C5382l loadAd;
    public final AbstractC1200l yandex;

    public C7453l(C5382l c5382l, C1558l c1558l, AbstractC1200l abstractC1200l) {
        this.loadAd = c5382l;
        c1558l.getClass();
        this.crashlytics = c1558l;
        this.yandex = abstractC1200l;
    }

    @Override // defpackage.InterfaceC5100l
    public final int admob(AbstractC8760l abstractC8760l) {
        this.loadAd.getClass();
        C0774l c0774l = abstractC8760l.unknownFields;
        int i = c0774l.amazon;
        if (i != -1) {
            return i;
        }
        int iBilling = 0;
        for (int i2 = 0; i2 < c0774l.yandex; i2++) {
            int i3 = c0774l.loadAd[i2] >>> 3;
            iBilling += C10107l.billing(3, (C4966l) c0774l.crashlytics[i2]) + C10107l.subs(i3) + C10107l.admob(2) + (C10107l.admob(1) * 2);
        }
        c0774l.amazon = iBilling;
        return iBilling;
    }

    @Override // defpackage.InterfaceC5100l
    public final AbstractC8760l amazon() {
        AbstractC1200l abstractC1200l = this.yandex;
        return abstractC1200l instanceof AbstractC8760l ? ((AbstractC8760l) abstractC1200l).subs() : ((AbstractC17315l) ((AbstractC8760l) abstractC1200l).loadAd(5)).loadAd();
    }

    @Override // defpackage.InterfaceC5100l
    public final int billing(AbstractC8760l abstractC8760l) {
        this.loadAd.getClass();
        return abstractC8760l.unknownFields.hashCode();
    }

    @Override // defpackage.InterfaceC5100l
    public final boolean crashlytics(Object obj) {
        this.crashlytics.getClass();
        AbstractC12589l.m3424strictfp(obj);
        throw null;
    }

    @Override // defpackage.InterfaceC5100l
    public final void loadAd(Object obj) {
        this.loadAd.getClass();
        C0774l c0774l = ((AbstractC8760l) obj).unknownFields;
        if (c0774l.purchase) {
            c0774l.purchase = false;
        }
        this.crashlytics.getClass();
        AbstractC12589l.m3424strictfp(obj);
        throw null;
    }

    @Override // defpackage.InterfaceC5100l
    public final void mopub(Object obj, C12676l c12676l, C5225l c5225l) {
        this.loadAd.yandex(obj);
        this.crashlytics.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.InterfaceC5100l
    public final boolean purchase(AbstractC8760l abstractC8760l, AbstractC8760l abstractC8760l2) {
        C5382l c5382l = this.loadAd;
        c5382l.getClass();
        C0774l c0774l = abstractC8760l.unknownFields;
        c5382l.getClass();
        return c0774l.equals(abstractC8760l2.unknownFields);
    }

    @Override // defpackage.InterfaceC5100l
    public final void subs(Object obj, C7972l c7972l) {
        this.crashlytics.getClass();
        AbstractC12589l.m3424strictfp(obj);
        throw null;
    }

    @Override // defpackage.InterfaceC5100l
    public final void yandex(Object obj, Object obj2) {
        AbstractC0183l.firebase(this.loadAd, obj, obj2);
    }
}
