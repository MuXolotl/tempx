package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lًّؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3352l {
    public static final C15578l yandex = new C15578l(1372584573, false, new C1590l(16));

    public static int[] amazon(String str) {
        List listSingletonList;
        Collection collectionM4247try;
        try {
            Pattern patternCompile = Pattern.compile("\\.");
            AbstractC12024l.m3312abstract(0);
            Matcher matcher = patternCompile.matcher(str);
            if (matcher.find()) {
                ArrayList arrayList = new ArrayList(10);
                int iEnd = 0;
                do {
                    arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
                    iEnd = matcher.end();
                } while (matcher.find());
                arrayList.add(str.subSequence(iEnd, str.length()).toString());
                listSingletonList = arrayList;
            } else {
                listSingletonList = Collections.singletonList(str.toString());
            }
            if (listSingletonList.isEmpty()) {
                collectionM4247try = C2580l.f5619l;
                break;
            }
            ListIterator listIterator = listSingletonList.listIterator(listSingletonList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    collectionM4247try = C2580l.f5619l;
                    break;
                }
                if (((String) listIterator.previous()).length() != 0) {
                    collectionM4247try = AbstractC16901l.m4247try(listSingletonList, listIterator.nextIndex() + 1);
                    break;
                }
            }
            String[] strArr = (String[]) collectionM4247try.toArray(new String[0]);
            int[] iArr = new int[strArr.length];
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = Integer.parseInt(strArr[i]);
            }
            return iArr;
        } catch (Exception unused) {
            return new int[]{-1};
        }
    }

    public static boolean crashlytics() {
        boolean zBooleanValue;
        int i;
        int i2;
        String str = Build.VERSION.INCREMENTAL;
        if (AbstractC8576l.yandex(str, "20.2.20")) {
            return true;
        }
        int[] iArrAmazon = amazon(str);
        int[] iArrAmazon2 = amazon("20.2.20");
        int length = iArrAmazon2.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (i3 >= iArrAmazon.length || (i = iArrAmazon[i3]) < (i2 = iArrAmazon2[i3])) {
                if ("0".equals(loadAd("persist.sys.miui_optimization"))) {
                    zBooleanValue = true;
                } else {
                    try {
                        zBooleanValue = ((Boolean) Class.forName("android.miui.AppOpsUtils").getDeclaredMethod("isXOptMode", null).invoke(null, null)).booleanValue();
                    } catch (Exception unused) {
                        zBooleanValue = false;
                    }
                }
                return zBooleanValue;
            }
            if (i > i2) {
                return true;
            }
        }
        return true;
    }

    public static String loadAd(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final AbstractC18041l purchase(InterfaceC16902l interfaceC16902l) throws C12948l {
        InterfaceC8371l interfaceC8371lSignature = interfaceC16902l.Signature();
        int i = 0;
        if (interfaceC8371lSignature instanceof InterfaceC10607l) {
            List parameters = ((InterfaceC10607l) interfaceC8371lSignature).metrica().getParameters();
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(parameters, 10));
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC16902l) it.next()).metrica());
            }
            List upperBounds = interfaceC16902l.getUpperBounds();
            AbstractC16860l abstractC16860lPurchase = AbstractC3759l.purchase(interfaceC16902l);
            AbstractC18041l abstractC18041lAdmob = new C2201l(new C13105l(i, arrayList)).admob(3, (AbstractC18041l) AbstractC16901l.m4231native(upperBounds));
            return abstractC18041lAdmob == null ? abstractC16860lPurchase.metrica() : abstractC18041lAdmob;
        }
        if (!(interfaceC8371lSignature instanceof InterfaceC4884l)) {
            C8339l.metrica("Unsupported descriptor type to build star projection type based on type parameters of it");
            return null;
        }
        List typeParameters = ((InterfaceC4884l) interfaceC8371lSignature).getTypeParameters();
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(typeParameters, 10));
        Iterator it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((InterfaceC16902l) it2.next()).metrica());
        }
        List upperBounds2 = interfaceC16902l.getUpperBounds();
        AbstractC16860l abstractC16860lPurchase2 = AbstractC3759l.purchase(interfaceC16902l);
        AbstractC18041l abstractC18041lAdmob2 = new C2201l(new C13105l(i, arrayList2)).admob(3, (AbstractC18041l) AbstractC16901l.m4231native(upperBounds2));
        return abstractC18041lAdmob2 == null ? abstractC16860lPurchase2.metrica() : abstractC18041lAdmob2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c A[RETURN] */
    public static final boolean yandex(C15421l c15421l, Set set) {
        if (c15421l.loadAd()) {
            return set.contains(c15421l);
        }
        for (Object obj : set) {
            C15421l c15421l2 = (C15421l) obj;
            AbstractC5641l.purchase("Fully specified range is not actually fully specified.", c15421l2.loadAd());
            int i = c15421l.loadAd;
            if (i == 0 || i == c15421l2.loadAd) {
                AbstractC5641l.purchase("Fully specified range is not actually fully specified.", c15421l2.loadAd());
                int i2 = c15421l.yandex;
                if (i2 != 0) {
                    int i3 = c15421l2.yandex;
                    if ((i2 != 2 || i3 == 1) && i2 != i3) {
                    }
                }
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }
}
