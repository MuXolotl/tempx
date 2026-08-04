package defpackage;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: lَٕ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15596l extends AbstractC1979l implements Set {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C2497l f30455l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15596l(C2497l c2497l, Object obj, Set set) {
        super(c2497l, obj, set, null);
        this.f30455l = c2497l;
    }

    @Override // defpackage.AbstractC1979l, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAdcel = AbstractC5088l.adcel((Set) this.f4493l, collection);
        if (zAdcel) {
            this.f30455l.f4809l += this.f4493l.size() - size;
            mopub();
        }
        return zAdcel;
    }
}
