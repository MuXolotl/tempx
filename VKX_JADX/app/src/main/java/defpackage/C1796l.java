package defpackage;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lِؓۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1796l {
    public Object amazon;
    public Object crashlytics;
    public Object loadAd;
    public Object purchase;
    public float yandex;

    public C1796l amazon() {
        C15976l c15976l = (C15976l) this.loadAd;
        c15976l.remoteconfig.subs = 1.0d;
        c15976l.amazon();
        Iterator it = ((ArrayList) this.amazon).iterator();
        while (it.hasNext()) {
            ((InterfaceC14255l) it.next()).loadAd();
        }
        return this;
    }

    public AbstractC2249l crashlytics(long j, AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2) {
        AbstractC2249l abstractC2249l3;
        if (((AbstractC2249l) this.amazon) == null) {
            this.amazon = abstractC2249l.crashlytics();
        }
        AbstractC2249l abstractC2249l4 = (AbstractC2249l) this.amazon;
        if (abstractC2249l4 == null) {
            abstractC2249l4 = null;
        }
        int iLoadAd = abstractC2249l4.loadAd();
        int i = 0;
        while (true) {
            abstractC2249l3 = (AbstractC2249l) this.amazon;
            if (i >= iLoadAd) {
                break;
            }
            if (abstractC2249l3 == null) {
                abstractC2249l3 = null;
            }
            InterfaceC18080l interfaceC18080l = (InterfaceC18080l) this.loadAd;
            abstractC2249l.getClass();
            abstractC2249l3.purchase(i, interfaceC18080l.subs(abstractC2249l2.yandex(i), j));
            i++;
        }
        if (abstractC2249l3 == null) {
            return null;
        }
        return abstractC2249l3;
    }

    public void loadAd() {
        C15976l c15976l = (C15976l) this.loadAd;
        c15976l.getClass();
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (c15976l.billing) {
            c15976l.yandex(true);
        }
        ((ArrayList) ((C5138l) this.crashlytics).f11181l).remove(this);
    }

    public C1796l yandex(InterfaceC9547l interfaceC9547l) {
        ((ArrayList) this.purchase).add(interfaceC9547l);
        return this;
    }
}
