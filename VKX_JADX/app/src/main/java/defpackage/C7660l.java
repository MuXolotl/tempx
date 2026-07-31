package defpackage;

/* JADX INFO: renamed from: lؚۦۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C7660l {
    public static final C10627l Companion = new C10627l();
    public final String loadAd;
    public final C18010l yandex;

    public /* synthetic */ C7660l(int i, C18010l c18010l, String str) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C10992l.yandex.purchase());
            throw null;
        }
        this.yandex = c18010l;
        this.loadAd = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7660l)) {
            return false;
        }
        C7660l c7660l = (C7660l) obj;
        return AbstractC8576l.yandex(this.yandex, c7660l.yandex) && AbstractC8576l.yandex(this.loadAd, c7660l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.f35200l.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SaveAudioPlaylistCoverResponse(photo=");
        sb.append(this.yandex);
        sb.append(", hash=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }
}
