package defpackage;

/* JADX INFO: renamed from: lؙٝٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6609l {
    public AbstractC10113l amazon;
    public C18142l billing;
    public InterfaceC6357l crashlytics;
    public AbstractC10113l loadAd;
    public C18142l purchase;
    public InterfaceC6357l yandex;

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C6609l);
    }

    public final int hashCode() {
        return AbstractC5020l.inmobi(2) * 961;
    }

    public final void loadAd(InterfaceC6357l interfaceC6357l, InterfaceC6357l interfaceC6357l2, long j) {
        long jAmazon = AbstractC11141l.amazon(1, j);
        if (interfaceC6357l != null) {
            int iRemoteconfig = interfaceC6357l.remoteconfig(C15519l.mopub(jAmazon));
            this.purchase = new C18142l(C18142l.yandex(iRemoteconfig, interfaceC6357l.mo1460for(iRemoteconfig)));
            this.yandex = interfaceC6357l instanceof InterfaceC6357l ? interfaceC6357l : null;
            this.loadAd = null;
        }
        if (interfaceC6357l2 != null) {
            int iRemoteconfig2 = interfaceC6357l2.remoteconfig(C15519l.mopub(jAmazon));
            this.billing = new C18142l(C18142l.yandex(iRemoteconfig2, interfaceC6357l2.mo1460for(iRemoteconfig2)));
            this.crashlytics = interfaceC6357l2 instanceof InterfaceC6357l ? interfaceC6357l2 : null;
            this.amazon = null;
        }
    }

    public final String toString() {
        return AbstractC15560l.Signature("FlowLayoutOverflowState(type=", "Clip", ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)");
    }

    public final C18142l yandex(int i, int i2, boolean z) {
        int iInmobi = AbstractC5020l.inmobi(2);
        if (iInmobi == 0 || iInmobi == 1) {
            return null;
        }
        if (iInmobi == 2) {
            if (z) {
                return this.purchase;
            }
            return null;
        }
        if (iInmobi != 3) {
            C18725l.billing();
            return null;
        }
        if (z) {
            return this.purchase;
        }
        if (i + 1 < 0 || i2 < 0) {
            return null;
        }
        return this.billing;
    }
}
