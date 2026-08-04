package defpackage;

/* JADX INFO: renamed from: l٘ۙۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18170l extends Cgoto {
    @Override // defpackage.Cgoto
    /* JADX INFO: renamed from: l٘ٗ۟ */
    public final int mo232l(String str, String str2, C6829l c6829l) {
        long jRound;
        String strMo2021apply = c6829l.mo2021apply(str);
        String strMo2021apply2 = c6829l.mo2021apply(str2);
        int length = strMo2021apply.length();
        int length2 = strMo2021apply2.length();
        if (length == 0 || length2 == 0) {
            return 0;
        }
        int iRound = (int) Math.round(AbstractC9464l.subs(strMo2021apply, strMo2021apply2) * 100.0d);
        double dMax = ((double) Math.max(length, length2)) / ((double) Math.min(length, length2));
        boolean z = dMax >= 1.5d;
        double d = dMax > 8.0d ? 0.6d : 0.9d;
        if (z) {
            double dAppmetrica = ((double) new C6096l(7).appmetrica(strMo2021apply, strMo2021apply2)) * d;
            C6829l c6829l2 = new C6829l();
            double dAppmetrica2 = ((double) new C6096l(7).appmetrica(AbstractC13526l.m3649l(strMo2021apply, c6829l2), AbstractC13526l.m3649l(strMo2021apply2, c6829l2))) * 0.95d * d;
            C6196l c6196l = new C6196l();
            double[] dArr = {iRound, dAppmetrica, dAppmetrica2, ((double) c6196l.mo1968l(strMo2021apply, strMo2021apply2, new C6096l(7), (C6829l) c6196l.f833l)) * 0.95d * d};
            double d2 = dArr[0];
            for (int i = 0; i < 4; i++) {
                double d3 = dArr[i];
                if (d3 > d2) {
                    d2 = d3;
                }
            }
            jRound = Math.round(d2);
        } else {
            C6829l c6829l3 = new C6829l();
            double dRound = ((double) ((int) Math.round(AbstractC9464l.subs(AbstractC13526l.m3649l(strMo2021apply, c6829l3), AbstractC13526l.m3649l(strMo2021apply2, c6829l3)) * 100.0d))) * 0.95d;
            C6196l c6196l2 = new C6196l();
            double[] dArr2 = {iRound, dRound, ((double) c6196l2.mo1968l(strMo2021apply, strMo2021apply2, new C6096l(10), (C6829l) c6196l2.f833l)) * 0.95d};
            double d4 = dArr2[0];
            for (int i2 = 0; i2 < 3; i2++) {
                double d5 = dArr2[i2];
                if (d5 > d4) {
                    d4 = d5;
                }
            }
            jRound = Math.round(d4);
        }
        return (int) jRound;
    }
}
