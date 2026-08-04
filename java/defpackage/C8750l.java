package defpackage;

/* JADX INFO: renamed from: lٌْٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8750l {
    public static final C8750l amazon = new C8750l(new C11916l[0]);
    public static final String purchase;
    public int crashlytics;
    public final C13708l loadAd;
    public final int yandex;

    static {
        String str = AbstractC15323l.yandex;
        purchase = Integer.toString(0, 36);
    }

    public C8750l(C11916l... c11916lArr) {
        C13708l c13708lPro = AbstractC1186l.pro(c11916lArr);
        this.loadAd = c13708lPro;
        this.yandex = c11916lArr.length;
        int i = 0;
        while (i < c13708lPro.f26765l) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < c13708lPro.f26765l; i3++) {
                if (((C11916l) c13708lPro.get(i)).equals(c13708lPro.get(i3))) {
                    AbstractC6427l.subs("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8750l.class != obj.getClass()) {
            return false;
        }
        C8750l c8750l = (C8750l) obj;
        return this.yandex == c8750l.yandex && this.loadAd.equals(c8750l.loadAd);
    }

    public final int hashCode() {
        if (this.crashlytics == 0) {
            this.crashlytics = this.loadAd.hashCode();
        }
        return this.crashlytics;
    }

    public final int loadAd(C11916l c11916l) {
        int iIndexOf = this.loadAd.indexOf(c11916l);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final String toString() {
        return this.loadAd.toString();
    }

    public final C11916l yandex(int i) {
        return (C11916l) this.loadAd.get(i);
    }
}
