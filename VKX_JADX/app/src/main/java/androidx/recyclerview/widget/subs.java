package androidx.recyclerview.widget;

import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import defpackage.AbstractC14366l;
import defpackage.AbstractC8199l;
import defpackage.C11983l;
import defpackage.C13036l;
import defpackage.C14492l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class subs {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C14492l f465l = new C14492l();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f464l = false;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f463l = 1;

    public long admob(int i) {
        return -1L;
    }

    public abstract void ads(metrica metricaVar, int i);

    public final void amazon(metrica metricaVar, int i) {
        subs subsVar = metricaVar.subscription;
        View view = metricaVar.yandex;
        boolean z = subsVar == null;
        if (z) {
            metricaVar.crashlytics = i;
            if (this.f464l) {
                metricaVar.purchase = admob(i);
            }
            metricaVar.isPro = (metricaVar.isPro & (-520)) | 1;
            if (AbstractC14366l.yandex()) {
                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(metricaVar.billing)));
            }
        }
        metricaVar.subscription = this;
        if (RecyclerView.sDebugAssertionsEnabled) {
            if (view.getParent() == null && view.isAttachedToWindow() != metricaVar.smaato()) {
                throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + metricaVar.smaato() + ", attached to window: " + view.isAttachedToWindow() + ", holder: " + metricaVar);
            }
            if (view.getParent() == null && view.isAttachedToWindow()) {
                C11983l.ad(metricaVar, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                return;
            }
        }
        subscription(metricaVar, i, metricaVar.purchase());
        if (z) {
            ArrayList arrayList = metricaVar.firebase;
            if (arrayList != null) {
                arrayList.clear();
            }
            metricaVar.isPro &= -1025;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C13036l) {
                ((C13036l) layoutParams).crashlytics = true;
            }
            Trace.endSection();
        }
    }

    public final void firebase(int i, AbstractC8199l abstractC8199l) {
        this.f465l.amazon(i, 1, abstractC8199l);
    }

    public final void isPro() {
        this.f465l.loadAd();
    }

    public boolean license(metrica metricaVar) {
        return false;
    }

    public final void metrica(int i, int i2) {
        this.f465l.billing(i, i2);
    }

    public abstract int mopub();

    public int purchase(subs subsVar, metrica metricaVar, int i) {
        if (subsVar == this) {
            return i;
        }
        return -1;
    }

    public final void remoteconfig(int i, int i2) {
        this.f465l.purchase(i, i2);
    }

    public final void smaato(int i, int i2) {
        this.f465l.crashlytics(i, i2);
    }

    public int subs(int i) {
        return 0;
    }

    public void subscription(metrica metricaVar, int i, List list) {
        ads(metricaVar, i);
    }

    public abstract metrica tapsense(ViewGroup viewGroup, int i);

    public void Signature(RecyclerView recyclerView) {
    }

    public void ad(metrica metricaVar) {
    }

    public void advert(metrica metricaVar) {
    }

    public void pro(metrica metricaVar) {
    }

    public void startapp(RecyclerView recyclerView) {
    }
}
