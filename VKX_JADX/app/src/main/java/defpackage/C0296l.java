package defpackage;

/* JADX INFO: renamed from: lْؑٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C0296l {
    public static final C17875l Companion = new C17875l();
    public static final InterfaceC1220l[] loadAd = {AbstractC9968l.crashlytics(2, new C8631l(0))};
    public final EnumC17988l yandex;

    public /* synthetic */ C0296l(int i, EnumC17988l enumC17988l) {
        if ((i & 1) == 0) {
            this.yandex = null;
        } else {
            this.yandex = enumC17988l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0296l) && this.yandex == ((C0296l) obj).yandex;
    }

    public final int hashCode() {
        EnumC17988l enumC17988l = this.yandex;
        if (enumC17988l == null) {
            return 0;
        }
        return enumC17988l.hashCode();
    }

    public final String toString() {
        return "AudioPlaylistMetaDto(view=" + this.yandex + ')';
    }
}
