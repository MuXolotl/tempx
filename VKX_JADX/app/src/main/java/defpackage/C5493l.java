package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؘؘٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5493l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ List f11747l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11748l;

    public /* synthetic */ C5493l(int i, List list) {
        this.f11748l = i;
        this.f11747l = list;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0080 A[LOOP:0: B:19:0x0050->B:30:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ba A[LOOP:2: B:36:0x008b->B:47:0x00ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    /* JADX WARN: Code duplicated, block: B:90:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0026 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0026 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j;
        Object next;
        String str;
        C8195l c8195l;
        String str2;
        Object next2;
        String str3;
        String str4;
        int i = this.f11748l;
        List list = this.f11747l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(c4346l, 1.0f);
                    Float fValueOf = Float.valueOf(0.0f);
                    long j2 = C9735l.isPro;
                    InterfaceC17242l interfaceC17242lAdcel = AbstractC15042l.adcel(interfaceC17242lCrashlytics, C1083l.ads(new C8195l[]{new C8195l(fValueOf, new C9735l(j2)), new C8195l(Float.valueOf(0.5f), new C9735l(C9735l.loadAd)), new C8195l(Float.valueOf(1.0f), new C9735l(j2))}));
                    C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36044l, c6956l, 0);
                    long j3 = c6956l.f14595continue;
                    int i2 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lAdcel);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    c6956l.m2123default(-1246454741);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        int iIntValue2 = ((Number) it.next()).intValue();
                        boolean zAmazon = c6956l.amazon(iIntValue2);
                        Object objM2132native = c6956l.m2132native();
                        if (zAmazon || objM2132native == C1867l.yandex) {
                            objM2132native = Boolean.valueOf(iIntValue2 == R.drawable.ic_add_square_outline_28);
                            c6956l.m2147try(objM2132native);
                        }
                        boolean zBooleanValue = ((Boolean) objM2132native).booleanValue();
                        InterfaceC17242l interfaceC17242lPremium = new C9247l(1.0f, true).premium(AbstractC0080l.loadAd);
                        InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                        long j4 = c6956l.f14595continue;
                        int i3 = (int) (j4 ^ (j4 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
                        InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lPremium);
                        InterfaceC8801l.firebase.getClass();
                        C16395l c16395l2 = C3438l.loadAd;
                        c6956l.m2140super();
                        if (c6956l.f14603switch) {
                            c6956l.firebase(c16395l2);
                        } else {
                            c6956l.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
                        AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, C3438l.billing);
                        AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
                        AbstractC8182l.purchase(c6956l, C3438l.firebase);
                        AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, C3438l.amazon);
                        AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(iIntValue2, 0, c6956l);
                        if (zBooleanValue) {
                            c6956l.m2123default(-131763124);
                            j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                        } else {
                            c6956l.m2123default(-131761805);
                            j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.subscription;
                        }
                        c6956l.startapp(false);
                        AbstractC4597l.loadAd(abstractC14165lCrashlytics, null, C16170l.yandex.yandex(AbstractC0080l.isPro(c4346l, zBooleanValue ? 56.0f : 32.0f), C18450l.f36043l), j, c6956l, 56, 0);
                        c6956l.startapp(true);
                    }
                    c6956l.startapp(false);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            default:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (list.size() == 1) {
                    String str5 = (String) AbstractC16901l.m4223import(list);
                    int iM3324for = AbstractC12024l.m3324for(charSequence, str5, iIntValue3, false, 4);
                    if (iM3324for < 0) {
                        c8195l = null;
                    } else {
                        c8195l = new C8195l(Integer.valueOf(iM3324for), str5);
                    }
                } else {
                    if (iIntValue3 < 0) {
                        iIntValue3 = 0;
                    }
                    C8934l c8934l = new C8934l(iIntValue3, charSequence.length(), 1);
                    boolean z = charSequence instanceof String;
                    int i4 = c8934l.f15486l;
                    int i5 = c8934l.f15487l;
                    if (z) {
                        if ((i4 <= 0 || iIntValue3 > i5) && (i4 >= 0 || i5 > iIntValue3)) {
                            c8195l = null;
                        } else {
                            while (true) {
                                Iterator it2 = list.iterator();
                                do {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                        str4 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str3 = (String) next2;
                                    if (str3 != null) {
                                        c8195l = new C8195l(Integer.valueOf(iIntValue3), str3);
                                    } else if (iIntValue3 != i5) {
                                        iIntValue3 += i4;
                                    } else {
                                        c8195l = null;
                                    }
                                } while (!str4.regionMatches(0, (String) charSequence, iIntValue3, str4.length()));
                                str3 = (String) next2;
                                if (str3 != null) {
                                    c8195l = new C8195l(Integer.valueOf(iIntValue3), str3);
                                } else if (iIntValue3 != i5) {
                                    iIntValue3 += i4;
                                } else {
                                    c8195l = null;
                                }
                            }
                        }
                    } else if ((i4 <= 0 || iIntValue3 > i5) && (i4 >= 0 || i5 > iIntValue3)) {
                        c8195l = null;
                    } else {
                        int i6 = iIntValue3;
                        while (true) {
                            Iterator it3 = list.iterator();
                            do {
                                if (it3.hasNext()) {
                                    next = it3.next();
                                    str2 = (String) next;
                                } else {
                                    next = null;
                                }
                                str = (String) next;
                                if (str != null) {
                                    c8195l = new C8195l(Integer.valueOf(i6), str);
                                } else if (i6 != i5) {
                                    i6 += i4;
                                } else {
                                    c8195l = null;
                                }
                            } while (!AbstractC12024l.m3322final(str2, 0, charSequence, i6, str2.length(), false));
                            str = (String) next;
                            if (str != null) {
                                c8195l = new C8195l(Integer.valueOf(i6), str);
                            } else if (i6 != i5) {
                                i6 += i4;
                            } else {
                                c8195l = null;
                            }
                        }
                    }
                }
                if (c8195l != null) {
                    return new C8195l(c8195l.f17098l, Integer.valueOf(((String) c8195l.f17097l).length()));
                }
                return null;
        }
    }
}
