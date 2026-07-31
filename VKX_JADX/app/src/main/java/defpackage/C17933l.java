package defpackage;

/* JADX INFO: renamed from: l٘ٔۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17933l extends AbstractC10033l {
    public final /* synthetic */ C1424l loadAd;
    public float yandex = 0.0f;

    public C17933l(C1424l c1424l) {
        this.loadAd = c1424l;
    }

    @Override // defpackage.AbstractC10033l
    public final void subs(String str) {
        this.yandex = ((C16539l) this.loadAd.f3601l).amazon.measureText(str) + this.yandex;
    }
}
