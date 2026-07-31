package defpackage;

import android.view.View;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.firebase;
import androidx.recyclerview.widget.metrica;
import java.util.List;

/* JADX INFO: renamed from: lِؑۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0267l {
    public int admob;
    public int amazon;
    public int billing;
    public int crashlytics;
    public List firebase;
    public int isPro;
    public int loadAd;
    public int mopub;
    public int purchase;
    public boolean smaato;
    public int subs;
    public boolean yandex;

    public final View loadAd(firebase firebaseVar) {
        List list = this.firebase;
        if (list == null) {
            View view = firebaseVar.smaato(this.amazon, Long.MAX_VALUE).yandex;
            this.amazon += this.purchase;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((metrica) this.firebase.get(i)).yandex;
            C13036l c13036l = (C13036l) view2.getLayoutParams();
            if (!c13036l.yandex.isPro() && this.amazon == c13036l.yandex.amazon()) {
                yandex(view2);
                return view2;
            }
        }
        return null;
    }

    public final void yandex(View view) {
        int iAmazon;
        int size = this.firebase.size();
        View view2 = null;
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((metrica) this.firebase.get(i2)).yandex;
            C13036l c13036l = (C13036l) view3.getLayoutParams();
            if (view3 != view && !c13036l.yandex.isPro() && (iAmazon = (c13036l.yandex.amazon() - this.amazon) * this.purchase) >= 0 && iAmazon < i) {
                view2 = view3;
                if (iAmazon == 0) {
                    break;
                } else {
                    i = iAmazon;
                }
            }
        }
        if (view2 == null) {
            this.amazon = -1;
        } else {
            this.amazon = ((C13036l) view2.getLayoutParams()).yandex.amazon();
        }
    }
}
