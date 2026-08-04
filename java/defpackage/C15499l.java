package defpackage;

import java.util.Set;

/* JADX INFO: renamed from: lٍؘٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15499l {
    public String amazon;
    public C15452l billing;
    public long crashlytics;
    public long loadAd;
    public String purchase;
    public Set yandex;

    public final void loadAd(String str) {
        if (str.length() <= 0) {
            C8339l.metrica("A non-empty filename must be provided.");
            return;
        }
        String str2 = AbstractC8942l.yandex;
        if (AbstractC12024l.appmetrica(str, str2, false)) {
            C10754l.metrica(AbstractC14814l.ads("Name cannot contain path separator '", str2, "': '", str, "'"));
        } else if (str.equals(".realm")) {
            C8339l.metrica("'.realm' is not a valid filename");
        } else {
            this.amazon = str;
        }
    }

    public final C12125l yandex() {
        C11534l c11534l = new C11534l(3);
        String str = this.amazon;
        int i = 1;
        int i2 = 0;
        return new C12125l(this.purchase, str, this.yandex, this.loadAd, new C8677l(i, AbstractC14814l.startapp("notifier-", str), i2), new C8677l(i, AbstractC14814l.startapp("writer-", str), i2), this.crashlytics, this.billing, c11534l);
    }
}
