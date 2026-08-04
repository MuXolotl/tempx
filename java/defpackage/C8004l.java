package defpackage;

/* JADX INFO: renamed from: lًٔ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8004l extends AbstractC14971l implements InterfaceC7150l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public float f16683l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public int f16684l;

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        int iIsPro;
        int iAdmob;
        int iMopub;
        int i;
        if (!C15519l.amazon(j) || this.f16684l == 1) {
            iIsPro = C15519l.isPro(j);
            iAdmob = C15519l.admob(j);
        } else {
            int iRound = Math.round(C15519l.admob(j) * this.f16683l);
            int iIsPro2 = C15519l.isPro(j);
            iIsPro = C15519l.admob(j);
            if (iRound < iIsPro2) {
                iRound = iIsPro2;
            }
            if (iRound <= iIsPro) {
                iIsPro = iRound;
            }
            iAdmob = iIsPro;
        }
        if (!C15519l.crashlytics(j) || this.f16684l == 2) {
            int iSubs = C15519l.subs(j);
            int iMopub2 = C15519l.mopub(j);
            iMopub = iSubs;
            i = iMopub2;
        } else {
            int iRound2 = Math.round(C15519l.mopub(j) * this.f16683l);
            int iSubs2 = C15519l.subs(j);
            iMopub = C15519l.mopub(j);
            if (iRound2 < iSubs2) {
                iRound2 = iSubs2;
            }
            if (iRound2 <= iMopub) {
                iMopub = iRound2;
            }
            i = iMopub;
        }
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(AbstractC7563l.yandex(iIsPro, iAdmob, iMopub, i));
        return interfaceC7448l.isVip(abstractC10113lAdcel.f20592l, abstractC10113lAdcel.f20591l, C14054l.f27396l, new C10889l(abstractC10113lAdcel, 5));
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
