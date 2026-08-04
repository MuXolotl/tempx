package defpackage;

/* JADX INFO: renamed from: lؘؖۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3947l extends AbstractC14971l implements InterfaceC7150l {

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final /* synthetic */ int f8126l;

    @Override // defpackage.InterfaceC7150l
    public InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        long jMo1453l = mo1453l(interfaceC6357l, j);
        if (mo1454l()) {
            jMo1453l = AbstractC7563l.purchase(j, jMo1453l);
        }
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(jMo1453l);
        return interfaceC7448l.isVip(abstractC10113lAdcel.f20592l, abstractC10113lAdcel.f20591l, C14054l.f27396l, new C10889l(abstractC10113lAdcel, 7));
    }

    @Override // defpackage.InterfaceC7150l
    public int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        switch (this.f8126l) {
            case 0:
                break;
        }
        return interfaceC6357l.crashlytics(i);
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public abstract long mo1453l(InterfaceC6357l interfaceC6357l, long j);

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public abstract boolean mo1454l();

    @Override // defpackage.InterfaceC7150l
    public int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        switch (this.f8126l) {
            case 0:
                break;
        }
        return interfaceC6357l.mo1460for(i);
    }

    @Override // defpackage.InterfaceC7150l
    public int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        switch (this.f8126l) {
            case 0:
                break;
        }
        return interfaceC6357l.remoteconfig(i);
    }

    @Override // defpackage.InterfaceC7150l
    public int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        switch (this.f8126l) {
            case 0:
                break;
        }
        return interfaceC6357l.metrica(i);
    }
}
