package defpackage;

/* JADX INFO: renamed from: lٟٔۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15076l {
    public static final C3339l amazon = new C3339l();
    public boolean crashlytics = false;
    public final C5128l loadAd;
    public final AbstractC15076l yandex;

    public /* synthetic */ AbstractC15076l(AbstractC15076l abstractC15076l, C5128l c5128l) {
        if (abstractC15076l != null) {
            AbstractC12442l.admob(abstractC15076l.crashlytics);
        }
        this.yandex = abstractC15076l;
        this.loadAd = c5128l;
    }

    public static AbstractC15076l yandex(AbstractC15076l abstractC15076l, AbstractC15076l abstractC15076l2) {
        abstractC15076l.getClass();
        AbstractC15076l abstractC15076l3 = C13185l.purchase;
        if (abstractC15076l == abstractC15076l3) {
            return abstractC15076l2;
        }
        abstractC15076l2.getClass();
        if (abstractC15076l2 == abstractC15076l3) {
            return abstractC15076l;
        }
        AbstractC8481l<AbstractC15076l> abstractC8481lMetrica = AbstractC8481l.metrica(2, abstractC15076l, abstractC15076l2);
        if (abstractC8481lMetrica.isEmpty()) {
            return abstractC15076l3;
        }
        if (abstractC8481lMetrica.size() == 1) {
            return (AbstractC15076l) abstractC8481lMetrica.iterator().next();
        }
        int i = 0;
        for (AbstractC15076l abstractC15076l4 : abstractC8481lMetrica) {
            do {
                i += abstractC15076l4.loadAd.f11161l;
                abstractC15076l4 = abstractC15076l4.yandex;
            } while (abstractC15076l4 != null);
        }
        if (i == 0) {
            return C13185l.purchase;
        }
        C5128l c5128l = new C5128l(i);
        for (AbstractC15076l abstractC15076l5 : abstractC8481lMetrica) {
            do {
                int i2 = 0;
                while (true) {
                    C5128l c5128l2 = abstractC15076l5.loadAd;
                    if (i2 >= c5128l2.f11161l) {
                        break;
                    }
                    AbstractC12442l.isPro(c5128l.put((C3339l) c5128l2.billing(i2), c5128l2.subs(i2)) == null, "Duplicate bindings: %s", c5128l2.billing(i2));
                    i2++;
                }
                abstractC15076l5 = abstractC15076l5.yandex;
            } while (abstractC15076l5 != null);
        }
        return new C13185l(null, c5128l).loadAd();
    }

    public final boolean crashlytics() {
        if (this.loadAd.containsKey(amazon)) {
            return true;
        }
        AbstractC15076l abstractC15076l = this.yandex;
        return abstractC15076l != null && abstractC15076l.crashlytics();
    }

    public final AbstractC15076l loadAd() {
        if (this.crashlytics) {
            C8339l.smaato("Already frozen");
            return null;
        }
        this.crashlytics = true;
        AbstractC15076l abstractC15076l = this.yandex;
        return (abstractC15076l == null || !this.loadAd.isEmpty()) ? this : abstractC15076l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (AbstractC15076l abstractC15076l = this; abstractC15076l != null; abstractC15076l = abstractC15076l.yandex) {
            for (int i = 0; i < abstractC15076l.loadAd.f11161l; i++) {
                sb.append("[");
                sb.append(this.loadAd.subs(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
