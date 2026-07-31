package defpackage;

/* JADX INFO: renamed from: lؙٗۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6524l extends AbstractC16531l {
    public final C1636l loadAd;
    public final String yandex;

    public C6524l(String str, C1636l c1636l) {
        this.yandex = str;
        this.loadAd = c1636l;
    }

    @Override // defpackage.AbstractC16531l
    public final void billing(int i) {
        C1636l c1636l;
        String str = this.yandex;
        if (str == null || (c1636l = this.loadAd) == null) {
            return;
        }
        c1636l.smaato(i, str);
    }

    @Override // defpackage.AbstractC16531l
    public final void subs(int i) {
        C1636l c1636l;
        String str = this.yandex;
        if (str == null || (c1636l = this.loadAd) == null) {
            return;
        }
        c1636l.remoteconfig(i, str);
    }
}
