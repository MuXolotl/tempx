package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lٌۥۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9175l extends AbstractC9813l implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ArrayList f18874l;

    public C9175l(List list) {
        this.f18874l = new ArrayList(list);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f18874l.get(i);
    }

    @Override // defpackage.AbstractC7095l
    public final int pro() {
        return this.f18874l.size();
    }

    @Override // defpackage.AbstractC7095l, java.util.Collection
    public final Object[] toArray() {
        return this.f18874l.toArray(new Object[0]);
    }
}
