package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.metrica;
import java.util.ArrayList;

/* JADX INFO: renamed from: lْۣۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13735l {
    public long amazon;
    public long billing;
    public long crashlytics;
    public ArrayList loadAd;
    public long purchase;
    public InterfaceC1464l yandex;

    public static void loadAd(metrica metricaVar) {
        int i = metricaVar.isPro;
        if (!metricaVar.admob() && (i & 4) == 0) {
            metricaVar.loadAd();
        }
    }

    public abstract void amazon(metrica metricaVar);

    public abstract boolean billing();

    public final void crashlytics(metrica metricaVar) {
        InterfaceC1464l interfaceC1464l = this.yandex;
        if (interfaceC1464l != null) {
            RecyclerView recyclerView = (RecyclerView) ((C16543l) interfaceC1464l).f32482l;
            metricaVar.startapp(true);
            View view = metricaVar.yandex;
            if (metricaVar.admob != null && metricaVar.subs == null) {
                metricaVar.admob = null;
            }
            metricaVar.subs = null;
            if ((metricaVar.isPro & 16) == 0 && !recyclerView.removeAnimatingView(view) && metricaVar.smaato()) {
                recyclerView.removeDetachedView(view, false);
            }
        }
    }

    public abstract void purchase();

    public abstract boolean yandex(metrica metricaVar, metrica metricaVar2, C13279l c13279l, C13279l c13279l2);
}
