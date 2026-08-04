package defpackage;

/* JADX INFO: renamed from: lَِٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12011l {
    public final long yandex;

    public /* synthetic */ C12011l(long j) {
        this.yandex = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12011l) {
            return this.yandex == ((C12011l) obj).yandex;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.yandex;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return AbstractC2812l.subscription(this.yandex, "IndirectPointerEventData(packedValue=", ")");
    }
}
