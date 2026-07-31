package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lؙۙٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6715l extends AbstractC2837l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11349l f14076l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14077l;

    public /* synthetic */ C6715l(C11349l c11349l, int i) {
        this.f14077l = i;
        this.f14076l = c11349l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f14077l) {
            case 0:
                throw new UnsupportedOperationException("CaseInsensitiveMap.entries does not support add");
            default:
                throw new UnsupportedOperationException("CaseInsensitiveMap.keys does not support add");
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f14077l) {
            case 0:
                if (AbstractC9464l.smaato(obj)) {
                    return super.contains((Map.Entry) obj);
                }
                return false;
            default:
                if (!(obj instanceof String)) {
                    return false;
                }
                return this.f14076l.containsKey((String) obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.f14077l;
        C11349l c11349l = this.f14076l;
        switch (i) {
            case 0:
                return new C2921l(c11349l, 0);
            default:
                return new C2921l(c11349l, 1);
        }
    }

    @Override // defpackage.AbstractC2837l
    public final int pro() {
        int i = this.f14077l;
        C11349l c11349l = this.f14076l;
        switch (i) {
            case 0:
                break;
        }
        return c11349l.f22889l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f14077l) {
            case 0:
                if (AbstractC9464l.smaato(obj)) {
                    return super.remove((Map.Entry) obj);
                }
                return false;
            default:
                if (obj instanceof String) {
                    return this.f14076l.remove((String) obj) != null;
                }
                return false;
        }
    }
}
