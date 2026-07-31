package defpackage;

import android.net.Uri;

/* JADX INFO: renamed from: lٌٗۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8842l {
    public static final String loadAd;
    public final Uri yandex;

    static {
        String str = AbstractC15323l.yandex;
        loadAd = Integer.toString(0, 36);
    }

    public C8842l(C7972l c7972l) {
        this.yandex = (Uri) c7972l.f16631l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8842l) && this.yandex.equals(((C8842l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode() * 31;
    }
}
