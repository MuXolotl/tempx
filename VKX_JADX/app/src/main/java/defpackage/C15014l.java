package defpackage;

import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: renamed from: lٔٛۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15014l {
    public final WeakReference admob;
    public final C12736l amazon;
    public final C12736l billing;
    public final boolean crashlytics;
    public final int loadAd;
    public final ArrayList mopub;
    public final C12736l purchase;
    public final AbstractC16531l yandex;
    public boolean subs = false;
    public boolean isPro = false;

    public C15014l(C17646l c17646l, C12736l c12736l, AbstractC16531l abstractC16531l, int i, boolean z, C12736l c12736l2, Collection collection) {
        this.admob = new WeakReference(c17646l);
        this.purchase = c12736l;
        this.yandex = abstractC16531l;
        this.loadAd = i;
        this.crashlytics = z;
        this.amazon = c17646l.amazon;
        this.billing = c12736l2;
        this.mopub = collection == null ? null : new ArrayList(collection);
        c17646l.yandex.postDelayed(new RunnableC11297l(20, this), 15000L);
    }

    public final void loadAd() {
        C9961l.loadAd();
        if (this.subs || this.isPro) {
            return;
        }
        WeakReference weakReference = this.admob;
        C17646l c17646l = (C17646l) weakReference.get();
        if (c17646l == null || c17646l.billing != this) {
            yandex();
            return;
        }
        this.subs = true;
        c17646l.billing = null;
        C17646l c17646l2 = (C17646l) weakReference.get();
        C12736l c12736l = this.amazon;
        int i = this.loadAd;
        if (c17646l2 != null) {
            HashMap map = c17646l2.loadAd;
            if (c17646l2.amazon == c12736l) {
                Message messageObtainMessage = c17646l2.yandex.obtainMessage(263, c12736l);
                messageObtainMessage.arg1 = i;
                messageObtainMessage.sendToTarget();
                AbstractC16531l abstractC16531l = c17646l2.purchase;
                if (abstractC16531l != null) {
                    abstractC16531l.admob(i);
                    c17646l2.purchase.amazon();
                }
                if (!map.isEmpty()) {
                    for (AbstractC16531l abstractC16531l2 : map.values()) {
                        abstractC16531l2.admob(i);
                        abstractC16531l2.amazon();
                    }
                    map.clear();
                }
                c17646l2.purchase = null;
            }
        }
        C17646l c17646l3 = (C17646l) weakReference.get();
        if (c17646l3 == null) {
            return;
        }
        C12736l c12736l2 = this.purchase;
        c17646l3.amazon = c12736l2;
        c17646l3.purchase = this.yandex;
        HandlerC3504l handlerC3504l = c17646l3.yandex;
        boolean z = this.crashlytics;
        C12736l c12736l3 = this.billing;
        if (c12736l3 == null) {
            handlerC3504l.getClass();
            Message messageObtainMessage2 = handlerC3504l.obtainMessage(262, new C16197l(c12736l, c12736l2, z));
            messageObtainMessage2.arg1 = i;
            messageObtainMessage2.sendToTarget();
        } else {
            handlerC3504l.getClass();
            Message messageObtainMessage3 = handlerC3504l.obtainMessage(264, new C16197l(c12736l3, c12736l2, z));
            messageObtainMessage3.arg1 = i;
            messageObtainMessage3.sendToTarget();
        }
        c17646l3.loadAd.clear();
        c17646l3.subs();
        c17646l3.remoteconfig();
        ArrayList arrayList = this.mopub;
        if (arrayList != null) {
            C12736l c12736l4 = c17646l3.amazon;
            c12736l4.getClass();
            C12037l c12037l = c12736l4 instanceof C12037l ? (C12037l) c12736l4 : null;
            if (c12037l != null) {
                c12037l.subs(arrayList);
            }
        }
    }

    public final void yandex() {
        if (this.subs || this.isPro) {
            return;
        }
        this.isPro = true;
        AbstractC16531l abstractC16531l = this.yandex;
        if (abstractC16531l != null) {
            abstractC16531l.admob(0);
            abstractC16531l.amazon();
        }
    }
}
