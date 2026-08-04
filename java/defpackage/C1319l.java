package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؒۚۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1319l implements InterfaceC1525l {
    public final ArrayList yandex;

    public C1319l(ArrayList arrayList) {
        this.yandex = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((C1327l) arrayList.get(0)).loadAd;
            for (int i = 1; i < arrayList.size(); i++) {
                if (((C1327l) arrayList.get(i)).yandex < j) {
                    z = true;
                    break;
                }
                j = ((C1327l) arrayList.get(i)).loadAd;
            }
        }
        AbstractC12442l.admob(!z);
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ byte[] crashlytics() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1319l.class != obj.getClass()) {
            return false;
        }
        return this.yandex.equals(((C1319l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.yandex;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ C5978l yandex() {
        return null;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ void loadAd(C3117l c3117l) {
    }
}
