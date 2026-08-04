package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: lؘؑۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5365l implements InterfaceC15345l, InterfaceC11309l, InterfaceC13697l, InterfaceC15871l, InterfaceC3012l {
    public final C10780l admob;
    public final AbstractC10437l amazon;
    public final C10017l billing;
    public final C9950l crashlytics;
    public final C10017l mopub;
    public final boolean purchase;
    public C16649l subs;
    public final Matrix yandex = new Matrix();
    public final Path loadAd = new Path();

    public C5365l(C9950l c9950l, AbstractC10437l abstractC10437l, C14191l c14191l) {
        this.crashlytics = c9950l;
        this.amazon = abstractC10437l;
        this.purchase = c14191l.crashlytics;
        C10017l c10017lMo1225l = c14191l.loadAd.mo1225l();
        this.billing = c10017lMo1225l;
        abstractC10437l.amazon(c10017lMo1225l);
        c10017lMo1225l.yandex(this);
        C10017l c10017lMo1225l2 = ((C2982l) c14191l.amazon).mo1225l();
        this.mopub = c10017lMo1225l2;
        abstractC10437l.amazon(c10017lMo1225l2);
        c10017lMo1225l2.yandex(this);
        C1406l c1406l = (C1406l) c14191l.purchase;
        c1406l.getClass();
        C10780l c10780l = new C10780l(c1406l);
        this.admob = c10780l;
        c10780l.yandex(abstractC10437l);
        c10780l.loadAd(this);
    }

    @Override // defpackage.InterfaceC13697l
    public final void amazon(ListIterator listIterator) {
        if (this.subs != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((InterfaceC3012l) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.subs = new C16649l(this.crashlytics, this.amazon, this.purchase, arrayList, null);
    }

    @Override // defpackage.InterfaceC15345l
    public final void billing(Canvas canvas, Matrix matrix, int i, C15480l c15480l) {
        float fFloatValue = ((Float) this.billing.amazon()).floatValue();
        float fFloatValue2 = ((Float) this.mopub.amazon()).floatValue();
        C10780l c10780l = this.admob;
        float fFloatValue3 = ((Float) c10780l.license.amazon()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) c10780l.pro.amazon()).floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            Matrix matrix2 = this.yandex;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(c10780l.purchase(f + fFloatValue2));
            this.subs.billing(canvas, matrix2, (int) (AbstractC7484l.purchase(fFloatValue3, fFloatValue4, f / fFloatValue) * i), c15480l);
        }
    }

    @Override // defpackage.InterfaceC15345l
    public final void crashlytics(RectF rectF, Matrix matrix, boolean z) {
        this.subs.crashlytics(rectF, matrix, z);
    }

    @Override // defpackage.InterfaceC3012l
    public final void loadAd(List list, List list2) {
        this.subs.loadAd(list, list2);
    }

    @Override // defpackage.InterfaceC11309l
    public final Path purchase() {
        Path pathPurchase = this.subs.purchase();
        Path path = this.loadAd;
        path.reset();
        float fFloatValue = ((Float) this.billing.amazon()).floatValue();
        float fFloatValue2 = ((Float) this.mopub.amazon()).floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            Matrix matrixPurchase = this.admob.purchase(i + fFloatValue2);
            Matrix matrix = this.yandex;
            matrix.set(matrixPurchase);
            path.addPath(pathPurchase, matrix);
        }
        return path;
    }

    @Override // defpackage.InterfaceC15871l
    public final void yandex() {
        this.crashlytics.invalidateSelf();
    }
}
