package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: lْۨۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13831l {
    public static final Object yandex = new Object();

    public static boolean admob(InterfaceC2167l interfaceC2167l) {
        if (interfaceC2167l == null) {
            return false;
        }
        Double dRemoteconfig = interfaceC2167l.remoteconfig();
        return !dRemoteconfig.isNaN() && dRemoteconfig.doubleValue() >= 0.0d && dRemoteconfig.equals(Double.valueOf(Math.floor(dRemoteconfig.doubleValue())));
    }

    public static final void amazon(int i, int i2, Object[] objArr) {
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static void billing(int i, String str, List list) {
        if (list.size() >= i) {
            return;
        }
        C11586l.purchase(i, str, " operation requires at least ", list.size());
    }

    public static final Object crashlytics(C6264l c6264l, C4707l c4707l) {
        Object objMopub = c6264l.f13225l.mopub(c4707l);
        if (objMopub == null) {
            return null;
        }
        return objMopub;
    }

    public static int firebase(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    public static boolean isPro(InterfaceC2167l interfaceC2167l, InterfaceC2167l interfaceC2167l2) {
        if (!interfaceC2167l.getClass().equals(interfaceC2167l2.getClass())) {
            return false;
        }
        if ((interfaceC2167l instanceof C10910l) || (interfaceC2167l instanceof C6681l)) {
            return true;
        }
        if (interfaceC2167l instanceof C14259l) {
            if (Double.isNaN(interfaceC2167l.remoteconfig().doubleValue()) || Double.isNaN(interfaceC2167l2.remoteconfig().doubleValue())) {
                return false;
            }
            return interfaceC2167l.remoteconfig().equals(interfaceC2167l2.remoteconfig());
        }
        if (interfaceC2167l instanceof C13997l) {
            return interfaceC2167l.mopub().equals(interfaceC2167l2.mopub());
        }
        if (interfaceC2167l instanceof C18597l) {
            return interfaceC2167l.billing().equals(interfaceC2167l2.billing());
        }
        return interfaceC2167l == interfaceC2167l2;
    }

    public static void metrica(C7502l c7502l) {
        int iFirebase = firebase(c7502l.vip("runtime.counter").remoteconfig().doubleValue() + 1.0d);
        if (iFirebase <= 1000000) {
            c7502l.smaato("runtime.counter", new C14259l(Double.valueOf(iFirebase)));
        } else {
            C8339l.smaato("Instructions allowed exceeded");
        }
    }

    public static void mopub(int i, String str, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        C11586l.purchase(i, str, " operation requires at most ", arrayList.size());
    }

    public static void purchase(int i, String str, List list) {
        if (list.size() == i) {
            return;
        }
        C11586l.purchase(i, str, " operation requires ", list.size());
    }

    public static Object remoteconfig(InterfaceC2167l interfaceC2167l) {
        if (InterfaceC2167l.f4800l.equals(interfaceC2167l)) {
            return null;
        }
        if (InterfaceC2167l.f4805l.equals(interfaceC2167l)) {
            return "";
        }
        if (interfaceC2167l instanceof C10303l) {
            return vip((C10303l) interfaceC2167l);
        }
        if (!(interfaceC2167l instanceof C5181l)) {
            return !interfaceC2167l.remoteconfig().isNaN() ? interfaceC2167l.remoteconfig() : interfaceC2167l.mopub();
        }
        ArrayList arrayList = new ArrayList();
        C5181l c5181l = (C5181l) interfaceC2167l;
        int i = 0;
        while (i < c5181l.Signature()) {
            if (i >= c5181l.Signature()) {
                C1759l.firebase(AbstractC9361l.Signature(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
                return null;
            }
            int i2 = i + 1;
            Object objRemoteconfig = remoteconfig(c5181l.pro(i));
            if (objRemoteconfig != null) {
                arrayList.add(objRemoteconfig);
            }
            i = i2;
        }
        return arrayList;
    }

    public static double smaato(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return ((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d));
    }

    public static EnumC14263l subs(String str) {
        EnumC14263l enumC14263l;
        if (str == null || str.isEmpty()) {
            enumC14263l = null;
        } else {
            enumC14263l = (EnumC14263l) EnumC14263l.f27906l.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (enumC14263l != null) {
            return enumC14263l;
        }
        C8339l.metrica(AbstractC14814l.startapp("Unsupported commandId ", str));
        return null;
    }

    public static HashMap vip(C10303l c10303l) {
        HashMap map = new HashMap();
        for (String str : new ArrayList(c10303l.f20990l.keySet())) {
            Object objRemoteconfig = remoteconfig(c10303l.admob(str));
            if (objRemoteconfig != null) {
                map.put(str, objRemoteconfig);
            }
        }
        return map;
    }

    public static final String yandex(Object[] objArr, int i, int i2, AbstractC6005l abstractC6005l) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == abstractC6005l) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public abstract int loadAd(int i, int i2, EnumC9931l enumC9931l);
}
