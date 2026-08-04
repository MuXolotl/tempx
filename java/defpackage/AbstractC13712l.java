package defpackage;

/* JADX INFO: renamed from: lَْ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13712l extends AbstractC3126l {
    public int crashlytics;
    public String loadAd;
    public C15101l[] yandex;

    public AbstractC13712l(AbstractC13712l abstractC13712l) {
        this.yandex = null;
        this.crashlytics = 0;
        this.loadAd = abstractC13712l.loadAd;
        this.yandex = AbstractC15300l.admob(abstractC13712l.yandex);
    }

    public C15101l[] getPathData() {
        return this.yandex;
    }

    public String getPathName() {
        return this.loadAd;
    }

    public void setPathData(C15101l[] c15101lArr) {
        if (!AbstractC15300l.amazon(this.yandex, c15101lArr)) {
            this.yandex = AbstractC15300l.admob(c15101lArr);
            return;
        }
        C15101l[] c15101lArr2 = this.yandex;
        for (int i = 0; i < c15101lArr.length; i++) {
            c15101lArr2[i].yandex = c15101lArr[i].yandex;
            int i2 = 0;
            while (true) {
                float[] fArr = c15101lArr[i].loadAd;
                if (i2 < fArr.length) {
                    c15101lArr2[i].loadAd[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public AbstractC13712l() {
        this.yandex = null;
        this.crashlytics = 0;
    }
}
