package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٓ٘ۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14218l {
    public final List loadAd;
    public final float yandex;

    public C14218l(int i, float f) {
        this((i & 1) != 0 ? 0.0f : f, C2580l.f5619l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14218l)) {
            return false;
        }
        C14218l c14218l = (C14218l) obj;
        return C14467l.loadAd(this.yandex, c14218l.yandex) && AbstractC8576l.yandex(this.loadAd, c14218l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (Float.floatToIntBits(this.yandex) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaddingDimension(dp=");
        sb.append((Object) C14467l.crashlytics(this.yandex));
        sb.append(", resourceIds=");
        return AbstractC0653l.subscription(sb, this.loadAd, ')');
    }

    public final C14218l yandex(C14218l c14218l) {
        return new C14218l(this.yandex + c14218l.yandex, AbstractC16901l.m4232new(this.loadAd, c14218l.loadAd));
    }

    public C14218l(float f, List list) {
        this.yandex = f;
        this.loadAd = list;
    }
}
