package defpackage;

/* JADX INFO: renamed from: lًؒٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1047l {
    public static final String crashlytics;
    public static final C1047l loadAd;
    public final AbstractC1186l yandex;

    static {
        C9258l c9258l = AbstractC1186l.f3181l;
        loadAd = new C1047l(C13708l.f26763l);
        String str = AbstractC15323l.yandex;
        crashlytics = Integer.toString(0, 36);
    }

    public C1047l(C13708l c13708l) {
        this.yandex = AbstractC1186l.Signature(c13708l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1047l.class != obj.getClass()) {
            return false;
        }
        return this.yandex.equals(((C1047l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final boolean yandex(int i) {
        int i2 = 0;
        while (true) {
            AbstractC1186l abstractC1186l = this.yandex;
            if (i2 >= abstractC1186l.size()) {
                return false;
            }
            C14446l c14446l = (C14446l) abstractC1186l.get(i2);
            for (boolean z : c14446l.purchase) {
                if (z) {
                    if (c14446l.loadAd.crashlytics != i) {
                        break;
                    }
                    return true;
                }
            }
            i2++;
        }
    }
}
