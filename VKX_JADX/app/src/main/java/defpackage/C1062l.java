package defpackage;

/* JADX INFO: renamed from: lٕؒؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1062l extends AbstractC4416l {
    public static final C3797l smaato = new C3797l("Nearby.CONNECTIONS_API", new C5795l(6), new C14823l(24));
    public C3224l firebase;

    public final C3823l admob(String str, C10815l c10815l) {
        C10147l c10147lYandex = C8662l.yandex();
        c10147lYandex.yandex = new C17516l(this, str, c10815l);
        c10147lYandex.purchase = 1228;
        return purchase(1, c10147lYandex.yandex());
    }

    public final C3823l billing(String str, C17178l c17178l) {
        C18096l c18096lAmazon = amazon(c17178l, C17178l.class.getName());
        C10147l c10147lYandex = C8662l.yandex();
        c10147lYandex.yandex = new C0848l(this, str, c18096lAmazon);
        c10147lYandex.purchase = 1227;
        return purchase(1, c10147lYandex.yandex());
    }

    public final void firebase(String str) {
        C12648l c12648lYandex;
        C3224l c3224l = this.firebase;
        synchronized (c3224l) {
            C11154l c11154l = c3224l.crashlytics;
            if (!c11154l.containsKey(str)) {
                c11154l.put(str, new Object());
            }
            c12648lYandex = AbstractC0135l.yandex(c11154l.get(str), "connection");
        }
        c3224l.amazon(this, c12648lYandex);
    }

    public final void isPro(String str) {
        C18096l c18096lYandex;
        C3224l c3224l = this.firebase;
        synchronized (c3224l) {
            C11154l c11154l = c3224l.crashlytics;
            if (!c11154l.containsKey(str)) {
                c11154l.put(str, new Object());
            }
            c18096lYandex = c3224l.yandex(this, c11154l.get(str), "connection");
        }
        C3224l c3224l2 = this.firebase;
        C13904l c13904lCrashlytics = C13568l.crashlytics();
        c13904lCrashlytics.f27205l = c18096lYandex;
        c13904lCrashlytics.f27204l = C11485l.f23074l;
        c13904lCrashlytics.f27203l = C15718l.f30864l;
        c13904lCrashlytics.f27201l = 1268;
        c3224l2.loadAd(this, c13904lCrashlytics.loadAd());
    }

    public final C3823l mopub(String str) {
        C10828l c10828l = new C10828l(str, 5);
        C10147l c10147lYandex = C8662l.yandex();
        c10147lYandex.purchase = 1229;
        C18675l c18675l = new C18675l();
        c18675l.f36444l = c10828l;
        c10147lYandex.yandex = c18675l;
        return purchase(1, c10147lYandex.yandex());
    }

    public final void subs() {
        this.firebase.crashlytics(this, "advertising");
        this.firebase.crashlytics(this, "discovery").purchase(new C9912l(18, this));
        C13863l c13863l = C13863l.f27110l;
        C10147l c10147lYandex = C8662l.yandex();
        c10147lYandex.purchase = 1229;
        c10147lYandex.yandex = new C15714l(c13863l);
        purchase(1, c10147lYandex.yandex()).yandex(new C17190l(2, this));
    }
}
