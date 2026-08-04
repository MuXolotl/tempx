package defpackage;

/* JADX INFO: renamed from: lٌؘؙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8604l extends AbstractC14971l implements InterfaceC7150l, InterfaceC8605l {

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final C14293l f17748l = new C14293l();

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public C5138l f17749l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public EnumC7283l f17750l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public InterfaceC5793l f17751l;

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(j);
        return interfaceC7448l.isVip(abstractC10113lAdcel.f20592l, abstractC10113lAdcel.f20591l, C14054l.f27396l, new C10889l(abstractC10113lAdcel, 8));
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.firebase(this, abstractC11754l, interfaceC6357l, i);
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final boolean m2334l(C17149l c17149l, int i) {
        if (i != 5 && i != 6) {
            if (i == 3 || i == 4) {
                if (this.f17750l != EnumC7283l.f15126l) {
                }
            } else if (i != 1 && i != 2) {
                C8339l.smaato("Lazy list does not support beyond bounds layout for the specified direction");
                return false;
            }
            if (m2335l(i) ? c17149l.yandex > 0 : c17149l.loadAd < this.f17751l.yandex() - 1) {
                return true;
            }
        } else if (this.f17750l != EnumC7283l.f15125l) {
            if (m2335l(i)) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public final boolean m2335l(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int iOrdinal = AbstractC5573l.metrica(this).f7691l.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            C18725l.billing();
            return false;
        }
        if (i != 4) {
            C8339l.smaato("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int iOrdinal2 = AbstractC5573l.metrica(this).f7691l.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        C18725l.billing();
        return false;
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
