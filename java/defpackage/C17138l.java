package defpackage;

import android.text.TextUtils;
import java.util.UUID;

/* JADX INFO: renamed from: lٗٔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17138l {
    public final UUID crashlytics;
    public final C13708l loadAd;
    public final C13708l yandex;

    public C17138l(C13708l c13708l, C13708l c13708l2, UUID uuid) {
        this.yandex = c13708l;
        this.loadAd = c13708l2;
        this.crashlytics = uuid;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17138l)) {
            return false;
        }
        C17138l c17138l = (C17138l) obj;
        return this.yandex.equals(c17138l.yandex) && this.loadAd.equals(c17138l.loadAd) && this.crashlytics.equals(c17138l.crashlytics);
    }

    public final int hashCode() {
        return (this.crashlytics.hashCode() ^ ((((this.yandex.hashCode() ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * 1000003)) * 1000003;
    }

    public final String toString() {
        return TextUtils.join(" -> ", this.yandex);
    }
}
