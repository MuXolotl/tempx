package defpackage;

/* JADX INFO: renamed from: lٖۚٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16619l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C16619l yandex;

    static {
        C16619l c16619l = new C16619l();
        yandex = c16619l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.audio.AudioPlaylistPermissionsDto", c16619l, 7);
        c13637l.smaato("play", true);
        c13637l.smaato("share", true);
        c13637l.smaato("edit", true);
        c13637l.smaato("follow", true);
        c13637l.smaato("delete", true);
        c13637l.smaato("boom_download", true);
        c13637l.smaato("save_as_copy", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C2796l c2796l = C2796l.yandex;
        return new InterfaceC16588l[]{AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics(c2796l)};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C5606l c5606l = (C5606l) obj;
        Boolean bool = c5606l.mopub;
        Boolean bool2 = c5606l.billing;
        Boolean bool3 = c5606l.purchase;
        Boolean bool4 = c5606l.amazon;
        Boolean bool5 = c5606l.crashlytics;
        Boolean bool6 = c5606l.loadAd;
        Boolean bool7 = c5606l.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        if (interfaceC0039lCrashlytics.ads() || bool7 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 0, C2796l.yandex, bool7);
        }
        if (interfaceC0039lCrashlytics.ads() || bool6 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 1, C2796l.yandex, bool6);
        }
        if (interfaceC0039lCrashlytics.ads() || bool5 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 2, C2796l.yandex, bool5);
        }
        if (interfaceC0039lCrashlytics.ads() || bool4 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 3, C2796l.yandex, bool4);
        }
        if (interfaceC0039lCrashlytics.ads() || bool3 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 4, C2796l.yandex, bool3);
        }
        if (interfaceC0039lCrashlytics.ads() || bool2 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 5, C2796l.yandex, bool2);
        }
        if (interfaceC0039lCrashlytics.ads() || bool != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 6, C2796l.yandex, bool);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    break;
                case 0:
                    bool = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 0, C2796l.yandex, bool);
                    i |= 1;
                    break;
                case 1:
                    bool2 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 1, C2796l.yandex, bool2);
                    i |= 2;
                    break;
                case 2:
                    bool3 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 2, C2796l.yandex, bool3);
                    i |= 4;
                    break;
                case 3:
                    bool4 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 3, C2796l.yandex, bool4);
                    i |= 8;
                    break;
                case 4:
                    bool5 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 4, C2796l.yandex, bool5);
                    i |= 16;
                    break;
                case 5:
                    bool6 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 5, C2796l.yandex, bool6);
                    i |= 32;
                    break;
                case 6:
                    bool7 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 6, C2796l.yandex, bool7);
                    i |= 64;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return null;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C5606l(i, bool, bool2, bool3, bool4, bool5, bool6, bool7);
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
