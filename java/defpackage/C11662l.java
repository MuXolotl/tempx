package defpackage;

/* JADX INFO: renamed from: lؘِٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11662l implements InterfaceC1832l {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C11662l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // defpackage.InterfaceC1832l
    public final int yandex(int i, int i2) {
        int i3 = this.yandex;
        Object obj = this.loadAd;
        switch (i3) {
            case 0:
                return ((Character) ((InterfaceC8714l) obj).getValue()).charValue();
            default:
                C0358l c0358l = (C0358l) obj;
                return i == ((C15308l) c0358l.loadAd.f26670l).admob() ? i2 : ((Character) c0358l.yandex.getValue()).charValue();
        }
    }
}
