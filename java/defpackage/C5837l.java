package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lؘٟٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5837l extends AbstractC0036l {
    public final /* synthetic */ int firebase;

    @Override // defpackage.AbstractC16178l
    public final boolean crashlytics() {
        switch (this.firebase) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            default:
                return true;
        }
    }

    @Override // defpackage.AbstractC16178l
    public final String loadAd() {
        switch (this.firebase) {
            case 0:
                return "EXT-X-ENDLIST";
            case 1:
                return "EXT-X-I-FRAMES-ONLY";
            case 2:
                return "EXT-X-PLAYLIST-TYPE";
            case 3:
                return "EXT-X-TARGETDURATION";
            case 4:
                return "EXT-X-MEDIA-SEQUENCE";
            default:
                return "EXT-X-ALLOW-CACHE";
        }
    }

    @Override // defpackage.AbstractC0036l
    public final void purchase(C7972l c7972l, C9173l c9173l) throws IOException {
        switch (this.firebase) {
            case 0:
                if (!c9173l.billing) {
                    c7972l.m2231implements("EXT-X-ENDLIST");
                }
                break;
            case 1:
                if (c9173l.purchase) {
                    c7972l.m2231implements("EXT-X-I-FRAMES-ONLY");
                }
                break;
            case 2:
                EnumC12305l enumC12305l = c9173l.mopub;
                if (enumC12305l != null) {
                    c7972l.m2225const("EXT-X-PLAYLIST-TYPE", enumC12305l.f24378l);
                }
                break;
            case 3:
                c7972l.m2225const("EXT-X-TARGETDURATION", Integer.toString(c9173l.crashlytics));
                break;
            case 4:
                c7972l.m2225const("EXT-X-MEDIA-SEQUENCE", Integer.toString(c9173l.amazon));
                break;
        }
    }

    private final void billing(C7972l c7972l, C9173l c9173l) {
    }
}
