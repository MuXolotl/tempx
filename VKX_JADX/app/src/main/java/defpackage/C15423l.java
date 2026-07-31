package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: lؘٕؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15423l extends AbstractC2168l implements InterfaceC14738l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public transient C13636l f30138l;

    @Override // defpackage.AbstractC2168l, defpackage.AbstractC6671l
    public final Map crashlytics() {
        Map map = this.f4808l;
        if (map instanceof NavigableMap) {
            return new C17531l(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new C5547l(this, (SortedMap) map) : new C1137l(this, map, 0);
    }

    @Override // defpackage.AbstractC2168l
    public final Collection firebase(Object obj, Collection collection) {
        List list = (List) collection;
        return list instanceof RandomAccess ? new C15139l(this, obj, list, null) : new C9898l(this, obj, list, null);
    }

    @Override // defpackage.AbstractC2168l, defpackage.InterfaceC12767l
    public final Collection get(Object obj) {
        return (List) super.get(obj);
    }

    @Override // defpackage.AbstractC2168l, defpackage.AbstractC6671l
    public final Set purchase() {
        Map map = this.f4808l;
        if (map instanceof NavigableMap) {
            return new C6802l(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new C5255l(this, (SortedMap) map) : new C3087l(this, map);
    }

    @Override // defpackage.AbstractC2168l
    public final Collection subs() {
        return (List) this.f30138l.get();
    }
}
