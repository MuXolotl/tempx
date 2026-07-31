package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؒٞۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1223l implements InterfaceC7233l {
    public final /* synthetic */ int yandex = 0;

    @Override // defpackage.InterfaceC17896l
    public final void crashlytics(String str, C6344l c6344l) throws C2584l {
        switch (this.yandex) {
            case 0:
                if (c6344l.f13306l) {
                    throw C2584l.yandex("EXTM3U", 30, str);
                }
                c6344l.f13306l = true;
                return;
            default:
                ((ArrayList) c6344l.f13308l).add(str);
                return;
        }
    }

    @Override // defpackage.InterfaceC7233l
    public final String loadAd() {
        switch (this.yandex) {
            case 0:
                return "EXTM3U";
            default:
                return null;
        }
    }

    @Override // defpackage.InterfaceC7233l
    public final boolean yandex() {
        switch (this.yandex) {
        }
        return false;
    }
}
