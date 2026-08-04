package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l٘ؔۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17663l {
    public static final C6162l yandex;

    static {
        C13940l c13940l = C13940l.crashlytics;
        yandex = new C6162l(24);
    }

    public static void Signature(int i, List list, C0770l c0770l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9747l c9747l = c0770l.yandex;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c9747l.admob(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c9747l.remoteconfig(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        c9747l.metrica(i3);
        while (i2 < list.size()) {
            c9747l.subs(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void ad(int i, List list, C0770l c0770l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9747l c9747l = c0770l.yandex;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c9747l.startapp(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c9747l.remoteconfig(i, 2);
        int iLoadAd = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iLoadAd += C9747l.loadAd(((Long) list.get(i3)).longValue());
        }
        c9747l.metrica(iLoadAd);
        while (i2 < list.size()) {
            c9747l.adcel(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void adcel(int i, List list, C0770l c0770l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9747l c9747l = c0770l.yandex;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                c9747l.metrica(i << 3);
                c9747l.crashlytics(zBooleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        c9747l.remoteconfig(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        c9747l.metrica(i3);
        while (i2 < list.size()) {
            c9747l.crashlytics(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int admob(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C9747l.yandex(i << 3) + 8) * size;
    }

    public static void ads(int i, List list, C0770l c0770l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9747l c9747l = c0770l.yandex;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c9747l.admob(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        c9747l.remoteconfig(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        c9747l.metrica(i3);
        while (i2 < list.size()) {
            c9747l.subs(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void advert(int i, List list, C0770l c0770l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9747l c9747l = c0770l.yandex;
        int i2 = 0;
        if (!(list instanceof C14363l)) {
            if (!z) {
                while (i2 < list.size()) {
                    c9747l.billing(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c9747l.remoteconfig(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            c9747l.metrica(i3);
            while (i2 < list.size()) {
                c9747l.mopub(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C14363l c14363l = (C14363l) list;
        if (!z) {
            while (i2 < c14363l.f28111l) {
                c9747l.billing(i, c14363l.billing(i2));
                i2++;
            }
            return;
        }
        c9747l.remoteconfig(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c14363l.f28111l; i6++) {
            c14363l.billing(i6);
            i5 += 4;
        }
        c9747l.metrica(i5);
        while (i2 < c14363l.f28111l) {
            c9747l.mopub(c14363l.billing(i2));
            i2++;
        }
    }

    public static void amazon(int i, List list, C0770l c0770l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9747l c9747l = c0770l.yandex;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c9747l.startapp(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c9747l.remoteconfig(i, 2);
        int iLoadAd = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iLoadAd += C9747l.loadAd(((Long) list.get(i3)).longValue());
        }
        c9747l.metrica(iLoadAd);
        while (i2 < list.size()) {
            c9747l.adcel(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int billing(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C14363l)) {
            int iLoadAd = 0;
            while (i < size) {
                iLoadAd += C9747l.loadAd(((Integer) list.get(i)).intValue());
                i++;
            }
            return iLoadAd;
        }
        C14363l c14363l = (C14363l) list;
        int iLoadAd2 = 0;
        while (i < size) {
            iLoadAd2 += C9747l.loadAd(c14363l.billing(i));
            i++;
        }
        return iLoadAd2;
    }

    public static void crashlytics(int i, List list, C0770l c0770l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9747l c9747l = c0770l.yandex;
        int i2 = 0;
        if (!(list instanceof C14363l)) {
            if (!z) {
                while (i2 < list.size()) {
                    c9747l.vip(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c9747l.remoteconfig(i, 2);
            int iYandex = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iYandex += C9747l.yandex(((Integer) list.get(i3)).intValue());
            }
            c9747l.metrica(iYandex);
            while (i2 < list.size()) {
                c9747l.metrica(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C14363l c14363l = (C14363l) list;
        if (!z) {
            while (i2 < c14363l.f28111l) {
                c9747l.vip(i, c14363l.billing(i2));
                i2++;
            }
            return;
        }
        c9747l.remoteconfig(i, 2);
        int iYandex2 = 0;
        for (int i4 = 0; i4 < c14363l.f28111l; i4++) {
            iYandex2 += C9747l.yandex(c14363l.billing(i4));
        }
        c9747l.metrica(iYandex2);
        while (i2 < c14363l.f28111l) {
            c9747l.metrica(c14363l.billing(i2));
            i2++;
        }
    }

    public static int firebase(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C14363l)) {
            int iYandex = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iYandex += C9747l.yandex((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iYandex;
        }
        C14363l c14363l = (C14363l) list;
        int iYandex2 = 0;
        while (i < size) {
            int iBilling = c14363l.billing(i);
            iYandex2 += C9747l.yandex((iBilling >> 31) ^ (iBilling + iBilling));
            i++;
        }
        return iYandex2;
    }

    public static int isPro(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iLoadAd = 0;
        for (int i = 0; i < size; i++) {
            iLoadAd += C9747l.loadAd(((Long) list.get(i)).longValue());
        }
        return iLoadAd;
    }

    public static void isVip(int i, List list, C0770l c0770l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9747l c9747l = c0770l.yandex;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c9747l.admob(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c9747l.remoteconfig(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        c9747l.metrica(i3);
        while (i2 < list.size()) {
            c9747l.subs(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void license(int i, List list, C0770l c0770l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9747l c9747l = c0770l.yandex;
        int i2 = 0;
        if (!(list instanceof C14217l)) {
            if (!z) {
                while (i2 < list.size()) {
                    c9747l.billing(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            c9747l.remoteconfig(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            c9747l.metrica(i3);
            while (i2 < list.size()) {
                c9747l.mopub(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        C14217l c14217l = (C14217l) list;
        if (!z) {
            while (i2 < c14217l.f27818l) {
                c14217l.mopub(i2);
                c9747l.billing(i, Float.floatToRawIntBits(c14217l.f27819l[i2]));
                i2++;
            }
            return;
        }
        c9747l.remoteconfig(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c14217l.f27818l; i6++) {
            c14217l.mopub(i6);
            float f = c14217l.f27819l[i6];
            i5 += 4;
        }
        c9747l.metrica(i5);
        while (i2 < c14217l.f27818l) {
            c14217l.mopub(i2);
            c9747l.mopub(Float.floatToRawIntBits(c14217l.f27819l[i2]));
            i2++;
        }
    }

    public static void loadAd(int i, List list, C0770l c0770l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9747l c9747l = c0770l.yandex;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                c9747l.startapp(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        c9747l.remoteconfig(i, 2);
        int iLoadAd = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iLoadAd += C9747l.loadAd((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        c9747l.metrica(iLoadAd);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            c9747l.adcel((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    public static void metrica(Object obj, Object obj2) {
        C13639l c13639l = ((AbstractC13398l) obj2).zzb.yandex;
        if (c13639l.isEmpty()) {
            return;
        }
        AbstractC13398l abstractC13398l = (AbstractC13398l) obj;
        C5519l c5519l = abstractC13398l.zzb;
        if (c5519l.loadAd) {
            abstractC13398l.zzb = c5519l.clone();
        }
        C5519l c5519l2 = abstractC13398l.zzb;
        c5519l2.getClass();
        int i = c13639l.f26665l;
        for (int i2 = 0; i2 < i; i2++) {
            c5519l2.mopub(c13639l.crashlytics(i2));
        }
        Iterator it = c13639l.yandex().iterator();
        while (it.hasNext()) {
            c5519l2.mopub((Map.Entry) it.next());
        }
    }

    public static int mopub(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C9747l.yandex(i << 3) + 4) * size;
    }

    public static void pro(int i, List list, C0770l c0770l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9747l c9747l = c0770l.yandex;
        int i2 = 0;
        if (!(list instanceof C14363l)) {
            if (!z) {
                while (i2 < list.size()) {
                    c9747l.isPro(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c9747l.remoteconfig(i, 2);
            int iLoadAd = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iLoadAd += C9747l.loadAd(((Integer) list.get(i3)).intValue());
            }
            c9747l.metrica(iLoadAd);
            while (i2 < list.size()) {
                c9747l.firebase(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C14363l c14363l = (C14363l) list;
        if (!z) {
            while (i2 < c14363l.f28111l) {
                c9747l.isPro(i, c14363l.billing(i2));
                i2++;
            }
            return;
        }
        c9747l.remoteconfig(i, 2);
        int iLoadAd2 = 0;
        for (int i4 = 0; i4 < c14363l.f28111l; i4++) {
            iLoadAd2 += C9747l.loadAd(c14363l.billing(i4));
        }
        c9747l.metrica(iLoadAd2);
        while (i2 < c14363l.f28111l) {
            c9747l.firebase(c14363l.billing(i2));
            i2++;
        }
    }

    public static boolean purchase(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int remoteconfig(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C14363l)) {
            int iYandex = 0;
            while (i < size) {
                iYandex += C9747l.yandex(((Integer) list.get(i)).intValue());
                i++;
            }
            return iYandex;
        }
        C14363l c14363l = (C14363l) list;
        int iYandex2 = 0;
        while (i < size) {
            iYandex2 += C9747l.yandex(c14363l.billing(i));
            i++;
        }
        return iYandex2;
    }

    public static int smaato(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iLoadAd = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iLoadAd += C9747l.loadAd((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iLoadAd;
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
    public static void startapp(Object obj, Object obj2) {
        AbstractC15603l abstractC15603l = (AbstractC15603l) obj;
        C2886l c2886l = abstractC15603l.zzc;
        C2886l c2886l2 = ((AbstractC15603l) obj2).zzc;
        C2886l c2886l3 = C2886l.billing;
        if (!c2886l3.equals(c2886l2)) {
            if (c2886l3.equals(c2886l)) {
                int i = c2886l.yandex + c2886l2.yandex;
                int[] iArrCopyOf = Arrays.copyOf(c2886l.loadAd, i);
                System.arraycopy(c2886l2.loadAd, 0, iArrCopyOf, c2886l.yandex, c2886l2.yandex);
                Object[] objArrCopyOf = Arrays.copyOf(c2886l.crashlytics, i);
                System.arraycopy(c2886l2.crashlytics, 0, objArrCopyOf, c2886l.yandex, c2886l2.yandex);
                c2886l = new C2886l(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                c2886l.getClass();
                if (!c2886l2.equals(c2886l3)) {
                    if (!c2886l.purchase) {
                        C3010l.mopub();
                        return;
                    }
                    int i2 = c2886l.yandex + c2886l2.yandex;
                    c2886l.purchase(i2);
                    System.arraycopy(c2886l2.loadAd, 0, c2886l.loadAd, c2886l.yandex, c2886l2.yandex);
                    System.arraycopy(c2886l2.crashlytics, 0, c2886l.crashlytics, c2886l.yandex, c2886l2.yandex);
                    c2886l.yandex = i2;
                }
            }
        }
        abstractC15603l.zzc = c2886l;
    }

    public static int subs(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C14363l)) {
            int iLoadAd = 0;
            while (i < size) {
                iLoadAd += C9747l.loadAd(((Integer) list.get(i)).intValue());
                i++;
            }
            return iLoadAd;
        }
        C14363l c14363l = (C14363l) list;
        int iLoadAd2 = 0;
        while (i < size) {
            iLoadAd2 += C9747l.loadAd(c14363l.billing(i));
            i++;
        }
        return iLoadAd2;
    }

    public static void subscription(int i, List list, C0770l c0770l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9747l c9747l = c0770l.yandex;
        int i2 = 0;
        if (!(list instanceof C14363l)) {
            if (!z) {
                while (i2 < list.size()) {
                    c9747l.isPro(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c9747l.remoteconfig(i, 2);
            int iLoadAd = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iLoadAd += C9747l.loadAd(((Integer) list.get(i3)).intValue());
            }
            c9747l.metrica(iLoadAd);
            while (i2 < list.size()) {
                c9747l.firebase(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C14363l c14363l = (C14363l) list;
        if (!z) {
            while (i2 < c14363l.f28111l) {
                c9747l.isPro(i, c14363l.billing(i2));
                i2++;
            }
            return;
        }
        c9747l.remoteconfig(i, 2);
        int iLoadAd2 = 0;
        for (int i4 = 0; i4 < c14363l.f28111l; i4++) {
            iLoadAd2 += C9747l.loadAd(c14363l.billing(i4));
        }
        c9747l.metrica(iLoadAd2);
        while (i2 < c14363l.f28111l) {
            c9747l.firebase(c14363l.billing(i2));
            i2++;
        }
    }

    public static void tapsense(int i, List list, C0770l c0770l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9747l c9747l = c0770l.yandex;
        int i2 = 0;
        if (!(list instanceof C14363l)) {
            if (!z) {
                while (i2 < list.size()) {
                    c9747l.billing(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c9747l.remoteconfig(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            c9747l.metrica(i3);
            while (i2 < list.size()) {
                c9747l.mopub(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C14363l c14363l = (C14363l) list;
        if (!z) {
            while (i2 < c14363l.f28111l) {
                c9747l.billing(i, c14363l.billing(i2));
                i2++;
            }
            return;
        }
        c9747l.remoteconfig(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c14363l.f28111l; i6++) {
            c14363l.billing(i6);
            i5 += 4;
        }
        c9747l.metrica(i5);
        while (i2 < c14363l.f28111l) {
            c9747l.mopub(c14363l.billing(i2));
            i2++;
        }
    }

    public static int vip(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iLoadAd = 0;
        for (int i = 0; i < size; i++) {
            iLoadAd += C9747l.loadAd(((Long) list.get(i)).longValue());
        }
        return iLoadAd;
    }

    public static void yandex(int i, List list, C0770l c0770l, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C9747l c9747l = c0770l.yandex;
        int i2 = 0;
        if (!(list instanceof C14363l)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    c9747l.vip(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            c9747l.remoteconfig(i, 2);
            int iYandex = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iYandex += C9747l.yandex((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            c9747l.metrica(iYandex);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                c9747l.metrica((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        C14363l c14363l = (C14363l) list;
        if (!z) {
            while (i2 < c14363l.f28111l) {
                int iBilling = c14363l.billing(i2);
                c9747l.vip(i, (iBilling >> 31) ^ (iBilling + iBilling));
                i2++;
            }
            return;
        }
        c9747l.remoteconfig(i, 2);
        int iYandex2 = 0;
        for (int i4 = 0; i4 < c14363l.f28111l; i4++) {
            int iBilling2 = c14363l.billing(i4);
            iYandex2 += C9747l.yandex((iBilling2 >> 31) ^ (iBilling2 + iBilling2));
        }
        c9747l.metrica(iYandex2);
        while (i2 < c14363l.f28111l) {
            int iBilling3 = c14363l.billing(i2);
            c9747l.metrica((iBilling3 >> 31) ^ (iBilling3 + iBilling3));
            i2++;
        }
    }
}
