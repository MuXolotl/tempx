package defpackage;

/* JADX INFO: renamed from: lَٕٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17032l {
    public final AbstractC10033l amazon;
    public C15115l billing;
    public final C8309l crashlytics;
    public final String loadAd;
    public final C13772l purchase;
    public final C6705l yandex;

    public C17032l(C11644l c11644l) {
        C6705l c6705l = (C6705l) c11644l.f23358l;
        if (c6705l == null) {
            C8339l.smaato("url == null");
            throw null;
        }
        this.yandex = c6705l;
        this.loadAd = (String) c11644l.f23357l;
        this.crashlytics = ((C16543l) c11644l.f23361l).smaato();
        this.amazon = (AbstractC10033l) c11644l.f23360l;
        this.purchase = (C13772l) c11644l.f23362l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.loadAd);
        sb.append(", url=");
        sb.append(this.yandex);
        C8309l c8309l = this.crashlytics;
        if (c8309l.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : c8309l) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC14055l.subscription();
                    throw null;
                }
                C8195l c8195l = (C8195l) obj;
                String str = (String) c8195l.f17098l;
                String str2 = (String) c8195l.f17097l;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (AbstractC7712l.firebase(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        C13772l c13772l = C13772l.f26878l;
        C13772l c13772l2 = this.purchase;
        if (!AbstractC8576l.yandex(c13772l2, c13772l)) {
            sb.append(", tags=");
            sb.append(c13772l2);
        }
        sb.append('}');
        return sb.toString();
    }

    public final C11644l yandex() {
        C11644l c11644l = new C11644l(false);
        c11644l.f23358l = this.yandex;
        c11644l.f23357l = this.loadAd;
        c11644l.f23360l = this.amazon;
        c11644l.f23362l = this.purchase;
        c11644l.f23361l = this.crashlytics.mopub();
        return c11644l;
    }
}
