package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l٘۟ٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18239l {
    public static final WeakHashMap yandex = new WeakHashMap();
    public static final WeakHashMap loadAd = new WeakHashMap();

    public static void yandex(Throwable th) {
        Throwable cause;
        C12899l c12899l;
        Closeable closeable;
        WeakHashMap weakHashMap = loadAd;
        synchronized (weakHashMap) {
            cause = th;
            while (cause != null) {
                try {
                    if (weakHashMap.containsKey(cause)) {
                        break;
                    } else {
                        cause = cause.getCause();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            weakHashMap.put(th, Boolean.valueOf(cause != null));
        }
        if (cause != null) {
            return;
        }
        WeakHashMap weakHashMap2 = yandex;
        synchronized (weakHashMap2) {
            Throwable cause2 = th;
            while (cause2 != null) {
                try {
                    if (weakHashMap2.containsKey(cause2)) {
                        break;
                    } else {
                        cause2 = cause2.getCause();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (cause2 == null) {
                c12899l = null;
            } else {
                weakHashMap2.put(th, (C17138l) weakHashMap2.get(cause2));
                c12899l = new C12899l(25);
            }
        }
        if (c12899l != null || (closeable = AbstractC10540l.loadAd().loadAd) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (closeable = AbstractC10540l.loadAd().loadAd; closeable != null; closeable = ((AbstractC17970l) closeable).f35136l) {
            arrayList.add(closeable);
        }
        UUID uuid = ((AbstractC17970l) ((InterfaceC14094l) arrayList.get(0))).f35135l;
        if (uuid == null) {
            C6541l.subs("Null rootTraceId");
            return;
        }
        ((InterfaceC14094l) arrayList.get(0)).getClass();
        C16971l c16971lAds = AbstractC1186l.ads(arrayList.size());
        C16971l c16971lAds2 = AbstractC1186l.ads(arrayList.size());
        for (InterfaceC14094l interfaceC14094l : AbstractC7280l.purchase(arrayList)) {
            c16971lAds2.crashlytics(((AbstractC17970l) interfaceC14094l).f35138l);
            c16971lAds.crashlytics(interfaceC14094l.admob());
        }
        WeakHashMap weakHashMap3 = yandex;
        synchronized (weakHashMap3) {
            try {
                C13708l c13708lMopub = c16971lAds2.mopub();
                if (c13708lMopub == null) {
                    throw new NullPointerException("Null spansNames");
                }
                C13708l c13708lMopub2 = c16971lAds.mopub();
                if (c13708lMopub2 == null) {
                    throw new NullPointerException("Null extras");
                }
                weakHashMap3.put(th, new C17138l(c13708lMopub, c13708lMopub2, uuid));
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
