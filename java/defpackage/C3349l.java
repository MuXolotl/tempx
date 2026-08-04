package defpackage;

/* JADX INFO: renamed from: lّؕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3349l extends AbstractC1030l {
    public C2397l loadAd;
    public long yandex;

    @Override // defpackage.AbstractC1030l
    public final InterfaceC14029l[] loadAd(AbstractC4443l abstractC4443l) {
        long j = this.yandex;
        this.yandex = -1L;
        this.loadAd = null;
        return ((C8490l) abstractC4443l).pro(j);
    }

    @Override // defpackage.AbstractC1030l
    public final boolean yandex(AbstractC4443l abstractC4443l) {
        C8490l c8490l = (C8490l) abstractC4443l;
        if (this.yandex >= 0) {
            return false;
        }
        long j = c8490l.f17551l;
        if (j < c8490l.f17548l) {
            c8490l.f17548l = j;
        }
        this.yandex = j;
        return true;
    }
}
