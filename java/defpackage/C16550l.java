package defpackage;

/* JADX INFO: renamed from: lٖٟ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16550l implements InterfaceC14447l {
    public final /* synthetic */ int loadAd;

    public /* synthetic */ C16550l(int i) {
        this.loadAd = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // defpackage.InterfaceC14447l
    public final C13315l loadAd() {
        switch (this.loadAd) {
        }
        InterfaceC14447l.yandex.getClass();
        return C18498l.loadAd;
    }

    @Override // defpackage.InterfaceC14447l
    public final float yandex(float f, float f2, float f3) {
        switch (this.loadAd) {
            case 0:
                InterfaceC14447l.yandex.getClass();
                float f4 = f2 + f;
                if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
                    return 0.0f;
                }
                float f5 = f4 - f3;
                return Math.abs(f) < Math.abs(f5) ? f : f5;
            default:
                float fAbs = Math.abs((f2 + f) - f);
                float f6 = (0.3f * f3) - (0.0f * fAbs);
                float f7 = f3 - f6;
                if ((fAbs <= f3) && f7 < fAbs) {
                    f6 = f3 - fAbs;
                }
                return f - f6;
        }
    }
}
