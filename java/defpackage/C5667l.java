package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؘؚٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5667l implements CharSequence {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final CharSequence f12057l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C1343l f12058l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final List f12059l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C12814l f12060l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final long f12061l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C8195l f12062l;

    public C5667l(CharSequence charSequence, long j, C12814l c12814l, C8195l c8195l, List list, List list2, C1343l c1343l, int i) {
        c12814l = (i & 4) != 0 ? null : c12814l;
        c8195l = (i & 8) != 0 ? null : c8195l;
        list = (i & 16) != 0 ? null : list;
        c1343l = (i & 64) != 0 ? null : c1343l;
        this.f12059l = list;
        this.f12058l = c1343l;
        this.f12057l = charSequence instanceof C5667l ? ((C5667l) charSequence).f12057l : charSequence;
        this.f12061l = AbstractC2296l.crashlytics(charSequence.length(), j);
        this.f12060l = c12814l != null ? new C12814l(AbstractC2296l.crashlytics(charSequence.length(), c12814l.yandex)) : null;
        this.f12062l = c8195l != null ? new C8195l(c8195l.f17098l, new C12814l(AbstractC2296l.crashlytics(charSequence.length(), ((C12814l) c8195l.f17097l).yandex))) : null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f12057l.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5667l.class != obj.getClass()) {
            return false;
        }
        C5667l c5667l = (C5667l) obj;
        if (C12814l.crashlytics(this.f12061l, c5667l.f12061l) && AbstractC8576l.yandex(this.f12060l, c5667l.f12060l) && AbstractC8576l.yandex(this.f12062l, c5667l.f12062l) && AbstractC8576l.yandex(this.f12059l, c5667l.f12059l)) {
            return AbstractC16648l.adcel(this.f12057l, c5667l.f12057l) && AbstractC8576l.yandex(this.f12058l, c5667l.f12058l);
        }
        return false;
    }

    public final int hashCode() {
        int iSubs = (C12814l.subs(this.f12061l) + (this.f12057l.hashCode() * 31)) * 31;
        C12814l c12814l = this.f12060l;
        int iSubs2 = (iSubs + (c12814l != null ? C12814l.subs(c12814l.yandex) : 0)) * 31;
        C8195l c8195l = this.f12062l;
        int iHashCode = (iSubs2 + (c8195l != null ? c8195l.hashCode() : 0)) * 31;
        List list = this.f12059l;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        C1343l c1343l = this.f12058l;
        return iHashCode2 + (c1343l != null ? c1343l.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f12057l.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f12057l.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f12057l.toString();
    }
}
