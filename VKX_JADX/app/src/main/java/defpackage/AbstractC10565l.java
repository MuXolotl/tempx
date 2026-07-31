package defpackage;

import android.graphics.Color;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَؙۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10565l {
    public static final C4954l admob(C6084l c6084l) {
        return (C4954l) AbstractC11048l.amazon(c6084l.startapp, C4954l.billing);
    }

    public static final Type amazon(InterfaceC7763l interfaceC7763l) {
        Type[] lowerBounds;
        if (interfaceC7763l.firebase()) {
            Object objM4212class = AbstractC16901l.m4212class(interfaceC7763l.isPro().yandex());
            ParameterizedType parameterizedType = objM4212class instanceof ParameterizedType ? (ParameterizedType) objM4212class : null;
            if (AbstractC8576l.yandex(parameterizedType != null ? parameterizedType.getRawType() : null, InterfaceC14029l.class)) {
                Object objM2401default = AbstractC8669l.m2401default(parameterizedType.getActualTypeArguments());
                WildcardType wildcardType = objM2401default instanceof WildcardType ? (WildcardType) objM2401default : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    return (Type) AbstractC8669l.m2409native(lowerBounds);
                }
            }
        }
        return null;
    }

    public static final C5243l billing(C4675l c4675l) {
        return (C5243l) AbstractC11048l.amazon(c4675l.billing, C5243l.loadAd);
    }

    public static final void crashlytics(InterfaceC17477l interfaceC17477l, LinkedHashSet linkedHashSet, InterfaceC7637l interfaceC7637l, boolean z) {
        for (InterfaceC8371l interfaceC8371l : AbstractC6968l.loadAd(interfaceC7637l, C18186l.metrica, 2)) {
            if (interfaceC8371l instanceof InterfaceC17477l) {
                InterfaceC17477l interfaceC17477lM2677l = (InterfaceC17477l) interfaceC8371l;
                if (interfaceC17477lM2677l.mo750case()) {
                    InterfaceC15234l interfaceC15234lPurchase = interfaceC7637l.purchase(interfaceC17477lM2677l.getName(), EnumC11300l.f22779l);
                    interfaceC17477lM2677l = interfaceC15234lPurchase instanceof InterfaceC17477l ? (InterfaceC17477l) interfaceC15234lPurchase : interfaceC15234lPurchase instanceof C9522l ? ((C9522l) interfaceC15234lPurchase).m2677l() : null;
                }
                if (interfaceC17477lM2677l != null) {
                    int i = AbstractC11125l.yandex;
                    Iterator it = interfaceC17477lM2677l.metrica().yandex().iterator();
                    while (it.hasNext()) {
                        if (AbstractC11125l.vip((AbstractC18041l) it.next(), interfaceC17477l.mo864l())) {
                            linkedHashSet.add(interfaceC17477lM2677l);
                            break;
                        }
                    }
                    if (z) {
                        crashlytics(interfaceC17477l, linkedHashSet, interfaceC17477lM2677l.mo2893l(), z);
                    }
                }
            }
        }
    }

    public static final C3797l isPro(InterfaceC7763l interfaceC7763l, String str) {
        C18595l c18595lRemoteconfig = AbstractC5592l.remoteconfig(str);
        ArrayList arrayList = (ArrayList) c18595lRemoteconfig.f36317l;
        boolean zYandex = AbstractC8576l.yandex(AbstractC16901l.m4212class(arrayList), "Lkotlin/jvm/internal/DefaultConstructorMarker;");
        int size = AbstractC0825l.mopub(interfaceC7763l).size() + (zYandex ? 1 : 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(AbstractC16901l.m4247try(arrayList, arrayList.size() - size));
        for (C8195l c8195l : AbstractC16901l.m4226l(AbstractC16901l.m4209break(size, arrayList), AbstractC0825l.mopub(interfaceC7763l))) {
            AbstractC9707l abstractC9707l = (AbstractC9707l) c8195l.f17098l;
            String str2 = (String) c8195l.f17097l;
            if ((abstractC9707l instanceof AbstractC9707l) && abstractC9707l.remoteconfig() && AbstractC5592l.mopub(abstractC9707l.mo1109synchronized())) {
                Iterator it = AbstractC17587l.isPro(AbstractC17587l.remoteconfig(abstractC9707l.mo1109synchronized(), C12844l.f25272l), 1).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (AbstractC5592l.subs((InterfaceC13012l) it.next())) {
                            linkedHashSet.add(Integer.valueOf(arrayList2.size()));
                            arrayList2.add("L" + ((C5160l) ((InterfaceC1388l) abstractC9707l.mo1109synchronized().mo1616package())).f11212l.getName().replace('.', '/') + ';');
                            break;
                        }
                    }
                }
            }
            arrayList2.add(str2);
        }
        if (zYandex) {
            arrayList2.add("Lkotlin/jvm/internal/DefaultConstructorMarker;");
        }
        int i = 16;
        return linkedHashSet.isEmpty() ? new C3797l(str, C5746l.f12138l, i) : new C3797l(AbstractC16901l.m4210case(arrayList2, "", "(", ")", null, 56).concat((String) c18595lRemoteconfig.f36316l), linkedHashSet, i);
    }

    public static final long loadAd() {
        C13660l c13660l = AbstractC6145l.amazon;
        AbstractC8502l abstractC8502l = AbstractC4777l.f9804l;
        return AbstractC12953l.loadAd(Color.parseColor(((C9894l) c13660l.mopub(Integer.valueOf(AbstractC4777l.f9804l.isPro(c13660l.purchase)))).crashlytics));
    }

    public static final C8726l mopub(C4454l c4454l) {
        return (C8726l) AbstractC11048l.amazon(c4454l.smaato, C8726l.loadAd);
    }

    public static final C2937l purchase(C9095l c9095l) {
        return (C2937l) AbstractC11048l.amazon(c9095l.subscription, C2937l.crashlytics);
    }

    public static final InterfaceC17242l subs(InterfaceC5793l interfaceC5793l, C5138l c5138l, EnumC7283l enumC7283l) {
        return new C12890l(interfaceC5793l, c5138l, enumC7283l);
    }

    public static final void yandex(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-46556467);
        int i2 = 1;
        if (c6956l2.m2127for(i & 1, (i & 3) != 2)) {
            Object objM2132native = c6956l2.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC8020l.smaato(new C17941l());
                c6956l2.m2147try(objM2132native);
            }
            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
            InterfaceC14029l interfaceC14029l = null;
            C4776l c4776lSubs = AbstractC0532l.subs(4000, 6, null);
            long j = ((C17941l) interfaceC8714l.getValue()).yandex;
            Object objM2132native2 = c6956l2.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = new C17330l(16, interfaceC8714l);
                c6956l2.m2147try(objM2132native2);
            }
            InterfaceC12244l interfaceC12244lYandex = AbstractC0703l.yandex(j, c4776lSubs, null, (Function1) objM2132native2, c6956l2, 3120, 4);
            InterfaceC12244l interfaceC12244lYandex2 = AbstractC0703l.yandex(((C17941l) interfaceC8714l.getValue()).loadAd, c4776lSubs, null, null, c6956l, 48, 12);
            c6956l2 = c6956l;
            InterfaceC12244l interfaceC12244lYandex3 = AbstractC0703l.yandex(((C17941l) interfaceC8714l.getValue()).crashlytics, c4776lSubs, null, null, c6956l2, 48, 12);
            Unit unit = Unit.INSTANCE;
            Object objM2132native3 = c6956l2.m2132native();
            if (objM2132native3 == c13863l) {
                objM2132native3 = new C3917l(interfaceC8714l, interfaceC14029l, i2);
                c6956l2.m2147try(objM2132native3);
            }
            AbstractC12311l.amazon(c6956l2, unit, (Function2) objM2132native3);
            boolean zBilling = c6956l2.billing(interfaceC12244lYandex) | c6956l2.billing(interfaceC12244lYandex2) | c6956l2.billing(interfaceC12244lYandex3);
            Object objM2132native4 = c6956l2.m2132native();
            if (zBilling || objM2132native4 == c13863l) {
                objM2132native4 = new C6411l(interfaceC12244lYandex, (Object) interfaceC12244lYandex2, interfaceC12244lYandex3, 20);
                c6956l2.m2147try(objM2132native4);
            }
            AbstractC9334l.yandex(c6956l2, AbstractC14289l.firebase(interfaceC17242l, (Function1) objM2132native4));
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C11003l(interfaceC17242l, i, 2);
        }
    }
}
