package defpackage;

/* JADX INFO: renamed from: lْ۠ۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13721l implements InterfaceC0101l {
    public final C16222l loadAd;
    public final AbstractC6909l yandex;

    public C13721l(C16222l c16222l, AbstractC6909l abstractC6909l) {
        C2183l c2183l = AbstractC16478l.yandex;
        this.loadAd = c16222l;
        this.yandex = abstractC6909l;
    }

    @Override // defpackage.InterfaceC0101l
    public final boolean amazon(AbstractC17187l abstractC17187l, AbstractC17187l abstractC17187l2) {
        return abstractC17187l.zzc.equals(abstractC17187l2.zzc);
    }

    @Override // defpackage.InterfaceC0101l
    public final boolean billing(Object obj) {
        throw AbstractC12589l.signatures(obj);
    }

    @Override // defpackage.InterfaceC0101l
    public final void crashlytics(Object obj, C2290l c2290l) {
        throw AbstractC12589l.signatures(obj);
    }

    @Override // defpackage.InterfaceC0101l
    public final int loadAd(AbstractC6909l abstractC6909l) {
        C6378l c6378l = ((AbstractC17187l) abstractC6909l).zzc;
        int i = c6378l.crashlytics;
        if (i != -1) {
            return i;
        }
        c6378l.crashlytics = 0;
        return 0;
    }

    @Override // defpackage.InterfaceC0101l
    public final void mopub(Object obj) {
        this.loadAd.getClass();
        C6378l c6378l = ((AbstractC17187l) obj).zzc;
        if (c6378l.amazon) {
            c6378l.amazon = false;
        }
        C2183l c2183l = AbstractC16478l.yandex;
        throw AbstractC12589l.signatures(obj);
    }

    @Override // defpackage.InterfaceC0101l
    public final int purchase(AbstractC17187l abstractC17187l) {
        abstractC17187l.zzc.getClass();
        return 506991;
    }

    @Override // defpackage.InterfaceC0101l
    public final void yandex(Object obj, Object obj2) {
        AbstractC3622l.loadAd(obj, obj2);
    }

    @Override // defpackage.InterfaceC0101l
    public final AbstractC17187l zza() {
        AbstractC6909l abstractC6909l = this.yandex;
        if (abstractC6909l instanceof AbstractC17187l) {
            return (AbstractC17187l) ((AbstractC17187l) abstractC6909l).subs(4, null);
        }
        AbstractC1506l abstractC1506l = (AbstractC1506l) ((AbstractC17187l) abstractC6909l).subs(5, null);
        boolean zIsPro = abstractC1506l.f3757l.isPro();
        AbstractC17187l abstractC17187l = abstractC1506l.f3757l;
        if (!zIsPro) {
            return abstractC17187l;
        }
        abstractC17187l.getClass();
        C12765l.crashlytics.yandex(abstractC17187l.getClass()).mopub(abstractC17187l);
        abstractC17187l.firebase();
        return abstractC1506l.f3757l;
    }
}
