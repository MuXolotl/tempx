package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lَٝٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10437l implements InterfaceC15345l, InterfaceC15871l {
    public List Signature;
    public boolean ad;
    public final C10111l adcel;
    public final C13957l admob;
    public final C10017l ads;
    public float advert;
    public final C13957l billing;
    public final RectF firebase;
    public final RectF isPro;
    public BlurMaskFilter isVip;
    public final ArrayList license;
    public final C9950l metrica;
    public final C13957l mopub;
    public final C10780l pro;
    public final C13957l purchase;
    public final RectF remoteconfig;
    public C13957l signatures;
    public final RectF smaato;
    public final C4913l startapp;
    public final RectF subs;
    public AbstractC10437l subscription;
    public AbstractC10437l tapsense;
    public final Matrix vip;
    public final Path yandex = new Path();
    public final Matrix loadAd = new Matrix();
    public final Matrix crashlytics = new Matrix();
    public final C13957l amazon = new C13957l(1, 0);

    public AbstractC10437l(C9950l c9950l, C4913l c4913l) {
        boolean z = true;
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.purchase = new C13957l(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.billing = new C13957l(mode2);
        C13957l c13957l = new C13957l(1, 0);
        this.mopub = c13957l;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        C13957l c13957l2 = new C13957l();
        c13957l2.setXfermode(new PorterDuffXfermode(mode3));
        this.admob = c13957l2;
        this.subs = new RectF();
        this.isPro = new RectF();
        this.firebase = new RectF();
        this.smaato = new RectF();
        this.remoteconfig = new RectF();
        this.vip = new Matrix();
        this.license = new ArrayList();
        this.ad = true;
        this.advert = 0.0f;
        this.metrica = c9950l;
        this.startapp = c4913l;
        List list = c4913l.admob;
        int i = 3;
        if (c4913l.Signature == 3) {
            c13957l.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            c13957l.setXfermode(new PorterDuffXfermode(mode));
        }
        C1406l c1406l = c4913l.subs;
        c1406l.getClass();
        C10780l c10780l = new C10780l(c1406l);
        this.pro = c10780l;
        c10780l.loadAd(this);
        if (list != null && !list.isEmpty()) {
            C10111l c10111l = new C10111l(list);
            this.adcel = c10111l;
            Iterator it = ((ArrayList) c10111l.f20587l).iterator();
            while (it.hasNext()) {
                ((AbstractC4383l) it.next()).yandex(this);
            }
            for (AbstractC4383l abstractC4383l : (ArrayList) this.adcel.f20586l) {
                amazon(abstractC4383l);
                abstractC4383l.yandex(this);
            }
        }
        C4913l c4913l2 = this.startapp;
        if (c4913l2.tapsense.isEmpty()) {
            if (true != this.ad) {
                this.ad = true;
                this.metrica.invalidateSelf();
                return;
            }
            return;
        }
        C10017l c10017l = new C10017l(z ? 1 : 0, c4913l2.tapsense);
        this.ads = c10017l;
        c10017l.loadAd = true;
        c10017l.yandex(new C9161l(i, this));
        boolean z2 = ((Float) this.ads.amazon()).floatValue() == 1.0f;
        if (z2 != this.ad) {
            this.ad = z2;
            this.metrica.invalidateSelf();
        }
        amazon(this.ads);
    }

    public final void admob(Canvas canvas) {
        RectF rectF = this.subs;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.admob);
    }

    public final void amazon(AbstractC4383l abstractC4383l) {
        if (abstractC4383l == null) {
            return;
        }
        this.license.add(abstractC4383l);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0216  */
    /* JADX WARN: Code duplicated, block: B:105:0x0221  */
    /* JADX WARN: Code duplicated, block: B:109:0x0233  */
    /* JADX WARN: Code duplicated, block: B:111:0x025a  */
    /* JADX WARN: Code duplicated, block: B:113:0x025f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0262  */
    /* JADX WARN: Code duplicated, block: B:117:0x0265  */
    /* JADX WARN: Code duplicated, block: B:118:0x026c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0272  */
    /* JADX WARN: Code duplicated, block: B:121:0x0274  */
    /* JADX WARN: Code duplicated, block: B:124:0x027b  */
    /* JADX WARN: Code duplicated, block: B:128:0x028c A[LOOP:2: B:122:0x0275->B:128:0x028c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:130:0x0299  */
    /* JADX WARN: Code duplicated, block: B:132:0x029d  */
    /* JADX WARN: Code duplicated, block: B:134:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:135:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:137:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:138:0x030b  */
    /* JADX WARN: Code duplicated, block: B:140:0x030f  */
    /* JADX WARN: Code duplicated, block: B:141:0x033b  */
    /* JADX WARN: Code duplicated, block: B:142:0x034b  */
    /* JADX WARN: Code duplicated, block: B:144:0x0352  */
    /* JADX WARN: Code duplicated, block: B:145:0x037e  */
    /* JADX WARN: Code duplicated, block: B:150:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:155:0x03a4 A[EDGE_INSN: B:155:0x03a4->B:147:0x03a4 BREAK  A[LOOP:1: B:107:0x0225->B:146:0x039e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0286 A[EDGE_INSN: B:163:0x0286->B:126:0x0286 BREAK  A[LOOP:2: B:122:0x0275->B:128:0x028c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0112  */
    /* JADX WARN: Code duplicated, block: B:57:0x0116  */
    @Override // defpackage.InterfaceC15345l
    public final void billing(Canvas canvas, Matrix matrix, int i, C15480l c15480l) {
        C10111l c10111l;
        Path path;
        float f;
        int i2;
        RectF rectF;
        float f2;
        int i3;
        Paint paint;
        int i4;
        List list;
        ArrayList arrayList;
        AbstractC4383l abstractC4383l;
        AbstractC4383l abstractC4383l2;
        boolean z;
        int iInmobi;
        int i5;
        Paint paint2;
        Path path2;
        Path path3;
        int i6;
        Integer num;
        if (this.ad) {
            C4913l c4913l = this.startapp;
            boolean z2 = c4913l.license;
            int i7 = c4913l.advert;
            if (z2) {
                return;
            }
            mopub();
            Matrix matrix2 = this.loadAd;
            matrix2.reset();
            matrix2.set(matrix);
            for (int size = this.Signature.size() - 1; size >= 0; size--) {
                matrix2.preConcat(((AbstractC10437l) this.Signature.get(size)).pro.amazon());
            }
            C10780l c10780l = this.pro;
            C10017l c10017l = c10780l.startapp;
            int iIntValue = (int) ((((i / 255.0f) * ((c10017l == null || (num = (Integer) c10017l.amazon()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
            if (this.subscription == null && !firebase() && i7 == 1) {
                matrix2.preConcat(c10780l.amazon());
                subs(canvas, matrix2, iIntValue, c15480l);
                smaato();
                return;
            }
            RectF rectF2 = this.subs;
            crashlytics(rectF2, matrix2, false);
            if (this.subscription != null && c4913l.Signature != 3) {
                RectF rectF3 = this.smaato;
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.subscription.crashlytics(rectF3, matrix, true);
                if (!rectF2.intersect(rectF3)) {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            matrix2.preConcat(c10780l.amazon());
            RectF rectF4 = this.firebase;
            rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
            boolean zFirebase = firebase();
            C10111l c10111l2 = this.adcel;
            Path path4 = this.yandex;
            if (zFirebase) {
                int size2 = ((List) c10111l2.f20589l).size();
                int i8 = 0;
                while (true) {
                    if (i8 < size2) {
                        C15938l c15938l = (C15938l) ((List) c10111l2.f20589l).get(i8);
                        Path path5 = (Path) ((AbstractC4383l) ((ArrayList) c10111l2.f20587l).get(i8)).amazon();
                        if (path5 == null) {
                            i2 = size2;
                        } else {
                            path4.set(path5);
                            path4.transform(matrix2);
                            int iInmobi2 = AbstractC5020l.inmobi(c15938l.yandex);
                            i2 = size2;
                            if (iInmobi2 != 0) {
                                if (iInmobi2 != 1) {
                                    if (iInmobi2 != 2) {
                                        if (iInmobi2 == 3) {
                                        }
                                        rectF = this.remoteconfig;
                                        path4.computeBounds(rectF, false);
                                        if (i8 == 0) {
                                            rectF4.set(rectF);
                                        } else {
                                            rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                                        }
                                        i8++;
                                        size2 = i2;
                                        c10111l2 = c10111l2;
                                        path4 = path4;
                                    }
                                }
                                c10111l = c10111l2;
                                path = path4;
                                f = 0.0f;
                            }
                            if (c15938l.amazon) {
                                c10111l = c10111l2;
                                path = path4;
                                f = 0.0f;
                            }
                            rectF = this.remoteconfig;
                            path4.computeBounds(rectF, false);
                            if (i8 == 0) {
                                rectF4.set(rectF);
                            } else {
                                rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                            }
                            i8++;
                            size2 = i2;
                            c10111l2 = c10111l2;
                            path4 = path4;
                        }
                        i8++;
                        size2 = i2;
                        c10111l2 = c10111l2;
                        path4 = path4;
                    } else {
                        c10111l = c10111l2;
                        path = path4;
                        if (rectF2.intersect(rectF4)) {
                            f = 0.0f;
                        } else {
                            f = 0.0f;
                            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                    }
                }
            } else {
                c10111l = c10111l2;
                path = path4;
                f = 0.0f;
            }
            float width = canvas.getWidth();
            float height = canvas.getHeight();
            RectF rectF5 = this.isPro;
            rectF5.set(f, f, width, height);
            Matrix matrix3 = this.crashlytics;
            canvas.getMatrix(matrix3);
            if (!matrix3.isIdentity()) {
                matrix3.invert(matrix3);
                matrix3.mapRect(rectF5);
            }
            if (!rectF2.intersect(rectF5)) {
                rectF2.set(f, f, f, f);
            }
            if (rectF2.width() >= 1.0f && rectF2.height() >= 1.0f) {
                C13957l c13957l = this.amazon;
                c13957l.setAlpha(255);
                int iInmobi3 = AbstractC5020l.inmobi(i7);
                if (iInmobi3 == 1) {
                    f2 = 1.0f;
                    i3 = Build.VERSION.SDK_INT >= 29 ? 25 : 14;
                } else if (iInmobi3 != 2) {
                    i3 = 16;
                    f2 = 1.0f;
                    if (iInmobi3 != 3) {
                        if (iInmobi3 == 4) {
                            i3 = 17;
                        } else if (iInmobi3 != 5) {
                            i3 = iInmobi3 != 16 ? 0 : 13;
                        } else {
                            i3 = 18;
                        }
                    }
                } else {
                    f2 = 1.0f;
                    i3 = 15;
                }
                AbstractC6604l.crashlytics(i3, c13957l);
                Matrix matrix4 = AbstractC4218l.yandex;
                canvas.saveLayer(rectF2, c13957l);
                if (i7 != 2) {
                    admob(canvas);
                } else {
                    if (Build.VERSION.SDK_INT < 29) {
                        if (this.signatures == null) {
                            C13957l c13957l2 = new C13957l();
                            this.signatures = c13957l2;
                            c13957l2.setColor(-1);
                        }
                        canvas.drawRect(rectF2.left - f2, rectF2.top - f2, rectF2.right + f2, rectF2.bottom + f2, this.signatures);
                    }
                    subs(canvas, matrix2, iIntValue, c15480l);
                    if (firebase()) {
                        paint = this.purchase;
                        canvas.saveLayer(rectF2, paint);
                        if (Build.VERSION.SDK_INT < 28) {
                            admob(canvas);
                        }
                        i4 = 0;
                        while (true) {
                            list = (List) c10111l.f20589l;
                            arrayList = (ArrayList) c10111l.f20587l;
                            if (i4 < list.size()) {
                                break;
                            }
                            C15938l c15938l2 = (C15938l) list.get(i4);
                            abstractC4383l = (AbstractC4383l) arrayList.get(i4);
                            abstractC4383l2 = (AbstractC4383l) ((ArrayList) c10111l.f20586l).get(i4);
                            int i9 = c15938l2.yandex;
                            z = c15938l2.amazon;
                            iInmobi = AbstractC5020l.inmobi(i9);
                            i5 = i4;
                            paint2 = this.billing;
                            if (iInmobi != 0) {
                                path2 = path;
                                if (z) {
                                    Matrix matrix5 = AbstractC4218l.yandex;
                                    canvas.saveLayer(rectF2, c13957l);
                                    canvas.drawRect(rectF2, c13957l);
                                    path2.set((Path) abstractC4383l.amazon());
                                    path2.transform(matrix2);
                                    c13957l.setAlpha((int) (((Integer) abstractC4383l2.amazon()).intValue() * 2.55f));
                                    canvas.drawPath(path2, paint2);
                                    canvas.restore();
                                } else {
                                    path2.set((Path) abstractC4383l.amazon());
                                    path2.transform(matrix2);
                                    c13957l.setAlpha((int) (((Integer) abstractC4383l2.amazon()).intValue() * 2.55f));
                                    canvas.drawPath(path2, c13957l);
                                }
                            } else if (iInmobi != 1) {
                                path2 = path;
                                if (i5 == 0) {
                                    c13957l.setColor(-16777216);
                                    c13957l.setAlpha(255);
                                    canvas.drawRect(rectF2, c13957l);
                                }
                                if (z) {
                                    Matrix matrix6 = AbstractC4218l.yandex;
                                    canvas.saveLayer(rectF2, paint2);
                                    canvas.drawRect(rectF2, c13957l);
                                    paint2.setAlpha((int) (((Integer) abstractC4383l2.amazon()).intValue() * 2.55f));
                                    path2.set((Path) abstractC4383l.amazon());
                                    path2.transform(matrix2);
                                    canvas.drawPath(path2, paint2);
                                    canvas.restore();
                                } else {
                                    path2.set((Path) abstractC4383l.amazon());
                                    path2.transform(matrix2);
                                    canvas.drawPath(path2, paint2);
                                }
                            } else if (iInmobi != 2) {
                                if (z) {
                                    Matrix matrix7 = AbstractC4218l.yandex;
                                    canvas.saveLayer(rectF2, paint);
                                    canvas.drawRect(rectF2, c13957l);
                                    paint2.setAlpha((int) (((Integer) abstractC4383l2.amazon()).intValue() * 2.55f));
                                    path3 = path;
                                    path3.set((Path) abstractC4383l.amazon());
                                    path3.transform(matrix2);
                                    canvas.drawPath(path3, paint2);
                                    canvas.restore();
                                } else {
                                    path3 = path;
                                    Matrix matrix8 = AbstractC4218l.yandex;
                                    canvas.saveLayer(rectF2, paint);
                                    path3.set((Path) abstractC4383l.amazon());
                                    path3.transform(matrix2);
                                    c13957l.setAlpha((int) (((Integer) abstractC4383l2.amazon()).intValue() * 2.55f));
                                    canvas.drawPath(path3, c13957l);
                                    canvas.restore();
                                }
                                path2 = path3;
                            } else if (iInmobi != 3) {
                                path2 = path;
                            } else {
                                if (arrayList.isEmpty()) {
                                    i6 = 0;
                                    while (true) {
                                        if (i6 < list.size()) {
                                            c13957l.setAlpha(255);
                                            canvas.drawRect(rectF2, c13957l);
                                            break;
                                        } else if (((C15938l) list.get(i6)).yandex != 4) {
                                            break;
                                        } else {
                                            i6++;
                                        }
                                    }
                                }
                                path2 = path;
                            }
                            i4 = i5 + 1;
                            path = path2;
                        }
                        canvas.restore();
                    }
                    if (this.subscription != null) {
                        canvas.saveLayer(rectF2, this.mopub);
                        admob(canvas);
                        this.subscription.billing(canvas, matrix, i, null);
                        canvas.restore();
                    }
                    canvas.restore();
                }
                subs(canvas, matrix2, iIntValue, c15480l);
                if (firebase()) {
                    paint = this.purchase;
                    canvas.saveLayer(rectF2, paint);
                    if (Build.VERSION.SDK_INT < 28) {
                        admob(canvas);
                    }
                    i4 = 0;
                    while (true) {
                        list = (List) c10111l.f20589l;
                        arrayList = (ArrayList) c10111l.f20587l;
                        if (i4 < list.size()) {
                            break;
                            break;
                        }
                        C15938l c15938l3 = (C15938l) list.get(i4);
                        abstractC4383l = (AbstractC4383l) arrayList.get(i4);
                        abstractC4383l2 = (AbstractC4383l) ((ArrayList) c10111l.f20586l).get(i4);
                        int i10 = c15938l3.yandex;
                        z = c15938l3.amazon;
                        iInmobi = AbstractC5020l.inmobi(i10);
                        i5 = i4;
                        paint2 = this.billing;
                        if (iInmobi != 0) {
                            path2 = path;
                            if (z) {
                                Matrix matrix9 = AbstractC4218l.yandex;
                                canvas.saveLayer(rectF2, c13957l);
                                canvas.drawRect(rectF2, c13957l);
                                path2.set((Path) abstractC4383l.amazon());
                                path2.transform(matrix2);
                                c13957l.setAlpha((int) (((Integer) abstractC4383l2.amazon()).intValue() * 2.55f));
                                canvas.drawPath(path2, paint2);
                                canvas.restore();
                            } else {
                                path2.set((Path) abstractC4383l.amazon());
                                path2.transform(matrix2);
                                c13957l.setAlpha((int) (((Integer) abstractC4383l2.amazon()).intValue() * 2.55f));
                                canvas.drawPath(path2, c13957l);
                            }
                        } else if (iInmobi != 1) {
                            path2 = path;
                            if (i5 == 0) {
                                c13957l.setColor(-16777216);
                                c13957l.setAlpha(255);
                                canvas.drawRect(rectF2, c13957l);
                            }
                            if (z) {
                                Matrix matrix10 = AbstractC4218l.yandex;
                                canvas.saveLayer(rectF2, paint2);
                                canvas.drawRect(rectF2, c13957l);
                                paint2.setAlpha((int) (((Integer) abstractC4383l2.amazon()).intValue() * 2.55f));
                                path2.set((Path) abstractC4383l.amazon());
                                path2.transform(matrix2);
                                canvas.drawPath(path2, paint2);
                                canvas.restore();
                            } else {
                                path2.set((Path) abstractC4383l.amazon());
                                path2.transform(matrix2);
                                canvas.drawPath(path2, paint2);
                            }
                        } else if (iInmobi != 2) {
                            if (z) {
                                Matrix matrix11 = AbstractC4218l.yandex;
                                canvas.saveLayer(rectF2, paint);
                                canvas.drawRect(rectF2, c13957l);
                                paint2.setAlpha((int) (((Integer) abstractC4383l2.amazon()).intValue() * 2.55f));
                                path3 = path;
                                path3.set((Path) abstractC4383l.amazon());
                                path3.transform(matrix2);
                                canvas.drawPath(path3, paint2);
                                canvas.restore();
                            } else {
                                path3 = path;
                                Matrix matrix12 = AbstractC4218l.yandex;
                                canvas.saveLayer(rectF2, paint);
                                path3.set((Path) abstractC4383l.amazon());
                                path3.transform(matrix2);
                                c13957l.setAlpha((int) (((Integer) abstractC4383l2.amazon()).intValue() * 2.55f));
                                canvas.drawPath(path3, c13957l);
                                canvas.restore();
                            }
                            path2 = path3;
                        } else if (iInmobi != 3) {
                            path2 = path;
                        } else {
                            if (arrayList.isEmpty()) {
                                i6 = 0;
                                while (true) {
                                    if (i6 < list.size()) {
                                        c13957l.setAlpha(255);
                                        canvas.drawRect(rectF2, c13957l);
                                        break;
                                    } else {
                                        if (((C15938l) list.get(i6)).yandex != 4) {
                                            break;
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                            path2 = path;
                        }
                        i4 = i5 + 1;
                        path = path2;
                    }
                    canvas.restore();
                }
                if (this.subscription != null) {
                    canvas.saveLayer(rectF2, this.mopub);
                    admob(canvas);
                    this.subscription.billing(canvas, matrix, i, null);
                    canvas.restore();
                }
                canvas.restore();
            }
            smaato();
        }
    }

    @Override // defpackage.InterfaceC15345l
    public void crashlytics(RectF rectF, Matrix matrix, boolean z) {
        this.subs.set(0.0f, 0.0f, 0.0f, 0.0f);
        mopub();
        Matrix matrix2 = this.vip;
        matrix2.set(matrix);
        if (z) {
            List list = this.Signature;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((AbstractC10437l) this.Signature.get(size)).pro.amazon());
                }
            } else {
                AbstractC10437l abstractC10437l = this.tapsense;
                if (abstractC10437l != null) {
                    matrix2.preConcat(abstractC10437l.pro.amazon());
                }
            }
        }
        matrix2.preConcat(this.pro.amazon());
    }

    public final boolean firebase() {
        C10111l c10111l = this.adcel;
        return (c10111l == null || ((ArrayList) c10111l.f20587l).isEmpty()) ? false : true;
    }

    public C5138l isPro() {
        return this.startapp.pro;
    }

    public final void mopub() {
        if (this.Signature != null) {
            return;
        }
        if (this.tapsense == null) {
            this.Signature = Collections.EMPTY_LIST;
            return;
        }
        this.Signature = new ArrayList();
        for (AbstractC10437l abstractC10437l = this.tapsense; abstractC10437l != null; abstractC10437l = abstractC10437l.tapsense) {
            this.Signature.add(abstractC10437l);
        }
    }

    public void remoteconfig(float f) {
        C10780l c10780l = this.pro;
        C10017l c10017l = c10780l.startapp;
        if (c10017l != null) {
            c10017l.mopub(f);
        }
        C10017l c10017l2 = c10780l.license;
        if (c10017l2 != null) {
            c10017l2.mopub(f);
        }
        C10017l c10017l3 = c10780l.pro;
        if (c10017l3 != null) {
            c10017l3.mopub(f);
        }
        AbstractC13890l abstractC13890l = c10780l.smaato;
        if (abstractC13890l != null) {
            abstractC13890l.mopub(f);
        }
        AbstractC4383l abstractC4383l = c10780l.remoteconfig;
        if (abstractC4383l != null) {
            abstractC4383l.mopub(f);
        }
        C14720l c14720l = c10780l.vip;
        if (c14720l != null) {
            c14720l.mopub(f);
        }
        C10017l c10017l4 = c10780l.metrica;
        if (c10017l4 != null) {
            c10017l4.mopub(f);
        }
        C10017l c10017l5 = c10780l.adcel;
        if (c10017l5 != null) {
            c10017l5.mopub(f);
        }
        C10017l c10017l6 = c10780l.ads;
        if (c10017l6 != null) {
            c10017l6.mopub(f);
        }
        C10017l c10017l7 = c10780l.subscription;
        if (c10017l7 != null) {
            c10017l7.mopub(f);
        }
        C10017l c10017l8 = c10780l.tapsense;
        if (c10017l8 != null) {
            c10017l8.mopub(f);
        }
        C10017l c10017l9 = c10780l.Signature;
        if (c10017l9 != null) {
            c10017l9.mopub(f);
        }
        int i = 0;
        C10111l c10111l = this.adcel;
        if (c10111l != null) {
            ArrayList arrayList = (ArrayList) c10111l.f20587l;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((AbstractC4383l) arrayList.get(i2)).mopub(f);
            }
        }
        C10017l c10017l10 = this.ads;
        if (c10017l10 != null) {
            c10017l10.mopub(f);
        }
        AbstractC10437l abstractC10437l = this.subscription;
        if (abstractC10437l != null) {
            abstractC10437l.remoteconfig(f);
        }
        while (true) {
            ArrayList arrayList2 = this.license;
            if (i >= arrayList2.size()) {
                return;
            }
            ((AbstractC4383l) arrayList2.get(i)).mopub(f);
            i++;
        }
    }

    public final void smaato() {
        C1770l c1770l = this.metrica.f20287l.yandex;
        String str = this.startapp.crashlytics;
        Object obj = c1770l.f4179l;
    }

    public abstract void subs(Canvas canvas, Matrix matrix, int i, C15480l c15480l);

    @Override // defpackage.InterfaceC15871l
    public final void yandex() {
        this.metrica.invalidateSelf();
    }

    @Override // defpackage.InterfaceC3012l
    public final void loadAd(List list, List list2) {
    }
}
