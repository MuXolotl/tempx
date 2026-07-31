package defpackage;

import java.io.EOFException;
import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;

/* JADX INFO: renamed from: lٖۧؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16787l extends AbstractC7188l {
    public static final C13850l amazon = new C13850l(1);
    public final C0458l crashlytics;
    public final C12271l[] loadAd;
    public final AbstractC9549l yandex;

    public C16787l(AbstractC9549l abstractC9549l, TreeMap treeMap) {
        this.yandex = abstractC9549l;
        this.loadAd = (C12271l[]) treeMap.values().toArray(new C12271l[treeMap.size()]);
        this.crashlytics = C0458l.m547strictfp((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        try {
            c3631l.mopub();
            for (C12271l c12271l : this.loadAd) {
                c3631l.isVip(c12271l.yandex);
                c12271l.crashlytics.billing(c3631l, c12271l.loadAd.get(obj));
            }
            c3631l.adcel();
        } catch (IllegalAccessException unused) {
            C11586l.yandex();
        }
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        try {
            Object objAmazon = this.yandex.amazon();
            try {
                c0396l.billing();
                while (c0396l.m504package()) {
                    int iM503l = c0396l.m503l(this.crashlytics);
                    if (iM503l == -1) {
                        c0396l.m502l();
                        c0396l.m501l();
                    } else {
                        C12271l c12271l = this.loadAd[iM503l];
                        c12271l.loadAd.set(objAmazon, c12271l.crashlytics.loadAd(c0396l));
                    }
                }
                c0396l.ads();
                return objAmazon;
            } catch (IllegalAccessException unused) {
                C11586l.yandex();
                return null;
            }
        } catch (IllegalAccessException unused2) {
            C11586l.yandex();
            return null;
        } catch (InstantiationException e) {
            C11467l.metrica(e);
            return null;
        } catch (InvocationTargetException e2) {
            AbstractC7694l.mopub(e2);
            throw null;
        }
    }

    public final String toString() {
        return "JsonAdapter(" + this.yandex + ")";
    }
}
