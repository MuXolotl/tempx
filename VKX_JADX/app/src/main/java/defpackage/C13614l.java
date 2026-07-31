package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lْۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13614l {
    public static final C13614l purchase = new C13614l(EnumC18610l.f36363l, 0.0f, C16395l.f32076l, new C10935l(1, null));
    public final Function1 amazon;
    public final Function0 crashlytics;
    public final float loadAd;
    public final EnumC18610l yandex;

    public C13614l(EnumC18610l enumC18610l, float f, Function0 function0, Function1 function1) {
        this.yandex = enumC18610l;
        this.loadAd = f;
        this.crashlytics = function0;
        this.amazon = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13614l)) {
            return false;
        }
        C13614l c13614l = (C13614l) obj;
        return this.yandex == c13614l.yandex && Float.compare(this.loadAd, c13614l.loadAd) == 0 && this.crashlytics.equals(c13614l.crashlytics) && this.amazon.equals(c13614l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + ((this.crashlytics.hashCode() + AbstractC9029l.mopub(this.yandex.hashCode() * 31, this.loadAd, 31)) * 31);
    }

    public final String toString() {
        return "ScrollInfo(direction=" + this.yandex + ", speedMultiplier=" + this.loadAd + ", maxScrollDistanceProvider=" + this.crashlytics + ", onScroll=" + this.amazon + ')';
    }
}
