package defpackage;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lًؖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3975l implements InterfaceC1525l {
    public final List crashlytics;
    public final String loadAd;
    public final String yandex;

    public C3975l(String str, String str2, List list) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ byte[] crashlytics() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3975l.class == obj.getClass()) {
            C3975l c3975l = (C3975l) obj;
            if (TextUtils.equals(this.yandex, c3975l.yandex) && TextUtils.equals(this.loadAd, c3975l.loadAd) && this.crashlytics.equals(c3975l.crashlytics)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.yandex;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.loadAd;
        return this.crashlytics.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.yandex;
        return "HlsTrackMetadataEntry".concat(str != null ? AbstractC0653l.ads(AbstractC5020l.isVip(" [", str, ", "), this.loadAd, "]") : "");
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ C5978l yandex() {
        return null;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ void loadAd(C3117l c3117l) {
    }
}
