package defpackage;

/* JADX INFO: renamed from: lًؑٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0408l extends AbstractC12175l {
    public final String yandex;

    public C0408l(String str) {
        this.yandex = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0408l) && AbstractC8576l.yandex(this.yandex, ((C0408l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    @Override // defpackage.AbstractC12175l
    public final Object yandex() {
        return this.yandex;
    }
}
