package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lًَِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10161l {
    public final long loadAd;
    public final String yandex;

    public C10161l(long j, String str) {
        this.yandex = str;
        this.loadAd = j;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10161l) {
            C10161l c10161l = (C10161l) obj;
            if (AbstractC7236l.amazon(this.yandex, c10161l.yandex)) {
                if (AbstractC7236l.amazon(Long.valueOf(this.loadAd), Long.valueOf(c10161l.loadAd))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.yandex, Long.valueOf(this.loadAd)});
    }
}
