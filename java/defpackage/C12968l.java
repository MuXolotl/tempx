package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lّۥَ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llّۥَ;", "Llَّؓ;", "Llْٝۛ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C12968l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C1040l f25423l;

    public C12968l(C1040l c1040l) {
        this.f25423l = c1040l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C13539l c13539l = (C13539l) abstractC14971l;
        c13539l.f26555l = 64L;
        c13539l.f26553l = 64L;
        c13539l.f26554l = this.f25423l;
        C6606l c6606l = c13539l.f26556l;
        if (c6606l != null) {
            c6606l.loadAd();
        }
        c13539l.f26556l = AbstractC9498l.mopub(c13539l, c13539l.f26555l, c13539l.f26553l, c13539l.f26554l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12968l) && this.f25423l == ((C12968l) obj).f25423l;
    }

    public final int hashCode() {
        return this.f25423l.hashCode() + 63488;
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C13539l c13539l = new C13539l();
        c13539l.f26555l = 64L;
        c13539l.f26553l = 64L;
        c13539l.f26554l = this.f25423l;
        return c13539l;
    }
}
