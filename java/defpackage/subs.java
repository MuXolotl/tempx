package defpackage;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class subs implements InterfaceC18565l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final subs f36579l = new subs();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final double f36578l = ((Math.log(65504.0d) / AbstractC14117l.yandex) + 9.72d) / 17.52d;

    @Override // defpackage.InterfaceC18565l
    public final float mopub(float f) {
        double dPow;
        double d = f;
        if (d <= 0.155251141552511d) {
            dPow = (d - 0.0729055341958355d) / 10.5402377416545d;
        } else {
            dPow = d < f36578l ? Math.pow(2.0d, (d * 17.52d) - 9.72d) : 65504.0d;
        }
        return (float) dPow;
    }

    @Override // defpackage.InterfaceC18565l
    public final float vip(float f) {
        double d = f;
        return (float) (d < 0.0078125d ? (d * 10.5402377416545d) + 0.0729055341958355d : (((double) ((float) (Math.log(d) / AbstractC14117l.yandex))) + 9.72d) / 17.52d);
    }
}
