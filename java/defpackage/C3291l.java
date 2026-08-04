package defpackage;

/* JADX INFO: renamed from: lٍْؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3291l extends AbstractC12175l {
    public final long yandex;

    public C3291l(long j) {
        this.yandex = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3291l) && this.yandex == ((C3291l) obj).yandex;
    }

    public final int hashCode() {
        long j = this.yandex;
        return (int) (j ^ (j >>> 32));
    }

    @Override // defpackage.AbstractC12175l
    public final Object yandex() {
        return Long.valueOf(this.yandex);
    }
}
