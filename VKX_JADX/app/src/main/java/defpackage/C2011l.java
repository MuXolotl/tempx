package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: lؓٞۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2011l implements Iterable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f4535l = new Object();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final HashMap f4534l = new HashMap();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Set f4533l = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public List f4536l = Collections.EMPTY_LIST;

    public final int amazon(C13281l c13281l) {
        int iIntValue;
        synchronized (this.f4535l) {
            try {
                iIntValue = this.f4534l.containsKey(c13281l) ? ((Integer) this.f4534l.get(c13281l)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public final void billing(C13281l c13281l) {
        synchronized (this.f4535l) {
            try {
                Integer num = (Integer) this.f4534l.get(c13281l);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f4536l);
                arrayList.remove(c13281l);
                this.f4536l = DesugarCollections.unmodifiableList(arrayList);
                int iIntValue = num.intValue();
                HashMap map = this.f4534l;
                if (iIntValue == 1) {
                    map.remove(c13281l);
                    HashSet hashSet = new HashSet(this.f4533l);
                    hashSet.remove(c13281l);
                    this.f4533l = DesugarCollections.unmodifiableSet(hashSet);
                } else {
                    map.put(c13281l, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f4535l) {
            it = this.f4536l.iterator();
        }
        return it;
    }
}
