package defpackage;

/* JADX INFO: renamed from: lؚْؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7225l implements InterfaceC6951l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C7225l f15054l = new C7225l(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f}, 0);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final float[] f15055l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15056l;

    public /* synthetic */ C7225l(float[] fArr, int i) {
        this.f15056l = i;
        this.f15055l = fArr;
    }

    public String toString() {
        switch (this.f15056l) {
            case 0:
                return "Bradford";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC6951l
    public long yandex(float f, float f2) {
        long jLoadAd = C10924l.loadAd((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), this.f15055l);
        return C9699l.yandex(Float.intBitsToFloat((int) (jLoadAd >> 32)), Float.intBitsToFloat((int) (jLoadAd & 4294967295L)));
    }
}
