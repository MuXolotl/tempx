package defpackage;

import java.io.Serializable;

/* JADX INFO: renamed from: lِٕٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11896l extends AbstractC3165l implements Serializable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f23723l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f23724l;

    public C11896l(Object obj, Object obj2) {
        super(false, 0);
        this.f23724l = obj;
        this.f23723l = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f23724l;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f23723l;
    }

    @Override // defpackage.AbstractC3165l, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
