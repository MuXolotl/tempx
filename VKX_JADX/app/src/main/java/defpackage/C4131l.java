package defpackage;

/* JADX INFO: renamed from: lٕؖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4131l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C4131l yandex;

    static {
        C4131l c4131l = new C4131l();
        yandex = c4131l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.audiobook.AudioBooksChapterDto", c4131l, 7);
        c13637l.smaato("audio_file", false);
        c13637l.smaato("id", false);
        c13637l.smaato("progress_status", false);
        c13637l.smaato("progress_time", true);
        c13637l.smaato("special_project_id", true);
        c13637l.smaato("title", false);
        c13637l.smaato("track_code", false);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C6393l.admob;
        C0194l c0194l = C0194l.yandex;
        C1313l c1313l = C1313l.yandex;
        return new InterfaceC16588l[]{C9623l.yandex, c0194l, interfaceC1220lArr[2].getValue(), c1313l, AbstractC7303l.crashlytics(c1313l), c0194l, c0194l};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C6393l c6393l = (C6393l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C6393l.admob;
        C9623l c9623l = C9623l.yandex;
        C17383l c17383l = c6393l.yandex;
        Integer num = c6393l.purchase;
        int i = c6393l.amazon;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.applovin(interfaceC18035l, 0, c9623l, c17383l);
        abstractC4072l.appmetrica(interfaceC18035l, 1, c6393l.loadAd);
        abstractC4072l.applovin(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), c6393l.crashlytics);
        if (abstractC4072l.ads() || i != 0) {
            abstractC4072l.signatures(3, i, interfaceC18035l);
        }
        if (abstractC4072l.ads() || num != null) {
            abstractC4072l.startapp(interfaceC18035l, 4, C1313l.yandex, num);
        }
        abstractC4072l.appmetrica(interfaceC18035l, 5, c6393l.billing);
        abstractC4072l.appmetrica(interfaceC18035l, 6, c6393l.mopub);
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C6393l.admob;
        Object obj = null;
        boolean z = true;
        int i = 0;
        int iSubscription = 0;
        C17383l c17383l = null;
        String strRemoteconfig = null;
        EnumC11113l enumC11113l = null;
        Integer num = null;
        String strRemoteconfig2 = null;
        String strRemoteconfig3 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    c17383l = (C17383l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 0, C9623l.yandex, c17383l);
                    i |= 1;
                    break;
                case 1:
                    strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 1);
                    i |= 2;
                    break;
                case 2:
                    enumC11113l = (EnumC11113l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), enumC11113l);
                    i |= 4;
                    break;
                case 3:
                    iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 3);
                    i |= 8;
                    break;
                case 4:
                    num = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 4, C1313l.yandex, num);
                    i |= 16;
                    break;
                case 5:
                    strRemoteconfig2 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 5);
                    i |= 32;
                    continue;
                case 6:
                    strRemoteconfig3 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 6);
                    i |= 64;
                    continue;
                default:
                    C8936l.mopub(iAdmob);
                    return obj;
            }
            obj = null;
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C6393l(i, c17383l, strRemoteconfig, enumC11113l, iSubscription, num, strRemoteconfig2, strRemoteconfig3);
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
