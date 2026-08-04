package defpackage;

/* JADX INFO: renamed from: lٔۛۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15172l {
    public final AbstractC0593l amazon;
    public final AbstractC13573l crashlytics;
    public final AbstractC15929l loadAd;
    public final AbstractC4115l yandex;

    public C15172l(AbstractC4115l abstractC4115l, AbstractC15929l abstractC15929l, AbstractC13573l abstractC13573l, AbstractC0593l abstractC0593l) {
        this.yandex = abstractC4115l;
        this.loadAd = abstractC15929l;
        this.crashlytics = abstractC13573l;
        this.amazon = abstractC0593l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15172l)) {
            return false;
        }
        C15172l c15172l = (C15172l) obj;
        return this.yandex.equals(c15172l.yandex) && this.loadAd.equals(c15172l.loadAd) && this.crashlytics.equals(c15172l.crashlytics) && this.amazon.equals(c15172l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + ((this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31)) * 31);
    }
}
