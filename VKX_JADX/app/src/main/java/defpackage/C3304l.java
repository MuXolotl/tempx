package defpackage;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: lٌَؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3304l {
    public String admob;
    public byte[] amazon;
    public long billing;
    public int crashlytics;
    public Object isPro;
    public long loadAd;
    public long mopub;
    public Map purchase;
    public int subs;
    public Uri yandex;

    public final C2432l yandex() {
        AbstractC12442l.metrica(this.yandex, "The uri must be set.");
        return new C2432l(this.yandex, this.loadAd, this.crashlytics, this.amazon, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.isPro);
    }
}
