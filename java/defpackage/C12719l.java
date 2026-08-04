package defpackage;

/* JADX INFO: renamed from: lّٜٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12719l {
    public static final float admob;
    public static final float amazon;
    public static final float billing;
    public static final float crashlytics;
    public static final float firebase;
    public static final float isPro;
    public static final C17253l loadAd;
    public static final float mopub;
    public static final float purchase;
    public static final float smaato;
    public static final float subs;
    public static final C17253l yandex = new C17253l(24.0f, 8.0f, 24.0f, 8.0f);

    static {
        AbstractC3605l.crashlytics(16.0f, 8.0f, 24.0f, 8.0f);
        loadAd = new C17253l(12.0f, 8.0f, 12.0f, 8.0f);
        AbstractC3605l.crashlytics(12.0f, 8.0f, 16.0f, 8.0f);
        crashlytics = 58.0f;
        amazon = 56.0f;
        purchase = 96.0f;
        billing = 136.0f;
        mopub = 24.0f;
        admob = 24.0f;
        subs = 16.0f;
        isPro = 32.0f;
        firebase = 48.0f;
        smaato = 48.0f;
    }

    public static C15521l admob(C6956l c6956l) {
        C1919l c1919l = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics;
        C15521l c15521l = c1919l.subs;
        if (c15521l != null) {
            return c15521l;
        }
        C15521l c15521l2 = new C15521l(AbstractC2610l.yandex(c1919l, 7), AbstractC2610l.yandex(c1919l, 15));
        c1919l.subs = c15521l2;
        return c15521l2;
    }

    public static C13412l amazon(C0764l c0764l) {
        C13412l c13412l = c0764l.f2296final;
        if (c13412l != null) {
            return c13412l;
        }
        long j = C9735l.isPro;
        C13412l c13412l2 = new C13412l(j, AbstractC15038l.amazon(c0764l, 19), j, C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 19)));
        c0764l.f2296final = c13412l2;
        return c13412l2;
    }

    public static float billing() {
        return ((Boolean) AbstractC7063l.yandex.getValue()).booleanValue() ? 36.0f : 40.0f;
    }

    public static C13412l crashlytics(C0764l c0764l) {
        C13412l c13412l = c0764l.f2313static;
        if (c13412l != null) {
            return c13412l;
        }
        C13412l c13412l2 = new C13412l(AbstractC15038l.amazon(c0764l, 26), AbstractC15038l.amazon(c0764l, 10), C9735l.loadAd(0.1f, AbstractC15038l.amazon(c0764l, 18)), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 19)));
        c0764l.f2313static = c13412l2;
        return c13412l2;
    }

    public static C17253l loadAd(float f) {
        if (C14467l.yandex(f, billing()) < 0) {
            return new C17253l(12.0f, 6.0f, 12.0f, 6.0f);
        }
        if (C14467l.yandex(f, amazon) < 0) {
            C10086l c10086l = AbstractC7063l.yandex;
            return new C17253l(16.0f, ((Boolean) c10086l.getValue()).booleanValue() ? 8.0f : 10.0f, 16.0f, ((Boolean) c10086l.getValue()).booleanValue() ? 8.0f : 10.0f);
        }
        if (C14467l.yandex(f, purchase) < 0) {
            float f2 = mopub;
            float f3 = subs;
            return new C17253l(f2, f3, admob, f3);
        }
        if (C14467l.yandex(f, billing) >= 0) {
            return new C17253l(64.0f, 48.0f, 64.0f, 48.0f);
        }
        float f4 = firebase;
        float f5 = isPro;
        return new C17253l(f4, f5, smaato, f5);
    }

    public static C13412l mopub(long j, long j2, C6956l c6956l, int i) {
        if ((i & 1) != 0) {
            j = C9735l.firebase;
        }
        long j3 = j;
        long j4 = C9735l.firebase;
        return amazon(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex).yandex(j3, j2, j4, j4);
    }

    public static C13412l purchase(C0764l c0764l) {
        C13412l c13412l = c0764l.f2307new;
        if (c13412l != null) {
            return c13412l;
        }
        long j = C9735l.isPro;
        C13412l c13412l2 = new C13412l(j, AbstractC15038l.amazon(c0764l, 26), j, C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 19)));
        c0764l.f2307new = c13412l2;
        return c13412l2;
    }

    public static C13412l subs(long j, long j2, C6956l c6956l, int i) {
        long j3 = C9735l.firebase;
        return purchase(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex).yandex(j3, j, j3, (i & 8) != 0 ? j3 : j2);
    }

    public static C13412l yandex(long j, long j2, long j3, long j4, C6956l c6956l, int i) {
        if ((i & 1) != 0) {
            j = C9735l.firebase;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = C9735l.firebase;
        }
        long j6 = j2;
        if ((i & 4) != 0) {
            j3 = C9735l.firebase;
        }
        return crashlytics(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex).yandex(j5, j6, j3, (i & 8) != 0 ? C9735l.firebase : j4);
    }
}
