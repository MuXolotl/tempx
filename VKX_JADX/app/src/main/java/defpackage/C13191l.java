package defpackage;

/* JADX INFO: renamed from: lؙْۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13191l extends AbstractC3947l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public C15738l f25801l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public long f25802l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public InterfaceC8714l f25803l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public C14931l f25804l;

    @Override // defpackage.AbstractC3947l, defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        long j2;
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(j);
        if (interfaceC7448l.mo992import()) {
            j2 = (((long) abstractC10113lAdcel.f20592l) << 32) | (((long) abstractC10113lAdcel.f20591l) & 4294967295L);
        } else {
            C15738l c15738l = this.f25801l;
            int i = abstractC10113lAdcel.f20592l;
            if (c15738l == null) {
                long j3 = (((long) i) << 32) | (((long) abstractC10113lAdcel.f20591l) & 4294967295L);
                this.f25802l = j3;
                j2 = j3;
            } else {
                long j4 = (((long) abstractC10113lAdcel.f20591l) & 4294967295L) | (((long) i) << 32);
                C17421l c17421lYandex = c15738l.yandex(new C3006l(this, j4), null, null, new C5604l(this, j4, 3));
                this.f25804l.getClass();
                j2 = ((C4999l) c17421lYandex.getValue()).yandex;
                this.f25802l = ((C4999l) c17421lYandex.getValue()).yandex;
            }
        }
        return interfaceC7448l.isVip((int) (j2 >> 32), (int) (4294967295L & j2), C14054l.f27396l, new C12567l(this, abstractC10113lAdcel, j2));
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lًٚٔ */
    public final void mo513l() {
        this.f25802l = -9223372034707292160L;
    }
}
