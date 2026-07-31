package defpackage;

import android.os.Build;
import androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّٖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16357l {
    public static final C15578l yandex = new C15578l(289804370, false, new C2834l(22));
    public static final C15578l loadAd = new C15578l(2020862877, false, new C11112l(10));
    public static final C15578l crashlytics = new C15578l(-346395193, false, new C11112l(11));

    public static final void admob(AbstractC11563l abstractC11563l, C1306l c1306l) {
        int i = 0;
        for (Object obj : abstractC11563l.loadAd) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC14055l.subscription();
                throw null;
            }
            InterfaceC9708l interfaceC9708l = (InterfaceC9708l) c1306l.invoke((InterfaceC9708l) obj);
            abstractC11563l.loadAd.set(i, interfaceC9708l);
            if (interfaceC9708l instanceof AbstractC11563l) {
                admob((AbstractC11563l) interfaceC9708l, c1306l);
            }
            i = i2;
        }
    }

    public static final C3226l amazon(C6839l c6839l, InterfaceC17807l interfaceC17807l, C6956l c6956l, int i) {
        boolean zBilling = c6956l.billing(interfaceC17807l);
        Object objM2132native = c6956l.m2132native();
        Object obj = C1867l.yandex;
        if (zBilling || objM2132native == obj) {
            objM2132native = new C13834l(c6839l, interfaceC17807l);
            c6956l.m2147try(objM2132native);
        }
        C13834l c13834l = (C13834l) objM2132native;
        boolean zBilling2 = c6956l.billing(c13834l) | ((((i & 14) ^ 6) > 4 && c6956l.billing(c6839l)) || (i & 6) == 4);
        Object objM2132native2 = c6956l.m2132native();
        if (zBilling2 || objM2132native2 == obj) {
            objM2132native2 = new C12086l(c13834l, c6839l, null, 11);
            c6956l.m2147try(objM2132native2);
        }
        AbstractC12311l.purchase(c6839l, c13834l, (Function2) objM2132native2, c6956l);
        boolean zBilling3 = c6956l.billing(c13834l);
        Object objM2132native3 = c6956l.m2132native();
        if (zBilling3 || objM2132native3 == obj) {
            objM2132native3 = new C3226l(c13834l);
            c6956l.m2147try(objM2132native3);
        }
        return (C3226l) objM2132native3;
    }

    public static boolean billing() {
        if (!Build.MANUFACTURER.equalsIgnoreCase("Google") && !Build.BRAND.equalsIgnoreCase("Google")) {
            return false;
        }
        return ExtraSupportedSurfaceCombinationsQuirk.crashlytics.contains(Build.MODEL.toUpperCase(Locale.ROOT));
    }

    public static final void crashlytics(AbstractC11563l abstractC11563l) {
        ArrayList<InterfaceC9708l> arrayList = abstractC11563l.loadAd;
        for (InterfaceC9708l interfaceC9708l : arrayList) {
            if (interfaceC9708l instanceof AbstractC11563l) {
                crashlytics((AbstractC11563l) interfaceC9708l);
            }
        }
        C4538l c4538l = (C4538l) abstractC11563l.loadAd().purchase(null, C15460l.f30235l);
        AbstractC11876l abstractC11876l = C10365l.yandex;
        if (((c4538l != null ? c4538l.yandex : abstractC11876l) instanceof C10365l) && (arrayList == null || !arrayList.isEmpty())) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C4538l c4538l2 = (C4538l) ((InterfaceC9708l) it.next()).loadAd().purchase(null, C15460l.f30230l);
                if ((c4538l2 != null ? c4538l2.yandex : null) instanceof C16589l) {
                    abstractC11563l.crashlytics(abstractC11563l.loadAd().billing(new C4538l(C16589l.yandex)));
                    break;
                }
            }
        }
        C8079l c8079l = (C8079l) abstractC11563l.loadAd().purchase(null, C15460l.f30234l);
        if (c8079l != null) {
            abstractC11876l = c8079l.yandex;
        }
        if (abstractC11876l instanceof C10365l) {
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C8079l c8079l2 = (C8079l) ((InterfaceC9708l) it2.next()).loadAd().purchase(null, C15460l.f30257l);
                    if ((c8079l2 != null ? c8079l2.yandex : null) instanceof C16589l) {
                        abstractC11563l.crashlytics(AbstractC5573l.billing(abstractC11563l.loadAd()));
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    public static void loadAd(C14524l c14524l) {
        ArrayList arrayList = c14524l.loadAd;
        if (!arrayList.isEmpty()) {
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!(((InterfaceC9708l) it.next()) instanceof C0032l)) {
                            if (arrayList.size() != 1) {
                                C5500l c5500l = new C5500l();
                                AbstractC3984l.license(c5500l.loadAd, arrayList);
                                arrayList.clear();
                                arrayList.add(c5500l);
                            }
                        }
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ArrayList arrayList2 = ((C0032l) ((InterfaceC9708l) it2.next())).loadAd;
                if (arrayList2.size() != 1) {
                    C5500l c5500l2 = new C5500l();
                    AbstractC3984l.license(c5500l2.loadAd, arrayList2);
                    arrayList2.clear();
                    arrayList2.add(c5500l2);
                }
            }
        } else if (arrayList.size() != 1) {
            C5500l c5500l3 = new C5500l();
            AbstractC3984l.license(c5500l3.loadAd, arrayList);
            arrayList.clear();
            arrayList.add(c5500l3);
        }
        crashlytics(c14524l);
        admob(c14524l, new C1306l(6));
    }

    public static boolean mopub() {
        if (Build.MANUFACTURER.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) {
            String upperCase = Build.MODEL.toUpperCase(Locale.ROOT);
            Iterator it = ExtraSupportedSurfaceCombinationsQuirk.amazon.iterator();
            while (it.hasNext()) {
                if (AbstractC16648l.isVip(upperCase, (String) it.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void purchase(C2566l c2566l, int i, int i2) {
        c2566l.mopub(AbstractC2296l.loadAd(AbstractC8576l.purchase(i, 0, c2566l.f5577l.length()), AbstractC8576l.purchase(i2, 0, c2566l.f5577l.length())));
    }

    public static final LinkedHashMap subs(AbstractC11563l abstractC11563l) {
        ArrayList arrayList = abstractC11563l.loadAd;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC14055l.subscription();
                throw null;
            }
            InterfaceC9708l interfaceC9708l = (InterfaceC9708l) obj;
            InterfaceC12001l interfaceC12001lLoadAd = interfaceC9708l.loadAd();
            C8195l c8195l = interfaceC12001lLoadAd.admob(C1490l.f3713l) ? (C8195l) interfaceC12001lLoadAd.purchase(new C8195l(null, C9885l.yandex), C15460l.f30240l) : new C8195l(null, interfaceC12001lLoadAd);
            C10847l c10847l = (C10847l) c8195l.f17098l;
            InterfaceC12001l interfaceC12001l = (InterfaceC12001l) c8195l.f17097l;
            InterfaceC12133l interfaceC12133l = c10847l != null ? c10847l.yandex : null;
            C8195l c8195l2 = interfaceC12133l instanceof AbstractC10284l ? new C8195l(interfaceC12133l, interfaceC12001l) : new C8195l(null, interfaceC12001l);
            if (interfaceC9708l instanceof AbstractC11563l) {
                for (Map.Entry entry : subs((AbstractC11563l) interfaceC9708l).entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    Object arrayList2 = linkedHashMap.get(str);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(str, arrayList2);
                    }
                    ((List) arrayList2).addAll(list);
                }
            }
            i = i2;
        }
        return linkedHashMap;
    }

    public static final long yandex(int i, int i2, int i3, long j) {
        int i4;
        int iMopub = C12814l.mopub(j);
        int iBilling = C12814l.billing(j);
        if (iBilling < i) {
            return j;
        }
        if (iMopub <= i && i2 <= iBilling) {
            i4 = i3 - (i2 - i);
            if (iMopub == iBilling) {
            }
            i = iBilling + i4;
            return AbstractC2296l.loadAd(iMopub, i);
        }
        if (iMopub > i && iBilling < i2) {
            i += i3;
            iMopub = i;
        } else if (iMopub >= i2) {
            i4 = i3 - (i2 - i);
        } else if (i < iMopub) {
            iMopub = i + i3;
            i = (i3 - (i2 - i)) + iBilling;
        }
        return AbstractC2296l.loadAd(iMopub, i);
        iMopub += i4;
        i = iBilling + i4;
        return AbstractC2296l.loadAd(iMopub, i);
    }
}
