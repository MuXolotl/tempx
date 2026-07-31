package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import defpackage.C13036l;
import defpackage.C5932l;
import defpackage.C8339l;
import defpackage.InterfaceC9662l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class purchase {
    public boolean admob;
    public boolean amazon;
    public View billing;
    public isPro crashlytics;
    public PointF firebase;
    public final DecelerateInterpolator isPro;
    public RecyclerView loadAd;
    public int metrica;
    public final remoteconfig mopub;
    public boolean purchase;
    public boolean remoteconfig;
    public final DisplayMetrics smaato;
    public int startapp;
    public final LinearInterpolator subs;
    public float vip;
    public int yandex = -1;

    public purchase(Context context) {
        remoteconfig remoteconfigVar = new remoteconfig();
        remoteconfigVar.amazon = -1;
        remoteconfigVar.billing = false;
        remoteconfigVar.mopub = 0;
        remoteconfigVar.yandex = 0;
        remoteconfigVar.loadAd = 0;
        remoteconfigVar.crashlytics = RecyclerView.UNDEFINED_DURATION;
        remoteconfigVar.purchase = null;
        this.mopub = remoteconfigVar;
        this.subs = new LinearInterpolator();
        this.isPro = new DecelerateInterpolator();
        this.remoteconfig = false;
        this.metrica = 0;
        this.startapp = 0;
        this.smaato = context.getResources().getDisplayMetrics();
    }

    public static int yandex(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            C8339l.metrica("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            return 0;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    public void admob(View view, remoteconfig remoteconfigVar) {
        int i;
        PointF pointF = this.firebase;
        int i2 = 0;
        if (pointF != null) {
            float f = pointF.x;
            if (f == 0.0f) {
                i = 0;
            } else {
                i = f > 0.0f ? 1 : -1;
            }
        } else {
            i = 0;
        }
        int iLoadAd = loadAd(view, i);
        PointF pointF2 = this.firebase;
        if (pointF2 != null) {
            float f2 = pointF2.y;
            if (f2 != 0.0f) {
                i2 = f2 > 0.0f ? 1 : -1;
            }
        }
        int iCrashlytics = crashlytics(view, i2);
        int iCeil = (int) Math.ceil(((double) purchase((int) Math.sqrt((iCrashlytics * iCrashlytics) + (iLoadAd * iLoadAd)))) / 0.3356d);
        if (iCeil > 0) {
            remoteconfigVar.yandex = -iLoadAd;
            remoteconfigVar.loadAd = -iCrashlytics;
            remoteconfigVar.crashlytics = iCeil;
            remoteconfigVar.purchase = this.isPro;
            remoteconfigVar.billing = true;
        }
    }

    public float amazon(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public PointF billing(int i) {
        Object obj = this.crashlytics;
        if (obj instanceof InterfaceC9662l) {
            return ((InterfaceC9662l) obj).yandex(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC9662l.class.getCanonicalName());
        return null;
    }

    public int crashlytics(View view, int i) {
        isPro ispro = this.crashlytics;
        if (ispro == null || !ispro.purchase()) {
            return 0;
        }
        C13036l c13036l = (C13036l) view.getLayoutParams();
        return yandex(isPro.inmobi(view) - ((ViewGroup.MarginLayoutParams) c13036l).topMargin, isPro.advert(view) + ((ViewGroup.MarginLayoutParams) c13036l).bottomMargin, ispro.m148volatile(), ispro.metrica - ispro.m143package(), i);
    }

    public int loadAd(View view, int i) {
        isPro ispro = this.crashlytics;
        if (ispro == null || !ispro.amazon()) {
            return 0;
        }
        C13036l c13036l = (C13036l) view.getLayoutParams();
        return yandex(isPro.signatures(view) - ((ViewGroup.MarginLayoutParams) c13036l).leftMargin, isPro.appmetrica(view) + ((ViewGroup.MarginLayoutParams) c13036l).rightMargin, ispro.m146synchronized(), ispro.vip - ispro.m145strictfp(), i);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ef  */
    public final void mopub(int i, int i2) {
        PointF pointFBilling;
        RecyclerView recyclerView = this.loadAd;
        if (this.yandex == -1 || recyclerView == null) {
            subs();
        }
        if (this.amazon && this.billing == null && this.crashlytics != null && (pointFBilling = billing(this.yandex)) != null) {
            float f = pointFBilling.x;
            if (f != 0.0f || pointFBilling.y != 0.0f) {
                recyclerView.scrollStep((int) Math.signum(f), (int) Math.signum(pointFBilling.y), null);
            }
        }
        this.amazon = false;
        View view = this.billing;
        remoteconfig remoteconfigVar = this.mopub;
        if (view != null) {
            if (this.loadAd.getChildLayoutPosition(view) == this.yandex) {
                View view2 = this.billing;
                C5932l c5932l = recyclerView.mState;
                admob(view2, remoteconfigVar);
                remoteconfigVar.yandex(recyclerView);
                subs();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.billing = null;
            }
        }
        if (this.purchase) {
            C5932l c5932l2 = recyclerView.mState;
            if (this.loadAd.mLayout.license() == 0) {
                subs();
            } else {
                int i3 = this.metrica;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.metrica = i4;
                int i5 = this.startapp;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.startapp = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF pointFBilling2 = billing(this.yandex);
                    if (pointFBilling2 != null) {
                        float f2 = pointFBilling2.x;
                        if (f2 == 0.0f && pointFBilling2.y == 0.0f) {
                            remoteconfigVar.amazon = this.yandex;
                            subs();
                        } else {
                            float f3 = pointFBilling2.y;
                            float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
                            float f4 = pointFBilling2.x / fSqrt;
                            pointFBilling2.x = f4;
                            float f5 = pointFBilling2.y / fSqrt;
                            pointFBilling2.y = f5;
                            this.firebase = pointFBilling2;
                            this.metrica = (int) (f4 * 10000.0f);
                            this.startapp = (int) (f5 * 10000.0f);
                            int iPurchase = purchase(ModuleDescriptor.MODULE_VERSION);
                            int i7 = (int) (this.metrica * 1.2f);
                            int i8 = (int) (this.startapp * 1.2f);
                            remoteconfigVar.yandex = i7;
                            remoteconfigVar.loadAd = i8;
                            remoteconfigVar.crashlytics = (int) (iPurchase * 1.2f);
                            remoteconfigVar.purchase = this.subs;
                            remoteconfigVar.billing = true;
                        }
                    } else {
                        remoteconfigVar.amazon = this.yandex;
                        subs();
                    }
                }
            }
            boolean z = remoteconfigVar.amazon >= 0;
            remoteconfigVar.yandex(recyclerView);
            if (z && this.purchase) {
                this.amazon = true;
                recyclerView.mViewFlinger.loadAd();
            }
        }
    }

    public final int purchase(int i) {
        float fAbs = Math.abs(i);
        if (!this.remoteconfig) {
            this.vip = amazon(this.smaato);
            this.remoteconfig = true;
        }
        return (int) Math.ceil(fAbs * this.vip);
    }

    public final void subs() {
        if (this.purchase) {
            this.purchase = false;
            this.startapp = 0;
            this.metrica = 0;
            this.firebase = null;
            this.loadAd.mState.yandex = -1;
            this.billing = null;
            this.yandex = -1;
            this.amazon = false;
            isPro ispro = this.crashlytics;
            if (ispro.purchase == this) {
                ispro.purchase = null;
            }
            this.crashlytics = null;
            this.loadAd = null;
        }
    }
}
