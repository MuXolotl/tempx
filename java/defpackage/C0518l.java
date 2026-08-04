package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lُؑۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0518l extends AbstractC16178l {
    public final /* synthetic */ int crashlytics;

    public /* synthetic */ C0518l(int i) {
        this.crashlytics = i;
    }

    @Override // defpackage.AbstractC16178l
    public final boolean crashlytics() {
        switch (this.crashlytics) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.AbstractC16178l
    public final String loadAd() {
        switch (this.crashlytics) {
            case 0:
                return "EXTM3U";
            default:
                return "EXT-X-VERSION";
        }
    }

    @Override // defpackage.AbstractC16178l, defpackage.InterfaceC7922l
    public void yandex(C7972l c7972l, C2434l c2434l) throws IOException {
        switch (this.crashlytics) {
            case 1:
                c7972l.m2225const("EXT-X-VERSION", Integer.toString(c2434l.amazon));
                break;
            default:
                super.yandex(c7972l, c2434l);
                break;
        }
    }
}
