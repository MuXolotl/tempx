package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّؖۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4490l implements InterfaceC2948l {
    public final /* synthetic */ InterfaceC2262l admob;
    public final /* synthetic */ Function0 amazon;
    public final /* synthetic */ InterfaceC3501l billing;
    public final /* synthetic */ C17253l crashlytics;
    public final /* synthetic */ C13975l isPro;
    public final /* synthetic */ boolean loadAd;
    public final /* synthetic */ InterfaceC5404l mopub;
    public final /* synthetic */ C1232l purchase;
    public final /* synthetic */ InterfaceC3685l subs;
    public final /* synthetic */ C8232l yandex;

    public C4490l(C8232l c8232l, boolean z, C17253l c17253l, InterfaceC2901l interfaceC2901l, C1232l c1232l, InterfaceC3501l interfaceC3501l, InterfaceC5404l interfaceC5404l, InterfaceC2262l interfaceC2262l, InterfaceC3685l interfaceC3685l, C13975l c13975l) {
        this.yandex = c8232l;
        this.loadAd = z;
        this.crashlytics = c17253l;
        this.amazon = interfaceC2901l;
        this.purchase = c1232l;
        this.billing = interfaceC3501l;
        this.mopub = interfaceC5404l;
        this.admob = interfaceC2262l;
        this.subs = interfaceC3685l;
        this.isPro = c13975l;
    }

    /* JADX WARN: Code duplicated, block: B:187:0x0483  */
    /* JADX WARN: Code duplicated, block: B:195:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:199:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:200:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:241:0x057e A[LOOP:6: B:224:0x052c->B:241:0x057e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:245:0x058d  */
    /* JADX WARN: Code duplicated, block: B:248:0x0596  */
    /* JADX WARN: Code duplicated, block: B:249:0x0599  */
    /* JADX WARN: Code duplicated, block: B:252:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:267:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:269:0x060c  */
    /* JADX WARN: Code duplicated, block: B:273:0x061f  */
    /* JADX WARN: Code duplicated, block: B:274:0x0622  */
    /* JADX WARN: Code duplicated, block: B:280:0x062e  */
    /* JADX WARN: Code duplicated, block: B:282:0x0637  */
    /* JADX WARN: Code duplicated, block: B:284:0x0641 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:290:0x065a  */
    /* JADX WARN: Code duplicated, block: B:292:0x0662  */
    /* JADX WARN: Code duplicated, block: B:294:0x066b  */
    /* JADX WARN: Code duplicated, block: B:296:0x0671  */
    /* JADX WARN: Code duplicated, block: B:300:0x067e  */
    /* JADX WARN: Code duplicated, block: B:302:0x0685  */
    /* JADX WARN: Code duplicated, block: B:303:0x0687  */
    /* JADX WARN: Code duplicated, block: B:306:0x068e  */
    /* JADX WARN: Code duplicated, block: B:307:0x0691  */
    /* JADX WARN: Code duplicated, block: B:314:0x06a8 A[LOOP:12: B:313:0x06a6->B:314:0x06a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:317:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:322:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:325:0x06db A[LOOP:13: B:324:0x06d9->B:325:0x06db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:328:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:330:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:331:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:333:0x0703  */
    /* JADX WARN: Code duplicated, block: B:342:0x073a A[LOOP:15: B:341:0x0738->B:342:0x073a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:344:0x0744 A[LOOP:14: B:340:0x072a->B:344:0x0744, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:346:0x074d  */
    /* JADX WARN: Code duplicated, block: B:348:0x075d  */
    /* JADX WARN: Code duplicated, block: B:352:0x0776 A[LOOP:17: B:349:0x075f->B:352:0x0776, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:355:0x0781  */
    /* JADX WARN: Code duplicated, block: B:357:0x078f A[LOOP:19: B:356:0x078d->B:357:0x078f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:361:0x07ac A[LOOP:20: B:360:0x07aa->B:361:0x07ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:365:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:367:0x07f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:368:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:370:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:373:0x0814  */
    /* JADX WARN: Code duplicated, block: B:374:0x0816  */
    /* JADX WARN: Code duplicated, block: B:376:0x0819  */
    /* JADX WARN: Code duplicated, block: B:378:0x0820 A[LOOP:16: B:377:0x081e->B:378:0x0820, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:381:0x0837  */
    /* JADX WARN: Code duplicated, block: B:388:0x0871  */
    /* JADX WARN: Code duplicated, block: B:391:0x08a0  */
    /* JADX WARN: Code duplicated, block: B:393:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:424:0x0585 A[EDGE_INSN: B:424:0x0585->B:242:0x0585 BREAK  A[LOOP:6: B:224:0x052c->B:241:0x057e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:0x0748 A[EDGE_INSN: B:437:0x0748->B:345:0x0748 BREAK  A[LOOP:14: B:340:0x072a->B:344:0x0744], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:440:0x0778 A[EDGE_INSN: B:440:0x0778->B:353:0x0778 BREAK  A[LOOP:17: B:349:0x075f->B:352:0x0776], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x0655 A[ADDED_TO_REGION, EDGE_INSN: B:445:0x0655->B:288:0x0655 BREAK  A[LOOP:21: B:281:0x0635->B:287:0x0649], REMOVE, SYNTHETIC] */
    @Override // defpackage.InterfaceC2948l
    public final InterfaceC17792l yandex(C17385l c17385l, long j) {
        C4766l c4766l;
        float fAmazon;
        int iCrashlytics;
        int iAdmob;
        C8232l c8232l;
        Function1 function1;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        float f;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList;
        C8135l c8135l;
        List list;
        int i9;
        C13994l c13994l;
        ArrayList arrayList2;
        List list2;
        int[] iArr2;
        int i10;
        int i11;
        ArrayList arrayList3;
        List list3;
        int iPro;
        int i12;
        int i13;
        int i14;
        long j2;
        int iMopub;
        int iMopub2;
        int iMopub3;
        int i15;
        List listM4232new;
        List list4;
        int i16;
        boolean z2;
        int size;
        boolean z3;
        int i17;
        int length;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int size2;
        int size3;
        int iLoadAd;
        int i18;
        List list5;
        int size4;
        int i19;
        C9696l[] c9696lArrYandex;
        int length2;
        int i20;
        List list6;
        int iLoadAd2;
        int i21;
        ArrayList arrayList6;
        int iBilling;
        int i22;
        boolean z4;
        EnumC7283l enumC7283l;
        C13217l c13217l;
        InterfaceC15847l interfaceC15847l;
        long jLoadAd;
        int i23;
        ArrayList arrayList7;
        int i24;
        int size5;
        int i25;
        int size6;
        int[] iArr3;
        int i26;
        int[] iArr4;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        C8135l c8135l2;
        int[] iArr5;
        C9696l c9696l;
        int i33;
        C8135l c8135l3;
        C9696l c9696l2;
        InterfaceC15847l interfaceC15847l2 = c17385l.f33850l;
        C8232l c8232l2 = this.yandex;
        c8232l2.subscription.getValue();
        boolean z5 = c8232l2.loadAd || interfaceC15847l2.mo992import();
        EnumC7283l enumC7283l2 = EnumC7283l.f15125l;
        EnumC7283l enumC7283l3 = EnumC7283l.f15126l;
        boolean z6 = this.loadAd;
        AbstractC15684l.loadAd(j, z6 ? enumC7283l3 : enumC7283l2);
        C17253l c17253l = this.crashlytics;
        int iMo870l = z6 ? interfaceC15847l2.mo870l(c17253l.loadAd(interfaceC15847l2.getLayoutDirection())) : interfaceC15847l2.mo870l(AbstractC3605l.billing(c17253l, interfaceC15847l2.getLayoutDirection()));
        int iMo870l2 = z6 ? interfaceC15847l2.mo870l(c17253l.crashlytics(interfaceC15847l2.getLayoutDirection())) : interfaceC15847l2.mo870l(AbstractC3605l.purchase(c17253l, interfaceC15847l2.getLayoutDirection()));
        int iMo870l3 = interfaceC15847l2.mo870l(c17253l.loadAd);
        int iMo870l4 = interfaceC15847l2.mo870l(c17253l.amazon) + iMo870l3;
        int i34 = iMo870l + iMo870l2;
        int i35 = z6 ? iMo870l4 : i34;
        int i36 = z6 ? iMo870l3 : !z6 ? iMo870l : iMo870l2;
        int i37 = i35 - i36;
        long jSubs = AbstractC7563l.subs(-i34, j, -iMo870l4);
        C13994l c13994l2 = (C13994l) this.amazon.invoke();
        C2093l c2093l = c13994l2.loadAd.crashlytics;
        C1232l c1232l = this.purchase;
        if (c1232l.amazon != null && C15519l.loadAd(c1232l.loadAd, jSubs) && c1232l.crashlytics == interfaceC15847l2.loadAd()) {
            c4766l = c1232l.amazon;
        } else {
            c1232l.loadAd = jSubs;
            c1232l.crashlytics = interfaceC15847l2.loadAd();
            c4766l = (C4766l) c1232l.yandex.invoke(c17385l, new C15519l(jSubs));
            c1232l.amazon = c4766l;
        }
        int length3 = c4766l.yandex.length;
        if (length3 != c2093l.subs) {
            c2093l.subs = length3;
            ArrayList arrayList8 = c2093l.loadAd;
            arrayList8.clear();
            arrayList8.add(new C10193l(0, 0));
            c2093l.crashlytics = 0;
            c2093l.amazon = 0;
            c2093l.purchase = 0;
            c2093l.billing = -1;
            c2093l.mopub.clear();
        }
        InterfaceC5404l interfaceC5404l = this.mopub;
        InterfaceC3501l interfaceC3501l = this.billing;
        if (z6 == 0) {
            fAmazon = interfaceC5404l.amazon();
        } else {
            if (interfaceC3501l == null) {
                throw AbstractC1757l.m1043volatile("null verticalArrangement when isVertical == true");
            }
            fAmazon = interfaceC3501l.amazon();
        }
        int iMo870l5 = interfaceC15847l2.mo870l(fAmazon);
        int i38 = c13994l2.loadAd.billing().f26744l;
        int iMopub4 = z6 != 0 ? C15519l.mopub(j) - iMo870l4 : C15519l.admob(j) - i34;
        int i39 = i36;
        C8135l c8135l4 = new C8135l(c13994l2, c17385l, iMo870l5, this.yandex, this.loadAd, i39, i37, (((long) iMo870l) << 32) | (((long) iMo870l3) & 4294967295L));
        C8788l c8788l = new C8788l();
        c8788l.amazon = z6;
        c8788l.billing = c4766l;
        c8788l.crashlytics = z6;
        c8788l.purchase = c4766l;
        c8788l.yandex = i38;
        c8788l.loadAd = iMo870l5;
        c8788l.mopub = c8135l4;
        c8788l.admob = c2093l;
        C2093l c2093l2 = (C2093l) c8788l.admob;
        C3005l c3005l = new C3005l(c2093l, c8788l, 23);
        C17015l c17015l = new C17015l(15, c2093l);
        AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
        Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
        AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
        try {
            C15387l c15387l = c8232l2.amazon;
            int iAdmob2 = c15387l.loadAd.admob();
            int iYandex = AbstractC13841l.yandex(c13994l2, c15387l.purchase, iAdmob2);
            if (iAdmob2 != iYandex) {
                c15387l.loadAd.subs(iYandex);
                c15387l.billing.crashlytics(iAdmob2);
            }
            if (iYandex < i38 || i38 <= 0) {
                iCrashlytics = c2093l.crashlytics(iYandex);
                iAdmob = c15387l.crashlytics.admob();
            } else {
                iCrashlytics = c2093l.crashlytics(i38 - 1);
                iAdmob = 0;
            }
            Unit unit = Unit.INSTANCE;
            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
            C16761l c16761lAmazon = AbstractC14460l.amazon(c13994l2, c8232l2.adcel, c8232l2.vip);
            float fFloatValue = (interfaceC15847l2.mo992import() || !z5) ? c8232l2.mopub : ((Number) ((C6570l) c8232l2.license.f26580l).f13720l.getValue()).floatValue();
            C12660l c12660l = c8232l2.remoteconfig;
            boolean zMo992import = interfaceC15847l2.mo992import();
            C13217l c13217l2 = c8232l2.crashlytics;
            InterfaceC8714l interfaceC8714l = c8232l2.ads;
            if (i39 < 0) {
                AbstractC14825l.yandex("negative beforeContentPadding");
            }
            if (i37 < 0) {
                AbstractC14825l.yandex("negative afterContentPadding");
            }
            C14054l c14054l = C14054l.f27396l;
            C13994l c13994l3 = c8135l4.f17001l;
            boolean z7 = this.loadAd;
            InterfaceC2262l interfaceC2262l = this.admob;
            InterfaceC3685l interfaceC3685l = this.subs;
            C2580l c2580l = C2580l.f5619l;
            if (i38 <= 0) {
                int iIsPro = C15519l.isPro(jSubs);
                int iSubs = C15519l.subs(jSubs);
                c12660l.amazon(0, iIsPro, iSubs, new ArrayList(), c13994l3.crashlytics, c8135l4, z7, zMo992import, length3, z5, 0, 0, interfaceC2262l, interfaceC3685l);
                if (!zMo992import) {
                    long jLoadAd2 = c12660l.loadAd();
                    if (!C4999l.loadAd(jLoadAd2, 0L)) {
                        iIsPro = AbstractC7563l.mopub((int) (jLoadAd2 >> 32), jSubs);
                        iSubs = AbstractC7563l.billing((int) (jLoadAd2 & 4294967295L), jSubs);
                    }
                }
                interfaceC15847l = interfaceC15847l2;
                c8232l = c8232l2;
                c13217l = new C13217l(null, 0, false, 0.0f, interfaceC15847l2.isVip(AbstractC7563l.mopub(iIsPro + i34, j), AbstractC7563l.billing(iSubs + iMo870l4, j), c14054l, new C2613l(18)), 0.0f, false, interfaceC2262l, c17385l, length3, c3005l, c17015l, c2580l, -i39, iMopub4 + i37, 0, z7 ? enumC7283l3 : enumC7283l2, i37, iMo870l5);
            } else {
                c8232l = c8232l2;
                C8135l c8135l5 = c8135l4;
                int iRound = Math.round(fFloatValue);
                int i40 = iAdmob - iRound;
                if (iCrashlytics != 0 || i40 >= 0) {
                    function1 = c3005l;
                    i = i40;
                } else {
                    iRound += i40;
                    i = 0;
                }
                C11315l c11315l = new C11315l();
                int i41 = -i39;
                int i42 = iCrashlytics;
                int i43 = i41 + (iMo870l5 < 0 ? iMo870l5 : 0);
                int i44 = i + i43;
                float f2 = fFloatValue;
                int i45 = i44;
                while (i45 < 0 && i42 > 0) {
                    int i46 = i41;
                    int i47 = i42 - 1;
                    Function1 function2 = function1;
                    C2931l c2931lLoadAd = c8788l.loadAd(i47);
                    c11315l.add(0, c2931lLoadAd);
                    i45 += c2931lLoadAd.admob;
                    i42 = i47;
                    i41 = i46;
                    function1 = function2;
                }
                int i48 = i41;
                Function1 function3 = function1;
                if (i45 < i43) {
                    iRound -= i43 - i45;
                    i45 = i43;
                }
                int i49 = iRound;
                int i50 = i45 - i43;
                int i51 = iMopub4 + i37;
                int i52 = i51 >= 0 ? i51 : 0;
                int i53 = i50;
                int i54 = -i50;
                int i55 = i42;
                int i56 = 0;
                boolean z8 = false;
                while (i56 < c11315l.f22809l) {
                    if (i54 >= i52) {
                        c11315l.ad(i56);
                        Unit unit2 = Unit.INSTANCE;
                        z8 = true;
                    } else {
                        i55++;
                        i54 += ((C2931l) c11315l.get(i56)).admob;
                        i56++;
                    }
                }
                int i57 = i55;
                boolean z9 = z8;
                while (true) {
                    if (i57 >= i38 || (i54 >= i52 && i54 > 0 && !c11315l.isEmpty())) {
                        z = z9;
                        break;
                    }
                    int i58 = i52;
                    C2931l c2931lLoadAd2 = c8788l.loadAd(i57);
                    int i59 = i57;
                    int i60 = c2931lLoadAd2.admob;
                    C9696l[] c9696lArr = c2931lLoadAd2.loadAd;
                    z = z9;
                    if (c9696lArr.length == 0) {
                        break;
                    }
                    i54 += i60;
                    if (i54 > i43 || ((C9696l) AbstractC8669l.m2400continue(c9696lArr)).yandex == i38 - 1) {
                        c11315l.addLast(c2931lLoadAd2);
                        z9 = z;
                    } else {
                        i53 -= i60;
                        Unit unit3 = Unit.INSTANCE;
                        i42 = i59 + 1;
                        z9 = true;
                    }
                    i57 = i59 + 1;
                    i52 = i58;
                }
                int i61 = iMopub4;
                if (i54 < i61) {
                    int i62 = i61 - i54;
                    int i63 = i54 + i62;
                    i4 = i53 - i62;
                    while (i4 < i39 && i42 > 0) {
                        int i64 = i42 - 1;
                        int i65 = i62;
                        C2931l c2931lLoadAd3 = c8788l.loadAd(i64);
                        c11315l.add(0, c2931lLoadAd3);
                        i4 += c2931lLoadAd3.admob;
                        i42 = i64;
                        i63 = i63;
                        i62 = i65;
                    }
                    int i66 = i63;
                    i3 = i49 + i62;
                    if (i4 < 0) {
                        i3 += i4;
                        i2 = i66 + i4;
                        i4 = 0;
                    } else {
                        i2 = i66;
                    }
                } else {
                    i2 = i54;
                    i3 = i49;
                    i4 = i53;
                }
                float f3 = (Integer.signum(Math.round(f2)) != Integer.signum(i3) || Math.abs(Math.round(f2)) < Math.abs(i3)) ? f2 : i3;
                float f4 = f2 - f3;
                float f5 = 0.0f;
                if (zMo992import && i3 > i49 && f4 <= 0.0f) {
                    f5 = (i3 - i49) + f4;
                }
                float f6 = f5;
                if (i4 < 0) {
                    AbstractC14825l.yandex("negative initial offset");
                }
                int i67 = -i4;
                C2931l c2931l = (C2931l) c11315l.signatures();
                int i68 = (c2931l == null || (c9696l2 = (C9696l) AbstractC8669l.m2412private(c2931l.loadAd)) == null) ? 0 : c9696l2.yandex;
                C2931l c2931l2 = c2931l;
                C2931l c2931l3 = (C2931l) c11315l.applovin();
                if (c2931l3 != null) {
                    C9696l[] c9696lArr2 = c2931l3.loadAd;
                    f = f6;
                    C9696l c9696l3 = c9696lArr2.length == 0 ? null : c9696lArr2[c9696lArr2.length - 1];
                    i5 = c9696l3 != null ? c9696l3.yandex : 0;
                    iArr = c16761lAmazon.yandex;
                    i6 = c16761lAmazon.loadAd;
                    i7 = i4;
                    i8 = 0;
                    arrayList = null;
                    while (i8 < i6) {
                        int i69 = i6;
                        i33 = iArr[i8];
                        if (i33 >= 0 || i33 >= i68) {
                            c8135l3 = c8135l5;
                        } else {
                            int i70 = c2093l2.subs;
                            int iPurchase = c2093l2.purchase(i33);
                            C8135l c8135l6 = c8135l5;
                            C9696l c9696lM2273l = c8135l6.m2273l(i33, 0, iPurchase, c8135l5.f17005l, c8788l.yandex(0, iPurchase));
                            c8135l3 = c8135l6;
                            ArrayList arrayList9 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList9.add(c9696lM2273l);
                            arrayList = arrayList9;
                        }
                        i8++;
                        c8135l5 = c8135l3;
                        i6 = i69;
                        i68 = i68;
                    }
                    int i71 = i68;
                    c8135l = c8135l5;
                    if (arrayList == null) {
                        list = c2580l;
                    } else {
                        list = arrayList;
                    }
                    if (zMo992import || c13217l2 == null) {
                        i9 = i5;
                        c13994l = c13994l3;
                        arrayList2 = null;
                    } else {
                        List list7 = c13217l2.remoteconfig;
                        if (list7.isEmpty()) {
                            i9 = i5;
                            c13994l = c13994l3;
                            arrayList2 = null;
                        } else {
                            int size7 = list7.size();
                            while (true) {
                                size7--;
                                if (-1 >= size7) {
                                    c9696l = null;
                                    break;
                                }
                                if (((C9696l) list7.get(size7)).yandex > i5 && (size7 == 0 || ((C9696l) list7.get(size7 - 1)).yandex <= i5)) {
                                    c9696l = (C9696l) list7.get(size7);
                                    break;
                                }
                            }
                            C9696l c9696l4 = (C9696l) AbstractC16901l.m4214continue(list7);
                            C2931l c2931l4 = (C2931l) AbstractC16901l.m4212class(c11315l);
                            int i72 = c2931l4 != null ? c2931l4.yandex + 1 : 0;
                            if (c9696l != null) {
                                int i73 = c9696l.yandex;
                                i9 = i5;
                                int iMin = Math.min(c9696l4.yandex, i38 - 1);
                                if (i73 <= iMin) {
                                    ArrayList arrayList10 = null;
                                    while (true) {
                                        if (arrayList10 != null) {
                                            c13994l = c13994l3;
                                            int size8 = arrayList10.size();
                                            f3 = f3;
                                            int i74 = 0;
                                            while (true) {
                                                if (i74 < size8) {
                                                    int i75 = i74;
                                                    C9696l[] c9696lArr3 = ((C2931l) arrayList10.get(i74)).loadAd;
                                                    ArrayList arrayList11 = arrayList10;
                                                    int length4 = c9696lArr3.length;
                                                    int i76 = 0;
                                                    while (true) {
                                                        if (i76 < length4) {
                                                            int i77 = i76;
                                                            if (c9696lArr3[i77].yandex == i73) {
                                                                arrayList10 = arrayList11;
                                                            } else {
                                                                i76 = i77 + 1;
                                                            }
                                                        } else {
                                                            i74 = i75 + 1;
                                                            arrayList10 = arrayList11;
                                                        }
                                                    }
                                                }
                                                if (i73 != iMin) {
                                                    break;
                                                }
                                                i73++;
                                                c13994l3 = c13994l;
                                                f3 = f3;
                                            }
                                        } else {
                                            f3 = f3;
                                            c13994l = c13994l3;
                                        }
                                        ArrayList arrayList12 = arrayList10;
                                        arrayList10 = arrayList12 == null ? new ArrayList() : arrayList12;
                                        C2931l c2931lLoadAd4 = c8788l.loadAd(i72);
                                        i72++;
                                        arrayList10.add(c2931lLoadAd4);
                                        if (i73 != iMin) {
                                            break;
                                            break;
                                        }
                                        i73++;
                                        c13994l3 = c13994l;
                                        f3 = f3;
                                    }
                                    arrayList2 = arrayList10;
                                }
                            } else {
                                i9 = i5;
                            }
                            c13994l = c13994l3;
                            arrayList2 = null;
                        }
                    }
                    if (arrayList2 == null) {
                        list2 = c2580l;
                    } else {
                        list2 = arrayList2;
                    }
                    iArr2 = c16761lAmazon.yandex;
                    i10 = c16761lAmazon.loadAd;
                    i11 = 0;
                    arrayList3 = null;
                    while (i11 < i10) {
                        i31 = iArr2[i11];
                        if (i9 + 1 <= i31 || i31 >= i38) {
                            i32 = i10;
                            c8135l2 = c8135l;
                            iArr5 = iArr2;
                        } else if (zMo992import) {
                            int size9 = list2.size();
                            int i78 = 0;
                            while (true) {
                                if (i78 < size9) {
                                    i32 = i10;
                                    C9696l[] c9696lArr4 = ((C2931l) list2.get(i78)).loadAd;
                                    iArr5 = iArr2;
                                    int length5 = c9696lArr4.length;
                                    int i79 = 0;
                                    while (true) {
                                        if (i79 < length5) {
                                            int i80 = i79;
                                            if (c9696lArr4[i80].yandex == i31) {
                                                c8135l2 = c8135l;
                                            } else {
                                                i79 = i80 + 1;
                                            }
                                        } else {
                                            i78++;
                                            iArr2 = iArr5;
                                            i10 = i32;
                                        }
                                    }
                                } else {
                                    i32 = i10;
                                    iArr5 = iArr2;
                                    int i81 = c2093l2.subs;
                                    int iPurchase2 = c2093l2.purchase(i31);
                                    c8135l2 = c8135l;
                                    C9696l c9696lM2273l2 = c8135l2.m2273l(i31, 0, iPurchase2, c8135l.f17005l, c8788l.yandex(0, iPurchase2));
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                    }
                                    ArrayList arrayList13 = arrayList3;
                                    arrayList13.add(c9696lM2273l2);
                                    arrayList3 = arrayList13;
                                }
                            }
                        } else {
                            i32 = i10;
                            iArr5 = iArr2;
                            int i82 = c2093l2.subs;
                            int iPurchase3 = c2093l2.purchase(i31);
                            c8135l2 = c8135l;
                            C9696l c9696lM2273l3 = c8135l2.m2273l(i31, 0, iPurchase3, c8135l.f17005l, c8788l.yandex(0, iPurchase3));
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            ArrayList arrayList14 = arrayList3;
                            arrayList14.add(c9696lM2273l3);
                            arrayList3 = arrayList14;
                        }
                        i11++;
                        iArr2 = iArr5;
                        c8135l = c8135l2;
                        i10 = i32;
                    }
                    C8135l c8135l7 = c8135l;
                    if (arrayList3 == null) {
                        list3 = c2580l;
                    } else {
                        list3 = arrayList3;
                    }
                    if (i39 <= 0 || iMo870l5 < 0) {
                        iPro = c11315l.pro();
                        i12 = i7;
                        i13 = 0;
                        while (i13 < iPro) {
                            int i83 = ((C2931l) c11315l.get(i13)).admob;
                            if (i12 != 0 || i83 > i12 || i13 == AbstractC14055l.smaato(c11315l)) {
                                break;
                            }
                            i12 -= i83;
                            i13++;
                            c2931l2 = (C2931l) c11315l.get(i13);
                        }
                        i14 = i12;
                    } else {
                        i14 = i7;
                    }
                    C2931l c2931l5 = c2931l2;
                    if (z7) {
                        iMopub = C15519l.admob(jSubs);
                        j2 = jSubs;
                    } else {
                        j2 = jSubs;
                        iMopub = AbstractC7563l.mopub(i2, j2);
                    }
                    iMopub2 = iMopub;
                    if (z7) {
                        iMopub3 = AbstractC7563l.billing(i2, j2);
                    } else {
                        iMopub3 = C15519l.mopub(j2);
                    }
                    i15 = iMopub3;
                    listM4232new = c11315l;
                    if (!list2.isEmpty()) {
                        listM4232new = AbstractC16901l.m4232new(c11315l, list2);
                    }
                    list4 = listM4232new;
                    if (z7) {
                        i16 = i15;
                    } else {
                        i16 = iMopub2;
                    }
                    if (i2 < Math.min(i16, i61)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 && i67 != 0) {
                        AbstractC14825l.crashlytics("non-zero firstLineScrollOffset");
                    }
                    size = list4.size();
                    z3 = z2;
                    length = 0;
                    for (i17 = 0; i17 < size; i17++) {
                        length += ((C2931l) list4.get(i17)).loadAd.length;
                    }
                    arrayList4 = new ArrayList(length);
                    if (z3) {
                        if (list.isEmpty() || !list3.isEmpty()) {
                            AbstractC14825l.yandex("no items");
                        }
                        size6 = list4.size();
                        iArr3 = new int[size6];
                        for (i26 = 0; i26 < size6; i26++) {
                            iArr3[i26] = ((C2931l) list4.get(i26)).mopub;
                        }
                        iArr4 = new int[size6];
                        if (z7) {
                            arrayList5 = arrayList4;
                            interfaceC5404l.Signature(c17385l, i16, iArr3, EnumC9931l.f20223l, iArr4);
                        } else {
                            if (interfaceC3501l != null) {
                                throw AbstractC1757l.m1043volatile("null verticalArrangement");
                            }
                            interfaceC3501l.startapp(c17385l, i16, iArr3, iArr4);
                            arrayList5 = arrayList4;
                        }
                        C8934l c8934lM2403extends = AbstractC8669l.m2403extends(iArr4);
                        i27 = c8934lM2403extends.f15487l;
                        i28 = c8934lM2403extends.f15486l;
                        if ((i28 > 0 && i27 >= 0) || (i28 < 0 && i27 <= 0)) {
                            i29 = 0;
                            while (true) {
                                for (C9696l c9696l5 : ((C2931l) list4.get(i29)).yandex(iArr4[i29], iMopub2, i15)) {
                                    arrayList5.add(c9696l5);
                                }
                                if (i29 == i27) {
                                    break;
                                }
                                i29 += i28;
                            }
                        }
                    } else {
                        List list8 = list4;
                        arrayList5 = arrayList4;
                        i61 = i61;
                        c8788l = c8788l;
                        size2 = list.size() - 1;
                        if (size2 >= 0) {
                            iLoadAd2 = i67;
                            while (true) {
                                i21 = size2 - 1;
                                C9696l c9696l6 = (C9696l) list.get(size2);
                                iLoadAd2 -= c9696l6.loadAd();
                                c9696l6.purchase(iLoadAd2, 0, iMopub2, i15);
                                arrayList5.add(c9696l6);
                                if (i21 < 0) {
                                    break;
                                }
                                size2 = i21;
                            }
                        }
                        size3 = list8.size();
                        iLoadAd = i67;
                        i18 = 0;
                        list5 = list8;
                        while (i18 < size3) {
                            C2931l c2931l6 = (C2931l) list5.get(i18);
                            c9696lArrYandex = c2931l6.yandex(iLoadAd, iMopub2, i15);
                            length2 = c9696lArrYandex.length;
                            i20 = 0;
                            while (i20 < length2) {
                                list6 = list5;
                                arrayList5.add(c9696lArrYandex[i20]);
                                i20++;
                                list6 = list6;
                            }
                            list6 = list5;
                            iLoadAd += c2931l6.admob;
                            i18++;
                            list5 = list6;
                        }
                        size4 = list3.size();
                        for (i19 = 0; i19 < size4; i19++) {
                            C9696l c9696l7 = (C9696l) list3.get(i19);
                            c9696l7.purchase(iLoadAd, 0, iMopub2, i15);
                            arrayList5.add(c9696l7);
                            iLoadAd += c9696l7.loadAd();
                        }
                    }
                    C13994l c13994l4 = c13994l;
                    int i84 = i2;
                    c12660l.amazon((int) f3, iMopub2, i15, arrayList5, c13994l4.crashlytics, c8135l7, z7, zMo992import, length3, z5, i14, i84, interfaceC2262l, interfaceC3685l);
                    if (zMo992import) {
                        arrayList6 = arrayList5;
                        iBilling = i15;
                    } else {
                        jLoadAd = c12660l.loadAd();
                        if (C4999l.loadAd(jLoadAd, 0L)) {
                            arrayList6 = arrayList5;
                            iBilling = i15;
                        } else {
                            if (z7) {
                                i23 = i15;
                            } else {
                                i23 = iMopub2;
                            }
                            arrayList7 = arrayList5;
                            iMopub2 = AbstractC7563l.mopub(Math.max(iMopub2, (int) (jLoadAd >> 32)), j2);
                            iBilling = AbstractC7563l.billing(Math.max(i15, (int) (jLoadAd & 4294967295L)), j2);
                            if (z7) {
                                i24 = iBilling;
                            } else {
                                i24 = iMopub2;
                            }
                            if (i24 != i23) {
                                size5 = arrayList7.size();
                                for (i25 = 0; i25 < size5; i25++) {
                                    C9696l c9696l8 = (C9696l) arrayList7.get(i25);
                                    c9696l8.tapsense = i24;
                                    c9696l8.license = c9696l8.mopub + i24;
                                }
                            }
                            arrayList6 = arrayList7;
                        }
                    }
                    int i85 = iMopub2;
                    c13994l4.loadAd.getClass();
                    ArrayList arrayList15 = arrayList6;
                    i22 = i9;
                    int i86 = iBilling;
                    List listYandex = AbstractC10392l.yandex(this.isPro, i71, i22, arrayList15, AbstractC7124l.yandex, i39, i85, i86, z7, new C3005l(c8788l, c8135l7, 24));
                    if (i22 == i38 - 1 || i84 > i61) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    InterfaceC17792l interfaceC17792lIsVip = interfaceC15847l2.isVip(AbstractC7563l.mopub(i85 + i34, j), AbstractC7563l.billing(i86 + iMo870l4, j), c14054l, new C0067l(interfaceC8714l, arrayList15, listYandex, zMo992import, 0));
                    List listPurchase = AbstractC3124l.purchase(i71, i22, arrayList15, listYandex);
                    if (z7) {
                        enumC7283l = enumC7283l3;
                    } else {
                        enumC7283l = enumC7283l2;
                    }
                    interfaceC15847l = interfaceC15847l2;
                    c13217l = new C13217l(c2931l5, i14, z4, f3, interfaceC17792lIsVip, f, z, interfaceC2262l, c17385l, length3, function3, c17015l, listPurchase, i48, i51, i38, enumC7283l, i37, iMo870l5);
                } else {
                    f = f6;
                }
                iArr = c16761lAmazon.yandex;
                i6 = c16761lAmazon.loadAd;
                i7 = i4;
                i8 = 0;
                arrayList = null;
                while (i8 < i6) {
                    int i610 = i6;
                    i33 = iArr[i8];
                    if (i33 >= 0) {
                        c8135l3 = c8135l5;
                    } else {
                        c8135l3 = c8135l5;
                    }
                    i8++;
                    c8135l5 = c8135l3;
                    i6 = i610;
                    i68 = i68;
                }
                int i710 = i68;
                c8135l = c8135l5;
                if (arrayList == null) {
                    list = c2580l;
                } else {
                    list = arrayList;
                }
                if (zMo992import) {
                    i9 = i5;
                    c13994l = c13994l3;
                    arrayList2 = null;
                } else {
                    i9 = i5;
                    c13994l = c13994l3;
                    arrayList2 = null;
                }
                if (arrayList2 == null) {
                    list2 = c2580l;
                } else {
                    list2 = arrayList2;
                }
                iArr2 = c16761lAmazon.yandex;
                i10 = c16761lAmazon.loadAd;
                i11 = 0;
                arrayList3 = null;
                while (i11 < i10) {
                    i31 = iArr2[i11];
                    if (i9 + 1 <= i31) {
                        i32 = i10;
                        c8135l2 = c8135l;
                        iArr5 = iArr2;
                    } else {
                        i32 = i10;
                        c8135l2 = c8135l;
                        iArr5 = iArr2;
                    }
                    i11++;
                    iArr2 = iArr5;
                    c8135l = c8135l2;
                    i10 = i32;
                }
                C8135l c8135l8 = c8135l;
                if (arrayList3 == null) {
                    list3 = c2580l;
                } else {
                    list3 = arrayList3;
                }
                if (i39 <= 0) {
                    iPro = c11315l.pro();
                    i12 = i7;
                    i13 = 0;
                    while (i13 < iPro) {
                        int i87 = ((C2931l) c11315l.get(i13)).admob;
                        if (i12 != 0) {
                            break;
                        }
                        break;
                    }
                    i14 = i12;
                } else {
                    iPro = c11315l.pro();
                    i12 = i7;
                    i13 = 0;
                    while (i13 < iPro) {
                        int i88 = ((C2931l) c11315l.get(i13)).admob;
                        if (i12 != 0) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    i14 = i12;
                }
                C2931l c2931l7 = c2931l2;
                if (z7) {
                    iMopub = C15519l.admob(jSubs);
                    j2 = jSubs;
                } else {
                    j2 = jSubs;
                    iMopub = AbstractC7563l.mopub(i2, j2);
                }
                iMopub2 = iMopub;
                if (z7) {
                    iMopub3 = AbstractC7563l.billing(i2, j2);
                } else {
                    iMopub3 = C15519l.mopub(j2);
                }
                i15 = iMopub3;
                listM4232new = c11315l;
                if (!list2.isEmpty()) {
                    listM4232new = AbstractC16901l.m4232new(c11315l, list2);
                }
                list4 = listM4232new;
                if (z7) {
                    i16 = i15;
                } else {
                    i16 = iMopub2;
                }
                if (i2 < Math.min(i16, i61)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    AbstractC14825l.crashlytics("non-zero firstLineScrollOffset");
                }
                size = list4.size();
                z3 = z2;
                length = 0;
                while (i17 < size) {
                    length += ((C2931l) list4.get(i17)).loadAd.length;
                }
                arrayList4 = new ArrayList(length);
                if (z3) {
                    if (list.isEmpty()) {
                        AbstractC14825l.yandex("no items");
                    } else {
                        AbstractC14825l.yandex("no items");
                    }
                    size6 = list4.size();
                    iArr3 = new int[size6];
                    while (i26 < size6) {
                        iArr3[i26] = ((C2931l) list4.get(i26)).mopub;
                    }
                    iArr4 = new int[size6];
                    if (z7) {
                        arrayList5 = arrayList4;
                        interfaceC5404l.Signature(c17385l, i16, iArr3, EnumC9931l.f20223l, iArr4);
                    } else {
                        if (interfaceC3501l != null) {
                            throw AbstractC1757l.m1043volatile("null verticalArrangement");
                        }
                        interfaceC3501l.startapp(c17385l, i16, iArr3, iArr4);
                        arrayList5 = arrayList4;
                    }
                    C8934l c8934lM2403extends2 = AbstractC8669l.m2403extends(iArr4);
                    i27 = c8934lM2403extends2.f15487l;
                    i28 = c8934lM2403extends2.f15486l;
                    if (i28 > 0) {
                        i29 = 0;
                        while (true) {
                            while (i30 < r5) {
                                arrayList5.add(c9696l5);
                            }
                            if (i29 == i27) {
                                break;
                                break;
                            }
                            i29 += i28;
                        }
                    } else {
                        i29 = 0;
                        while (true) {
                            while (i30 < r5) {
                                arrayList5.add(c9696l5);
                            }
                            if (i29 == i27) {
                                break;
                                break;
                            }
                            i29 += i28;
                        }
                    }
                } else {
                    List list9 = list4;
                    arrayList5 = arrayList4;
                    i61 = i61;
                    c8788l = c8788l;
                    size2 = list.size() - 1;
                    if (size2 >= 0) {
                        iLoadAd2 = i67;
                        while (true) {
                            i21 = size2 - 1;
                            C9696l c9696l9 = (C9696l) list.get(size2);
                            iLoadAd2 -= c9696l9.loadAd();
                            c9696l9.purchase(iLoadAd2, 0, iMopub2, i15);
                            arrayList5.add(c9696l9);
                            if (i21 < 0) {
                                break;
                                break;
                            }
                            size2 = i21;
                        }
                    }
                    size3 = list9.size();
                    iLoadAd = i67;
                    i18 = 0;
                    list5 = list9;
                    while (i18 < size3) {
                        C2931l c2931l8 = (C2931l) list5.get(i18);
                        c9696lArrYandex = c2931l8.yandex(iLoadAd, iMopub2, i15);
                        length2 = c9696lArrYandex.length;
                        i20 = 0;
                        while (i20 < length2) {
                            list6 = list5;
                            arrayList5.add(c9696lArrYandex[i20]);
                            i20++;
                            list6 = list6;
                        }
                        list6 = list5;
                        iLoadAd += c2931l8.admob;
                        i18++;
                        list5 = list6;
                    }
                    size4 = list3.size();
                    while (i19 < size4) {
                        C9696l c9696l10 = (C9696l) list3.get(i19);
                        c9696l10.purchase(iLoadAd, 0, iMopub2, i15);
                        arrayList5.add(c9696l10);
                        iLoadAd += c9696l10.loadAd();
                    }
                }
                C13994l c13994l5 = c13994l;
                int i89 = i2;
                c12660l.amazon((int) f3, iMopub2, i15, arrayList5, c13994l5.crashlytics, c8135l8, z7, zMo992import, length3, z5, i14, i89, interfaceC2262l, interfaceC3685l);
                if (zMo992import) {
                    jLoadAd = c12660l.loadAd();
                    if (C4999l.loadAd(jLoadAd, 0L)) {
                        if (z7) {
                            i23 = i15;
                        } else {
                            i23 = iMopub2;
                        }
                        arrayList7 = arrayList5;
                        iMopub2 = AbstractC7563l.mopub(Math.max(iMopub2, (int) (jLoadAd >> 32)), j2);
                        iBilling = AbstractC7563l.billing(Math.max(i15, (int) (jLoadAd & 4294967295L)), j2);
                        if (z7) {
                            i24 = iBilling;
                        } else {
                            i24 = iMopub2;
                        }
                        if (i24 != i23) {
                            size5 = arrayList7.size();
                            while (i25 < size5) {
                                C9696l c9696l11 = (C9696l) arrayList7.get(i25);
                                c9696l11.tapsense = i24;
                                c9696l11.license = c9696l11.mopub + i24;
                            }
                        }
                        arrayList6 = arrayList7;
                    } else {
                        arrayList6 = arrayList5;
                        iBilling = i15;
                    }
                } else {
                    arrayList6 = arrayList5;
                    iBilling = i15;
                }
                int i810 = iMopub2;
                c13994l5.loadAd.getClass();
                ArrayList arrayList16 = arrayList6;
                i22 = i9;
                int i811 = iBilling;
                List listYandex2 = AbstractC10392l.yandex(this.isPro, i710, i22, arrayList16, AbstractC7124l.yandex, i39, i810, i811, z7, new C3005l(c8788l, c8135l8, 24));
                if (i22 == i38 - 1) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                InterfaceC17792l interfaceC17792lIsVip2 = interfaceC15847l2.isVip(AbstractC7563l.mopub(i810 + i34, j), AbstractC7563l.billing(i811 + iMo870l4, j), c14054l, new C0067l(interfaceC8714l, arrayList16, listYandex2, zMo992import, 0));
                List listPurchase2 = AbstractC3124l.purchase(i710, i22, arrayList16, listYandex2);
                if (z7) {
                    enumC7283l = enumC7283l3;
                } else {
                    enumC7283l = enumC7283l2;
                }
                interfaceC15847l = interfaceC15847l2;
                c13217l = new C13217l(c2931l7, i14, z4, f3, interfaceC17792lIsVip2, f, z, interfaceC2262l, c17385l, length3, function3, c17015l, listPurchase2, i48, i51, i38, enumC7283l, i37, iMo870l5);
            }
            C8232l c8232l3 = c8232l;
            c8232l3.billing(c13217l, interfaceC15847l.mo992import(), false);
            C18145l c18145l = c8232l3.yandex;
            return c13217l;
        } catch (Throwable th) {
            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
            throw th;
        }
    }
}
