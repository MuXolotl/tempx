package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: lًّۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7966l extends AbstractC4350l {
    public static final C2582l admob = new C2582l(2);
    public final boolean purchase;
    public final HashMap loadAd = new HashMap();
    public final HashMap crashlytics = new HashMap();
    public final HashMap amazon = new HashMap();
    public boolean billing = false;
    public boolean mopub = false;

    public C7966l(boolean z) {
        this.purchase = z;
    }

    public final void amazon(String str, boolean z) {
        if (C13734l.m3727volatile(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        purchase(str, z);
    }

    public final void billing(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l) {
        if (this.mopub) {
            if (C13734l.m3727volatile(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.loadAd.remove(abstractComponentCallbacksC4411l.f8974l) == null || !C13734l.m3727volatile(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC4411l);
        }
    }

    public final void crashlytics(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l, boolean z) {
        if (C13734l.m3727volatile(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC4411l);
        }
        purchase(abstractComponentCallbacksC4411l.f8974l, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7966l.class == obj.getClass()) {
            C7966l c7966l = (C7966l) obj;
            if (this.loadAd.equals(c7966l.loadAd) && this.crashlytics.equals(c7966l.crashlytics) && this.amazon.equals(c7966l.amazon)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.amazon.hashCode() + ((this.crashlytics.hashCode() + (this.loadAd.hashCode() * 31)) * 31);
    }

    @Override // defpackage.AbstractC4350l
    public final void loadAd() {
        if (C13734l.m3727volatile(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.billing = true;
    }

    public final void purchase(String str, boolean z) {
        HashMap map = this.crashlytics;
        C7966l c7966l = (C7966l) map.get(str);
        if (c7966l != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(c7966l.crashlytics.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c7966l.amazon((String) it.next(), true);
                }
            }
            c7966l.loadAd();
            map.remove(str);
        }
        HashMap map2 = this.amazon;
        C15018l c15018l = (C15018l) map2.get(str);
        if (c15018l != null) {
            c15018l.yandex();
            map2.remove(str);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.loadAd.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.crashlytics.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.amazon.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
