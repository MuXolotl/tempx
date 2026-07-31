package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lًۜؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8273l {
    public final Integer loadAd;
    public final EnumC8628l yandex;

    public /* synthetic */ C8273l(C0848l c0848l) {
        this.yandex = (EnumC8628l) c0848l.f2499l;
        this.loadAd = (Integer) c0848l.f2498l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8273l)) {
            return false;
        }
        C8273l c8273l = (C8273l) obj;
        return AbstractC7236l.amazon(this.yandex, c8273l.yandex) && AbstractC7236l.amazon(this.loadAd, c8273l.loadAd) && AbstractC7236l.amazon(null, null) && AbstractC7236l.amazon(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.yandex, this.loadAd, null, null});
    }
}
