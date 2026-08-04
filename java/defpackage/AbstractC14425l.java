package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٓۛۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14425l {
    public static final C8896l yandex = new C8896l(0.0f, 0.0f, 10.0f, 10.0f);

    public static final AbstractC16653l admob(Object obj) {
        if (obj != AbstractC18590l.yandex) {
            return (AbstractC16653l) obj;
        }
        C8339l.smaato("Does not contain segment");
        return null;
    }

    public static final C16977l amazon(C18483l c18483l, Function1 function1) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            C18666l c18666lYandex = c18483l.yandex();
            C3654l c3654l = c18666lYandex.crashlytics;
            if (c3654l.m1389private() && c3654l.m1386native()) {
                C8896l c8896lMopub = c18666lYandex.mopub();
                C16977l c16977l = new C16977l(48);
                C10975l c10975l = new C10975l(24);
                c10975l.m3022switch(AbstractC14231l.subs(c8896lMopub));
                mopub(c16977l, new C10975l(24), c10975l, c18666lYandex, c18666lYandex, function1);
                return c16977l;
            }
            return AbstractC6903l.yandex;
        } finally {
            Trace.endSection();
        }
    }

    public static final void billing(C16977l c16977l, C18666l c18666l, C18666l c18666l2) {
        C3654l c3654l;
        C18666l c18666lSmaato = c18666l2.smaato();
        C8896l c8896lMopub = (c18666lSmaato == null || (c3654l = c18666lSmaato.crashlytics) == null || !c3654l.m1389private()) ? yandex : c18666lSmaato.mopub();
        int i = c18666l2.billing;
        if (i == c18666l.billing) {
            i = -1;
        }
        c16977l.subs(i, new C13874l(c18666l2, AbstractC14231l.subs(c8896lMopub)));
    }

    public static C4652l crashlytics(String str, C8876l c8876l) {
        C1652l c1652lLoadAd = C4652l.loadAd(C4662l.class);
        c1652lLoadAd.crashlytics = 1;
        c1652lLoadAd.yandex(C12186l.loadAd(Context.class));
        c1652lLoadAd.mopub = new C5131l(str, c8876l, 19);
        return c1652lLoadAd.loadAd();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[LOOP:0: B:9:0x001b->B:21:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x005b A[SYNTHETIC] */
    public static final boolean firebase(C18666l c18666l) {
        if (!isPro(c18666l)) {
            C6264l c6264l = c18666l.amazon;
            if (c6264l.f13223l) {
                return true;
            }
            C13660l c13660l = c6264l.f13225l;
            Object[] objArr = c13660l.loadAd;
            Object[] objArr2 = c13660l.crashlytics;
            long[] jArr = c13660l.yandex;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                Object obj2 = objArr2[i4];
                                if (((C4707l) obj).crashlytics) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isPro(C18666l c18666l) {
        AbstractC18026l abstractC18026lAmazon = c18666l.amazon();
        C13660l c13660l = c18666l.amazon.f13225l;
        return (abstractC18026lAmazon != null ? abstractC18026lAmazon.m4464l() : false) || c13660l.crashlytics(AbstractC0424l.adcel) || c13660l.crashlytics(AbstractC0424l.startapp);
    }

    public static final InterfaceC12932l loadAd(InterfaceC12932l interfaceC12932l, InterfaceC12932l interfaceC12932l2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 29;
        boolean zBooleanValue = ((Boolean) interfaceC12932l.mo247l(bool, new C8337l(i))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC12932l2.mo247l(bool, new C8337l(i))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC12932l.mo246l(interfaceC12932l2);
        }
        byte b = 0;
        C12513l c12513l = new C12513l(b, b);
        C17218l c17218l = C17218l.f33421l;
        InterfaceC12932l interfaceC12932l3 = (InterfaceC12932l) interfaceC12932l.mo247l(c17218l, c12513l);
        Object objMo247l = interfaceC12932l2;
        if (zBooleanValue2) {
            objMo247l = interfaceC12932l2.mo247l(c17218l, new C12513l(b, 1));
        }
        return interfaceC12932l3.mo246l((InterfaceC12932l) objMo247l);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    public static final void mopub(C16977l c16977l, C10975l c10975l, C10975l c10975l2, C18666l c18666l, C18666l c18666l2, Function1 function1) {
        boolean z;
        C8896l c8896lM4475l;
        boolean z2;
        C16977l c16977l2 = c16977l;
        Function1 function2 = function1;
        int i = c18666l.billing;
        Region region = (Region) c10975l.f22121l;
        C10975l c10975l3 = c10975l2;
        Region region2 = (Region) c10975l3.f22121l;
        C3654l c3654l = c18666l2.crashlytics;
        C6264l c6264l = c18666l2.amazon;
        C3654l c3654l2 = c18666l2.crashlytics;
        int i2 = c18666l2.billing;
        boolean z3 = (c3654l.m1389private() && c3654l2.m1386native()) ? false : true;
        if (!region2.isEmpty() || i2 == i) {
            if (!z3 || c18666l2.metrica()) {
                C16918l c16918lSubs = AbstractC14231l.subs(c18666l2.remoteconfig());
                c10975l.m3022switch(c16918lSubs);
                if (i2 == i) {
                    i2 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (c18666l2.metrica()) {
                        billing(c16977l2, c18666l, c18666l2);
                        return;
                    } else {
                        if (i2 == -1) {
                            Rect bounds = region.getBounds();
                            c16977l2.subs(i2, new C13874l(c18666l2, new C16918l(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                c16977l2.subs(i2, new C13874l(c18666l2, new C16918l(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listIsPro = C18666l.isPro(4, c18666l2);
                if (c6264l.f13223l) {
                    C18666l c18666lSmaato = c18666l2.smaato();
                    while (true) {
                        if (c18666lSmaato == null) {
                            c18666lSmaato = null;
                            break;
                        }
                        C13660l c13660l = c18666lSmaato.amazon.f13225l;
                        if (c13660l.crashlytics(AbstractC0424l.pro) || c13660l.crashlytics(AbstractC0424l.license)) {
                            break;
                        } else {
                            c18666lSmaato = c18666lSmaato.smaato();
                        }
                    }
                    if (c18666lSmaato == null) {
                        z2 = false;
                    } else {
                        AbstractC18026l abstractC18026lAmazon = c18666l2.amazon();
                        if (abstractC18026lAmazon == null) {
                            abstractC18026lAmazon = null;
                        } else {
                            if (!abstractC18026lAmazon.mo2643l().f29462l) {
                                abstractC18026lAmazon = null;
                            }
                            if (abstractC18026lAmazon == null) {
                                abstractC18026lAmazon = null;
                            }
                        }
                        AbstractC18026l abstractC18026lAmazon2 = c18666lSmaato.amazon();
                        if (abstractC18026lAmazon2 == null) {
                            abstractC18026lAmazon2 = null;
                        } else {
                            if (!abstractC18026lAmazon2.mo2643l().f29462l) {
                                abstractC18026lAmazon2 = null;
                            }
                            if (abstractC18026lAmazon2 == null) {
                                abstractC18026lAmazon2 = null;
                            }
                        }
                        if (abstractC18026lAmazon == null || abstractC18026lAmazon2 == null) {
                            z2 = false;
                        } else {
                            C8896l c8896lMo2592synchronized = abstractC18026lAmazon2.mo2592synchronized(abstractC18026lAmazon, false);
                            z2 = !c8896lMo2592synchronized.equals(c8896lMo2592synchronized.isPro(AbstractC7470l.isPro(0L, AbstractC14707l.mopub(abstractC18026lAmazon2.f20590l))));
                        }
                    }
                    if (z2) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    C10975l c10975l4 = new C10975l(24);
                    Object objBilling = c18666l2.billing();
                    if (objBilling == null) {
                        C11103l c11103l = (C11103l) c3654l2.f7703l.amazon;
                        c8896lM4475l = AbstractC9690l.crashlytics(c11103l).mo2592synchronized(c11103l, false);
                    } else {
                        AbstractC14971l abstractC14971l = ((AbstractC14971l) objBilling).f29454l;
                        Object objMopub = c6264l.f13225l.mopub(AbstractC16601l.loadAd);
                        boolean z4 = (objMopub == null ? null : objMopub) != null;
                        if (!abstractC14971l.f29454l.f29462l) {
                            c8896lM4475l = C8896l.purchase;
                        } else if (z4) {
                            c8896lM4475l = AbstractC5573l.smaato(abstractC14971l, 8).m4475l();
                        } else {
                            AbstractC18026l abstractC18026lSmaato = AbstractC5573l.smaato(abstractC14971l, 8);
                            c8896lM4475l = AbstractC9690l.crashlytics(abstractC18026lSmaato).mo2592synchronized(abstractC18026lSmaato, false);
                        }
                    }
                    c10975l4.m3022switch(AbstractC14231l.subs(c8896lM4475l));
                    int size = listIsPro.size() - 1;
                    while (-1 < size) {
                        if (!((Boolean) function2.invoke(listIsPro.get(size))).booleanValue()) {
                            purchase(c16977l2, new C10975l(24), c10975l4, c18666l, (C18666l) listIsPro.get(size), function2);
                        }
                        size--;
                        c16977l2 = c16977l;
                    }
                } else {
                    int size2 = listIsPro.size() - 1;
                    while (-1 < size2) {
                        if (!((Boolean) function2.invoke(listIsPro.get(size2))).booleanValue()) {
                            mopub(c16977l, c10975l, c10975l3, c18666l, (C18666l) listIsPro.get(size2), function2);
                        }
                        size2--;
                        c10975l3 = c10975l2;
                        function2 = function1;
                    }
                }
                if (firebase(c18666l2)) {
                    region2.op(c16918lSubs.yandex, c16918lSubs.loadAd, c16918lSubs.crashlytics, c16918lSubs.amazon, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final void purchase(C16977l c16977l, C10975l c10975l, C10975l c10975l2, C18666l c18666l, C18666l c18666l2, Function1 function1) {
        C10975l c10975l3 = c10975l;
        Region region = (Region) c10975l3.f22121l;
        C10975l c10975l4 = c10975l2;
        Region region2 = (Region) c10975l4.f22121l;
        C3654l c3654l = c18666l2.crashlytics;
        C3654l c3654l2 = c18666l2.crashlytics;
        if (!c3654l.m1389private() || !c3654l2.m1386native() || region2.isEmpty()) {
            if (c18666l2.metrica()) {
                billing(c16977l, c18666l, c18666l2);
                return;
            }
            return;
        }
        C8896l c8896lRemoteconfig = c18666l2.remoteconfig();
        if (c8896lRemoteconfig.firebase()) {
            Object objBilling = c18666l2.billing();
            if (objBilling == null) {
                C11103l c11103l = (C11103l) c3654l2.f7703l.amazon;
                c8896lRemoteconfig = AbstractC9690l.crashlytics(c11103l).mo2592synchronized(c11103l, false);
            } else {
                AbstractC14971l abstractC14971l = ((AbstractC14971l) objBilling).f29454l;
                Object objMopub = c18666l2.amazon.f13225l.mopub(AbstractC16601l.loadAd);
                if (objMopub == null) {
                    objMopub = null;
                }
                boolean z = objMopub != null;
                if (!abstractC14971l.f29454l.f29462l) {
                    c8896lRemoteconfig = C8896l.purchase;
                } else if (z) {
                    c8896lRemoteconfig = AbstractC5573l.smaato(abstractC14971l, 8).m4475l();
                } else {
                    AbstractC18026l abstractC18026lSmaato = AbstractC5573l.smaato(abstractC14971l, 8);
                    c8896lRemoteconfig = AbstractC9690l.crashlytics(abstractC18026lSmaato).mo2592synchronized(abstractC18026lSmaato, false);
                }
            }
        }
        C16918l c16918lSubs = AbstractC14231l.subs(c8896lRemoteconfig);
        c10975l3.m3022switch(c16918lSubs);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i = c18666l2.billing;
            if (i == c18666l.billing) {
                i = -1;
            }
            Rect bounds = region.getBounds();
            c16977l.subs(i, new C13874l(c18666l2, new C16918l(bounds.left, bounds.top, bounds.right, bounds.bottom)));
            List listIsPro = C18666l.isPro(4, c18666l2);
            int size = listIsPro.size() - 1;
            while (-1 < size) {
                if (!((Boolean) function1.invoke(listIsPro.get(size))).booleanValue()) {
                    purchase(c16977l, c10975l3, c10975l4, c18666l, (C18666l) listIsPro.get(size), function1);
                }
                size--;
                c10975l3 = c10975l;
                c10975l4 = c10975l2;
            }
            if (firebase(c18666l2)) {
                region2.op(c16918lSubs.yandex, c16918lSubs.loadAd, c16918lSubs.crashlytics, c16918lSubs.amazon, Region.Op.DIFFERENCE);
            }
        }
    }

    public static final C13887l remoteconfig(InterfaceC14029l interfaceC14029l, InterfaceC12932l interfaceC12932l, Object obj) {
        C13887l c13887l = null;
        if ((interfaceC14029l instanceof InterfaceC1840l) && interfaceC12932l.mo245l(C4639l.f9438l) != null) {
            InterfaceC1840l interfaceC1840lAdmob = (InterfaceC1840l) interfaceC14029l;
            while (!(interfaceC1840lAdmob instanceof C5971l) && (interfaceC1840lAdmob = interfaceC1840lAdmob.admob()) != null) {
                if (interfaceC1840lAdmob instanceof C13887l) {
                    c13887l = (C13887l) interfaceC1840lAdmob;
                    break;
                }
            }
            if (c13887l != null) {
                c13887l.m3794l(interfaceC12932l, obj);
            }
        }
        return c13887l;
    }

    public static final InterfaceC12932l smaato(InterfaceC2262l interfaceC2262l, InterfaceC12932l interfaceC12932l) {
        InterfaceC12932l interfaceC12932lLoadAd = loadAd(interfaceC2262l.vip(), interfaceC12932l, true);
        C16552l c16552l = AbstractC11463l.yandex;
        return (interfaceC12932lLoadAd == c16552l || interfaceC12932lLoadAd.mo245l(C6168l.f13001l) != null) ? interfaceC12932lLoadAd : interfaceC12932lLoadAd.mo246l(c16552l);
    }

    public static final boolean subs(Object obj) {
        return obj == AbstractC18590l.yandex;
    }

    public static int vip(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
            default:
                return 0;
            case 16:
                return 17;
        }
    }

    public static C4652l yandex(String str, String str2) {
        C4662l c4662l = new C4662l(str, str2);
        C1652l c1652lLoadAd = C4652l.loadAd(C4662l.class);
        c1652lLoadAd.crashlytics = 1;
        c1652lLoadAd.mopub = new C3441l(0, c4662l);
        return c1652lLoadAd.loadAd();
    }
}
