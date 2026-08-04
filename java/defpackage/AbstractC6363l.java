package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍؙۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6363l {
    public static int crashlytics;
    public static boolean loadAd;
    public static final Object yandex = new Object();

    public static final int admob(int i, int i2, C6956l c6956l) {
        c6956l.m2125final(-1131358425);
        boolean z = true;
        float f = (i2 & 1) != 0 ? 30.0f : 60.0f;
        InterfaceC13490l interfaceC13490l = (InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob);
        c6956l.m2125final(624596967);
        boolean zBilling = c6956l.billing(interfaceC13490l);
        if ((((i & 14) ^ 6) <= 4 || !c6956l.crashlytics(f)) && (i & 6) != 4) {
            z = false;
        }
        boolean z2 = zBilling | z;
        Object objM2132native = c6956l.m2132native();
        if (z2 || objM2132native == C1867l.yandex) {
            objM2132native = Integer.valueOf(interfaceC13490l.mo870l(f));
            c6956l.m2147try(objM2132native);
        }
        int iIntValue = ((Number) objM2132native).intValue();
        c6956l.startapp(false);
        c6956l.startapp(false);
        return iIntValue;
    }

    public static C10405l amazon(int i, boolean z) {
        C6763l c6763l = AbstractC5341l.yandex;
        C4776l c4776lSubs = AbstractC0532l.subs(300, 2, c6763l);
        C15760l c15760l = new C15760l(i, 1, z);
        C0010l c0010l = AbstractC4523l.yandex;
        C3000l c3000lYandex = new C3000l(new C3313l((C4610l) null, new C5487l(new C4693l(1, c15760l), c4776lSubs), (C15457l) null, (C11700l) null, (LinkedHashMap) null, 125)).yandex(AbstractC4523l.purchase(new C4776l(195, 105, AbstractC5341l.loadAd), 2));
        C4776l c4776lSubs2 = AbstractC0532l.subs(300, 2, c6763l);
        int i2 = 3;
        C4610l c4610l = null;
        byte b = 0 == true ? 1 : 0;
        return new C10405l(c3000lYandex, new C0274l(new C3313l(c4610l, new C5487l(new C4693l(i2, new C15760l(i, 0, z)), c4776lSubs2), (C15457l) (0 == true ? 1 : 0), (C11700l) b, (LinkedHashMap) null, 125)).yandex(AbstractC4523l.billing(new C4776l(105, 0, AbstractC5341l.crashlytics), 2)));
    }

    public static final C3000l billing(int i, boolean z) {
        C4776l c4776lSubs = AbstractC0532l.subs(300, 2, AbstractC5341l.yandex);
        C15760l c15760l = new C15760l(i, 2, z);
        C0010l c0010l = AbstractC4523l.yandex;
        return new C3000l(new C3313l((C4610l) null, new C5487l(new C4693l(2, c15760l), c4776lSubs), (C15457l) null, (C11700l) null, (LinkedHashMap) null, 125)).yandex(AbstractC4523l.purchase(new C4776l(195, 105, AbstractC5341l.loadAd), 2));
    }

    public static final void crashlytics(C15764l c15764l, InterfaceC17242l interfaceC17242l, C15578l c15578l, C6956l c6956l, int i) {
        InterfaceC17242l interfaceC17242l2;
        c6956l.m2133new(-1077081618);
        int i2 = i | 48;
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            C15851l c15851l = (C15851l) c15764l.loadAd.getValue();
            InterfaceC7628l interfaceC7628l = (InterfaceC7628l) c6956l.isPro(AbstractC4751l.yandex);
            boolean zBilling = c6956l.billing(c15851l) | c6956l.admob(interfaceC7628l);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                objM2132native = new C15352l(c15851l, interfaceC7628l, null, 7);
                c6956l.m2147try(objM2132native);
            }
            AbstractC12311l.amazon(c6956l, c15851l, (Function2) objM2132native);
            C15851l c15851l2 = (C15851l) c15764l.loadAd.getValue();
            C4346l c4346l = C4346l.f8873l;
            loadAd(c15851l2, c4346l, c15578l, c6956l, 432);
            interfaceC17242l2 = c4346l;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3411l(c15764l, interfaceC17242l2, c15578l, i, 7);
        }
    }

    public static C2201l isPro(List list, AbstractC10794l abstractC10794l, InterfaceC8371l interfaceC8371l, List list2, boolean[] zArr) {
        int i;
        if (abstractC10794l == null) {
            yandex(6);
            throw null;
        }
        if (interfaceC8371l == null) {
            yandex(7);
            throw null;
        }
        if (list2 == null) {
            yandex(8);
            throw null;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC16902l interfaceC16902l = (InterfaceC16902l) it.next();
            C16687l c16687lM4191l = C16687l.m4191l(interfaceC8371l, interfaceC16902l.getAnnotations(), interfaceC16902l.mo2180extends(), interfaceC16902l.mo2182l(), interfaceC16902l.getName(), i2, interfaceC16902l.mo2183protected());
            map.put(interfaceC16902l.metrica(), new C10636l(1, c16687lM4191l.ad()));
            map2.put(interfaceC16902l, c16687lM4191l);
            list2.add(c16687lM4191l);
            i2++;
        }
        C13105l c13105l = new C13105l(i, map);
        C2201l c2201lPurchase = C2201l.purchase(abstractC10794l, c13105l);
        C2201l c2201lPurchase2 = C2201l.purchase(new C1522l(abstractC10794l, i), c13105l);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC16902l interfaceC16902l2 = (InterfaceC16902l) it2.next();
            C16687l c16687l = (C16687l) map2.get(interfaceC16902l2);
            for (AbstractC18041l abstractC18041l : interfaceC16902l2.getUpperBounds()) {
                InterfaceC15234l interfaceC15234lPro = abstractC18041l.mo1339native().pro();
                AbstractC18041l abstractC18041lAdmob = (((interfaceC15234lPro instanceof InterfaceC16902l) && AbstractC12300l.admob((InterfaceC16902l) interfaceC15234lPro, null, null)) ? c2201lPurchase : c2201lPurchase2).admob(3, abstractC18041l);
                if (abstractC18041lAdmob == null) {
                    return null;
                }
                if (abstractC18041lAdmob != abstractC18041l && zArr != null) {
                    zArr[0] = true;
                }
                if (c16687l.f32706l) {
                    C8339l.smaato("Type parameter descriptor is already initialized: ".concat(c16687l.m4194l()));
                    return null;
                }
                if (!AbstractC11748l.subs(abstractC18041lAdmob)) {
                    c16687l.f32707l.add(abstractC18041lAdmob);
                }
            }
            if (c16687l.f32706l) {
                C8339l.smaato("Type parameter descriptor is already initialized: ".concat(c16687l.m4194l()));
                return null;
            }
            c16687l.f32706l = true;
        }
        return c2201lPurchase;
    }

    public static final void loadAd(C15851l c15851l, InterfaceC17242l interfaceC17242l, C15578l c15578l, C6956l c6956l, int i) {
        Object obj;
        boolean z;
        char c;
        C15851l c15851l2 = c15851l;
        c6956l.m2133new(-977568115);
        int i2 = 2;
        int i3 = (i & 6) == 0 ? (c6956l.billing(c15851l2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= c6956l.billing(interfaceC17242l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c6956l.admob(c15578l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        boolean z2 = true;
        if (c6956l.m2127for(i3 & 1, (i3 & 147) != 146)) {
            String strCrashlytics = AbstractC7902l.crashlytics(c6956l, R.string.m3c_snackbar_pane_title);
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                obj = objM2132native;
                C17006l c17006l = new C17006l();
                c17006l.yandex = new Object();
                c17006l.loadAd = new ArrayList();
                c6956l.m2147try(c17006l);
                obj = c17006l;
            }
            obj = objM2132native;
            C17006l c17006l2 = (C17006l) obj;
            Object obj2 = c17006l2.yandex;
            ArrayList arrayList = c17006l2.loadAd;
            if (AbstractC8576l.yandex(c15851l2, obj2)) {
                z = true;
                c = ' ';
                c6956l.m2123default(1443889109);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(1441886385);
                c17006l2.yandex = c15851l2;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList2.add((C15851l) ((C5078l) arrayList.get(i4)).yandex);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(c15851l2)) {
                    arrayList3.add(c15851l2);
                }
                arrayList.clear();
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    Object obj3 = arrayList3.get(i5);
                    if (obj3 != null) {
                        arrayList4.add(obj3);
                    }
                }
                c = ' ';
                int size3 = arrayList4.size();
                int i6 = 0;
                while (i6 < size3) {
                    C15851l c15851l3 = (C15851l) arrayList4.get(i6);
                    arrayList.add(new C5078l(c15851l3, AbstractC14566l.amazon(-1952400805, new C11223l(c15851l3, c15851l2, c17006l2, strCrashlytics, 24), c6956l)));
                    i6++;
                    c15851l2 = c15851l;
                    z2 = z2;
                }
                z = z2;
                c6956l.startapp(false);
            }
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j = c6956l.f14595continue;
            int i7 = (int) (j ^ (j >>> c));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242l);
            InterfaceC8801l.firebase.getClass();
            Function0 function0 = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(function0);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i7), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            C4224l c4224lPro = c6956l.pro();
            if (c4224lPro == null) {
                C8339l.smaato("no recompose scope found");
                return;
            }
            c4224lPro.loadAd |= 1;
            c17006l2.crashlytics = c4224lPro;
            c6956l.m2123default(-1888182177);
            int size4 = arrayList.size();
            for (int i8 = 0; i8 < size4; i8++) {
                C5078l c5078l = (C5078l) arrayList.get(i8);
                Object obj4 = (C15851l) c5078l.yandex;
                C15578l c15578l2 = c5078l.loadAd;
                c6956l.m2121class(1325010085, obj4);
                c15578l2.invoke(AbstractC14566l.amazon(-1893791890, new C2736l(c15578l, obj4, i2), c6956l), c6956l, 6);
                c6956l.startapp(false);
            }
            c6956l.startapp(false);
            c6956l.startapp(z);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4810l(c15851l, interfaceC17242l, c15578l, i, 24);
        }
    }

    public static final C0274l mopub(int i, boolean z) {
        C4776l c4776lSubs = AbstractC0532l.subs(300, 2, AbstractC5341l.yandex);
        C3006l c3006l = new C3006l(16, new C15760l(i, 3, z));
        C0010l c0010l = AbstractC4523l.yandex;
        return new C0274l(new C3313l((C4610l) null, new C5487l(c3006l, c4776lSubs), (C15457l) null, (C11700l) null, (LinkedHashMap) null, 125)).yandex(AbstractC4523l.billing(new C4776l(105, 0, AbstractC5341l.crashlytics), 2));
    }

    public static C10405l purchase(int i, boolean z) {
        return new C10405l(billing(i, z), mopub(i, z));
    }

    public static C2201l subs(List list, AbstractC10794l abstractC10794l, InterfaceC8371l interfaceC8371l, ArrayList arrayList) {
        if (abstractC10794l == null) {
            yandex(1);
            throw null;
        }
        if (interfaceC8371l == null) {
            yandex(2);
            throw null;
        }
        if (arrayList == null) {
            yandex(3);
            throw null;
        }
        C2201l c2201lIsPro = isPro(list, abstractC10794l, interfaceC8371l, arrayList, null);
        if (c2201lIsPro != null) {
            return c2201lIsPro;
        }
        C8339l.subs("Substitution failed");
        return null;
    }

    public static /* synthetic */ void yandex(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 4 ? 3 : 2];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i == 4) {
            throw new IllegalStateException(str2);
        }
    }
}
