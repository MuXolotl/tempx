package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؘؒؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5372l extends AbstractC7188l {
    public final ArrayList amazon;
    public final C0458l billing;
    public final List crashlytics;
    public final List loadAd;
    public final C0458l mopub;
    public final AbstractC7188l purchase;
    public final String yandex;

    public C5372l(String str, List list, List list2, ArrayList arrayList, AbstractC7188l abstractC7188l) {
        this.yandex = str;
        this.loadAd = list;
        this.crashlytics = list2;
        this.amazon = arrayList;
        this.purchase = abstractC7188l;
        this.billing = C0458l.m547strictfp(str);
        this.mopub = C0458l.m547strictfp((String[]) list.toArray(new String[0]));
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        AbstractC7188l abstractC7188l;
        Class<?> cls = obj.getClass();
        List list = this.crashlytics;
        int iIndexOf = list.indexOf(cls);
        AbstractC7188l abstractC7188l2 = this.purchase;
        if (iIndexOf != -1) {
            abstractC7188l = (AbstractC7188l) this.amazon.get(iIndexOf);
        } else {
            if (abstractC7188l2 == null) {
                StringBuilder sb = new StringBuilder("Expected one of ");
                sb.append(list);
                sb.append(" but found ");
                sb.append(obj);
                Class<?> cls2 = obj.getClass();
                sb.append(", a ");
                sb.append(cls2);
                sb.append(". Register this subtype.");
                throw new IllegalArgumentException(sb.toString());
            }
            abstractC7188l = abstractC7188l2;
        }
        c3631l.mopub();
        if (abstractC7188l != abstractC7188l2) {
            c3631l.isVip(this.yandex);
            c3631l.m1367throw((String) this.loadAd.get(iIndexOf));
        }
        int iM1364package = c3631l.m1364package();
        if (iM1364package != 5 && iM1364package != 3 && iM1364package != 2 && iM1364package != 1) {
            C8339l.smaato("Nesting problem.");
            return;
        }
        int i = c3631l.f7579l;
        c3631l.f7579l = c3631l.f7576l;
        abstractC7188l.billing(c3631l, obj);
        c3631l.f7579l = i;
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws IOException {
        c0396l.getClass();
        C0396l c0396l2 = new C0396l(c0396l);
        try {
            int iMopub = mopub(c0396l2);
            c0396l2.close();
            return iMopub == -1 ? this.purchase.loadAd(c0396l) : ((AbstractC7188l) this.amazon.get(iMopub)).loadAd(c0396l);
        } catch (Throwable th) {
            c0396l2.close();
            throw th;
        }
    }

    public final int mopub(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        while (true) {
            boolean zM504package = c0396l.m504package();
            String str = this.yandex;
            if (!zM504package) {
                C11467l.subscription("Missing label for ".concat(str));
                return 0;
            }
            if (c0396l.m503l(this.billing) != -1) {
                int iM496l = c0396l.m496l(this.mopub);
                if (iM496l != -1 || this.purchase != null) {
                    return iM496l;
                }
                StringBuilder sb = new StringBuilder("Expected one of ");
                sb.append(this.loadAd);
                String strM494import = c0396l.m494import();
                sb.append(" for key '");
                sb.append(str);
                sb.append("' but found '");
                sb.append(strM494import);
                sb.append("'. Register a subtype for this label.");
                throw new C6451l(sb.toString(), 8, (byte) 0);
            }
            c0396l.m502l();
            c0396l.m501l();
        }
    }

    public final String toString() {
        return AbstractC0653l.ads(new StringBuilder("PolymorphicJsonAdapter("), this.yandex, ")");
    }
}
