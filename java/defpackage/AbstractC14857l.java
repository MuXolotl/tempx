package defpackage;

import android.graphics.Path;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: lّٔۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14857l {
    public static final C3797l yandex = C3797l.appmetrica("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:124:0x01de  */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:445:0x0772 A[LOOP:1: B:443:0x076c->B:445:0x0772, LOOP_END] */
    public static InterfaceC9750l yandex(C3122l c3122l, C10712l c10712l) throws C8413l, EOFException {
        String strMo1284package;
        InterfaceC9750l c17958l;
        InterfaceC9750l c15570l;
        InterfaceC9750l c1075l;
        InterfaceC9750l c7677l;
        int i;
        int i2;
        c3122l.billing();
        int iInmobi = 2;
        while (true) {
            if (!c3122l.ads()) {
                strMo1284package = null;
                break;
            }
            int iMo1288throw = c3122l.mo1288throw(yandex);
            if (iMo1288throw == 0) {
                strMo1284package = c3122l.mo1284package();
                break;
            }
            if (iMo1288throw != 1) {
                c3122l.mo1286switch();
                c3122l.mo1275continue();
            } else {
                iInmobi = c3122l.inmobi();
            }
        }
        if (strMo1284package == null) {
            return null;
        }
        boolean zIsVip = false;
        boolean zIsVip2 = false;
        int i3 = 0;
        int i4 = 3;
        switch (strMo1284package) {
            case "el":
                C3797l c3797l = AbstractC3194l.yandex;
                boolean z = iInmobi == 3;
                boolean zIsVip3 = false;
                String strMo1284package2 = null;
                InterfaceC15782l interfaceC15782lLoadAd = null;
                C2536l c2536lSubs = null;
                while (c3122l.ads()) {
                    int iMo1288throw2 = c3122l.mo1288throw(AbstractC3194l.yandex);
                    if (iMo1288throw2 == 0) {
                        strMo1284package2 = c3122l.mo1284package();
                    } else if (iMo1288throw2 == 1) {
                        interfaceC15782lLoadAd = AbstractC17754l.loadAd(c3122l, c10712l);
                    } else if (iMo1288throw2 == 2) {
                        c2536lSubs = AbstractC2069l.subs(c3122l, c10712l);
                    } else if (iMo1288throw2 == 3) {
                        zIsVip3 = c3122l.isVip();
                    } else if (iMo1288throw2 != 4) {
                        c3122l.mo1286switch();
                        c3122l.mo1275continue();
                    } else {
                        z = c3122l.inmobi() == 3;
                    }
                }
                c17958l = new C17958l(strMo1284package2, interfaceC15782lLoadAd, c2536lSubs, z, zIsVip3);
                c15570l = c17958l;
                while (c3122l.ads()) {
                    c3122l.mo1275continue();
                }
                c3122l.vip();
                return c15570l;
            case "fl":
                C3797l c3797l2 = AbstractC1986l.yandex;
                int iInmobi2 = 1;
                boolean zIsVip4 = false;
                boolean zIsVip5 = false;
                C2536l c2536l = null;
                String strMo1284package3 = null;
                C2536l c2536lPurchase = null;
                while (c3122l.ads()) {
                    int iMo1288throw3 = c3122l.mo1288throw(AbstractC1986l.yandex);
                    if (iMo1288throw3 == 0) {
                        strMo1284package3 = c3122l.mo1284package();
                    } else if (iMo1288throw3 == 1) {
                        c2536lPurchase = AbstractC2069l.purchase(c3122l, c10712l);
                    } else if (iMo1288throw3 == 2) {
                        c2536l = AbstractC2069l.admob(c3122l, c10712l);
                    } else if (iMo1288throw3 == 3) {
                        zIsVip4 = c3122l.isVip();
                    } else if (iMo1288throw3 == 4) {
                        iInmobi2 = c3122l.inmobi();
                    } else if (iMo1288throw3 != 5) {
                        c3122l.mo1286switch();
                        c3122l.mo1275continue();
                    } else {
                        zIsVip5 = c3122l.isVip();
                    }
                }
                if (c2536l == null) {
                    c2536l = new C2536l(2, Collections.singletonList(new C4529l(100)));
                }
                c15570l = new C15570l(strMo1284package3, zIsVip4, iInmobi2 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, c2536lPurchase, c2536l, zIsVip5);
                while (c3122l.ads()) {
                    c3122l.mo1275continue();
                }
                c3122l.vip();
                return c15570l;
            case "gf":
                C3797l c3797l3 = AbstractC12863l.yandex;
                Path.FillType fillType = Path.FillType.WINDING;
                int i5 = 0;
                boolean zIsVip6 = false;
                C2536l c2536l2 = null;
                String strMo1284package4 = null;
                C2536l c2536lMopub = null;
                C2536l c2536lSubs2 = null;
                C2536l c2536lSubs3 = null;
                while (c3122l.ads()) {
                    switch (c3122l.mo1288throw(AbstractC12863l.yandex)) {
                        case 0:
                            strMo1284package4 = c3122l.mo1284package();
                            break;
                        case 1:
                            c3122l.billing();
                            int iInmobi3 = -1;
                            while (c3122l.ads()) {
                                int iMo1288throw4 = c3122l.mo1288throw(AbstractC12863l.loadAd);
                                if (iMo1288throw4 == 0) {
                                    iInmobi3 = c3122l.inmobi();
                                } else if (iMo1288throw4 != 1) {
                                    c3122l.mo1286switch();
                                    c3122l.mo1275continue();
                                } else {
                                    c2536lMopub = AbstractC2069l.mopub(c3122l, c10712l, iInmobi3);
                                }
                            }
                            c3122l.vip();
                            break;
                        case 2:
                            c2536l2 = AbstractC2069l.admob(c3122l, c10712l);
                            break;
                        case 3:
                            i5 = c3122l.inmobi() != 1 ? 2 : 1;
                            break;
                        case 4:
                            c2536lSubs2 = AbstractC2069l.subs(c3122l, c10712l);
                            break;
                        case 5:
                            c2536lSubs3 = AbstractC2069l.subs(c3122l, c10712l);
                            break;
                        case 6:
                            fillType = c3122l.inmobi() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            zIsVip6 = c3122l.isVip();
                            break;
                        default:
                            c3122l.mo1286switch();
                            c3122l.mo1275continue();
                            break;
                    }
                }
                if (c2536l2 == null) {
                    c2536l2 = new C2536l(2, Collections.singletonList(new C4529l(100)));
                }
                c15570l = new C3391l(strMo1284package4, i5, fillType, c2536lMopub, c2536l2, c2536lSubs2, c2536lSubs3, zIsVip6);
                while (c3122l.ads()) {
                    c3122l.mo1275continue();
                }
                c3122l.vip();
                return c15570l;
            case "gr":
                C3797l c3797l4 = AbstractC5248l.yandex;
                ArrayList arrayList = new ArrayList();
                String strMo1284package5 = null;
                while (c3122l.ads()) {
                    int iMo1288throw5 = c3122l.mo1288throw(AbstractC5248l.yandex);
                    if (iMo1288throw5 == 0) {
                        strMo1284package5 = c3122l.mo1284package();
                    } else if (iMo1288throw5 == 1) {
                        zIsVip = c3122l.isVip();
                    } else if (iMo1288throw5 != 2) {
                        c3122l.mo1275continue();
                    } else {
                        c3122l.yandex();
                        while (c3122l.ads()) {
                            InterfaceC9750l interfaceC9750lYandex = yandex(c3122l, c10712l);
                            if (interfaceC9750lYandex != null) {
                                arrayList.add(interfaceC9750lYandex);
                            }
                        }
                        c3122l.mopub();
                    }
                }
                c1075l = new C1075l(strMo1284package5, arrayList, zIsVip);
                c15570l = c1075l;
                while (c3122l.ads()) {
                    c3122l.mo1275continue();
                }
                c3122l.vip();
                return c15570l;
            case "gs":
                C3797l c3797l5 = AbstractC10674l.yandex;
                ArrayList arrayList2 = new ArrayList();
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                boolean zIsVip7 = false;
                C2536l c2536l3 = null;
                String strMo1284package6 = null;
                C2536l c2536lMopub2 = null;
                C2536l c2536lSubs4 = null;
                C2536l c2536lSubs5 = null;
                C2982l c2982lBilling = null;
                C2982l c2982l = null;
                float fSignatures = 0.0f;
                while (c3122l.ads()) {
                    switch (c3122l.mo1288throw(AbstractC10674l.yandex)) {
                        case 0:
                            strMo1284package6 = c3122l.mo1284package();
                            break;
                        case 1:
                            c3122l.billing();
                            int iInmobi4 = -1;
                            while (c3122l.ads()) {
                                int iMo1288throw6 = c3122l.mo1288throw(AbstractC10674l.loadAd);
                                if (iMo1288throw6 == 0) {
                                    iInmobi4 = c3122l.inmobi();
                                } else if (iMo1288throw6 != 1) {
                                    c3122l.mo1286switch();
                                    c3122l.mo1275continue();
                                } else {
                                    c2536lMopub2 = AbstractC2069l.mopub(c3122l, c10712l, iInmobi4);
                                }
                            }
                            c3122l.vip();
                            break;
                        case 2:
                            c2536l3 = AbstractC2069l.admob(c3122l, c10712l);
                            break;
                        case 3:
                            i6 = c3122l.inmobi() != 1 ? 2 : 1;
                            break;
                        case 4:
                            c2536lSubs4 = AbstractC2069l.subs(c3122l, c10712l);
                            break;
                        case 5:
                            c2536lSubs5 = AbstractC2069l.subs(c3122l, c10712l);
                            break;
                        case 6:
                            c2982lBilling = AbstractC2069l.billing(c3122l, c10712l, true);
                            break;
                        case 7:
                            i7 = AbstractC5020l.m1673throws(3)[c3122l.inmobi() - 1];
                            break;
                        case 8:
                            i8 = AbstractC5020l.m1673throws(3)[c3122l.inmobi() - 1];
                            break;
                        case 9:
                            fSignatures = (float) c3122l.signatures();
                            break;
                        case 10:
                            zIsVip7 = c3122l.isVip();
                            break;
                        case 11:
                            c3122l.yandex();
                            while (c3122l.ads()) {
                                c3122l.billing();
                                String strMo1284package7 = null;
                                C2982l c2982lBilling2 = null;
                                while (c3122l.ads()) {
                                    int iMo1288throw7 = c3122l.mo1288throw(AbstractC10674l.crashlytics);
                                    if (iMo1288throw7 == 0) {
                                        strMo1284package7 = c3122l.mo1284package();
                                    } else if (iMo1288throw7 != 1) {
                                        c3122l.mo1286switch();
                                        c3122l.mo1275continue();
                                    } else {
                                        c2982lBilling2 = AbstractC2069l.billing(c3122l, c10712l, true);
                                    }
                                }
                                c3122l.vip();
                                if (strMo1284package7.equals("o")) {
                                    c2982l = c2982lBilling2;
                                } else if (strMo1284package7.equals("d") || strMo1284package7.equals("g")) {
                                    c10712l.metrica = true;
                                    arrayList2.add(c2982lBilling2);
                                }
                            }
                            c3122l.mopub();
                            if (arrayList2.size() == 1) {
                                arrayList2.add((C2982l) arrayList2.get(0));
                            }
                            break;
                        default:
                            c3122l.mo1286switch();
                            c3122l.mo1275continue();
                            break;
                    }
                }
                if (c2536l3 == null) {
                    c2536l3 = new C2536l(2, Collections.singletonList(new C4529l(100)));
                }
                c7677l = new C7677l(strMo1284package6, i6, c2536lMopub2, c2536l3, c2536lSubs4, c2536lSubs5, c2982lBilling, i7, i8, fSignatures, arrayList2, c2982l, zIsVip7);
                c15570l = c7677l;
                while (c3122l.ads()) {
                    c3122l.mo1275continue();
                }
                c3122l.vip();
                return c15570l;
            case "mm":
                C3797l c3797l6 = AbstractC10810l.yandex;
                boolean zIsVip8 = false;
                String strMo1284package8 = null;
                while (c3122l.ads()) {
                    int iMo1288throw8 = c3122l.mo1288throw(AbstractC10810l.yandex);
                    if (iMo1288throw8 == 0) {
                        strMo1284package8 = c3122l.mo1284package();
                    } else if (iMo1288throw8 == 1) {
                        int iInmobi5 = c3122l.inmobi();
                        if (iInmobi5 != 1) {
                            if (iInmobi5 == 2) {
                                i3 = 2;
                            } else if (iInmobi5 == 3) {
                                i3 = 3;
                            } else if (iInmobi5 == 4) {
                                i3 = 4;
                            } else if (iInmobi5 == 5) {
                                i3 = 5;
                            }
                        }
                        i3 = 1;
                    } else if (iMo1288throw8 != 2) {
                        c3122l.mo1286switch();
                        c3122l.mo1275continue();
                    } else {
                        zIsVip8 = c3122l.isVip();
                    }
                }
                C10448l c10448l = new C10448l(strMo1284package8, zIsVip8, i3);
                c10712l.yandex("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                c15570l = c10448l;
                while (c3122l.ads()) {
                    c3122l.mo1275continue();
                }
                c3122l.vip();
                return c15570l;
            case "rc":
                C3797l c3797l7 = AbstractC2147l.yandex;
                boolean zIsVip9 = false;
                String strMo1284package9 = null;
                InterfaceC15782l interfaceC15782lLoadAd2 = null;
                C2536l c2536lSubs6 = null;
                C2982l c2982lBilling3 = null;
                while (c3122l.ads()) {
                    int iMo1288throw9 = c3122l.mo1288throw(AbstractC2147l.yandex);
                    if (iMo1288throw9 == 0) {
                        strMo1284package9 = c3122l.mo1284package();
                    } else if (iMo1288throw9 == 1) {
                        interfaceC15782lLoadAd2 = AbstractC17754l.loadAd(c3122l, c10712l);
                    } else if (iMo1288throw9 == 2) {
                        c2536lSubs6 = AbstractC2069l.subs(c3122l, c10712l);
                    } else if (iMo1288throw9 == 3) {
                        c2982lBilling3 = AbstractC2069l.billing(c3122l, c10712l, true);
                    } else if (iMo1288throw9 != 4) {
                        c3122l.mo1275continue();
                    } else {
                        zIsVip9 = c3122l.isVip();
                    }
                }
                c7677l = new C14191l(strMo1284package9, interfaceC15782lLoadAd2, c2536lSubs6, c2982lBilling3, zIsVip9);
                c15570l = c7677l;
                while (c3122l.ads()) {
                    c3122l.mo1275continue();
                }
                c3122l.vip();
                return c15570l;
            case "rd":
                C3797l c3797l8 = AbstractC17751l.yandex;
                String strMo1284package10 = null;
                C2982l c2982lBilling4 = null;
                while (c3122l.ads()) {
                    int iMo1288throw10 = c3122l.mo1288throw(AbstractC17751l.yandex);
                    if (iMo1288throw10 == 0) {
                        strMo1284package10 = c3122l.mo1284package();
                    } else if (iMo1288throw10 == 1) {
                        c2982lBilling4 = AbstractC2069l.billing(c3122l, c10712l, true);
                    } else if (iMo1288throw10 != 2) {
                        c3122l.mo1275continue();
                    } else {
                        zIsVip2 = c3122l.isVip();
                    }
                }
                c15570l = zIsVip2 ? null : new C1655l(strMo1284package10, c2982lBilling4);
                while (c3122l.ads()) {
                    c3122l.mo1275continue();
                }
                c3122l.vip();
                return c15570l;
            case "rp":
                C3797l c3797l9 = AbstractC6296l.yandex;
                boolean zIsVip10 = false;
                String strMo1284package11 = null;
                C2982l c2982lBilling5 = null;
                C2982l c2982lBilling6 = null;
                C1406l c1406lCrashlytics = null;
                while (c3122l.ads()) {
                    int iMo1288throw11 = c3122l.mo1288throw(AbstractC6296l.yandex);
                    if (iMo1288throw11 == 0) {
                        strMo1284package11 = c3122l.mo1284package();
                    } else if (iMo1288throw11 == 1) {
                        c2982lBilling5 = AbstractC2069l.billing(c3122l, c10712l, false);
                    } else if (iMo1288throw11 == 2) {
                        c2982lBilling6 = AbstractC2069l.billing(c3122l, c10712l, false);
                    } else if (iMo1288throw11 == 3) {
                        c1406lCrashlytics = AbstractC0094l.crashlytics(c3122l, c10712l);
                    } else if (iMo1288throw11 != 4) {
                        c3122l.mo1275continue();
                    } else {
                        zIsVip10 = c3122l.isVip();
                    }
                }
                c7677l = new C14191l(strMo1284package11, c2982lBilling5, c2982lBilling6, c1406lCrashlytics, zIsVip10);
                c15570l = c7677l;
                while (c3122l.ads()) {
                    c3122l.mo1275continue();
                }
                c3122l.vip();
                return c15570l;
            case "sh":
                C3797l c3797l10 = AbstractC18502l.yandex;
                int iInmobi6 = 0;
                boolean zIsVip11 = false;
                C2536l c2536l4 = null;
                String strMo1284package12 = null;
                while (c3122l.ads()) {
                    int iMo1288throw12 = c3122l.mo1288throw(AbstractC18502l.yandex);
                    if (iMo1288throw12 == 0) {
                        strMo1284package12 = c3122l.mo1284package();
                    } else if (iMo1288throw12 == 1) {
                        iInmobi6 = c3122l.inmobi();
                    } else if (iMo1288throw12 == 2) {
                        c2536l4 = new C2536l(5, AbstractC18594l.yandex(c3122l, c10712l, AbstractC4218l.crashlytics(), C3143l.f6747l, false));
                    } else if (iMo1288throw12 != 3) {
                        c3122l.mo1275continue();
                    } else {
                        zIsVip11 = c3122l.isVip();
                    }
                }
                c1075l = new C16348l(strMo1284package12, iInmobi6, c2536l4, zIsVip11);
                c15570l = c1075l;
                while (c3122l.ads()) {
                    c3122l.mo1275continue();
                }
                c3122l.vip();
                return c15570l;
            case "sr":
                C3797l c3797l11 = AbstractC6158l.yandex;
                boolean z2 = iInmobi == 3;
                int i9 = 0;
                boolean zIsVip12 = false;
                String strMo1284package13 = null;
                C2982l c2982lBilling7 = null;
                InterfaceC15782l interfaceC15782lLoadAd3 = null;
                C2982l c2982lBilling8 = null;
                C2982l c2982lBilling9 = null;
                C2982l c2982lBilling10 = null;
                C2982l c2982lBilling11 = null;
                C2982l c2982lBilling12 = null;
                while (c3122l.ads()) {
                    switch (c3122l.mo1288throw(AbstractC6158l.yandex)) {
                        case 0:
                            strMo1284package13 = c3122l.mo1284package();
                            break;
                        case 1:
                            int iInmobi7 = c3122l.inmobi();
                            int[] iArrM1673throws = AbstractC5020l.m1673throws(2);
                            int length = iArrM1673throws.length;
                            int i10 = 0;
                            while (true) {
                                if (i10 >= length) {
                                    i9 = 0;
                                }
                                int i11 = iArrM1673throws[i10];
                                if (i11 == 1) {
                                    i = 1;
                                } else {
                                    if (i11 != 2) {
                                        throw null;
                                    }
                                    i = 2;
                                }
                                if (i == iInmobi7) {
                                    i9 = i11;
                                }
                                i10++;
                                break;
                                break;
                            }
                            break;
                        case 2:
                            c2982lBilling7 = AbstractC2069l.billing(c3122l, c10712l, false);
                            break;
                        case 3:
                            interfaceC15782lLoadAd3 = AbstractC17754l.loadAd(c3122l, c10712l);
                            break;
                        case 4:
                            c2982lBilling8 = AbstractC2069l.billing(c3122l, c10712l, false);
                            break;
                        case 5:
                            c2982lBilling10 = AbstractC2069l.billing(c3122l, c10712l, true);
                            break;
                        case 6:
                            c2982lBilling12 = AbstractC2069l.billing(c3122l, c10712l, false);
                            break;
                        case 7:
                            c2982lBilling9 = AbstractC2069l.billing(c3122l, c10712l, true);
                            break;
                        case 8:
                            c2982lBilling11 = AbstractC2069l.billing(c3122l, c10712l, false);
                            break;
                        case 9:
                            zIsVip12 = c3122l.isVip();
                            break;
                        case 10:
                            z2 = c3122l.inmobi() == 3;
                            break;
                        default:
                            c3122l.mo1286switch();
                            c3122l.mo1275continue();
                            break;
                    }
                }
                c7677l = new C12482l(strMo1284package13, i9, c2982lBilling7, interfaceC15782lLoadAd3, c2982lBilling8, c2982lBilling9, c2982lBilling10, c2982lBilling11, c2982lBilling12, zIsVip12, z2);
                c15570l = c7677l;
                while (c3122l.ads()) {
                    c3122l.mo1275continue();
                }
                c3122l.vip();
                return c15570l;
            case "st":
                C3797l c3797l12 = AbstractC14662l.yandex;
                ArrayList arrayList3 = new ArrayList();
                int i12 = 0;
                int i13 = 0;
                boolean zIsVip13 = false;
                C2536l c2536l5 = null;
                String strMo1284package14 = null;
                C2982l c2982l2 = null;
                C2536l c2536lPurchase2 = null;
                C2982l c2982lBilling13 = null;
                float fSignatures2 = 0.0f;
                while (c3122l.ads()) {
                    switch (c3122l.mo1288throw(AbstractC14662l.yandex)) {
                        case 0:
                            strMo1284package14 = c3122l.mo1284package();
                            continue;
                        case 1:
                            c2536lPurchase2 = AbstractC2069l.purchase(c3122l, c10712l);
                            continue;
                        case 2:
                            c2982lBilling13 = AbstractC2069l.billing(c3122l, c10712l, true);
                            continue;
                        case 3:
                            c2536l5 = AbstractC2069l.admob(c3122l, c10712l);
                            continue;
                        case 4:
                            i12 = AbstractC5020l.m1673throws(i4)[c3122l.inmobi() - 1];
                            continue;
                        case 5:
                            i13 = AbstractC5020l.m1673throws(i4)[c3122l.inmobi() - 1];
                            continue;
                        case 6:
                            i2 = i4;
                            fSignatures2 = (float) c3122l.signatures();
                            break;
                        case 7:
                            zIsVip13 = c3122l.isVip();
                            continue;
                        case 8:
                            c3122l.yandex();
                            while (c3122l.ads()) {
                                c3122l.billing();
                                C2982l c2982lBilling14 = null;
                                String strMo1284package15 = null;
                                while (c3122l.ads()) {
                                    int i14 = i4;
                                    int iMo1288throw13 = c3122l.mo1288throw(AbstractC14662l.loadAd);
                                    if (iMo1288throw13 == 0) {
                                        strMo1284package15 = c3122l.mo1284package();
                                    } else if (iMo1288throw13 != 1) {
                                        c3122l.mo1286switch();
                                        c3122l.mo1275continue();
                                    } else {
                                        c2982lBilling14 = AbstractC2069l.billing(c3122l, c10712l, true);
                                    }
                                    i4 = i14;
                                }
                                int i15 = i4;
                                c3122l.vip();
                                strMo1284package15.getClass();
                                switch (strMo1284package15) {
                                    case "d":
                                    case "g":
                                        c10712l.metrica = true;
                                        arrayList3.add(c2982lBilling14);
                                        break;
                                    case "o":
                                        c2982l2 = c2982lBilling14;
                                        break;
                                }
                                i4 = i15;
                            }
                            i2 = i4;
                            c3122l.mopub();
                            if (arrayList3.size() == 1) {
                                arrayList3.add((C2982l) arrayList3.get(0));
                            }
                            break;
                        default:
                            c3122l.mo1275continue();
                            continue;
                    }
                    i4 = i2;
                }
                if (c2536l5 == null) {
                    c2536l5 = new C2536l(2, Collections.singletonList(new C4529l(100)));
                }
                c15570l = new C6719l(strMo1284package14, c2982l2, arrayList3, c2536lPurchase2, c2536l5, c2982lBilling13, i12 == 0 ? 1 : i12, i13 == 0 ? 1 : i13, fSignatures2, zIsVip13);
                while (c3122l.ads()) {
                    c3122l.mo1275continue();
                }
                c3122l.vip();
                return c15570l;
            case "tm":
                C3797l c3797l13 = AbstractC1755l.yandex;
                int i16 = 0;
                boolean zIsVip14 = false;
                String strMo1284package16 = null;
                C2982l c2982lBilling15 = null;
                C2982l c2982lBilling16 = null;
                C2982l c2982lBilling17 = null;
                while (c3122l.ads()) {
                    int iMo1288throw14 = c3122l.mo1288throw(AbstractC1755l.yandex);
                    if (iMo1288throw14 == 0) {
                        c2982lBilling15 = AbstractC2069l.billing(c3122l, c10712l, false);
                    } else if (iMo1288throw14 == 1) {
                        c2982lBilling16 = AbstractC2069l.billing(c3122l, c10712l, false);
                    } else if (iMo1288throw14 == 2) {
                        c2982lBilling17 = AbstractC2069l.billing(c3122l, c10712l, false);
                    } else if (iMo1288throw14 == 3) {
                        strMo1284package16 = c3122l.mo1284package();
                    } else if (iMo1288throw14 == 4) {
                        int iInmobi8 = c3122l.inmobi();
                        if (iInmobi8 == 1) {
                            i16 = 1;
                        } else {
                            if (iInmobi8 != 2) {
                                C8339l.metrica(AbstractC0653l.vip(iInmobi8, "Unknown trim path type "));
                                return null;
                            }
                            i16 = 2;
                        }
                    } else if (iMo1288throw14 != 5) {
                        c3122l.mo1275continue();
                    } else {
                        zIsVip14 = c3122l.isVip();
                    }
                }
                c17958l = new C11283l(strMo1284package16, i16, c2982lBilling15, c2982lBilling16, c2982lBilling17, zIsVip14);
                c15570l = c17958l;
                while (c3122l.ads()) {
                    c3122l.mo1275continue();
                }
                c3122l.vip();
                return c15570l;
            case "tr":
                c15570l = AbstractC0094l.crashlytics(c3122l, c10712l);
                while (c3122l.ads()) {
                    c3122l.mo1275continue();
                }
                c3122l.vip();
                return c15570l;
            default:
                AbstractC17968l.loadAd("Unknown shape type ".concat(strMo1284package));
                while (c3122l.ads()) {
                    c3122l.mo1275continue();
                }
                c3122l.vip();
                return c15570l;
        }
    }
}
