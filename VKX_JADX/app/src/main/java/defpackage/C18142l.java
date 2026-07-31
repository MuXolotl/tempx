package defpackage;

/* JADX INFO: renamed from: l٘ۗۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18142l {
    public final long yandex;

    public static long yandex(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C18142l) {
            return this.yandex == ((C18142l) obj).yandex;
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
        sb.append((int) (j >> 32));
        sb.append(", ");
        return AbstractC0653l.adcel(sb, (int) (j & 4294967295L), ')');
    }
}
