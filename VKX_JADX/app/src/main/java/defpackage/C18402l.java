package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: lٙۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18402l {
    public final Map admob;
    public final Long amazon;
    public final Long billing;
    public final C14025l crashlytics;
    public final boolean loadAd;
    public final Long mopub;
    public final Long purchase;
    public final boolean yandex;

    public C18402l(boolean z, boolean z2, C14025l c14025l, Long l, Long l2, Long l3, Long l4, Map map) {
        this.yandex = z;
        this.loadAd = z2;
        this.crashlytics = c14025l;
        this.amazon = l;
        this.purchase = l2;
        this.billing = l3;
        this.mopub = l4;
        this.admob = AbstractC8676l.tapsense(map);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.yandex) {
            arrayList.add("isRegularFile");
        }
        if (this.loadAd) {
            arrayList.add("isDirectory");
        }
        Long l = this.amazon;
        if (l != null) {
            arrayList.add("byteCount=" + l.longValue());
        }
        Long l2 = this.purchase;
        if (l2 != null) {
            arrayList.add("createdAt=" + l2.longValue());
        }
        Long l3 = this.billing;
        if (l3 != null) {
            arrayList.add("lastModifiedAt=" + l3.longValue());
        }
        Long l4 = this.mopub;
        if (l4 != null) {
            arrayList.add("lastAccessedAt=" + l4.longValue());
        }
        Map map = this.admob;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return AbstractC16901l.m4210case(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public /* synthetic */ C18402l(boolean z, boolean z2, C14025l c14025l, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, c14025l, l, l2, l3, l4, C14054l.f27396l);
    }
}
