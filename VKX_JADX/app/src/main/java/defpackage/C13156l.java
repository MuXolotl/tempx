package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؘْؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13156l extends AbstractC10437l {
    public final ArrayList applovin;
    public final RectF appmetrica;
    public final RectF inmobi;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final C18103l f25762native;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final C9326l f25763package;
    public final C10017l premium;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public float f25764strictfp;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final C14785l f25765synchronized;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final RectF f25766throws;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public boolean f25767volatile;

    public C13156l(C9950l c9950l, C4913l c4913l, List list, C10712l c10712l) {
        AbstractC10437l abstractC10437l;
        AbstractC10437l c13156l;
        String str;
        super(c9950l, c4913l);
        this.applovin = new ArrayList();
        this.appmetrica = new RectF();
        this.inmobi = new RectF();
        this.f25766throws = new RectF();
        this.f25763package = new C9326l();
        this.f25765synchronized = new C14785l((byte) 0, 16);
        this.f25767volatile = true;
        C2982l c2982l = c4913l.subscription;
        if (c2982l != null) {
            C10017l c10017lMo1225l = c2982l.mo1225l();
            this.premium = c10017lMo1225l;
            amazon(c10017lMo1225l);
            c10017lMo1225l.yandex(this);
        } else {
            this.premium = null;
        }
        C3994l c3994l = new C3994l(c10712l.isPro.size());
        AbstractC10437l abstractC10437l2 = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            C4913l c4913l2 = (C4913l) list.get(size);
            int iInmobi = AbstractC5020l.inmobi(c4913l2.purchase);
            if (iInmobi == 0) {
                c13156l = new C13156l(c9950l, c4913l2, (List) c10712l.crashlytics.get(c4913l2.mopub), c10712l);
            } else if (iInmobi == 1) {
                c13156l = new C17609l(c9950l, c4913l2);
            } else if (iInmobi == 2) {
                c13156l = new C6289l(c9950l, c4913l2);
            } else if (iInmobi == 3) {
                c13156l = new C15981l(c9950l, c4913l2);
            } else if (iInmobi == 4) {
                c13156l = new C1647l(c9950l, c4913l2, this, c10712l);
            } else if (iInmobi != 5) {
                switch (c4913l2.purchase) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case 4:
                        str = "NULL";
                        break;
                    case 5:
                        str = "SHAPE";
                        break;
                    case 6:
                        str = "TEXT";
                        break;
                    case 7:
                        str = "UNKNOWN";
                        break;
                    default:
                        str = "null";
                        break;
                }
                AbstractC17968l.loadAd("Unknown layer type ".concat(str));
                c13156l = null;
            } else {
                c13156l = new C2624l(c9950l, c4913l2);
            }
            if (c13156l != null) {
                c3994l.subs(c13156l.startapp.amazon, c13156l);
                if (abstractC10437l2 != null) {
                    abstractC10437l2.subscription = c13156l;
                    abstractC10437l2 = null;
                } else {
                    this.applovin.add(0, c13156l);
                    int iInmobi2 = AbstractC5020l.inmobi(c4913l2.Signature);
                    if (iInmobi2 == 1 || iInmobi2 == 2) {
                        abstractC10437l2 = c13156l;
                    }
                }
            }
        }
        for (int i = 0; i < c3994l.firebase(); i++) {
            AbstractC10437l abstractC10437l3 = (AbstractC10437l) c3994l.amazon(c3994l.admob(i));
            if (abstractC10437l3 != null && (abstractC10437l = (AbstractC10437l) c3994l.amazon(abstractC10437l3.startapp.billing)) != null) {
                abstractC10437l3.tapsense = abstractC10437l;
            }
        }
        C11644l c11644l = this.startapp.ad;
        if (c11644l != null) {
            this.f25762native = new C18103l(this, this, c11644l);
        }
    }

    @Override // defpackage.AbstractC10437l, defpackage.InterfaceC15345l
    public final void crashlytics(RectF rectF, Matrix matrix, boolean z) {
        super.crashlytics(rectF, matrix, z);
        ArrayList arrayList = this.applovin;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.appmetrica;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((AbstractC10437l) arrayList.get(size)).crashlytics(rectF2, this.vip, true);
            rectF.union(rectF2);
        }
    }

    @Override // defpackage.AbstractC10437l
    public final void remoteconfig(float f) {
        this.f25764strictfp = f;
        super.remoteconfig(f);
        C4913l c4913l = this.startapp;
        C10017l c10017l = this.premium;
        if (c10017l != null) {
            C10712l c10712l = this.metrica.f20287l;
            f = ((((Float) c10017l.amazon()).floatValue() * c4913l.loadAd.vip) - c4913l.loadAd.smaato) / ((c10712l.remoteconfig - c10712l.smaato) + 0.01f);
        }
        if (c10017l == null) {
            float f2 = c4913l.vip;
            C10712l c10712l2 = c4913l.loadAd;
            f -= f2 / (c10712l2.remoteconfig - c10712l2.smaato);
        }
        if (c4913l.remoteconfig != 0.0f && !"__container".equals(c4913l.crashlytics)) {
            f /= c4913l.remoteconfig;
        }
        ArrayList arrayList = this.applovin;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC10437l) arrayList.get(size)).remoteconfig(f);
        }
    }

    @Override // defpackage.AbstractC10437l
    public final void subs(Canvas canvas, Matrix matrix, int i, C15480l c15480l) {
        Canvas canvasPurchase;
        boolean z = false;
        C18103l c18103l = this.f25762native;
        boolean z2 = (c15480l == null && c18103l == null) ? false : true;
        C9950l c9950l = this.metrica;
        c9950l.getClass();
        if (z2 && c9950l.f20299l) {
            z = true;
        }
        int i2 = z ? 255 : i;
        if (c18103l != null) {
            c15480l = c18103l.loadAd(matrix, i2);
        }
        boolean z3 = this.f25767volatile;
        C4913l c4913l = this.startapp;
        ArrayList<AbstractC10437l> arrayList = this.applovin;
        RectF rectF = this.inmobi;
        if (z3 || !"__container".equals(c4913l.crashlytics)) {
            rectF.set(0.0f, 0.0f, c4913l.metrica, c4913l.startapp);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            for (AbstractC10437l abstractC10437l : arrayList) {
                RectF rectF2 = this.f25766throws;
                abstractC10437l.crashlytics(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        C9326l c9326l = this.f25763package;
        if (z) {
            C14785l c14785l = this.f25765synchronized;
            c14785l.f28907l = null;
            c14785l.f28908l = i;
            if (c15480l != null) {
                if (Color.alpha(c15480l.amazon) > 0) {
                    c14785l.f28907l = c15480l;
                } else {
                    c14785l.f28907l = null;
                }
                c15480l = null;
            }
            canvasPurchase = c9326l.purchase(canvas, rectF, c14785l);
        } else {
            canvasPurchase = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC10437l) arrayList.get(size)).billing(canvasPurchase, matrix, i2, c15480l);
            }
        }
        if (z) {
            c9326l.crashlytics();
        }
        canvas.restore();
    }
}
