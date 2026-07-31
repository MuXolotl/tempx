package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lؙۨۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6925l extends AbstractC3165l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1666l f14496l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Map.Entry f14497l;

    public C6925l(Map.Entry entry, InterfaceC1666l interfaceC1666l) {
        super(false, 0);
        this.f14497l = entry;
        this.f14496l = interfaceC1666l;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f14497l.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Map.Entry entry = this.f14497l;
        return this.f14496l.purchase(entry.getKey(), entry.getValue());
    }
}
