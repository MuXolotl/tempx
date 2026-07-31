package defpackage;

/* JADX INFO: renamed from: lؘۘ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5923l {
    public final float yandex;

    public C5923l(float f) {
        this.yandex = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C5923l.class == obj.getClass() && this.yandex == ((C5923l) obj).yandex;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f) + AbstractC9029l.mopub(Float.floatToIntBits(1.0f) * 31, this.yandex, 31);
    }

    public final String toString() {
        return "CardScale(scale=1.0, focusedScale=" + this.yandex + ", pressedScale=1.0)";
    }
}
