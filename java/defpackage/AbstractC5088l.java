package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: lؗۖ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5088l {
    public static int billing = 3;
    public static final C12630l yandex = new C12630l(-1.0f);
    public static final C12630l loadAd = new C12630l(1.0f);
    public static final C4157l crashlytics = new C4157l(-1.0f);
    public static final C4157l amazon = new C4157l(1.0f);
    public static final C15696l purchase = new C15696l(24);

    public static void Signature(String str, String str2, Throwable th) {
        String strSubscription = subscription(str);
        if (vip(5, strSubscription)) {
            Log.w(strSubscription, str2, th);
        }
    }

    public static String ad(int i, int i2, String str) {
        if (i < 0) {
            return AbstractC9905l.subs("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return AbstractC9905l.subs("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        C8339l.metrica(AbstractC0653l.vip(i2, "negative size: "));
        return null;
    }

    public static boolean adcel(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof AbstractC10977l) {
            collection = ((C8970l) ((AbstractC10977l) collection)).vip();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= set.remove(it.next());
            }
            return zRemove;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }

    public static int admob(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object ads(kotlin.jvm.functions.Function1 r4, defpackage.InterfaceC14029l r5) {
        /*
            boolean r0 = r5 instanceof defpackage.C13089l
            if (r0 == 0) goto L13
            r0 = r5
            lٍْؓ r0 = (defpackage.C13089l) r0
            int r1 = r0.f25609l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25609l = r1
            goto L18
        L13:
            lٍْؓ r0 = new lٍْؓ
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f25610l
            int r1 = r0.f25609l
            r2 = 0
            switch(r1) {
                case 0: goto L54;
                case 1: goto L4b;
                case 2: goto L3f;
                case 3: goto L3f;
                case 4: goto L36;
                case 5: goto L2a;
                case 6: goto L2a;
                case 7: goto L26;
                default: goto L20;
            }
        L20:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r4)
            return r2
        L26:
            defpackage.AbstractC2829l.crashlytics(r5)
            return r5
        L2a:
            defpackage.AbstractC2829l.crashlytics(r5)     // Catch: java.lang.Throwable -> L2e
            throw r2
        L2e:
            throw r2     // Catch: java.lang.Throwable -> L2f
        L2f:
            r2.getClass()
            defpackage.C11983l.crashlytics()
            return r2
        L36:
            defpackage.AbstractC2829l.crashlytics(r5)
            lًًٌ r5 = (defpackage.AbstractC7859l) r5
            r5.getClass()
            throw r2
        L3f:
            defpackage.AbstractC2829l.crashlytics(r5)     // Catch: java.lang.Throwable -> L43
            throw r2
        L43:
            throw r2     // Catch: java.lang.Throwable -> L44
        L44:
            r2.getClass()
            defpackage.C11983l.crashlytics()
            return r2
        L4b:
            defpackage.AbstractC2829l.crashlytics(r5)
            lًًٌ r5 = (defpackage.AbstractC7859l) r5
            r5.getClass()
            throw r2
        L54:
            defpackage.AbstractC2829l.crashlytics(r5)
            r5 = 7
            r0.f25609l = r5
            java.lang.Object r4 = r4.invoke(r0)
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r4 != r5) goto L63
            return r5
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5088l.ads(kotlin.jvm.functions.Function1, lٌؚٓ):java.lang.Object");
    }

    public static void amazon(String str, String str2, Throwable th) {
        String strSubscription = subscription(str);
        if (vip(6, strSubscription)) {
            Log.e(strSubscription, str2, th);
        }
    }

    public static C8833l billing(Set set, InterfaceC0629l interfaceC0629l) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof C8833l)) {
                return new C8562l(set2, interfaceC0629l);
            }
            C8833l c8833l = (C8833l) set2;
            InterfaceC0629l interfaceC0629l2 = c8833l.f18138l;
            interfaceC0629l2.getClass();
            return new C8562l((SortedSet) c8833l.f18139l, new C6105l(Arrays.asList(interfaceC0629l2, interfaceC0629l)));
        }
        if (!(set instanceof C8833l)) {
            set.getClass();
            return new C8833l(set, interfaceC0629l);
        }
        C8833l c8833l2 = (C8833l) set;
        InterfaceC0629l interfaceC0629l3 = c8833l2.f18138l;
        interfaceC0629l3.getClass();
        return new C8833l(c8833l2.f18139l, new C6105l(Arrays.asList(interfaceC0629l3, interfaceC0629l)));
    }

    public static void crashlytics(String str, String str2) {
        String strSubscription = subscription(str);
        if (vip(6, strSubscription)) {
            Log.e(strSubscription, str2);
        }
    }

    public static boolean firebase(String str) {
        return vip(3, subscription(str));
    }

    public static C2425l isPro(Set set, AbstractC8481l abstractC8481l) {
        AbstractC12442l.metrica(set, "set1");
        AbstractC12442l.metrica(abstractC8481l, "set2");
        return new C2425l(set, abstractC8481l);
    }

    public static void license(int i, int i2) {
        String strSubs;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strSubs = AbstractC9905l.subs("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    C8339l.metrica(AbstractC0653l.vip(i2, "negative size: "));
                    return;
                }
                strSubs = AbstractC9905l.subs("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strSubs);
        }
    }

    public static void loadAd(String str, String str2, Throwable th) {
        String strSubscription = subscription(str);
        if (vip(3, strSubscription)) {
            Log.d(strSubscription, str2, th);
        }
    }

    public static boolean metrica() {
        return vip(5, subscription("CXCP"));
    }

    public static ArrayList mopub(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static void pro(int i, int i2, int i3) {
        String strAd;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strAd = ad(i, i3, "start index");
            } else {
                strAd = (i2 < 0 || i2 > i3) ? ad(i2, i3, "end index") : AbstractC9905l.subs("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strAd);
        }
    }

    public static boolean purchase(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static boolean remoteconfig() {
        return vip(4, subscription("CXCP"));
    }

    public static boolean smaato() {
        return vip(6, subscription("CXCP"));
    }

    public static HashSet startapp(int i) {
        int iCeil;
        if (i < 3) {
            AbstractC12832l.loadAd(i, "expectedSize");
            iCeil = i + 1;
        } else {
            iCeil = i < 1073741824 ? (int) Math.ceil(((double) i) / 0.75d) : Alert.DURATION_SHOW_INDEFINITELY;
        }
        return new HashSet(iCeil);
    }

    public static void subs(String str, String str2) {
        String strSubscription = subscription(str);
        if (vip(4, strSubscription)) {
            Log.i(strSubscription, str2);
        }
    }

    public static String subscription(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    public static void tapsense(String str, String str2) {
        String strSubscription = subscription(str);
        if (vip(5, strSubscription)) {
            Log.w(strSubscription, str2);
        }
    }

    public static boolean vip(int i, String str) {
        return billing <= i || Log.isLoggable(str, i);
    }

    public static void yandex(String str, String str2) {
        String strSubscription = subscription(str);
        if (vip(3, strSubscription)) {
            Log.d(strSubscription, str2);
        }
    }
}
