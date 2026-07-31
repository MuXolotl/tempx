package defpackage;

/* JADX INFO: renamed from: lَٙؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10372l {
    public final int crashlytics;
    public final String loadAd;
    public final String yandex;

    public C10372l(String str, int i, String str2) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10372l)) {
            return false;
        }
        C10372l c10372l = (C10372l) obj;
        return this.yandex.equals(c10372l.yandex) && this.loadAd.equals(c10372l.loadAd) && this.crashlytics == c10372l.crashlytics;
    }

    public final int hashCode() {
        return AbstractC5020l.inmobi(this.crashlytics) + AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PluginTraceElement(pluginName=");
        sb.append(this.yandex);
        sb.append(", handler=");
        sb.append(this.loadAd);
        sb.append(", event=");
        int i = this.crashlytics;
        if (i != 1) {
            str = i != 2 ? "null" : "FINISHED";
        } else {
            str = "STARTED";
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
