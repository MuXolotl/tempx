package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: lؙْؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6268l extends AbstractC2697l {
    public final SideSheetBehavior admob;
    public final /* synthetic */ int mopub;

    public /* synthetic */ C6268l(SideSheetBehavior sideSheetBehavior, int i) {
        this.mopub = i;
        this.admob = sideSheetBehavior;
    }

    @Override // defpackage.AbstractC2697l
    public final boolean adcel(View view, float f) {
        int i = this.mopub;
        SideSheetBehavior sideSheetBehavior = this.admob;
        switch (i) {
            case 0:
                return Math.abs((f * sideSheetBehavior.firebase) + ((float) view.getLeft())) > 0.5f;
            default:
                return Math.abs((f * sideSheetBehavior.firebase) + ((float) view.getRight())) > 0.5f;
        }
    }

    @Override // defpackage.AbstractC2697l
    public final int admob(View view) {
        int i = this.mopub;
        SideSheetBehavior sideSheetBehavior = this.admob;
        switch (i) {
            case 0:
                return view.getRight() + sideSheetBehavior.metrica;
            default:
                return view.getLeft() - sideSheetBehavior.metrica;
        }
    }

    @Override // defpackage.AbstractC2697l
    public final void ads(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int i3 = this.mopub;
        SideSheetBehavior sideSheetBehavior = this.admob;
        switch (i3) {
            case 0:
                if (i <= sideSheetBehavior.remoteconfig) {
                    marginLayoutParams.leftMargin = i2;
                }
                break;
            default:
                int i4 = sideSheetBehavior.remoteconfig;
                if (i <= i4) {
                    marginLayoutParams.rightMargin = i4 - i;
                }
                break;
        }
    }

    @Override // defpackage.AbstractC2697l
    public final int amazon() {
        int i = this.mopub;
        SideSheetBehavior sideSheetBehavior = this.admob;
        switch (i) {
            case 0:
                return Math.max(0, sideSheetBehavior.vip + sideSheetBehavior.metrica);
            default:
                return Math.max(0, (sideSheetBehavior.remoteconfig - sideSheetBehavior.smaato) - sideSheetBehavior.metrica);
        }
    }

    @Override // defpackage.AbstractC2697l
    public final int billing() {
        int i = this.mopub;
        SideSheetBehavior sideSheetBehavior = this.admob;
        switch (i) {
            case 0:
                return sideSheetBehavior.metrica;
            default:
                return sideSheetBehavior.remoteconfig;
        }
    }

    @Override // defpackage.AbstractC2697l
    public final float crashlytics(int i) {
        switch (this.mopub) {
            case 0:
                float fPurchase = purchase();
                return (i - fPurchase) / (amazon() - fPurchase);
            default:
                float f = this.admob.remoteconfig;
                return (f - i) / (f - amazon());
        }
    }

    @Override // defpackage.AbstractC2697l
    public final int isPro() {
        switch (this.mopub) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // defpackage.AbstractC2697l
    public final int loadAd(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.mopub) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.AbstractC2697l
    public final boolean metrica(float f, float f2) {
        switch (this.mopub) {
            case 0:
                return Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f;
            default:
                return Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f;
        }
    }

    @Override // defpackage.AbstractC2697l
    public final int mopub() {
        switch (this.mopub) {
            case 0:
                return -this.admob.smaato;
            default:
                return amazon();
        }
    }

    @Override // defpackage.AbstractC2697l
    public final int purchase() {
        int i = this.mopub;
        SideSheetBehavior sideSheetBehavior = this.admob;
        switch (i) {
            case 0:
                return (-sideSheetBehavior.smaato) - sideSheetBehavior.metrica;
            default:
                return sideSheetBehavior.remoteconfig;
        }
    }

    @Override // defpackage.AbstractC2697l
    public final boolean remoteconfig(View view) {
        switch (this.mopub) {
            case 0:
                return view.getRight() < (amazon() - purchase()) / 2;
            default:
                return view.getLeft() > (amazon() + this.admob.remoteconfig) / 2;
        }
    }

    @Override // defpackage.AbstractC2697l
    public final boolean smaato(float f) {
        switch (this.mopub) {
            case 0:
                return f > 0.0f;
            default:
                return f < 0.0f;
        }
    }

    @Override // defpackage.AbstractC2697l
    public final int subs(CoordinatorLayout coordinatorLayout) {
        switch (this.mopub) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }
}
