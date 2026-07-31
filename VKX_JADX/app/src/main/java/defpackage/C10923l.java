package defpackage;

/* JADX INFO: renamed from: lٌُٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10923l {
    public final int crashlytics;
    public final C16222l loadAd;
    public final AbstractC18586l yandex;

    public C10923l(AbstractC18586l abstractC18586l, int i) {
        abstractC18586l = (i & 1) != 0 ? new C12040l(-1.0f) : abstractC18586l;
        C16222l c16222l = new C16222l(5);
        int i2 = (i & 8) != 0 ? 0 : 200;
        this.yandex = abstractC18586l;
        this.loadAd = c16222l;
        this.crashlytics = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10923l)) {
            return false;
        }
        C10923l c10923l = (C10923l) obj;
        return this.yandex.equals(c10923l.yandex) && this.loadAd.equals(c10923l.loadAd) && this.crashlytics == c10923l.crashlytics;
    }

    public final int hashCode() {
        return ((((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31) + 1231) * 31) + this.crashlytics;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadImageConfig(rounding=");
        sb.append(this.yandex);
        sb.append(", blur=");
        sb.append(this.loadAd);
        sb.append(", crossfade=true, size=");
        return AbstractC0653l.adcel(sb, this.crashlytics, ')');
    }
}
