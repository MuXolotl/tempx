package defpackage;

import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastCover;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastInfo;

/* JADX INFO: renamed from: lٟؑٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0482l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C0482l yandex;

    static {
        C0482l c0482l = new C0482l();
        yandex = c0482l;
        C13637l c13637l = new C13637l("ua.itaysonlab.vkapi2.objects.podcasts.PodcastInfo", c0482l, 6);
        c13637l.smaato("cover", false);
        c13637l.smaato("plays", false);
        c13637l.smaato("is_favorite", false);
        c13637l.smaato("description", false);
        c13637l.smaato("position", false);
        c13637l.smaato("thumb", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C1313l c1313l = C1313l.yandex;
        return new InterfaceC16588l[]{C10993l.yandex, c1313l, AbstractC7303l.crashlytics(C2796l.yandex), AbstractC7303l.crashlytics(C0194l.yandex), AbstractC7303l.crashlytics(c1313l), C7360l.yandex};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        PodcastInfo podcastInfo = (PodcastInfo) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        C10993l c10993l = C10993l.yandex;
        PodcastCover podcastCover = podcastInfo.yandex;
        AlbumThumb albumThumb = podcastInfo.billing;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.applovin(interfaceC18035l, 0, c10993l, podcastCover);
        abstractC4072l.signatures(1, podcastInfo.loadAd, interfaceC18035l);
        abstractC4072l.startapp(interfaceC18035l, 2, C2796l.yandex, podcastInfo.crashlytics);
        abstractC4072l.startapp(interfaceC18035l, 3, C0194l.yandex, podcastInfo.amazon);
        abstractC4072l.startapp(interfaceC18035l, 4, C1313l.yandex, podcastInfo.purchase);
        if (abstractC4072l.ads() || !AbstractC8576l.yandex(albumThumb, new AlbumThumb((String) null, (String) null, podcastCover.yandex("c"), podcastInfo.yandex(), podcastInfo.loadAd(), 3))) {
            abstractC4072l.applovin(interfaceC18035l, 5, C7360l.yandex, albumThumb);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        boolean z = true;
        int i = 0;
        int iSubscription = 0;
        PodcastCover podcastCover = null;
        Boolean bool = null;
        String str = null;
        Integer num = null;
        AlbumThumb albumThumb = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    break;
                case 0:
                    podcastCover = (PodcastCover) interfaceC14988lCrashlytics.ads(interfaceC18035l, 0, C10993l.yandex, podcastCover);
                    i |= 1;
                    break;
                case 1:
                    iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 1);
                    i |= 2;
                    break;
                case 2:
                    bool = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 2, C2796l.yandex, bool);
                    i |= 4;
                    break;
                case 3:
                    str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 3, C0194l.yandex, str);
                    i |= 8;
                    break;
                case 4:
                    num = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 4, C1313l.yandex, num);
                    i |= 16;
                    break;
                case 5:
                    albumThumb = (AlbumThumb) interfaceC14988lCrashlytics.ads(interfaceC18035l, 5, C7360l.yandex, albumThumb);
                    i |= 32;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return null;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new PodcastInfo(i, podcastCover, iSubscription, bool, str, num, albumThumb);
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
