package defpackage;

/* JADX INFO: renamed from: lُِۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10990l extends AbstractC14971l implements InterfaceC7150l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public float f22137l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public boolean f22138l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public float f22139l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public float f22140l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public float f22141l;

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        int iIsPro;
        int iAdmob;
        int iSubs;
        int iMopub;
        long jYandex;
        long jM3028l = m3028l(interfaceC7448l);
        if (this.f22138l) {
            jYandex = AbstractC7563l.purchase(j, jM3028l);
        } else {
            if (Float.isNaN(this.f22140l)) {
                iIsPro = C15519l.isPro(j);
                int iAdmob2 = C15519l.admob(jM3028l);
                if (iIsPro > iAdmob2) {
                    iIsPro = iAdmob2;
                }
            } else {
                iIsPro = C15519l.isPro(jM3028l);
            }
            if (Float.isNaN(this.f22139l)) {
                iAdmob = C15519l.admob(j);
                int iIsPro2 = C15519l.isPro(jM3028l);
                if (iAdmob < iIsPro2) {
                    iAdmob = iIsPro2;
                }
            } else {
                iAdmob = C15519l.admob(jM3028l);
            }
            if (Float.isNaN(this.f22137l)) {
                iSubs = C15519l.subs(j);
                int iMopub2 = C15519l.mopub(jM3028l);
                if (iSubs > iMopub2) {
                    iSubs = iMopub2;
                }
            } else {
                iSubs = C15519l.subs(jM3028l);
            }
            if (Float.isNaN(this.f22141l)) {
                iMopub = C15519l.mopub(j);
                int iSubs2 = C15519l.subs(jM3028l);
                if (iMopub < iSubs2) {
                    iMopub = iSubs2;
                }
            } else {
                iMopub = C15519l.mopub(jM3028l);
            }
            jYandex = AbstractC7563l.yandex(iIsPro, iAdmob, iSubs, iMopub);
        }
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(jYandex);
        return interfaceC7448l.isVip(abstractC10113lAdcel.f20592l, abstractC10113lAdcel.f20591l, C14054l.f27396l, new C10889l(abstractC10113lAdcel, 12));
    }

    @Override // defpackage.InterfaceC7150l
    public final int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        long jM3028l = m3028l(abstractC11754l);
        if (C15519l.purchase(jM3028l)) {
            return C15519l.mopub(jM3028l);
        }
        if (!this.f22138l) {
            i = AbstractC7563l.mopub(i, jM3028l);
        }
        return AbstractC7563l.billing(interfaceC6357l.crashlytics(i), jM3028l);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final long m3028l(InterfaceC7448l interfaceC7448l) {
        int iMo870l;
        int iMo870l2;
        int iMo870l3;
        int i = 0;
        if (Float.isNaN(this.f22139l)) {
            iMo870l = Integer.MAX_VALUE;
        } else {
            iMo870l = interfaceC7448l.mo870l(this.f22139l);
            if (iMo870l < 0) {
                iMo870l = 0;
            }
        }
        if (Float.isNaN(this.f22141l)) {
            iMo870l2 = Integer.MAX_VALUE;
        } else {
            iMo870l2 = interfaceC7448l.mo870l(this.f22141l);
            if (iMo870l2 < 0) {
                iMo870l2 = 0;
            }
        }
        if (Float.isNaN(this.f22140l)) {
            iMo870l3 = 0;
        } else {
            iMo870l3 = interfaceC7448l.mo870l(this.f22140l);
            if (iMo870l3 < 0) {
                iMo870l3 = 0;
            }
            if (iMo870l3 > iMo870l) {
                iMo870l3 = iMo870l;
            }
            if (iMo870l3 == Integer.MAX_VALUE) {
                iMo870l3 = 0;
            }
        }
        if (!Float.isNaN(this.f22137l)) {
            int iMo870l4 = interfaceC7448l.mo870l(this.f22137l);
            if (iMo870l4 < 0) {
                iMo870l4 = 0;
            }
            if (iMo870l4 > iMo870l2) {
                iMo870l4 = iMo870l2;
            }
            if (iMo870l4 != Integer.MAX_VALUE) {
                i = iMo870l4;
            }
        }
        return AbstractC7563l.yandex(iMo870l3, iMo870l, i, iMo870l2);
    }

    @Override // defpackage.InterfaceC7150l
    public final int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        long jM3028l = m3028l(abstractC11754l);
        if (C15519l.purchase(jM3028l)) {
            return C15519l.mopub(jM3028l);
        }
        if (!this.f22138l) {
            i = AbstractC7563l.mopub(i, jM3028l);
        }
        return AbstractC7563l.billing(interfaceC6357l.mo1460for(i), jM3028l);
    }

    @Override // defpackage.InterfaceC7150l
    public final int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        long jM3028l = m3028l(abstractC11754l);
        if (C15519l.billing(jM3028l)) {
            return C15519l.admob(jM3028l);
        }
        if (!this.f22138l) {
            i = AbstractC7563l.billing(i, jM3028l);
        }
        return AbstractC7563l.mopub(interfaceC6357l.remoteconfig(i), jM3028l);
    }

    @Override // defpackage.InterfaceC7150l
    public final int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        long jM3028l = m3028l(abstractC11754l);
        if (C15519l.billing(jM3028l)) {
            return C15519l.admob(jM3028l);
        }
        if (!this.f22138l) {
            i = AbstractC7563l.billing(i, jM3028l);
        }
        return AbstractC7563l.mopub(interfaceC6357l.metrica(i), jM3028l);
    }
}
