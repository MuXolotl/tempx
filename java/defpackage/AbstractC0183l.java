package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: lًًؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0183l {
    public static final C5382l crashlytics;
    public static final C5382l loadAd;
    public static final Class yandex;

    static {
        Class<?> cls;
        Class<?> cls2;
        Class cls3 = AbstractC16910l.yandex;
        C5382l c5382l = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        yandex = cls;
        try {
            Class cls4 = AbstractC16910l.yandex;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                c5382l = (C5382l) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        loadAd = c5382l;
        crashlytics = new C5382l();
    }

    public static void Signature(int i, List list, C7972l c7972l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10107l c10107l = (C10107l) c7972l.f16631l;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c10107l.ads(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c10107l.signatures(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C10107l.billing;
            i3 += 4;
        }
        c10107l.applovin(i3);
        while (i2 < list.size()) {
            c10107l.subscription(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void ad(int i, List list, C7972l c7972l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10107l c10107l = (C10107l) c7972l.f16631l;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                c10107l.appmetrica(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        c10107l.signatures(i, 2);
        int iIsPro = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iIsPro += C10107l.isPro((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c10107l.applovin(iIsPro);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            c10107l.inmobi((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void adcel(int i, List list, C7972l c7972l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10107l c10107l = (C10107l) c7972l.f16631l;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c10107l.tapsense(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c10107l.signatures(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C10107l.billing;
            i3 += 8;
        }
        c10107l.applovin(i3);
        while (i2 < list.size()) {
            c10107l.Signature(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int admob(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iSubs = 0;
        for (int i = 0; i < size; i++) {
            iSubs += C10107l.subs(((Integer) list.get(i)).intValue());
        }
        return iSubs;
    }

    public static void ads(int i, List list, C7972l c7972l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10107l c10107l = (C10107l) c7972l.f16631l;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                c10107l.getClass();
                c10107l.ads(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        c10107l.signatures(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = C10107l.billing;
            i3 += 4;
        }
        c10107l.applovin(i3);
        while (i2 < list.size()) {
            c10107l.subscription(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void advert(int i, List list, C7972l c7972l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10107l c10107l = (C10107l) c7972l.f16631l;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c10107l.premium(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c10107l.signatures(i, 2);
        int iSubs = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iSubs += C10107l.subs(((Integer) list.get(i3)).intValue());
        }
        c10107l.applovin(iSubs);
        while (i2 < list.size()) {
            c10107l.applovin(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static int amazon(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iIsPro = 0;
        for (int i = 0; i < size; i++) {
            iIsPro += C10107l.isPro(((Integer) list.get(i)).intValue());
        }
        return iIsPro;
    }

    public static int billing(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iSubs = 0;
        for (int i = 0; i < size; i++) {
            int iIntValue = ((Integer) list.get(i)).intValue();
            iSubs += C10107l.subs((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iSubs;
    }

    public static int crashlytics(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C10107l.admob(i) + 8) * size;
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
    public static void firebase(C5382l c5382l, Object obj, Object obj2) {
        c5382l.getClass();
        AbstractC8760l abstractC8760l = (AbstractC8760l) obj;
        C0774l c0774l = abstractC8760l.unknownFields;
        C0774l c0774l2 = ((AbstractC8760l) obj2).unknownFields;
        C0774l c0774l3 = C0774l.billing;
        if (!c0774l3.equals(c0774l2)) {
            if (c0774l3.equals(c0774l)) {
                int i = c0774l.yandex + c0774l2.yandex;
                int[] iArrCopyOf = Arrays.copyOf(c0774l.loadAd, i);
                System.arraycopy(c0774l2.loadAd, 0, iArrCopyOf, c0774l.yandex, c0774l2.yandex);
                Object[] objArrCopyOf = Arrays.copyOf(c0774l.crashlytics, i);
                System.arraycopy(c0774l2.crashlytics, 0, objArrCopyOf, c0774l.yandex, c0774l2.yandex);
                c0774l = new C0774l(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                c0774l.getClass();
                if (!c0774l2.equals(c0774l3)) {
                    if (!c0774l.purchase) {
                        C3010l.mopub();
                        return;
                    }
                    int i2 = c0774l.yandex + c0774l2.yandex;
                    c0774l.yandex(i2);
                    System.arraycopy(c0774l2.loadAd, 0, c0774l.loadAd, c0774l.yandex, c0774l2.yandex);
                    System.arraycopy(c0774l2.crashlytics, 0, c0774l.crashlytics, c0774l.yandex, c0774l2.yandex);
                    c0774l.yandex = i2;
                }
            }
        }
        abstractC8760l.unknownFields = c0774l;
    }

    public static void isVip(int i, List list, C7972l c7972l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10107l c10107l = (C10107l) c7972l.f16631l;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c10107l.appmetrica(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c10107l.signatures(i, 2);
        int iIsPro = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iIsPro += C10107l.isPro(((Long) list.get(i3)).longValue());
        }
        c10107l.applovin(iIsPro);
        while (i2 < list.size()) {
            c10107l.inmobi(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void license(int i, List list, C7972l c7972l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10107l c10107l = (C10107l) c7972l.f16631l;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c10107l.tapsense(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c10107l.signatures(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C10107l.billing;
            i3 += 8;
        }
        c10107l.applovin(i3);
        while (i2 < list.size()) {
            c10107l.Signature(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int loadAd(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C10107l.admob(i) + 4) * size;
    }

    public static void metrica(int i, List list, C7972l c7972l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10107l c10107l = (C10107l) c7972l.f16631l;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c10107l.license(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c10107l.signatures(i, 2);
        int iIsPro = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iIsPro += C10107l.isPro(((Integer) list.get(i3)).intValue());
        }
        c10107l.applovin(iIsPro);
        while (i2 < list.size()) {
            c10107l.pro(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static int mopub(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iIsPro = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iIsPro += C10107l.isPro((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iIsPro;
    }

    public static void pro(int i, List list, C7972l c7972l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10107l c10107l = (C10107l) c7972l.f16631l;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c10107l.premium(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        c10107l.signatures(i, 2);
        int iSubs = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iSubs += C10107l.subs((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c10107l.applovin(iSubs);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            c10107l.applovin((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    public static int purchase(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iIsPro = 0;
        for (int i = 0; i < size; i++) {
            iIsPro += C10107l.isPro(((Long) list.get(i)).longValue());
        }
        return iIsPro;
    }

    public static void remoteconfig(int i, List list, C7972l c7972l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10107l c10107l = (C10107l) c7972l.f16631l;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c10107l.metrica(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        c10107l.signatures(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = C10107l.billing;
            i3++;
        }
        c10107l.applovin(i3);
        while (i2 < list.size()) {
            c10107l.remoteconfig(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static boolean smaato(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void startapp(int i, List list, C7972l c7972l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10107l c10107l = (C10107l) c7972l.f16631l;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c10107l.ads(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c10107l.signatures(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C10107l.billing;
            i3 += 4;
        }
        c10107l.applovin(i3);
        while (i2 < list.size()) {
            c10107l.subscription(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static int subs(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iIsPro = 0;
        for (int i = 0; i < size; i++) {
            iIsPro += C10107l.isPro(((Long) list.get(i)).longValue());
        }
        return iIsPro;
    }

    public static void subscription(int i, List list, C7972l c7972l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10107l c10107l = (C10107l) c7972l.f16631l;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c10107l.license(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c10107l.signatures(i, 2);
        int iIsPro = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iIsPro += C10107l.isPro(((Integer) list.get(i3)).intValue());
        }
        c10107l.applovin(iIsPro);
        while (i2 < list.size()) {
            c10107l.pro(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void tapsense(int i, List list, C7972l c7972l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10107l c10107l = (C10107l) c7972l.f16631l;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c10107l.appmetrica(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c10107l.signatures(i, 2);
        int iIsPro = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iIsPro += C10107l.isPro(((Long) list.get(i3)).longValue());
        }
        c10107l.applovin(iIsPro);
        while (i2 < list.size()) {
            c10107l.inmobi(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void vip(int i, List list, C7972l c7972l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10107l c10107l = (C10107l) c7972l.f16631l;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                c10107l.getClass();
                c10107l.tapsense(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        c10107l.signatures(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = C10107l.billing;
            i3 += 8;
        }
        c10107l.applovin(i3);
        while (i2 < list.size()) {
            c10107l.Signature(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static int yandex(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iIsPro = 0;
        for (int i = 0; i < size; i++) {
            iIsPro += C10107l.isPro(((Integer) list.get(i)).intValue());
        }
        return iIsPro;
    }

    public static Object isPro(Object obj, int i, InterfaceC0400l interfaceC0400l, Object obj2, C5382l c5382l) {
        return obj2;
    }
}
