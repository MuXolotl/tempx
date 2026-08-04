package defpackage;

/* JADX INFO: renamed from: lٖٟ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16547l extends AbstractC14971l implements InterfaceC7150l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public float f32493l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public float f32494l;

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        int iIsPro;
        int iSubs;
        if (Float.isNaN(this.f32494l) || C15519l.isPro(j) != 0) {
            iIsPro = C15519l.isPro(j);
        } else {
            int iMo870l = interfaceC7448l.mo870l(this.f32494l);
            iIsPro = C15519l.admob(j);
            if (iMo870l < 0) {
                iMo870l = 0;
            }
            if (iMo870l <= iIsPro) {
                iIsPro = iMo870l;
            }
        }
        int iAdmob = C15519l.admob(j);
        if (Float.isNaN(this.f32493l) || C15519l.subs(j) != 0) {
            iSubs = C15519l.subs(j);
        } else {
            int iMo870l2 = interfaceC7448l.mo870l(this.f32493l);
            iSubs = C15519l.mopub(j);
            int i = iMo870l2 >= 0 ? iMo870l2 : 0;
            if (i <= iSubs) {
                iSubs = i;
            }
        }
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(AbstractC7563l.yandex(iIsPro, iAdmob, iSubs, C15519l.mopub(j)));
        return interfaceC7448l.isVip(abstractC10113lAdcel.f20592l, abstractC10113lAdcel.f20591l, C14054l.f27396l, new C10889l(abstractC10113lAdcel, 18));
    }

    @Override // defpackage.InterfaceC7150l
    public final int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        int iCrashlytics = interfaceC6357l.crashlytics(i);
        int iYandex = !Float.isNaN(this.f32493l) ? AbstractC9361l.yandex(abstractC11754l, this.f32493l) : 0;
        return iCrashlytics < iYandex ? iYandex : iCrashlytics;
    }

    @Override // defpackage.InterfaceC7150l
    public final int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        int iMo1460for = interfaceC6357l.mo1460for(i);
        int iYandex = !Float.isNaN(this.f32493l) ? AbstractC9361l.yandex(abstractC11754l, this.f32493l) : 0;
        return iMo1460for < iYandex ? iYandex : iMo1460for;
    }

    @Override // defpackage.InterfaceC7150l
    public final int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        int iRemoteconfig = interfaceC6357l.remoteconfig(i);
        int iYandex = !Float.isNaN(this.f32494l) ? AbstractC9361l.yandex(abstractC11754l, this.f32494l) : 0;
        return iRemoteconfig < iYandex ? iYandex : iRemoteconfig;
    }

    @Override // defpackage.InterfaceC7150l
    public final int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        int iMetrica = interfaceC6357l.metrica(i);
        int iYandex = !Float.isNaN(this.f32494l) ? AbstractC9361l.yandex(abstractC11754l, this.f32494l) : 0;
        return iMetrica < iYandex ? iYandex : iMetrica;
    }
}
