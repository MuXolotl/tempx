package defpackage;

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lؔٛۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2749l {
    public static final C0847l yandex = new C0847l();
    public static final C0847l loadAd = new C0847l();
    public static final C0847l crashlytics = new C0847l();
    public static final C0847l amazon = new C0847l();
    public static final C0847l purchase = new C0847l();
    public static final C0847l billing = new C0847l();
    public static final C0847l mopub = new C0847l();
    public static final C0847l admob = new C0847l();

    public static final C6561l amazon(EnumC3338l enumC3338l) {
        switch (enumC3338l == null ? -1 : AbstractC1603l.loadAd[enumC3338l.ordinal()]) {
            case 1:
                return AbstractC6004l.amazon;
            case 2:
                return AbstractC6004l.yandex;
            case 3:
                return AbstractC6004l.loadAd;
            case 4:
                return AbstractC6004l.crashlytics;
            case 5:
                return AbstractC6004l.purchase;
            case 6:
                return AbstractC6004l.billing;
            default:
                return AbstractC6004l.yandex;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    public static final AbstractC18041l billing(AbstractC18041l abstractC18041l, ArrayList arrayList) {
        C10636l c10636l;
        abstractC18041l.inmobi().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C8922l c8922l = (C8922l) it.next();
            c8922l.getClass();
            AbstractC18041l abstractC18041l2 = c8922l.crashlytics;
            AbstractC18041l abstractC18041l3 = c8922l.loadAd;
            InterfaceC16902l interfaceC16902l = c8922l.yandex;
            InterfaceC17975l.yandex.loadAd(abstractC18041l3, abstractC18041l2);
            if (AbstractC8576l.yandex(abstractC18041l3, abstractC18041l2)) {
                c10636l = new C10636l(abstractC18041l3);
            } else {
                if (interfaceC16902l.mo2182l() == 2) {
                    c10636l = new C10636l(abstractC18041l3);
                } else {
                    if (AbstractC16860l.inmobi(abstractC18041l3) && interfaceC16902l.mo2182l() != 2) {
                        c10636l = new C10636l(3 != interfaceC16902l.mo2182l() ? 3 : 1, abstractC18041l2);
                    } else {
                        if (abstractC18041l2 == null) {
                            AbstractC16860l.yandex(140);
                            throw null;
                        }
                        if (AbstractC16860l.ad(abstractC18041l2) && abstractC18041l2.mo1342throw()) {
                            c10636l = new C10636l(2 == interfaceC16902l.mo2182l() ? 1 : 2, abstractC18041l3);
                        } else {
                            c10636l = new C10636l(3 != interfaceC16902l.mo2182l() ? 3 : 1, abstractC18041l2);
                        }
                    }
                }
            }
            arrayList2.add(c10636l);
        }
        return AbstractC6419l.firebase(abstractC18041l, arrayList2, null, 6);
    }

    public static final String crashlytics(InterfaceC1925l interfaceC1925l) {
        StringBuilder sb = new StringBuilder();
        sb.append("type: " + interfaceC1925l);
        sb.append('\n');
        sb.append("hashCode: " + interfaceC1925l.hashCode());
        sb.append('\n');
        sb.append("javaClass: " + interfaceC1925l.getClass().getCanonicalName());
        sb.append('\n');
        for (InterfaceC8371l interfaceC8371lPro = interfaceC1925l.pro(); interfaceC8371lPro != null; interfaceC8371lPro = interfaceC8371lPro.Signature()) {
            sb.append("fqName: ".concat(C10822l.crashlytics.license(interfaceC8371lPro)));
            sb.append('\n');
            sb.append("javaClass: " + interfaceC8371lPro.getClass().getCanonicalName());
            sb.append('\n');
        }
        return sb.toString();
    }

    public static InputConnection loadAd(InputConnection inputConnection, EditorInfo editorInfo, InterfaceC9481l interfaceC9481l) {
        AbstractC5646l.metrica(editorInfo, "editorInfo must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new C7781l(inputConnection, interfaceC9481l);
        }
        return AbstractC0170l.crashlytics(editorInfo).length == 0 ? inputConnection : new C8545l(inputConnection, interfaceC9481l);
    }

    public static final int purchase(EnumC4439l enumC4439l) {
        int i = enumC4439l == null ? -1 : AbstractC1603l.yandex[enumC4439l.ordinal()];
        if (i != 1) {
            int i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                    }
                }
            }
            return i2;
        }
        return 1;
    }

    public static final C9811l yandex(AbstractC18041l abstractC18041l) {
        C8922l c8922l;
        C8922l c8922l2;
        if (abstractC18041l.mo3847class() instanceof AbstractC4317l) {
            C9811l c9811lYandex = yandex(AbstractC16570l.billing(abstractC18041l));
            C9811l c9811lYandex2 = yandex(AbstractC16570l.mopub(abstractC18041l));
            return new C9811l(AbstractC5170l.purchase(AbstractC3605l.subs(AbstractC16570l.billing((AbstractC18041l) c9811lYandex.yandex), AbstractC16570l.mopub((AbstractC18041l) c9811lYandex2.yandex)), AbstractC5170l.amazon(abstractC18041l)), AbstractC5170l.purchase(AbstractC3605l.subs(AbstractC16570l.billing((AbstractC18041l) c9811lYandex.loadAd), AbstractC16570l.mopub((AbstractC18041l) c9811lYandex2.loadAd)), AbstractC5170l.amazon(abstractC18041l)));
        }
        InterfaceC1925l interfaceC1925lMo1339native = abstractC18041l.mo1339native();
        boolean z = true;
        if (abstractC18041l.mo1339native() instanceof InterfaceC5291l) {
            AbstractC4946l abstractC4946lMo1127synchronized = ((InterfaceC5291l) interfaceC1925lMo1339native).mo1127synchronized();
            AbstractC18041l abstractC18041lAdmob = AbstractC12008l.admob(abstractC4946lMo1127synchronized.loadAd(), abstractC18041l.mo1342throw());
            int iInmobi = AbstractC5020l.inmobi(abstractC4946lMo1127synchronized.yandex());
            if (iInmobi == 1) {
                return new C9811l(abstractC18041lAdmob, AbstractC12300l.billing(abstractC18041l).metrica());
            }
            if (iInmobi == 2) {
                return new C9811l(AbstractC12008l.admob(AbstractC12300l.billing(abstractC18041l).vip(), abstractC18041l.mo1342throw()), abstractC18041lAdmob);
            }
            C11983l.firebase(abstractC4946lMo1127synchronized, "Only nontrivial projections should have been captured, not: ");
            return null;
        }
        if (abstractC18041l.inmobi().isEmpty() || abstractC18041l.inmobi().size() != interfaceC1925lMo1339native.getParameters().size()) {
            return new C9811l(abstractC18041l, abstractC18041l);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C8195l c8195l : AbstractC16901l.m4226l(interfaceC1925lMo1339native.getParameters(), abstractC18041l.inmobi())) {
            AbstractC4946l abstractC4946l = (AbstractC4946l) c8195l.f17098l;
            InterfaceC16902l interfaceC16902l = (InterfaceC16902l) c8195l.f17097l;
            int iMo2182l = interfaceC16902l.mo2182l();
            if (iMo2182l == 0) {
                C2201l.yandex(35);
                throw null;
            }
            if (abstractC4946l == null) {
                C2201l.yandex(36);
                throw null;
            }
            C2201l c2201l = C2201l.loadAd;
            int iInmobi2 = AbstractC5020l.inmobi(abstractC4946l.crashlytics() ? 3 : C2201l.loadAd(iMo2182l, abstractC4946l.yandex()));
            if (iInmobi2 == 0) {
                c8922l2 = new C8922l(interfaceC16902l, abstractC4946l.loadAd(), abstractC4946l.loadAd());
            } else if (iInmobi2 == 1) {
                c8922l2 = new C8922l(interfaceC16902l, abstractC4946l.loadAd(), AbstractC3759l.purchase(interfaceC16902l).metrica());
            } else {
                if (iInmobi2 != 2) {
                    C18725l.billing();
                    return null;
                }
                c8922l2 = new C8922l(interfaceC16902l, AbstractC3759l.purchase(interfaceC16902l).vip(), abstractC4946l.loadAd());
            }
            if (abstractC4946l.crashlytics()) {
                arrayList.add(c8922l2);
                arrayList2.add(c8922l2);
            } else {
                C9811l c9811lYandex3 = yandex(c8922l2.loadAd);
                AbstractC18041l abstractC18041l2 = (AbstractC18041l) c9811lYandex3.yandex;
                AbstractC18041l abstractC18041l3 = (AbstractC18041l) c9811lYandex3.loadAd;
                C9811l c9811lYandex4 = yandex(c8922l2.crashlytics);
                AbstractC18041l abstractC18041l4 = (AbstractC18041l) c9811lYandex4.yandex;
                AbstractC18041l abstractC18041l5 = (AbstractC18041l) c9811lYandex4.loadAd;
                InterfaceC16902l interfaceC16902l2 = c8922l2.yandex;
                C8922l c8922l3 = new C8922l(interfaceC16902l2, abstractC18041l3, abstractC18041l4);
                C8922l c8922l4 = new C8922l(interfaceC16902l2, abstractC18041l2, abstractC18041l5);
                arrayList.add(c8922l3);
                arrayList2.add(c8922l4);
            }
        }
        if (arrayList.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            c8922l = (C8922l) it.next();
            c8922l.getClass();
        } while (InterfaceC17975l.yandex.loadAd(c8922l.loadAd, c8922l.crashlytics));
        return new C9811l(z ? AbstractC12300l.billing(abstractC18041l).vip() : billing(abstractC18041l, arrayList), billing(abstractC18041l, arrayList2));
    }
}
