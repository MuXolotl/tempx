package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: lَؙؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7168l implements Map.Entry, InterfaceC2356l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C6367l f15000l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f15001l;

    public C7168l(C6367l c6367l, int i) {
        this.f15000l = c6367l;
        this.f15001l = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f15000l.crashlytics.crashlytics(this.f15001l).toString();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return Collections.singletonList(this.f15000l.crashlytics.billing(this.f15001l).toString());
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
