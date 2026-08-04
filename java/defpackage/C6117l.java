package defpackage;

/* JADX INFO: renamed from: lؘۧؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6117l implements InterfaceC16711l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public long f12907l = 0;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC7316l f12908l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC13460l f12909l;

    public C6117l(InterfaceC13460l interfaceC13460l, InterfaceC7316l interfaceC7316l) {
        this.f12909l = interfaceC13460l;
        this.f12908l = interfaceC7316l;
    }

    @Override // defpackage.InterfaceC16711l
    public final long license(long j, long j2, C16918l c16918l, EnumC9931l enumC9931l) {
        long jYandex = this.f12908l.yandex();
        if ((9223372034707292159L & jYandex) == 9205357640488583168L) {
            jYandex = this.f12907l;
        }
        this.f12907l = jYandex;
        return C5177l.amazon(C5177l.amazon(c16918l.crashlytics(), AbstractC3383l.isPro(jYandex)), this.f12909l.yandex(j2, 0L, enumC9931l));
    }
}
