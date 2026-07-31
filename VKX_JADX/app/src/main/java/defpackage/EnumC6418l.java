package defpackage;

/* JADX INFO: renamed from: lؙّٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC6418l implements InterfaceC16520l {
    Verbose(0),
    Debug(1),
    Info(2),
    Warning(3),
    Error(4);


    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f13435l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C6721l f13431l = new C6721l(1, AbstractC18202l.yandex.loadAd(EnumC6418l.class), 2, Verbose);

    EnumC6418l(int i) {
        this.f13435l = i;
    }

    @Override // defpackage.InterfaceC16520l
    public final int getValue() {
        return this.f13435l;
    }
}
