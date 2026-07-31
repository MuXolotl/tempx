package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lِۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12130l {
    public final C18120l loadAd;
    public final ArrayList yandex;

    public C12130l(ArrayList arrayList, C18120l c18120l) {
        this.yandex = arrayList;
        this.loadAd = c18120l;
        AbstractC5641l.loadAd(!arrayList.isEmpty(), "Camera ID set cannot be empty.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12130l)) {
            return false;
        }
        C12130l c12130l = (C12130l) obj;
        return this.yandex.equals(c12130l.yandex) && AbstractC8576l.yandex(this.loadAd, c12130l.loadAd);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        C18120l c18120l = this.loadAd;
        return iHashCode + (c18120l != null ? c18120l.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CameraIdentifier{cameraIds=");
        sb.append(AbstractC16901l.m4210case(this.yandex, ",", null, null, null, 62));
        C18120l c18120l = this.loadAd;
        if (c18120l != null) {
            str = ", compatId=" + c18120l;
        } else {
            str = "";
        }
        return AbstractC2812l.tapsense(sb, str, '}');
    }

    public final String yandex() {
        ArrayList arrayList = this.yandex;
        AbstractC5641l.purchase("getInternalId() is only available for single-camera identifiers.", arrayList.size() == 1);
        return (String) AbstractC16901l.m4231native(arrayList);
    }
}
