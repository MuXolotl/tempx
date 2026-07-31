package defpackage;

/* JADX INFO: renamed from: lؒۥّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1468l implements InterfaceC18217l {
    public final EnumC4948l yandex;

    public C1468l(EnumC4948l enumC4948l) {
        this.yandex = enumC4948l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1468l) && this.yandex == ((C1468l) obj).yandex;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "SetEqualizerEngine(engine=" + this.yandex + ')';
    }
}
