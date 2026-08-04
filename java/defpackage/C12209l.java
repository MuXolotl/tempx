package defpackage;

/* JADX INFO: renamed from: lِّۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12209l {
    public final C3407l yandex;

    public C12209l(C3407l c3407l) {
        this.yandex = c3407l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12209l) && AbstractC8576l.yandex(this.yandex, ((C12209l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.yandex + ", loaderKey=null)";
    }
}
