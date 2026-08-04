package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lٕٚ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15780l implements InterfaceC7233l {
    public final HashMap crashlytics;
    public final C16289l loadAd;
    public final /* synthetic */ int yandex;

    public C15780l(int i) {
        this.yandex = i;
        switch (i) {
            case 1:
                this.loadAd = new C16289l(this);
                HashMap map = new HashMap();
                this.crashlytics = map;
                map.put("URI", new C15130l(this, 24));
                map.put("BYTERANGE", new C15130l(this, 25));
                break;
            case 2:
                this.loadAd = new C16289l(this);
                HashMap map2 = new HashMap();
                this.crashlytics = map2;
                map2.put("TIME-OFFSET", new C15130l(this, 26));
                map2.put("PRECISE", new C15130l(this, 27));
                break;
            default:
                this.loadAd = new C16289l(this);
                HashMap map3 = new HashMap();
                this.crashlytics = map3;
                map3.put("METHOD", new C15130l(this, 19));
                map3.put("URI", new C15130l(this, 20));
                map3.put("IV", new C15130l(this, 21));
                map3.put("KEYFORMAT", new C15130l(this, 22));
                map3.put("KEYFORMATVERSIONS", new C15130l(this, 23));
                break;
        }
    }

    @Override // defpackage.InterfaceC17896l
    public final void crashlytics(String str, C6344l c6344l) throws C2584l {
        int i = this.yandex;
        HashMap map = this.crashlytics;
        C16289l c16289l = this.loadAd;
        switch (i) {
            case 0:
                c16289l.crashlytics(str, c6344l);
                C10150l c10150l = new C10150l();
                c10150l.amazon = "identity";
                c10150l.purchase = AbstractC6052l.adcel;
                AbstractC17551l.mopub(str, c10150l, c6344l, map, "EXT-X-KEY");
                EnumC17267l enumC17267l = c10150l.yandex;
                String str2 = c10150l.loadAd;
                C4273l c4273l = new C4273l(enumC17267l, str2, c10150l.crashlytics, c10150l.amazon, c10150l.purchase);
                if (enumC17267l != EnumC17267l.NONE && str2 == null) {
                    throw C2584l.yandex("EXT-X-KEY", 26, str);
                }
                ((C3930l) c6344l.f13309l).f8100l = c4273l;
                return;
            case 1:
                c16289l.crashlytics(str, c6344l);
                C14848l c14848l = new C14848l();
                AbstractC17551l.mopub(str, c14848l, c6344l, map, "EXT-X-MAP");
                ((C3930l) c6344l.f13309l).f8090l = new C1790l(c14848l.yandex, c14848l.loadAd);
                return;
            default:
                c16289l.crashlytics(str, c6344l);
                C16105l c16105l = new C16105l();
                AbstractC17551l.mopub(str, c16105l, c6344l, map, "EXT-X-START");
                ((C3930l) c6344l.f13309l).f8094l = new C2421l(c16105l.yandex, c16105l.loadAd);
                return;
        }
    }

    @Override // defpackage.InterfaceC7233l
    public final String loadAd() {
        switch (this.yandex) {
            case 0:
                return "EXT-X-KEY";
            case 1:
                return "EXT-X-MAP";
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
