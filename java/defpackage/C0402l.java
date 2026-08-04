package defpackage;

/* JADX INFO: renamed from: lۣؑٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C0402l {
    public static final C13647l Companion = new C13647l();
    public static final InterfaceC1220l[] loadAd = {AbstractC9968l.crashlytics(2, new C7703l(17))};
    public final EnumC17046l yandex;

    public /* synthetic */ C0402l(int i, EnumC17046l enumC17046l) {
        if (1 == (i & 1)) {
            this.yandex = enumC17046l;
        } else {
            AbstractC11036l.isPro(i, 1, C6059l.yandex.purchase());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0402l) && this.yandex == ((C0402l) obj).yandex;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "BaseResultDto(result=" + this.yandex + ')';
    }
}
