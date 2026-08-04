package defpackage;

/* JADX INFO: renamed from: lٗٚۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17232l {
    public C3625l loadAd;
    public final C3625l yandex;
    public boolean crashlytics = false;
    public C15999l amazon = null;

    public C17232l(C3625l c3625l, C3625l c3625l2) {
        this.yandex = c3625l;
        this.loadAd = c3625l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17232l)) {
            return false;
        }
        C17232l c17232l = (C17232l) obj;
        return AbstractC8576l.yandex(this.yandex, c17232l.yandex) && AbstractC8576l.yandex(this.loadAd, c17232l.loadAd) && this.crashlytics == c17232l.crashlytics && AbstractC8576l.yandex(this.amazon, c17232l.amazon);
    }

    public final int hashCode() {
        int iHashCode = (((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31) + (this.crashlytics ? 1231 : 1237)) * 31;
        C15999l c15999l = this.amazon;
        return iHashCode + (c15999l == null ? 0 : c15999l.hashCode());
    }

    public final String toString() {
        C3625l c3625l = this.loadAd;
        return "TextSubstitutionValue(original=" + ((Object) this.yandex) + ", substitution=" + ((Object) c3625l) + ", isShowingSubstitution=" + this.crashlytics + ", layoutCache=" + this.amazon + ")";
    }
}
