package defpackage;

/* JADX INFO: renamed from: lًٖۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16603l extends AbstractC1679l {
    public final C13703l crashlytics;
    public final /* synthetic */ int loadAd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16603l(C13703l c13703l, int i) {
        super(Float.valueOf(0.0f));
        this.loadAd = i;
        switch (i) {
            case 1:
                super(0);
                this.crashlytics = c13703l;
                c13703l.yandex().setTint(0);
                break;
            default:
                this.crashlytics = c13703l;
                C13557l c13557lYandex = c13703l.yandex();
                c13557lYandex.getClass();
                c13557lYandex.setBounds(0, 0, AbstractC5573l.ads(0.0f), AbstractC5573l.ads(0.0f));
                break;
        }
    }

    public final void billing(Object obj) {
        int i = this.loadAd;
        C13703l c13703l = this.crashlytics;
        switch (i) {
            case 0:
                Float f = (Float) obj;
                if (!((Float) this.yandex).equals(f)) {
                    this.yandex = f;
                    C13557l c13557lYandex = c13703l.yandex();
                    float fFloatValue = ((Float) this.yandex).floatValue();
                    c13557lYandex.getClass();
                    float f2 = fFloatValue * 2.0f;
                    c13557lYandex.setBounds(0, 0, AbstractC5573l.ads(f2), AbstractC5573l.ads(f2));
                }
                break;
            default:
                Integer num = (Integer) obj;
                if (!((Integer) this.yandex).equals(num)) {
                    this.yandex = num;
                    c13703l.yandex().setTint(((Integer) this.yandex).intValue());
                }
                break;
        }
    }
}
