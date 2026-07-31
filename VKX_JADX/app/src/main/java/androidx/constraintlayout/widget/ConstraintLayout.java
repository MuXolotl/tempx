package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.AbstractC12994l;
import defpackage.AbstractC14648l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC15096l;
import defpackage.AbstractC17322l;
import defpackage.AbstractC4914l;
import defpackage.AbstractC5020l;
import defpackage.AbstractC5731l;
import defpackage.AbstractC9031l;
import defpackage.C0051l;
import defpackage.C10023l;
import defpackage.C10209l;
import defpackage.C10526l;
import defpackage.C10664l;
import defpackage.C11338l;
import defpackage.C12261l;
import defpackage.C1235l;
import defpackage.C16420l;
import defpackage.C16573l;
import defpackage.C16827l;
import defpackage.C18073l;
import defpackage.C18254l;
import defpackage.C18449l;
import defpackage.C3330l;
import defpackage.C3490l;
import defpackage.C4298l;
import defpackage.C4759l;
import defpackage.C4847l;
import defpackage.C5359l;
import defpackage.C5390l;
import defpackage.C5601l;
import defpackage.C5609l;
import defpackage.C8229l;
import defpackage.C8431l;
import defpackage.C8950l;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static C10209l f340l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public HashMap f341l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C10664l f342l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f343l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public boolean f344l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ArrayList f345l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final SparseArray f346l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public C4759l f347l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C16827l f348l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f349l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f350l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f351l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f352l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f353l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public C10023l f354l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final SparseArray f355l;

    public ConstraintLayout(Context context) {
        super(context);
        this.f346l = new SparseArray();
        this.f345l = new ArrayList(4);
        this.f342l = new C10664l();
        this.f350l = 0;
        this.f349l = 0;
        this.f353l = Alert.DURATION_SHOW_INDEFINITELY;
        this.f343l = Alert.DURATION_SHOW_INDEFINITELY;
        this.f344l = true;
        this.f352l = 257;
        this.f347l = null;
        this.f354l = null;
        this.f351l = -1;
        this.f341l = new HashMap();
        this.f355l = new SparseArray();
        this.f348l = new C16827l(this, this);
        subs(null, 0, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static C10209l getSharedValues() {
        if (f340l == null) {
            C10209l c10209l = new C10209l();
            new SparseIntArray();
            new HashMap();
            f340l = c10209l;
        }
        return f340l;
    }

    public static C8950l yandex() {
        C8950l c8950l = new C8950l(-2, -2);
        c8950l.yandex = -1;
        c8950l.loadAd = -1;
        c8950l.crashlytics = -1.0f;
        c8950l.amazon = true;
        c8950l.purchase = -1;
        c8950l.billing = -1;
        c8950l.mopub = -1;
        c8950l.admob = -1;
        c8950l.subs = -1;
        c8950l.isPro = -1;
        c8950l.firebase = -1;
        c8950l.smaato = -1;
        c8950l.remoteconfig = -1;
        c8950l.vip = -1;
        c8950l.metrica = -1;
        c8950l.startapp = -1;
        c8950l.adcel = 0;
        c8950l.ads = 0.0f;
        c8950l.subscription = -1;
        c8950l.tapsense = -1;
        c8950l.Signature = -1;
        c8950l.license = -1;
        c8950l.pro = RecyclerView.UNDEFINED_DURATION;
        c8950l.ad = RecyclerView.UNDEFINED_DURATION;
        c8950l.advert = RecyclerView.UNDEFINED_DURATION;
        c8950l.isVip = RecyclerView.UNDEFINED_DURATION;
        c8950l.signatures = RecyclerView.UNDEFINED_DURATION;
        c8950l.premium = RecyclerView.UNDEFINED_DURATION;
        c8950l.applovin = RecyclerView.UNDEFINED_DURATION;
        c8950l.appmetrica = 0;
        c8950l.inmobi = 0.5f;
        c8950l.f18461throws = 0.5f;
        c8950l.f18449package = null;
        c8950l.f18458synchronized = -1.0f;
        c8950l.f18455strictfp = -1.0f;
        c8950l.f18464volatile = 0;
        c8950l.f18447native = 0;
        c8950l.f18450private = 0;
        c8950l.f18438extends = 0;
        c8950l.f18441for = 0;
        c8950l.f18460throw = 0;
        c8950l.f18432catch = 0;
        c8950l.f18437else = 0;
        c8950l.f18431case = 1.0f;
        c8950l.f18457switch = 1.0f;
        c8950l.f18435continue = -1;
        c8950l.f18433class = -1;
        c8950l.f18446interface = -1;
        c8950l.f18454static = false;
        c8950l.f18436default = false;
        c8950l.f18439final = null;
        c8950l.f18448new = 0;
        c8950l.f18442goto = true;
        c8950l.f18456super = true;
        c8950l.f18444import = false;
        c8950l.f18429abstract = false;
        c8950l.f18445instanceof = false;
        c8950l.f18452public = -1;
        c8950l.f18440finally = -1;
        c8950l.f18459this = -1;
        c8950l.f18463try = -1;
        c8950l.f18430break = RecyclerView.UNDEFINED_DURATION;
        c8950l.f18462transient = RecyclerView.UNDEFINED_DURATION;
        c8950l.f18451protected = 0.5f;
        c8950l.f18453return = new C11338l();
        return c8950l;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C8950l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f345l;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC17322l) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:159:0x0307  */
    /* JADX WARN: Code duplicated, block: B:161:0x0323  */
    /* JADX WARN: Code duplicated, block: B:163:0x0326  */
    /* JADX WARN: Code duplicated, block: B:168:0x034a  */
    /* JADX WARN: Code duplicated, block: B:177:0x0367  */
    /* JADX WARN: Code duplicated, block: B:233:0x046c  */
    /* JADX WARN: Code duplicated, block: B:372:0x0396 A[SYNTHETIC] */
    public final void firebase(C10664l c10664l, int i, int i2, int i3) {
        int iMin;
        int iMax;
        int iMin2;
        int iMax2;
        int i4;
        char c;
        boolean z;
        int i5;
        int i6;
        boolean z2;
        C16827l c16827l;
        int i7;
        boolean zM2937catch;
        int i8;
        boolean z3;
        boolean z4;
        int i9;
        C16827l c16827l2;
        int i10;
        int i11;
        C8431l c8431l;
        C3490l c3490l;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z5;
        Iterator it;
        AbstractC14648l abstractC14648l;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i18 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        C16827l c16827l3 = this.f348l;
        c16827l3.yandex = iMax3;
        c16827l3.loadAd = iMax4;
        c16827l3.crashlytics = paddingWidth;
        c16827l3.amazon = i18;
        c16827l3.purchase = i2;
        c16827l3.billing = i3;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        int i19 = 1;
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            iMax5 = iMax6;
        }
        int i20 = size - paddingWidth;
        int i21 = size2 - i18;
        int i22 = c16827l3.amazon;
        int i23 = c16827l3.crashlytics;
        int childCount = getChildCount();
        if (mode == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax = Math.max(0, this.f350l);
                iMin = iMax;
            } else {
                iMin = i20;
            }
            i19 = 2;
        } else if (mode == 0) {
            if (childCount == 0) {
                iMax = Math.max(0, this.f350l);
                iMin = iMax;
            } else {
                iMin = 0;
            }
            i19 = 2;
        } else if (mode != 1073741824) {
            iMin = 0;
        } else {
            iMin = Math.min(this.f353l - i23, i20);
            i19 = 1;
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.f349l);
                iMin2 = iMax2;
            } else {
                iMin2 = i21;
            }
            i4 = 2;
        } else if (mode2 != 0) {
            iMin2 = mode2 != 1073741824 ? 0 : Math.min(this.f343l - i22, i21);
            i4 = 1;
        } else {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.f349l);
                iMin2 = iMax2;
            } else {
                iMin2 = 0;
            }
            i4 = 2;
        }
        int iMetrica = c10664l.metrica();
        C5390l c5390l = c10664l.f21641l;
        int[] iArr = c10664l.applovin;
        int i24 = iMin;
        if (i24 == iMetrica && iMin2 == c10664l.subs()) {
            c = 1;
        } else {
            c5390l.f11544l = true;
            c = 1;
        }
        c10664l.f22846default = 0;
        c10664l.f22849final = 0;
        iArr[0] = this.f353l - i23;
        iArr[c] = this.f343l - i22;
        c10664l.f22852goto = 0;
        c10664l.f22865super = 0;
        c10664l.m3061strictfp(i19);
        c10664l.m3059native(i24);
        c10664l.m3064volatile(i4);
        c10664l.m3062synchronized(iMin2);
        int i25 = this.f350l - i23;
        if (i25 < 0) {
            c10664l.f22852goto = 0;
        } else {
            c10664l.f22852goto = i25;
        }
        int i26 = this.f349l - i22;
        if (i26 < 0) {
            c10664l.f22865super = 0;
        } else {
            c10664l.f22865super = i26;
        }
        c10664l.f21651l = iMax5;
        c10664l.f21644l = iMax3;
        C18449l c18449l = c10664l.f21653l;
        C10664l c10664l2 = (C10664l) c18449l.f36012l;
        ArrayList arrayList = (ArrayList) c18449l.f36010l;
        C16827l c16827l4 = c10664l.f21650l;
        int size3 = c10664l.f21654return.size();
        int iMetrica2 = c10664l.metrica();
        int iSubs = c10664l.subs();
        boolean zBilling = AbstractC15096l.billing(i, 128);
        boolean z6 = zBilling || AbstractC15096l.billing(i, 64);
        if (z6) {
            int i27 = 0;
            while (true) {
                if (i27 < size3) {
                    boolean z7 = z6;
                    C11338l c11338l = (C11338l) c10664l.f21654return.get(i27);
                    i5 = size3;
                    int[] iArr2 = c11338l.f22844const;
                    int i28 = i27;
                    boolean z8 = (iArr2[0] == 3) && (iArr2[1] == 3) && c11338l.f22856interface > 0.0f;
                    if ((c11338l.license() && z8) || ((c11338l.pro() && z8) || c11338l.license() || c11338l.pro())) {
                        i6 = 1073741824;
                        z = false;
                    } else {
                        i27 = i28 + 1;
                        z6 = z7;
                        size3 = i5;
                    }
                } else {
                    z = z6;
                    i5 = size3;
                    i6 = 1073741824;
                }
            }
        } else {
            z = z6;
            i5 = size3;
            i6 = 1073741824;
        }
        boolean z9 = z & ((mode == i6 && mode2 == i6) || zBilling);
        if (z9) {
            int iMin3 = Math.min(iArr[0], i20);
            int iMin4 = Math.min(iArr[1], i21);
            int i29 = 1073741824;
            if (mode == 1073741824) {
                if (c10664l.metrica() != iMin3) {
                    c10664l.m3059native(iMin3);
                    c5390l.f11538l = true;
                }
                i29 = 1073741824;
            }
            if (mode2 == i29 && c10664l.subs() != iMin4) {
                c10664l.m3062synchronized(iMin4);
                c5390l.f11538l = true;
            }
            if (mode == i29 && mode2 == i29) {
                ArrayList<AbstractC14648l> arrayList2 = c5390l.f11542l;
                C10664l c10664l3 = (C10664l) c5390l.f11543l;
                if (c5390l.f11538l || c5390l.f11544l) {
                    for (C11338l c11338l2 : c10664l3.f21654return) {
                        c11338l2.billing();
                        c11338l2.yandex = false;
                        c11338l2.amazon.vip();
                        c11338l2.purchase.remoteconfig();
                        z9 = z9;
                    }
                    z2 = z9;
                    c10664l3.billing();
                    i14 = 0;
                    c10664l3.yandex = false;
                    c10664l3.amazon.vip();
                    c10664l3.purchase.remoteconfig();
                    c5390l.f11544l = false;
                } else {
                    z2 = z9;
                    i14 = 0;
                }
                c5390l.crashlytics((C10664l) c5390l.f11545l);
                c10664l3.f22846default = i14;
                int[] iArr3 = c10664l3.f22844const;
                c10664l3.f22849final = i14;
                int iAdmob = c10664l3.admob(i14);
                int iAdmob2 = c10664l3.admob(1);
                if (c5390l.f11538l) {
                    c5390l.amazon();
                }
                int iStartapp = c10664l3.startapp();
                int iAdcel = c10664l3.adcel();
                c16827l = c16827l4;
                c10664l3.amazon.admob.amazon(iStartapp);
                c10664l3.purchase.admob.amazon(iAdcel);
                c5390l.admob();
                if (iAdmob == 2 || iAdmob2 == 2) {
                    if (zBilling) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!((AbstractC14648l) it2.next()).firebase()) {
                                zBilling = false;
                                break;
                            }
                        }
                    }
                    if (zBilling && iAdmob == 2) {
                        c10664l3.m3061strictfp(1);
                        c10664l3.m3059native(c5390l.purchase(c10664l3, 0));
                        c10664l3.amazon.purchase.amazon(c10664l3.metrica());
                    }
                    if (zBilling && iAdmob2 == 2) {
                        i15 = 1;
                        c10664l3.m3064volatile(1);
                        c10664l3.m3062synchronized(c5390l.purchase(c10664l3, 1));
                        c10664l3.purchase.purchase.amazon(c10664l3.subs());
                    }
                    i16 = iArr3[0];
                    if (i16 != i15 || i16 == 4) {
                        int iMetrica3 = c10664l3.metrica() + iStartapp;
                        c10664l3.amazon.subs.amazon(iMetrica3);
                        c10664l3.amazon.purchase.amazon(iMetrica3 - iStartapp);
                        c5390l.admob();
                        i17 = iArr3[1];
                        if (i17 != 1 || i17 == 4) {
                            int iSubs2 = c10664l3.subs() + iAdcel;
                            c10664l3.purchase.subs.amazon(iSubs2);
                            c10664l3.purchase.purchase.amazon(iSubs2 - iAdcel);
                        }
                        c5390l.admob();
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    for (AbstractC14648l abstractC14648l2 : arrayList2) {
                        if (abstractC14648l2.loadAd == c10664l3 || abstractC14648l2.mopub) {
                            abstractC14648l2.purchase();
                        }
                    }
                    it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            zM2937catch = true;
                            break;
                        }
                        abstractC14648l = (AbstractC14648l) it.next();
                        if (!z5 || abstractC14648l.loadAd != c10664l3) {
                            if (abstractC14648l.admob.isPro || ((!abstractC14648l.subs.isPro && !(abstractC14648l instanceof C5359l)) || (!abstractC14648l.purchase.isPro && !(abstractC14648l instanceof C8229l) && !(abstractC14648l instanceof C5359l)))) {
                                zM2937catch = false;
                                break;
                            }
                        }
                    }
                    c10664l3.m3061strictfp(iAdmob);
                    c10664l3.m3064volatile(iAdmob2);
                    i7 = 2;
                    i13 = 1073741824;
                } else {
                    iAdcel = iAdcel;
                }
                i15 = 1;
                i16 = iArr3[0];
                if (i16 != i15) {
                    int iMetrica4 = c10664l3.metrica() + iStartapp;
                    c10664l3.amazon.subs.amazon(iMetrica4);
                    c10664l3.amazon.purchase.amazon(iMetrica4 - iStartapp);
                    c5390l.admob();
                    i17 = iArr3[1];
                    if (i17 != 1) {
                        int iSubs3 = c10664l3.subs() + iAdcel;
                        c10664l3.purchase.subs.amazon(iSubs3);
                        c10664l3.purchase.purchase.amazon(iSubs3 - iAdcel);
                    } else {
                        int iSubs4 = c10664l3.subs() + iAdcel;
                        c10664l3.purchase.subs.amazon(iSubs4);
                        c10664l3.purchase.purchase.amazon(iSubs4 - iAdcel);
                    }
                    c5390l.admob();
                    z5 = true;
                } else {
                    int iMetrica5 = c10664l3.metrica() + iStartapp;
                    c10664l3.amazon.subs.amazon(iMetrica5);
                    c10664l3.amazon.purchase.amazon(iMetrica5 - iStartapp);
                    c5390l.admob();
                    i17 = iArr3[1];
                    if (i17 != 1) {
                        int iSubs5 = c10664l3.subs() + iAdcel;
                        c10664l3.purchase.subs.amazon(iSubs5);
                        c10664l3.purchase.purchase.amazon(iSubs5 - iAdcel);
                    } else {
                        int iSubs6 = c10664l3.subs() + iAdcel;
                        c10664l3.purchase.subs.amazon(iSubs6);
                        c10664l3.purchase.purchase.amazon(iSubs6 - iAdcel);
                    }
                    c5390l.admob();
                    z5 = true;
                }
                while (r8.hasNext()) {
                    if (abstractC14648l2.loadAd == c10664l3) {
                    }
                    abstractC14648l2.purchase();
                }
                it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        zM2937catch = true;
                        break;
                    }
                    abstractC14648l = (AbstractC14648l) it.next();
                    if (!z5) {
                    }
                    if (abstractC14648l.admob.isPro) {
                    }
                    zM2937catch = false;
                    break;
                }
                c10664l3.m3061strictfp(iAdmob);
                c10664l3.m3064volatile(iAdmob2);
                i7 = 2;
                i13 = 1073741824;
            } else {
                z2 = z9;
                c16827l = c16827l4;
                C10664l c10664l4 = (C10664l) c5390l.f11543l;
                if (c5390l.f11538l) {
                    for (C11338l c11338l3 : c10664l4.f21654return) {
                        c11338l3.billing();
                        c11338l3.yandex = false;
                        C8431l c8431l2 = c11338l3.amazon;
                        c8431l2.purchase.isPro = false;
                        c8431l2.mopub = false;
                        c8431l2.vip();
                        C3490l c3490l2 = c11338l3.purchase;
                        c3490l2.purchase.isPro = false;
                        c3490l2.mopub = false;
                        c3490l2.remoteconfig();
                    }
                    i12 = 0;
                    c10664l4.billing();
                    c10664l4.yandex = false;
                    C8431l c8431l3 = c10664l4.amazon;
                    c8431l3.purchase.isPro = false;
                    c8431l3.mopub = false;
                    c8431l3.vip();
                    C3490l c3490l3 = c10664l4.purchase;
                    c3490l3.purchase.isPro = false;
                    c3490l3.mopub = false;
                    c3490l3.remoteconfig();
                    c5390l.amazon();
                } else {
                    i12 = 0;
                }
                c5390l.crashlytics((C10664l) c5390l.f11545l);
                c10664l4.f22846default = i12;
                c10664l4.f22849final = i12;
                c10664l4.amazon.admob.amazon(i12);
                c10664l4.purchase.admob.amazon(i12);
                i13 = 1073741824;
                if (mode == 1073741824) {
                    zM2937catch = c10664l.m2937catch(i12, zBilling);
                    i7 = 1;
                } else {
                    i7 = 0;
                    zM2937catch = true;
                }
                if (mode2 == 1073741824) {
                    zM2937catch &= c10664l.m2937catch(1, zBilling);
                    i7++;
                }
            }
            if (zM2937catch) {
                c10664l.mo2940private(mode == i13, mode2 == i13);
            }
        } else {
            z2 = z9;
            c16827l = c16827l4;
            i7 = 0;
            zM2937catch = false;
        }
        if (zM2937catch && i7 == 2) {
            return;
        }
        int i30 = c10664l.f21649l;
        if (i5 > 0) {
            int size4 = c10664l.f21654return.size();
            boolean zM2941switch = c10664l.m2941switch(64);
            C16827l c16827l5 = c10664l.f21650l;
            int i31 = 0;
            while (i31 < size4) {
                C11338l c11338l4 = (C11338l) c10664l.f21654return.get(i31);
                if ((c11338l4 instanceof C10526l) || (c11338l4 instanceof C0051l)) {
                    i11 = size4;
                } else {
                    c11338l4.getClass();
                    if (zM2941switch && (c8431l = c11338l4.amazon) != null && (c3490l = c11338l4.purchase) != null && c8431l.purchase.isPro && c3490l.purchase.isPro) {
                        i11 = size4;
                    } else {
                        int iAdmob3 = c11338l4.admob(0);
                        int iAdmob4 = c11338l4.admob(1);
                        i11 = size4;
                        boolean z10 = iAdmob3 == 3 && c11338l4.ads != 1 && iAdmob4 == 3 && c11338l4.subscription != 1;
                        if (!z10 && c10664l.m2941switch(1)) {
                            if (iAdmob3 == 3 && c11338l4.ads == 0 && iAdmob4 != 3 && !c11338l4.license()) {
                                z10 = true;
                            }
                            if (iAdmob4 == 3 && c11338l4.subscription == 0 && iAdmob3 != 3 && !c11338l4.license()) {
                                z10 = true;
                            }
                            if ((iAdmob3 == 3 || iAdmob4 == 3) && c11338l4.f22856interface > 0.0f) {
                                z10 = true;
                            }
                        }
                        if (!z10) {
                            c18449l.m4536case(0, c16827l5, c11338l4);
                        }
                    }
                }
                i31++;
                size4 = i11;
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) c16827l5.mopub;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList3 = constraintLayout.f345l;
            for (int i32 = 0; i32 < childCount2; i32++) {
                constraintLayout.getChildAt(i32);
            }
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i33 = 0; i33 < size5; i33++) {
                    ((AbstractC17322l) arrayList3.get(i33)).getClass();
                }
            }
        }
        c18449l.m4535break(c10664l);
        int size6 = arrayList.size();
        int i34 = 0;
        if (i5 > 0) {
            c18449l.m4546instanceof(c10664l, 0, iMetrica2, iSubs);
        }
        if (size6 > 0) {
            int[] iArr4 = c10664l.f22844const;
            boolean z11 = iArr4[0] == 2;
            boolean z12 = iArr4[1] == 2;
            int iMax7 = Math.max(c10664l.metrica(), c10664l2.f22852goto);
            int iMax8 = Math.max(c10664l.subs(), c10664l2.f22865super);
            for (int i35 = 0; i35 < size6; i35++) {
            }
            int i36 = 0;
            while (i36 < 2) {
                int i37 = i34;
                int i38 = i37;
                while (i37 < size6) {
                    C11338l c11338l5 = (C11338l) arrayList.get(i37);
                    if ((c11338l5 instanceof C0051l) || (c11338l5 instanceof C10526l)) {
                        i8 = size6;
                    } else {
                        i8 = size6;
                        if (c11338l5.f22862public != 8 && (!z2 || !c11338l5.amazon.purchase.isPro || !c11338l5.purchase.purchase.isPro)) {
                            int iMetrica6 = c11338l5.metrica();
                            int iSubs7 = c11338l5.subs();
                            z3 = z12;
                            int i39 = c11338l5.f22858new;
                            z4 = z11;
                            int i40 = i36 == 1 ? 2 : 1;
                            i9 = i36;
                            c16827l2 = c16827l;
                            int i41 = (c18449l.m4536case(i40, c16827l2, c11338l5) ? 1 : 0) | i38;
                            int iMetrica7 = c11338l5.metrica();
                            int i42 = i41;
                            int iSubs8 = c11338l5.subs();
                            if (iMetrica7 != iMetrica6) {
                                c11338l5.m3059native(iMetrica7);
                                if (z4 && c11338l5.startapp() + c11338l5.f22845continue > iMax7) {
                                    iMax7 = Math.max(iMax7, c11338l5.mopub(4).amazon() + c11338l5.startapp() + c11338l5.f22845continue);
                                }
                                i42 = 1;
                            }
                            if (iSubs8 != iSubs7) {
                                c11338l5.m3062synchronized(iSubs8);
                                if (z3 && c11338l5.adcel() + c11338l5.f22843class > iMax8) {
                                    iMax8 = Math.max(iMax8, c11338l5.mopub(5).amazon() + c11338l5.adcel() + c11338l5.f22843class);
                                }
                                i10 = 1;
                            } else {
                                i10 = i42;
                            }
                            if (c11338l5.inmobi && i39 != c11338l5.f22858new) {
                                i10 = 1;
                            }
                        }
                        i37++;
                        size6 = i8;
                        z12 = z3;
                        c16827l = c16827l2;
                        i38 = i10;
                        z11 = z4;
                        i36 = i9;
                    }
                    z3 = z12;
                    z4 = z11;
                    i9 = i36;
                    i10 = i38;
                    c16827l2 = c16827l;
                    i37++;
                    size6 = i8;
                    z12 = z3;
                    c16827l = c16827l2;
                    i38 = i10;
                    z11 = z4;
                    i36 = i9;
                }
                int i43 = size6;
                boolean z13 = z12;
                boolean z14 = z11;
                int i44 = i36;
                C16827l c16827l6 = c16827l;
                if (i38 == 0) {
                    break;
                }
                int i45 = i44 + 1;
                c18449l.m4546instanceof(c10664l, i45, iMetrica2, iSubs);
                z12 = z13;
                c16827l = c16827l6;
                z11 = z14;
                i34 = 0;
                i36 = i45;
                size6 = i43;
            }
        }
        c10664l.f21649l = i30;
        C4847l.adcel = c10664l.m2941switch(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f344l = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return yandex();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C8950l c8950l = new C8950l(context, attributeSet);
        c8950l.yandex = -1;
        c8950l.loadAd = -1;
        c8950l.crashlytics = -1.0f;
        c8950l.amazon = true;
        c8950l.purchase = -1;
        c8950l.billing = -1;
        c8950l.mopub = -1;
        c8950l.admob = -1;
        c8950l.subs = -1;
        c8950l.isPro = -1;
        c8950l.firebase = -1;
        c8950l.smaato = -1;
        c8950l.remoteconfig = -1;
        c8950l.vip = -1;
        c8950l.metrica = -1;
        c8950l.startapp = -1;
        c8950l.adcel = 0;
        c8950l.ads = 0.0f;
        c8950l.subscription = -1;
        c8950l.tapsense = -1;
        c8950l.Signature = -1;
        c8950l.license = -1;
        c8950l.pro = RecyclerView.UNDEFINED_DURATION;
        c8950l.ad = RecyclerView.UNDEFINED_DURATION;
        c8950l.advert = RecyclerView.UNDEFINED_DURATION;
        c8950l.isVip = RecyclerView.UNDEFINED_DURATION;
        c8950l.signatures = RecyclerView.UNDEFINED_DURATION;
        c8950l.premium = RecyclerView.UNDEFINED_DURATION;
        c8950l.applovin = RecyclerView.UNDEFINED_DURATION;
        c8950l.appmetrica = 0;
        c8950l.inmobi = 0.5f;
        c8950l.f18461throws = 0.5f;
        c8950l.f18449package = null;
        c8950l.f18458synchronized = -1.0f;
        c8950l.f18455strictfp = -1.0f;
        c8950l.f18464volatile = 0;
        c8950l.f18447native = 0;
        c8950l.f18450private = 0;
        c8950l.f18438extends = 0;
        c8950l.f18441for = 0;
        c8950l.f18460throw = 0;
        c8950l.f18432catch = 0;
        c8950l.f18437else = 0;
        c8950l.f18431case = 1.0f;
        c8950l.f18457switch = 1.0f;
        c8950l.f18435continue = -1;
        c8950l.f18433class = -1;
        c8950l.f18446interface = -1;
        c8950l.f18454static = false;
        c8950l.f18436default = false;
        c8950l.f18439final = null;
        c8950l.f18448new = 0;
        c8950l.f18442goto = true;
        c8950l.f18456super = true;
        c8950l.f18444import = false;
        c8950l.f18429abstract = false;
        c8950l.f18445instanceof = false;
        c8950l.f18452public = -1;
        c8950l.f18440finally = -1;
        c8950l.f18459this = -1;
        c8950l.f18463try = -1;
        c8950l.f18430break = RecyclerView.UNDEFINED_DURATION;
        c8950l.f18462transient = RecyclerView.UNDEFINED_DURATION;
        c8950l.f18451protected = 0.5f;
        c8950l.f18453return = new C11338l();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4914l.loadAd);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = AbstractC5731l.yandex.get(index);
            switch (i2) {
                case 1:
                    c8950l.f18446interface = typedArrayObtainStyledAttributes.getInt(index, c8950l.f18446interface);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c8950l.startapp);
                    c8950l.startapp = resourceId;
                    if (resourceId == -1) {
                        c8950l.startapp = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    c8950l.adcel = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8950l.adcel);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, c8950l.ads) % 360.0f;
                    c8950l.ads = f;
                    if (f < 0.0f) {
                        c8950l.ads = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    c8950l.yandex = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c8950l.yandex);
                    break;
                case 6:
                    c8950l.loadAd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c8950l.loadAd);
                    break;
                case 7:
                    c8950l.crashlytics = typedArrayObtainStyledAttributes.getFloat(index, c8950l.crashlytics);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c8950l.purchase);
                    c8950l.purchase = resourceId2;
                    if (resourceId2 == -1) {
                        c8950l.purchase = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c8950l.billing);
                    c8950l.billing = resourceId3;
                    if (resourceId3 == -1) {
                        c8950l.billing = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c8950l.mopub);
                    c8950l.mopub = resourceId4;
                    if (resourceId4 == -1) {
                        c8950l.mopub = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c8950l.admob);
                    c8950l.admob = resourceId5;
                    if (resourceId5 == -1) {
                        c8950l.admob = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c8950l.subs);
                    c8950l.subs = resourceId6;
                    if (resourceId6 == -1) {
                        c8950l.subs = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c8950l.isPro);
                    c8950l.isPro = resourceId7;
                    if (resourceId7 == -1) {
                        c8950l.isPro = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c8950l.firebase);
                    c8950l.firebase = resourceId8;
                    if (resourceId8 == -1) {
                        c8950l.firebase = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c8950l.smaato);
                    c8950l.smaato = resourceId9;
                    if (resourceId9 == -1) {
                        c8950l.smaato = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c8950l.remoteconfig);
                    c8950l.remoteconfig = resourceId10;
                    if (resourceId10 == -1) {
                        c8950l.remoteconfig = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c8950l.subscription);
                    c8950l.subscription = resourceId11;
                    if (resourceId11 == -1) {
                        c8950l.subscription = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c8950l.tapsense);
                    c8950l.tapsense = resourceId12;
                    if (resourceId12 == -1) {
                        c8950l.tapsense = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c8950l.Signature);
                    c8950l.Signature = resourceId13;
                    if (resourceId13 == -1) {
                        c8950l.Signature = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c8950l.license);
                    c8950l.license = resourceId14;
                    if (resourceId14 == -1) {
                        c8950l.license = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    c8950l.pro = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8950l.pro);
                    break;
                case 22:
                    c8950l.ad = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8950l.ad);
                    break;
                case 23:
                    c8950l.advert = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8950l.advert);
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    c8950l.isVip = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8950l.isVip);
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    c8950l.signatures = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8950l.signatures);
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    c8950l.premium = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8950l.premium);
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    c8950l.f18454static = typedArrayObtainStyledAttributes.getBoolean(index, c8950l.f18454static);
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    c8950l.f18436default = typedArrayObtainStyledAttributes.getBoolean(index, c8950l.f18436default);
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    c8950l.inmobi = typedArrayObtainStyledAttributes.getFloat(index, c8950l.inmobi);
                    break;
                case 30:
                    c8950l.f18461throws = typedArrayObtainStyledAttributes.getFloat(index, c8950l.f18461throws);
                    break;
                case 31:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c8950l.f18450private = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c8950l.f18438extends = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    try {
                        c8950l.f18441for = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8950l.f18441for);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c8950l.f18441for) == -2) {
                            c8950l.f18441for = -2;
                        }
                    }
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    try {
                        c8950l.f18432catch = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8950l.f18432catch);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c8950l.f18432catch) == -2) {
                            c8950l.f18432catch = -2;
                        }
                    }
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    c8950l.f18431case = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c8950l.f18431case));
                    c8950l.f18450private = 2;
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    try {
                        c8950l.f18460throw = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8950l.f18460throw);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c8950l.f18460throw) == -2) {
                            c8950l.f18460throw = -2;
                        }
                    }
                    break;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    try {
                        c8950l.f18437else = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8950l.f18437else);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c8950l.f18437else) == -2) {
                            c8950l.f18437else = -2;
                        }
                    }
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    c8950l.f18457switch = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c8950l.f18457switch));
                    c8950l.f18438extends = 2;
                    break;
                default:
                    switch (i2) {
                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                            C4759l.mopub(c8950l, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                            c8950l.f18458synchronized = typedArrayObtainStyledAttributes.getFloat(index, c8950l.f18458synchronized);
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                            c8950l.f18455strictfp = typedArrayObtainStyledAttributes.getFloat(index, c8950l.f18455strictfp);
                            break;
                        case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                            c8950l.f18464volatile = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c8950l.f18447native = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                            c8950l.f18435continue = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c8950l.f18435continue);
                            break;
                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                            c8950l.f18433class = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c8950l.f18433class);
                            break;
                        case 51:
                            c8950l.f18439final = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, c8950l.vip);
                            c8950l.vip = resourceId15;
                            if (resourceId15 == -1) {
                                c8950l.vip = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, c8950l.metrica);
                            c8950l.metrica = resourceId16;
                            if (resourceId16 == -1) {
                                c8950l.metrica = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            c8950l.appmetrica = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8950l.appmetrica);
                            break;
                        case 55:
                            c8950l.applovin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8950l.applovin);
                            break;
                        default:
                            switch (i2) {
                                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                                    C4759l.billing(c8950l, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    C4759l.billing(c8950l, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c8950l.f18448new = typedArrayObtainStyledAttributes.getInt(index, c8950l.f18448new);
                                    break;
                                case 67:
                                    c8950l.amazon = typedArrayObtainStyledAttributes.getBoolean(index, c8950l.amazon);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c8950l.yandex();
        return c8950l;
    }

    public int getMaxHeight() {
        return this.f343l;
    }

    public int getMaxWidth() {
        return this.f353l;
    }

    public int getMinHeight() {
        return this.f349l;
    }

    public int getMinWidth() {
        return this.f350l;
    }

    public int getOptimizationLevel() {
        return this.f342l.f21649l;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C10664l c10664l = this.f342l;
        if (c10664l.isPro == null) {
            int id2 = getId();
            if (id2 != -1) {
                c10664l.isPro = getContext().getResources().getResourceEntryName(id2);
            } else {
                c10664l.isPro = "parent";
            }
        }
        if (c10664l.f22850finally == null) {
            c10664l.f22850finally = c10664l.isPro;
            Log.v("ConstraintLayout", " setDebugName " + c10664l.f22850finally);
        }
        for (C11338l c11338l : c10664l.f21654return) {
            View view = c11338l.f22855instanceof;
            if (view != null) {
                if (c11338l.isPro == null && (id = view.getId()) != -1) {
                    c11338l.isPro = getContext().getResources().getResourceEntryName(id);
                }
                if (c11338l.f22850finally == null) {
                    c11338l.f22850finally = c11338l.isPro;
                    Log.v("ConstraintLayout", " setDebugName " + c11338l.f22850finally);
                }
            }
        }
        c10664l.smaato(sb);
        return sb.toString();
    }

    public final void isPro(int i) {
        String str;
        Context context = getContext();
        C10023l c10023l = new C10023l();
        c10023l.f20419l = new SparseArray();
        c10023l.f20418l = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            C5601l c5601l = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c10023l.m2829package(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                C5601l c5601l2 = new C5601l(context, xml);
                                ((SparseArray) c10023l.f20419l).put(c5601l2.f11897l, c5601l2);
                                c5601l = c5601l2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                C16573l c16573l = new C16573l(context, xml);
                                if (c5601l != null) {
                                    ((ArrayList) c5601l.f11899l).add(c16573l);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e2);
        }
        this.f354l = c10023l;
    }

    public final C11338l loadAd(View view) {
        if (view == this) {
            return this.f342l;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C8950l) {
            return ((C8950l) view.getLayoutParams()).f18453return;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C8950l) {
            return ((C8950l) view.getLayoutParams()).f18453return;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C8950l c8950l = (C8950l) childAt.getLayoutParams();
            C11338l c11338l = c8950l.f18453return;
            if (childAt.getVisibility() != 8 || c8950l.f18429abstract || c8950l.f18445instanceof || zIsInEditMode) {
                int iStartapp = c11338l.startapp();
                int iAdcel = c11338l.adcel();
                childAt.layout(iStartapp, iAdcel, c11338l.metrica() + iStartapp, c11338l.subs() + iAdcel);
            }
        }
        ArrayList arrayList = this.f345l;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC17322l) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:240:0x0638  */
    /* JADX WARN: Code duplicated, block: B:295:0x0756  */
    /* JADX WARN: Code duplicated, block: B:297:0x075f  */
    /* JADX WARN: Code duplicated, block: B:300:0x0769  */
    /* JADX WARN: Code duplicated, block: B:307:0x0782  */
    /* JADX WARN: Code duplicated, block: B:309:0x078b  */
    /* JADX WARN: Code duplicated, block: B:310:0x0797  */
    /* JADX WARN: Code duplicated, block: B:312:0x079e  */
    /* JADX WARN: Code duplicated, block: B:317:0x07be  */
    /* JADX WARN: Code duplicated, block: B:320:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:322:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:325:0x07da  */
    /* JADX WARN: Code duplicated, block: B:332:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:333:0x0807  */
    /* JADX WARN: Code duplicated, block: B:335:0x080e  */
    /* JADX WARN: Code duplicated, block: B:336:0x0817  */
    /* JADX WARN: Code duplicated, block: B:338:0x081f  */
    /* JADX WARN: Code duplicated, block: B:341:0x0827  */
    /* JADX WARN: Code duplicated, block: B:344:0x082f  */
    /* JADX WARN: Code duplicated, block: B:416:0x0953  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        C10664l c10664l;
        boolean z;
        boolean z2;
        SparseArray sparseArray;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        C11338l c11338l;
        int i7;
        int i8;
        int i9;
        int i10;
        C11338l c11338l2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        C11338l c11338l3;
        int i17;
        int i18;
        int i19;
        C11338l c11338l4;
        float f2;
        int i20;
        int i21;
        C11338l c11338l5;
        int i22;
        int i23;
        int i24;
        int i25;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        float f3;
        C11338l c11338l6;
        C11338l c11338l7;
        int i26;
        C11338l c11338l8;
        int i27;
        int i28;
        int i29;
        float fAbs;
        SparseArray sparseArray2;
        String str;
        int iAmazon;
        boolean z4;
        int i30;
        SparseArray sparseArray3;
        C4759l c4759l;
        HashSet hashSet;
        C10664l c10664l2;
        boolean z5;
        boolean z6;
        int i31;
        C10664l c10664l3;
        String resourceEntryName;
        int i32;
        C11338l c11338l9;
        ConstraintLayout constraintLayout3 = this;
        boolean z7 = constraintLayout3.f344l;
        constraintLayout3.f344l = z7;
        int i33 = 0;
        if (!z7) {
            int childCount = constraintLayout3.getChildCount();
            for (int i34 = 0; i34 < childCount; i34++) {
                if (constraintLayout3.getChildAt(i34).isLayoutRequested()) {
                    constraintLayout3.f344l = true;
                    break;
                }
            }
        }
        boolean z8 = (constraintLayout3.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout3.getLayoutDirection();
        C10664l c10664l4 = constraintLayout3.f342l;
        c10664l4.f21637l = z8;
        if (constraintLayout3.f344l) {
            constraintLayout3.f344l = false;
            int childCount2 = constraintLayout3.getChildCount();
            int i35 = 0;
            while (true) {
                if (i35 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (constraintLayout3.getChildAt(i35).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i35++;
                }
            }
            if (z) {
                boolean zIsInEditMode = constraintLayout3.isInEditMode();
                int childCount3 = constraintLayout3.getChildCount();
                for (int i36 = 0; i36 < childCount3; i36++) {
                    C11338l c11338lLoadAd = constraintLayout3.loadAd(constraintLayout3.getChildAt(i36));
                    if (c11338lLoadAd != null) {
                        c11338lLoadAd.signatures();
                    }
                }
                SparseArray sparseArray4 = constraintLayout3.f346l;
                if (zIsInEditMode) {
                    int i37 = 0;
                    while (i37 < childCount3) {
                        View childAt = constraintLayout3.getChildAt(i37);
                        try {
                            String resourceName = constraintLayout3.getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if ((resourceName != null ? 1 : i33) != 0) {
                                if (constraintLayout3.f341l == null) {
                                    constraintLayout3.f341l = new HashMap();
                                }
                                int iIndexOf = resourceName.indexOf("/");
                                i32 = i33;
                                try {
                                    constraintLayout3.f341l.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                i32 = i33;
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) sparseArray4.get(id);
                                if (viewFindViewById == null && (viewFindViewById = constraintLayout3.findViewById(id)) != null && viewFindViewById != constraintLayout3 && viewFindViewById.getParent() == constraintLayout3) {
                                    constraintLayout3.onViewAdded(viewFindViewById);
                                }
                                c11338l9 = viewFindViewById == constraintLayout3 ? c10664l4 : viewFindViewById == null ? null : ((C8950l) viewFindViewById.getLayoutParams()).f18453return;
                            }
                            c11338l9.f22850finally = resourceName;
                        } catch (Resources.NotFoundException unused2) {
                            i32 = i33;
                        }
                        i37++;
                        i33 = i32;
                    }
                }
                int i38 = i33;
                if (constraintLayout3.f351l != -1) {
                    for (int i39 = i38; i39 < childCount3; i39++) {
                        constraintLayout3.getChildAt(i39).getId();
                    }
                }
                C4759l c4759l2 = constraintLayout3.f347l;
                if (c4759l2 != null) {
                    int childCount4 = constraintLayout3.getChildCount();
                    HashMap map = c4759l2.crashlytics;
                    HashSet<Integer> hashSet2 = new HashSet(map.keySet());
                    int i40 = i38;
                    while (i40 < childCount4) {
                        View childAt2 = constraintLayout3.getChildAt(i40);
                        int id2 = childAt2.getId();
                        int i41 = i40;
                        if (map.containsKey(Integer.valueOf(id2))) {
                            if (c4759l2.loadAd) {
                                i30 = -1;
                                if (id2 == -1) {
                                    z4 = z;
                                    C18073l.license("All children of ConstraintLayout must have ids to use ConstraintSet");
                                    return;
                                }
                            } else {
                                z4 = z;
                                i30 = -1;
                            }
                            if (id2 != i30) {
                                if (map.containsKey(Integer.valueOf(id2))) {
                                    hashSet2.remove(Integer.valueOf(id2));
                                    C5609l c5609l = (C5609l) map.get(Integer.valueOf(id2));
                                    if (c5609l != null) {
                                        C1235l c1235l = c5609l.loadAd;
                                        c4759l = c4759l2;
                                        C4298l c4298l = c5609l.amazon;
                                        hashSet = hashSet2;
                                        C3330l c3330l = c5609l.purchase;
                                        z5 = z4;
                                        if (childAt2 instanceof C18254l) {
                                            c4298l.f8819this = 1;
                                            C18254l c18254l = (C18254l) childAt2;
                                            c18254l.setId(id2);
                                            c18254l.setType(c4298l.f8813public);
                                            c18254l.setMargin(c4298l.f8801finally);
                                            c18254l.setAllowsGoneWidget(c4298l.f8804implements);
                                            int[] iArr = c4298l.f8823try;
                                            if (iArr != null) {
                                                c18254l.setReferencedIds(iArr);
                                            } else {
                                                String str2 = c4298l.f8791break;
                                                if (str2 != null) {
                                                    int[] iArrLoadAd = C4759l.loadAd(c18254l, str2);
                                                    c4298l.f8823try = iArrLoadAd;
                                                    c18254l.setReferencedIds(iArrLoadAd);
                                                }
                                            }
                                        }
                                        C8950l c8950l = (C8950l) childAt2.getLayoutParams();
                                        c8950l.yandex();
                                        c5609l.yandex(c8950l);
                                        HashMap map2 = c5609l.billing;
                                        z6 = zIsInEditMode;
                                        Class<?> cls = childAt2.getClass();
                                        for (String str3 : map2.keySet()) {
                                            int i42 = childCount3;
                                            C16420l c16420l = (C16420l) map2.get(str3);
                                            HashMap map3 = map2;
                                            String strStartapp = !c16420l.yandex ? AbstractC14814l.startapp("set", str3) : str3;
                                            SparseArray sparseArray5 = sparseArray4;
                                            try {
                                                int iInmobi = AbstractC5020l.inmobi(c16420l.loadAd);
                                                Class<?> cls2 = Float.TYPE;
                                                Class<?> cls3 = Integer.TYPE;
                                                switch (iInmobi) {
                                                    case 0:
                                                        c10664l3 = c10664l4;
                                                        Class<?>[] clsArr = new Class[1];
                                                        clsArr[i38] = cls3;
                                                        Method method = cls.getMethod(strStartapp, clsArr);
                                                        Integer numValueOf2 = Integer.valueOf(c16420l.crashlytics);
                                                        Object[] objArr = new Object[1];
                                                        objArr[i38] = numValueOf2;
                                                        method.invoke(childAt2, objArr);
                                                        break;
                                                    case 1:
                                                        c10664l3 = c10664l4;
                                                        Class<?>[] clsArr2 = new Class[1];
                                                        clsArr2[i38] = cls2;
                                                        Method method2 = cls.getMethod(strStartapp, clsArr2);
                                                        Float fValueOf = Float.valueOf(c16420l.amazon);
                                                        Object[] objArr2 = new Object[1];
                                                        objArr2[i38] = fValueOf;
                                                        method2.invoke(childAt2, objArr2);
                                                        break;
                                                    case 2:
                                                        c10664l3 = c10664l4;
                                                        Class<?>[] clsArr3 = new Class[1];
                                                        clsArr3[i38] = cls3;
                                                        Method method3 = cls.getMethod(strStartapp, clsArr3);
                                                        Integer numValueOf3 = Integer.valueOf(c16420l.mopub);
                                                        Object[] objArr3 = new Object[1];
                                                        objArr3[i38] = numValueOf3;
                                                        method3.invoke(childAt2, objArr3);
                                                        break;
                                                    case 3:
                                                        c10664l3 = c10664l4;
                                                        Class<?>[] clsArr4 = new Class[1];
                                                        clsArr4[i38] = Drawable.class;
                                                        Method method4 = cls.getMethod(strStartapp, clsArr4);
                                                        ColorDrawable colorDrawable = new ColorDrawable();
                                                        colorDrawable.setColor(c16420l.mopub);
                                                        Object[] objArr4 = new Object[1];
                                                        objArr4[i38] = colorDrawable;
                                                        method4.invoke(childAt2, objArr4);
                                                        break;
                                                    case 4:
                                                        c10664l3 = c10664l4;
                                                        Class<?>[] clsArr5 = new Class[1];
                                                        clsArr5[i38] = CharSequence.class;
                                                        Method method5 = cls.getMethod(strStartapp, clsArr5);
                                                        String str4 = c16420l.purchase;
                                                        Object[] objArr5 = new Object[1];
                                                        objArr5[i38] = str4;
                                                        method5.invoke(childAt2, objArr5);
                                                        break;
                                                    case 5:
                                                        c10664l3 = c10664l4;
                                                        Class<?>[] clsArr6 = new Class[1];
                                                        clsArr6[i38] = Boolean.TYPE;
                                                        Method method6 = cls.getMethod(strStartapp, clsArr6);
                                                        Boolean boolValueOf = Boolean.valueOf(c16420l.billing);
                                                        Object[] objArr6 = new Object[1];
                                                        objArr6[i38] = boolValueOf;
                                                        method6.invoke(childAt2, objArr6);
                                                        break;
                                                    case 6:
                                                        c10664l3 = c10664l4;
                                                        Class<?>[] clsArr7 = new Class[1];
                                                        clsArr7[i38] = cls2;
                                                        Method method7 = cls.getMethod(strStartapp, clsArr7);
                                                        Float fValueOf2 = Float.valueOf(c16420l.amazon);
                                                        Object[] objArr7 = new Object[1];
                                                        objArr7[i38] = fValueOf2;
                                                        method7.invoke(childAt2, objArr7);
                                                        break;
                                                    case 7:
                                                        c10664l3 = c10664l4;
                                                        try {
                                                            Class<?>[] clsArr8 = new Class[1];
                                                            clsArr8[i38] = cls3;
                                                            Method method8 = cls.getMethod(strStartapp, clsArr8);
                                                            Integer numValueOf4 = Integer.valueOf(c16420l.crashlytics);
                                                            Object[] objArr8 = new Object[1];
                                                            objArr8[i38] = numValueOf4;
                                                            method8.invoke(childAt2, objArr8);
                                                        } catch (IllegalAccessException e) {
                                                            e = e;
                                                            StringBuilder sbIsVip = AbstractC5020l.isVip(" Custom Attribute \"", str3, "\" not found on ");
                                                            sbIsVip.append(cls.getName());
                                                            Log.e("TransitionLayout", sbIsVip.toString(), e);
                                                        } catch (NoSuchMethodException e2) {
                                                            e = e2;
                                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + strStartapp, e);
                                                        } catch (InvocationTargetException e3) {
                                                            e = e3;
                                                            StringBuilder sbIsVip2 = AbstractC5020l.isVip(" Custom Attribute \"", str3, "\" not found on ");
                                                            sbIsVip2.append(cls.getName());
                                                            Log.e("TransitionLayout", sbIsVip2.toString(), e);
                                                        }
                                                        break;
                                                    default:
                                                        c10664l3 = c10664l4;
                                                        break;
                                                }
                                            } catch (IllegalAccessException e4) {
                                                e = e4;
                                                c10664l3 = c10664l4;
                                            } catch (NoSuchMethodException e5) {
                                                e = e5;
                                                c10664l3 = c10664l4;
                                            } catch (InvocationTargetException e6) {
                                                e = e6;
                                                c10664l3 = c10664l4;
                                            }
                                            childCount3 = i42;
                                            map2 = map3;
                                            sparseArray4 = sparseArray5;
                                            c10664l4 = c10664l3;
                                        }
                                        sparseArray3 = sparseArray4;
                                        c10664l2 = c10664l4;
                                        i31 = childCount3;
                                        childAt2.setLayoutParams(c8950l);
                                        if (c1235l.loadAd == 0) {
                                            childAt2.setVisibility(c1235l.yandex);
                                        }
                                        childAt2.setAlpha(c1235l.crashlytics);
                                        childAt2.setRotation(c3330l.yandex);
                                        childAt2.setRotationX(c3330l.loadAd);
                                        childAt2.setRotationY(c3330l.crashlytics);
                                        childAt2.setScaleX(c3330l.amazon);
                                        childAt2.setScaleY(c3330l.purchase);
                                        if (c3330l.admob != -1) {
                                            View viewFindViewById2 = ((View) childAt2.getParent()).findViewById(c3330l.admob);
                                            if (viewFindViewById2 != null) {
                                                float bottom = (viewFindViewById2.getBottom() + viewFindViewById2.getTop()) / 2.0f;
                                                float right = (viewFindViewById2.getRight() + viewFindViewById2.getLeft()) / 2.0f;
                                                if (childAt2.getRight() - childAt2.getLeft() > 0 && childAt2.getBottom() - childAt2.getTop() > 0) {
                                                    float left = right - childAt2.getLeft();
                                                    float top = bottom - childAt2.getTop();
                                                    childAt2.setPivotX(left);
                                                    childAt2.setPivotY(top);
                                                }
                                            }
                                        } else {
                                            if (!Float.isNaN(c3330l.billing)) {
                                                childAt2.setPivotX(c3330l.billing);
                                            }
                                            if (!Float.isNaN(c3330l.mopub)) {
                                                childAt2.setPivotY(c3330l.mopub);
                                            }
                                        }
                                        childAt2.setTranslationX(c3330l.subs);
                                        childAt2.setTranslationY(c3330l.isPro);
                                        childAt2.setTranslationZ(c3330l.firebase);
                                        if (c3330l.smaato) {
                                            childAt2.setElevation(c3330l.remoteconfig);
                                        }
                                    }
                                } else {
                                    sparseArray3 = sparseArray4;
                                    c4759l = c4759l2;
                                    hashSet = hashSet2;
                                    c10664l2 = c10664l4;
                                    z5 = z4;
                                    z6 = zIsInEditMode;
                                    i31 = childCount3;
                                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                                }
                            }
                            i40 = i41 + 1;
                            c4759l2 = c4759l;
                            hashSet2 = hashSet;
                            z4 = z5;
                            zIsInEditMode = z6;
                            childCount3 = i31;
                            sparseArray4 = sparseArray3;
                            c10664l4 = c10664l2;
                        } else {
                            z4 = z;
                            StringBuilder sb = new StringBuilder("id unknown ");
                            try {
                                resourceEntryName = childAt2.getContext().getResources().getResourceEntryName(childAt2.getId());
                            } catch (Exception unused3) {
                                resourceEntryName = "UNKNOWN";
                            }
                            sb.append(resourceEntryName);
                            Log.w("ConstraintSet", sb.toString());
                        }
                        sparseArray3 = sparseArray4;
                        c4759l = c4759l2;
                        hashSet = hashSet2;
                        c10664l2 = c10664l4;
                        z5 = z4;
                        z6 = zIsInEditMode;
                        i31 = childCount3;
                        i40 = i41 + 1;
                        c4759l2 = c4759l;
                        hashSet2 = hashSet;
                        z4 = z5;
                        zIsInEditMode = z6;
                        childCount3 = i31;
                        sparseArray4 = sparseArray3;
                        c10664l4 = c10664l2;
                    }
                    z4 = z;
                    sparseArray = sparseArray4;
                    C10664l c10664l5 = c10664l4;
                    z2 = z4;
                    z3 = zIsInEditMode;
                    i3 = childCount3;
                    for (Integer num : hashSet2) {
                        C5609l c5609l2 = (C5609l) map.get(num);
                        if (c5609l2 != null) {
                            C4298l c4298l2 = c5609l2.amazon;
                            if (c4298l2.f8819this == 1) {
                                Context context = constraintLayout3.getContext();
                                C18254l c18254l2 = new C18254l(context);
                                c18254l2.f33629l = new int[32];
                                c18254l2.f33627l = new HashMap();
                                c18254l2.f33626l = context;
                                C0051l c0051l = new C0051l();
                                c0051l.f938return = new C11338l[4];
                                boolean z9 = i38;
                                c0051l.f937l = z9 ? 1 : 0;
                                c0051l.f934l = z9 ? 1 : 0;
                                c0051l.f936l = true;
                                c0051l.f935l = z9 ? 1 : 0;
                                c0051l.f933l = z9;
                                c18254l2.f35762l = c0051l;
                                c18254l2.f33631l = c0051l;
                                c18254l2.purchase();
                                c18254l2.setVisibility(8);
                                c18254l2.setId(num.intValue());
                                int[] iArr2 = c4298l2.f8823try;
                                if (iArr2 != null) {
                                    c18254l2.setReferencedIds(iArr2);
                                } else {
                                    String str5 = c4298l2.f8791break;
                                    if (str5 != null) {
                                        int[] iArrLoadAd2 = C4759l.loadAd(c18254l2, str5);
                                        c4298l2.f8823try = iArrLoadAd2;
                                        c18254l2.setReferencedIds(iArrLoadAd2);
                                    }
                                }
                                c18254l2.setType(c4298l2.f8813public);
                                c18254l2.setMargin(c4298l2.f8801finally);
                                C8950l c8950lYandex = yandex();
                                c18254l2.purchase();
                                c5609l2.yandex(c8950lYandex);
                                constraintLayout3.addView(c18254l2, c8950lYandex);
                            }
                            if (c4298l2.yandex) {
                                C12261l c12261l = new C12261l(constraintLayout3.getContext());
                                c12261l.setId(num.intValue());
                                C8950l c8950lYandex2 = yandex();
                                c5609l2.yandex(c8950lYandex2);
                                constraintLayout3.addView(c12261l, c8950lYandex2);
                            }
                            i38 = 0;
                        }
                    }
                    for (int i43 = 0; i43 < childCount4; i43++) {
                        constraintLayout3.getChildAt(i43);
                    }
                    c10664l = c10664l5;
                } else {
                    sparseArray = sparseArray4;
                    z2 = z;
                    z3 = zIsInEditMode;
                    i3 = childCount3;
                    c10664l = c10664l4;
                }
                c10664l.f21654return.clear();
                ArrayList arrayList = constraintLayout3.f345l;
                int size = arrayList.size();
                char c = 2;
                if (size > 0) {
                    int i44 = 0;
                    while (i44 < size) {
                        AbstractC17322l abstractC17322l = (AbstractC17322l) arrayList.get(i44);
                        HashMap map4 = abstractC17322l.f33627l;
                        if (abstractC17322l.isInEditMode()) {
                            abstractC17322l.setIds(abstractC17322l.f33630l);
                        }
                        C0051l c0051l2 = abstractC17322l.f33631l;
                        if (c0051l2 == null) {
                            sparseArray2 = sparseArray;
                        } else {
                            c0051l2.f937l = 0;
                            Arrays.fill(c0051l2.f938return, (Object) null);
                            int i45 = 0;
                            while (i45 < abstractC17322l.f33628l) {
                                int i46 = abstractC17322l.f33629l[i45];
                                SparseArray sparseArray6 = sparseArray;
                                View view = (View) sparseArray6.get(i46);
                                if (view == null && (iAmazon = abstractC17322l.amazon(constraintLayout3, (str = (String) map4.get(Integer.valueOf(i46))))) != 0) {
                                    abstractC17322l.f33629l[i45] = iAmazon;
                                    map4.put(Integer.valueOf(iAmazon), str);
                                    view = (View) sparseArray6.get(iAmazon);
                                }
                                if (view != null) {
                                    C0051l c0051l3 = abstractC17322l.f33631l;
                                    C11338l c11338lLoadAd2 = constraintLayout3.loadAd(view);
                                    c0051l3.getClass();
                                    if (c11338lLoadAd2 != c0051l3 && c11338lLoadAd2 != null) {
                                        int i47 = c0051l3.f937l + 1;
                                        C11338l[] c11338lArr = c0051l3.f938return;
                                        if (i47 > c11338lArr.length) {
                                            c0051l3.f938return = (C11338l[]) Arrays.copyOf(c11338lArr, c11338lArr.length * 2);
                                        }
                                        C11338l[] c11338lArr2 = c0051l3.f938return;
                                        int i48 = c0051l3.f937l;
                                        c11338lArr2[i48] = c11338lLoadAd2;
                                        c0051l3.f937l = i48 + 1;
                                    }
                                }
                                i45++;
                                sparseArray = sparseArray6;
                            }
                            sparseArray2 = sparseArray;
                            abstractC17322l.f33631l.getClass();
                        }
                        i44++;
                        sparseArray = sparseArray2;
                    }
                }
                int i49 = i3;
                for (int i50 = 0; i50 < i49; i50++) {
                    constraintLayout3.getChildAt(i50);
                }
                SparseArray sparseArray7 = constraintLayout3.f355l;
                sparseArray7.clear();
                sparseArray7.put(0, c10664l);
                sparseArray7.put(constraintLayout3.getId(), c10664l);
                for (int i51 = 0; i51 < i49; i51++) {
                    View childAt3 = constraintLayout3.getChildAt(i51);
                    sparseArray7.put(childAt3.getId(), constraintLayout3.loadAd(childAt3));
                }
                int i52 = 0;
                constraintLayout3 = constraintLayout3;
                while (i52 < i49) {
                    View childAt4 = constraintLayout3.getChildAt(i52);
                    C11338l c11338lLoadAd3 = constraintLayout3.loadAd(childAt4);
                    if (c11338lLoadAd3 != null) {
                        C8950l c8950l2 = (C8950l) childAt4.getLayoutParams();
                        c10664l.f21654return.add(c11338lLoadAd3);
                        C11338l c11338l10 = c11338lLoadAd3.f22866switch;
                        if (c11338l10 != null) {
                            ((C10664l) c11338l10).f21654return.remove(c11338lLoadAd3);
                            c11338lLoadAd3.signatures();
                        }
                        c11338lLoadAd3.f22866switch = c10664l;
                        c8950l2.yandex();
                        c11338lLoadAd3.f22862public = childAt4.getVisibility();
                        c11338lLoadAd3.f22855instanceof = childAt4;
                        if (childAt4 instanceof AbstractC17322l) {
                            boolean z10 = c10664l.f21637l;
                            C18254l c18254l3 = (C18254l) ((AbstractC17322l) childAt4);
                            int i53 = c18254l3.f35761l;
                            c18254l3.f35763l = i53;
                            if (z10) {
                                if (i53 == 5) {
                                    c18254l3.f35763l = 1;
                                } else if (i53 == 6) {
                                    c18254l3.f35763l = 0;
                                }
                            } else if (i53 == 5) {
                                c18254l3.f35763l = 0;
                            } else if (i53 == 6) {
                                c18254l3.f35763l = 1;
                            }
                            if (c11338lLoadAd3 instanceof C0051l) {
                                ((C0051l) c11338lLoadAd3).f934l = c18254l3.f35763l;
                            }
                        }
                        if (c8950l2.f18429abstract) {
                            C10526l c10526l = (C10526l) c11338lLoadAd3;
                            int i54 = c8950l2.f18465while;
                            int i55 = c8950l2.f18443implements;
                            float f4 = c8950l2.f18434const;
                            if (f4 != -1.0f) {
                                if (f4 > -1.0f) {
                                    c10526l.f21419return = f4;
                                    c10526l.f21418l = -1;
                                    c10526l.f21415l = -1;
                                }
                            } else if (i54 != -1) {
                                if (i54 > -1) {
                                    c10526l.f21419return = -1.0f;
                                    c10526l.f21418l = i54;
                                    c10526l.f21415l = -1;
                                }
                            } else if (i55 != -1 && i55 > -1) {
                                c10526l.f21419return = -1.0f;
                                c10526l.f21418l = -1;
                                c10526l.f21415l = i55;
                            }
                        } else {
                            int i56 = c8950l2.f18452public;
                            int i57 = c8950l2.f18440finally;
                            int i58 = c8950l2.f18459this;
                            int i59 = c8950l2.f18463try;
                            int i60 = c8950l2.f18430break;
                            int i61 = c8950l2.f18462transient;
                            float f5 = c8950l2.f18451protected;
                            int i62 = c8950l2.startapp;
                            if (i62 != -1) {
                                C11338l c11338l11 = (C11338l) sparseArray7.get(i62);
                                if (c11338l11 != null) {
                                    float f6 = c8950l2.ads;
                                    c11338lLoadAd3.tapsense(7, 7, c8950l2.adcel, 0, c11338l11);
                                    c11338lLoadAd3.appmetrica = f6;
                                }
                                c11338l5 = c11338lLoadAd3;
                                i21 = 4;
                                i22 = 2;
                                i16 = 5;
                                i24 = 3;
                                constraintLayout3 = constraintLayout3;
                            } else {
                                if (i56 != -1) {
                                    C11338l c11338l12 = (C11338l) sparseArray7.get(i56);
                                    if (c11338l12 != null) {
                                        i5 = i61;
                                        f = f5;
                                        i4 = i59;
                                        i6 = 2;
                                        c11338lLoadAd3.tapsense(2, 2, ((ViewGroup.MarginLayoutParams) c8950l2).leftMargin, i60, c11338l12);
                                    } else {
                                        i4 = i59;
                                        i5 = i61;
                                        f = f5;
                                        i6 = 2;
                                    }
                                } else {
                                    i4 = i59;
                                    i5 = i61;
                                    i6 = 2;
                                    if (i57 == -1 || (c11338l = (C11338l) sparseArray7.get(i57)) == null) {
                                        f = f5;
                                    } else {
                                        f = f5;
                                        c11338lLoadAd3.tapsense(2, 4, ((ViewGroup.MarginLayoutParams) c8950l2).leftMargin, i60, c11338l);
                                        i7 = 2;
                                        i8 = 4;
                                    }
                                    if (i58 != -1) {
                                        c11338l8 = (C11338l) sparseArray7.get(i58);
                                        if (c11338l8 != null) {
                                            c11338lLoadAd3.tapsense(i8, i7, ((ViewGroup.MarginLayoutParams) c8950l2).rightMargin, i5, c11338l8);
                                        }
                                        i9 = i7;
                                    } else {
                                        i9 = i7;
                                        i10 = i5;
                                        if (i4 != -1 && (c11338l2 = (C11338l) sparseArray7.get(i4)) != null) {
                                            c11338lLoadAd3.tapsense(i8, i8, ((ViewGroup.MarginLayoutParams) c8950l2).rightMargin, i10, c11338l2);
                                        }
                                    }
                                    i11 = i8;
                                    i12 = c8950l2.subs;
                                    if (i12 != -1) {
                                        c11338l7 = (C11338l) sparseArray7.get(i12);
                                        if (c11338l7 != null) {
                                            i26 = 3;
                                            c11338lLoadAd3.tapsense(3, 3, ((ViewGroup.MarginLayoutParams) c8950l2).topMargin, c8950l2.ad, c11338l7);
                                        } else {
                                            i26 = 3;
                                        }
                                        i15 = i26;
                                        i16 = 5;
                                        i14 = -1;
                                    } else {
                                        i13 = c8950l2.isPro;
                                        if (i13 != -1 || (c11338l3 = (C11338l) sparseArray7.get(i13)) == null) {
                                            i14 = -1;
                                            i15 = 3;
                                            i16 = 5;
                                        } else {
                                            i14 = -1;
                                            c11338lLoadAd3.tapsense(3, 5, ((ViewGroup.MarginLayoutParams) c8950l2).topMargin, c8950l2.ad, c11338l3);
                                            i15 = 3;
                                            i16 = 5;
                                        }
                                    }
                                    i17 = c8950l2.firebase;
                                    if (i17 != i14) {
                                        c11338l6 = (C11338l) sparseArray7.get(i17);
                                        if (c11338l6 != null) {
                                            c11338lLoadAd3.tapsense(i16, i15, ((ViewGroup.MarginLayoutParams) c8950l2).bottomMargin, c8950l2.isVip, c11338l6);
                                        }
                                        i18 = i15;
                                    } else {
                                        i18 = i15;
                                        i19 = c8950l2.smaato;
                                        if (i19 != i14 && (c11338l4 = (C11338l) sparseArray7.get(i19)) != null) {
                                            c11338lLoadAd3.tapsense(i16, i16, ((ViewGroup.MarginLayoutParams) c8950l2).bottomMargin, c8950l2.isVip, c11338l4);
                                        }
                                    }
                                    f2 = f;
                                    i20 = c8950l2.remoteconfig;
                                    if (i20 != -1) {
                                        i21 = i11;
                                        c11338l5 = c11338lLoadAd3;
                                        i22 = i9;
                                        constraintLayout3.smaato(c11338l5, c8950l2, sparseArray7, i20, 6);
                                        constraintLayout2 = this;
                                        i24 = i18;
                                    } else {
                                        i21 = i11;
                                        c11338l5 = c11338lLoadAd3;
                                        i22 = i9;
                                        i23 = c8950l2.vip;
                                        if (i23 != -1) {
                                            ConstraintLayout constraintLayout4 = this;
                                            int i63 = i18;
                                            constraintLayout4.smaato(c11338l5, c8950l2, sparseArray7, i23, i63);
                                            i24 = i63;
                                            constraintLayout2 = constraintLayout4;
                                        } else {
                                            i24 = i18;
                                            i25 = c8950l2.metrica;
                                            constraintLayout = this;
                                            if (i25 != -1) {
                                                constraintLayout2 = constraintLayout;
                                                constraintLayout.smaato(c11338l5, c8950l2, sparseArray7, i25, i16);
                                                constraintLayout2 = constraintLayout;
                                            }
                                        }
                                    }
                                    constraintLayout2 = constraintLayout;
                                    if (f2 >= 0.0f) {
                                        c11338l5.f22854import = f2;
                                    }
                                    f3 = c8950l2.f18461throws;
                                    constraintLayout3 = constraintLayout2;
                                    if (f3 >= 0.0f) {
                                        c11338l5.f22839abstract = f3;
                                    }
                                }
                                i7 = i6;
                                i8 = 4;
                                if (i58 != -1) {
                                    c11338l8 = (C11338l) sparseArray7.get(i58);
                                    if (c11338l8 != null) {
                                        c11338lLoadAd3.tapsense(i8, i7, ((ViewGroup.MarginLayoutParams) c8950l2).rightMargin, i5, c11338l8);
                                    }
                                    i9 = i7;
                                } else {
                                    i9 = i7;
                                    i10 = i5;
                                    if (i4 != -1) {
                                        c11338lLoadAd3.tapsense(i8, i8, ((ViewGroup.MarginLayoutParams) c8950l2).rightMargin, i10, c11338l2);
                                    }
                                }
                                i11 = i8;
                                i12 = c8950l2.subs;
                                if (i12 != -1) {
                                    c11338l7 = (C11338l) sparseArray7.get(i12);
                                    if (c11338l7 != null) {
                                        i26 = 3;
                                        c11338lLoadAd3.tapsense(3, 3, ((ViewGroup.MarginLayoutParams) c8950l2).topMargin, c8950l2.ad, c11338l7);
                                    } else {
                                        i26 = 3;
                                    }
                                    i15 = i26;
                                    i16 = 5;
                                    i14 = -1;
                                } else {
                                    i13 = c8950l2.isPro;
                                    if (i13 != -1) {
                                        i14 = -1;
                                        i15 = 3;
                                        i16 = 5;
                                    } else {
                                        i14 = -1;
                                        i15 = 3;
                                        i16 = 5;
                                    }
                                }
                                i17 = c8950l2.firebase;
                                if (i17 != i14) {
                                    c11338l6 = (C11338l) sparseArray7.get(i17);
                                    if (c11338l6 != null) {
                                        c11338lLoadAd3.tapsense(i16, i15, ((ViewGroup.MarginLayoutParams) c8950l2).bottomMargin, c8950l2.isVip, c11338l6);
                                    }
                                    i18 = i15;
                                } else {
                                    i18 = i15;
                                    i19 = c8950l2.smaato;
                                    if (i19 != i14) {
                                        c11338lLoadAd3.tapsense(i16, i16, ((ViewGroup.MarginLayoutParams) c8950l2).bottomMargin, c8950l2.isVip, c11338l4);
                                    }
                                }
                                f2 = f;
                                i20 = c8950l2.remoteconfig;
                                if (i20 != -1) {
                                    i21 = i11;
                                    c11338l5 = c11338lLoadAd3;
                                    i22 = i9;
                                    constraintLayout3.smaato(c11338l5, c8950l2, sparseArray7, i20, 6);
                                    constraintLayout2 = this;
                                    i24 = i18;
                                } else {
                                    i21 = i11;
                                    c11338l5 = c11338lLoadAd3;
                                    i22 = i9;
                                    i23 = c8950l2.vip;
                                    if (i23 != -1) {
                                        ConstraintLayout constraintLayout5 = this;
                                        int i64 = i18;
                                        constraintLayout5.smaato(c11338l5, c8950l2, sparseArray7, i23, i64);
                                        i24 = i64;
                                        constraintLayout2 = constraintLayout5;
                                    } else {
                                        i24 = i18;
                                        i25 = c8950l2.metrica;
                                        constraintLayout = this;
                                        if (i25 != -1) {
                                            constraintLayout2 = constraintLayout;
                                            constraintLayout.smaato(c11338l5, c8950l2, sparseArray7, i25, i16);
                                            constraintLayout2 = constraintLayout;
                                        }
                                    }
                                }
                                constraintLayout2 = constraintLayout;
                                if (f2 >= 0.0f) {
                                    c11338l5.f22854import = f2;
                                }
                                f3 = c8950l2.f18461throws;
                                constraintLayout3 = constraintLayout2;
                                if (f3 >= 0.0f) {
                                    c11338l5.f22839abstract = f3;
                                }
                            }
                            if (z3) {
                                constraintLayout3 = constraintLayout2;
                                int i65 = c8950l2.f18435continue;
                                if (i65 != -1 || c8950l2.f18433class != -1) {
                                    int i66 = c8950l2.f18433class;
                                    c11338l5.f22846default = i65;
                                    c11338l5.f22849final = i66;
                                }
                            }
                            constraintLayout3 = constraintLayout2;
                            if (c8950l2.f18442goto) {
                                c11338l5.m3061strictfp(1);
                                c11338l5.m3059native(((ViewGroup.MarginLayoutParams) c8950l2).width);
                                if (((ViewGroup.MarginLayoutParams) c8950l2).width == -2) {
                                    c11338l5.m3061strictfp(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c8950l2).width == -1) {
                                if (c8950l2.f18454static) {
                                    c11338l5.m3061strictfp(3);
                                } else {
                                    c11338l5.m3061strictfp(4);
                                }
                                c11338l5.mopub(i22).mopub = ((ViewGroup.MarginLayoutParams) c8950l2).leftMargin;
                                c11338l5.mopub(i21).mopub = ((ViewGroup.MarginLayoutParams) c8950l2).rightMargin;
                            } else {
                                c11338l5.m3061strictfp(3);
                                c11338l5.m3059native(0);
                            }
                            if (c8950l2.f18456super) {
                                i27 = -1;
                                c11338l5.m3064volatile(1);
                                c11338l5.m3062synchronized(((ViewGroup.MarginLayoutParams) c8950l2).height);
                                if (((ViewGroup.MarginLayoutParams) c8950l2).height == -2) {
                                    c11338l5.m3064volatile(2);
                                }
                            } else {
                                i27 = -1;
                                if (((ViewGroup.MarginLayoutParams) c8950l2).height == -1) {
                                    if (c8950l2.f18436default) {
                                        c11338l5.m3064volatile(3);
                                    } else {
                                        c11338l5.m3064volatile(4);
                                    }
                                    c11338l5.mopub(i24).mopub = ((ViewGroup.MarginLayoutParams) c8950l2).topMargin;
                                    c11338l5.mopub(i16).mopub = ((ViewGroup.MarginLayoutParams) c8950l2).bottomMargin;
                                } else {
                                    c11338l5.m3064volatile(3);
                                    c11338l5.m3062synchronized(0);
                                }
                            }
                            String str6 = c8950l2.f18449package;
                            if (str6 == null || str6.length() == 0) {
                                c11338l5.f22856interface = 0.0f;
                            } else {
                                int length = str6.length();
                                int iIndexOf3 = str6.indexOf(44);
                                if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                    i28 = i27;
                                    i29 = 0;
                                } else {
                                    String strSubstring = str6.substring(0, iIndexOf3);
                                    i28 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : i27;
                                    i29 = iIndexOf3 + 1;
                                }
                                int iIndexOf4 = str6.indexOf(58);
                                if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                                    String strSubstring2 = str6.substring(i29);
                                    if (strSubstring2.length() > 0) {
                                        fAbs = Float.parseFloat(strSubstring2);
                                    } else {
                                        fAbs = 0.0f;
                                    }
                                } else {
                                    String strSubstring3 = str6.substring(i29, iIndexOf4);
                                    String strSubstring4 = str6.substring(iIndexOf4 + 1);
                                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                        fAbs = 0.0f;
                                    } else {
                                        try {
                                            float f7 = Float.parseFloat(strSubstring3);
                                            float f8 = Float.parseFloat(strSubstring4);
                                            if (f7 <= 0.0f || f8 <= 0.0f) {
                                                fAbs = 0.0f;
                                            } else {
                                                fAbs = i28 == 1 ? Math.abs(f8 / f7) : Math.abs(f7 / f8);
                                            }
                                        } catch (NumberFormatException unused4) {
                                        }
                                    }
                                }
                                if (fAbs > 0.0f) {
                                    c11338l5.f22856interface = fAbs;
                                    c11338l5.f22863static = i28;
                                }
                            }
                            float f9 = c8950l2.f18458synchronized;
                            float[] fArr = c11338l5.f22840break;
                            fArr[0] = f9;
                            fArr[1] = c8950l2.f18455strictfp;
                            c11338l5.f22868this = c8950l2.f18464volatile;
                            c11338l5.f22872try = c8950l2.f18447native;
                            int i67 = c8950l2.f18448new;
                            if (i67 >= 0 && i67 <= 3) {
                                c11338l5.adcel = i67;
                            }
                            int i68 = c8950l2.f18450private;
                            int i69 = c8950l2.f18441for;
                            int i70 = c8950l2.f18432catch;
                            float f10 = c8950l2.f18431case;
                            c11338l5.ads = i68;
                            c11338l5.Signature = i69;
                            if (i70 == Integer.MAX_VALUE) {
                                i70 = 0;
                            }
                            c11338l5.license = i70;
                            c11338l5.pro = f10;
                            if (f10 > 0.0f && f10 < 1.0f && i68 == 0) {
                                c11338l5.ads = 2;
                            }
                            int i71 = c8950l2.f18438extends;
                            int i72 = c8950l2.f18460throw;
                            int i73 = c8950l2.f18437else;
                            float f11 = c8950l2.f18457switch;
                            c11338l5.subscription = i71;
                            c11338l5.ad = i72;
                            if (i73 == Integer.MAX_VALUE) {
                                i73 = 0;
                            }
                            c11338l5.advert = i73;
                            c11338l5.isVip = f11;
                            if (f11 <= 0.0f || f11 >= 1.0f || i71 != 0) {
                                c = 2;
                            } else {
                                c = 2;
                                c11338l5.subscription = 2;
                            }
                        }
                    }
                    i52++;
                    c = c;
                    constraintLayout3 = constraintLayout3;
                }
            } else {
                c10664l = c10664l4;
                z2 = z;
            }
            if (z2) {
                c10664l.f21653l.m4535break(c10664l);
            }
        } else {
            c10664l = c10664l4;
        }
        c10664l.f21636l.getClass();
        constraintLayout3.firebase(c10664l, constraintLayout3.f352l, i, i2);
        int iMetrica = c10664l.metrica();
        int iSubs = c10664l.subs();
        boolean z11 = c10664l.f21634l;
        boolean z12 = c10664l.f21643l;
        C16827l c16827l = constraintLayout3.f348l;
        int i74 = c16827l.amazon;
        int iResolveSizeAndState = View.resolveSizeAndState(iMetrica + c16827l.crashlytics, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(iSubs + i74, i2, 0) & 16777215;
        int iMin = Math.min(constraintLayout3.f353l, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(constraintLayout3.f343l, iResolveSizeAndState2);
        if (z11) {
            iMin |= 16777216;
        }
        if (z12) {
            iMin2 |= 16777216;
        }
        constraintLayout3.setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C11338l c11338lLoadAd = loadAd(view);
        if ((view instanceof C12261l) && !(c11338lLoadAd instanceof C10526l)) {
            C8950l c8950l = (C8950l) view.getLayoutParams();
            C10526l c10526l = new C10526l();
            c8950l.f18453return = c10526l;
            c8950l.f18429abstract = true;
            c10526l.m2930throw(c8950l.f18446interface);
        }
        if (view instanceof AbstractC17322l) {
            AbstractC17322l abstractC17322l = (AbstractC17322l) view;
            abstractC17322l.purchase();
            ((C8950l) view.getLayoutParams()).f18445instanceof = true;
            ArrayList arrayList = this.f345l;
            if (!arrayList.contains(abstractC17322l)) {
                arrayList.add(abstractC17322l);
            }
        }
        this.f346l.put(view.getId(), view);
        this.f344l = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f346l.remove(view.getId());
        C11338l c11338lLoadAd = loadAd(view);
        this.f342l.f21654return.remove(c11338lLoadAd);
        c11338lLoadAd.signatures();
        this.f345l.remove(view);
        this.f344l = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f344l = true;
        super.requestLayout();
    }

    public void setConstraintSet(C4759l c4759l) {
        this.f347l = c4759l;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f346l;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f343l) {
            return;
        }
        this.f343l = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f353l) {
            return;
        }
        this.f353l = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f349l) {
            return;
        }
        this.f349l = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f350l) {
            return;
        }
        this.f350l = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC9031l abstractC9031l) {
        C10023l c10023l = this.f354l;
        if (c10023l != null) {
            c10023l.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f352l = i;
        C10664l c10664l = this.f342l;
        c10664l.f21649l = i;
        C4847l.adcel = c10664l.m2941switch(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void smaato(C11338l c11338l, C8950l c8950l, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f346l.get(i);
        C11338l c11338l2 = (C11338l) sparseArray.get(i);
        if (c11338l2 == null || view == null || !(view.getLayoutParams() instanceof C8950l)) {
            return;
        }
        c8950l.f18444import = true;
        if (i2 == 6) {
            C8950l c8950l2 = (C8950l) view.getLayoutParams();
            c8950l2.f18444import = true;
            c8950l2.f18453return.inmobi = true;
        }
        c11338l.mopub(6).yandex(c11338l2.mopub(i2), c8950l.appmetrica, c8950l.applovin);
        c11338l.inmobi = true;
        c11338l.mopub(3).mopub();
        c11338l.mopub(5).mopub();
    }

    public final void subs(AttributeSet attributeSet, int i, int i2) {
        C10664l c10664l = this.f342l;
        c10664l.f22855instanceof = this;
        C16827l c16827l = this.f348l;
        c10664l.f21650l = c16827l;
        c10664l.f21641l.f11539l = c16827l;
        this.f346l.put(getId(), this);
        this.f347l = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC4914l.loadAd, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.f350l = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f350l);
                } else if (index == 17) {
                    this.f349l = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f349l);
                } else if (index == 14) {
                    this.f353l = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f353l);
                } else if (index == 15) {
                    this.f343l = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f343l);
                } else if (index == 113) {
                    this.f352l = typedArrayObtainStyledAttributes.getInt(index, this.f352l);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            isPro(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f354l = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C4759l c4759l = new C4759l();
                        this.f347l = c4759l;
                        c4759l.amazon(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f347l = null;
                    }
                    this.f351l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        c10664l.f21649l = this.f352l;
        C4847l.adcel = c10664l.m2941switch(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f346l = new SparseArray();
        this.f345l = new ArrayList(4);
        this.f342l = new C10664l();
        this.f350l = 0;
        this.f349l = 0;
        this.f353l = Alert.DURATION_SHOW_INDEFINITELY;
        this.f343l = Alert.DURATION_SHOW_INDEFINITELY;
        this.f344l = true;
        this.f352l = 257;
        this.f347l = null;
        this.f354l = null;
        this.f351l = -1;
        this.f341l = new HashMap();
        this.f355l = new SparseArray();
        this.f348l = new C16827l(this, this);
        subs(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f346l = new SparseArray();
        this.f345l = new ArrayList(4);
        this.f342l = new C10664l();
        this.f350l = 0;
        this.f349l = 0;
        this.f353l = Alert.DURATION_SHOW_INDEFINITELY;
        this.f343l = Alert.DURATION_SHOW_INDEFINITELY;
        this.f344l = true;
        this.f352l = 257;
        this.f347l = null;
        this.f354l = null;
        this.f351l = -1;
        this.f341l = new HashMap();
        this.f355l = new SparseArray();
        this.f348l = new C16827l(this, this);
        subs(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f346l = new SparseArray();
        this.f345l = new ArrayList(4);
        this.f342l = new C10664l();
        this.f350l = 0;
        this.f349l = 0;
        this.f353l = Alert.DURATION_SHOW_INDEFINITELY;
        this.f343l = Alert.DURATION_SHOW_INDEFINITELY;
        this.f344l = true;
        this.f352l = 257;
        this.f347l = null;
        this.f354l = null;
        this.f351l = -1;
        this.f341l = new HashMap();
        this.f355l = new SparseArray();
        this.f348l = new C16827l(this, this);
        subs(attributeSet, i, i2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C8950l c8950l = new C8950l(layoutParams);
        c8950l.yandex = -1;
        c8950l.loadAd = -1;
        c8950l.crashlytics = -1.0f;
        c8950l.amazon = true;
        c8950l.purchase = -1;
        c8950l.billing = -1;
        c8950l.mopub = -1;
        c8950l.admob = -1;
        c8950l.subs = -1;
        c8950l.isPro = -1;
        c8950l.firebase = -1;
        c8950l.smaato = -1;
        c8950l.remoteconfig = -1;
        c8950l.vip = -1;
        c8950l.metrica = -1;
        c8950l.startapp = -1;
        c8950l.adcel = 0;
        c8950l.ads = 0.0f;
        c8950l.subscription = -1;
        c8950l.tapsense = -1;
        c8950l.Signature = -1;
        c8950l.license = -1;
        c8950l.pro = RecyclerView.UNDEFINED_DURATION;
        c8950l.ad = RecyclerView.UNDEFINED_DURATION;
        c8950l.advert = RecyclerView.UNDEFINED_DURATION;
        c8950l.isVip = RecyclerView.UNDEFINED_DURATION;
        c8950l.signatures = RecyclerView.UNDEFINED_DURATION;
        c8950l.premium = RecyclerView.UNDEFINED_DURATION;
        c8950l.applovin = RecyclerView.UNDEFINED_DURATION;
        c8950l.appmetrica = 0;
        c8950l.inmobi = 0.5f;
        c8950l.f18461throws = 0.5f;
        c8950l.f18449package = null;
        c8950l.f18458synchronized = -1.0f;
        c8950l.f18455strictfp = -1.0f;
        c8950l.f18464volatile = 0;
        c8950l.f18447native = 0;
        c8950l.f18450private = 0;
        c8950l.f18438extends = 0;
        c8950l.f18441for = 0;
        c8950l.f18460throw = 0;
        c8950l.f18432catch = 0;
        c8950l.f18437else = 0;
        c8950l.f18431case = 1.0f;
        c8950l.f18457switch = 1.0f;
        c8950l.f18435continue = -1;
        c8950l.f18433class = -1;
        c8950l.f18446interface = -1;
        c8950l.f18454static = false;
        c8950l.f18436default = false;
        c8950l.f18439final = null;
        c8950l.f18448new = 0;
        c8950l.f18442goto = true;
        c8950l.f18456super = true;
        c8950l.f18444import = false;
        c8950l.f18429abstract = false;
        c8950l.f18445instanceof = false;
        c8950l.f18452public = -1;
        c8950l.f18440finally = -1;
        c8950l.f18459this = -1;
        c8950l.f18463try = -1;
        c8950l.f18430break = RecyclerView.UNDEFINED_DURATION;
        c8950l.f18462transient = RecyclerView.UNDEFINED_DURATION;
        c8950l.f18451protected = 0.5f;
        c8950l.f18453return = new C11338l();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) c8950l).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) c8950l).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) c8950l).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) c8950l).bottomMargin = marginLayoutParams.bottomMargin;
            c8950l.setMarginStart(marginLayoutParams.getMarginStart());
            c8950l.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof C8950l)) {
            return c8950l;
        }
        C8950l c8950l2 = (C8950l) layoutParams;
        c8950l.yandex = c8950l2.yandex;
        c8950l.loadAd = c8950l2.loadAd;
        c8950l.crashlytics = c8950l2.crashlytics;
        c8950l.amazon = c8950l2.amazon;
        c8950l.purchase = c8950l2.purchase;
        c8950l.billing = c8950l2.billing;
        c8950l.mopub = c8950l2.mopub;
        c8950l.admob = c8950l2.admob;
        c8950l.subs = c8950l2.subs;
        c8950l.isPro = c8950l2.isPro;
        c8950l.firebase = c8950l2.firebase;
        c8950l.smaato = c8950l2.smaato;
        c8950l.remoteconfig = c8950l2.remoteconfig;
        c8950l.vip = c8950l2.vip;
        c8950l.metrica = c8950l2.metrica;
        c8950l.startapp = c8950l2.startapp;
        c8950l.adcel = c8950l2.adcel;
        c8950l.ads = c8950l2.ads;
        c8950l.subscription = c8950l2.subscription;
        c8950l.tapsense = c8950l2.tapsense;
        c8950l.Signature = c8950l2.Signature;
        c8950l.license = c8950l2.license;
        c8950l.pro = c8950l2.pro;
        c8950l.ad = c8950l2.ad;
        c8950l.advert = c8950l2.advert;
        c8950l.isVip = c8950l2.isVip;
        c8950l.signatures = c8950l2.signatures;
        c8950l.premium = c8950l2.premium;
        c8950l.applovin = c8950l2.applovin;
        c8950l.appmetrica = c8950l2.appmetrica;
        c8950l.inmobi = c8950l2.inmobi;
        c8950l.f18461throws = c8950l2.f18461throws;
        c8950l.f18449package = c8950l2.f18449package;
        c8950l.f18458synchronized = c8950l2.f18458synchronized;
        c8950l.f18455strictfp = c8950l2.f18455strictfp;
        c8950l.f18464volatile = c8950l2.f18464volatile;
        c8950l.f18447native = c8950l2.f18447native;
        c8950l.f18454static = c8950l2.f18454static;
        c8950l.f18436default = c8950l2.f18436default;
        c8950l.f18450private = c8950l2.f18450private;
        c8950l.f18438extends = c8950l2.f18438extends;
        c8950l.f18441for = c8950l2.f18441for;
        c8950l.f18432catch = c8950l2.f18432catch;
        c8950l.f18460throw = c8950l2.f18460throw;
        c8950l.f18437else = c8950l2.f18437else;
        c8950l.f18431case = c8950l2.f18431case;
        c8950l.f18457switch = c8950l2.f18457switch;
        c8950l.f18435continue = c8950l2.f18435continue;
        c8950l.f18433class = c8950l2.f18433class;
        c8950l.f18446interface = c8950l2.f18446interface;
        c8950l.f18442goto = c8950l2.f18442goto;
        c8950l.f18456super = c8950l2.f18456super;
        c8950l.f18444import = c8950l2.f18444import;
        c8950l.f18429abstract = c8950l2.f18429abstract;
        c8950l.f18452public = c8950l2.f18452public;
        c8950l.f18440finally = c8950l2.f18440finally;
        c8950l.f18459this = c8950l2.f18459this;
        c8950l.f18463try = c8950l2.f18463try;
        c8950l.f18430break = c8950l2.f18430break;
        c8950l.f18462transient = c8950l2.f18462transient;
        c8950l.f18451protected = c8950l2.f18451protected;
        c8950l.f18439final = c8950l2.f18439final;
        c8950l.f18448new = c8950l2.f18448new;
        c8950l.f18453return = c8950l2.f18453return;
        return c8950l;
    }
}
