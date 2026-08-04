package defpackage;

/* JADX INFO: renamed from: lُٓۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C14488l {
    public static final C5370l Companion = new C5370l();
    public static final InterfaceC1220l[] crashlytics = {AbstractC9968l.crashlytics(2, new C14499l(15)), AbstractC9968l.crashlytics(2, new C14499l(16))};
    public final EnumC11773l loadAd;
    public final EnumC2709l yandex;

    public /* synthetic */ C14488l(int i, EnumC2709l enumC2709l, EnumC11773l enumC11773l) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C10886l.yandex.purchase());
            throw null;
        }
        this.yandex = enumC2709l;
        this.loadAd = enumC11773l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14488l)) {
            return false;
        }
        C14488l c14488l = (C14488l) obj;
        return this.yandex == c14488l.yandex && this.loadAd == c14488l.loadAd;
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "AudioPlaylistActionDto(type=" + this.yandex + ", location=" + this.loadAd + ')';
    }
}
