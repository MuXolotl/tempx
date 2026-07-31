package defpackage;

import android.graphics.Color;
import android.graphics.Matrix;

/* JADX INFO: renamed from: lٟٖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18103l implements InterfaceC15871l {
    public Matrix admob;
    public final C10017l amazon;
    public final C10017l billing;
    public final C10017l crashlytics;
    public final AbstractC10437l loadAd;
    public final C10017l mopub;
    public final C10017l purchase;
    public final AbstractC10437l yandex;

    public C18103l(AbstractC10437l abstractC10437l, AbstractC10437l abstractC10437l2, C11644l c11644l) {
        this.loadAd = abstractC10437l;
        this.yandex = abstractC10437l2;
        AbstractC4383l abstractC4383lMo1225l = ((C2536l) c11644l.f23358l).mo1225l();
        this.crashlytics = (C10017l) abstractC4383lMo1225l;
        abstractC4383lMo1225l.yandex(this);
        abstractC10437l2.amazon(abstractC4383lMo1225l);
        C10017l c10017lMo1225l = ((C2982l) c11644l.f23357l).mo1225l();
        this.amazon = c10017lMo1225l;
        c10017lMo1225l.yandex(this);
        abstractC10437l2.amazon(c10017lMo1225l);
        C10017l c10017lMo1225l2 = ((C2982l) c11644l.f23361l).mo1225l();
        this.purchase = c10017lMo1225l2;
        c10017lMo1225l2.yandex(this);
        abstractC10437l2.amazon(c10017lMo1225l2);
        C10017l c10017lMo1225l3 = ((C2982l) c11644l.f23360l).mo1225l();
        this.billing = c10017lMo1225l3;
        c10017lMo1225l3.yandex(this);
        abstractC10437l2.amazon(c10017lMo1225l3);
        C10017l c10017lMo1225l4 = ((C2982l) c11644l.f23362l).mo1225l();
        this.mopub = c10017lMo1225l4;
        c10017lMo1225l4.yandex(this);
        abstractC10437l2.amazon(c10017lMo1225l4);
    }

    public final C15480l loadAd(Matrix matrix, int i) {
        float fSubs = this.purchase.subs() * 0.017453292f;
        float fFloatValue = ((Float) this.billing.amazon()).floatValue();
        double d = fSubs;
        float fSin = ((float) Math.sin(d)) * fFloatValue;
        float fCos = ((float) Math.cos(d + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = ((Float) this.mopub.amazon()).floatValue();
        int iIntValue = ((Integer) this.crashlytics.amazon()).intValue();
        int iArgb = Color.argb(Math.round((((Float) this.amazon.amazon()).floatValue() * i) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        C15480l c15480l = new C15480l();
        c15480l.yandex = fFloatValue2 * 0.33f;
        c15480l.loadAd = fSin;
        c15480l.crashlytics = fCos;
        c15480l.amazon = iArgb;
        c15480l.purchase = null;
        c15480l.crashlytics(matrix);
        if (this.admob == null) {
            this.admob = new Matrix();
        }
        this.yandex.pro.amazon().invert(this.admob);
        c15480l.crashlytics(this.admob);
        return c15480l;
    }

    @Override // defpackage.InterfaceC15871l
    public final void yandex() {
        this.loadAd.yandex();
    }
}
