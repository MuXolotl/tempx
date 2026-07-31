package defpackage;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: lؔٔۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2624l extends AbstractC10437l {
    public final StringBuilder applovin;
    public final StringBuilder appmetrica;

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final C10017l f5704case;

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final C10712l f5705catch;

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public final C10017l f5706class;

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final C10017l f5707continue;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final C10017l f5708default;

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final int f5709else;

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final ArrayList f5710extends;

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public final C10017l f5711final;

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final C10017l f5712for;
    public final StringBuilder inmobi;

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public final C10017l f5713interface;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final C3994l f5714native;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final Matrix f5715package;
    public final StringBuilder premium;

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final ArrayList f5716private;

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public final C10017l f5717static;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final C13957l f5718strictfp;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final C10017l f5719switch;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final C13957l f5720synchronized;

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final C9950l f5721throw;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final RectF f5722throws;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final HashMap f5723volatile;

    public C2624l(C9950l c9950l, C4913l c4913l) {
        C17219l c17219l;
        C17219l c17219l2;
        C2536l c2536l;
        C17219l c17219l3;
        C2536l c2536l2;
        C17219l c17219l4;
        C2536l c2536l3;
        C11644l c11644l;
        C2536l c2536l4;
        C11644l c11644l2;
        C2982l c2982l;
        C11644l c11644l3;
        C2982l c2982l2;
        C11644l c11644l4;
        C2536l c2536l5;
        C11644l c11644l5;
        C2536l c2536l6;
        super(c9950l, c4913l);
        this.premium = new StringBuilder(2);
        this.applovin = new StringBuilder(0);
        this.appmetrica = new StringBuilder(0);
        this.inmobi = new StringBuilder(0);
        this.f5722throws = new RectF();
        this.f5715package = new Matrix();
        C13957l c13957l = new C13957l(1, 1);
        c13957l.setStyle(Paint.Style.FILL);
        this.f5720synchronized = c13957l;
        C13957l c13957l2 = new C13957l(1, 2);
        c13957l2.setStyle(Paint.Style.STROKE);
        this.f5718strictfp = c13957l2;
        this.f5723volatile = new HashMap();
        this.f5714native = new C3994l((Object) null);
        this.f5716private = new ArrayList();
        this.f5710extends = new ArrayList();
        this.f5709else = 2;
        this.f5721throw = c9950l;
        this.f5705catch = c4913l.loadAd;
        C10017l c10017l = new C10017l(3, (List) c4913l.adcel.f833l);
        this.f5712for = c10017l;
        c10017l.yandex(this);
        amazon(c10017l);
        C18595l c18595l = c4913l.ads;
        if (c18595l != null && (c11644l5 = (C11644l) c18595l.f36317l) != null && (c2536l6 = (C2536l) c11644l5.f23358l) != null) {
            AbstractC4383l abstractC4383lMo1225l = c2536l6.mo1225l();
            this.f5704case = (C10017l) abstractC4383lMo1225l;
            abstractC4383lMo1225l.yandex(this);
            amazon(abstractC4383lMo1225l);
        }
        if (c18595l != null && (c11644l4 = (C11644l) c18595l.f36317l) != null && (c2536l5 = (C2536l) c11644l4.f23357l) != null) {
            AbstractC4383l abstractC4383lMo1225l2 = c2536l5.mo1225l();
            this.f5719switch = (C10017l) abstractC4383lMo1225l2;
            abstractC4383lMo1225l2.yandex(this);
            amazon(abstractC4383lMo1225l2);
        }
        if (c18595l != null && (c11644l3 = (C11644l) c18595l.f36317l) != null && (c2982l2 = (C2982l) c11644l3.f23361l) != null) {
            C10017l c10017lMo1225l = c2982l2.mo1225l();
            this.f5707continue = c10017lMo1225l;
            c10017lMo1225l.yandex(this);
            amazon(c10017lMo1225l);
        }
        if (c18595l != null && (c11644l2 = (C11644l) c18595l.f36317l) != null && (c2982l = (C2982l) c11644l2.f23360l) != null) {
            C10017l c10017lMo1225l2 = c2982l.mo1225l();
            this.f5706class = c10017lMo1225l2;
            c10017lMo1225l2.yandex(this);
            amazon(c10017lMo1225l2);
        }
        if (c18595l != null && (c11644l = (C11644l) c18595l.f36317l) != null && (c2536l4 = (C2536l) c11644l.f23362l) != null) {
            AbstractC4383l abstractC4383lMo1225l3 = c2536l4.mo1225l();
            this.f5713interface = (C10017l) abstractC4383lMo1225l3;
            abstractC4383lMo1225l3.yandex(this);
            amazon(abstractC4383lMo1225l3);
        }
        if (c18595l != null && (c17219l4 = (C17219l) c18595l.f36316l) != null && (c2536l3 = (C2536l) c17219l4.f33423l) != null) {
            AbstractC4383l abstractC4383lMo1225l4 = c2536l3.mo1225l();
            this.f5717static = (C10017l) abstractC4383lMo1225l4;
            abstractC4383lMo1225l4.yandex(this);
            amazon(abstractC4383lMo1225l4);
        }
        if (c18595l != null && (c17219l3 = (C17219l) c18595l.f36316l) != null && (c2536l2 = (C2536l) c17219l3.f33427l) != null) {
            AbstractC4383l abstractC4383lMo1225l5 = c2536l2.mo1225l();
            this.f5708default = (C10017l) abstractC4383lMo1225l5;
            abstractC4383lMo1225l5.yandex(this);
            amazon(abstractC4383lMo1225l5);
        }
        if (c18595l != null && (c17219l2 = (C17219l) c18595l.f36316l) != null && (c2536l = (C2536l) c17219l2.f33426l) != null) {
            AbstractC4383l abstractC4383lMo1225l6 = c2536l.mo1225l();
            this.f5711final = (C10017l) abstractC4383lMo1225l6;
            abstractC4383lMo1225l6.yandex(this);
            amazon(abstractC4383lMo1225l6);
        }
        if (c18595l == null || (c17219l = (C17219l) c18595l.f36316l) == null) {
            return;
        }
        this.f5709else = c17219l.f33424l;
    }

    public static void adcel(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    public static void startapp(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public final List Signature(String str, float f, C4362l c4362l, float f2, float f3, boolean z) {
        float fMeasureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (z) {
                C2521l c2521l = (C2521l) this.f5705catch.admob.crashlytics(C2521l.yandex(cCharAt, c4362l.yandex, c4362l.loadAd));
                if (c2521l != null) {
                    fMeasureText = (AbstractC4218l.crashlytics() * ((float) c2521l.crashlytics) * f2) + f3;
                }
            } else {
                fMeasureText = this.f5720synchronized.measureText(str.substring(i4, i4 + 1)) + f3;
            }
            if (cCharAt == ' ') {
                z2 = true;
                f6 = fMeasureText;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = fMeasureText;
            } else {
                f5 += fMeasureText;
            }
            f4 += fMeasureText;
            if (f > 0.0f && f4 >= f && cCharAt != ' ') {
                i++;
                C3171l c3171lAds = ads(i);
                if (i3 == i2) {
                    String strSubstring = str.substring(i2, i4);
                    String strTrim = strSubstring.trim();
                    float length = (f4 - fMeasureText) - ((strTrim.length() - strSubstring.length()) * f6);
                    c3171lAds.yandex = strTrim;
                    c3171lAds.loadAd = length;
                    i2 = i4;
                    i3 = i2;
                    f4 = fMeasureText;
                    f5 = f4;
                } else {
                    String strSubstring2 = str.substring(i2, i3 - 1);
                    String strTrim2 = strSubstring2.trim();
                    float length2 = ((f4 - f5) - ((strSubstring2.length() - strTrim2.length()) * f6)) - f6;
                    c3171lAds.yandex = strTrim2;
                    c3171lAds.loadAd = length2;
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            C3171l c3171lAds2 = ads(i);
            c3171lAds2.yandex = str.substring(i2);
            c3171lAds2.loadAd = f4;
        }
        return this.f5710extends.subList(0, i);
    }

    public final C3171l ads(int i) {
        ArrayList arrayList = this.f5710extends;
        for (int size = arrayList.size(); size < i; size++) {
            C3171l c3171l = new C3171l();
            c3171l.yandex = "";
            c3171l.loadAd = 0.0f;
            arrayList.add(c3171l);
        }
        return (C3171l) arrayList.get(i - 1);
    }

    @Override // defpackage.AbstractC10437l, defpackage.InterfaceC15345l
    public final void crashlytics(RectF rectF, Matrix matrix, boolean z) {
        super.crashlytics(rectF, matrix, z);
        C10712l c10712l = this.f5705catch;
        rectF.set(0.0f, 0.0f, c10712l.firebase.width(), c10712l.firebase.height());
    }

    public final void metrica(C8253l c8253l, int i, int i2) {
        C13957l c13957l = this.f5720synchronized;
        C10017l c10017l = this.f5704case;
        if (c10017l == null || !subscription(i2)) {
            c13957l.setColor(c8253l.admob);
        } else {
            c13957l.setColor(((Integer) c10017l.amazon()).intValue());
        }
        C10017l c10017l2 = this.f5719switch;
        C13957l c13957l2 = this.f5718strictfp;
        if (c10017l2 == null || !subscription(i2)) {
            c13957l2.setColor(c8253l.subs);
        } else {
            c13957l2.setColor(((Integer) c10017l2.amazon()).intValue());
        }
        C10017l c10017l3 = this.pro.startapp;
        int iIntValue = 100;
        int iIntValue2 = c10017l3 == null ? 100 : ((Integer) c10017l3.amazon()).intValue();
        C10017l c10017l4 = this.f5713interface;
        if (c10017l4 != null && subscription(i2)) {
            iIntValue = ((Integer) c10017l4.amazon()).intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i) / 255.0f);
        c13957l.setAlpha(iRound);
        c13957l2.setAlpha(iRound);
        C10017l c10017l5 = this.f5707continue;
        if (c10017l5 == null || !subscription(i2)) {
            c13957l2.setStrokeWidth(AbstractC4218l.crashlytics() * c8253l.isPro);
        } else {
            c13957l2.setStrokeWidth(((Float) c10017l5.amazon()).floatValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC10437l
    public final void subs(Canvas canvas, Matrix matrix, int i, C15480l c15480l) {
        C11644l c11644l;
        int i2;
        ArrayList arrayList;
        Canvas canvas2;
        Typeface typefaceCreateFromAsset;
        int i3;
        List list;
        C13957l c13957l;
        C13957l c13957l2;
        C8253l c8253l = (C8253l) this.f5712for.amazon();
        C10712l c10712l = this.f5705catch;
        C4362l c4362l = (C4362l) c10712l.billing.get(c8253l.loadAd);
        if (c4362l == null) {
            return;
        }
        String str = c4362l.loadAd;
        String str2 = c4362l.yandex;
        canvas.save();
        canvas.concat(matrix);
        metrica(c8253l, i, 0);
        C9950l c9950l = this.f5721throw;
        c9950l.getClass();
        int i4 = c9950l.f20287l.admob.f35537l;
        C13957l c13957l3 = this.f5720synchronized;
        int i5 = 0;
        C13957l c13957l4 = this.f5718strictfp;
        C10017l c10017l = this.f5706class;
        C13957l c13957l5 = c13957l4;
        if (i4 > 0) {
            float f = c8253l.crashlytics / 100.0f;
            float f2 = 0.0f;
            float[] fArr = (float[]) AbstractC4218l.purchase.get();
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f3 = AbstractC4218l.billing;
            fArr[2] = f3;
            fArr[3] = f3;
            float f4 = f;
            matrix.mapPoints(fArr);
            C9950l c9950l2 = c9950l;
            Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
            List listAsList = Arrays.asList(c8253l.yandex.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
            int size = listAsList.size();
            float fFloatValue = c8253l.purchase / 10.0f;
            if (c10017l != null) {
                fFloatValue += ((Float) c10017l.amazon()).floatValue();
            }
            float f5 = fFloatValue;
            int i6 = 0;
            int i7 = -1;
            while (i6 < size) {
                String str3 = (String) listAsList.get(i6);
                PointF pointF = c8253l.remoteconfig;
                int i8 = i6;
                float f6 = f4;
                C2624l c2624l = this;
                List listSignature = c2624l.Signature(str3, pointF == null ? f2 : pointF.x, c4362l, f6, f5, true);
                int i9 = i5;
                while (i9 < listSignature.size()) {
                    C3171l c3171l = (C3171l) listSignature.get(i9);
                    List list2 = listSignature;
                    int i10 = i7 + 1;
                    canvas.save();
                    int i11 = i9;
                    c2624l.tapsense(canvas, c8253l, i10, c3171l.loadAd);
                    String str4 = c3171l.yandex;
                    int i12 = i5;
                    while (i12 < str4.length()) {
                        String str5 = str4;
                        C2521l c2521l = (C2521l) c10712l.admob.crashlytics(C2521l.yandex(str4.charAt(i12), str2, str));
                        if (c2521l == null) {
                            f5 = f5;
                            i12 = i12;
                            listAsList = listAsList;
                            size = size;
                            c13957l = c13957l5;
                            c9950l2 = c9950l2;
                        } else {
                            c2624l.metrica(c8253l, i, i12);
                            HashMap map = c2624l.f5723volatile;
                            if (map.containsKey(c2521l)) {
                                list = (List) map.get(c2521l);
                            } else {
                                ArrayList arrayList2 = c2521l.yandex;
                                int size2 = arrayList2.size();
                                ArrayList arrayList3 = new ArrayList(size2);
                                int i13 = i5;
                                while (i13 < size2) {
                                    arrayList3.add(new C16649l(c9950l2, c2624l, (C1075l) arrayList2.get(i13), c10712l));
                                    size2 = size2;
                                    i13++;
                                    arrayList2 = arrayList2;
                                }
                                map.put(c2521l, arrayList3);
                                list = arrayList3;
                            }
                            int i14 = i5;
                            while (i14 < list.size()) {
                                Path pathPurchase = ((C16649l) list.get(i14)).purchase();
                                List list3 = list;
                                pathPurchase.computeBounds(c2624l.f5722throws, i5);
                                Matrix matrix2 = c2624l.f5715package;
                                matrix2.reset();
                                matrix2.preTranslate(f2, (-c8253l.mopub) * AbstractC4218l.crashlytics());
                                matrix2.preScale(f6, f6);
                                pathPurchase.transform(matrix2);
                                if (c8253l.firebase) {
                                    adcel(pathPurchase, c13957l3, canvas);
                                    c13957l2 = c13957l5;
                                    adcel(pathPurchase, c13957l2, canvas);
                                } else {
                                    c13957l2 = c13957l5;
                                    adcel(pathPurchase, c13957l2, canvas);
                                    adcel(pathPurchase, c13957l3, canvas);
                                }
                                i14++;
                                c2624l = this;
                                c13957l5 = c13957l2;
                                list = list3;
                                i5 = 0;
                                f2 = 0.0f;
                            }
                            c13957l = c13957l5;
                            canvas.translate((AbstractC4218l.crashlytics() * ((float) c2521l.crashlytics) * f6) + f5, 0.0f);
                        }
                        i12++;
                        c2624l = this;
                        c13957l5 = c13957l;
                        c9950l2 = c9950l2;
                        str4 = str5;
                        f5 = f5;
                        listAsList = listAsList;
                        size = size;
                        i5 = 0;
                        f2 = 0.0f;
                    }
                    canvas.restore();
                    i9 = i11 + 1;
                    c2624l = this;
                    listSignature = list2;
                    i7 = i10;
                    listAsList = listAsList;
                    size = size;
                    i5 = 0;
                    f2 = 0.0f;
                }
                i6 = i8 + 1;
                f4 = f6;
                listAsList = listAsList;
                size = size;
                i5 = 0;
                f2 = 0.0f;
            }
            canvas2 = canvas;
        } else {
            char c = 2;
            Typeface typeface = null;
            if (c9950l.getCallback() == null) {
                c11644l = null;
            } else {
                if (c9950l.f20279l == null) {
                    c9950l.f20279l = new C11644l(c9950l.getCallback());
                }
                c11644l = c9950l.f20279l;
            }
            if (c11644l != null) {
                C0797l c0797l = (C0797l) c11644l.f23358l;
                c0797l.f2413l = str2;
                c0797l.f2412l = str;
                HashMap map2 = (HashMap) c11644l.f23357l;
                Typeface typeface2 = (Typeface) map2.get(c0797l);
                if (typeface2 != null) {
                    typeface = typeface2;
                } else {
                    HashMap map3 = (HashMap) c11644l.f23361l;
                    Typeface typeface3 = (Typeface) map3.get(str2);
                    if (typeface3 != null) {
                        typefaceCreateFromAsset = typeface3;
                    } else {
                        Typeface typeface4 = c4362l.crashlytics;
                        if (typeface4 != null) {
                            typefaceCreateFromAsset = typeface4;
                        } else {
                            typefaceCreateFromAsset = Typeface.createFromAsset((AssetManager) c11644l.f23360l, "fonts/" + str2 + ((String) c11644l.f23362l));
                            map3.put(str2, typefaceCreateFromAsset);
                        }
                    }
                    boolean zContains = str.contains("Italic");
                    boolean zContains2 = str.contains("Bold");
                    if (zContains && zContains2) {
                        i3 = 3;
                    } else if (zContains) {
                        i3 = 2;
                    } else {
                        i3 = zContains2 ? 1 : 0;
                    }
                    if (typefaceCreateFromAsset.getStyle() != i3) {
                        typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i3);
                    }
                    map2.put(c0797l, typefaceCreateFromAsset);
                    typeface = typefaceCreateFromAsset;
                }
            }
            if (typeface == null) {
                typeface = c4362l.crashlytics;
            }
            if (typeface != null) {
                String str6 = c8253l.yandex;
                c13957l3.setTypeface(typeface);
                float f7 = c8253l.crashlytics;
                c13957l3.setTextSize(AbstractC4218l.crashlytics() * f7);
                c13957l5.setTypeface(c13957l3.getTypeface());
                c13957l5.setTextSize(c13957l3.getTextSize());
                float fFloatValue2 = c8253l.purchase / 10.0f;
                if (c10017l != null) {
                    fFloatValue2 += ((Float) c10017l.amazon()).floatValue();
                }
                float fCrashlytics = ((AbstractC4218l.crashlytics() * fFloatValue2) * f7) / 100.0f;
                List listAsList2 = Arrays.asList(str6.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
                int size3 = listAsList2.size();
                int i15 = 0;
                int i16 = -1;
                int length = 0;
                while (i15 < size3) {
                    String str7 = (String) listAsList2.get(i15);
                    PointF pointF2 = c8253l.remoteconfig;
                    float f8 = fCrashlytics;
                    char c2 = c;
                    List listSignature2 = Signature(str7, pointF2 == null ? 0.0f : pointF2.x, c4362l, 0.0f, f8, false);
                    int i17 = 0;
                    while (i17 < listSignature2.size()) {
                        C3171l c3171l2 = (C3171l) listSignature2.get(i17);
                        i16++;
                        canvas.save();
                        tapsense(canvas, c8253l, i16, c13957l3.measureText(c3171l2.yandex));
                        String string = c3171l2.yandex;
                        List list4 = listSignature2;
                        int i18 = i17;
                        C4362l c4362l2 = c4362l;
                        if (Bidi.requiresBidi(string.toCharArray(), 0, string.length())) {
                            Bidi bidi = new Bidi(string, -2);
                            int runCount = bidi.getRunCount();
                            byte[] bArr = new byte[runCount];
                            Integer[] numArr = new Integer[runCount];
                            int i19 = 0;
                            while (i19 < runCount) {
                                bArr[i19] = (byte) bidi.getRunLevel(i19);
                                numArr[i19] = Integer.valueOf(i19);
                                i19++;
                                size3 = size3;
                            }
                            i2 = size3;
                            Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
                            StringBuilder sb = this.appmetrica;
                            sb.setLength(0);
                            int i20 = 0;
                            while (i20 < runCount) {
                                int iIntValue = numArr[i20].intValue();
                                int i21 = runCount;
                                int runStart = bidi.getRunStart(iIntValue);
                                Integer[] numArr2 = numArr;
                                int runLimit = bidi.getRunLimit(iIntValue);
                                int runLevel = bidi.getRunLevel(iIntValue);
                                String strSubstring = string.substring(runStart, runLimit);
                                if ((runLevel & 1) == 0) {
                                    sb.append(strSubstring);
                                } else {
                                    StringBuilder sb2 = this.inmobi;
                                    int length2 = 0;
                                    sb2.setLength(0);
                                    while (length2 < strSubstring.length()) {
                                        String strVip = vip(length2, strSubstring);
                                        sb2.insert(0, strVip);
                                        length2 += strVip.length();
                                        strSubstring = strSubstring;
                                    }
                                    sb.append((CharSequence) sb2);
                                }
                                i20++;
                                runCount = i21;
                                numArr = numArr2;
                                bidi = bidi;
                            }
                            string = sb.toString();
                        } else {
                            i2 = size3;
                        }
                        ArrayList arrayList4 = this.f5716private;
                        arrayList4.clear();
                        int length3 = 0;
                        while (length3 < string.length()) {
                            String strVip2 = vip(length3, string);
                            arrayList4.add(strVip2);
                            length3 += strVip2.length();
                        }
                        int i22 = 0;
                        while (i22 < arrayList4.size()) {
                            StringBuilder sb3 = this.applovin;
                            sb3.setLength(0);
                            sb3.append((String) arrayList4.get(i22));
                            int i23 = i22 + 1;
                            while (i23 < arrayList4.size()) {
                                String str8 = (String) arrayList4.get(i23);
                                int i24 = 0;
                                while (true) {
                                    if (i24 >= str8.length()) {
                                        break;
                                    }
                                    arrayList = arrayList4;
                                    if (Character.getDirectionality(str8.codePointAt(i24)) == 2) {
                                        break;
                                    }
                                    i24++;
                                    arrayList4 = arrayList;
                                }
                                sb3.insert(0, str8);
                                i23++;
                                arrayList4 = arrayList;
                            }
                            ArrayList arrayList5 = arrayList4;
                            String string2 = sb3.toString();
                            metrica(c8253l, i, i22 + length);
                            if (c8253l.firebase) {
                                startapp(string2, c13957l3, canvas);
                                startapp(string2, c13957l5, canvas);
                            } else {
                                startapp(string2, c13957l5, canvas);
                                startapp(string2, c13957l3, canvas);
                            }
                            canvas.translate(c13957l3.measureText(string2) + f8, 0.0f);
                            i22 = i23;
                            arrayList4 = arrayList5;
                        }
                        length += c3171l2.yandex.length();
                        canvas.restore();
                        i17 = i18 + 1;
                        c4362l = c4362l2;
                        c2 = 2;
                        f8 = f8;
                        listAsList2 = listAsList2;
                        size3 = i2;
                        listSignature2 = list4;
                    }
                    i15++;
                    c4362l = c4362l;
                    c = c2;
                    fCrashlytics = f8;
                    size3 = size3;
                }
            }
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public final boolean subscription(int i) {
        C10017l c10017l;
        int length = ((C8253l) this.f5712for.amazon()).yandex.length();
        C10017l c10017l2 = this.f5717static;
        if (c10017l2 == null || (c10017l = this.f5708default) == null) {
            return true;
        }
        int iMin = Math.min(((Integer) c10017l2.amazon()).intValue(), ((Integer) c10017l.amazon()).intValue());
        int iMax = Math.max(((Integer) c10017l2.amazon()).intValue(), ((Integer) c10017l.amazon()).intValue());
        C10017l c10017l3 = this.f5711final;
        if (c10017l3 != null) {
            int iIntValue = ((Integer) c10017l3.amazon()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.f5709else == 2) {
            return i >= iMin && i < iMax;
        }
        float f = (i / length) * 100.0f;
        return f >= ((float) iMin) && f < ((float) iMax);
    }

    public final boolean tapsense(Canvas canvas, C8253l c8253l, int i, float f) {
        PointF pointF = c8253l.smaato;
        PointF pointF2 = c8253l.remoteconfig;
        float fCrashlytics = AbstractC4218l.crashlytics();
        float f2 = (i * c8253l.billing * fCrashlytics) + (pointF == null ? 0.0f : (c8253l.billing * fCrashlytics) + pointF.y);
        this.f5721throw.getClass();
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int iInmobi = AbstractC5020l.inmobi(c8253l.amazon);
        if (iInmobi == 0) {
            canvas.translate(f3, f2);
            return true;
        }
        if (iInmobi == 1) {
            canvas.translate((f3 + f4) - f, f2);
            return true;
        }
        if (iInmobi != 2) {
            return true;
        }
        canvas.translate(((f4 / 2.0f) + f3) - (f / 2.0f), f2);
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final String vip(int i, String str) {
        int iCodePointAt = str.codePointAt(i);
        int iCharCount = Character.charCount(iCodePointAt) + i;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (Character.getType(iCodePointAt2) != 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        C3994l c3994l = this.f5714native;
        if (c3994l.billing(j) >= 0) {
            return (String) c3994l.amazon(j);
        }
        StringBuilder sb = this.premium;
        sb.setLength(0);
        while (i < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i);
            sb.appendCodePoint(iCodePointAt3);
            i += Character.charCount(iCodePointAt3);
        }
        String string = sb.toString();
        c3994l.subs(j, string);
        return string;
    }
}
