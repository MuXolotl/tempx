package defpackage;

/* JADX INFO: renamed from: lُِّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10997l {
    public final String crashlytics;
    public final boolean loadAd;
    public final /* synthetic */ int yandex;

    public C10997l(String str, boolean z) {
        this.yandex = 1;
        this.loadAd = z;
        this.crashlytics = str;
    }

    public String toString() {
        switch (this.yandex) {
            case 0:
                String str = this.crashlytics;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
                sb.append("{");
                sb.append(str);
                sb.append("}");
                sb.append(this.loadAd);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C10997l(String str, boolean z, int i) {
        this.yandex = i;
        this.crashlytics = str;
        this.loadAd = z;
    }
}
