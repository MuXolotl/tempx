package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: lؕۚٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3622l {
    public static final C16222l yandex;

    static {
        int i = AbstractC0286l.yandex;
        yandex = new C16222l(15);
    }

    public static int Signature(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4522l)) {
            int iSignatures = 0;
            while (i < size) {
                iSignatures += C9720l.signatures(((Integer) list.get(i)).intValue());
                i++;
            }
            return iSignatures;
        }
        C4522l c4522l = (C4522l) list;
        int iSignatures2 = 0;
        while (i < size) {
            iSignatures2 += C9720l.signatures(c4522l.mopub(i));
            i++;
        }
        return iSignatures2;
    }

    public static int ad(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C9720l.isVip(i << 3) + 4) * size;
    }

    public static int adcel(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C11365l)) {
            int iSignatures = 0;
            while (i < size) {
                iSignatures += C9720l.signatures(((Long) list.get(i)).longValue());
                i++;
            }
            return iSignatures;
        }
        C11365l c11365l = (C11365l) list;
        int iSignatures2 = 0;
        while (i < size) {
            iSignatures2 += C9720l.signatures(c11365l.billing(i));
            i++;
        }
        return iSignatures2;
    }

    public static void admob(int i, List list, C2290l c2290l, boolean z) throws C8413l {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9720l c9720l = (C9720l) c2290l.f4983l;
        int i2 = 0;
        if (!(list instanceof C11365l)) {
            if (!z) {
                while (i2 < list.size()) {
                    c9720l.ads(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            c9720l.remoteconfig(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            c9720l.Signature(i3);
            while (i2 < list.size()) {
                c9720l.ad(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C11365l c11365l = (C11365l) list;
        if (!z) {
            while (i2 < c11365l.f22917l) {
                c9720l.ads(i, c11365l.billing(i2));
                i2++;
            }
            return;
        }
        c9720l.remoteconfig(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c11365l.f22917l; i6++) {
            c11365l.billing(i6);
            i5 += 8;
        }
        c9720l.Signature(i5);
        while (i2 < c11365l.f22917l) {
            c9720l.ad(c11365l.billing(i2));
            i2++;
        }
    }

    public static int ads(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C11365l)) {
            int iSignatures = 0;
            while (i < size) {
                iSignatures += C9720l.signatures(((Long) list.get(i)).longValue());
                i++;
            }
            return iSignatures;
        }
        C11365l c11365l = (C11365l) list;
        int iSignatures2 = 0;
        while (i < size) {
            iSignatures2 += C9720l.signatures(c11365l.billing(i));
            i++;
        }
        return iSignatures2;
    }

    public static int advert(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C9720l.isVip(i << 3) + 8) * size;
    }

    public static void amazon(int i, List list, C2290l c2290l, boolean z) throws C8413l {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9720l c9720l = (C9720l) c2290l.f4983l;
        int i2 = 0;
        if (!(list instanceof C1070l)) {
            if (!z) {
                while (i2 < list.size()) {
                    c9720l.startapp(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            c9720l.remoteconfig(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            c9720l.Signature(i3);
            while (i2 < list.size()) {
                c9720l.license(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        C1070l c1070l = (C1070l) list;
        if (!z) {
            while (i2 < c1070l.f2953l) {
                c1070l.billing(i2);
                c9720l.startapp(i, Float.floatToRawIntBits(c1070l.f2954l[i2]));
                i2++;
            }
            return;
        }
        c9720l.remoteconfig(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c1070l.f2953l; i6++) {
            c1070l.billing(i6);
            float f = c1070l.f2954l[i6];
            i5 += 4;
        }
        c9720l.Signature(i5);
        while (i2 < c1070l.f2953l) {
            c1070l.billing(i2);
            c9720l.license(Float.floatToRawIntBits(c1070l.f2954l[i2]));
            i2++;
        }
    }

    public static void billing(int i, List list, C2290l c2290l, boolean z) throws C8413l {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9720l c9720l = (C9720l) c2290l.f4983l;
        int i2 = 0;
        if (!(list instanceof C11365l)) {
            if (!z) {
                while (i2 < list.size()) {
                    c9720l.adcel(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            c9720l.remoteconfig(i, 2);
            int iSignatures = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iSignatures += C9720l.signatures(((Long) list.get(i3)).longValue());
            }
            c9720l.Signature(iSignatures);
            while (i2 < list.size()) {
                c9720l.pro(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C11365l c11365l = (C11365l) list;
        if (!z) {
            while (i2 < c11365l.f22917l) {
                c9720l.adcel(i, c11365l.billing(i2));
                i2++;
            }
            return;
        }
        c9720l.remoteconfig(i, 2);
        int iSignatures2 = 0;
        for (int i4 = 0; i4 < c11365l.f22917l; i4++) {
            iSignatures2 += C9720l.signatures(c11365l.billing(i4));
        }
        c9720l.Signature(iSignatures2);
        while (i2 < c11365l.f22917l) {
            c9720l.pro(c11365l.billing(i2));
            i2++;
        }
    }

    public static void crashlytics(int i, List list, C2290l c2290l, boolean z) throws C8413l {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9720l c9720l = (C9720l) c2290l.f4983l;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c9720l.ads(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        c9720l.remoteconfig(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        c9720l.Signature(i3);
        while (i2 < list.size()) {
            c9720l.ad(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void firebase(int i, List list, C2290l c2290l, boolean z) throws C8413l {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9720l c9720l = (C9720l) c2290l.f4983l;
        int i2 = 0;
        if (!(list instanceof C4522l)) {
            if (!z) {
                while (i2 < list.size()) {
                    c9720l.metrica(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c9720l.remoteconfig(i, 2);
            int iIsVip = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iIsVip += C9720l.isVip(((Integer) list.get(i3)).intValue());
            }
            c9720l.Signature(iIsVip);
            while (i2 < list.size()) {
                c9720l.Signature(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C4522l c4522l = (C4522l) list;
        if (!z) {
            while (i2 < c4522l.f9161l) {
                c9720l.metrica(i, c4522l.mopub(i2));
                i2++;
            }
            return;
        }
        c9720l.remoteconfig(i, 2);
        int iIsVip2 = 0;
        for (int i4 = 0; i4 < c4522l.f9161l; i4++) {
            iIsVip2 += C9720l.isVip(c4522l.mopub(i4));
        }
        c9720l.Signature(iIsVip2);
        while (i2 < c4522l.f9161l) {
            c9720l.Signature(c4522l.mopub(i2));
            i2++;
        }
    }

    public static void isPro(int i, List list, C2290l c2290l, boolean z) throws C8413l {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9720l c9720l = (C9720l) c2290l.f4983l;
        int i2 = 0;
        if (!(list instanceof C4522l)) {
            if (!z) {
                while (i2 < list.size()) {
                    c9720l.vip(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c9720l.remoteconfig(i, 2);
            int iSignatures = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iSignatures += C9720l.signatures(((Integer) list.get(i3)).intValue());
            }
            c9720l.Signature(iSignatures);
            while (i2 < list.size()) {
                c9720l.tapsense(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C4522l c4522l = (C4522l) list;
        if (!z) {
            while (i2 < c4522l.f9161l) {
                c9720l.vip(i, c4522l.mopub(i2));
                i2++;
            }
            return;
        }
        c9720l.remoteconfig(i, 2);
        int iSignatures2 = 0;
        for (int i4 = 0; i4 < c4522l.f9161l; i4++) {
            iSignatures2 += C9720l.signatures(c4522l.mopub(i4));
        }
        c9720l.Signature(iSignatures2);
        while (i2 < c4522l.f9161l) {
            c9720l.tapsense(c4522l.mopub(i2));
            i2++;
        }
    }

    public static int license(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4522l)) {
            int iIsVip = 0;
            while (i < size) {
                iIsVip += C9720l.isVip(((Integer) list.get(i)).intValue());
                i++;
            }
            return iIsVip;
        }
        C4522l c4522l = (C4522l) list;
        int iIsVip2 = 0;
        while (i < size) {
            iIsVip2 += C9720l.isVip(c4522l.mopub(i));
            i++;
        }
        return iIsVip2;
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
        AbstractC17187l abstractC17187l = (AbstractC17187l) obj;
        C6378l c6378l = abstractC17187l.zzc;
        C6378l c6378l2 = ((AbstractC17187l) obj2).zzc;
        C6378l c6378l3 = C6378l.purchase;
        if (!c6378l3.equals(c6378l2)) {
            if (c6378l3.equals(c6378l)) {
                c6378l.getClass();
                c6378l2.getClass();
                int[] iArrCopyOf = Arrays.copyOf(c6378l.yandex, 0);
                System.arraycopy(c6378l2.yandex, 0, iArrCopyOf, 0, 0);
                Object[] objArrCopyOf = Arrays.copyOf(c6378l.loadAd, 0);
                System.arraycopy(c6378l2.loadAd, 0, objArrCopyOf, 0, 0);
                c6378l = new C6378l(iArrCopyOf, objArrCopyOf, true);
            } else {
                c6378l.getClass();
                if (!c6378l2.equals(c6378l3)) {
                    if (!c6378l.amazon) {
                        C3010l.mopub();
                        return;
                    } else {
                        System.arraycopy(c6378l2.yandex, 0, c6378l.yandex, 0, 0);
                        System.arraycopy(c6378l2.loadAd, 0, c6378l.loadAd, 0, 0);
                    }
                }
            }
        }
        abstractC17187l.zzc = c6378l;
    }

    public static void metrica(int i, List list, C2290l c2290l, boolean z) throws C8413l {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9720l c9720l = (C9720l) c2290l.f4983l;
        int i2 = 0;
        if (!(list instanceof C4522l)) {
            if (!z) {
                while (i2 < list.size()) {
                    c9720l.vip(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c9720l.remoteconfig(i, 2);
            int iSignatures = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iSignatures += C9720l.signatures(((Integer) list.get(i3)).intValue());
            }
            c9720l.Signature(iSignatures);
            while (i2 < list.size()) {
                c9720l.tapsense(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C4522l c4522l = (C4522l) list;
        if (!z) {
            while (i2 < c4522l.f9161l) {
                c9720l.vip(i, c4522l.mopub(i2));
                i2++;
            }
            return;
        }
        c9720l.remoteconfig(i, 2);
        int iSignatures2 = 0;
        for (int i4 = 0; i4 < c4522l.f9161l; i4++) {
            iSignatures2 += C9720l.signatures(c4522l.mopub(i4));
        }
        c9720l.Signature(iSignatures2);
        while (i2 < c4522l.f9161l) {
            c9720l.tapsense(c4522l.mopub(i2));
            i2++;
        }
    }

    public static void mopub(int i, List list, C2290l c2290l, boolean z) throws C8413l {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9720l c9720l = (C9720l) c2290l.f4983l;
        int i2 = 0;
        if (!(list instanceof C11365l)) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    c9720l.adcel(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            c9720l.remoteconfig(i, 2);
            int iSignatures = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iSignatures += C9720l.signatures((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            c9720l.Signature(iSignatures);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                c9720l.pro((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        C11365l c11365l = (C11365l) list;
        if (!z) {
            while (i2 < c11365l.f22917l) {
                long jBilling = c11365l.billing(i2);
                c9720l.adcel(i, (jBilling >> 63) ^ (jBilling + jBilling));
                i2++;
            }
            return;
        }
        c9720l.remoteconfig(i, 2);
        int iSignatures2 = 0;
        for (int i4 = 0; i4 < c11365l.f22917l; i4++) {
            long jBilling2 = c11365l.billing(i4);
            iSignatures2 += C9720l.signatures((jBilling2 >> 63) ^ (jBilling2 + jBilling2));
        }
        c9720l.Signature(iSignatures2);
        while (i2 < c11365l.f22917l) {
            long jBilling3 = c11365l.billing(i2);
            c9720l.pro((jBilling3 >> 63) ^ (jBilling3 + jBilling3));
            i2++;
        }
    }

    public static int pro(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4522l)) {
            int iIsVip = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iIsVip += C9720l.isVip((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iIsVip;
        }
        C4522l c4522l = (C4522l) list;
        int iIsVip2 = 0;
        while (i < size) {
            int iMopub = c4522l.mopub(i);
            iIsVip2 += C9720l.isVip((iMopub >> 31) ^ (iMopub + iMopub));
            i++;
        }
        return iIsVip2;
    }

    public static void purchase(int i, List list, C2290l c2290l, boolean z) throws C8413l {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9720l c9720l = (C9720l) c2290l.f4983l;
        int i2 = 0;
        if (!(list instanceof C11365l)) {
            if (!z) {
                while (i2 < list.size()) {
                    c9720l.adcel(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            c9720l.remoteconfig(i, 2);
            int iSignatures = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iSignatures += C9720l.signatures(((Long) list.get(i3)).longValue());
            }
            c9720l.Signature(iSignatures);
            while (i2 < list.size()) {
                c9720l.pro(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C11365l c11365l = (C11365l) list;
        if (!z) {
            while (i2 < c11365l.f22917l) {
                c9720l.adcel(i, c11365l.billing(i2));
                i2++;
            }
            return;
        }
        c9720l.remoteconfig(i, 2);
        int iSignatures2 = 0;
        for (int i4 = 0; i4 < c11365l.f22917l; i4++) {
            iSignatures2 += C9720l.signatures(c11365l.billing(i4));
        }
        c9720l.Signature(iSignatures2);
        while (i2 < c11365l.f22917l) {
            c9720l.pro(c11365l.billing(i2));
            i2++;
        }
    }

    public static void remoteconfig(int i, List list, C2290l c2290l, boolean z) throws C8413l {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9720l c9720l = (C9720l) c2290l.f4983l;
        int i2 = 0;
        if (!(list instanceof C4522l)) {
            if (!z) {
                while (i2 < list.size()) {
                    c9720l.startapp(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c9720l.remoteconfig(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            c9720l.Signature(i3);
            while (i2 < list.size()) {
                c9720l.license(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C4522l c4522l = (C4522l) list;
        if (!z) {
            while (i2 < c4522l.f9161l) {
                c9720l.startapp(i, c4522l.mopub(i2));
                i2++;
            }
            return;
        }
        c9720l.remoteconfig(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c4522l.f9161l; i6++) {
            c4522l.mopub(i6);
            i5 += 4;
        }
        c9720l.Signature(i5);
        while (i2 < c4522l.f9161l) {
            c9720l.license(c4522l.mopub(i2));
            i2++;
        }
    }

    public static void smaato(int i, List list, C2290l c2290l, boolean z) throws C8413l {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9720l c9720l = (C9720l) c2290l.f4983l;
        int i2 = 0;
        if (!(list instanceof C4522l)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    c9720l.metrica(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            c9720l.remoteconfig(i, 2);
            int iIsVip = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iIsVip += C9720l.isVip((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            c9720l.Signature(iIsVip);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                c9720l.Signature((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        C4522l c4522l = (C4522l) list;
        if (!z) {
            while (i2 < c4522l.f9161l) {
                int iMopub = c4522l.mopub(i2);
                c9720l.metrica(i, (iMopub >> 31) ^ (iMopub + iMopub));
                i2++;
            }
            return;
        }
        c9720l.remoteconfig(i, 2);
        int iIsVip2 = 0;
        for (int i4 = 0; i4 < c4522l.f9161l; i4++) {
            int iMopub2 = c4522l.mopub(i4);
            iIsVip2 += C9720l.isVip((iMopub2 >> 31) ^ (iMopub2 + iMopub2));
        }
        c9720l.Signature(iIsVip2);
        while (i2 < c4522l.f9161l) {
            int iMopub3 = c4522l.mopub(i2);
            c9720l.Signature((iMopub3 >> 31) ^ (iMopub3 + iMopub3));
            i2++;
        }
    }

    public static void startapp(int i, List list, C2290l c2290l, boolean z) throws C8413l {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9720l c9720l = (C9720l) c2290l.f4983l;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                byte bBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                c9720l.Signature(i << 3);
                int i3 = c9720l.billing;
                try {
                    int i4 = i3 + 1;
                    try {
                        c9720l.amazon[i3] = bBooleanValue;
                        c9720l.billing = i4;
                        i2++;
                    } catch (IndexOutOfBoundsException e) {
                        e = e;
                        i3 = i4;
                        throw new C8413l(i3, c9720l.purchase, 1, e, 18);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                }
            }
            return;
        }
        c9720l.remoteconfig(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Boolean) list.get(i6)).getClass();
            i5++;
        }
        c9720l.Signature(i5);
        while (i2 < list.size()) {
            byte bBooleanValue2 = ((Boolean) list.get(i2)).booleanValue();
            int i7 = c9720l.billing;
            try {
                int i8 = i7 + 1;
                try {
                    c9720l.amazon[i7] = bBooleanValue2;
                    c9720l.billing = i8;
                    i2++;
                } catch (IndexOutOfBoundsException e3) {
                    e = e3;
                    i7 = i8;
                    throw new C8413l(i7, c9720l.purchase, 1, e, 18);
                }
            } catch (IndexOutOfBoundsException e4) {
                e = e4;
            }
        }
    }

    public static void subs(int i, List list, C2290l c2290l, boolean z) throws C8413l {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9720l c9720l = (C9720l) c2290l.f4983l;
        int i2 = 0;
        if (!(list instanceof C11365l)) {
            if (!z) {
                while (i2 < list.size()) {
                    c9720l.ads(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            c9720l.remoteconfig(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            c9720l.Signature(i3);
            while (i2 < list.size()) {
                c9720l.ad(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C11365l c11365l = (C11365l) list;
        if (!z) {
            while (i2 < c11365l.f22917l) {
                c9720l.ads(i, c11365l.billing(i2));
                i2++;
            }
            return;
        }
        c9720l.remoteconfig(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c11365l.f22917l; i6++) {
            c11365l.billing(i6);
            i5 += 8;
        }
        c9720l.Signature(i5);
        while (i2 < c11365l.f22917l) {
            c9720l.ad(c11365l.billing(i2));
            i2++;
        }
    }

    public static int subscription(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C11365l)) {
            int iSignatures = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iSignatures += C9720l.signatures((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iSignatures;
        }
        C11365l c11365l = (C11365l) list;
        int iSignatures2 = 0;
        while (i < size) {
            long jBilling = c11365l.billing(i);
            iSignatures2 += C9720l.signatures((jBilling >> 63) ^ (jBilling + jBilling));
            i++;
        }
        return iSignatures2;
    }

    public static int tapsense(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4522l)) {
            int iSignatures = 0;
            while (i < size) {
                iSignatures += C9720l.signatures(((Integer) list.get(i)).intValue());
                i++;
            }
            return iSignatures;
        }
        C4522l c4522l = (C4522l) list;
        int iSignatures2 = 0;
        while (i < size) {
            iSignatures2 += C9720l.signatures(c4522l.mopub(i));
            i++;
        }
        return iSignatures2;
    }

    public static void vip(int i, List list, C2290l c2290l, boolean z) throws C8413l {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9720l c9720l = (C9720l) c2290l.f4983l;
        int i2 = 0;
        if (!(list instanceof C4522l)) {
            if (!z) {
                while (i2 < list.size()) {
                    c9720l.startapp(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c9720l.remoteconfig(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            c9720l.Signature(i3);
            while (i2 < list.size()) {
                c9720l.license(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C4522l c4522l = (C4522l) list;
        if (!z) {
            while (i2 < c4522l.f9161l) {
                c9720l.startapp(i, c4522l.mopub(i2));
                i2++;
            }
            return;
        }
        c9720l.remoteconfig(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c4522l.f9161l; i6++) {
            c4522l.mopub(i6);
            i5 += 4;
        }
        c9720l.Signature(i5);
        while (i2 < c4522l.f9161l) {
            c9720l.license(c4522l.mopub(i2));
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
