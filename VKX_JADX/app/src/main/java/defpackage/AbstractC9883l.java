package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: lٍۢؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9883l {
    public static final C2195l crashlytics;
    public static final C2195l loadAd;
    public static final Class yandex;

    static {
        Class<?> cls;
        Class<?> cls2;
        C10738l c10738l = C10738l.crashlytics;
        C2195l c2195l = null;
        try {
            cls = Class.forName("androidx.glance.appwidget.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        yandex = cls;
        try {
            C10738l c10738l2 = C10738l.crashlytics;
            try {
                cls2 = Class.forName("androidx.glance.appwidget.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                c2195l = (C2195l) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        loadAd = c2195l;
        crashlytics = new C2195l();
    }

    public static void Signature(int i, List list, C13161l c13161l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C2577l;
        AbstractC11078l abstractC11078l = (AbstractC11078l) c13161l.f25776l;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC11078l.smaato(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC11078l.Signature(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = AbstractC11078l.loadAd;
                i3 += 4;
            }
            abstractC11078l.pro(i3);
            while (i2 < list.size()) {
                abstractC11078l.remoteconfig(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C2577l c2577l = (C2577l) list;
        if (!z) {
            while (i2 < c2577l.f5612l) {
                abstractC11078l.smaato(i, c2577l.admob(i2));
                i2++;
            }
            return;
        }
        abstractC11078l.Signature(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c2577l.f5612l; i6++) {
            c2577l.admob(i6);
            Logger logger2 = AbstractC11078l.loadAd;
            i5 += 4;
        }
        abstractC11078l.pro(i5);
        while (i2 < c2577l.f5612l) {
            abstractC11078l.remoteconfig(c2577l.admob(i2));
            i2++;
        }
    }

    public static void ad(int i, List list, C13161l c13161l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof AbstractC8563l;
        AbstractC11078l abstractC11078l = (AbstractC11078l) c13161l.f25776l;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    abstractC11078l.ad(i, (jLongValue >> 63) ^ (jLongValue << 1));
                    i2++;
                }
                return;
            }
            abstractC11078l.Signature(i, 2);
            int iCrashlytics = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iCrashlytics += AbstractC11078l.crashlytics(((Long) list.get(i3)).longValue());
            }
            abstractC11078l.pro(iCrashlytics);
            while (i2 < list.size()) {
                long jLongValue2 = ((Long) list.get(i2)).longValue();
                abstractC11078l.advert((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i2++;
            }
            return;
        }
        AbstractC8563l abstractC8563l = (AbstractC8563l) list;
        if (!z) {
            while (i2 < 0) {
                long jMopub = abstractC8563l.mopub(i2);
                abstractC11078l.ad(i, (jMopub >> 63) ^ (jMopub << 1));
                i2++;
            }
            return;
        }
        abstractC11078l.Signature(i, 2);
        int iCrashlytics2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iCrashlytics2 += AbstractC11078l.crashlytics(abstractC8563l.mopub(i4));
        }
        abstractC11078l.pro(iCrashlytics2);
        while (i2 < 0) {
            long jMopub2 = abstractC8563l.mopub(i2);
            abstractC11078l.advert((jMopub2 >> 63) ^ (jMopub2 << 1));
            i2++;
        }
    }

    public static void adcel(int i, List list, C13161l c13161l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof AbstractC8563l;
        AbstractC11078l abstractC11078l = (AbstractC11078l) c13161l.f25776l;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC11078l.vip(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC11078l.Signature(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = AbstractC11078l.loadAd;
                i3 += 8;
            }
            abstractC11078l.pro(i3);
            while (i2 < list.size()) {
                abstractC11078l.metrica(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        AbstractC8563l abstractC8563l = (AbstractC8563l) list;
        if (!z) {
            while (i2 < 0) {
                abstractC11078l.vip(i, abstractC8563l.mopub(i2));
                i2++;
            }
            return;
        }
        abstractC11078l.Signature(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            abstractC8563l.mopub(i6);
            Logger logger2 = AbstractC11078l.loadAd;
            i5 += 8;
        }
        abstractC11078l.pro(i5);
        while (i2 < 0) {
            abstractC11078l.metrica(abstractC8563l.mopub(i2));
            i2++;
        }
    }

    public static int admob(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2577l)) {
            int iBilling = 0;
            while (i < size) {
                iBilling += AbstractC11078l.billing(((Integer) list.get(i)).intValue());
                i++;
            }
            return iBilling;
        }
        C2577l c2577l = (C2577l) list;
        int iBilling2 = 0;
        while (i < size) {
            iBilling2 += AbstractC11078l.billing(c2577l.admob(i));
            i++;
        }
        return iBilling2;
    }

    public static void ads(int i, List list, C13161l c13161l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof AbstractC3191l;
        AbstractC11078l abstractC11078l = (AbstractC11078l) c13161l.f25776l;
        int i2 = 0;
        if (z2) {
            if (z) {
                abstractC11078l.Signature(i, 2);
                abstractC11078l.pro(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                abstractC11078l.getClass();
                abstractC11078l.smaato(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        abstractC11078l.Signature(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = AbstractC11078l.loadAd;
            i3 += 4;
        }
        abstractC11078l.pro(i3);
        while (i2 < list.size()) {
            abstractC11078l.remoteconfig(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void advert(int i, List list, C13161l c13161l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C2577l;
        AbstractC11078l abstractC11078l = (AbstractC11078l) c13161l.f25776l;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC11078l.license(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC11078l.Signature(i, 2);
            int iBilling = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iBilling += AbstractC11078l.billing(((Integer) list.get(i3)).intValue());
            }
            abstractC11078l.pro(iBilling);
            while (i2 < list.size()) {
                abstractC11078l.pro(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C2577l c2577l = (C2577l) list;
        if (!z) {
            while (i2 < c2577l.f5612l) {
                abstractC11078l.license(i, c2577l.admob(i2));
                i2++;
            }
            return;
        }
        abstractC11078l.Signature(i, 2);
        int iBilling2 = 0;
        for (int i4 = 0; i4 < c2577l.f5612l; i4++) {
            iBilling2 += AbstractC11078l.billing(c2577l.admob(i4));
        }
        abstractC11078l.pro(iBilling2);
        while (i2 < c2577l.f5612l) {
            abstractC11078l.pro(c2577l.admob(i2));
            i2++;
        }
    }

    public static int amazon(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2577l)) {
            int iMopub = 0;
            while (i < size) {
                iMopub += AbstractC11078l.mopub(((Integer) list.get(i)).intValue());
                i++;
            }
            return iMopub;
        }
        C2577l c2577l = (C2577l) list;
        int iMopub2 = 0;
        while (i < size) {
            iMopub2 += AbstractC11078l.mopub(c2577l.admob(i));
            i++;
        }
        return iMopub2;
    }

    public static int billing(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2577l)) {
            int iLoadAd = 0;
            while (i < size) {
                iLoadAd += AbstractC11078l.loadAd(((Integer) list.get(i)).intValue());
                i++;
            }
            return iLoadAd;
        }
        C2577l c2577l = (C2577l) list;
        int iLoadAd2 = 0;
        while (i < size) {
            iLoadAd2 += AbstractC11078l.loadAd(c2577l.admob(i));
            i++;
        }
        return iLoadAd2;
    }

    public static int crashlytics(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC11078l.purchase(i) + 8) * size;
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
    public static void firebase(C2195l c2195l, Object obj, Object obj2) {
        c2195l.getClass();
        AbstractC12946l abstractC12946l = (AbstractC12946l) obj;
        C11788l c11788l = abstractC12946l.unknownFields;
        C11788l c11788l2 = ((AbstractC12946l) obj2).unknownFields;
        C11788l c11788l3 = C11788l.billing;
        if (!c11788l3.equals(c11788l2)) {
            if (c11788l3.equals(c11788l)) {
                int i = c11788l.yandex + c11788l2.yandex;
                int[] iArrCopyOf = Arrays.copyOf(c11788l.loadAd, i);
                System.arraycopy(c11788l2.loadAd, 0, iArrCopyOf, c11788l.yandex, c11788l2.yandex);
                Object[] objArrCopyOf = Arrays.copyOf(c11788l.crashlytics, i);
                System.arraycopy(c11788l2.crashlytics, 0, objArrCopyOf, c11788l.yandex, c11788l2.yandex);
                c11788l = new C11788l(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                c11788l.getClass();
                if (!c11788l2.equals(c11788l3)) {
                    if (!c11788l.purchase) {
                        C3010l.mopub();
                        return;
                    }
                    int i2 = c11788l.yandex + c11788l2.yandex;
                    c11788l.yandex(i2);
                    System.arraycopy(c11788l2.loadAd, 0, c11788l.loadAd, c11788l.yandex, c11788l2.yandex);
                    System.arraycopy(c11788l2.crashlytics, 0, c11788l.crashlytics, c11788l.yandex, c11788l2.yandex);
                    c11788l.yandex = i2;
                }
            }
        }
        abstractC12946l.unknownFields = c11788l;
    }

    public static void isVip(int i, List list, C13161l c13161l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof AbstractC8563l;
        AbstractC11078l abstractC11078l = (AbstractC11078l) c13161l.f25776l;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC11078l.ad(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC11078l.Signature(i, 2);
            int iMopub = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iMopub += AbstractC11078l.mopub(((Long) list.get(i3)).longValue());
            }
            abstractC11078l.pro(iMopub);
            while (i2 < list.size()) {
                abstractC11078l.advert(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        AbstractC8563l abstractC8563l = (AbstractC8563l) list;
        if (!z) {
            while (i2 < 0) {
                abstractC11078l.ad(i, abstractC8563l.mopub(i2));
                i2++;
            }
            return;
        }
        abstractC11078l.Signature(i, 2);
        int iMopub2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iMopub2 += AbstractC11078l.mopub(abstractC8563l.mopub(i4));
        }
        abstractC11078l.pro(iMopub2);
        while (i2 < 0) {
            abstractC11078l.advert(abstractC8563l.mopub(i2));
            i2++;
        }
    }

    public static void license(int i, List list, C13161l c13161l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof AbstractC8563l;
        AbstractC11078l abstractC11078l = (AbstractC11078l) c13161l.f25776l;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC11078l.vip(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC11078l.Signature(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = AbstractC11078l.loadAd;
                i3 += 8;
            }
            abstractC11078l.pro(i3);
            while (i2 < list.size()) {
                abstractC11078l.metrica(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        AbstractC8563l abstractC8563l = (AbstractC8563l) list;
        if (!z) {
            while (i2 < 0) {
                abstractC11078l.vip(i, abstractC8563l.mopub(i2));
                i2++;
            }
            return;
        }
        abstractC11078l.Signature(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            abstractC8563l.mopub(i6);
            Logger logger2 = AbstractC11078l.loadAd;
            i5 += 8;
        }
        abstractC11078l.pro(i5);
        while (i2 < 0) {
            abstractC11078l.metrica(abstractC8563l.mopub(i2));
            i2++;
        }
    }

    public static int loadAd(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC11078l.purchase(i) + 4) * size;
    }

    public static void metrica(int i, List list, C13161l c13161l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C2577l;
        AbstractC11078l abstractC11078l = (AbstractC11078l) c13161l.f25776l;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC11078l.startapp(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC11078l.Signature(i, 2);
            int iMopub = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iMopub += AbstractC11078l.mopub(((Integer) list.get(i3)).intValue());
            }
            abstractC11078l.pro(iMopub);
            while (i2 < list.size()) {
                abstractC11078l.adcel(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C2577l c2577l = (C2577l) list;
        if (!z) {
            while (i2 < c2577l.f5612l) {
                abstractC11078l.startapp(i, c2577l.admob(i2));
                i2++;
            }
            return;
        }
        abstractC11078l.Signature(i, 2);
        int iMopub2 = 0;
        for (int i4 = 0; i4 < c2577l.f5612l; i4++) {
            iMopub2 += AbstractC11078l.mopub(c2577l.admob(i4));
        }
        abstractC11078l.pro(iMopub2);
        while (i2 < c2577l.f5612l) {
            abstractC11078l.adcel(c2577l.admob(i2));
            i2++;
        }
    }

    public static int mopub(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC8563l)) {
            int iCrashlytics = 0;
            while (i < size) {
                iCrashlytics += AbstractC11078l.crashlytics(((Long) list.get(i)).longValue());
                i++;
            }
            return iCrashlytics;
        }
        AbstractC8563l abstractC8563l = (AbstractC8563l) list;
        int iCrashlytics2 = 0;
        while (i < size) {
            iCrashlytics2 += AbstractC11078l.crashlytics(abstractC8563l.mopub(i));
            i++;
        }
        return iCrashlytics2;
    }

    public static void pro(int i, List list, C13161l c13161l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C2577l;
        AbstractC11078l abstractC11078l = (AbstractC11078l) c13161l.f25776l;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    abstractC11078l.license(i, (iIntValue >> 31) ^ (iIntValue << 1));
                    i2++;
                }
                return;
            }
            abstractC11078l.Signature(i, 2);
            int iLoadAd = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iLoadAd += AbstractC11078l.loadAd(((Integer) list.get(i3)).intValue());
            }
            abstractC11078l.pro(iLoadAd);
            while (i2 < list.size()) {
                int iIntValue2 = ((Integer) list.get(i2)).intValue();
                abstractC11078l.pro((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i2++;
            }
            return;
        }
        C2577l c2577l = (C2577l) list;
        if (!z) {
            while (i2 < c2577l.f5612l) {
                int iAdmob = c2577l.admob(i2);
                abstractC11078l.license(i, (iAdmob >> 31) ^ (iAdmob << 1));
                i2++;
            }
            return;
        }
        abstractC11078l.Signature(i, 2);
        int iLoadAd2 = 0;
        for (int i4 = 0; i4 < c2577l.f5612l; i4++) {
            iLoadAd2 += AbstractC11078l.loadAd(c2577l.admob(i4));
        }
        abstractC11078l.pro(iLoadAd2);
        while (i2 < c2577l.f5612l) {
            int iAdmob2 = c2577l.admob(i2);
            abstractC11078l.pro((iAdmob2 >> 31) ^ (iAdmob2 << 1));
            i2++;
        }
    }

    public static int purchase(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC8563l)) {
            int iMopub = 0;
            while (i < size) {
                iMopub += AbstractC11078l.mopub(((Long) list.get(i)).longValue());
                i++;
            }
            return iMopub;
        }
        AbstractC8563l abstractC8563l = (AbstractC8563l) list;
        int iMopub2 = 0;
        while (i < size) {
            iMopub2 += AbstractC11078l.mopub(abstractC8563l.mopub(i));
            i++;
        }
        return iMopub2;
    }

    public static void remoteconfig(int i, List list, C13161l c13161l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof AbstractC16329l;
        AbstractC11078l abstractC11078l = (AbstractC11078l) c13161l.f25776l;
        int i2 = 0;
        if (z2) {
            if (z) {
                abstractC11078l.Signature(i, 2);
                abstractC11078l.pro(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                abstractC11078l.isPro(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        abstractC11078l.Signature(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = AbstractC11078l.loadAd;
            i3++;
        }
        abstractC11078l.pro(i3);
        while (i2 < list.size()) {
            abstractC11078l.subs(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static boolean smaato(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void startapp(int i, List list, C13161l c13161l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C2577l;
        AbstractC11078l abstractC11078l = (AbstractC11078l) c13161l.f25776l;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC11078l.smaato(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC11078l.Signature(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = AbstractC11078l.loadAd;
                i3 += 4;
            }
            abstractC11078l.pro(i3);
            while (i2 < list.size()) {
                abstractC11078l.remoteconfig(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C2577l c2577l = (C2577l) list;
        if (!z) {
            while (i2 < c2577l.f5612l) {
                abstractC11078l.smaato(i, c2577l.admob(i2));
                i2++;
            }
            return;
        }
        abstractC11078l.Signature(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c2577l.f5612l; i6++) {
            c2577l.admob(i6);
            Logger logger2 = AbstractC11078l.loadAd;
            i5 += 4;
        }
        abstractC11078l.pro(i5);
        while (i2 < c2577l.f5612l) {
            abstractC11078l.remoteconfig(c2577l.admob(i2));
            i2++;
        }
    }

    public static int subs(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC8563l)) {
            int iMopub = 0;
            while (i < size) {
                iMopub += AbstractC11078l.mopub(((Long) list.get(i)).longValue());
                i++;
            }
            return iMopub;
        }
        AbstractC8563l abstractC8563l = (AbstractC8563l) list;
        int iMopub2 = 0;
        while (i < size) {
            iMopub2 += AbstractC11078l.mopub(abstractC8563l.mopub(i));
            i++;
        }
        return iMopub2;
    }

    public static void subscription(int i, List list, C13161l c13161l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C2577l;
        AbstractC11078l abstractC11078l = (AbstractC11078l) c13161l.f25776l;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC11078l.startapp(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC11078l.Signature(i, 2);
            int iMopub = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iMopub += AbstractC11078l.mopub(((Integer) list.get(i3)).intValue());
            }
            abstractC11078l.pro(iMopub);
            while (i2 < list.size()) {
                abstractC11078l.adcel(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C2577l c2577l = (C2577l) list;
        if (!z) {
            while (i2 < c2577l.f5612l) {
                abstractC11078l.startapp(i, c2577l.admob(i2));
                i2++;
            }
            return;
        }
        abstractC11078l.Signature(i, 2);
        int iMopub2 = 0;
        for (int i4 = 0; i4 < c2577l.f5612l; i4++) {
            iMopub2 += AbstractC11078l.mopub(c2577l.admob(i4));
        }
        abstractC11078l.pro(iMopub2);
        while (i2 < c2577l.f5612l) {
            abstractC11078l.adcel(c2577l.admob(i2));
            i2++;
        }
    }

    public static void tapsense(int i, List list, C13161l c13161l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof AbstractC8563l;
        AbstractC11078l abstractC11078l = (AbstractC11078l) c13161l.f25776l;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC11078l.ad(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC11078l.Signature(i, 2);
            int iMopub = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iMopub += AbstractC11078l.mopub(((Long) list.get(i3)).longValue());
            }
            abstractC11078l.pro(iMopub);
            while (i2 < list.size()) {
                abstractC11078l.advert(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        AbstractC8563l abstractC8563l = (AbstractC8563l) list;
        if (!z) {
            while (i2 < 0) {
                abstractC11078l.ad(i, abstractC8563l.mopub(i2));
                i2++;
            }
            return;
        }
        abstractC11078l.Signature(i, 2);
        int iMopub2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iMopub2 += AbstractC11078l.mopub(abstractC8563l.mopub(i4));
        }
        abstractC11078l.pro(iMopub2);
        while (i2 < 0) {
            abstractC11078l.advert(abstractC8563l.mopub(i2));
            i2++;
        }
    }

    public static void vip(int i, List list, C13161l c13161l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof AbstractC2583l;
        AbstractC11078l abstractC11078l = (AbstractC11078l) c13161l.f25776l;
        int i2 = 0;
        if (z2) {
            if (z) {
                abstractC11078l.Signature(i, 2);
                abstractC11078l.pro(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                abstractC11078l.getClass();
                abstractC11078l.vip(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        abstractC11078l.Signature(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = AbstractC11078l.loadAd;
            i3 += 8;
        }
        abstractC11078l.pro(i3);
        while (i2 < list.size()) {
            abstractC11078l.metrica(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static int yandex(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2577l)) {
            int iMopub = 0;
            while (i < size) {
                iMopub += AbstractC11078l.mopub(((Integer) list.get(i)).intValue());
                i++;
            }
            return iMopub;
        }
        C2577l c2577l = (C2577l) list;
        int iMopub2 = 0;
        while (i < size) {
            iMopub2 += AbstractC11078l.mopub(c2577l.admob(i));
            i++;
        }
        return iMopub2;
    }

    public static Object isPro(Object obj, int i, InterfaceC10996l interfaceC10996l, Object obj2, C2195l c2195l) {
        return obj2;
    }
}
