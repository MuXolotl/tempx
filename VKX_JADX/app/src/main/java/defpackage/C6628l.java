package defpackage;

import java.io.Serializable;

/* JADX INFO: renamed from: lؙٞٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6628l extends AbstractC3165l implements Serializable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C0819l f13868l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f13869l;

    public C6628l(Object obj, C0819l c0819l) {
        super(false, 1);
        this.f13869l = obj;
        this.f13868l = c0819l;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f13869l;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f13868l;
    }

    @Override // defpackage.AbstractC3165l, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
