package defpackage;

/* JADX INFO: renamed from: lَٙۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC10382l implements InterfaceC16520l {
    StockOrUnknown(0),
    MIUI(1),
    Flyme(2),
    EMUI(3),
    ZenUI(4),
    Vivo(5),
    SamsungKnox(6),
    SamsungOneUI(7);


    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f21197l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C16474l f21190l = new C16474l(1, AbstractC18202l.yandex.loadAd(EnumC10382l.class), 2, StockOrUnknown);

    EnumC10382l(int i) {
        this.f21197l = i;
    }

    @Override // defpackage.InterfaceC16520l
    public final int getValue() {
        return this.f21197l;
    }
}
