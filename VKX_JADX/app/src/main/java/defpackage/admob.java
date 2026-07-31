package defpackage;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class admob implements InterfaceC18565l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final admob f4l = new admob();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final double f3l = ((Math.log(65504.0d) / AbstractC14117l.yandex) + 9.72d) / 17.52d;

    @Override // defpackage.InterfaceC18565l
    public final float mopub(float f) {
        double dPow;
        double d = f;
        if (d <= -0.3013698630136986d) {
            dPow = (AbstractC16358l.billing(2.0d, (d * 17.52d) - 9.72d) - 1.52587890625E-5d) * 2.0d;
        } else {
            dPow = d < f3l ? Math.pow(2.0d, (d * 17.52d) - 9.72d) : 65504.0d;
        }
        return (float) dPow;
    }

    @Override // defpackage.InterfaceC18565l
    public final float vip(float f) {
        double dLog;
        double d = f;
        if (d < 3.0517578125E-5d) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            dLog = Math.log((((double) f) / 2.0d) + 1.52587890625E-5d) / AbstractC14117l.yandex;
        } else {
            dLog = (float) (Math.log(d) / AbstractC14117l.yandex);
        }
        return (float) ((dLog + 9.72d) / 17.52d);
    }
}
