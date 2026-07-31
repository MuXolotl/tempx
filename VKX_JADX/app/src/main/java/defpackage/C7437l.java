package defpackage;

/* JADX INFO: renamed from: lؚٟۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7437l implements InterfaceC6347l {
    public final InterfaceC6347l crashlytics;
    public final InterfaceC6347l loadAd;
    public final InterfaceC8714l yandex;
    public final C9902l amazon = AbstractC3478l.yandex();
    public final C9902l purchase = AbstractC3478l.yandex();
    public final C9902l billing = AbstractC3478l.yandex();

    public C7437l(InterfaceC8714l interfaceC8714l, InterfaceC6347l interfaceC6347l, InterfaceC6347l interfaceC6347l2) {
        this.yandex = interfaceC8714l;
        this.loadAd = interfaceC6347l;
        this.crashlytics = interfaceC6347l2;
    }

    @Override // defpackage.InterfaceC6347l
    public final AbstractC15342l yandex(long j, EnumC9931l enumC9931l, InterfaceC13490l interfaceC13490l) {
        C9902l c9902l = this.amazon;
        c9902l.admob();
        C9902l c9902l2 = this.purchase;
        c9902l2.admob();
        C9902l c9902l3 = this.billing;
        c9902l3.admob();
        AbstractC15342l abstractC15342lYandex = this.loadAd.yandex(j, enumC9931l, interfaceC13490l);
        AbstractC15342l abstractC15342lYandex2 = this.crashlytics.yandex(j, enumC9931l, interfaceC13490l);
        if (abstractC15342lYandex instanceof C13616l) {
            c9902l.yandex(((C13616l) abstractC15342lYandex).amazon, 0L);
        } else if (abstractC15342lYandex instanceof C18521l) {
            AbstractC15560l.firebase(c9902l, ((C18521l) abstractC15342lYandex).amazon);
        } else {
            if (!(abstractC15342lYandex instanceof C13080l)) {
                C18725l.billing();
                return null;
            }
            AbstractC15560l.isPro(c9902l, ((C13080l) abstractC15342lYandex).amazon);
        }
        if (abstractC15342lYandex2 instanceof C13616l) {
            c9902l3.yandex(((C13616l) abstractC15342lYandex2).amazon, 0L);
        } else if (abstractC15342lYandex2 instanceof C18521l) {
            AbstractC15560l.firebase(c9902l3, ((C18521l) abstractC15342lYandex2).amazon);
        } else {
            if (!(abstractC15342lYandex2 instanceof C13080l)) {
                C18725l.billing();
                return null;
            }
            AbstractC15560l.isPro(c9902l3, ((C13080l) abstractC15342lYandex2).amazon);
        }
        c9902l3.firebase(((C10924l) this.yandex.getValue()).yandex);
        c9902l2.mopub(c9902l, c9902l3, 2);
        return new C13616l(c9902l2);
    }
}
