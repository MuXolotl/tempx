package android.support.v4.media.session;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class amazon {
    public float amazon;
    public long billing;
    public long crashlytics;
    public int loadAd;
    public long purchase;
    public final ArrayList yandex = new ArrayList();
    public final long mopub = -1;

    public final PlaybackStateCompat yandex() {
        return new PlaybackStateCompat(this.loadAd, this.crashlytics, 0L, this.amazon, this.purchase, 0, null, this.billing, this.yandex, this.mopub, null);
    }
}
