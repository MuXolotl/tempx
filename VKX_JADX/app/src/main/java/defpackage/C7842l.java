package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: lًؘؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7842l implements InterfaceC7233l {
    public final HashMap crashlytics;
    public final InterfaceC17896l loadAd;
    public final /* synthetic */ int yandex;

    public C7842l(int i) {
        this.yandex = i;
        switch (i) {
            case 1:
                this.loadAd = new C14028l(this);
                HashMap mapAmazon = C14028l.amazon("EXT-X-I-FRAME-STREAM-INF");
                this.crashlytics = mapAmazon;
                mapAmazon.put("URI", new C15130l(this, 15));
                break;
            case 2:
                this.loadAd = new C14028l(this);
                HashMap mapAmazon2 = C14028l.amazon("EXT-X-STREAM-INF");
                this.crashlytics = mapAmazon2;
                mapAmazon2.put("AUDIO", new C15130l(this, 16));
                mapAmazon2.put("SUBTITLES", new C15130l(this, 17));
                mapAmazon2.put("CLOSED-CAPTIONS", new C15130l(this, 18));
                break;
            case 3:
                this.loadAd = new C7263l(this);
                HashMap map = new HashMap();
                this.crashlytics = map;
                map.put("TIME-OFFSET", new C15130l(this, 0));
                map.put("PRECISE", new C15130l(this, 1));
                break;
            default:
                this.loadAd = new C14028l(this);
                HashMap map2 = new HashMap();
                this.crashlytics = map2;
                map2.put("TYPE", new C15130l(this, 5));
                map2.put("URI", new C15130l(this, 6));
                map2.put("GROUP-ID", new C15130l(this, 7));
                map2.put("LANGUAGE", new C15130l(this, 8));
                map2.put("ASSOC-LANGUAGE", new C15130l(this, 9));
                map2.put("NAME", new C15130l(this, 10));
                map2.put("DEFAULT", new C15130l(this, 11));
                map2.put("AUTOSELECT", new C15130l(this, 12));
                map2.put("FORCED", new C15130l(this, 13));
                map2.put("INSTREAM-ID", new C15130l(this, 2));
                map2.put("CHARACTERISTICS", new C15130l(this, 3));
                map2.put("CHANNELS", new C15130l(this, 4));
                break;
        }
    }

    @Override // defpackage.InterfaceC17896l
    public final void crashlytics(String str, C6344l c6344l) throws C2584l {
        int i = this.yandex;
        HashMap map = this.crashlytics;
        InterfaceC17896l interfaceC17896l = this.loadAd;
        switch (i) {
            case 0:
                ((C14028l) interfaceC17896l).crashlytics(str, c6344l);
                C16576l c16576l = new C16576l();
                c16576l.smaato = -1;
                C5390l c5390l = (C5390l) c6344l.f13307l;
                c5390l.f11538l = false;
                c5390l.f11544l = false;
                AbstractC17551l.mopub(str, c16576l, c6344l, map, "EXT-X-MEDIA");
                ((ArrayList) ((C5390l) c6344l.f13307l).f11539l).add(new C9221l(c16576l.yandex, c16576l.loadAd, c16576l.crashlytics, c16576l.amazon, c16576l.purchase, c16576l.billing, c16576l.mopub, c16576l.admob, c16576l.subs, c16576l.isPro, c16576l.firebase, c16576l.smaato));
                return;
            case 1:
                ((C14028l) interfaceC17896l).crashlytics(str, c6344l);
                C8718l c8718l = new C8718l();
                c8718l.yandex = -1;
                c8718l.loadAd = -1;
                c8718l.purchase = Float.NaN;
                AbstractC17551l.mopub(str, c8718l, c6344l, map, "EXT-X-I-FRAME-STREAM-INF");
                ((C5390l) c6344l.f13307l).f11541l.add(new C8205l(c8718l.yandex, c8718l.loadAd, c8718l.crashlytics, c8718l.amazon, c8718l.purchase, c8718l.billing, c8718l.mopub));
                return;
            case 2:
                ((C14028l) interfaceC17896l).crashlytics(str, c6344l);
                C9123l c9123l = new C9123l();
                c9123l.yandex = -1;
                c9123l.loadAd = -1;
                c9123l.purchase = Float.NaN;
                AbstractC17551l.mopub(str, c9123l, c6344l, map, "EXT-X-STREAM-INF");
                ((C5390l) c6344l.f13307l).f11540l = new C12431l(c9123l.yandex, c9123l.loadAd, c9123l.crashlytics, c9123l.amazon, c9123l.purchase, c9123l.billing, c9123l.mopub, c9123l.admob, c9123l.subs);
                return;
            default:
                if (((C2421l) c6344l.f13304l) != null) {
                    throw C2584l.yandex("EXT-X-START", 30, str);
                }
                C16105l c16105l = new C16105l();
                ((C7263l) interfaceC17896l).crashlytics(str, c6344l);
                AbstractC17551l.mopub(str, c16105l, c6344l, map, "EXT-X-START");
                c6344l.f13304l = new C2421l(c16105l.yandex, c16105l.loadAd);
                return;
        }
    }

    @Override // defpackage.InterfaceC7233l
    public final String loadAd() {
        switch (this.yandex) {
            case 0:
                return "EXT-X-MEDIA";
            case 1:
                return "EXT-X-I-FRAME-STREAM-INF";
            case 2:
                return "EXT-X-STREAM-INF";
            default:
                return "EXT-X-START";
        }
    }

    @Override // defpackage.InterfaceC7233l
    public final boolean yandex() {
        switch (this.yandex) {
        }
        return true;
    }
}
