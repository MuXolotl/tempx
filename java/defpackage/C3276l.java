package defpackage;

/* JADX INFO: renamed from: lٌؙؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3276l extends AbstractC14971l implements InterfaceC16031l, InterfaceC4325l {

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public boolean f7004l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final C4154l f7006l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C10839l f7007l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public boolean f7008l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public EnumC7283l f7009l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public InterfaceC14447l f7010l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public boolean f7011l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C1770l f7005l = new C1770l(6);

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public long f7003l = -1;

    public C3276l(EnumC7283l enumC7283l, C4154l c4154l, boolean z, InterfaceC14447l interfaceC14447l, C10839l c10839l) {
        this.f7009l = enumC7283l;
        this.f7006l = c4154l;
        this.f7008l = z;
        this.f7010l = interfaceC14447l;
        this.f7007l = c10839l;
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public static final float m1312l(C3276l c3276l, InterfaceC14447l interfaceC14447l, long j) {
        float f;
        C8896l c8896l;
        int iCompare;
        long j2 = c3276l.f7003l;
        C17893l c17893l = (C17893l) c3276l.f7005l.f4179l;
        int i = c17893l.f34846l - 1;
        Object[] objArr = c17893l.f34848l;
        if (i < objArr.length) {
            c8896l = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                C8896l c8896l2 = (C8896l) ((C8439l) objArr[i]).yandex.invoke();
                if (c8896l2 != null) {
                    long jMopub = c8896l2.mopub();
                    long jMopub2 = AbstractC14707l.mopub(c3276l.m1315l());
                    f = 0.0f;
                    int iOrdinal = c3276l.f7009l.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jMopub & 4294967295L)), Float.intBitsToFloat((int) (jMopub2 & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            C18725l.billing();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jMopub >> 32)), Float.intBitsToFloat((int) (jMopub2 >> 32)));
                    }
                    if (iCompare > 0) {
                        if (c8896l != null) {
                            break;
                        }
                        c8896l = c8896l2;
                        break;
                    }
                    c8896l = c8896l2;
                }
                i--;
            }
        } else {
            f = 0.0f;
            c8896l = null;
        }
        if (c8896l == null) {
            C8896l c8896l3 = c3276l.f7004l ? (C8896l) c3276l.f7007l.invoke() : null;
            if (c8896l3 == null) {
                return f;
            }
            c8896l = c8896l3;
        }
        long jMopub3 = AbstractC14707l.mopub(j2);
        int iOrdinal2 = c3276l.f7009l.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = c8896l.loadAd;
            return interfaceC14447l.yandex(f2 - ((int) (j & 4294967295L)), c8896l.amazon - f2, Float.intBitsToFloat((int) (jMopub3 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f3 = c8896l.yandex;
            return interfaceC14447l.yandex(f3 - ((int) (j >> 32)), c8896l.crashlytics - f3, Float.intBitsToFloat((int) (jMopub3 >> 32)));
        }
        C18725l.billing();
        return f;
    }

    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    public static boolean m1313l(C3276l c3276l, C8896l c8896l, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = c3276l.m1315l();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jM1314l = c3276l.m1314l(c8896l, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jM1314l >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jM1314l & 4294967295L))) <= 0.5f;
    }

    @Override // defpackage.InterfaceC4325l
    public final void Signature(long j) {
        int iSubs;
        long j2;
        long jM1315l = m1315l();
        this.f7003l = j;
        int iOrdinal = this.f7009l.ordinal();
        if (iOrdinal == 0) {
            iSubs = AbstractC8576l.subs((int) (j & 4294967295L), (int) (jM1315l & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                C18725l.billing();
                return;
            }
            iSubs = AbstractC8576l.subs((int) (j >> 32), (int) (jM1315l >> 32));
        }
        if (iSubs >= 0) {
            return;
        }
        if (this.f7008l) {
            j2 = 0;
        } else {
            j2 = this.f7009l == EnumC7283l.f15126l ? ((long) (((int) (jM1315l & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (jM1315l >> 32)) - ((int) (j >> 32)))) << 32;
        }
        long j3 = j2;
        C8896l c8896l = (C8896l) this.f7007l.invoke();
        if (c8896l == null || this.f7011l || this.f7004l || !m1313l(this, c8896l, jM1315l, 0L, 2) || m1313l(this, c8896l, 0L, j3, 1)) {
            return;
        }
        this.f7004l = true;
        m1316l(j3);
    }

    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
    public final long m1314l(C8896l c8896l, long j, long j2) {
        long jMopub = AbstractC14707l.mopub(j);
        int iOrdinal = this.f7009l.ordinal();
        if (iOrdinal == 0) {
            InterfaceC14447l interfaceC14447l = this.f7010l;
            if (interfaceC14447l == null) {
                interfaceC14447l = (InterfaceC14447l) AbstractC13402l.loadAd(this, AbstractC10872l.yandex);
            }
            float f = c8896l.loadAd;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(interfaceC14447l.yandex(f - ((int) (j2 & 4294967295L)), c8896l.amazon - f, Float.intBitsToFloat((int) (jMopub & 4294967295L))))) & 4294967295L);
        }
        if (iOrdinal != 1) {
            C18725l.billing();
            return 0L;
        }
        InterfaceC14447l interfaceC14447l2 = this.f7010l;
        if (interfaceC14447l2 == null) {
            interfaceC14447l2 = (InterfaceC14447l) AbstractC13402l.loadAd(this, AbstractC10872l.yandex);
        }
        float f2 = c8896l.yandex;
        return (((long) Float.floatToRawIntBits(interfaceC14447l2.yandex(f2 - ((int) (j2 >> 32)), c8896l.crashlytics - f2, Float.intBitsToFloat((int) (jMopub >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final boolean mo512l() {
        return false;
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public final long m1315l() {
        long j = this.f7003l;
        if (C4999l.loadAd(j, -1L)) {
            return 0L;
        }
        return j;
    }

    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
    public final void m1316l(long j) {
        InterfaceC14447l interfaceC14447l = this.f7010l;
        if (interfaceC14447l == null) {
            interfaceC14447l = (InterfaceC14447l) AbstractC13402l.loadAd(this, AbstractC10872l.yandex);
        }
        InterfaceC14447l interfaceC14447l2 = interfaceC14447l;
        if (this.f7011l) {
            AbstractC14825l.crashlytics("launchAnimation called when previous animation was running");
        }
        InterfaceC14447l interfaceC14447l3 = this.f7010l;
        if (interfaceC14447l3 == null) {
            interfaceC14447l3 = (InterfaceC14447l) AbstractC13402l.loadAd(this, AbstractC10872l.yandex);
        }
        AbstractC10999l.mopub(m3914l(), null, 4, new C8510l(this, new C2643l(interfaceC14447l3.loadAd()), interfaceC14447l2, j, (InterfaceC14029l) null), 1);
    }
}
