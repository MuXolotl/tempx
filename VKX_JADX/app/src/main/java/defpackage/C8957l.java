package defpackage;

/* JADX INFO: renamed from: lٌٟؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8957l {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C8957l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    public final void loadAd() {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                ((C6956l) obj).signatures++;
                break;
            default:
                ((C8080l) obj).firebase++;
                break;
        }
    }

    public final void yandex() {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                ((C6956l) obj).signatures--;
                break;
            default:
                ((C8080l) obj).firebase--;
                break;
        }
    }
}
