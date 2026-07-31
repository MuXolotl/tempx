package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚّؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12396l {
    public static final C15578l yandex = new C15578l(1121833241, false, new C3817l(13));
    public static final C15578l loadAd = new C15578l(-248099526, false, new C3817l(14));
    public static final C15578l crashlytics = new C15578l(-1787666943, false, new C4076l(5));

    public static void amazon(ArrayList arrayList, List list, int i, Function1 function1, Function2 function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Character ch = (Character) function2.invoke(obj, Integer.valueOf(i));
            ch.getClass();
            Object arrayList2 = linkedHashMap.get(ch);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(ch, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            char cCharValue = ((Character) entry.getKey()).charValue();
            List list2 = (List) entry.getValue();
            int i2 = i + 1;
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : list2) {
                if (((Number) function1.invoke(obj2)).intValue() > i2) {
                    arrayList4.add(obj2);
                }
            }
            amazon(arrayList3, arrayList4, i2, function1, function2);
            arrayList3.trimToSize();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : list2) {
                if (((Number) function1.invoke(obj3)).intValue() == i2) {
                    arrayList5.add(obj3);
                }
            }
            arrayList.add(new C7215l(cCharValue, arrayList5, arrayList3));
        }
    }

    public static AbstractC8831l billing(byte[] bArr) {
        AbstractC8831l c6254l;
        C6129l c6129l = new C6129l(bArr);
        String strPurchase = c6129l.purchase();
        if ("ssh-rsa".equals(strPurchase)) {
            c6254l = new C6963l(false, c6129l.crashlytics(), c6129l.crashlytics(), false);
        } else if ("ssh-dss".equals(strPurchase)) {
            c6254l = new C4767l(c6129l.crashlytics(), new C12933l(c6129l.crashlytics(), c6129l.crashlytics(), c6129l.crashlytics()));
        } else if (strPurchase.startsWith("ecdsa")) {
            String strPurchase2 = c6129l.purchase();
            Cfor cfor = (Cfor) AbstractC9856l.loadAd.get(strPurchase2);
            C7100l c7100lLoadAd = AbstractC6662l.loadAd(cfor);
            if (c7100lLoadAd == null) {
                C8339l.smaato(AbstractC14814l.adcel("unable to find curve for ", strPurchase, " using curve name ", strPurchase2));
                return null;
            }
            AbstractC8859l abstractC8859lMopub = c7100lLoadAd.f14871l.f6465l.mopub(c6129l.amazon());
            C2542l c2542l = new C2542l(c7100lLoadAd);
            c2542l.f5539l = cfor;
            c6254l = new C4148l(abstractC8859lMopub, c2542l);
        } else if (strPurchase.equals("sk-ecdsa-sha2-nistp256@openssh.com")) {
            String strPurchase3 = c6129l.purchase();
            Cfor cfor2 = (Cfor) AbstractC9856l.loadAd.get(strPurchase3);
            C7100l c7100lLoadAd2 = AbstractC6662l.loadAd(cfor2);
            if (c7100lLoadAd2 == null) {
                C8339l.smaato(AbstractC14814l.adcel("unable to find curve for ", strPurchase, " using curve name ", strPurchase3));
                return null;
            }
            AbstractC11918l abstractC11918l = c7100lLoadAd2.f14871l.f6465l;
            byte[] bArrAmazon = c6129l.amazon();
            c6129l.purchase();
            AbstractC8859l abstractC8859lMopub2 = abstractC11918l.mopub(bArrAmazon);
            C2542l c2542l2 = new C2542l(c7100lLoadAd2);
            c2542l2.f5539l = cfor2;
            c6254l = new C4148l(abstractC8859lMopub2, c2542l2);
        } else if ("ssh-ed25519".equals(strPurchase)) {
            byte[] bArrAmazon2 = c6129l.amazon();
            if (bArrAmazon2.length != 32) {
                C8339l.smaato("public key value of wrong length");
                return null;
            }
            c6254l = new C6254l(bArrAmazon2, 0);
        } else if ("sk-ssh-ed25519@openssh.com".equals(strPurchase)) {
            byte[] bArrAmazon3 = c6129l.amazon();
            if (bArrAmazon3.length != 32) {
                C8339l.smaato("public key value of wrong length");
                return null;
            }
            c6129l.purchase();
            c6254l = new C6254l(bArrAmazon3, 0);
        } else {
            c6254l = null;
        }
        if (c6254l == null) {
            C8339l.metrica("unable to parse key");
            return null;
        }
        if (c6129l.loadAd >= bArr.length) {
            return c6254l;
        }
        C8339l.metrica("decoded key has trailing data");
        return null;
    }

    public static C10685l crashlytics(List list, Function1 function1, Function2 function2) {
        Object next;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Comparable comparable = (Comparable) function1.invoke(next);
                do {
                    Object next2 = it.next();
                    Comparable comparable2 = (Comparable) function1.invoke(next2);
                    if (comparable.compareTo(comparable2) < 0) {
                        next = next2;
                        comparable = comparable2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        if (next == null) {
            C1759l.firebase("Unable to build char tree from an empty list");
            return null;
        }
        ((Number) function1.invoke(next)).intValue();
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((Number) function1.invoke(it2.next())).intValue() == 0) {
                    C8339l.metrica("There should be no empty entries");
                    return null;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        amazon(arrayList, list, 0, function1, function2);
        arrayList.trimToSize();
        return new C10685l(new C7215l((char) 0, C2580l.f5619l, arrayList));
    }

    public static final void loadAd(TextView textView, C9675l c9675l) {
        Drawable drawableLoadAd;
        Drawable drawablePurchase;
        Drawable drawableLoadAd2;
        Drawable drawablePurchase2;
        Drawable drawableLoadAd3;
        Drawable drawablePurchase3;
        Drawable drawableLoadAd4;
        Integer num = c9675l.vip;
        Integer num2 = c9675l.firebase;
        Integer numValueOf = c9675l.subs;
        Drawable drawablePurchase4 = null;
        if (numValueOf == null) {
            Integer num3 = c9675l.remoteconfig;
            if (num3 != null) {
                numValueOf = Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(num3.intValue()));
            } else {
                numValueOf = null;
            }
            if (numValueOf == null) {
                if (num != null) {
                    numValueOf = Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(num.intValue()));
                } else {
                    numValueOf = null;
                }
            }
        }
        Integer numValueOf2 = c9675l.admob;
        if (numValueOf2 == null) {
            Integer num4 = c9675l.smaato;
            if (num4 != null) {
                numValueOf2 = Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(num4.intValue()));
            } else {
                numValueOf2 = null;
            }
            if (numValueOf2 == null) {
                if (num != null) {
                    numValueOf2 = Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(num.intValue()));
                } else {
                    numValueOf2 = null;
                }
            }
        }
        Integer num5 = c9675l.yandex;
        if (num5 != null) {
            drawableLoadAd = AbstractC13273l.loadAd(textView.getContext(), num5.intValue());
        } else {
            drawableLoadAd = null;
        }
        if (drawableLoadAd != null) {
            drawablePurchase = AbstractC12754l.purchase(drawableLoadAd, textView.getContext(), numValueOf2, numValueOf);
            if (num2 != null) {
                drawablePurchase.setTintList(ColorStateList.valueOf(num2.intValue()));
            }
        } else {
            drawablePurchase = null;
        }
        Integer num6 = c9675l.loadAd;
        if (num6 != null) {
            drawableLoadAd2 = AbstractC13273l.loadAd(textView.getContext(), num6.intValue());
        } else {
            drawableLoadAd2 = null;
        }
        if (drawableLoadAd2 != null) {
            drawablePurchase2 = AbstractC12754l.purchase(drawableLoadAd2, textView.getContext(), numValueOf2, numValueOf);
            if (num2 != null) {
                drawablePurchase2.setTintList(ColorStateList.valueOf(num2.intValue()));
            }
        } else {
            drawablePurchase2 = null;
        }
        Integer num7 = c9675l.crashlytics;
        if (num7 != null) {
            drawableLoadAd3 = AbstractC13273l.loadAd(textView.getContext(), num7.intValue());
        } else {
            drawableLoadAd3 = null;
        }
        if (drawableLoadAd3 != null) {
            drawablePurchase3 = AbstractC12754l.purchase(drawableLoadAd3, textView.getContext(), numValueOf2, numValueOf);
            if (num2 != null) {
                drawablePurchase3.setTintList(ColorStateList.valueOf(num2.intValue()));
            }
        } else {
            drawablePurchase3 = null;
        }
        Integer num8 = c9675l.amazon;
        if (num8 != null) {
            drawableLoadAd4 = AbstractC13273l.loadAd(textView.getContext(), num8.intValue());
        } else {
            drawableLoadAd4 = null;
        }
        if (drawableLoadAd4 != null) {
            drawablePurchase4 = AbstractC12754l.purchase(drawableLoadAd4, textView.getContext(), numValueOf2, numValueOf);
            if (num2 != null) {
                drawablePurchase4.setTintList(ColorStateList.valueOf(num2.intValue()));
            }
        }
        if (c9675l.purchase) {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawablePurchase2, drawablePurchase4, drawablePurchase, drawablePurchase3);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawablePurchase, drawablePurchase4, drawablePurchase2, drawablePurchase3);
        }
        Integer num9 = c9675l.mopub;
        if (num9 != null) {
            textView.setCompoundDrawablePadding(num9.intValue());
        } else {
            Integer num10 = c9675l.isPro;
            if (num10 != null) {
                textView.setCompoundDrawablePadding(textView.getContext().getResources().getDimensionPixelSize(num10.intValue()));
            }
        }
        textView.setContentDescription(c9675l.billing);
    }

    public static byte[] purchase(AbstractC8831l abstractC8831l) {
        C5008l c5008l;
        Object obj;
        String str;
        if (abstractC8831l == null) {
            C8339l.metrica("cipherParameters was null.");
            return null;
        }
        if (!(abstractC8831l instanceof C6963l)) {
            if (abstractC8831l instanceof C4148l) {
                C4148l c4148l = (C4148l) abstractC8831l;
                C7838l c7838l = c4148l.f4542l;
                C5008l c5008l2 = new C5008l(22);
                if (c7838l instanceof C2542l) {
                    str = (String) AbstractC9856l.yandex.get(((C2542l) c7838l).f5539l);
                } else {
                    Map map = AbstractC9856l.yandex;
                    str = (String) AbstractC9856l.crashlytics.get(AbstractC9856l.amazon.get(c7838l.f16360l));
                }
                if (str == null) {
                    C8339l.metrica("unable to derive ssh curve name for ".concat(c7838l.f16360l.getClass().getName()));
                    return null;
                }
                c5008l2.m1663extends(AbstractC9008l.crashlytics("ecdsa-sha2-".concat(str)));
                c5008l2.m1663extends(AbstractC9008l.crashlytics(str));
                c5008l2.m1663extends(c4148l.f8515l.admob(false));
                obj = c5008l2.f10245l;
            } else if (abstractC8831l instanceof C4767l) {
                C4767l c4767l = (C4767l) abstractC8831l;
                C12933l c12933l = (C12933l) c4767l.f16541l;
                C5008l c5008l3 = new C5008l(22);
                c5008l3.m1663extends(AbstractC9008l.crashlytics("ssh-dss"));
                c5008l3.m1669private(c12933l.f25380l);
                c5008l3.m1669private(c12933l.f25381l);
                c5008l3.m1669private(c12933l.f25382l);
                c5008l3.m1669private(c4767l.f9785l);
                obj = c5008l3.f10245l;
            } else {
                if (!(abstractC8831l instanceof C6254l)) {
                    C4875l.smaato(abstractC8831l.getClass().getName(), " to public key", "unable to convert ");
                    return null;
                }
                c5008l = new C5008l(22);
                c5008l.m1663extends(AbstractC9008l.crashlytics("ssh-ed25519"));
                c5008l.m1663extends(((C6254l) abstractC8831l).getEncoded());
            }
            return ((ByteArrayOutputStream) obj).toByteArray();
        }
        if (abstractC8831l.f18137l) {
            C8339l.metrica("RSAKeyParamaters was for encryption");
            return null;
        }
        C6963l c6963l = (C6963l) abstractC8831l;
        c5008l = new C5008l(22);
        c5008l.m1663extends(AbstractC9008l.crashlytics("ssh-rsa"));
        c5008l.m1669private(c6963l.f14629l);
        c5008l.m1669private(c6963l.f14630l);
        obj = c5008l.f10245l;
        return ((ByteArrayOutputStream) obj).toByteArray();
    }

    public static final View yandex(AbstractC14971l abstractC14971l) {
        C8464l c8464l = AbstractC5573l.metrica(abstractC14971l.f29454l).f7688l;
        View interopView = c8464l != null ? c8464l.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        C8339l.smaato("Could not fetch interop view");
        return null;
    }
}
