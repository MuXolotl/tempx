package defpackage;

/* JADX INFO: renamed from: lؕۥؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C3757l {
    public static final C15904l Companion = new C15904l();
    public final C15407l yandex;

    public /* synthetic */ C3757l(int i, C15407l c15407l) {
        if (1 == (i & 1)) {
            this.yandex = c15407l;
        } else {
            AbstractC11036l.isPro(i, 1, C1284l.yandex.purchase());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3757l) && AbstractC8576l.yandex(this.yandex, ((C3757l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "AudioGetStreamMixSettingsResponseDto(settings=" + this.yandex + ')';
    }
}
