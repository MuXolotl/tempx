package defpackage;

import java.io.InputStream;

/* JADX INFO: renamed from: lٌٍؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9284l {
    public Object crashlytics;
    public int loadAd;
    public int yandex;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static AbstractC9284l m2630package(InputStream inputStream, int i) {
        if (i <= 0) {
            C8339l.metrica("bufferSize must be > 0");
            return null;
        }
        if (inputStream != null) {
            return new C14241l(inputStream, i);
        }
        C1875l c1875l = new C1875l(AbstractC16728l.yandex);
        try {
            c1875l.isVip(0);
            return c1875l;
        } catch (C9893l e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static int m2631strictfp(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static long m2632volatile(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public abstract int Signature();

    /* JADX INFO: renamed from: abstract */
    public abstract int mo1067abstract();

    public abstract boolean ad(int i);

    public abstract int adcel();

    public abstract double admob();

    public abstract long ads();

    public void advert() throws C5957l {
        boolean zAd;
        do {
            int iSignature = Signature();
            if (iSignature == 0) {
                return;
            }
            int i = this.yandex;
            int i2 = this.loadAd;
            if (i + i2 >= 100) {
                throw new C5957l("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.loadAd = i2 + 1;
            zAd = ad(iSignature);
            this.loadAd--;
        } while (zAd);
    }

    public abstract void amazon(int i);

    public abstract boolean applovin();

    public abstract int appmetrica();

    public abstract boolean billing();

    /* JADX INFO: renamed from: case */
    public abstract int mo1069case();

    /* JADX INFO: renamed from: catch */
    public abstract long mo1070catch();

    /* JADX INFO: renamed from: class */
    public abstract boolean mo1071class();

    /* JADX INFO: renamed from: continue */
    public abstract int mo1072continue();

    public abstract boolean crashlytics();

    /* JADX INFO: renamed from: default */
    public abstract C2530l mo1073default();

    /* JADX INFO: renamed from: else */
    public abstract long mo1074else();

    /* JADX INFO: renamed from: extends */
    public abstract boolean mo1075extends(int i);

    /* JADX INFO: renamed from: final */
    public abstract byte[] mo1076final();

    /* JADX INFO: renamed from: finally */
    public abstract long mo1077finally();

    public abstract long firebase();

    /* JADX INFO: renamed from: for */
    public abstract double mo1078for();

    /* JADX INFO: renamed from: goto */
    public abstract int mo1079goto();

    /* JADX INFO: renamed from: import */
    public abstract long mo1080import();

    public abstract int inmobi(int i, int i2, byte[] bArr);

    /* JADX INFO: renamed from: instanceof */
    public abstract long mo1081instanceof();

    /* JADX INFO: renamed from: interface */
    public abstract String mo1082interface();

    public abstract int isPro();

    public abstract int isVip(int i);

    public abstract int license();

    public abstract int loadAd();

    public abstract int metrica();

    public abstract C4966l mopub();

    /* JADX INFO: renamed from: native */
    public abstract int mo1083native();

    /* JADX INFO: renamed from: new */
    public abstract int mo1084new();

    public abstract int premium();

    /* JADX INFO: renamed from: private */
    public abstract void mo1085private(int i);

    public abstract long pro();

    /* JADX INFO: renamed from: public */
    public abstract int mo1087public();

    public abstract int purchase(int i);

    public abstract int remoteconfig();

    public abstract void signatures(int i);

    public abstract float smaato();

    public abstract long startapp();

    /* JADX INFO: renamed from: static */
    public abstract String mo1088static();

    public abstract int subs();

    public abstract String subscription();

    /* JADX INFO: renamed from: super */
    public abstract int mo1089super();

    /* JADX INFO: renamed from: switch */
    public abstract long mo1090switch();

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public void m2633synchronized() throws C9893l {
        boolean zMo1075extends;
        do {
            int iMo1083native = mo1083native();
            if (iMo1083native == 0) {
                return;
            }
            int i = this.yandex;
            int i2 = this.loadAd;
            if (i + i2 >= 100) {
                C11586l.admob("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                return;
            } else {
                this.loadAd = i2 + 1;
                zMo1075extends = mo1075extends(iMo1083native);
                this.loadAd--;
            }
        } while (zMo1075extends);
    }

    public abstract String tapsense();

    /* JADX INFO: renamed from: throw */
    public abstract float mo1092throw();

    /* JADX INFO: renamed from: throws */
    public abstract void mo1093throws(int i);

    public abstract long vip();

    public abstract void yandex(int i);
}
