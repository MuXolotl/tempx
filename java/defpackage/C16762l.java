package defpackage;

/* JADX INFO: renamed from: lٖۥٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16762l {
    public final String yandex;

    public C16762l(String str) {
        this.yandex = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16762l) {
            return AbstractC8576l.yandex(this.yandex, ((C16762l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return this.yandex;
    }
}
