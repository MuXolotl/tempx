package defpackage;

/* JADX INFO: renamed from: lؙؕۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3243l extends AbstractC14971l implements InterfaceC7150l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public boolean f6936l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public float f6937l;

    /* JADX WARN: Code duplicated, block: B:52:0x00bf  */
    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        long jM1303l;
        if (this.f6936l) {
            jM1303l = m1303l(j, true);
            if (C4999l.loadAd(jM1303l, 0L)) {
                jM1303l = m1305l(j, true);
                if (C4999l.loadAd(jM1303l, 0L)) {
                    jM1303l = m1304l(j, true);
                    if (C4999l.loadAd(jM1303l, 0L)) {
                        jM1303l = m1306l(j, true);
                        if (C4999l.loadAd(jM1303l, 0L)) {
                            jM1303l = m1303l(j, false);
                            if (C4999l.loadAd(jM1303l, 0L)) {
                                jM1303l = m1305l(j, false);
                                if (C4999l.loadAd(jM1303l, 0L)) {
                                    jM1303l = m1304l(j, false);
                                    if (C4999l.loadAd(jM1303l, 0L)) {
                                        jM1303l = m1306l(j, false);
                                        if (C4999l.loadAd(jM1303l, 0L)) {
                                            jM1303l = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            jM1303l = m1305l(j, true);
            if (C4999l.loadAd(jM1303l, 0L)) {
                jM1303l = m1303l(j, true);
                if (C4999l.loadAd(jM1303l, 0L)) {
                    jM1303l = m1306l(j, true);
                    if (C4999l.loadAd(jM1303l, 0L)) {
                        jM1303l = m1304l(j, true);
                        if (C4999l.loadAd(jM1303l, 0L)) {
                            jM1303l = m1305l(j, false);
                            if (C4999l.loadAd(jM1303l, 0L)) {
                                jM1303l = m1303l(j, false);
                                if (C4999l.loadAd(jM1303l, 0L)) {
                                    jM1303l = m1306l(j, false);
                                    if (C4999l.loadAd(jM1303l, 0L)) {
                                        jM1303l = m1304l(j, false);
                                        if (C4999l.loadAd(jM1303l, 0L)) {
                                            jM1303l = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!C4999l.loadAd(jM1303l, 0L)) {
            int i = (int) (jM1303l >> 32);
            int i2 = (int) (4294967295L & jM1303l);
            if (!((i >= 0) & (i2 >= 0))) {
                AbstractC10280l.yandex("width and height must be >= 0");
            }
            j = AbstractC7563l.admob(i, i, i2, i2);
        }
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(j);
        return interfaceC7448l.isVip(abstractC10113lAdcel.f20592l, abstractC10113lAdcel.f20591l, C14054l.f27396l, new C10889l(abstractC10113lAdcel, 1));
    }

    @Override // defpackage.InterfaceC7150l
    public final int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.f6937l) : interfaceC6357l.crashlytics(i);
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final long m1303l(long j, boolean z) {
        int iRound;
        int iMopub = C15519l.mopub(j);
        if (iMopub == Integer.MAX_VALUE || (iRound = Math.round(iMopub * this.f6937l)) <= 0) {
            return 0L;
        }
        if (!z || AbstractC17463l.billing(iRound, j, iMopub)) {
            return (((long) iRound) << 32) | (((long) iMopub) & 4294967295L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    public final long m1304l(long j, boolean z) {
        int iSubs = C15519l.subs(j);
        int iRound = Math.round(iSubs * this.f6937l);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || AbstractC17463l.billing(iRound, j, iSubs)) {
            return (((long) iRound) << 32) | (((long) iSubs) & 4294967295L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public final long m1305l(long j, boolean z) {
        int iRound;
        int iAdmob = C15519l.admob(j);
        if (iAdmob == Integer.MAX_VALUE || (iRound = Math.round(iAdmob / this.f6937l)) <= 0) {
            return 0L;
        }
        if (!z || AbstractC17463l.billing(iAdmob, j, iRound)) {
            return (((long) iAdmob) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
    public final long m1306l(long j, boolean z) {
        int iIsPro = C15519l.isPro(j);
        int iRound = Math.round(iIsPro / this.f6937l);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || AbstractC17463l.billing(iIsPro, j, iRound)) {
            return (((long) iIsPro) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override // defpackage.InterfaceC7150l
    public final int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.f6937l) : interfaceC6357l.mo1460for(i);
    }

    @Override // defpackage.InterfaceC7150l
    public final int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.f6937l) : interfaceC6357l.remoteconfig(i);
    }

    @Override // defpackage.InterfaceC7150l
    public final int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.f6937l) : interfaceC6357l.metrica(i);
    }
}
