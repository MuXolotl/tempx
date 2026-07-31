package defpackage;

/* JADX INFO: renamed from: lٍٜۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9699l {
    public final long yandex;

    public static long yandex(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9699l) {
            return this.yandex == ((C9699l) obj).yandex;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.yandex;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.yandex;
        sb.append(Float.intBitsToFloat((int) (j >> 32)));
        sb.append(", ");
        sb.append(Float.intBitsToFloat((int) (j & 4294967295L)));
        sb.append(')');
        return sb.toString();
    }
}
