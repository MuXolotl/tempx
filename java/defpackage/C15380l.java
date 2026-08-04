package defpackage;

/* JADX INFO: renamed from: lٕؑٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15380l {
    public int amazon;
    public int crashlytics;
    public int loadAd;
    public final /* synthetic */ int yandex;

    public C15380l() {
        this.yandex = 2;
        this.loadAd = 0;
        this.crashlytics = 0;
        this.amazon = 0;
    }

    public String toString() {
        String str;
        switch (this.yandex) {
            case 3:
                StringBuilder sb = new StringBuilder();
                int i = this.loadAd;
                if (i == 1) {
                    str = "DELETE";
                } else if (i == 2) {
                    str = "EQUAL";
                } else if (i == 3) {
                    str = "INSERT";
                } else if (i == 4) {
                    str = "REPLACE";
                } else {
                    if (i != 5) {
                        throw null;
                    }
                    str = "KEEP";
                }
                sb.append(str);
                sb.append("(");
                sb.append(this.crashlytics);
                sb.append(",");
                return AbstractC14814l.remoteconfig(this.amazon, ")", sb);
            case 4:
                StringBuilder sb2 = new StringBuilder("(");
                sb2.append(this.loadAd);
                sb2.append(",");
                sb2.append(this.crashlytics);
                sb2.append(",");
                return AbstractC14814l.remoteconfig(this.amazon, ")", sb2);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C15380l(int i, int i2, int i3, int i4) {
        this.yandex = i4;
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = i3;
    }
}
