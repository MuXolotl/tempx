package defpackage;

import android.os.Build;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: lؚٗٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7303l {
    public static final C15578l yandex = new C15578l(1449428131, false, new C11902l(7));
    public static final C15578l loadAd = new C15578l(-748296189, false, new C11902l(8));
    public static final C15578l crashlytics = new C15578l(1006157473, false, new C11902l(9));
    public static final C15578l amazon = new C15578l(2050698466, false, new C11902l(10));
    public static final C15578l purchase = new C15578l(1212592272, false, new C11891l(10));
    public static final C15578l billing = new C15578l(-327621172, false, new C10673l(3));

    public static final int amazon(C18283l c18283l) {
        if (c18283l == null) {
            return 0;
        }
        String str = c18283l.amazon;
        return str != null ? str.hashCode() : Objects.hash(c18283l.yandex, c18283l.crashlytics, Boolean.valueOf(c18283l.purchase), Boolean.valueOf(c18283l.billing));
    }

    public static final InterfaceC16588l crashlytics(InterfaceC16588l interfaceC16588l) {
        return interfaceC16588l.purchase().crashlytics() ? interfaceC16588l : new C8468l(interfaceC16588l);
    }

    public static InterfaceC7637l loadAd(String str, Collection collection) {
        InterfaceC7637l c0116l;
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC18041l) it.next()).mo1341public());
        }
        C5047l c5047lSubs = AbstractC4654l.subs(arrayList);
        int i = c5047lSubs.f10316l;
        if (i != 0) {
            c0116l = i != 1 ? new C0116l(str, (InterfaceC7637l[]) c5047lSubs.toArray(new InterfaceC7637l[0])) : (InterfaceC7637l) c5047lSubs.get(0);
        } else {
            c0116l = C3198l.loadAd;
        }
        return c5047lSubs.f10316l <= 1 ? c0116l : new C2144l(c0116l);
    }

    public static final C18113l purchase(C6956l c6956l) {
        C9946l c9946l = AbstractC1844l.yandex;
        boolean z = Build.VERSION.SDK_INT >= 31;
        Object objM2132native = c6956l.m2132native();
        if (objM2132native == C1867l.yandex) {
            objM2132native = new C18113l(z);
            c6956l.m2147try(objM2132native);
        }
        C18113l c18113l = (C18113l) objM2132native;
        c18113l.loadAd.setValue(Boolean.valueOf(z));
        return c18113l;
    }

    public static final boolean yandex(C18283l c18283l, C18283l c18283l2) {
        if (c18283l == null && c18283l2 == null) {
            return true;
        }
        if (c18283l == null || c18283l2 == null) {
            return false;
        }
        String str = c18283l.amazon;
        String str2 = c18283l2.amazon;
        if (str == null && str2 == null) {
            return AbstractC8576l.yandex(Objects.toString(c18283l.yandex), Objects.toString(c18283l2.yandex)) && AbstractC8576l.yandex(c18283l.crashlytics, c18283l2.crashlytics) && c18283l.purchase == c18283l2.purchase && c18283l.billing == c18283l2.billing;
        }
        return AbstractC8576l.yandex(str, str2);
    }
}
