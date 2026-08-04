package defpackage;

/* JADX INFO: renamed from: lٔؑ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C14614l implements InterfaceC3997l {
    public static final C10169l Companion = new C10169l();
    public static final InterfaceC1220l[] loadAd = {AbstractC9968l.crashlytics(2, new C11200l(4))};
    public final EnumC0780l yandex;

    public /* synthetic */ C14614l(int i, EnumC0780l enumC0780l) {
        if (1 == (i & 1)) {
            this.yandex = enumC0780l;
        } else {
            AbstractC11036l.isPro(i, 1, C15648l.yandex.purchase());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14614l) && this.yandex == ((C14614l) obj).yandex;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "TransferFinished(result=" + this.yandex + ')';
    }

    public C14614l(EnumC0780l enumC0780l) {
        this.yandex = enumC0780l;
    }
}
