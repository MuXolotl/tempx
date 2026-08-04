package defpackage;

import android.content.SharedPreferences;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import kotlin.Unit;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lْٗ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13434l implements InterfaceC1246l {
    public static final ArrayList amazon;
    public static final C5991l billing;
    public static final C4910l crashlytics;
    public static final List mopub;
    public static final C11362l purchase;
    public static final /* synthetic */ InterfaceC13922l[] loadAd = {AbstractC18202l.yandex.billing(new C0114l(C13434l.class, "lastSelected", "getLastSelected()Ljava/lang/String;", 0))};
    public static final C13434l yandex = new C13434l();

    static {
        Math.log10(220.0d);
        Math.log10(20000.0d);
        crashlytics = AbstractC8618l.yandex();
        amazon = new ArrayList();
        purchase = new C11362l();
        SharedPreferences sharedPreferences = AbstractC3957l.purchase;
        if (sharedPreferences == null) {
            sharedPreferences = null;
        }
        billing = new C5991l(sharedPreferences, "eq2_last_selected", "flat", 7);
        mopub = AbstractC14055l.remoteconfig(50, 100, 200, 400, 800, 1000, 2500, 5000, 15000);
    }

    public static Object crashlytics(AbstractC5563l abstractC5563l) throws Throwable {
        C16552l c16552l = AbstractC11463l.yandex;
        Object objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C2051l(2, null, 16), abstractC5563l);
        return objFirebase == EnumC9342l.f19165l ? objFirebase : Unit.INSTANCE;
    }

    public static C11359l loadAd(C11359l c11359l) {
        return C11359l.yandex(c11359l, UUID.randomUUID().toString(), AbstractC0653l.ads(new StringBuilder(), c11359l.loadAd, " 2"), 24);
    }

    public static Object purchase(C11359l c11359l, AbstractC5563l abstractC5563l) throws Throwable {
        C11362l c11362l = purchase;
        ListIterator listIterator = c11362l.listIterator();
        int i = 0;
        while (true) {
            C13376l c13376l = (C13376l) listIterator;
            if (!c13376l.hasNext()) {
                i = -1;
                break;
            }
            if (AbstractC8576l.yandex(((C11359l) c13376l.next()).yandex, c11359l.yandex)) {
                break;
            }
            i++;
        }
        Integer num = new Integer(i);
        if (num.intValue() < 0) {
            num = null;
        }
        if (num != null) {
            c11362l.set(num.intValue(), c11359l);
        } else {
            c11362l.add(c11359l);
        }
        Object objCrashlytics = crashlytics(abstractC5563l);
        return objCrashlytics == EnumC9342l.f19165l ? objCrashlytics : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object amazon(AbstractC0283l abstractC0283l) throws Throwable {
        C6920l c6920l;
        if (abstractC0283l instanceof C6920l) {
            c6920l = (C6920l) abstractC0283l;
            int i = c6920l.f14492l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c6920l.f14492l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c6920l = new C6920l(this, abstractC0283l);
            }
        } else {
            c6920l = new C6920l(this, abstractC0283l);
        }
        Object obj = c6920l.f14491l;
        int i2 = c6920l.f14492l;
        Object obj2 = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c6920l.f14492l = 1;
            Object objYandex = yandex(c6920l);
            Object obj3 = EnumC9342l.f19165l;
            if (objYandex == obj3) {
                return obj3;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        for (Object obj4 : AbstractC16901l.m4232new(amazon, purchase)) {
            String str = ((C11359l) obj4).yandex;
            C13434l c13434l = yandex;
            c13434l.getClass();
            InterfaceC13922l interfaceC13922l = loadAd[0];
            if (AbstractC8576l.yandex(str, (String) billing.advert(c13434l))) {
                obj2 = obj4;
                break;
            }
        }
        C11359l c11359l = (C11359l) obj2;
        if (c11359l != null) {
            return c11359l;
        }
        C11359l.Companion.getClass();
        return C11359l.mopub;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00da  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:54:0x011c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yandex(AbstractC0283l abstractC0283l) throws Throwable {
        C6126l c6126l;
        InterfaceC1601l interfaceC1601l;
        int i;
        InterfaceC1601l interfaceC1601l2;
        Throwable th;
        InterfaceC1601l interfaceC1601l3;
        List list;
        int i2;
        int i3;
        InterfaceC1601l interfaceC1601l4;
        List list2;
        C11362l c11362l;
        VKXApplication vKXApplication;
        Object objFirebase;
        C11362l c11362l2;
        if (abstractC0283l instanceof C6126l) {
            c6126l = (C6126l) abstractC0283l;
            int i4 = c6126l.f12912l;
            if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c6126l.f12912l = i4 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c6126l = new C6126l(this, abstractC0283l);
            }
        } else {
            c6126l = new C6126l(this, abstractC0283l);
        }
        Object objFirebase2 = c6126l.f12911l;
        int i5 = c6126l.f12912l;
        ArrayList arrayList = amazon;
        int i6 = 0;
        C13434l c13434l = yandex;
        InterfaceC14029l interfaceC14029l = null;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            if (i5 == 0) {
                AbstractC2829l.crashlytics(objFirebase2);
                interfaceC1601l = crashlytics;
                c6126l.f12914l = interfaceC1601l;
                c6126l.f12916l = 0;
                c6126l.f12912l = 1;
                if (interfaceC1601l.yandex(c6126l) != enumC9342l) {
                    i = 0;
                }
                return enumC9342l;
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c11362l2 = (C11362l) c6126l.f12913l;
                        interfaceC1601l2 = c6126l.f12914l;
                        try {
                            AbstractC2829l.crashlytics(objFirebase2);
                            c11362l2.addAll((Collection) objFirebase2);
                            Unit unit = Unit.INSTANCE;
                            interfaceC1601l2.billing(null);
                            return unit;
                        } catch (Throwable th2) {
                            th = th2;
                            interfaceC1601l2.billing(null);
                            throw th;
                        }
                    }
                    i3 = c6126l.f12910l;
                    int i7 = c6126l.f12916l;
                    List list3 = (List) c6126l.f12913l;
                    interfaceC1601l4 = c6126l.f12914l;
                    try {
                        AbstractC2829l.crashlytics(objFirebase2);
                        i2 = i7;
                        list2 = list3;
                        list2.addAll((Collection) objFirebase2);
                        c11362l = purchase;
                        c11362l.clear();
                        c13434l.getClass();
                        String str = C14025l.f27330l;
                        vKXApplication = VKXApplication.f36631l;
                        if (vKXApplication == null) {
                            vKXApplication = null;
                        }
                        C14025l c14025lPurchase = C6162l.ads(vKXApplication.getFilesDir()).purchase("vkx_eq_custom.json");
                        c6126l.f12914l = interfaceC1601l4;
                        c6126l.f12913l = c11362l;
                        c6126l.f12916l = i2;
                        c6126l.f12910l = i3;
                        c6126l.f12912l = 4;
                        C16552l c16552l = AbstractC11463l.yandex;
                        objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C4781l(c14025lPurchase, interfaceC14029l, 5), c6126l);
                        if (objFirebase != enumC9342l) {
                            c11362l2 = c11362l;
                            objFirebase2 = objFirebase;
                            interfaceC1601l2 = interfaceC1601l4;
                            c11362l2.addAll((Collection) objFirebase2);
                            Unit unit2 = Unit.INSTANCE;
                            interfaceC1601l2.billing(null);
                            return unit2;
                        }
                        return enumC9342l;
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC1601l2 = interfaceC1601l4;
                        interfaceC1601l2.billing(null);
                        throw th;
                    }
                }
                i6 = c6126l.f12910l;
                i = c6126l.f12916l;
                List list4 = (List) c6126l.f12913l;
                interfaceC1601l3 = c6126l.f12914l;
                try {
                    AbstractC2829l.crashlytics(objFirebase2);
                    list = list4;
                    list.addAll((Collection) objFirebase2);
                    c6126l.f12914l = interfaceC1601l3;
                    c6126l.f12913l = arrayList;
                    c6126l.f12916l = i;
                    c6126l.f12910l = i6;
                    c6126l.f12912l = 3;
                    c13434l.getClass();
                    C16552l c16552l2 = AbstractC11463l.yandex;
                    objFirebase2 = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C16402l(2, null), c6126l);
                    if (objFirebase2 != enumC9342l) {
                        int i8 = i6;
                        i2 = i;
                        i3 = i8;
                        interfaceC1601l4 = interfaceC1601l3;
                        list2 = arrayList;
                        list2.addAll((Collection) objFirebase2);
                        c11362l = purchase;
                        c11362l.clear();
                        c13434l.getClass();
                        String str2 = C14025l.f27330l;
                        vKXApplication = VKXApplication.f36631l;
                        if (vKXApplication == null) {
                            vKXApplication = null;
                        }
                        C14025l c14025lPurchase2 = C6162l.ads(vKXApplication.getFilesDir()).purchase("vkx_eq_custom.json");
                        c6126l.f12914l = interfaceC1601l4;
                        c6126l.f12913l = c11362l;
                        c6126l.f12916l = i2;
                        c6126l.f12910l = i3;
                        c6126l.f12912l = 4;
                        C16552l c16552l3 = AbstractC11463l.yandex;
                        objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C4781l(c14025lPurchase2, interfaceC14029l, 5), c6126l);
                        if (objFirebase != enumC9342l) {
                            c11362l2 = c11362l;
                            objFirebase2 = objFirebase;
                            interfaceC1601l2 = interfaceC1601l4;
                            c11362l2.addAll((Collection) objFirebase2);
                            Unit unit3 = Unit.INSTANCE;
                            interfaceC1601l2.billing(null);
                            return unit3;
                        }
                    }
                    return enumC9342l;
                } catch (Throwable th4) {
                    th = th4;
                    interfaceC1601l2 = interfaceC1601l3;
                    interfaceC1601l2.billing(null);
                    throw th;
                }
            }
            i = c6126l.f12916l;
            InterfaceC1601l interfaceC1601l5 = c6126l.f12914l;
            AbstractC2829l.crashlytics(objFirebase2);
            interfaceC1601l = interfaceC1601l5;
            if (arrayList.isEmpty()) {
                arrayList.clear();
                c6126l.f12914l = interfaceC1601l;
                c6126l.f12913l = arrayList;
                c6126l.f12916l = i;
                c6126l.f12910l = 0;
                c6126l.f12912l = 2;
                c13434l.getClass();
                C16552l c16552l4 = AbstractC11463l.yandex;
                Object objFirebase3 = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C6613l(2, null), c6126l);
                if (objFirebase3 != enumC9342l) {
                    interfaceC1601l3 = interfaceC1601l;
                    objFirebase2 = objFirebase3;
                    list = arrayList;
                    list.addAll((Collection) objFirebase2);
                    c6126l.f12914l = interfaceC1601l3;
                    c6126l.f12913l = arrayList;
                    c6126l.f12916l = i;
                    c6126l.f12910l = i6;
                    c6126l.f12912l = 3;
                    c13434l.getClass();
                    C16552l c16552l5 = AbstractC11463l.yandex;
                    objFirebase2 = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C16402l(2, null), c6126l);
                    if (objFirebase2 != enumC9342l) {
                        int i9 = i6;
                        i2 = i;
                        i3 = i9;
                        interfaceC1601l4 = interfaceC1601l3;
                        list2 = arrayList;
                        list2.addAll((Collection) objFirebase2);
                        c11362l = purchase;
                        c11362l.clear();
                        c13434l.getClass();
                        String str3 = C14025l.f27330l;
                        vKXApplication = VKXApplication.f36631l;
                        if (vKXApplication == null) {
                            vKXApplication = null;
                        }
                        C14025l c14025lPurchase3 = C6162l.ads(vKXApplication.getFilesDir()).purchase("vkx_eq_custom.json");
                        c6126l.f12914l = interfaceC1601l4;
                        c6126l.f12913l = c11362l;
                        c6126l.f12916l = i2;
                        c6126l.f12910l = i3;
                        c6126l.f12912l = 4;
                        C16552l c16552l6 = AbstractC11463l.yandex;
                        objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C4781l(c14025lPurchase3, interfaceC14029l, 5), c6126l);
                        if (objFirebase != enumC9342l) {
                            c11362l2 = c11362l;
                            objFirebase2 = objFirebase;
                            interfaceC1601l2 = interfaceC1601l4;
                            c11362l2.addAll((Collection) objFirebase2);
                        }
                    }
                }
                return enumC9342l;
            }
            interfaceC1601l2 = interfaceC1601l;
            Unit unit4 = Unit.INSTANCE;
            interfaceC1601l2.billing(null);
            return unit4;
        } catch (Throwable th5) {
            interfaceC1601l2 = interfaceC1601l;
            th = th5;
            interfaceC1601l2.billing(null);
            throw th;
        }
    }
}
