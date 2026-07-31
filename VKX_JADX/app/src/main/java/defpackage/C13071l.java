package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: lْؒٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13071l {
    public static final AtomicLong mopub = new AtomicLong();
    public final long amazon;
    public final long billing;
    public final Map crashlytics;
    public final Uri loadAd;
    public final long purchase;
    public final C2432l yandex;

    public C13071l(C2432l c2432l, Uri uri, Map map, long j, long j2, long j3) {
        this.yandex = c2432l;
        this.loadAd = uri;
        this.crashlytics = map;
        this.amazon = j;
        this.purchase = j2;
        this.billing = j3;
    }

    public C13071l(C2432l c2432l, long j) {
        this(c2432l, c2432l.yandex, Collections.EMPTY_MAP, j, 0L, 0L);
    }
}
