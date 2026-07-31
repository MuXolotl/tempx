package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.purchase;
import androidx.recyclerview.widget.remoteconfig;

/* JADX INFO: renamed from: lؔؕٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2389l extends purchase {
    public final /* synthetic */ C4485l adcel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2389l(C4485l c4485l, Context context) {
        super(context);
        this.adcel = c4485l;
    }

    @Override // androidx.recyclerview.widget.purchase
    public final void admob(View view, remoteconfig remoteconfigVar) {
        C4485l c4485l = this.adcel;
        RecyclerView recyclerView = c4485l.yandex;
        if (recyclerView == null) {
            return;
        }
        int[] iArrLoadAd = c4485l.loadAd(recyclerView.getLayoutManager(), view);
        int i = iArrLoadAd[0];
        int i2 = iArrLoadAd[1];
        int iCeil = (int) Math.ceil(((double) purchase(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
        if (iCeil > 0) {
            remoteconfigVar.yandex = i;
            remoteconfigVar.loadAd = i2;
            remoteconfigVar.crashlytics = iCeil;
            remoteconfigVar.purchase = this.isPro;
            remoteconfigVar.billing = true;
        }
    }

    @Override // androidx.recyclerview.widget.purchase
    public final float amazon(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
