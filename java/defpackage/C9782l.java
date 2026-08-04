package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lٍۙؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9782l implements InterfaceC7233l {
    public final InterfaceC17896l loadAd;
    public final /* synthetic */ int yandex;

    public C9782l(int i) {
        this.yandex = i;
        switch (i) {
            case 1:
                this.loadAd = new C16289l(this);
                break;
            case 2:
                this.loadAd = new C16289l(this);
                break;
            case 3:
                this.loadAd = new C16289l(this);
                break;
            case 4:
                this.loadAd = new C16289l(this);
                break;
            case 5:
                this.loadAd = new C16289l(this);
                break;
            case 6:
                this.loadAd = new C16289l(this);
                break;
            case 7:
                this.loadAd = new C16289l(this);
                break;
            case 8:
                this.loadAd = new C16289l(this);
                break;
            case 9:
                this.loadAd = new C16289l(this);
                break;
            case 10:
                this.loadAd = new C7263l(this);
                break;
            default:
                this.loadAd = new C16289l(this);
                break;
        }
    }

    @Override // defpackage.InterfaceC17896l
    public final void crashlytics(String str, C6344l c6344l) throws C2584l {
        int i = this.yandex;
        InterfaceC17896l interfaceC17896l = this.loadAd;
        switch (i) {
            case 0:
                ((C16289l) interfaceC17896l).crashlytics(str, c6344l);
                AbstractC17551l.purchase(AbstractC6052l.vip, str, "EXT-X-DISCONTINUITY");
                ((C3930l) c6344l.f13309l).f8099l = true;
                return;
            case 1:
                ((C16289l) interfaceC17896l).crashlytics(str, c6344l);
                Matcher matcherPurchase = AbstractC17551l.purchase(AbstractC6052l.metrica, str, "EXT-X-BYTERANGE");
                ((C3930l) c6344l.f13309l).f8103l = AbstractC17551l.billing(matcherPurchase);
                return;
            case 2:
                ((C16289l) interfaceC17896l).crashlytics(str, c6344l);
                AbstractC17551l.purchase(AbstractC6052l.smaato, str, "EXT-X-ENDLIST");
                ((C3930l) c6344l.f13309l).f8102l = true;
                return;
            case 3:
                ((C16289l) interfaceC17896l).crashlytics(str, c6344l);
                AbstractC17551l.purchase(AbstractC6052l.remoteconfig, str, "EXT-X-I-FRAMES-ONLY");
                if (c6344l.f13305l < 4) {
                    throw C2584l.yandex("EXT-X-I-FRAMES-ONLY", 40, null);
                }
                if (((C5390l) c6344l.f13307l) != null) {
                    throw new C2584l(22, null);
                }
                ((C3930l) c6344l.f13309l).f8101l = true;
                return;
            case 4:
                ((C16289l) interfaceC17896l).crashlytics(str, c6344l);
                Matcher matcherPurchase2 = AbstractC17551l.purchase(AbstractC6052l.admob, str, "EXT-X-PLAYLIST-TYPE");
                C3930l c3930l = (C3930l) c6344l.f13309l;
                if (c3930l.f8092l != null) {
                    throw C2584l.yandex("EXT-X-PLAYLIST-TYPE", 30, str);
                }
                String strGroup = matcherPurchase2.group(1);
                try {
                    c3930l.f8092l = (EnumC12305l) Enum.valueOf(EnumC12305l.class, strGroup);
                    return;
                } catch (IllegalArgumentException unused) {
                    throw C2584l.yandex("EXT-X-PLAYLIST-TYPE", 32, strGroup);
                }
            case 5:
                ((C16289l) interfaceC17896l).crashlytics(str, c6344l);
                Pattern pattern = AbstractC6052l.subs;
                AbstractC17551l.purchase(pattern, str, "EXT-X-PROGRAM-DATE-TIME");
                C3930l c3930l2 = (C3930l) c6344l.f13309l;
                if (c3930l2.f8096l != null) {
                    throw C2584l.yandex("EXT-X-PROGRAM-DATE-TIME", 30, str);
                }
                Matcher matcher = pattern.matcher(str);
                if (!matcher.matches()) {
                    throw new C2584l(19, "EXT-X-PROGRAM-DATE-TIME");
                }
                c3930l2.f8096l = matcher.group(1);
                return;
            case 6:
                ((C16289l) interfaceC17896l).crashlytics(str, c6344l);
                Matcher matcherPurchase3 = AbstractC17551l.purchase(AbstractC6052l.billing, str, "EXT-X-TARGETDURATION");
                C3930l c3930l3 = (C3930l) c6344l.f13309l;
                if (c3930l3.f8098l != null) {
                    throw C2584l.yandex("EXT-X-TARGETDURATION", 30, str);
                }
                c3930l3.f8098l = Integer.valueOf(AbstractC17551l.admob(matcherPurchase3.group(1), "EXT-X-TARGETDURATION"));
                return;
            case 7:
                ((C16289l) interfaceC17896l).crashlytics(str, c6344l);
                Matcher matcherPurchase4 = AbstractC17551l.purchase(AbstractC6052l.mopub, str, "EXT-X-MEDIA-SEQUENCE");
                C3930l c3930l4 = (C3930l) c6344l.f13309l;
                if (c3930l4.f8097l != null) {
                    throw C2584l.yandex("EXT-X-MEDIA-SEQUENCE", 30, str);
                }
                c3930l4.f8097l = Integer.valueOf(AbstractC17551l.admob(matcherPurchase4.group(1), "EXT-X-MEDIA-SEQUENCE"));
                return;
            case 8:
                ((C16289l) interfaceC17896l).crashlytics(str, c6344l);
                return;
            case 9:
                ((C16289l) interfaceC17896l).crashlytics(str, c6344l);
                Matcher matcherPurchase5 = AbstractC17551l.purchase(AbstractC6052l.firebase, str, "EXTINF");
                C3930l c3930l5 = (C3930l) c6344l.f13309l;
                String strGroup2 = matcherPurchase5.group(1);
                try {
                    c3930l5.f8093l = new C11520l(matcherPurchase5.group(2), Float.parseFloat(strGroup2));
                    return;
                } catch (NumberFormatException unused2) {
                    throw C2584l.yandex("EXTINF", 33, strGroup2);
                }
            default:
                ((C7263l) interfaceC17896l).crashlytics(str, c6344l);
                Matcher matcherPurchase6 = AbstractC17551l.purchase(AbstractC6052l.purchase, str, "EXT-X-VERSION");
                if (c6344l.f13305l != -1) {
                    throw C2584l.yandex("EXT-X-VERSION", 30, str);
                }
                int iAdmob = AbstractC17551l.admob(matcherPurchase6.group(1), "EXT-X-VERSION");
                if (iAdmob < 1) {
                    throw C2584l.yandex("EXT-X-VERSION", 10, str);
                }
                if (iAdmob > Integer.MAX_VALUE) {
                    throw C2584l.yandex("EXT-X-VERSION", 37, str);
                }
                c6344l.f13305l = iAdmob;
                return;
        }
    }

    @Override // defpackage.InterfaceC7233l
    public final String loadAd() {
        switch (this.yandex) {
            case 0:
                return "EXT-X-DISCONTINUITY";
            case 1:
                return "EXT-X-BYTERANGE";
            case 2:
                return "EXT-X-ENDLIST";
            case 3:
                return "EXT-X-I-FRAMES-ONLY";
            case 4:
                return "EXT-X-PLAYLIST-TYPE";
            case 5:
                return "EXT-X-PROGRAM-DATE-TIME";
            case 6:
                return "EXT-X-TARGETDURATION";
            case 7:
                return "EXT-X-MEDIA-SEQUENCE";
            case 8:
                return "EXT-X-ALLOW-CACHE";
            case 9:
                return "EXTINF";
            default:
                return "EXT-X-VERSION";
        }
    }

    @Override // defpackage.InterfaceC7233l
    public final boolean yandex() {
        switch (this.yandex) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                return false;
            case 4:
                return true;
            case 5:
                return true;
            case 6:
                return true;
            case 7:
                return true;
            case 8:
                return true;
            case 9:
                return true;
            default:
                return true;
        }
    }
}
