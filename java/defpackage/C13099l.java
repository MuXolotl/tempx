package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lْٟؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13099l implements InterfaceC2373l {
    public final String crashlytics;
    public final String loadAd = "";
    public final List yandex;

    public C13099l(List list) {
        this.yandex = list;
        this.crashlytics = "passthrough_" + list.hashCode();
    }

    @Override // defpackage.InterfaceC17817l
    public final boolean billing() {
        return false;
    }

    @Override // defpackage.InterfaceC17817l
    public final String crashlytics() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC17817l
    public final String getId() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC17817l
    public final String mopub() {
        return null;
    }

    @Override // defpackage.InterfaceC2373l
    public final Object yandex(InterfaceC14029l interfaceC14029l) {
        return this.yandex;
    }
}
