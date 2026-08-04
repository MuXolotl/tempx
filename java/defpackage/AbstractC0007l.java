package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؑؐٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0007l {
    public static final C11911l yandex;

    static {
        InterfaceC13012l interfaceC13012lYandex;
        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C17535l.class);
        try {
            interfaceC13012lYandex = AbstractC18202l.yandex(C17535l.class);
        } catch (Throwable unused) {
            interfaceC13012lYandex = null;
        }
        yandex = new C11911l("ApplicationPluginRegistry", new C11310l(interfaceC1388lLoadAd, interfaceC13012lYandex));
    }

    public static final Object amazon(AbstractC10598l abstractC10598l, InterfaceC9840l interfaceC9840l, Function1 function1) throws C10756l {
        if (!(abstractC10598l instanceof C2234l) || !(interfaceC9840l instanceof C2177l)) {
            C17535l c17535lCrashlytics = crashlytics(abstractC10598l);
            Object objBilling = c17535lCrashlytics.billing(interfaceC9840l.getKey());
            if (objBilling == null) {
                Object objPurchase = interfaceC9840l.purchase(abstractC10598l, function1);
                c17535lCrashlytics.mopub(interfaceC9840l.getKey(), objPurchase);
                return objPurchase;
            }
            if (objBilling.equals(interfaceC9840l)) {
                return objBilling;
            }
            throw new C10756l(AbstractC2812l.tapsense(new StringBuilder("Please make sure that you use unique name for the plugin and don't install it twice. Conflicting application plugin is already installed with the same key as `"), interfaceC9840l.getKey().yandex, '`'), 5);
        }
        C2234l c2234l = (C2234l) abstractC10598l;
        C2177l c2177l = (C2177l) interfaceC9840l;
        C17535l c17535lCrashlytics2 = crashlytics(c2234l);
        C11911l c11911l = c2177l.f4817l;
        if (c17535lCrashlytics2.billing(c11911l) != null) {
            throw new C10756l("Please make sure that you use unique name for the plugin and don't install it twice. Plugin `" + c11911l.yandex + "` is already installed to the pipeline " + c2234l, 5);
        }
        if (crashlytics(AbstractC5708l.yandex(c2234l)).billing(c11911l) != null) {
            throw new C10756l("Installing RouteScopedPlugin to application and route is not supported. Consider moving application level install to routing root.", 5);
        }
        C2234l c0720l = c2234l instanceof C0720l ? new C0720l(((C0720l) c2234l).f2211l) : new C2234l(c2234l.f4918l, c2234l.f4915l, c2234l.f14098l, c2234l.f14095l);
        Object objPurchase2 = c2177l.purchase(c0720l, function1);
        crashlytics(c2234l).mopub(c11911l, objPurchase2);
        Iterator it = c0720l.f4917l.iterator();
        while (it.hasNext()) {
            loadAd(c2234l, (C2234l) it.next());
        }
        c2234l.remoteconfig(c0720l);
        C8403l c8403l = c2234l.f14097l;
        C8403l c8403l2 = c2234l.f14096l;
        C8403l c8403l3 = c0720l.f14096l;
        c8403l2.remoteconfig(c8403l3);
        C8403l c8403l4 = c0720l.f14097l;
        c8403l.remoteconfig(c8403l4);
        C7472l c7472l = (C7472l) objPurchase2;
        yandex(c2234l, c0720l, c2177l, c7472l);
        yandex(c8403l2, c8403l3, c2177l, c7472l);
        yandex(c8403l, c8403l4, c2177l, c7472l);
        return objPurchase2;
    }

    public static final C17535l crashlytics(AbstractC10598l abstractC10598l) {
        return (C17535l) abstractC10598l.f21511l.yandex(yandex, new C7282l(9));
    }

    public static final void loadAd(C2234l c2234l, C2234l c2234l2) {
        C2234l c2234lStartapp = c2234l.startapp(c2234l2.f4915l);
        Iterator it = c2234l2.f4916l.iterator();
        while (it.hasNext()) {
            c2234lStartapp.f4916l.add((Function2) it.next());
            c2234lStartapp.f4919l = null;
        }
        Iterator it2 = c2234l2.f4917l.iterator();
        while (it2.hasNext()) {
            loadAd(c2234lStartapp, (C2234l) it2.next());
        }
    }

    public static final void yandex(AbstractC10598l abstractC10598l, AbstractC10598l abstractC10598l2, C2177l c2177l, C7472l c7472l) {
        Object next;
        List list;
        ArrayList arrayList = abstractC10598l.f21510l;
        ArrayList<C12222l> arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next2 = it.next();
            C12222l c12222l = next2 instanceof C12222l ? (C12222l) next2 : null;
            if (c12222l == null) {
                C13962l c13962l = next2 instanceof C13962l ? (C13962l) next2 : null;
                c12222l = c13962l != null ? c13962l.yandex : null;
            }
            arrayList2.add(c12222l);
        }
        for (C12222l c12222l2 : arrayList2) {
            ArrayList arrayList3 = abstractC10598l2.f21510l;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : arrayList3) {
                if (obj instanceof C13962l) {
                    arrayList4.add(obj);
                }
            }
            Iterator it2 = arrayList4.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!AbstractC8576l.yandex(((C13962l) next).yandex, c12222l2));
            C13962l c13962l2 = (C13962l) next;
            if (c13962l2 != null) {
                c13962l2.amazon = true;
                list = c13962l2.crashlytics;
            } else {
                list = null;
            }
            if (list == null) {
                list = C2580l.f5619l;
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                abstractC10598l.firebase(c12222l2, new C17206l(c2177l, c7472l, (Function3) it3.next(), null));
            }
        }
    }
}
