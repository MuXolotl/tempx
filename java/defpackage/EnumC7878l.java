package defpackage;

/* JADX INFO: renamed from: lًٌۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC7878l implements InterfaceC16520l {
    GENERAL(0),
    MAJOR_UPDATE(1),
    NEWS(2),
    IMPORTANT_PSA(3),
    SALE(4),
    MINOR_UPDATE(5);


    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f16433l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C5499l f16428l = new C5499l(1, AbstractC18202l.yandex.loadAd(EnumC7878l.class), 2, GENERAL);

    EnumC7878l(int i) {
        this.f16433l = i;
    }

    @Override // defpackage.InterfaceC16520l
    public final int getValue() {
        return this.f16433l;
    }
}
