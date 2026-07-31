package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٖٖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16649l implements InterfaceC15345l, InterfaceC11309l, InterfaceC15871l {
    public final ArrayList admob;
    public final Matrix amazon;
    public final RectF billing;
    public final C9326l crashlytics;
    public final C10780l firebase;
    public ArrayList isPro;
    public final RectF loadAd;
    public final boolean mopub;
    public final Path purchase;
    public final C9950l subs;
    public final C14785l yandex;

    public C16649l(C9950l c9950l, AbstractC10437l abstractC10437l, boolean z, ArrayList arrayList, C1406l c1406l) {
        this.yandex = new C14785l((byte) 0, 16);
        this.loadAd = new RectF();
        this.crashlytics = new C9326l();
        this.amazon = new Matrix();
        this.purchase = new Path();
        this.billing = new RectF();
        this.subs = c9950l;
        this.mopub = z;
        this.admob = arrayList;
        if (c1406l != null) {
            C10780l c10780l = new C10780l(c1406l);
            this.firebase = c10780l;
            c10780l.yandex(abstractC10437l);
            c10780l.loadAd(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            InterfaceC3012l interfaceC3012l = (InterfaceC3012l) arrayList.get(size);
            if (interfaceC3012l instanceof InterfaceC13697l) {
                arrayList2.add((InterfaceC13697l) interfaceC3012l);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((InterfaceC13697l) arrayList2.get(size2)).amazon(arrayList.listIterator(arrayList.size()));
        }
    }

    public final List amazon() {
        if (this.isPro == null) {
            this.isPro = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.admob;
                if (i >= arrayList.size()) {
                    break;
                }
                InterfaceC3012l interfaceC3012l = (InterfaceC3012l) arrayList.get(i);
                if (interfaceC3012l instanceof InterfaceC11309l) {
                    this.isPro.add((InterfaceC11309l) interfaceC3012l);
                }
                i++;
            }
        }
        return this.isPro;
    }

    @Override // defpackage.InterfaceC15345l
    public final void billing(Canvas canvas, Matrix matrix, int i, C15480l c15480l) {
        boolean z;
        if (this.mopub) {
            return;
        }
        Matrix matrix2 = this.amazon;
        matrix2.set(matrix);
        C10780l c10780l = this.firebase;
        if (c10780l != null) {
            matrix2.preConcat(c10780l.amazon());
            C10017l c10017l = c10780l.startapp;
            i = (int) (((((c10017l == null ? 100 : ((Integer) c10017l.amazon()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        C9950l c9950l = this.subs;
        c9950l.getClass();
        boolean z2 = false;
        ArrayList arrayList = this.admob;
        if (c15480l != null && c9950l.f20299l) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    z = false;
                    break;
                } else {
                    if ((arrayList.get(i2) instanceof InterfaceC15345l) && (i3 = i3 + 1) >= 2) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            if (z) {
                z2 = true;
            }
        }
        int i4 = z2 ? 255 : i;
        C9326l c9326l = this.crashlytics;
        if (z2) {
            RectF rectF = this.loadAd;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            crashlytics(rectF, matrix, true);
            C14785l c14785l = this.yandex;
            c14785l.f28908l = i;
            if (c15480l != null) {
                if (Color.alpha(c15480l.amazon) > 0) {
                    c14785l.f28907l = c15480l;
                } else {
                    c14785l.f28907l = null;
                }
                c15480l = null;
            } else {
                c14785l.f28907l = null;
            }
            canvas = c9326l.purchase(canvas, rectF, c14785l);
        } else if (c15480l != null) {
            C15480l c15480l2 = new C15480l(c15480l);
            c15480l2.loadAd(i4);
            c15480l = c15480l2;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof InterfaceC15345l) {
                ((InterfaceC15345l) obj).billing(canvas, matrix2, i4, c15480l);
            }
        }
        if (z2) {
            c9326l.crashlytics();
        }
    }

    @Override // defpackage.InterfaceC15345l
    public final void crashlytics(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.amazon;
        matrix2.set(matrix);
        C10780l c10780l = this.firebase;
        if (c10780l != null) {
            matrix2.preConcat(c10780l.amazon());
        }
        RectF rectF2 = this.billing;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.admob;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            InterfaceC3012l interfaceC3012l = (InterfaceC3012l) arrayList.get(size);
            if (interfaceC3012l instanceof InterfaceC15345l) {
                ((InterfaceC15345l) interfaceC3012l).crashlytics(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    @Override // defpackage.InterfaceC3012l
    public final void loadAd(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.admob;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            InterfaceC3012l interfaceC3012l = (InterfaceC3012l) arrayList.get(size2);
            interfaceC3012l.loadAd(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(interfaceC3012l);
        }
    }

    @Override // defpackage.InterfaceC11309l
    public final Path purchase() {
        Matrix matrix = this.amazon;
        matrix.reset();
        C10780l c10780l = this.firebase;
        if (c10780l != null) {
            matrix.set(c10780l.amazon());
        }
        Path path = this.purchase;
        path.reset();
        if (!this.mopub) {
            ArrayList arrayList = this.admob;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                InterfaceC3012l interfaceC3012l = (InterfaceC3012l) arrayList.get(size);
                if (interfaceC3012l instanceof InterfaceC11309l) {
                    path.addPath(((InterfaceC11309l) interfaceC3012l).purchase(), matrix);
                }
            }
        }
        return path;
    }

    @Override // defpackage.InterfaceC15871l
    public final void yandex() {
        this.subs.invalidateSelf();
    }

    public C16649l(C9950l c9950l, AbstractC10437l abstractC10437l, C1075l c1075l, C10712l c10712l) {
        C1406l c1406l;
        String str = c1075l.yandex;
        boolean z = c1075l.crashlytics;
        List list = c1075l.loadAd;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            InterfaceC3012l interfaceC3012lYandex = ((InterfaceC9750l) list.get(i2)).yandex(c9950l, c10712l, abstractC10437l);
            if (interfaceC3012lYandex != null) {
                arrayList.add(interfaceC3012lYandex);
            }
        }
        while (true) {
            if (i >= list.size()) {
                c1406l = null;
                break;
            }
            InterfaceC9750l interfaceC9750l = (InterfaceC9750l) list.get(i);
            if (interfaceC9750l instanceof C1406l) {
                c1406l = (C1406l) interfaceC9750l;
                break;
            }
            i++;
        }
        this(c9950l, abstractC10437l, z, arrayList, c1406l);
    }
}
