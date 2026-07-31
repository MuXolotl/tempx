package defpackage;

/* JADX INFO: renamed from: lؘُۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5603l implements InterfaceC1832l {
    public static final C5603l yandex = new C5603l();

    public final String toString() {
        return "SingleLineCodepointTransformation";
    }

    @Override // defpackage.InterfaceC1832l
    public final int yandex(int i, int i2) {
        if (i2 == 10) {
            return 32;
        }
        if (i2 == 13) {
            return 65279;
        }
        return i2;
    }
}
