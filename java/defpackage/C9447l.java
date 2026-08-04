package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/* JADX INFO: renamed from: lٍَؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9447l extends AbstractC8212l {
    public final C10017l adcel;
    public final boolean startapp;

    /* JADX WARN: Illegal instructions before constructor call */
    public C9447l(C9950l c9950l, AbstractC10437l abstractC10437l, C6719l c6719l) {
        int iInmobi = AbstractC5020l.inmobi(c6719l.billing);
        Paint.Cap cap = iInmobi != 0 ? iInmobi != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iInmobi2 = AbstractC5020l.inmobi(c6719l.mopub);
        super(c9950l, abstractC10437l, cap, iInmobi2 != 0 ? iInmobi2 != 1 ? iInmobi2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, c6719l.admob, c6719l.amazon, c6719l.purchase, c6719l.loadAd, c6719l.yandex);
        this.startapp = c6719l.subs;
        AbstractC4383l abstractC4383lMo1225l = c6719l.crashlytics.mo1225l();
        this.adcel = (C10017l) abstractC4383lMo1225l;
        abstractC4383lMo1225l.yandex(this);
        abstractC10437l.amazon(abstractC4383lMo1225l);
    }

    @Override // defpackage.AbstractC8212l, defpackage.InterfaceC15345l
    public final void billing(Canvas canvas, Matrix matrix, int i, C15480l c15480l) {
        if (this.startapp) {
            return;
        }
        C10017l c10017l = this.adcel;
        this.subs.setColor(c10017l.firebase(c10017l.crashlytics.crashlytics(), c10017l.loadAd()));
        super.billing(canvas, matrix, i, c15480l);
    }
}
