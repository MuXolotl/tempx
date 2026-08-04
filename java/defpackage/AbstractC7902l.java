package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًَؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7902l {
    public static final C15578l yandex = new C15578l(-1281002169, false, new C13982l(11));
    public static final C15578l loadAd = new C15578l(-611165370, false, new C13982l(12));
    public static final C15578l crashlytics = new C15578l(-976257904, false, new C13982l(13));

    public static final C16307l amazon(C17423l c17423l, Function1 function1, C6956l c6956l) {
        Object c2831l;
        Object obj;
        AbstractC8020l.vip(c17423l, c6956l);
        Object objVip = AbstractC8020l.vip(function1, c6956l);
        Object[] objArr = new Object[0];
        Object objM2132native = c6956l.m2132native();
        Object obj2 = C1867l.yandex;
        if (objM2132native == obj2) {
            objM2132native = new C7282l(2);
            c6956l.m2147try(objM2132native);
        }
        Object obj3 = (String) AbstractC0825l.firebase(objArr, (Function0) objM2132native, c6956l);
        InterfaceC8977l interfaceC8977l = (InterfaceC8977l) c6956l.isPro(AbstractC12504l.yandex);
        if (interfaceC8977l == null) {
            c6956l.m2123default(1213380307);
            Object baseContext = (Context) c6956l.isPro(AbstractC1242l.loadAd);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof InterfaceC8977l) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            interfaceC8977l = (InterfaceC8977l) baseContext;
        } else {
            c6956l.m2123default(1213379439);
        }
        c6956l.startapp(false);
        if (interfaceC8977l == null) {
            C8339l.smaato("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        Object objAmazon = interfaceC8977l.amazon();
        Object objM2132native2 = c6956l.m2132native();
        if (objM2132native2 == obj2) {
            objM2132native2 = new C2429l();
            c6956l.m2147try(objM2132native2);
        }
        C2429l c2429l = (C2429l) objM2132native2;
        Object objM2132native3 = c6956l.m2132native();
        if (objM2132native3 == obj2) {
            objM2132native3 = new C16307l(c2429l);
            c6956l.m2147try(objM2132native3);
        }
        C16307l c16307l = (C16307l) objM2132native3;
        boolean zAdmob = c6956l.admob(c2429l) | c6956l.admob(objAmazon) | c6956l.billing(obj3) | c6956l.admob(c17423l) | c6956l.billing(objVip);
        Object objM2132native4 = c6956l.m2132native();
        if (zAdmob || objM2132native4 == obj2) {
            obj = c17423l;
            c2831l = new C2831l(c2429l, objAmazon, obj3, obj, objVip, 0);
            c6956l.m2147try(c2831l);
        } else {
            c2831l = objM2132native4;
            obj = c17423l;
        }
        Function1 function2 = (Function1) c2831l;
        boolean zBilling = c6956l.billing(objAmazon) | c6956l.billing(obj3) | c6956l.billing(obj);
        Object objM2132native5 = c6956l.m2132native();
        if (zBilling || objM2132native5 == obj2) {
            objM2132native5 = new C10574l(function2);
            c6956l.m2147try(objM2132native5);
        }
        return c16307l;
    }

    public static final String crashlytics(C6956l c6956l, int i) {
        c6956l.isPro(AbstractC1242l.yandex);
        return ((Resources) c6956l.isPro(AbstractC1242l.crashlytics)).getString(i);
    }

    public static Set loadAd() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final boolean yandex(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }
}
