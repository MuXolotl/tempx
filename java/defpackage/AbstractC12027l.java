package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِٟ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12027l {
    public static final C15578l yandex = new C15578l(-1472995251, false, new C11902l(0));
    public static final C15578l loadAd = new C15578l(1934101421, false, new C11902l(1));
    public static final C15578l crashlytics = new C15578l(-1637550186, false, new C11902l(2));
    public static final C15578l amazon = new C15578l(-1211519641, false, new C10673l(0));
    public static final C15578l purchase = new C15578l(-218895566, false, new C11902l(3));
    public static final C15578l billing = new C15578l(1688112943, false, new C10673l(1));
    public static final C15578l mopub = new C15578l(-1628616208, false, new C11902l(4));

    public static int amazon(Object obj) {
        return crashlytics(obj == null ? 0 : obj.hashCode());
    }

    public static int crashlytics(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static final InterfaceC4138l loadAd(String str, C6956l c6956l) {
        InterfaceC4138l c12505l;
        c6956l.m2123default(923020361);
        c6956l.m2123default(1537041123);
        Object objM2132native = c6956l.m2132native();
        Object obj = C1867l.yandex;
        int i = 0;
        if (objM2132native == obj) {
            objM2132native = new C9673l(i);
            c6956l.m2147try(objM2132native);
        }
        Object obj2 = (Function1) objM2132native;
        c6956l.startapp(false);
        c6956l.m2123default(-1732095526);
        if (((Boolean) c6956l.isPro(AbstractC13622l.yandex)).booleanValue()) {
            c12505l = new C12505l(C17306l.yandex);
        } else {
            c6956l.m2123default(1424240517);
            Context context = (Context) c6956l.isPro(AbstractC1242l.loadAd);
            c6956l.m2123default(1134374053);
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == obj) {
                Context baseContext = context;
                while (true) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        C8339l.smaato("Permissions should be called in the context of an Activity");
                        return null;
                    }
                    if (baseContext instanceof Activity) {
                        objM2132native2 = new C2832l(str, context, (Activity) baseContext);
                        c6956l.m2147try(objM2132native2);
                        break;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                }
            }
            C2832l c2832l = (C2832l) objM2132native2;
            c6956l.startapp(false);
            AbstractC8441l.yandex(c2832l, null, c6956l, 0);
            C17423l c17423l = new C17423l(3);
            c6956l.m2123default(1134386901);
            boolean zBilling = c6956l.billing(c2832l) | c6956l.billing(obj2);
            Object objM2132native3 = c6956l.m2132native();
            if (zBilling || objM2132native3 == obj) {
                objM2132native3 = new C8854l(c2832l, obj2, 7);
                c6956l.m2147try(objM2132native3);
            }
            c6956l.startapp(false);
            Object objAmazon = AbstractC7902l.amazon(c17423l, (Function1) objM2132native3, c6956l);
            c6956l.m2123default(1134391322);
            boolean zBilling2 = c6956l.billing(c2832l) | c6956l.admob(objAmazon);
            Object objM2132native4 = c6956l.m2132native();
            if (zBilling2 || objM2132native4 == obj) {
                objM2132native4 = new C8854l(c2832l, objAmazon, 8);
                c6956l.m2147try(objM2132native4);
            }
            c6956l.startapp(false);
            AbstractC12311l.yandex(c2832l, objAmazon, (Function1) objM2132native4, c6956l);
            c6956l.startapp(false);
            c12505l = c2832l;
        }
        c6956l.startapp(false);
        c6956l.startapp(false);
        return c12505l;
    }

    public static C5378l yandex(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        C8934l c8934l = new C8934l(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(c8934l, 10));
        Iterator it = c8934l.iterator();
        while (true) {
            C16991l c16991l = (C16991l) it;
            if (!c16991l.f33123l) {
                int[] iArrM4222implements = AbstractC16901l.m4222implements(arrayList);
                return new C5378l(Arrays.copyOf(iArrM4222implements, iArrM4222implements.length));
            }
            c16991l.nextInt();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
    }

    public abstract InterfaceC0583l purchase(C5425l c5425l, InterfaceC13789l interfaceC13789l);
}
