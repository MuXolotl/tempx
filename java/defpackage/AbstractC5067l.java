package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: lٟؗٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5067l {
    public static final C18155l crashlytics;
    public static final C18155l loadAd;
    public static final Class yandex;

    static {
        Class<?> cls;
        Class<?> cls2;
        C17073l c17073l = C17073l.crashlytics;
        C18155l c18155l = null;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        yandex = cls;
        try {
            C17073l c17073l2 = C17073l.crashlytics;
            try {
                cls2 = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                c18155l = (C18155l) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        loadAd = c18155l;
        crashlytics = new C18155l();
    }

    public static void Signature(int i, List list, C5138l c5138l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof AbstractC13800l;
        AbstractC15335l abstractC15335l = (AbstractC15335l) c5138l.f11181l;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC15335l.smaato(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC15335l.tapsense(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = AbstractC15335l.loadAd;
                i3 += 4;
            }
            abstractC15335l.license(i3);
            while (i2 < list.size()) {
                abstractC15335l.remoteconfig(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        AbstractC13800l abstractC13800l = (AbstractC13800l) list;
        if (!z) {
            while (i2 < 0) {
                abstractC15335l.smaato(i, abstractC13800l.mopub(i2));
                i2++;
            }
            return;
        }
        abstractC15335l.tapsense(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            abstractC13800l.mopub(i6);
            Logger logger2 = AbstractC15335l.loadAd;
            i5 += 4;
        }
        abstractC15335l.license(i5);
        while (i2 < 0) {
            abstractC15335l.remoteconfig(abstractC13800l.mopub(i2));
            i2++;
        }
    }

    public static void ad(int i, List list, C5138l c5138l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof AbstractC13401l;
        AbstractC15335l abstractC15335l = (AbstractC15335l) c5138l.f11181l;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    abstractC15335l.pro(i, (jLongValue >> 63) ^ (jLongValue << 1));
                    i2++;
                }
                return;
            }
            abstractC15335l.tapsense(i, 2);
            int iCrashlytics = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iCrashlytics += AbstractC15335l.crashlytics(((Long) list.get(i3)).longValue());
            }
            abstractC15335l.license(iCrashlytics);
            while (i2 < list.size()) {
                long jLongValue2 = ((Long) list.get(i2)).longValue();
                abstractC15335l.ad((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i2++;
            }
            return;
        }
        AbstractC13401l abstractC13401l = (AbstractC13401l) list;
        if (!z) {
            while (i2 < 0) {
                long jMopub = abstractC13401l.mopub(i2);
                abstractC15335l.pro(i, (jMopub >> 63) ^ (jMopub << 1));
                i2++;
            }
            return;
        }
        abstractC15335l.tapsense(i, 2);
        int iCrashlytics2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iCrashlytics2 += AbstractC15335l.crashlytics(abstractC13401l.mopub(i4));
        }
        abstractC15335l.license(iCrashlytics2);
        while (i2 < 0) {
            long jMopub2 = abstractC13401l.mopub(i2);
            abstractC15335l.ad((jMopub2 >> 63) ^ (jMopub2 << 1));
            i2++;
        }
    }

    public static void adcel(int i, List list, C5138l c5138l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof AbstractC13401l;
        AbstractC15335l abstractC15335l = (AbstractC15335l) c5138l.f11181l;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC15335l.vip(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC15335l.tapsense(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = AbstractC15335l.loadAd;
                i3 += 8;
            }
            abstractC15335l.license(i3);
            while (i2 < list.size()) {
                abstractC15335l.metrica(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        AbstractC13401l abstractC13401l = (AbstractC13401l) list;
        if (!z) {
            while (i2 < 0) {
                abstractC15335l.vip(i, abstractC13401l.mopub(i2));
                i2++;
            }
            return;
        }
        abstractC15335l.tapsense(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            abstractC13401l.mopub(i6);
            Logger logger2 = AbstractC15335l.loadAd;
            i5 += 8;
        }
        abstractC15335l.license(i5);
        while (i2 < 0) {
            abstractC15335l.metrica(abstractC13401l.mopub(i2));
            i2++;
        }
    }

    public static int admob(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC13800l)) {
            int iBilling = 0;
            while (i < size) {
                iBilling += AbstractC15335l.billing(((Integer) list.get(i)).intValue());
                i++;
            }
            return iBilling;
        }
        AbstractC13800l abstractC13800l = (AbstractC13800l) list;
        int iBilling2 = 0;
        while (i < size) {
            iBilling2 += AbstractC15335l.billing(abstractC13800l.mopub(i));
            i++;
        }
        return iBilling2;
    }

    public static void ads(int i, List list, C5138l c5138l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof AbstractC14281l;
        AbstractC15335l abstractC15335l = (AbstractC15335l) c5138l.f11181l;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    float fFloatValue = ((Float) list.get(i2)).floatValue();
                    abstractC15335l.getClass();
                    abstractC15335l.smaato(i, Float.floatToRawIntBits(fFloatValue));
                    i2++;
                }
                return;
            }
            abstractC15335l.tapsense(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                Logger logger = AbstractC15335l.loadAd;
                i3 += 4;
            }
            abstractC15335l.license(i3);
            while (i2 < list.size()) {
                abstractC15335l.remoteconfig(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        AbstractC14281l abstractC14281l = (AbstractC14281l) list;
        if (!z) {
            while (i2 < 0) {
                abstractC14281l.mopub(i2);
                float f = abstractC14281l.f27963l[i2];
                abstractC15335l.getClass();
                abstractC15335l.smaato(i, Float.floatToRawIntBits(f));
                i2++;
            }
            return;
        }
        abstractC15335l.tapsense(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            abstractC14281l.mopub(i6);
            float f2 = abstractC14281l.f27963l[i6];
            Logger logger2 = AbstractC15335l.loadAd;
            i5 += 4;
        }
        abstractC15335l.license(i5);
        while (i2 < 0) {
            abstractC14281l.mopub(i2);
            abstractC15335l.remoteconfig(Float.floatToRawIntBits(abstractC14281l.f27963l[i2]));
            i2++;
        }
    }

    public static void advert(int i, List list, C5138l c5138l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof AbstractC13800l;
        AbstractC15335l abstractC15335l = (AbstractC15335l) c5138l.f11181l;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC15335l.Signature(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC15335l.tapsense(i, 2);
            int iBilling = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iBilling += AbstractC15335l.billing(((Integer) list.get(i3)).intValue());
            }
            abstractC15335l.license(iBilling);
            while (i2 < list.size()) {
                abstractC15335l.license(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        AbstractC13800l abstractC13800l = (AbstractC13800l) list;
        if (!z) {
            while (i2 < 0) {
                abstractC15335l.Signature(i, abstractC13800l.mopub(i2));
                i2++;
            }
            return;
        }
        abstractC15335l.tapsense(i, 2);
        int iBilling2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iBilling2 += AbstractC15335l.billing(abstractC13800l.mopub(i4));
        }
        abstractC15335l.license(iBilling2);
        while (i2 < 0) {
            abstractC15335l.license(abstractC13800l.mopub(i2));
            i2++;
        }
    }

    public static int amazon(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC13800l)) {
            int iMopub = 0;
            while (i < size) {
                iMopub += AbstractC15335l.mopub(((Integer) list.get(i)).intValue());
                i++;
            }
            return iMopub;
        }
        AbstractC13800l abstractC13800l = (AbstractC13800l) list;
        int iMopub2 = 0;
        while (i < size) {
            iMopub2 += AbstractC15335l.mopub(abstractC13800l.mopub(i));
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
        if (!(list instanceof AbstractC13800l)) {
            int iLoadAd = 0;
            while (i < size) {
                iLoadAd += AbstractC15335l.loadAd(((Integer) list.get(i)).intValue());
                i++;
            }
            return iLoadAd;
        }
        AbstractC13800l abstractC13800l = (AbstractC13800l) list;
        int iLoadAd2 = 0;
        while (i < size) {
            iLoadAd2 += AbstractC15335l.loadAd(abstractC13800l.mopub(i));
            i++;
        }
        return iLoadAd2;
    }

    public static int crashlytics(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC15335l.purchase(i) + 8) * size;
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
    public static void firebase(C18155l c18155l, Object obj, Object obj2) {
        c18155l.getClass();
        AbstractC13399l abstractC13399l = (AbstractC13399l) obj;
        C7565l c7565l = abstractC13399l.unknownFields;
        C7565l c7565l2 = ((AbstractC13399l) obj2).unknownFields;
        C7565l c7565l3 = C7565l.billing;
        if (!c7565l3.equals(c7565l2)) {
            if (c7565l3.equals(c7565l)) {
                int i = c7565l.yandex + c7565l2.yandex;
                int[] iArrCopyOf = Arrays.copyOf(c7565l.loadAd, i);
                System.arraycopy(c7565l2.loadAd, 0, iArrCopyOf, c7565l.yandex, c7565l2.yandex);
                Object[] objArrCopyOf = Arrays.copyOf(c7565l.crashlytics, i);
                System.arraycopy(c7565l2.crashlytics, 0, objArrCopyOf, c7565l.yandex, c7565l2.yandex);
                c7565l = new C7565l(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                c7565l.getClass();
                if (!c7565l2.equals(c7565l3)) {
                    if (!c7565l.purchase) {
                        C3010l.mopub();
                        return;
                    }
                    int i2 = c7565l.yandex + c7565l2.yandex;
                    c7565l.yandex(i2);
                    System.arraycopy(c7565l2.loadAd, 0, c7565l.loadAd, c7565l.yandex, c7565l2.yandex);
                    System.arraycopy(c7565l2.crashlytics, 0, c7565l.crashlytics, c7565l.yandex, c7565l2.yandex);
                    c7565l.yandex = i2;
                }
            }
        }
        abstractC13399l.unknownFields = c7565l;
    }

    public static void isVip(int i, List list, C5138l c5138l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof AbstractC13401l;
        AbstractC15335l abstractC15335l = (AbstractC15335l) c5138l.f11181l;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC15335l.pro(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC15335l.tapsense(i, 2);
            int iMopub = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iMopub += AbstractC15335l.mopub(((Long) list.get(i3)).longValue());
            }
            abstractC15335l.license(iMopub);
            while (i2 < list.size()) {
                abstractC15335l.ad(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        AbstractC13401l abstractC13401l = (AbstractC13401l) list;
        if (!z) {
            while (i2 < 0) {
                abstractC15335l.pro(i, abstractC13401l.mopub(i2));
                i2++;
            }
            return;
        }
        abstractC15335l.tapsense(i, 2);
        int iMopub2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iMopub2 += AbstractC15335l.mopub(abstractC13401l.mopub(i4));
        }
        abstractC15335l.license(iMopub2);
        while (i2 < 0) {
            abstractC15335l.ad(abstractC13401l.mopub(i2));
            i2++;
        }
    }

    public static void license(int i, List list, C5138l c5138l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof AbstractC13401l;
        AbstractC15335l abstractC15335l = (AbstractC15335l) c5138l.f11181l;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC15335l.vip(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC15335l.tapsense(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = AbstractC15335l.loadAd;
                i3 += 8;
            }
            abstractC15335l.license(i3);
            while (i2 < list.size()) {
                abstractC15335l.metrica(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        AbstractC13401l abstractC13401l = (AbstractC13401l) list;
        if (!z) {
            while (i2 < 0) {
                abstractC15335l.vip(i, abstractC13401l.mopub(i2));
                i2++;
            }
            return;
        }
        abstractC15335l.tapsense(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            abstractC13401l.mopub(i6);
            Logger logger2 = AbstractC15335l.loadAd;
            i5 += 8;
        }
        abstractC15335l.license(i5);
        while (i2 < 0) {
            abstractC15335l.metrica(abstractC13401l.mopub(i2));
            i2++;
        }
    }

    public static int loadAd(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC15335l.purchase(i) + 4) * size;
    }

    public static void metrica(int i, List list, C5138l c5138l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof AbstractC13800l;
        AbstractC15335l abstractC15335l = (AbstractC15335l) c5138l.f11181l;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC15335l.startapp(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC15335l.tapsense(i, 2);
            int iMopub = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iMopub += AbstractC15335l.mopub(((Integer) list.get(i3)).intValue());
            }
            abstractC15335l.license(iMopub);
            while (i2 < list.size()) {
                abstractC15335l.adcel(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        AbstractC13800l abstractC13800l = (AbstractC13800l) list;
        if (!z) {
            while (i2 < 0) {
                abstractC15335l.startapp(i, abstractC13800l.mopub(i2));
                i2++;
            }
            return;
        }
        abstractC15335l.tapsense(i, 2);
        int iMopub2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iMopub2 += AbstractC15335l.mopub(abstractC13800l.mopub(i4));
        }
        abstractC15335l.license(iMopub2);
        while (i2 < 0) {
            abstractC15335l.adcel(abstractC13800l.mopub(i2));
            i2++;
        }
    }

    public static int mopub(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC13401l)) {
            int iCrashlytics = 0;
            while (i < size) {
                iCrashlytics += AbstractC15335l.crashlytics(((Long) list.get(i)).longValue());
                i++;
            }
            return iCrashlytics;
        }
        AbstractC13401l abstractC13401l = (AbstractC13401l) list;
        int iCrashlytics2 = 0;
        while (i < size) {
            iCrashlytics2 += AbstractC15335l.crashlytics(abstractC13401l.mopub(i));
            i++;
        }
        return iCrashlytics2;
    }

    public static void pro(int i, List list, C5138l c5138l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof AbstractC13800l;
        AbstractC15335l abstractC15335l = (AbstractC15335l) c5138l.f11181l;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    abstractC15335l.Signature(i, (iIntValue >> 31) ^ (iIntValue << 1));
                    i2++;
                }
                return;
            }
            abstractC15335l.tapsense(i, 2);
            int iLoadAd = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iLoadAd += AbstractC15335l.loadAd(((Integer) list.get(i3)).intValue());
            }
            abstractC15335l.license(iLoadAd);
            while (i2 < list.size()) {
                int iIntValue2 = ((Integer) list.get(i2)).intValue();
                abstractC15335l.license((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i2++;
            }
            return;
        }
        AbstractC13800l abstractC13800l = (AbstractC13800l) list;
        if (!z) {
            while (i2 < 0) {
                int iMopub = abstractC13800l.mopub(i2);
                abstractC15335l.Signature(i, (iMopub >> 31) ^ (iMopub << 1));
                i2++;
            }
            return;
        }
        abstractC15335l.tapsense(i, 2);
        int iLoadAd2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iLoadAd2 += AbstractC15335l.loadAd(abstractC13800l.mopub(i4));
        }
        abstractC15335l.license(iLoadAd2);
        while (i2 < 0) {
            int iMopub2 = abstractC13800l.mopub(i2);
            abstractC15335l.license((iMopub2 >> 31) ^ (iMopub2 << 1));
            i2++;
        }
    }

    public static int purchase(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC13401l)) {
            int iMopub = 0;
            while (i < size) {
                iMopub += AbstractC15335l.mopub(((Long) list.get(i)).longValue());
                i++;
            }
            return iMopub;
        }
        AbstractC13401l abstractC13401l = (AbstractC13401l) list;
        int iMopub2 = 0;
        while (i < size) {
            iMopub2 += AbstractC15335l.mopub(abstractC13401l.mopub(i));
            i++;
        }
        return iMopub2;
    }

    public static void remoteconfig(int i, List list, C5138l c5138l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof AbstractC16587l;
        AbstractC15335l abstractC15335l = (AbstractC15335l) c5138l.f11181l;
        int i2 = 0;
        if (z2) {
            if (z) {
                abstractC15335l.tapsense(i, 2);
                abstractC15335l.license(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                abstractC15335l.isPro(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        abstractC15335l.tapsense(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = AbstractC15335l.loadAd;
            i3++;
        }
        abstractC15335l.license(i3);
        while (i2 < list.size()) {
            abstractC15335l.subs(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static boolean smaato(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void startapp(int i, List list, C5138l c5138l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof AbstractC13800l;
        AbstractC15335l abstractC15335l = (AbstractC15335l) c5138l.f11181l;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC15335l.smaato(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC15335l.tapsense(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = AbstractC15335l.loadAd;
                i3 += 4;
            }
            abstractC15335l.license(i3);
            while (i2 < list.size()) {
                abstractC15335l.remoteconfig(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        AbstractC13800l abstractC13800l = (AbstractC13800l) list;
        if (!z) {
            while (i2 < 0) {
                abstractC15335l.smaato(i, abstractC13800l.mopub(i2));
                i2++;
            }
            return;
        }
        abstractC15335l.tapsense(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            abstractC13800l.mopub(i6);
            Logger logger2 = AbstractC15335l.loadAd;
            i5 += 4;
        }
        abstractC15335l.license(i5);
        while (i2 < 0) {
            abstractC15335l.remoteconfig(abstractC13800l.mopub(i2));
            i2++;
        }
    }

    public static int subs(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC13401l)) {
            int iMopub = 0;
            while (i < size) {
                iMopub += AbstractC15335l.mopub(((Long) list.get(i)).longValue());
                i++;
            }
            return iMopub;
        }
        AbstractC13401l abstractC13401l = (AbstractC13401l) list;
        int iMopub2 = 0;
        while (i < size) {
            iMopub2 += AbstractC15335l.mopub(abstractC13401l.mopub(i));
            i++;
        }
        return iMopub2;
    }

    public static void subscription(int i, List list, C5138l c5138l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof AbstractC13800l;
        AbstractC15335l abstractC15335l = (AbstractC15335l) c5138l.f11181l;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC15335l.startapp(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC15335l.tapsense(i, 2);
            int iMopub = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iMopub += AbstractC15335l.mopub(((Integer) list.get(i3)).intValue());
            }
            abstractC15335l.license(iMopub);
            while (i2 < list.size()) {
                abstractC15335l.adcel(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        AbstractC13800l abstractC13800l = (AbstractC13800l) list;
        if (!z) {
            while (i2 < 0) {
                abstractC15335l.startapp(i, abstractC13800l.mopub(i2));
                i2++;
            }
            return;
        }
        abstractC15335l.tapsense(i, 2);
        int iMopub2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iMopub2 += AbstractC15335l.mopub(abstractC13800l.mopub(i4));
        }
        abstractC15335l.license(iMopub2);
        while (i2 < 0) {
            abstractC15335l.adcel(abstractC13800l.mopub(i2));
            i2++;
        }
    }

    public static void tapsense(int i, List list, C5138l c5138l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof AbstractC13401l;
        AbstractC15335l abstractC15335l = (AbstractC15335l) c5138l.f11181l;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC15335l.pro(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC15335l.tapsense(i, 2);
            int iMopub = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iMopub += AbstractC15335l.mopub(((Long) list.get(i3)).longValue());
            }
            abstractC15335l.license(iMopub);
            while (i2 < list.size()) {
                abstractC15335l.ad(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        AbstractC13401l abstractC13401l = (AbstractC13401l) list;
        if (!z) {
            while (i2 < 0) {
                abstractC15335l.pro(i, abstractC13401l.mopub(i2));
                i2++;
            }
            return;
        }
        abstractC15335l.tapsense(i, 2);
        int iMopub2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iMopub2 += AbstractC15335l.mopub(abstractC13401l.mopub(i4));
        }
        abstractC15335l.license(iMopub2);
        while (i2 < 0) {
            abstractC15335l.ad(abstractC13401l.mopub(i2));
            i2++;
        }
    }

    public static void vip(int i, List list, C5138l c5138l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof AbstractC9488l;
        AbstractC15335l abstractC15335l = (AbstractC15335l) c5138l.f11181l;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                    abstractC15335l.getClass();
                    abstractC15335l.vip(i, Double.doubleToRawLongBits(dDoubleValue));
                    i2++;
                }
                return;
            }
            abstractC15335l.tapsense(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                Logger logger = AbstractC15335l.loadAd;
                i3 += 8;
            }
            abstractC15335l.license(i3);
            while (i2 < list.size()) {
                abstractC15335l.metrica(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        AbstractC9488l abstractC9488l = (AbstractC9488l) list;
        if (!z) {
            while (i2 < 0) {
                abstractC9488l.mopub(i2);
                double d = abstractC9488l.f19374l[i2];
                abstractC15335l.getClass();
                abstractC15335l.vip(i, Double.doubleToRawLongBits(d));
                i2++;
            }
            return;
        }
        abstractC15335l.tapsense(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            abstractC9488l.mopub(i6);
            double d2 = abstractC9488l.f19374l[i6];
            Logger logger2 = AbstractC15335l.loadAd;
            i5 += 8;
        }
        abstractC15335l.license(i5);
        while (i2 < 0) {
            abstractC9488l.mopub(i2);
            abstractC15335l.metrica(Double.doubleToRawLongBits(abstractC9488l.f19374l[i2]));
            i2++;
        }
    }

    public static int yandex(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC13800l)) {
            int iMopub = 0;
            while (i < size) {
                iMopub += AbstractC15335l.mopub(((Integer) list.get(i)).intValue());
                i++;
            }
            return iMopub;
        }
        AbstractC13800l abstractC13800l = (AbstractC13800l) list;
        int iMopub2 = 0;
        while (i < size) {
            iMopub2 += AbstractC15335l.mopub(abstractC13800l.mopub(i));
            i++;
        }
        return iMopub2;
    }

    public static Object isPro(Object obj, int i, InterfaceC9858l interfaceC9858l, Object obj2, C18155l c18155l) {
        return obj2;
    }
}
