package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lٜؖٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4253l {
    public final String amazon;
    public int crashlytics;
    public final int loadAd;
    public final Object yandex;

    public C4253l(int i, int i2, Object obj, String str) {
        this.yandex = obj;
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4253l)) {
            return false;
        }
        C4253l c4253l = (C4253l) obj;
        return AbstractC8576l.yandex(this.yandex, c4253l.yandex) && this.loadAd == c4253l.loadAd && this.crashlytics == c4253l.crashlytics && AbstractC8576l.yandex(this.amazon, c4253l.amazon);
    }

    public final int hashCode() {
        Object obj = this.yandex;
        return this.amazon.hashCode() + ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.loadAd) * 31) + this.crashlytics) * 31);
    }

    public final String toString() {
        return "MutableRange(item=" + this.yandex + ", start=" + this.loadAd + ", end=" + this.crashlytics + ", tag=" + this.amazon + ")";
    }

    public final C15012l yandex(int i) {
        int i2 = this.crashlytics;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (!(i != Integer.MIN_VALUE)) {
            AbstractC1786l.loadAd("Item.end should be set first");
        }
        return new C15012l(this.loadAd, i, this.yandex, this.amazon);
    }

    public /* synthetic */ C4253l(InterfaceC18302l interfaceC18302l, int i, int i2, int i3) {
        this(i, (i3 & 4) != 0 ? RecyclerView.UNDEFINED_DURATION : i2, interfaceC18302l, "");
    }
}
