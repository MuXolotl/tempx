package defpackage;

/* JADX INFO: renamed from: lّٗۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12658l extends AbstractC8268l {
    public final /* synthetic */ C3253l crashlytics;
    public final /* synthetic */ InterfaceC12703l loadAd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12658l(C3253l c3253l, InterfaceC12703l interfaceC12703l, InterfaceC12703l interfaceC12703l2) {
        super(interfaceC12703l);
        this.crashlytics = c3253l;
        this.loadAd = interfaceC12703l2;
    }

    @Override // defpackage.AbstractC8268l, defpackage.InterfaceC12703l
    public final C15528l purchase(long j) {
        C15528l c15528lPurchase = this.loadAd.purchase(j);
        C4304l c4304l = c15528lPurchase.yandex;
        long j2 = c4304l.yandex;
        long j3 = c4304l.loadAd;
        long j4 = this.crashlytics.f6948l;
        C4304l c4304l2 = new C4304l(j2, j3 + j4);
        C4304l c4304l3 = c15528lPurchase.loadAd;
        return new C15528l(c4304l2, new C4304l(c4304l3.yandex, c4304l3.loadAd + j4));
    }
}
