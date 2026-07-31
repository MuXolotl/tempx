package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٓٞ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14312l {
    public static final ArrayList admob(Annotation[] annotationArr) {
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new C8673l(annotation));
        }
        return arrayList;
    }

    public static Object amazon(C7644l c7644l, String str, int i, Long l, C11355l c11355l) {
        C9793l c9793l = EnumC17226l.Companion;
        C17464l c17464l = new C17464l("audio.search", C13772l.f26884l);
        c17464l.yandex("q", str);
        c17464l.loadAd(AbstractC8576l.billing(120, new C8934l(0, 300, 1)), "count");
        c17464l.loadAd(i, "offset");
        c17464l.crashlytics(l.longValue(), "owner_id");
        c17464l.yandex("filter", "all");
        return c7644l.billing(c17464l, c11355l);
    }

    public static final Object billing(C7644l c7644l, int i, long j, String str, String str2, Boolean bool, C15417l c15417l) {
        C17464l c17464l = new C17464l("audio.editPlaylist", C6928l.f14512l);
        c17464l.loadAd(i, "playlist_id");
        c17464l.crashlytics(j, "owner_id");
        c17464l.yandex("title", str);
        c17464l.yandex("description", str2);
        c17464l.amazon("no_discover", bool.booleanValue());
        return c7644l.billing(c17464l, c15417l);
    }

    public static Object crashlytics(C7644l c7644l, Integer num, Long l, List list, AbstractC0283l abstractC0283l, int i) {
        if ((i & 128) != 0) {
            list = null;
        }
        List list2 = list;
        C17464l c17464l = new C17464l("audio.getPlaylists", C8565l.f17665l);
        c17464l.crashlytics(l.longValue(), "owner_id");
        if (list2 != null) {
            c17464l.yandex("filters", AbstractC16901l.m4210case(list2, ",", null, null, null, 62));
        }
        c17464l.loadAd(100, "count");
        c17464l.loadAd(num.intValue(), "offset");
        return c7644l.billing(c17464l, abstractC0283l);
    }

    public static final Object firebase(C7644l c7644l, int i, long j, List list, AbstractC5563l abstractC5563l) {
        C17464l c17464l = new C17464l("audio.reorderInPlaylist", C17334l.f33655l);
        c17464l.loadAd(i, "playlist_id");
        c17464l.crashlytics(j, "owner_id");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C16832l c16832l = (C16832l) it.next();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(AbstractC8358l.yandex(Long.valueOf(c16832l.loadAd)));
            arrayList2.add(AbstractC8358l.yandex(Integer.valueOf(c16832l.yandex)));
            arrayList2.add(AbstractC8358l.yandex(Integer.valueOf(c16832l.crashlytics)));
            Unit unit = Unit.INSTANCE;
            arrayList.add(new C18427l(arrayList2));
        }
        C18427l c18427l = new C18427l(arrayList);
        C15913l c15913l = AbstractC8237l.amazon;
        c15913l.getClass();
        c17464l.yandex("actions", c15913l.crashlytics(C18427l.Companion.serializer(), c18427l));
        return c7644l.billing(c17464l, abstractC5563l);
    }

    public static final InterfaceC17242l isPro(InterfaceC17242l interfaceC17242l, String str) {
        return interfaceC17242l.premium(new C6722l(str));
    }

    public static Object loadAd(C7644l c7644l, int i, int i2, Long l, Integer num, AbstractC0283l abstractC0283l, int i3) {
        if ((i3 & 16) != 0) {
            num = null;
        }
        C17464l c17464l = new C17464l("audio.get", C7472l.f15467l);
        c17464l.loadAd(i2, "count");
        c17464l.loadAd(i, "offset");
        c17464l.crashlytics(l.longValue(), "owner_id");
        if (num != null) {
            c17464l.loadAd(num.intValue(), "playlist_id");
        }
        return c7644l.billing(c17464l, abstractC0283l);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:13:0x002c A[RETURN] */
    public static final C8673l mopub(Annotation[] annotationArr, C2312l c2312l) {
        for (Annotation annotation : annotationArr) {
            if (AbstractC8576l.yandex(AbstractC1845l.yandex(((InterfaceC13937l) AbstractC16131l.billing(annotation)).mo1730private()).yandex(), c2312l)) {
                if (annotation != null) {
                    return new C8673l(annotation);
                }
                return null;
            }
        }
        annotation = null;
        if (annotation != null) {
            return new C8673l(annotation);
        }
        return null;
    }

    public static Object purchase(C7644l c7644l, String str, int i, Long l, List list, C1509l c1509l) {
        C17464l c17464l = new C17464l("audio.searchPlaylists", C14823l.f29007l);
        c17464l.yandex("q", str);
        c17464l.loadAd(100, "count");
        c17464l.loadAd(i, "offset");
        c17464l.crashlytics(l.longValue(), "owner_id");
        c17464l.yandex("filters", AbstractC16901l.m4210case(list, ",", null, null, null, 62));
        return c7644l.billing(c17464l, c1509l);
    }

    public static final String smaato(Object obj) {
        return AbstractC9361l.pro(obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName(), "@", String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1)));
    }

    public static final Object subs(InterfaceC6357l interfaceC6357l) {
        Object objSignature = interfaceC6357l.Signature();
        C6414l c6414l = objSignature instanceof C6414l ? (C6414l) objSignature : null;
        if (c6414l != null) {
            return c6414l.f13396l;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:59:0x0215  */
    /* JADX WARN: Code duplicated, block: B:61:0x0227  */
    /* JADX WARN: Code duplicated, block: B:68:0x0264  */
    public static final void yandex(InterfaceC17242l interfaceC17242l, C12818l c12818l, boolean z, Function1 function1, C6956l c6956l, int i) {
        Object obj;
        C4346l c4346l;
        boolean z2;
        boolean zBilling;
        boolean z3;
        Object obj2;
        boolean zBilling2;
        Object obj3;
        c6956l.m2133new(-867447767);
        if (((i | (c6956l.billing(c12818l) ? 32 : 16) | (c6956l.billing(function1) ? 2048 : 1024)) & 5851) == 1170 && c6956l.isVip()) {
            c6956l.m2124else();
        } else {
            c6956l.m2141switch();
            if ((i & 1) != 0 && !c6956l.ad()) {
                c6956l.m2124else();
            }
            c6956l.adcel();
            Object[] objArr = new Object[0];
            C13645l c13645l = C12818l.purchase;
            c6956l.m2125final(1157296644);
            boolean zBilling3 = c6956l.billing(c12818l);
            Object objM2132native = c6956l.m2132native();
            Object obj4 = C1867l.yandex;
            Object obj5 = objM2132native;
            if (zBilling3 || objM2132native == obj4) {
                Object c11029l = new C11029l(4, c12818l);
                c6956l.m2147try(c11029l);
                obj5 = c11029l;
            }
            c6956l.startapp(false);
            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) AbstractC0825l.isPro(Arrays.copyOf(objArr, 0), new C13645l(new C4951l(27, c13645l), new C16931l(9, c13645l), 13), (Function0) obj5, c6956l, 0);
            c6956l.m2125final(693286680);
            C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36044l, c6956l, 0);
            c6956l.m2125final(-1323940314);
            AbstractC5189l abstractC5189l = AbstractC4751l.admob;
            InterfaceC13490l interfaceC13490l = (InterfaceC13490l) c6956l.isPro(abstractC5189l);
            AbstractC5189l abstractC5189l2 = AbstractC4751l.vip;
            EnumC9931l enumC9931l = (EnumC9931l) c6956l.isPro(abstractC5189l2);
            AbstractC5189l abstractC5189l3 = AbstractC4751l.tapsense;
            InterfaceC3114l interfaceC3114l = (InterfaceC3114l) c6956l.isPro(abstractC5189l3);
            InterfaceC8801l.firebase.getClass();
            Function0 function0 = C3438l.loadAd;
            C15578l c15578l = new C15578l(-2123382363, true, new C2892l(2, interfaceC17242l));
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(function0);
            } else {
                c6956l.m2136protected();
            }
            c6956l.advert = false;
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
            C6415l c6415l2 = C3438l.purchase;
            AbstractC8182l.billing(c6956l, interfaceC13490l, c6415l2);
            C6415l c6415l3 = C3438l.admob;
            AbstractC8182l.billing(c6956l, enumC9931l, c6415l3);
            C6415l c6415l4 = C3438l.subs;
            AbstractC8182l.billing(c6956l, interfaceC3114l, c6415l4);
            c6956l.advert = c6956l.isVip >= 0;
            c15578l.invoke(new C1393l(c6956l), c6956l, 0);
            c6956l.m2125final(2058660585);
            c6956l.m2125final(-678309503);
            InterfaceC8714l interfaceC8714lVip = AbstractC8020l.vip(function1, c6956l);
            C9247l c9247l = new C9247l(0.8f, true);
            c6956l.m2125final(-483455358);
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l, 0);
            c6956l.m2125final(-1323940314);
            InterfaceC13490l interfaceC13490l2 = (InterfaceC13490l) c6956l.isPro(abstractC5189l);
            EnumC9931l enumC9931l2 = (EnumC9931l) c6956l.isPro(abstractC5189l2);
            InterfaceC3114l interfaceC3114l2 = (InterfaceC3114l) c6956l.isPro(abstractC5189l3);
            C15578l c15578l2 = new C15578l(-2123382363, true, new C2892l(2, c9247l));
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(function0);
            } else {
                c6956l.m2136protected();
            }
            c6956l.advert = false;
            AbstractC8182l.billing(c6956l, c1853lYandex, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC13490l2, c6415l2);
            AbstractC8182l.billing(c6956l, enumC9931l2, c6415l3);
            AbstractC8182l.billing(c6956l, interfaceC3114l2, c6415l4);
            c6956l.advert = c6956l.isVip >= 0;
            c15578l2.invoke(new C1393l(c6956l), c6956l, 0);
            c6956l.m2125final(2058660585);
            c6956l.m2125final(-1163856341);
            C9247l c9247l2 = new C9247l(0.8f, true);
            C12818l c12818l2 = (C12818l) interfaceC8714l.getValue();
            c6956l.m2125final(511388516);
            boolean zBilling4 = c6956l.billing(interfaceC8714l) | c6956l.billing(interfaceC8714lVip);
            Object objM2132native2 = c6956l.m2132native();
            if (zBilling4) {
                obj = obj4;
            } else {
                obj = obj4;
                if (objM2132native2 == obj) {
                }
                obj = objM2132native2;
                c6956l.startapp(false);
                AbstractC2219l.yandex(c9247l2, c12818l2, (Function2) obj, c6956l, 0);
                c6956l.m2125final(726414550);
                c4346l = C4346l.f8873l;
                if (z) {
                    AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 8.0f));
                    InterfaceC17242l interfaceC17242lPurchase = AbstractC0080l.purchase(c4346l, 32.0f);
                    C12818l c12818l3 = (C12818l) interfaceC8714l.getValue();
                    c6956l.m2125final(511388516);
                    zBilling2 = c6956l.billing(interfaceC8714l) | c6956l.billing(interfaceC8714lVip);
                    Object objM2132native3 = c6956l.m2132native();
                    if (!zBilling2 || objM2132native3 == obj) {
                        z2 = false;
                        Object c2655l = new C2655l(interfaceC8714l, interfaceC8714lVip, false ? 1 : 0);
                        c6956l.m2147try(c2655l);
                        obj3 = c2655l;
                    } else {
                        z2 = false;
                        obj3 = objM2132native3;
                    }
                    c6956l.startapp(z2);
                    AbstractC1295l.yandex(interfaceC17242lPurchase, c12818l3, (Function1) obj3, c6956l, 6);
                } else {
                    z2 = false;
                }
                c6956l.startapp(z2);
                c6956l.startapp(z2);
                c6956l.startapp(z2);
                c6956l.startapp(true);
                c6956l.startapp(z2);
                c6956l.startapp(z2);
                AbstractC9334l.yandex(c6956l, AbstractC0080l.vip(c4346l, 8.0f));
                InterfaceC17242l interfaceC17242lVip = AbstractC0080l.vip(c4346l, 32.0f);
                C12818l c12818l4 = (C12818l) interfaceC8714l.getValue();
                c6956l.m2125final(511388516);
                zBilling = c6956l.billing(interfaceC8714l) | c6956l.billing(interfaceC8714lVip);
                Object objM2132native4 = c6956l.m2132native();
                if (!zBilling || objM2132native4 == obj) {
                    z3 = true;
                    Object c2655l2 = new C2655l(interfaceC8714l, interfaceC8714lVip, true ? 1 : 0);
                    c6956l.m2147try(c2655l2);
                    obj2 = c2655l2;
                } else {
                    z3 = true;
                    obj2 = objM2132native4;
                }
                c6956l.startapp(false);
                AbstractC15269l.yandex(interfaceC17242lVip, c12818l4, (Function1) obj2, c6956l, 6);
                c6956l.startapp(false);
                c6956l.startapp(false);
                c6956l.startapp(z3);
                c6956l.startapp(false);
                c6956l.startapp(false);
            }
            obj = objM2132native2;
            Object c17671l = new C17671l(interfaceC8714l, interfaceC8714lVip, 1);
            c6956l.m2147try(c17671l);
            Object obj6 = c17671l;
            obj6 = objM2132native2;
            c6956l.startapp(false);
            AbstractC2219l.yandex(c9247l2, c12818l2, (Function2) obj6, c6956l, 0);
            c6956l.m2125final(726414550);
            c4346l = C4346l.f8873l;
            if (z) {
                AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 8.0f));
                InterfaceC17242l interfaceC17242lPurchase2 = AbstractC0080l.purchase(c4346l, 32.0f);
                C12818l c12818l5 = (C12818l) interfaceC8714l.getValue();
                c6956l.m2125final(511388516);
                zBilling2 = c6956l.billing(interfaceC8714l) | c6956l.billing(interfaceC8714lVip);
                Object objM2132native5 = c6956l.m2132native();
                if (zBilling2) {
                    z2 = false;
                    Object c2655l3 = new C2655l(interfaceC8714l, interfaceC8714lVip, false ? 1 : 0);
                    c6956l.m2147try(c2655l3);
                    obj3 = c2655l3;
                } else {
                    z2 = false;
                    Object c2655l4 = new C2655l(interfaceC8714l, interfaceC8714lVip, false ? 1 : 0);
                    c6956l.m2147try(c2655l4);
                    obj3 = c2655l4;
                }
                c6956l.startapp(z2);
                AbstractC1295l.yandex(interfaceC17242lPurchase2, c12818l5, (Function1) obj3, c6956l, 6);
            } else {
                z2 = false;
            }
            c6956l.startapp(z2);
            c6956l.startapp(z2);
            c6956l.startapp(z2);
            c6956l.startapp(true);
            c6956l.startapp(z2);
            c6956l.startapp(z2);
            AbstractC9334l.yandex(c6956l, AbstractC0080l.vip(c4346l, 8.0f));
            InterfaceC17242l interfaceC17242lVip2 = AbstractC0080l.vip(c4346l, 32.0f);
            C12818l c12818l6 = (C12818l) interfaceC8714l.getValue();
            c6956l.m2125final(511388516);
            zBilling = c6956l.billing(interfaceC8714l) | c6956l.billing(interfaceC8714lVip);
            Object objM2132native6 = c6956l.m2132native();
            if (zBilling) {
                z3 = true;
                Object c2655l5 = new C2655l(interfaceC8714l, interfaceC8714lVip, true ? 1 : 0);
                c6956l.m2147try(c2655l5);
                obj2 = c2655l5;
            } else {
                z3 = true;
                Object c2655l6 = new C2655l(interfaceC8714l, interfaceC8714lVip, true ? 1 : 0);
                c6956l.m2147try(c2655l6);
                obj2 = c2655l6;
            }
            c6956l.startapp(false);
            AbstractC15269l.yandex(interfaceC17242lVip2, c12818l6, (Function1) obj2, c6956l, 6);
            c6956l.startapp(false);
            c6956l.startapp(false);
            c6956l.startapp(z3);
            c6956l.startapp(false);
            c6956l.startapp(false);
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds == null) {
            return;
        }
        c4224lAds.amazon = new C17791l(interfaceC17242l, c12818l, z, function1, i);
    }
}
