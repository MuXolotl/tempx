package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: renamed from: lؓ۟۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2151l implements InterfaceC14859l {
    public Rect crashlytics;
    public Rect loadAd;
    public Canvas yandex = AbstractC10071l.yandex;

    @Override // defpackage.InterfaceC14859l
    public final void Signature(C8896l c8896l, C4480l c4480l) {
        this.yandex.saveLayer(c8896l.yandex, c8896l.loadAd, c8896l.crashlytics, c8896l.amazon, AbstractC4311l.admob(c4480l), 31);
    }

    @Override // defpackage.InterfaceC14859l
    public final void adcel(C14115l c14115l, long j, C4480l c4480l) {
        this.yandex.drawBitmap(AbstractC5941l.loadAd(c14115l), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), AbstractC4311l.admob(c4480l));
    }

    @Override // defpackage.InterfaceC14859l
    public final void admob(long j, long j2, C4480l c4480l) {
        this.yandex.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), AbstractC4311l.admob(c4480l));
    }

    @Override // defpackage.InterfaceC14859l
    public final void ads() {
        this.yandex.restore();
    }

    @Override // defpackage.InterfaceC14859l
    public final void amazon(C14115l c14115l, long j, long j2, long j3, C4480l c4480l) {
        if (this.loadAd == null) {
            this.loadAd = new Rect();
            this.crashlytics = new Rect();
        }
        Canvas canvas = this.yandex;
        Bitmap bitmapLoadAd = AbstractC5941l.loadAd(c14115l);
        Rect rect = this.loadAd;
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Unit unit = Unit.INSTANCE;
        Rect rect2 = this.crashlytics;
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmapLoadAd, rect, rect2, AbstractC4311l.admob(c4480l));
    }

    @Override // defpackage.InterfaceC14859l
    public final void billing(float f, float f2, float f3, float f4, float f5, float f6, C4480l c4480l) {
        this.yandex.drawRoundRect(f, f2, f3, f4, f5, f6, AbstractC4311l.admob(c4480l));
    }

    @Override // defpackage.InterfaceC14859l
    public final void crashlytics(float f, long j, C4480l c4480l) {
        this.yandex.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, AbstractC4311l.admob(c4480l));
    }

    @Override // defpackage.InterfaceC14859l
    public final void firebase(float f, float f2, float f3, float f4, C4480l c4480l) {
        this.yandex.drawRect(f, f2, f3, f4, AbstractC4311l.admob(c4480l));
    }

    @Override // defpackage.InterfaceC14859l
    public final void isPro() {
        AbstractC0714l.yandex(this.yandex, false);
    }

    @Override // defpackage.InterfaceC14859l
    public final void license() {
        AbstractC0714l.yandex(this.yandex, true);
    }

    @Override // defpackage.InterfaceC14859l
    public final void loadAd(float f) {
        this.yandex.rotate(f);
    }

    @Override // defpackage.InterfaceC14859l
    public final void metrica(float f, float f2, float f3, float f4, int i) {
        this.yandex.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.InterfaceC14859l
    public final void mopub() {
        this.yandex.save();
    }

    @Override // defpackage.InterfaceC14859l
    public final void pro(float f, float f2, float f3, float f4, float f5, float f6, C4480l c4480l) {
        this.yandex.drawArc(f, f2, f3, f4, f5, f6, false, AbstractC4311l.admob(c4480l));
    }

    @Override // defpackage.InterfaceC14859l
    public final void purchase(C9902l c9902l, C4480l c4480l) {
        Canvas canvas = this.yandex;
        if (c9902l instanceof C9902l) {
            canvas.drawPath(c9902l.yandex, AbstractC4311l.admob(c4480l));
        } else {
            C10754l.ads("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.InterfaceC14859l
    public final void remoteconfig(C9902l c9902l) {
        Canvas canvas = this.yandex;
        if (c9902l instanceof C9902l) {
            canvas.clipPath(c9902l.yandex, Region.Op.INTERSECT);
        } else {
            C10754l.ads("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.InterfaceC14859l
    public final void smaato(float[] fArr) {
        if (AbstractC2533l.crashlytics(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        AbstractC4952l.isVip(matrix, fArr);
        this.yandex.concat(matrix);
    }

    @Override // defpackage.InterfaceC14859l
    public final void startapp(float f, float f2) {
        this.yandex.translate(f, f2);
    }

    @Override // defpackage.InterfaceC14859l
    public final void subs(C8896l c8896l, C4480l c4480l) {
        firebase(c8896l.yandex, c8896l.loadAd, c8896l.crashlytics, c8896l.amazon, c4480l);
    }

    @Override // defpackage.InterfaceC14859l
    public final void subscription(ArrayList arrayList, C4480l c4480l) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            long j = ((C1187l) arrayList.get(i)).yandex;
            this.yandex.drawPoint(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), AbstractC4311l.admob(c4480l));
        }
    }

    @Override // defpackage.InterfaceC14859l
    public final void tapsense(C8896l c8896l) {
        metrica(c8896l.yandex, c8896l.loadAd, c8896l.crashlytics, c8896l.amazon, 1);
    }

    @Override // defpackage.InterfaceC14859l
    public final void vip(C1381l c1381l, C4480l c4480l) {
        Canvas canvas = this.yandex;
        Canvas.VertexMode vertexMode = Canvas.VertexMode.TRIANGLES;
        float[] fArr = (float[]) c1381l.f3513l;
        int length = fArr.length;
        float[] fArr2 = (float[]) c1381l.f3512l;
        int[] iArr = (int[]) c1381l.f3511l;
        short[] sArr = (short[]) c1381l.f3514l;
        canvas.drawVertices(vertexMode, length, fArr, 0, fArr2, 0, iArr, 0, sArr, 0, sArr.length, AbstractC4311l.admob(c4480l));
    }

    @Override // defpackage.InterfaceC14859l
    public final void yandex(float f, float f2) {
        this.yandex.scale(f, f2);
    }
}
