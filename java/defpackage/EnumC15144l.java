package defpackage;

/* JADX INFO: renamed from: lٔۙۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC15144l implements InterfaceC16520l {
    NEW(0),
    RUNNABLE(1),
    BLOCKED(2),
    WAITING(3),
    TIMED_WAITING(4),
    TERMINATED(5);


    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f29706l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C3609l f29701l = new C3609l(1, AbstractC18202l.yandex.loadAd(EnumC15144l.class), 2, NEW);

    EnumC15144l(int i) {
        this.f29706l = i;
    }

    @Override // defpackage.InterfaceC16520l
    public final int getValue() {
        return this.f29706l;
    }
}
