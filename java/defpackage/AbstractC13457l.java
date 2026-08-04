package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: lٍْٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13457l {
    public static final byte[] yandex = new byte[0];

    public static final boolean admob(InterfaceC2957l interfaceC2957l) {
        C9095l c9095lM1729instanceof;
        List listAdmob = interfaceC2957l.admob();
        if (listAdmob == null || !listAdmob.isEmpty()) {
            Iterator it = listAdmob.iterator();
            while (it.hasNext()) {
                if (((AbstractC9707l) it.next()).premium() != 1) {
                    return false;
                }
            }
        }
        String name = interfaceC2957l.getName();
        AbstractC0601l abstractC0601lAd = interfaceC2957l.ad();
        String str = null;
        C5160l c5160l = abstractC0601lAd instanceof C5160l ? (C5160l) abstractC0601lAd : null;
        if (c5160l != null && (c9095lM1729instanceof = c5160l.m1729instanceof()) != null) {
            str = c9095lM1729instanceof.remoteconfig;
        }
        return AbstractC8576l.yandex(name, str);
    }

    public static final Method amazon(Class cls, InterfaceC18672l interfaceC18672l) {
        try {
            return cls.getDeclaredMethod("unbox-impl", null);
        } catch (NoSuchMethodException unused) {
            C8936l.vip("No unbox method found in inline class: ", cls, " (calling ", interfaceC18672l);
            return null;
        }
    }

    public static final Map billing(String str, Map map) {
        if (map.isEmpty()) {
            return C14054l.f27396l;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (linkedHashMap.keySet().contains(null)) {
            C10754l.metrica(str.concat(".containsKey(null)"));
            return null;
        }
        if (!linkedHashMap.values().contains(null)) {
            return DesugarCollections.unmodifiableMap(linkedHashMap);
        }
        C10754l.metrica(str.concat(".containsValue(null)"));
        return null;
    }

    public static InterfaceC14224l crashlytics(C5416l c5416l) throws GeneralSecurityException {
        AbstractC3302l abstractC3302l = c5416l.purchase;
        if (abstractC3302l instanceof C16816l) {
            return new C14513l((C16816l) abstractC3302l);
        }
        if (abstractC3302l instanceof C8378l) {
            return new C14785l((C8378l) abstractC3302l);
        }
        if (abstractC3302l instanceof C18563l) {
            return new C14785l((C18563l) abstractC3302l);
        }
        throw new GeneralSecurityException("Unsupported DEM parameters: ".concat(String.valueOf(abstractC3302l)));
    }

    public static final String firebase(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (AbstractC12024l.inmobi(",[]{}\\", cCharAt)) {
                sb.append('\\');
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static final boolean isPro(C7375l c7375l, int i, int i2, int i3, int i4) {
        Object c18435l;
        try {
            c18435l = Boolean.valueOf(c7375l.loadAd(i3, i4) == c7375l.loadAd(i, i2));
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        Object obj = Boolean.FALSE;
        if (c18435l instanceof C18435l) {
            c18435l = obj;
        }
        return ((Boolean) c18435l).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038 A[RETURN] */
    public static final InterfaceC16148l loadAd(InterfaceC16148l interfaceC16148l, InterfaceC18672l interfaceC18672l, List list, boolean z) {
        List parameters = interfaceC18672l.getParameters();
        if (parameters == null || !parameters.isEmpty()) {
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                if (AbstractC5592l.mopub(((AbstractC9707l) it.next()).mo1109synchronized())) {
                }
            }
            if (!AbstractC5592l.mopub(interfaceC18672l.smaato())) {
                return interfaceC16148l;
            }
        } else if (!AbstractC5592l.mopub(interfaceC18672l.smaato())) {
            return interfaceC16148l;
        }
        return new C0359l(interfaceC16148l, interfaceC18672l, list, z);
    }

    public static final boolean mopub(InterfaceC13012l interfaceC13012l) {
        if (interfaceC13012l.Signature()) {
            return false;
        }
        InterfaceC1122l interfaceC1122lMo1616package = interfaceC13012l.mo1616package();
        InterfaceC1388l interfaceC1388l = interfaceC1122lMo1616package instanceof InterfaceC1388l ? (InterfaceC1388l) interfaceC1122lMo1616package : null;
        Class clsAdmob = interfaceC1388l != null ? AbstractC16131l.admob(interfaceC1388l) : null;
        return (clsAdmob == null || clsAdmob.equals(Void.TYPE)) ? false : true;
    }

    public static final List purchase(String str, List list) {
        if (list != C2580l.f5619l && !(list instanceof C9175l)) {
            C9175l c9175l = new C9175l(list);
            list = null;
            if (!c9175l.contains(null)) {
                return c9175l;
            }
            C10754l.metrica(str.concat(".contains(null)"));
        }
        return list;
    }

    public static final Class smaato(InterfaceC13012l interfaceC13012l) {
        InterfaceC1122l interfaceC1122lMo1616package = interfaceC13012l != null ? interfaceC13012l.mo1616package() : null;
        InterfaceC1388l interfaceC1388l = interfaceC1122lMo1616package instanceof InterfaceC1388l ? (InterfaceC1388l) interfaceC1122lMo1616package : null;
        if (interfaceC1388l != null && interfaceC1388l.ads()) {
            if (!AbstractC5592l.subs(interfaceC13012l)) {
                return ((InterfaceC13937l) interfaceC1388l).mo1730private();
            }
            InterfaceC13012l interfaceC13012lAdcel = AbstractC5592l.adcel(interfaceC13012l);
            if (interfaceC13012lAdcel != null && !AbstractC5592l.subs(interfaceC13012lAdcel) && !mopub(interfaceC13012lAdcel)) {
                return ((InterfaceC13937l) interfaceC1388l).mo1730private();
            }
        }
        return null;
    }

    public static final C4565l subs(C7375l c7375l, int i, int i2) {
        int i3 = i - 1;
        int i4 = i2 - 1;
        int i5 = i + 1;
        int i6 = i2 + 1;
        return new C4565l(isPro(c7375l, i, i2, i3, i4), isPro(c7375l, i, i2, i5, i4), isPro(c7375l, i, i2, i3, i2), isPro(c7375l, i, i2, i, i4), isPro(c7375l, i, i2, i5, i2), isPro(c7375l, i, i2, i3, i6), isPro(c7375l, i, i2, i, i6), isPro(c7375l, i, i2, i5, i6));
    }

    public static X509TrustManager yandex(KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        C1759l.firebase("Array contains no element matching the predicate.");
        return null;
    }
}
