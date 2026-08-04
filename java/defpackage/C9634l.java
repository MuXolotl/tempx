package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lٍ٘ۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٍ٘ۧ;", "Llَّؓ;", "Llُؕۢ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C9634l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C11090l f19635l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C16328l f19636l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C10312l f19637l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C3790l f19638l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f19639l;

    public C9634l(C10312l c10312l, C16328l c16328l, C11090l c11090l, boolean z, C3790l c3790l) {
        this.f19637l = c10312l;
        this.f19636l = c16328l;
        this.f19635l = c11090l;
        this.f19639l = z;
        this.f19638l = c3790l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C10833l c10833l = (C10833l) abstractC14971l;
        C10312l c10312l = c10833l.f21895l;
        C10312l c10312l2 = this.f19637l;
        c10833l.f21895l = c10312l2;
        c10312l2.getClass();
        boolean z = this.f19639l;
        c10833l.f21896l = z;
        boolean z2 = !z;
        C15315l c15315l = c10312l2.yandex;
        c15315l.getClass();
        c15315l.f29930l.setValue(new C11007l(this.f19636l, this.f19635l, z, z2, this.f19638l.crashlytics == 4));
        if (AbstractC8576l.yandex(c10312l, c10312l2)) {
            return;
        }
        c10833l.f21894l.m2190l(c10312l2.mopub);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9634l)) {
            return false;
        }
        C9634l c9634l = (C9634l) obj;
        return this.f19639l == c9634l.f19639l && AbstractC8576l.yandex(this.f19637l, c9634l.f19637l) && AbstractC8576l.yandex(this.f19636l, c9634l.f19636l) && AbstractC8576l.yandex(this.f19635l, c9634l.f19635l) && this.f19638l.equals(c9634l.f19638l);
    }

    public final int hashCode() {
        return this.f19638l.hashCode() + AbstractC12589l.isVip(this.f19635l, (this.f19636l.hashCode() + ((this.f19637l.hashCode() + ((this.f19639l ? 1231 : 1237) * 31)) * 31)) * 31, 961);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C10833l(this.f19637l, this.f19636l, this.f19635l, this.f19639l, this.f19638l);
    }
}
