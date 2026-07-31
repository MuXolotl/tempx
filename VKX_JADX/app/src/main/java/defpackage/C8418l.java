package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lًۦ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8418l extends AbstractC8909l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final transient AbstractC6140l f17425l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final transient Object[] f17426l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final transient int f17427l;

    public C8418l(AbstractC6140l abstractC6140l, Object[] objArr, int i) {
        super(2);
        this.f17425l = abstractC6140l;
        this.f17426l = objArr;
        this.f17427l = i;
    }

    public final AbstractC0933l ads() {
        return new C11785l(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f17425l.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC0933l abstractC0933lAds = this.f18304l;
        if (abstractC0933lAds == null) {
            abstractC0933lAds = ads();
            this.f18304l = abstractC0933lAds;
        }
        return abstractC0933lAds.listIterator(0);
    }

    @Override // defpackage.AbstractC3810l
    public final int remoteconfig(Object[] objArr) {
        AbstractC0933l abstractC0933lAds = this.f18304l;
        if (abstractC0933lAds == null) {
            abstractC0933lAds = ads();
            this.f18304l = abstractC0933lAds;
        }
        return abstractC0933lAds.remoteconfig(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f17427l;
    }
}
