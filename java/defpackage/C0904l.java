package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lؚؒۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0904l implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f2561l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f2562l = -1;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f2563l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C11154l f2564l;

    public C0904l(C11154l c11154l) {
        this.f2564l = c11154l;
        this.f2563l = c11154l.f11161l - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f2561l) {
            C8339l.smaato("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.f2562l;
            C11154l c11154l = this.f2564l;
            if (AbstractC8576l.yandex(key, c11154l.billing(i)) && AbstractC8576l.yandex(entry.getValue(), c11154l.subs(this.f2562l))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f2561l) {
            return this.f2564l.billing(this.f2562l);
        }
        C8339l.smaato("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f2561l) {
            return this.f2564l.subs(this.f2562l);
        }
        C8339l.smaato("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2562l < this.f2563l;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f2561l) {
            C8339l.smaato("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.f2562l;
        C11154l c11154l = this.f2564l;
        Object objBilling = c11154l.billing(i);
        Object objSubs = c11154l.subs(this.f2562l);
        return (objBilling == null ? 0 : objBilling.hashCode()) ^ (objSubs != null ? objSubs.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C4875l.firebase();
            return null;
        }
        this.f2562l++;
        this.f2561l = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2561l) {
            C18073l.admob();
            return;
        }
        this.f2564l.mopub(this.f2562l);
        this.f2562l--;
        this.f2563l--;
        this.f2561l = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f2561l) {
            return this.f2564l.admob(this.f2562l, obj);
        }
        C8339l.smaato("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
