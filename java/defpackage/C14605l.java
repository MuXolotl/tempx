package defpackage;

import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lؚٔؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14605l {
    public final Executor loadAd;
    public final int yandex;

    public /* synthetic */ C14605l(int i, Executor executor) {
        this.yandex = i;
        this.loadAd = executor;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14605l)) {
            return false;
        }
        C14605l c14605l = (C14605l) obj;
        return this.yandex == c14605l.yandex && AbstractC7236l.amazon(this.loadAd, c14605l.loadAd) && AbstractC7236l.amazon(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.yandex), Boolean.FALSE, this.loadAd, null});
    }
}
