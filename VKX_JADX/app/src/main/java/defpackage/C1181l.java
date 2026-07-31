package defpackage;

/* JADX INFO: renamed from: lؚٜؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1181l extends AbstractC14971l implements InterfaceC7150l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public int f3174l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public int f3175l;

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        long jYandex;
        long jAmazon = AbstractC7563l.amazon(j, AbstractC14707l.loadAd(this.f3175l, this.f3174l));
        if (C15519l.mopub(j) == Integer.MAX_VALUE && C15519l.admob(j) != Integer.MAX_VALUE) {
            int i = (int) (jAmazon >> 32);
            int i2 = (this.f3174l * i) / this.f3175l;
            jYandex = AbstractC7563l.yandex(i, i, i2, i2);
        } else if (C15519l.admob(j) != Integer.MAX_VALUE || C15519l.mopub(j) == Integer.MAX_VALUE) {
            int i3 = (int) (jAmazon >> 32);
            int i4 = (int) (jAmazon & 4294967295L);
            jYandex = AbstractC7563l.yandex(i3, i3, i4, i4);
        } else {
            int i5 = (int) (jAmazon & 4294967295L);
            int i6 = (this.f3175l * i5) / this.f3174l;
            jYandex = AbstractC7563l.yandex(i6, i6, i5, i5);
        }
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(jYandex);
        return interfaceC7448l.isVip(abstractC10113lAdcel.f20592l, abstractC10113lAdcel.f20591l, C14054l.f27396l, new C16441l(abstractC10113lAdcel, 5));
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.firebase(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.adcel(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.tapsense(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.vip(this, abstractC11754l, interfaceC6357l, i);
    }
}
