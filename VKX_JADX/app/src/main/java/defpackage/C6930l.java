package defpackage;

/* JADX INFO: renamed from: lؙۨۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6930l extends C8490l implements InterfaceC2478l {
    public final void ad(int i) {
        synchronized (this) {
            mopub(Integer.valueOf(((Number) AbstractC3861l.crashlytics(this.f17547l, (this.f17551l + ((long) ((int) ((adcel() + ((long) this.f17553l)) - this.f17551l)))) - 1)).intValue() + i));
        }
    }

    @Override // defpackage.InterfaceC2478l
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) AbstractC3861l.crashlytics(this.f17547l, (this.f17551l + ((long) ((int) ((adcel() + ((long) this.f17553l)) - this.f17551l)))) - 1)).intValue());
        }
        return numValueOf;
    }
}
