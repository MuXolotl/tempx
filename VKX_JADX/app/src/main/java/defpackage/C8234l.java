package defpackage;

/* JADX INFO: renamed from: lًۙٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8234l extends AbstractC12175l {
    public final long yandex;

    public C8234l(long j) {
        this.yandex = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8234l) && this.yandex == ((C8234l) obj).yandex;
    }

    public final int hashCode() {
        return C10882l.yandex(this.yandex);
    }

    @Override // defpackage.AbstractC12175l
    public final Object yandex() {
        return new C10882l(this.yandex);
    }
}
