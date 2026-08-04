package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lًؙؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0151l {
    public boolean admob;
    public final C6709l amazon;
    public boolean billing;
    public final C13698l crashlytics;
    public final C11029l firebase;
    public long isPro;
    public final ViewTreeObserverOnGlobalLayoutListenerC13840l loadAd;
    public boolean mopub;
    public final C12463l purchase;
    public final C10006l smaato;
    public RunnableC0037l subs;
    public final AbstractC14183l yandex;

    public C0151l(C16977l c16977l, ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l) {
        this.yandex = c16977l;
        this.loadAd = viewTreeObserverOnGlobalLayoutListenerC13840l;
        C13698l c13698l = new C13698l((char) 0, 22);
        c13698l.f26743l = new long[192];
        c13698l.f26746l = new long[192];
        this.crashlytics = c13698l;
        this.amazon = new C6709l();
        this.purchase = new C12463l();
        this.isPro = -1L;
        this.firebase = new C11029l(15, this);
        this.smaato = new C10006l();
    }

    public static boolean amazon(C3654l c3654l) {
        return c3654l.f7674l != -4;
    }

    public static boolean crashlytics(AbstractC18026l abstractC18026l) {
        InterfaceC10702l interfaceC10702l = abstractC18026l.f35287l;
        return (interfaceC10702l == null || AbstractC2533l.crashlytics(((C6577l) interfaceC10702l).loadAd())) ? false : true;
    }

    public static void isPro(C3654l c3654l) {
        if (!c3654l.f7673l || crashlytics((AbstractC18026l) c3654l.f7703l.purchase)) {
            return;
        }
        c3654l.f7673l = false;
        if (c3654l.f7696l) {
            c3654l.f7697l = mopub(c3654l);
            c3654l.f7696l = false;
        }
        if (C5177l.loadAd(c3654l.f7697l, 9223372034707292159L)) {
            return;
        }
        C17893l c17893lSignatures = c3654l.signatures();
        Object[] objArr = c17893lSignatures.f34848l;
        int i = c17893lSignatures.f34846l;
        for (int i2 = 0; i2 < i; i2++) {
            isPro((C3654l) objArr[i2]);
        }
    }

    public static long mopub(C3654l c3654l) {
        C18289l c18289l = c3654l.f7703l;
        AbstractC18026l abstractC18026l = (AbstractC18026l) c18289l.purchase;
        long jAmazon = 0;
        for (AbstractC18026l abstractC18026l2 = (C11103l) c18289l.amazon; abstractC18026l2 != null && abstractC18026l2 != abstractC18026l; abstractC18026l2 = abstractC18026l2.f35294l) {
            if (crashlytics(abstractC18026l2)) {
                return 9223372034707292159L;
            }
            jAmazon = C5177l.amazon(jAmazon, abstractC18026l2.f35291l);
        }
        return jAmazon;
    }

    public final void admob(C3654l c3654l) {
        long j;
        boolean zM1389private = c3654l.m1389private();
        C18289l c18289l = c3654l.f7703l;
        if (zM1389private && c3654l.f7705l) {
            C3654l c3654lLicense = c3654l.license();
            if (c3654lLicense == null || c3654lLicense.f7673l) {
                j = c3654lLicense == null ? 0L : 9223372034707292159L;
            } else {
                if (c3654lLicense.f7696l) {
                    c3654lLicense.f7696l = false;
                    c3654lLicense.f7697l = mopub(c3654lLicense);
                }
                j = c3654lLicense.f7697l;
            }
            AbstractC18026l abstractC18026l = (AbstractC18026l) c18289l.purchase;
            if (C5177l.loadAd(j, 9223372034707292159L) || crashlytics(abstractC18026l)) {
                billing(c3654l);
            } else if (c3654l.f7673l) {
                billing(c3654l);
                isPro(c3654l);
            } else {
                long jAmazon = C5177l.amazon(j, abstractC18026l.f35291l);
                C14903l c14903l = c3654l.f7667l.startapp;
                int iMo1466switch = c14903l.mo1466switch();
                int iMo1458catch = c14903l.mo1458catch();
                int i = c3654l.f7674l;
                C13698l c13698l = this.crashlytics;
                if (i != -4) {
                    int iPurchase = purchase(c3654l);
                    if (c3654lLicense != null) {
                        int iPurchase2 = purchase(c3654lLicense);
                        long[] jArr = (long[]) c13698l.f26743l;
                        long j2 = jArr[iPurchase2];
                        int i2 = ((int) (j2 >> 32)) + ((int) (jAmazon >> 32));
                        int i3 = ((int) j2) + ((int) (jAmazon & 4294967295L));
                        long j3 = jArr[iPurchase];
                        int i4 = i2 - ((int) (j3 >> 32));
                        int i5 = i3 - ((int) j3);
                        int i6 = iPurchase + 2;
                        long j4 = jArr[i6];
                        jArr[iPurchase] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
                        jArr[iPurchase + 1] = (((long) (iMo1466switch + i2)) << 32) | (((long) (iMo1458catch + i3)) & 4294967295L);
                        jArr[i6] = j4 | (((j4 >> 63) & 1) << 60);
                        if (i4 != 0 || i5 != 0) {
                            c13698l.m3678new(iPurchase, i4, i5, j4);
                        }
                    } else {
                        int iPurchase3 = purchase(c3654l);
                        int i7 = (int) (jAmazon >> 32);
                        int i8 = (int) (jAmazon & 4294967295L);
                        long[] jArr2 = (long[]) c13698l.f26743l;
                        long j5 = jArr2[iPurchase3];
                        jArr2[iPurchase3] = (((long) i8) & 4294967295L) | (((long) i7) << 32);
                        jArr2[iPurchase3 + 1] = (((long) (iMo1458catch + i8)) & 4294967295L) | (((long) (iMo1466switch + i7)) << 32);
                        int i9 = iPurchase3 + 2;
                        long j6 = jArr2[i9];
                        jArr2[i9] = (((j6 >> 63) & 1) << 60) | j6;
                        int i10 = i7 - ((int) (j5 >> 32));
                        int i11 = i8 - ((int) j5);
                        if (i10 != 0 || i11 != 0) {
                            c13698l.m3678new(iPurchase3, i10, i11, j6);
                        }
                    }
                } else {
                    int i12 = c3654l.f7685l;
                    boolean zAdmob = c18289l.admob(1024);
                    boolean zAdmob2 = c18289l.admob(16);
                    boolean zYandex = this.amazon.yandex.yandex(i12);
                    if (c3654lLicense != null) {
                        int i13 = c3654lLicense.f7685l;
                        int iPurchase4 = purchase(c3654lLicense);
                        int i14 = (int) (jAmazon >> 32);
                        int i15 = (int) (jAmazon & 4294967295L);
                        int i16 = i12 & 33554431;
                        long[] jArr3 = (long[]) c13698l.f26743l;
                        if ((((int) jArr3[iPurchase4 + 2]) & 33554431) != (33554431 & i13)) {
                            AbstractC0081l.yandex("Inserted child " + i16 + " without valid parent index or parent " + i13 + " not found");
                        }
                        long j7 = jArr3[iPurchase4];
                        int i17 = ((int) (j7 >> 32)) + i14;
                        int i18 = ((int) j7) + i15;
                        c3654l.f7674l = c13698l.m3683synchronized(i16, i17, i18, i17 + iMo1466switch, i18 + iMo1458catch, i13, iPurchase4, zAdmob, zAdmob2, zYandex);
                    } else {
                        int i19 = (int) (jAmazon >> 32);
                        int i20 = (int) (jAmazon & 4294967295L);
                        c3654l.f7674l = c13698l.m3683synchronized(i12, i19, i20, i19 + iMo1466switch, i20 + iMo1458catch, -1, -4, zAdmob, zAdmob2, zYandex);
                    }
                }
            }
            c3654l.f7705l = false;
            this.billing = true;
            firebase();
        }
    }

    public final void billing(C3654l c3654l) {
        c3654l.f7673l = true;
        C18289l c18289l = c3654l.f7703l;
        C14903l c14903l = c3654l.f7667l.startapp;
        int iMo1466switch = c14903l.mo1466switch();
        float fMo1458catch = c14903l.mo1458catch();
        C10006l c10006l = this.smaato;
        c10006l.loadAd = 0.0f;
        c10006l.crashlytics = 0.0f;
        c10006l.amazon = iMo1466switch;
        c10006l.purchase = fMo1458catch;
        for (AbstractC18026l abstractC18026l = (AbstractC18026l) c18289l.purchase; abstractC18026l != null; abstractC18026l = abstractC18026l.f35294l) {
            C3654l c3654l2 = abstractC18026l.f35281l;
            if (abstractC18026l == ((AbstractC18026l) c3654l2.f7703l.purchase) && !c3654l2.f7673l) {
                long jLoadAd = loadAd(c3654l2);
                if (!C5177l.loadAd(jLoadAd, 9223372034707292159L)) {
                    c10006l.purchase((((long) Float.floatToRawIntBits((int) (jLoadAd >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jLoadAd & 4294967295L))) & 4294967295L));
                    break;
                }
            }
            InterfaceC10702l interfaceC10702l = abstractC18026l.f35287l;
            if (interfaceC10702l != null) {
                float[] fArrLoadAd = ((C6577l) interfaceC10702l).loadAd();
                if (!AbstractC2533l.crashlytics(fArrLoadAd)) {
                    C10924l.crashlytics(fArrLoadAd, c10006l);
                }
            }
            long j = abstractC18026l.f35291l;
            c10006l.purchase((4294967295L & ((long) Float.floatToRawIntBits((int) (j & 4294967295L)))) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32));
        }
        int i = (int) c10006l.loadAd;
        int i2 = (int) c10006l.crashlytics;
        int i3 = (int) c10006l.amazon;
        int i4 = (int) c10006l.purchase;
        int i5 = c3654l.f7685l;
        int i6 = c3654l.f7674l;
        C13698l c13698l = this.crashlytics;
        if (i6 != -4) {
            int iPurchase = purchase(c3654l);
            long[] jArr = (long[]) c13698l.f26743l;
            jArr[iPurchase] = (((long) i) << 32) | (((long) i2) & 4294967295L);
            jArr[iPurchase + 1] = (4294967295L & ((long) i4)) | (((long) i3) << 32);
            int i7 = iPurchase + 2;
            long j2 = jArr[i7];
            jArr[i7] = j2 | (((j2 >> 63) & 1) << 60);
        } else {
            C3654l c3654lLicense = c3654l.license();
            c3654l.f7674l = c13698l.m3683synchronized(i5, i, i2, i3, i4, c3654lLicense != null ? c3654lLicense.f7685l : -1, c3654lLicense != null ? purchase(c3654lLicense) : -4, c18289l.admob(1024), c18289l.admob(16), this.amazon.yandex.yandex(i5));
        }
        c3654l.f7705l = false;
        this.billing = true;
        C17893l c17893lSignatures = c3654l.signatures();
        Object[] objArr = c17893lSignatures.f34848l;
        int i8 = c17893lSignatures.f34846l;
        for (int i9 = 0; i9 < i8; i9++) {
            C3654l c3654l3 = (C3654l) objArr[i9];
            if (c3654l3.m1389private()) {
                billing(c3654l3);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void firebase() {
        RunnableC0037l runnableC0037l = this.subs;
        boolean z = runnableC0037l != null;
        long j = this.amazon.crashlytics;
        if (j >= 0 || !z) {
            if (this.isPro == j && z) {
                return;
            }
            ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = this.loadAd;
            if (runnableC0037l != null) {
                if (!AbstractC2812l.advert(runnableC0037l)) {
                    runnableC0037l = null;
                }
                if (runnableC0037l != null) {
                    viewTreeObserverOnGlobalLayoutListenerC13840l.removeCallbacks(runnableC0037l);
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            this.isPro = jMax;
            RunnableC0037l runnableC0037l2 = new RunnableC0037l(0, this.firebase);
            viewTreeObserverOnGlobalLayoutListenerC13840l.postDelayed(runnableC0037l2, jMax - jCurrentTimeMillis);
            this.subs = runnableC0037l2;
        }
    }

    public final long loadAd(C3654l c3654l) {
        if (!amazon(c3654l)) {
            return 9223372034707292159L;
        }
        long j = ((long[]) this.crashlytics.f26743l)[purchase(c3654l)];
        return (((long) ((int) (j >> 32))) << 32) | (((long) ((int) j)) & 4294967295L);
    }

    public final int purchase(C3654l c3654l) {
        int i = c3654l.f7674l;
        if (i != -4) {
            int i2 = c3654l.f7685l;
            C13698l c13698l = this.crashlytics;
            long[] jArr = (long[]) c13698l.f26743l;
            if (i < 0 || i >= c13698l.f26744l - 2 || (((int) jArr[i + 2]) & 33554431) != (i2 & 33554431)) {
                int i3 = i2 & 33554431;
                int i4 = c13698l.f26744l;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4 - 2) {
                        i = -4;
                        break;
                    }
                    if ((((int) jArr[i5 + 2]) & 33554431) == i3) {
                        i = i5;
                        break;
                    }
                    i5 += 3;
                }
            }
        } else {
            i = -4;
            break;
        }
        if (i == -4) {
            AbstractC0081l.yandex("LayoutNode " + c3654l.f7685l + " not found in RectList");
        }
        c3654l.f7674l = i;
        return i;
    }

    public final void subs(C3654l c3654l) {
        if (c3654l.f7674l != -4) {
            int iPurchase = purchase(c3654l);
            long[] jArr = (long[]) this.crashlytics.f26743l;
            jArr[iPurchase] = -1;
            jArr[iPurchase + 1] = -1;
            jArr[iPurchase + 2] = AbstractC14163l.yandex;
            c3654l.f7674l = -4;
            c3654l.f7705l = true;
            this.billing = true;
            this.admob = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0224  */
    /* JADX WARN: Code duplicated, block: B:110:0x024b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0269  */
    /* JADX WARN: Code duplicated, block: B:117:0x0272  */
    /* JADX WARN: Code duplicated, block: B:119:0x0288  */
    /* JADX WARN: Code duplicated, block: B:122:0x029c  */
    /* JADX WARN: Code duplicated, block: B:124:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:126:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:128:0x02b9 A[LOOP:11: B:127:0x02b7->B:128:0x02b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:132:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:133:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:135:0x02f8 A[LOOP:9: B:120:0x028d->B:135:0x02f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:137:0x0301  */
    /* JADX WARN: Code duplicated, block: B:140:0x0307  */
    /* JADX WARN: Code duplicated, block: B:142:0x030a A[LOOP:12: B:141:0x0308->B:142:0x030a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:145:0x0319  */
    /* JADX WARN: Code duplicated, block: B:146:0x031c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0326  */
    /* JADX WARN: Code duplicated, block: B:174:0x025f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0303 A[EDGE_INSN: B:175:0x0303->B:138:0x0303 BREAK  A[LOOP:9: B:120:0x028d->B:135:0x02f8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x02fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x02d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:97:0x01df  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e2 A[LOOP:7: B:98:0x01e0->B:99:0x01e2, LOOP_END] */
    public final void yandex() {
        int i;
        long j;
        long j2;
        long j3;
        C6709l c6709l;
        int i2;
        long j4;
        long j5;
        float[] fArr;
        Object[] objArr;
        long[] jArr;
        int length;
        long jYandex;
        C6606l c6606l;
        long j6;
        C6606l c6606l2;
        int i3;
        long j7;
        long j8;
        long j9;
        int i4;
        int i5;
        int i6;
        int i7;
        long j10;
        int i8;
        int i9;
        C6606l c6606l3;
        long[] jArr2;
        long[] jArr3;
        int i10;
        int i11;
        int i12;
        long j11;
        long j12;
        float[] fArr2;
        C6606l c6606l4;
        C6606l c6606l5;
        long[] jArr4;
        long j13;
        long j14;
        RunnableC0037l runnableC0037l = this.subs;
        if (runnableC0037l != null) {
            if (!AbstractC2812l.advert(runnableC0037l)) {
                runnableC0037l = null;
            }
            if (runnableC0037l != null) {
                this.loadAd.removeCallbacks(runnableC0037l);
            }
            this.subs = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = this.billing;
        boolean z2 = z || this.mopub;
        C13698l c13698l = this.crashlytics;
        C6709l c6709l2 = this.amazon;
        if (z) {
            this.billing = false;
            C12463l c12463l = this.purchase;
            Object[] objArr2 = c12463l.yandex;
            int i13 = c12463l.loadAd;
            for (int i14 = 0; i14 < i13; i14++) {
                ((Function0) objArr2[i14]).invoke();
            }
            long[] jArr5 = (long[]) c13698l.f26743l;
            int i15 = c13698l.f26744l;
            int i16 = 0;
            while (i16 < jArr5.length - 2 && i16 < i15) {
                long j15 = jArr5[i16 + 2];
                if ((((int) (j15 >> 60)) & 1) != 0) {
                    long j16 = jArr5[i16];
                    long j17 = jArr5[i16 + 1];
                    C6606l c6606l6 = (C6606l) c6709l2.yandex.loadAd(((int) j15) & 33554431);
                    while (c6606l6 != null) {
                        C6606l c6606l7 = c6606l6.billing;
                        int i17 = i15;
                        int i18 = i16;
                        long j18 = c6606l6.subs;
                        long j19 = c6606l6.loadAd;
                        long j20 = c6606l6.crashlytics;
                        boolean z3 = jCurrentTimeMillis - j18 >= j19 || j18 == Long.MIN_VALUE;
                        boolean z4 = j20 == 0;
                        boolean z5 = j19 == 0;
                        c6606l6.mopub = j16;
                        c6606l6.admob = j17;
                        boolean z6 = !(z4 || z5) || z4;
                        if (z3 && z6) {
                            jArr4 = jArr5;
                            long j21 = j16;
                            c6606l6.isPro = -1L;
                            c6606l6.subs = jCurrentTimeMillis;
                            long j22 = j17;
                            c6606l6.yandex(j21, j22, c6709l2.amazon, c6709l2.purchase, c6709l2.mopub);
                            j14 = j22;
                            j13 = j21;
                        } else {
                            jArr4 = jArr5;
                            j13 = j16;
                            j14 = j17;
                            if (!z4) {
                                c6606l6.isPro = jCurrentTimeMillis;
                                long j23 = c6709l2.crashlytics;
                                long j24 = j20 + jCurrentTimeMillis;
                                if (j23 > 0 && j24 < j23) {
                                    c6709l2.crashlytics = j23;
                                }
                            }
                        }
                        j17 = j14;
                        c6606l6 = c6606l7;
                        i15 = i17;
                        j16 = j13;
                        i16 = i18;
                        jArr5 = jArr4;
                    }
                }
                i16 += 3;
                i15 = i15;
                jArr5 = jArr5;
            }
            long[] jArr6 = (long[]) c13698l.f26743l;
            int i19 = c13698l.f26744l;
            for (int i20 = 0; i20 < jArr6.length - 2 && i20 < i19; i20 += 3) {
                int i21 = i20 + 2;
                jArr6[i21] = jArr6[i21] & (-1152921504606846977L);
            }
        }
        if (this.mopub) {
            this.mopub = false;
            long j25 = c6709l2.amazon;
            long j26 = c6709l2.purchase;
            j = jCurrentTimeMillis;
            float[] fArr3 = c6709l2.mopub;
            int i22 = 8;
            C16977l c16977l = c6709l2.yandex;
            j2 = 128;
            Object[] objArr3 = c16977l.crashlytics;
            long[] jArr7 = c16977l.yandex;
            int length2 = jArr7.length - 2;
            if (length2 >= 0) {
                C13698l c13698l2 = c13698l;
                C6709l c6709l3 = c6709l2;
                int i23 = 0;
                j3 = 255;
                while (true) {
                    long j27 = jArr7[i23];
                    long[] jArr8 = jArr7;
                    Object[] objArr4 = objArr3;
                    if ((((~j27) << 7) & j27 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i24 = 8 - ((~(i23 - length2)) >>> 31);
                        long j28 = j27;
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j28 & 255) < 128) {
                                C6606l c6606l8 = (C6606l) objArr4[(i23 << 3) + i25];
                                while (c6606l8 != null) {
                                    c6709l3.loadAd(c6606l8, j25, j26, fArr3, j);
                                    c6606l8 = c6606l8.billing;
                                    c13698l2 = c13698l2;
                                }
                            }
                            C13698l c13698l3 = c13698l2;
                            int i26 = i22;
                            j28 >>= i26;
                            i25++;
                            c6709l3 = c6709l3;
                            i22 = i26;
                            c13698l2 = c13698l3;
                        }
                        c13698l = c13698l2;
                        i = i22;
                        c6709l2 = c6709l3;
                        if (i24 != i) {
                            break;
                        }
                    } else {
                        c13698l = c13698l2;
                        i = i22;
                        c6709l2 = c6709l3;
                    }
                    if (i23 == length2) {
                        break;
                    }
                    i23++;
                    c6709l3 = c6709l2;
                    i22 = i;
                    objArr3 = objArr4;
                    jArr7 = jArr8;
                    c13698l2 = c13698l;
                }
            } else {
                i = 8;
            }
            if (z2) {
                j11 = c6709l2.amazon;
                j12 = c6709l2.purchase;
                fArr2 = c6709l2.mopub;
                c6606l4 = c6709l2.loadAd;
                if (c6606l4 != null) {
                    for (c6606l5 = c6606l4; c6606l5 != null; c6606l5 = c6606l5.billing) {
                        C3654l c3654lMetrica = AbstractC5573l.metrica(c6606l5.amazon);
                        long jLoadAd = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(c3654lMetrica)).getRectManager().loadAd(c3654lMetrica);
                        c6606l5.mopub = jLoadAd;
                        C14903l c14903l = c3654lMetrica.f7667l.startapp;
                        c6606l5.admob = (((long) (c14903l.f20592l + ((int) (jLoadAd >> 32)))) << 32) | (((long) (c14903l.f20591l + ((int) (jLoadAd & 4294967295L)))) & 4294967295L);
                        c6709l2.loadAd(c6606l5, j11, j12, fArr2, j);
                    }
                }
            }
            c6709l = c6709l2;
            if (this.admob) {
                i2 = 0;
                this.admob = false;
                C13698l c13698l4 = c13698l;
                jArr2 = (long[]) c13698l4.f26743l;
                int i27 = c13698l4.f26744l;
                jArr3 = (long[]) c13698l4.f26746l;
                i11 = 0;
                for (i10 = 0; i10 < jArr2.length - 2 && i11 < jArr3.length - 2 && i10 < i27; i10 += 3) {
                    i12 = i10 + 2;
                    if (jArr2[i12] != AbstractC14163l.yandex) {
                        jArr3[i11] = jArr2[i10];
                        jArr3[i11 + 1] = jArr2[i10 + 1];
                        jArr3[i11 + 2] = jArr2[i12];
                        i11 += 3;
                    }
                }
                c13698l4.f26744l = i11;
                c13698l4.f26743l = jArr3;
                c13698l4.f26746l = jArr2;
            } else {
                i2 = 0;
            }
            if (c6709l.crashlytics <= j) {
                j4 = c6709l.amazon;
                j5 = c6709l.purchase;
                fArr = c6709l.mopub;
                C16977l c16977l2 = c6709l.yandex;
                objArr = c16977l2.crashlytics;
                jArr = c16977l2.yandex;
                length = jArr.length - 2;
                if (length >= 0) {
                    i3 = i2;
                    j7 = Long.MAX_VALUE;
                    while (true) {
                        j8 = jArr[i3];
                        j9 = j4;
                        i4 = length;
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            i7 = 8 - ((~(i3 - i4)) >>> 31);
                            jYandex = j7;
                            j10 = j8;
                            i8 = 0;
                            while (i8 < i7) {
                                if ((j10 & j3) < j2) {
                                    c6606l3 = (C6606l) objArr[(i3 << 3) + i8];
                                    while (c6606l3 != null) {
                                        int i28 = i7;
                                        int i29 = i3;
                                        long j29 = j;
                                        C6606l c6606l9 = c6606l3;
                                        jYandex = C6709l.yandex(c6606l9, j9, j5, fArr, j29, jYandex);
                                        j = j29;
                                        i3 = i29;
                                        i4 = i4;
                                        c6606l3 = c6606l9.billing;
                                        i7 = i28;
                                    }
                                }
                                j10 >>= i;
                                i8++;
                                i7 = i7;
                                j9 = j9;
                                i3 = i3;
                                i4 = i4;
                            }
                            i5 = i4;
                            i9 = i3;
                            j4 = j9;
                            if (i7 == i) {
                                break;
                            }
                            j7 = jYandex;
                            i6 = i9;
                        } else {
                            i5 = i4;
                            j4 = j9;
                            i6 = i3;
                        }
                        if (i6 != i5) {
                            jYandex = j7;
                            break;
                        } else {
                            i3 = i6 + 1;
                            length = i5;
                        }
                    }
                } else {
                    jYandex = Long.MAX_VALUE;
                }
                c6606l = c6709l.loadAd;
                if (c6606l != null) {
                    for (c6606l2 = c6606l; c6606l2 != null; c6606l2 = c6606l2.billing) {
                        long j30 = j;
                        jYandex = C6709l.yandex(c6606l2, j4, j5, fArr, j30, jYandex);
                        j = j30;
                    }
                }
                if (jYandex == Long.MAX_VALUE) {
                    j6 = -1;
                } else {
                    j6 = jYandex;
                }
                c6709l.crashlytics = j6;
            }
            if (c6709l.crashlytics > 0) {
                firebase();
            }
        }
        i = 8;
        j = jCurrentTimeMillis;
        j2 = 128;
        j3 = 255;
        if (z2) {
            j11 = c6709l2.amazon;
            j12 = c6709l2.purchase;
            fArr2 = c6709l2.mopub;
            c6606l4 = c6709l2.loadAd;
            if (c6606l4 != null) {
                while (c6606l5 != null) {
                    C3654l c3654lMetrica2 = AbstractC5573l.metrica(c6606l5.amazon);
                    long jLoadAd2 = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(c3654lMetrica2)).getRectManager().loadAd(c3654lMetrica2);
                    c6606l5.mopub = jLoadAd2;
                    C14903l c14903l2 = c3654lMetrica2.f7667l.startapp;
                    c6606l5.admob = (((long) (c14903l2.f20592l + ((int) (jLoadAd2 >> 32)))) << 32) | (((long) (c14903l2.f20591l + ((int) (jLoadAd2 & 4294967295L)))) & 4294967295L);
                    c6709l2.loadAd(c6606l5, j11, j12, fArr2, j);
                }
            }
        }
        c6709l = c6709l2;
        if (this.admob) {
            i2 = 0;
            this.admob = false;
            C13698l c13698l5 = c13698l;
            jArr2 = (long[]) c13698l5.f26743l;
            int i210 = c13698l5.f26744l;
            jArr3 = (long[]) c13698l5.f26746l;
            i11 = 0;
            while (i10 < jArr2.length - 2) {
                i12 = i10 + 2;
                if (jArr2[i12] != AbstractC14163l.yandex) {
                    jArr3[i11] = jArr2[i10];
                    jArr3[i11 + 1] = jArr2[i10 + 1];
                    jArr3[i11 + 2] = jArr2[i12];
                    i11 += 3;
                }
            }
            c13698l5.f26744l = i11;
            c13698l5.f26743l = jArr3;
            c13698l5.f26746l = jArr2;
        } else {
            i2 = 0;
        }
        if (c6709l.crashlytics <= j) {
            j4 = c6709l.amazon;
            j5 = c6709l.purchase;
            fArr = c6709l.mopub;
            C16977l c16977l3 = c6709l.yandex;
            objArr = c16977l3.crashlytics;
            jArr = c16977l3.yandex;
            length = jArr.length - 2;
            if (length >= 0) {
                i3 = i2;
                j7 = Long.MAX_VALUE;
                while (true) {
                    j8 = jArr[i3];
                    j9 = j4;
                    i4 = length;
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        i7 = 8 - ((~(i3 - i4)) >>> 31);
                        jYandex = j7;
                        j10 = j8;
                        i8 = 0;
                        while (i8 < i7) {
                            if ((j10 & j3) < j2) {
                                c6606l3 = (C6606l) objArr[(i3 << 3) + i8];
                                while (c6606l3 != null) {
                                    int i211 = i7;
                                    int i212 = i3;
                                    long j210 = j;
                                    C6606l c6606l10 = c6606l3;
                                    jYandex = C6709l.yandex(c6606l10, j9, j5, fArr, j210, jYandex);
                                    j = j210;
                                    i3 = i212;
                                    i4 = i4;
                                    c6606l3 = c6606l10.billing;
                                    i7 = i211;
                                }
                            }
                            j10 >>= i;
                            i8++;
                            i7 = i7;
                            j9 = j9;
                            i3 = i3;
                            i4 = i4;
                        }
                        i5 = i4;
                        i9 = i3;
                        j4 = j9;
                        if (i7 == i) {
                            break;
                            break;
                        } else {
                            j7 = jYandex;
                            i6 = i9;
                        }
                    } else {
                        i5 = i4;
                        j4 = j9;
                        i6 = i3;
                    }
                    if (i6 != i5) {
                        jYandex = j7;
                        break;
                    } else {
                        i3 = i6 + 1;
                        length = i5;
                    }
                }
            } else {
                jYandex = Long.MAX_VALUE;
            }
            c6606l = c6709l.loadAd;
            if (c6606l != null) {
                while (c6606l2 != null) {
                    long j31 = j;
                    jYandex = C6709l.yandex(c6606l2, j4, j5, fArr, j31, jYandex);
                    j = j31;
                }
            }
            if (jYandex == Long.MAX_VALUE) {
                j6 = -1;
            } else {
                j6 = jYandex;
            }
            c6709l.crashlytics = j6;
        }
        if (c6709l.crashlytics > 0) {
            firebase();
        }
    }
}
