package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;

/* JADX INFO: renamed from: lٟؓؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2012l extends TextPaint {
    public C14174l admob;
    public C0387l amazon;
    public AbstractC9544l billing;
    public int crashlytics;
    public C9867l loadAd;
    public C8610l mopub;
    public C9735l purchase;
    public AbstractC3239l subs;
    public C4480l yandex;

    public final void amazon(long j) {
        C9735l c9735l = this.purchase;
        if (c9735l == null ? false : C9735l.crashlytics(c9735l.yandex, j)) {
            return;
        }
        if (j != 16) {
            this.purchase = new C9735l(j);
            setColor(AbstractC12953l.startapp(j));
            this.mopub = null;
            this.billing = null;
            this.admob = null;
            setShader(null);
        }
    }

    public final void billing(C0387l c0387l) {
        if (c0387l == null || AbstractC8576l.yandex(this.amazon, c0387l)) {
            return;
        }
        this.amazon = c0387l;
        if (c0387l.equals(C0387l.amazon)) {
            clearShadowLayer();
            return;
        }
        C0387l c0387l2 = this.amazon;
        float f = c0387l2.crashlytics;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (c0387l2.loadAd >> 32)), Float.intBitsToFloat((int) (this.amazon.loadAd & 4294967295L)), AbstractC12953l.startapp(this.amazon.yandex));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    public final void crashlytics(AbstractC9544l abstractC9544l, long j, float f) {
        boolean z;
        if (abstractC9544l == null) {
            this.mopub = null;
            this.billing = null;
            this.admob = null;
            setShader(null);
            return;
        }
        if (abstractC9544l instanceof C8990l) {
            amazon(AbstractC2069l.amazon(f, ((C8990l) abstractC9544l).yandex));
            return;
        }
        if (!(abstractC9544l instanceof AbstractC17404l)) {
            C18725l.billing();
            return;
        }
        int i = 0;
        if (AbstractC8576l.yandex(this.billing, abstractC9544l)) {
            C14174l c14174l = this.admob;
            if (!(c14174l == null ? false : C14174l.loadAd(c14174l.yandex, j))) {
                if (j != 9205357640488583168L) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.billing = abstractC9544l;
                    this.admob = new C14174l(j);
                    this.mopub = AbstractC8020l.mopub(new C8771l(abstractC9544l, j, i));
                }
            }
        } else {
            if (j != 9205357640488583168L) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.billing = abstractC9544l;
                this.admob = new C14174l(j);
                this.mopub = AbstractC8020l.mopub(new C8771l(abstractC9544l, j, i));
            }
        }
        C4480l c4480lYandex = yandex();
        C8610l c8610l = this.mopub;
        c4480lYandex.isPro(c8610l != null ? (Shader) c8610l.getValue() : null);
        this.purchase = null;
        AbstractC11048l.crashlytics(this, f);
    }

    public final void loadAd(int i) {
        if (i == this.crashlytics) {
            return;
        }
        yandex().purchase(i);
        this.crashlytics = i;
    }

    public final void mopub(C9867l c9867l) {
        if (c9867l == null || AbstractC8576l.yandex(this.loadAd, c9867l)) {
            return;
        }
        this.loadAd = c9867l;
        int i = c9867l.yandex;
        setUnderlineText((i | 1) == i);
        int i2 = this.loadAd.yandex;
        setStrikeThruText((i2 | 2) == i2);
    }

    public final void purchase(AbstractC3239l abstractC3239l) {
        if (abstractC3239l == null || AbstractC8576l.yandex(this.subs, abstractC3239l)) {
            return;
        }
        this.subs = abstractC3239l;
        if (abstractC3239l.equals(C5053l.yandex)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(abstractC3239l instanceof C0404l)) {
            C18725l.billing();
            return;
        }
        yandex().vip(1);
        C0404l c0404l = (C0404l) abstractC3239l;
        yandex().remoteconfig(c0404l.yandex);
        C4480l c4480lYandex = yandex();
        c4480lYandex.yandex.setStrokeMiter(c0404l.loadAd);
        yandex().smaato(c0404l.amazon);
        yandex().firebase(c0404l.crashlytics);
        yandex().subs(c0404l.purchase);
    }

    public final C4480l yandex() {
        C4480l c4480l = this.yandex;
        if (c4480l != null) {
            return c4480l;
        }
        C4480l c4480l2 = new C4480l(this);
        this.yandex = c4480l2;
        return c4480l2;
    }
}
