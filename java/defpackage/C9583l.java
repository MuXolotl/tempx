package defpackage;

/* JADX INFO: renamed from: lٍٕۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9583l extends AbstractC16111l {

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final InterfaceC9069l f19524l;

    public C9583l(InterfaceC9069l interfaceC9069l) {
        this.f19524l = interfaceC9069l;
    }

    public final void ad(C6922l c6922l, C6956l c6956l, int i) {
        c6956l.m2133new(-1748246066);
        int i2 = (c6956l.billing(c6922l) ? 4 : 2) | i;
        int i3 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC8714l interfaceC8714lPurchase = AbstractC9637l.purchase(c6922l.purchase, c6956l, 0);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(1691792010, new C5089l(c6922l, AbstractC9637l.purchase(c6922l.mopub, c6956l, 0), i3), c6956l), null, null, null, 0, 0L, 0L, AbstractC14760l.loadAd(0.0f, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).yandex(c6956l), 7), AbstractC14566l.amazon(338816223, new C11223l((Object) AbstractC9637l.purchase(c6922l.admob, c6956l, 0), (Object) c6922l, (Object) AbstractC9637l.purchase(c6922l.billing, c6956l, 0), (Object) interfaceC8714lPurchase, 23), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C10848l(this, c6922l, i, 25);
        }
    }

    @Override // defpackage.AbstractC16111l
    public final /* bridge */ /* synthetic */ void license(Object obj, C6956l c6956l) {
        ad((C6922l) obj, c6956l, 0);
    }

    @Override // defpackage.AbstractC16111l
    public final Object pro(C16793l c16793l) {
        return new C6922l(c16793l, new C3151l(1, this, C9583l.class, "onChatPicked", "onChatPicked(Lbruhcollective/itaysonlab/vkx/decompose/components/share/ShareToChatComponent$Chat;)V", 0, 0, 6), new C10832l(0, this, C9583l.class, "dismiss", "dismiss()V", 0, 0, 14));
    }
}
