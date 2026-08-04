package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؒۡؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llؒۡؗ;", "Llَّؓ;", "Llؙۥؚ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C1395l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f3558l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Function2 f3559l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f3560l;

    public C1395l(int i, Function2 function2, Object obj) {
        this.f3560l = i;
        this.f3559l = function2;
        this.f3558l = obj;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C6868l c6868l = (C6868l) abstractC14971l;
        c6868l.f14369l = this.f3560l;
        c6868l.f14368l = this.f3559l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1395l.class != obj.getClass()) {
            return false;
        }
        C1395l c1395l = (C1395l) obj;
        return this.f3560l == c1395l.f3560l && AbstractC8576l.yandex(this.f3558l, c1395l.f3558l);
    }

    public final int hashCode() {
        return this.f3558l.hashCode() + (((AbstractC5020l.inmobi(this.f3560l) * 31) + 1237) * 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C6868l c6868l = new C6868l();
        c6868l.f14369l = this.f3560l;
        c6868l.f14368l = this.f3559l;
        return c6868l;
    }
}
