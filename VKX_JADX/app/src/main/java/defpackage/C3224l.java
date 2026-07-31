package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lؘؕۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3224l {
    public static final C11154l amazon = new C11154l(0);
    public final C11154l yandex = new C11154l(0);
    public final C10834l loadAd = new C10834l(0);
    public final C11154l crashlytics = new C11154l(0);

    public final synchronized C3823l amazon(AbstractC4416l abstractC4416l, C12648l c12648l) {
        String str;
        try {
            this.loadAd.remove(c12648l);
            Iterator it = ((C5386l) this.yandex.keySet()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                str = (String) it.next();
                Set set = (Set) this.yandex.get(str);
                if (set.contains(c12648l)) {
                    set.remove(c12648l);
                    break;
                }
            }
            if (str != null) {
                for (Map.Entry entry : (C6542l) this.crashlytics.entrySet()) {
                    if (AbstractC0135l.yandex(entry.getValue(), str).equals(c12648l)) {
                        this.crashlytics.remove(entry.getKey());
                        break;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return abstractC4416l.crashlytics(c12648l, 0);
    }

    public final synchronized C3823l crashlytics(AbstractC4416l abstractC4416l, String str) {
        C10834l c10834l = new C10834l(0);
        Set set = (Set) this.yandex.get(str);
        if (set == null) {
            return AbstractC4311l.ads(c10834l);
        }
        C10834l c10834l2 = new C10834l(0);
        c10834l2.addAll(set);
        C11786l c11786l = new C11786l(c10834l2);
        while (c11786l.hasNext()) {
            C12648l c12648l = (C12648l) c11786l.next();
            if (this.loadAd.contains(c12648l)) {
                c10834l.add(amazon(abstractC4416l, c12648l));
            }
        }
        this.yandex.remove(str);
        return AbstractC4311l.ads(c10834l);
    }

    public final synchronized C3823l loadAd(C1062l c1062l, C13568l c13568l) {
        C3823l c3823lLoadAd;
        C12648l c12648l = (C12648l) ((C18096l) ((C1196l) c13568l.f26581l).f3253l).loadAd;
        AbstractC1051l.isPro(c12648l, "Key must not be null");
        boolean zAdd = this.loadAd.add(c12648l);
        c3823lLoadAd = c1062l.loadAd(c13568l);
        C11919l c11919l = new C11919l(this, c1062l, c12648l, zAdd);
        c3823lLoadAd.getClass();
        c3823lLoadAd.amazon(AbstractC8333l.yandex, c11919l);
        return c3823lLoadAd;
    }

    public final synchronized C18096l yandex(C1062l c1062l, Object obj, String str) {
        C18096l c18096lAmazon;
        try {
            AbstractC1051l.subs(obj);
            c18096lAmazon = c1062l.amazon(obj, str);
            C12648l c12648l = (C12648l) c18096lAmazon.loadAd;
            AbstractC1051l.isPro(c12648l, "Key must not be null");
            Set c10834l = (Set) this.yandex.get(str);
            if (c10834l == null) {
                c10834l = new C10834l(0);
                this.yandex.put(str, c10834l);
            }
            c10834l.add(c12648l);
        } catch (Throwable th) {
            throw th;
        }
        return c18096lAmazon;
    }
}
