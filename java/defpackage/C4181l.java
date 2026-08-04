package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؖٗۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4181l extends AbstractC15029l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final View f8585l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f8586l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f8587l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int[] f8588l;

    public C4181l(View view) {
        super(0);
        this.f8588l = new int[2];
        this.f8585l = view;
    }

    @Override // defpackage.AbstractC15029l
    public final C13645l metrica(C12902l c12902l, C13645l c13645l) {
        View view = this.f8585l;
        int[] iArr = this.f8588l;
        view.getLocationOnScreen(iArr);
        int i = this.f8587l - iArr[1];
        this.f8586l = i;
        view.setTranslationY(i);
        return c13645l;
    }

    @Override // defpackage.AbstractC15029l
    public final void remoteconfig(C12902l c12902l) {
        View view = this.f8585l;
        int[] iArr = this.f8588l;
        view.getLocationOnScreen(iArr);
        this.f8587l = iArr[1];
    }

    @Override // defpackage.AbstractC15029l
    public final void smaato(C12902l c12902l) {
        this.f8585l.setTranslationY(0.0f);
    }

    @Override // defpackage.AbstractC15029l
    public final C1473l vip(C1473l c1473l, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C12902l c12902l = (C12902l) it.next();
            if ((c12902l.yandex.crashlytics() & 8) != 0) {
                this.f8585l.setTranslationY(AbstractC0926l.crashlytics(this.f8586l, c12902l.yandex.loadAd(), 0));
                break;
            }
        }
        return c1473l;
    }
}
