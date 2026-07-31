package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lؚٜؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6943l implements InterfaceC13490l, InterfaceC4191l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public InterfaceC1489l f14556l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C0580l f14557l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C16977l f14558l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C16977l f14559l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C0432l f14560l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public float f14561l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public long f14562l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C0580l f14563l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C0580l f14564l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public InterfaceC1489l f14565l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public C16977l f14566l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C0580l f14567l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f14568l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public C2494l f14569l;

    public final int amazon() {
        int i;
        C2494l c2494l = this.f14569l;
        int i2 = 0;
        if (c2494l == null) {
            return 0;
        }
        C16977l c16977l = (C16977l) c2494l.f5290l;
        int[] iArr = c16977l.loadAd;
        Object[] objArr = c16977l.crashlytics;
        long[] jArr = c16977l.yandex;
        int length = jArr.length - 2;
        long j = 0;
        if (length < 0) {
            i = i2;
            break;
        }
        int i3 = 0;
        i = 0;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j2) < 128) {
                        int i6 = (i3 << 3) + i5;
                        int i7 = iArr[i6];
                        if (i7 < 50) {
                            j |= 1 << ((byte) i7);
                        } else {
                            i |= 1 << (i7 - 50);
                        }
                    }
                    j2 >>= 8;
                }
                if (i4 != 8) {
                    break;
                }
            }
            if (i3 == length) {
                i2 = i;
                i = i2;
                break;
            }
            i3++;
        }
        return AbstractC6512l.purchase(i) | AbstractC6512l.mopub(j);
    }

    public final void billing(int i, InterfaceC1489l interfaceC1489l, InterfaceC1489l interfaceC1489l2) {
        if (interfaceC1489l == null || interfaceC1489l.equals(AbstractC18011l.yandex)) {
            C16977l c16977l = this.f14558l;
            if (c16977l != null) {
            }
        } else {
            C16977l c16977l2 = this.f14558l;
            if (c16977l2 == null) {
                C16977l c16977l3 = AbstractC6903l.yandex;
                c16977l2 = new C16977l();
                this.f14558l = c16977l2;
            }
            c16977l2.subs(i, interfaceC1489l);
        }
        if (interfaceC1489l2 != null && !interfaceC1489l2.equals(AbstractC18011l.yandex)) {
            C16977l c16977l4 = this.f14559l;
            if (c16977l4 == null) {
                C16977l c16977l5 = AbstractC6903l.yandex;
                c16977l4 = new C16977l();
                this.f14559l = c16977l4;
            }
            c16977l4.subs(i, interfaceC1489l2);
            return;
        }
        C16977l c16977l6 = this.f14559l;
        if (c16977l6 != null) {
            InterfaceC1489l interfaceC1489l3 = (InterfaceC1489l) c16977l6.loadAd(i);
            c16977l6.mopub(i);
            if (interfaceC1489l3 != null) {
                C16977l c16977l7 = this.f14566l;
                if (c16977l7 == null) {
                    C16977l c16977l8 = AbstractC6903l.yandex;
                    c16977l7 = new C16977l();
                    this.f14566l = c16977l7;
                }
                c16977l7.subs(i, interfaceC1489l3);
            }
        }
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: case */
    public final long mo866case(float f) {
        return AbstractC2812l.purchase(this, mo867final(f));
    }

    public final void crashlytics() {
        C0580l c0580l;
        C0580l c0580l2;
        long j;
        boolean z;
        long j2;
        C2494l c2494l;
        InterfaceC1489l interfaceC1489l;
        long j3;
        int[] iArr;
        int[] iArr2;
        long j4;
        C0432l c0432l = this.f14560l;
        this.f14560l = null;
        C2494l c2494l2 = this.f14569l;
        if (((c2494l2 == null || c2494l2.m1201l()) && this.f14562l == 0 && this.f14568l == 0) || (c0580l = this.f14557l) == null || (c0580l2 = this.f14564l) == null) {
            return;
        }
        int iAdmob = AbstractC6512l.admob(this.f14568l, this.f14562l);
        long jSubs = AbstractC6512l.subs(this.f14568l, this.f14562l);
        int iAdmob2 = c0580l2.admob(iAdmob, c0580l);
        long jSubs2 = c0580l2.subs(c0580l, jSubs);
        if (jSubs2 == 0 && iAdmob2 == 0) {
            return;
        }
        C2494l c2494l3 = this.f14569l;
        if (c2494l3 == null) {
            c2494l3 = new C2494l(23);
            this.f14569l = c2494l3;
        }
        long jAdmob = (((long) AbstractC6512l.admob(iAdmob2, jSubs2)) << 50) | ((-257698037761L) & jSubs2);
        long j5 = jSubs | (((long) iAdmob) << 50);
        C16977l c16977l = this.f14558l;
        C16977l c16977l2 = this.f14559l;
        C16977l c16977l3 = this.f14566l;
        synchronized (c2494l3.f5291l) {
            try {
                C16977l c16977l4 = (C16977l) c2494l3.f5290l;
                int[] iArr3 = c16977l4.loadAd;
                Object[] objArr = c16977l4.crashlytics;
                long[] jArr = c16977l4.yandex;
                int i = 2;
                int length = jArr.length - 2;
                long j6 = j5;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j7 = jArr[i2];
                        j = jAdmob;
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            int i4 = 0;
                            while (i4 < i3) {
                                if ((j7 & 255) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    int i6 = iArr3[i5];
                                    iArr2 = iArr3;
                                    C2517l c2517l = (C2517l) objArr[i5];
                                    j4 = j7;
                                    int iInmobi = AbstractC5020l.inmobi(c2517l.crashlytics);
                                    int i7 = 1;
                                    if (iInmobi != 1) {
                                        if (iInmobi == i || iInmobi == 3) {
                                            i7 = 1;
                                        }
                                    }
                                    c2517l.crashlytics = i7;
                                    i4++;
                                    iArr3 = iArr2;
                                    j7 = j4 >> 8;
                                    i = 2;
                                } else {
                                    iArr2 = iArr3;
                                    j4 = j7;
                                }
                                i4++;
                                iArr3 = iArr2;
                                j7 = j4 >> 8;
                                i = 2;
                            }
                            iArr = iArr3;
                            z = true;
                            if (i3 != 8) {
                                break;
                            }
                        } else {
                            iArr = iArr3;
                            z = true;
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                        jAdmob = j;
                        iArr3 = iArr;
                        i = 2;
                    }
                } else {
                    j = jAdmob;
                    z = true;
                }
                j2 = 0;
                if (j6 != 0) {
                    while (j6 != 0) {
                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j6);
                        if (c16977l == null || (interfaceC1489l = (InterfaceC1489l) c16977l.loadAd(iNumberOfTrailingZeros)) == null) {
                            interfaceC1489l = c16977l3 != null ? (InterfaceC1489l) c16977l3.loadAd(iNumberOfTrailingZeros) : null;
                            if (interfaceC1489l == null) {
                                interfaceC1489l = c16977l2 != null ? (InterfaceC1489l) c16977l2.loadAd(iNumberOfTrailingZeros) : null;
                                if (interfaceC1489l == null) {
                                    interfaceC1489l = AbstractC18011l.yandex;
                                }
                            }
                        }
                        long j8 = 1 << iNumberOfTrailingZeros;
                        boolean z2 = (j & j8) != 0 ? z : false;
                        C16977l c16977l5 = (C16977l) c2494l3.f5290l;
                        long j9 = j2;
                        C2517l c2517l2 = (C2517l) c16977l5.loadAd(iNumberOfTrailingZeros);
                        if (c2517l2 != null) {
                            if (z2 || !AbstractC8576l.yandex(c2517l2.yandex, interfaceC1489l)) {
                                c2517l2.yandex = interfaceC1489l;
                                c2517l2.crashlytics = 3;
                            } else {
                                c2517l2.crashlytics = 2;
                                j3 = j9;
                            }
                            j6 ^= j8;
                            j2 = j3;
                            z = true;
                        } else if (z2) {
                            c16977l5.subs(iNumberOfTrailingZeros, new C2517l(c2494l3, interfaceC1489l));
                        }
                        j3 = j9 | j8;
                        j6 ^= j8;
                        j2 = j3;
                        z = true;
                    }
                }
                c2494l3.m1172l(c0432l);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (j2 != 0) {
            C0580l c0580l3 = this.f14567l;
            if (c0580l3 == null) {
                c0580l3 = new C0580l();
                this.f14567l = c0580l3;
            }
            long j10 = 2251799813685247L & j2;
            int i8 = (int) (j2 >> 50);
            long jSubs3 = AbstractC6512l.subs(i8, j10);
            int iAdmob3 = AbstractC6512l.admob(i8, j10);
            c0580l2.mopub(c0580l3, jSubs3, iAdmob3);
            C0580l c0580l4 = this.f14563l;
            if (c0580l4 != null) {
                c0580l4.mopub(c0580l3, jSubs3, iAdmob3);
            }
            c2494l = null;
            this.f14563l = null;
        } else {
            c2494l = null;
        }
        if (c2494l3.m1201l()) {
            this.f14569l = c2494l;
        }
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: final */
    public final float mo867final(float f) {
        return f / loadAd();
    }

    @Override // defpackage.InterfaceC13490l
    public final /* synthetic */ float inmobi(long j) {
        return AbstractC2812l.amazon(j, this);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: instanceof */
    public final float mo868instanceof(float f) {
        return loadAd() * f;
    }

    @Override // defpackage.InterfaceC13490l
    public final /* synthetic */ long license(long j) {
        return AbstractC9361l.loadAd(j, this);
    }

    @Override // defpackage.InterfaceC13490l
    public final float loadAd() {
        return this.f14561l;
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؒۢۜ */
    public final /* synthetic */ long mo869l(long j) {
        return AbstractC9361l.amazon(j, this);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final /* synthetic */ int mo870l(float f) {
        return AbstractC9361l.yandex(this, f);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lٕؓٗ */
    public final /* synthetic */ float mo871l(long j) {
        return AbstractC9361l.crashlytics(j, this);
    }

    public final void mopub(int i, C0580l c0580l) {
        C0580l c0580l2 = this.f14557l;
        if (c0580l2 == null) {
            c0580l2 = AbstractC6512l.vip;
        }
        C0580l c0580l3 = c0580l2;
        c0580l3.billing(c0580l);
        C2494l c2494l = this.f14569l;
        if (c2494l == null) {
            return;
        }
        C0580l c0580l4 = this.f14567l;
        if (c0580l4 == null && (c0580l4 = this.f14564l) == null) {
            return;
        }
        C0580l c0580l5 = c0580l4;
        if (c2494l.m1201l()) {
            this.f14567l = null;
            this.f14569l = null;
            return;
        }
        int i2 = i & 1;
        int i3 = i & 8;
        int i4 = i & 2;
        int i5 = i & 4;
        int i6 = i & 32;
        int i7 = i & 16;
        long j = (i2 != 0 ? AbstractC6512l.loadAd : 0L) | (i3 != 0 ? AbstractC6512l.crashlytics : 0L) | (i4 != 0 ? AbstractC6512l.amazon : 0L) | (i5 != 0 ? AbstractC6512l.purchase : 0L) | (i6 != 0 ? AbstractC6512l.billing : 0L) | (i7 != 0 ? AbstractC6512l.mopub : 0L);
        int i8 = (i2 != 0 ? AbstractC6512l.admob : 0) | (i3 != 0 ? AbstractC6512l.subs : 0) | (i4 != 0 ? AbstractC6512l.isPro : 0) | (i5 != 0 ? AbstractC6512l.firebase : 0) | (i6 != 0 ? AbstractC6512l.smaato : 0);
        int i9 = i7 != 0 ? AbstractC6512l.remoteconfig : 0;
        long jM1202l = c2494l.m1202l();
        int i10 = (int) (jM1202l >> 50);
        long jSubs = j & AbstractC6512l.subs(i10, 2251799813685247L & jM1202l);
        int iAdmob = (i8 | i9) & AbstractC6512l.admob(i10, jSubs);
        if (jSubs == 0 && iAdmob == 0) {
            return;
        }
        AbstractC6512l.yandex(c0580l5, c0580l3, c2494l, jSubs, iAdmob, c0580l);
    }

    public final void purchase(byte b, InterfaceC1489l interfaceC1489l, InterfaceC1489l interfaceC1489l2) {
        C1280l c1280l = C1280l.yandex;
        if (interfaceC1489l == c1280l) {
            long j = this.f14562l;
            if (b >= 50 || (j & (1 << b)) == 0) {
                interfaceC1489l = null;
            } else {
                C16977l c16977l = this.f14558l;
                if (c16977l == null || (interfaceC1489l = (InterfaceC1489l) c16977l.loadAd(b)) == null) {
                    interfaceC1489l = AbstractC18011l.yandex;
                }
            }
        }
        if (interfaceC1489l2 == c1280l) {
            long j2 = this.f14562l;
            if (b >= 50 || (j2 & (1 << b)) == 0) {
                interfaceC1489l2 = null;
            } else {
                C16977l c16977l2 = this.f14559l;
                if (c16977l2 == null || (interfaceC1489l2 = (InterfaceC1489l) c16977l2.loadAd(b)) == null) {
                    interfaceC1489l2 = AbstractC18011l.yandex;
                }
            }
        }
        this.f14562l = (interfaceC1489l == null || interfaceC1489l2 == null) ? this.f14562l & (~(1 << b)) : this.f14562l | (1 << b);
        billing(b, interfaceC1489l, interfaceC1489l2);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: static */
    public final float mo872static(int i) {
        return i / loadAd();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: super */
    public final float mo873super() {
        return 1.0f;
    }

    @Override // defpackage.InterfaceC4191l
    /* JADX INFO: renamed from: this */
    public final Object mo539this(AbstractC5189l abstractC5189l) {
        return AbstractC13402l.loadAd(this.f14560l, abstractC5189l);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: transient */
    public final int mo874transient(long j) {
        return Math.round(mo871l(j));
    }

    public final void yandex(long j) {
        purchase((byte) 34, this.f14565l, this.f14556l);
        InterfaceC1489l interfaceC1489l = this.f14565l;
        InterfaceC1489l interfaceC1489l2 = this.f14556l;
        C1280l c1280l = C1280l.yandex;
        if (interfaceC1489l == c1280l) {
            if ((this.f14568l & 2) != 0) {
                C16977l c16977l = this.f14558l;
                if (c16977l == null || (interfaceC1489l = (InterfaceC1489l) c16977l.loadAd(51)) == null) {
                    interfaceC1489l = AbstractC18011l.yandex;
                }
            } else {
                interfaceC1489l = null;
            }
        }
        if (interfaceC1489l2 == c1280l) {
            if ((this.f14568l & 2) != 0) {
                C16977l c16977l2 = this.f14559l;
                if (c16977l2 == null || (interfaceC1489l2 = (InterfaceC1489l) c16977l2.loadAd(51)) == null) {
                    interfaceC1489l2 = AbstractC18011l.yandex;
                }
            } else {
                interfaceC1489l2 = null;
            }
        }
        this.f14568l = (interfaceC1489l == null || interfaceC1489l2 == null) ? this.f14568l & (-3) : this.f14568l | 2;
        billing(51, interfaceC1489l, interfaceC1489l2);
        C0580l c0580l = this.f14557l;
        if (c0580l != null) {
            c0580l.loadAd(j);
        }
    }
}
