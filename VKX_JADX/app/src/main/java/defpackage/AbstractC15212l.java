package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٔ۟ۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15212l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29809l = 5;

    public static void amazon(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4652l c4652l = (C4652l) it.next();
            C15188l c15188l = new C15188l(c4652l);
            for (C12638l c12638l : c4652l.loadAd) {
                boolean z = c4652l.purchase == 0;
                C5432l c5432l = new C5432l(c12638l, !z);
                if (!map.containsKey(c5432l)) {
                    map.put(c5432l, new HashSet());
                }
                Set set = (Set) map.get(c5432l);
                if (!set.isEmpty() && z) {
                    C10754l.startapp(c12638l, ".", "Multiple components provide ");
                    return;
                }
                set.add(c15188l);
            }
        }
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            for (C15188l c15188l2 : (Set) it2.next()) {
                for (C12186l c12186l : c15188l2.yandex.crashlytics) {
                    if (c12186l.crashlytics == 0) {
                        Set<C15188l> set2 = (Set) map.get(new C5432l(c12186l.yandex, c12186l.loadAd == 2));
                        if (set2 != null) {
                            for (C15188l c15188l3 : set2) {
                                c15188l2.loadAd.add(c15188l3);
                                c15188l3.crashlytics.add(c15188l2);
                            }
                        }
                    }
                }
            }
        }
        HashSet<C15188l> hashSet = new HashSet();
        Iterator it3 = map.values().iterator();
        while (it3.hasNext()) {
            hashSet.addAll((Set) it3.next());
        }
        HashSet hashSet2 = new HashSet();
        for (C15188l c15188l4 : hashSet) {
            if (c15188l4.crashlytics.isEmpty()) {
                hashSet2.add(c15188l4);
            }
        }
        int i = 0;
        while (!hashSet2.isEmpty()) {
            C15188l c15188l5 = (C15188l) hashSet2.iterator().next();
            hashSet2.remove(c15188l5);
            i++;
            for (C15188l c15188l6 : c15188l5.loadAd) {
                c15188l6.crashlytics.remove(c15188l5);
                if (c15188l6.crashlytics.isEmpty()) {
                    hashSet2.add(c15188l6);
                }
            }
        }
        if (i == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (C15188l c15188l7 : hashSet) {
            if (!c15188l7.crashlytics.isEmpty() && !c15188l7.loadAd.isEmpty()) {
                arrayList2.add(c15188l7.yandex);
            }
        }
        throw new C17071l("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()), 2, (byte) 0);
    }

    public static final Object crashlytics(C9385l c9385l, InterfaceC16588l interfaceC16588l, String str) {
        int length = str.length();
        if (length % 2 != 0) {
            C8339l.metrica("HexBinary string must be even length");
            return null;
        }
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            int iFirebase = AbstractC12311l.firebase(str.charAt(i));
            int i2 = i + 1;
            int iFirebase2 = AbstractC12311l.firebase(str.charAt(i2));
            if (iFirebase == -1 || iFirebase2 == -1) {
                throw new IllegalArgumentException(("Invalid hex chars: " + str.charAt(i) + str.charAt(i2)).toString());
            }
            bArr[i / 2] = (byte) ((iFirebase << 4) + iFirebase2);
        }
        return c9385l.yandex(interfaceC16588l, bArr);
    }

    public static final void loadAd(final C12324l c12324l, final C15578l c15578l, InterfaceC17242l interfaceC17242l, final boolean z, final boolean z2, boolean z3, Function1 function1, C15578l c15578l2, C6956l c6956l, final int i) {
        final C15578l c15578l3;
        final InterfaceC17242l interfaceC17242l2;
        final boolean z4;
        final Function1 function2;
        boolean z5;
        C16290l c16290lYandex;
        Function1 function3;
        C15389l c15389l = c12324l.yandex;
        c6956l.m2133new(503624135);
        int i2 = i | (c6956l.admob(c12324l) ? 4 : 2) | 384 | (c6956l.mopub(z2) ? 16384 : 8192) | 1769472;
        if (c6956l.m2127for(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = new C1698l(26);
                c6956l.m2147try(objM2132native);
            }
            Function1 function4 = (Function1) objM2132native;
            boolean z6 = ((EnumC16440l) ((C10086l) c15389l.amazon).getValue()) == EnumC16440l.f32143l;
            if (c12324l.loadAd != null) {
                c6956l.m2123default(-1348484770);
                C4776l c4776l = AbstractC2124l.yandex;
                boolean z7 = z6;
                C15389l c15389l2 = c12324l.yandex;
                Function1 function5 = c12324l.loadAd;
                if (function5 == null) {
                    function5 = null;
                }
                z5 = z7;
                c16290lYandex = AbstractC2124l.yandex(c15389l2, function5, null, c6956l, AbstractC2124l.crashlytics << 9, 4);
                c6956l.startapp(false);
            } else {
                z5 = z6;
                c6956l.m2123default(1146846870);
                c6956l.startapp(false);
                c16290lYandex = null;
            }
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lCrashlytics = AbstractC12019l.crashlytics(c4346l, c15389l, EnumC7283l.f15125l, z5, c16290lYandex);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, true);
            long j = c6956l.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lCrashlytics);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
            InterfaceC17242l interfaceC17242lLoadAd = C16170l.yandex.loadAd();
            C0086l c0086l = C18450l.f36044l;
            C1083l c1083l = AbstractC8313l.yandex;
            C5062l c5062lYandex = AbstractC7001l.yandex(c1083l, c0086l, c6956l, 0);
            long j2 = c6956l.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lLoadAd);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i4, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            C18295l c18295l = C18295l.yandex;
            c15578l.invoke(c18295l, c6956l, 54);
            c6956l.startapp(true);
            boolean zAdmob = ((i2 & 57344) == 16384) | c6956l.admob(c12324l);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob || objM2132native2 == c13863l) {
                objM2132native2 = new C0802l(1, c12324l, z, z2);
                c6956l.m2147try(objM2132native2);
            }
            C8650l c8650l = new C8650l(c15389l, (Function2) objM2132native2);
            C5062l c5062lYandex2 = AbstractC7001l.yandex(c1083l, c0086l, c6956l, 0);
            long j3 = c6956l.f14595continue;
            int i5 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato3 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l, c8650l);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex2, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato3, c6415l2);
            AbstractC11043l.isPro(i5, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling3, c6415l4);
            c15578l3 = c15578l2;
            c15578l3.invoke(c18295l, c6956l, 54);
            c6956l.startapp(true);
            c6956l.startapp(true);
            EnumC16440l enumC16440l = (EnumC16440l) ((C10086l) c15389l.amazon).getValue();
            boolean zAdmob2 = c6956l.admob(c12324l);
            Object objM2132native3 = c6956l.m2132native();
            if (zAdmob2 || objM2132native3 == c13863l) {
                function3 = function4;
                objM2132native3 = new C7864l(c12324l, function3, (InterfaceC14029l) null, 24);
                c6956l.m2147try(objM2132native3);
            } else {
                function3 = function4;
            }
            AbstractC12311l.purchase(enumC16440l, function3, (Function2) objM2132native3, c6956l);
            interfaceC17242l2 = c4346l;
            z4 = true;
            function2 = function3;
        } else {
            c15578l3 = c15578l2;
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
            z4 = z3;
            function2 = function1;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(c15578l, interfaceC17242l2, z, z2, z4, function2, c15578l3, i) { // from class: lٓۥۢ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC17242l f28482l;

                /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                public final /* synthetic */ Function1 f28483l;

                /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
                public final /* synthetic */ C15578l f28484l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ C15578l f28485l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ boolean f28487l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ boolean f28488l;

                /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                public final /* synthetic */ boolean f28489l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(12586033);
                    AbstractC15212l.loadAd(this.f28486l, this.f28485l, this.f28482l, this.f28488l, this.f28487l, this.f28489l, this.f28483l, this.f28484l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final C13645l purchase(Function1 function1, Function2 function2) {
        C13393l c13393l = new C13393l(function2, 8, (byte) 0);
        AbstractC9464l.purchase(1, function1);
        return new C13645l(c13393l, function1, 13);
    }

    public String toString() {
        switch (this.f29809l) {
            case 5:
                return ((ScheduledFutureC11166l) this).f22454l.toString();
            default:
                return super.toString();
        }
    }
}
