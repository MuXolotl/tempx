package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؗٝۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5038l implements InterfaceC1525l {
    public final String crashlytics;
    public final String loadAd;
    public final byte[] yandex;

    public C5038l(String str, String str2, byte[] bArr) {
        this.yandex = bArr;
        this.loadAd = str;
        this.crashlytics = str2;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ byte[] crashlytics() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5038l.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.yandex, ((C5038l) obj).yandex);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.yandex);
    }

    @Override // defpackage.InterfaceC1525l
    public final void loadAd(C3117l c3117l) {
        String str = this.loadAd;
        if (str != null) {
            c3117l.yandex = str;
        }
    }

    public final String toString() {
        return AbstractC14814l.remoteconfig(this.yandex.length, "\"", AbstractC14814l.license("ICY: title=\"", this.loadAd, "\", url=\"", this.crashlytics, "\", rawMetadata.length=\""));
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ C5978l yandex() {
        return null;
    }
}
