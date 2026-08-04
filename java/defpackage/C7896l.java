package defpackage;

import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;

/* JADX INFO: renamed from: lًٍۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7896l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C7896l yandex;

    static {
        C7896l c7896l = new C7896l();
        yandex = c7896l;
        C13637l c13637l = new C13637l("ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum", c7896l, 7);
        c13637l.smaato("id", false);
        c13637l.smaato("owner_id", false);
        c13637l.smaato("access_key", false);
        c13637l.smaato("title", false);
        c13637l.smaato("thumb", false);
        c13637l.smaato("main_color", false);
        c13637l.smaato("isCached", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC16588l interfaceC16588lCrashlytics = AbstractC7303l.crashlytics(C1313l.yandex);
        InterfaceC16588l interfaceC16588lCrashlytics2 = AbstractC7303l.crashlytics(C2010l.yandex);
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{interfaceC16588lCrashlytics, interfaceC16588lCrashlytics2, AbstractC7303l.crashlytics(c0194l), c0194l, AbstractC7303l.crashlytics(C7360l.yandex), AbstractC7303l.crashlytics(c0194l), C2796l.yandex};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        AudioAlbum audioAlbum = (AudioAlbum) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        C1313l c1313l = C1313l.yandex;
        Integer num = audioAlbum.yandex;
        boolean z = audioAlbum.mopub;
        interfaceC0039lCrashlytics.startapp(interfaceC18035l, 0, c1313l, num);
        interfaceC0039lCrashlytics.startapp(interfaceC18035l, 1, C2010l.yandex, audioAlbum.loadAd);
        C0194l c0194l = C0194l.yandex;
        interfaceC0039lCrashlytics.startapp(interfaceC18035l, 2, c0194l, audioAlbum.crashlytics);
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.appmetrica(interfaceC18035l, 3, audioAlbum.amazon);
        interfaceC0039lCrashlytics.startapp(interfaceC18035l, 4, C7360l.yandex, audioAlbum.purchase);
        interfaceC0039lCrashlytics.startapp(interfaceC18035l, 5, c0194l, audioAlbum.billing);
        if (interfaceC0039lCrashlytics.ads() || z) {
            abstractC4072l.ad(interfaceC18035l, 6, z);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        boolean z = true;
        int i = 0;
        boolean zIsVip = false;
        Integer num = null;
        Long l = null;
        String str = null;
        String strRemoteconfig = null;
        AlbumThumb albumThumb = null;
        String str2 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 0, C1313l.yandex, num);
                    i |= 1;
                    break;
                case 1:
                    l = (Long) interfaceC14988lCrashlytics.ad(interfaceC18035l, 1, C2010l.yandex, l);
                    i |= 2;
                    break;
                case 2:
                    str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 2, C0194l.yandex, str);
                    i |= 4;
                    break;
                case 3:
                    strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 3);
                    i |= 8;
                    break;
                case 4:
                    albumThumb = (AlbumThumb) interfaceC14988lCrashlytics.ad(interfaceC18035l, 4, C7360l.yandex, albumThumb);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 5, C0194l.yandex, str2);
                    i |= 32;
                    break;
                case 6:
                    zIsVip = interfaceC14988lCrashlytics.isVip(interfaceC18035l, 6);
                    i |= 64;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return null;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        if (63 != (i & 63)) {
            AbstractC11036l.isPro(i, 63, descriptor);
            throw null;
        }
        AudioAlbum audioAlbum = new AudioAlbum();
        audioAlbum.yandex = num;
        audioAlbum.loadAd = l;
        audioAlbum.crashlytics = str;
        audioAlbum.amazon = strRemoteconfig;
        audioAlbum.purchase = albumThumb;
        audioAlbum.billing = str2;
        if ((i & 64) == 0) {
            audioAlbum.mopub = false;
            return audioAlbum;
        }
        audioAlbum.mopub = zIsVip;
        return audioAlbum;
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] yandex() {
        return AbstractC3872l.yandex;
    }
}
