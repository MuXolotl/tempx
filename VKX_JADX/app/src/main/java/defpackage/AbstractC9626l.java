package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lٍ٘ٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9626l {
    public static final C8565l yandex;

    static {
        int i = AbstractC5004l.yandex;
        yandex = new C8565l(17);
    }

    public static int Signature(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C12405l)) {
            int iLoadAd = 0;
            while (i < size) {
                iLoadAd += AbstractC10908l.loadAd(((Integer) list.get(i)).intValue());
                i++;
            }
            return iLoadAd;
        }
        C12405l c12405l = (C12405l) list;
        int iLoadAd2 = 0;
        while (i < size) {
            iLoadAd2 += AbstractC10908l.loadAd(c12405l.mopub(i));
            i++;
        }
        return iLoadAd2;
    }

    public static int ad(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C12405l)) {
            int iYandex = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iYandex += AbstractC10908l.yandex((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iYandex;
        }
        C12405l c12405l = (C12405l) list;
        int iYandex2 = 0;
        while (i < size) {
            int iMopub = c12405l.mopub(i);
            iYandex2 += AbstractC10908l.yandex((iMopub >> 31) ^ (iMopub + iMopub));
            i++;
        }
        return iYandex2;
    }

    public static void adcel(int i, List list, C15714l c15714l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC10908l abstractC10908l = (AbstractC10908l) c15714l.f30857l;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC10908l.isPro(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        abstractC10908l.amazon(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        abstractC10908l.ads(i3);
        while (i2 < list.size()) {
            abstractC10908l.startapp(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void admob(int i, List list, C15714l c15714l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC10908l abstractC10908l = (AbstractC10908l) c15714l.f30857l;
        int i2 = 0;
        if (!(list instanceof C6514l)) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    abstractC10908l.admob(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            abstractC10908l.amazon(i, 2);
            int iLoadAd = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iLoadAd += AbstractC10908l.loadAd((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            abstractC10908l.ads(iLoadAd);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                abstractC10908l.tapsense((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        C6514l c6514l = (C6514l) list;
        if (!z) {
            while (i2 < c6514l.f13585l) {
                long jBilling = c6514l.billing(i2);
                abstractC10908l.admob(i, (jBilling >> 63) ^ (jBilling + jBilling));
                i2++;
            }
            return;
        }
        abstractC10908l.amazon(i, 2);
        int iLoadAd2 = 0;
        for (int i4 = 0; i4 < c6514l.f13585l; i4++) {
            long jBilling2 = c6514l.billing(i4);
            iLoadAd2 += AbstractC10908l.loadAd((jBilling2 >> 63) ^ (jBilling2 + jBilling2));
        }
        abstractC10908l.ads(iLoadAd2);
        while (i2 < c6514l.f13585l) {
            long jBilling3 = c6514l.billing(i2);
            abstractC10908l.tapsense((jBilling3 >> 63) ^ (jBilling3 + jBilling3));
            i2++;
        }
    }

    public static int ads(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C6514l)) {
            int iLoadAd = 0;
            while (i < size) {
                iLoadAd += AbstractC10908l.loadAd(((Long) list.get(i)).longValue());
                i++;
            }
            return iLoadAd;
        }
        C6514l c6514l = (C6514l) list;
        int iLoadAd2 = 0;
        while (i < size) {
            iLoadAd2 += AbstractC10908l.loadAd(c6514l.billing(i));
            i++;
        }
        return iLoadAd2;
    }

    public static int advert(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC10908l.yandex(i << 3) + 4) * size;
    }

    public static void amazon(int i, List list, C15714l c15714l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC10908l abstractC10908l = (AbstractC10908l) c15714l.f30857l;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC10908l.subs(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        abstractC10908l.amazon(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        abstractC10908l.ads(i3);
        while (i2 < list.size()) {
            abstractC10908l.Signature(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void billing(int i, List list, C15714l c15714l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC10908l abstractC10908l = (AbstractC10908l) c15714l.f30857l;
        int i2 = 0;
        if (!(list instanceof C6514l)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC10908l.admob(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC10908l.amazon(i, 2);
            int iLoadAd = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iLoadAd += AbstractC10908l.loadAd(((Long) list.get(i3)).longValue());
            }
            abstractC10908l.ads(iLoadAd);
            while (i2 < list.size()) {
                abstractC10908l.tapsense(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C6514l c6514l = (C6514l) list;
        if (!z) {
            while (i2 < c6514l.f13585l) {
                abstractC10908l.admob(i, c6514l.billing(i2));
                i2++;
            }
            return;
        }
        abstractC10908l.amazon(i, 2);
        int iLoadAd2 = 0;
        for (int i4 = 0; i4 < c6514l.f13585l; i4++) {
            iLoadAd2 += AbstractC10908l.loadAd(c6514l.billing(i4));
        }
        abstractC10908l.ads(iLoadAd2);
        while (i2 < c6514l.f13585l) {
            abstractC10908l.tapsense(c6514l.billing(i2));
            i2++;
        }
    }

    public static Object crashlytics(Object obj, int i, InterfaceC9971l interfaceC9971l, C1037l c1037l, Object obj2, C8565l c8565l) {
        if (c1037l == null) {
            return obj2;
        }
        if (!AbstractC2812l.advert(interfaceC9971l)) {
            Iterator it = interfaceC9971l.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!c1037l.yandex(iIntValue)) {
                    if (obj2 == null) {
                        c8565l.getClass();
                        obj2 = C8565l.signatures(obj);
                    }
                    c8565l.getClass();
                    ((C10096l) obj2).amazon(i << 3, Long.valueOf(iIntValue));
                    it.remove();
                }
            }
            return obj2;
        }
        int size = interfaceC9971l.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) interfaceC9971l.get(i3);
            int iIntValue2 = num.intValue();
            if (c1037l.yandex(iIntValue2)) {
                if (i3 != i2) {
                    interfaceC9971l.set(i2, num);
                }
                i2++;
            } else {
                if (obj2 == null) {
                    c8565l.getClass();
                    obj2 = C8565l.signatures(obj);
                }
                c8565l.getClass();
                ((C10096l) obj2).amazon(i << 3, Long.valueOf(iIntValue2));
            }
        }
        if (i2 != size) {
            interfaceC9971l.subList(i2, size).clear();
        }
        return obj2;
    }

    public static void firebase(int i, List list, C15714l c15714l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC10908l abstractC10908l = (AbstractC10908l) c15714l.f30857l;
        int i2 = 0;
        if (!(list instanceof C12405l)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC10908l.purchase(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC10908l.amazon(i, 2);
            int iLoadAd = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iLoadAd += AbstractC10908l.loadAd(((Integer) list.get(i3)).intValue());
            }
            abstractC10908l.ads(iLoadAd);
            while (i2 < list.size()) {
                abstractC10908l.adcel(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C12405l c12405l = (C12405l) list;
        if (!z) {
            while (i2 < c12405l.f24500l) {
                abstractC10908l.purchase(i, c12405l.mopub(i2));
                i2++;
            }
            return;
        }
        abstractC10908l.amazon(i, 2);
        int iLoadAd2 = 0;
        for (int i4 = 0; i4 < c12405l.f24500l; i4++) {
            iLoadAd2 += AbstractC10908l.loadAd(c12405l.mopub(i4));
        }
        abstractC10908l.ads(iLoadAd2);
        while (i2 < c12405l.f24500l) {
            abstractC10908l.adcel(c12405l.mopub(i2));
            i2++;
        }
    }

    public static void isPro(int i, List list, C15714l c15714l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC10908l abstractC10908l = (AbstractC10908l) c15714l.f30857l;
        int i2 = 0;
        if (!(list instanceof C6514l)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC10908l.subs(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC10908l.amazon(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            abstractC10908l.ads(i3);
            while (i2 < list.size()) {
                abstractC10908l.Signature(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C6514l c6514l = (C6514l) list;
        if (!z) {
            while (i2 < c6514l.f13585l) {
                abstractC10908l.subs(i, c6514l.billing(i2));
                i2++;
            }
            return;
        }
        abstractC10908l.amazon(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c6514l.f13585l; i6++) {
            c6514l.billing(i6);
            i5 += 8;
        }
        abstractC10908l.ads(i5);
        while (i2 < c6514l.f13585l) {
            abstractC10908l.Signature(c6514l.billing(i2));
            i2++;
        }
    }

    public static int isVip(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC10908l.yandex(i << 3) + 8) * size;
    }

    public static int license(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C12405l)) {
            int iLoadAd = 0;
            while (i < size) {
                iLoadAd += AbstractC10908l.loadAd(((Integer) list.get(i)).intValue());
                i++;
            }
            return iLoadAd;
        }
        C12405l c12405l = (C12405l) list;
        int iLoadAd2 = 0;
        while (i < size) {
            iLoadAd2 += AbstractC10908l.loadAd(c12405l.mopub(i));
            i++;
        }
        return iLoadAd2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void loadAd(Object obj, Object obj2) {
        AbstractC0288l abstractC0288l = (AbstractC0288l) obj;
        C10096l c10096l = abstractC0288l.zzc;
        C10096l c10096l2 = ((AbstractC0288l) obj2).zzc;
        C10096l c10096l3 = C10096l.billing;
        if (!c10096l3.equals(c10096l2)) {
            if (c10096l3.equals(c10096l)) {
                int i = c10096l.yandex + c10096l2.yandex;
                int[] iArrCopyOf = Arrays.copyOf(c10096l.loadAd, i);
                System.arraycopy(c10096l2.loadAd, 0, iArrCopyOf, c10096l.yandex, c10096l2.yandex);
                Object[] objArrCopyOf = Arrays.copyOf(c10096l.crashlytics, i);
                System.arraycopy(c10096l2.crashlytics, 0, objArrCopyOf, c10096l.yandex, c10096l2.yandex);
                c10096l = new C10096l(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                c10096l.getClass();
                if (!c10096l2.equals(c10096l3)) {
                    if (!c10096l.purchase) {
                        C3010l.mopub();
                        return;
                    }
                    int i2 = c10096l.yandex + c10096l2.yandex;
                    c10096l.purchase(i2);
                    System.arraycopy(c10096l2.loadAd, 0, c10096l.loadAd, c10096l.yandex, c10096l2.yandex);
                    System.arraycopy(c10096l2.crashlytics, 0, c10096l.crashlytics, c10096l.yandex, c10096l2.yandex);
                    c10096l.yandex = i2;
                }
            }
        }
        abstractC0288l.zzc = c10096l;
    }

    public static void metrica(int i, List list, C15714l c15714l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC10908l abstractC10908l = (AbstractC10908l) c15714l.f30857l;
        int i2 = 0;
        if (!(list instanceof C12405l)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC10908l.mopub(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC10908l.amazon(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            abstractC10908l.ads(i3);
            while (i2 < list.size()) {
                abstractC10908l.subscription(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C12405l c12405l = (C12405l) list;
        if (!z) {
            while (i2 < c12405l.f24500l) {
                abstractC10908l.mopub(i, c12405l.mopub(i2));
                i2++;
            }
            return;
        }
        abstractC10908l.amazon(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c12405l.f24500l; i6++) {
            c12405l.mopub(i6);
            i5 += 4;
        }
        abstractC10908l.ads(i5);
        while (i2 < c12405l.f24500l) {
            abstractC10908l.subscription(c12405l.mopub(i2));
            i2++;
        }
    }

    public static void mopub(int i, List list, C15714l c15714l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC10908l abstractC10908l = (AbstractC10908l) c15714l.f30857l;
        int i2 = 0;
        if (!(list instanceof C6514l)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC10908l.admob(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC10908l.amazon(i, 2);
            int iLoadAd = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iLoadAd += AbstractC10908l.loadAd(((Long) list.get(i3)).longValue());
            }
            abstractC10908l.ads(iLoadAd);
            while (i2 < list.size()) {
                abstractC10908l.tapsense(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C6514l c6514l = (C6514l) list;
        if (!z) {
            while (i2 < c6514l.f13585l) {
                abstractC10908l.admob(i, c6514l.billing(i2));
                i2++;
            }
            return;
        }
        abstractC10908l.amazon(i, 2);
        int iLoadAd2 = 0;
        for (int i4 = 0; i4 < c6514l.f13585l; i4++) {
            iLoadAd2 += AbstractC10908l.loadAd(c6514l.billing(i4));
        }
        abstractC10908l.ads(iLoadAd2);
        while (i2 < c6514l.f13585l) {
            abstractC10908l.tapsense(c6514l.billing(i2));
            i2++;
        }
    }

    public static int pro(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C12405l)) {
            int iYandex = 0;
            while (i < size) {
                iYandex += AbstractC10908l.yandex(((Integer) list.get(i)).intValue());
                i++;
            }
            return iYandex;
        }
        C12405l c12405l = (C12405l) list;
        int iYandex2 = 0;
        while (i < size) {
            iYandex2 += AbstractC10908l.yandex(c12405l.mopub(i));
            i++;
        }
        return iYandex2;
    }

    public static void purchase(int i, List list, C15714l c15714l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC10908l abstractC10908l = (AbstractC10908l) c15714l.f30857l;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC10908l.mopub(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        abstractC10908l.amazon(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        abstractC10908l.ads(i3);
        while (i2 < list.size()) {
            abstractC10908l.subscription(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void remoteconfig(int i, List list, C15714l c15714l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC10908l abstractC10908l = (AbstractC10908l) c15714l.f30857l;
        int i2 = 0;
        if (!(list instanceof C12405l)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    abstractC10908l.billing(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            abstractC10908l.amazon(i, 2);
            int iYandex = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iYandex += AbstractC10908l.yandex((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            abstractC10908l.ads(iYandex);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                abstractC10908l.ads((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        C12405l c12405l = (C12405l) list;
        if (!z) {
            while (i2 < c12405l.f24500l) {
                int iMopub = c12405l.mopub(i2);
                abstractC10908l.billing(i, (iMopub >> 31) ^ (iMopub + iMopub));
                i2++;
            }
            return;
        }
        abstractC10908l.amazon(i, 2);
        int iYandex2 = 0;
        for (int i4 = 0; i4 < c12405l.f24500l; i4++) {
            int iMopub2 = c12405l.mopub(i4);
            iYandex2 += AbstractC10908l.yandex((iMopub2 >> 31) ^ (iMopub2 + iMopub2));
        }
        abstractC10908l.ads(iYandex2);
        while (i2 < c12405l.f24500l) {
            int iMopub3 = c12405l.mopub(i2);
            abstractC10908l.ads((iMopub3 >> 31) ^ (iMopub3 + iMopub3));
            i2++;
        }
    }

    public static void smaato(int i, List list, C15714l c15714l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC10908l abstractC10908l = (AbstractC10908l) c15714l.f30857l;
        int i2 = 0;
        if (!(list instanceof C12405l)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC10908l.billing(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC10908l.amazon(i, 2);
            int iYandex = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iYandex += AbstractC10908l.yandex(((Integer) list.get(i3)).intValue());
            }
            abstractC10908l.ads(iYandex);
            while (i2 < list.size()) {
                abstractC10908l.ads(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C12405l c12405l = (C12405l) list;
        if (!z) {
            while (i2 < c12405l.f24500l) {
                abstractC10908l.billing(i, c12405l.mopub(i2));
                i2++;
            }
            return;
        }
        abstractC10908l.amazon(i, 2);
        int iYandex2 = 0;
        for (int i4 = 0; i4 < c12405l.f24500l; i4++) {
            iYandex2 += AbstractC10908l.yandex(c12405l.mopub(i4));
        }
        abstractC10908l.ads(iYandex2);
        while (i2 < c12405l.f24500l) {
            abstractC10908l.ads(c12405l.mopub(i2));
            i2++;
        }
    }

    public static void startapp(int i, List list, C15714l c15714l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC10908l abstractC10908l = (AbstractC10908l) c15714l.f30857l;
        int i2 = 0;
        if (!(list instanceof C12405l)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC10908l.purchase(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC10908l.amazon(i, 2);
            int iLoadAd = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iLoadAd += AbstractC10908l.loadAd(((Integer) list.get(i3)).intValue());
            }
            abstractC10908l.ads(iLoadAd);
            while (i2 < list.size()) {
                abstractC10908l.adcel(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C12405l c12405l = (C12405l) list;
        if (!z) {
            while (i2 < c12405l.f24500l) {
                abstractC10908l.purchase(i, c12405l.mopub(i2));
                i2++;
            }
            return;
        }
        abstractC10908l.amazon(i, 2);
        int iLoadAd2 = 0;
        for (int i4 = 0; i4 < c12405l.f24500l; i4++) {
            iLoadAd2 += AbstractC10908l.loadAd(c12405l.mopub(i4));
        }
        abstractC10908l.ads(iLoadAd2);
        while (i2 < c12405l.f24500l) {
            abstractC10908l.adcel(c12405l.mopub(i2));
            i2++;
        }
    }

    public static void subs(int i, List list, C15714l c15714l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC10908l abstractC10908l = (AbstractC10908l) c15714l.f30857l;
        int i2 = 0;
        if (!(list instanceof C6514l)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC10908l.subs(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC10908l.amazon(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            abstractC10908l.ads(i3);
            while (i2 < list.size()) {
                abstractC10908l.Signature(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C6514l c6514l = (C6514l) list;
        if (!z) {
            while (i2 < c6514l.f13585l) {
                abstractC10908l.subs(i, c6514l.billing(i2));
                i2++;
            }
            return;
        }
        abstractC10908l.amazon(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c6514l.f13585l; i6++) {
            c6514l.billing(i6);
            i5 += 8;
        }
        abstractC10908l.ads(i5);
        while (i2 < c6514l.f13585l) {
            abstractC10908l.Signature(c6514l.billing(i2));
            i2++;
        }
    }

    public static int subscription(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C6514l)) {
            int iLoadAd = 0;
            while (i < size) {
                iLoadAd += AbstractC10908l.loadAd(((Long) list.get(i)).longValue());
                i++;
            }
            return iLoadAd;
        }
        C6514l c6514l = (C6514l) list;
        int iLoadAd2 = 0;
        while (i < size) {
            iLoadAd2 += AbstractC10908l.loadAd(c6514l.billing(i));
            i++;
        }
        return iLoadAd2;
    }

    public static int tapsense(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C6514l)) {
            int iLoadAd = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iLoadAd += AbstractC10908l.loadAd((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iLoadAd;
        }
        C6514l c6514l = (C6514l) list;
        int iLoadAd2 = 0;
        while (i < size) {
            long jBilling = c6514l.billing(i);
            iLoadAd2 += AbstractC10908l.loadAd((jBilling >> 63) ^ (jBilling + jBilling));
            i++;
        }
        return iLoadAd2;
    }

    public static void vip(int i, List list, C15714l c15714l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC10908l abstractC10908l = (AbstractC10908l) c15714l.f30857l;
        int i2 = 0;
        if (!(list instanceof C12405l)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC10908l.mopub(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC10908l.amazon(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            abstractC10908l.ads(i3);
            while (i2 < list.size()) {
                abstractC10908l.subscription(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C12405l c12405l = (C12405l) list;
        if (!z) {
            while (i2 < c12405l.f24500l) {
                abstractC10908l.mopub(i, c12405l.mopub(i2));
                i2++;
            }
            return;
        }
        abstractC10908l.amazon(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c12405l.f24500l; i6++) {
            c12405l.mopub(i6);
            i5 += 4;
        }
        abstractC10908l.ads(i5);
        while (i2 < c12405l.f24500l) {
            abstractC10908l.subscription(c12405l.mopub(i2));
            i2++;
        }
    }

    public static boolean yandex(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
