package defpackage;

/* JADX INFO: renamed from: lؚؕٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3482l implements InterfaceC2180l {
    public final Object yandex;

    public C3482l(Object obj) {
        this.yandex = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3482l) && AbstractC8576l.yandex(this.yandex, ((C3482l) obj).yandex);
    }

    public final int hashCode() {
        Object obj = this.yandex;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.yandex + ")";
    }

    @Override // defpackage.InterfaceC2180l
    public final Object yandex(InterfaceC18556l interfaceC18556l) {
        return this.yandex;
    }
}
