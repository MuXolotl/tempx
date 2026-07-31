package defpackage;

/* JADX INFO: renamed from: lَٟٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10381l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C10381l yandex;

    static {
        C10381l c10381l = new C10381l();
        yandex = c10381l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.audio.AudioSearchMainResponseDto", c10381l, 7);
        c13637l.smaato("albums", true);
        c13637l.smaato("audios", true);
        c13637l.smaato("artists", true);
        c13637l.smaato("playlists", true);
        c13637l.smaato("own_audios", true);
        c13637l.smaato("own_playlists", true);
        c13637l.smaato("own_albums", true);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C17761l.admob;
        return new InterfaceC16588l[]{interfaceC1220lArr[0].getValue(), interfaceC1220lArr[1].getValue(), interfaceC1220lArr[2].getValue(), interfaceC1220lArr[3].getValue(), interfaceC1220lArr[4].getValue(), interfaceC1220lArr[5].getValue(), interfaceC1220lArr[6].getValue()};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C17761l c17761l = (C17761l) obj;
        C11979l c11979l = c17761l.mopub;
        C11979l c11979l2 = c17761l.billing;
        C11979l c11979l3 = c17761l.purchase;
        C11979l c11979l4 = c17761l.amazon;
        C11979l c11979l5 = c17761l.crashlytics;
        C11979l c11979l6 = c17761l.loadAd;
        C11979l c11979l7 = c17761l.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C17761l.admob;
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(c11979l7, new C11979l())) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).applovin(interfaceC18035l, 0, (InterfaceC16588l) interfaceC1220lArr[0].getValue(), c11979l7);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(c11979l6, new C11979l())) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).applovin(interfaceC18035l, 1, (InterfaceC16588l) interfaceC1220lArr[1].getValue(), c11979l6);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(c11979l5, new C11979l())) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).applovin(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), c11979l5);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(c11979l4, new C11979l())) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).applovin(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), c11979l4);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(c11979l3, new C11979l())) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).applovin(interfaceC18035l, 4, (InterfaceC16588l) interfaceC1220lArr[4].getValue(), c11979l3);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(c11979l2, new C11979l())) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).applovin(interfaceC18035l, 5, (InterfaceC16588l) interfaceC1220lArr[5].getValue(), c11979l2);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(c11979l, new C11979l())) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).applovin(interfaceC18035l, 6, (InterfaceC16588l) interfaceC1220lArr[6].getValue(), c11979l);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C17761l.admob;
        Object obj = null;
        boolean z = true;
        int i = 0;
        C11979l c11979l = null;
        C11979l c11979l2 = null;
        C11979l c11979l3 = null;
        C11979l c11979l4 = null;
        C11979l c11979l5 = null;
        C11979l c11979l6 = null;
        C11979l c11979l7 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    c11979l = (C11979l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 0, (InterfaceC16588l) interfaceC1220lArr[0].getValue(), c11979l);
                    i |= 1;
                    break;
                case 1:
                    c11979l2 = (C11979l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 1, (InterfaceC16588l) interfaceC1220lArr[1].getValue(), c11979l2);
                    i |= 2;
                    break;
                case 2:
                    c11979l3 = (C11979l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), c11979l3);
                    i |= 4;
                    break;
                case 3:
                    c11979l4 = (C11979l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), c11979l4);
                    i |= 8;
                    break;
                case 4:
                    c11979l5 = (C11979l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 4, (InterfaceC16588l) interfaceC1220lArr[4].getValue(), c11979l5);
                    i |= 16;
                    break;
                case 5:
                    c11979l6 = (C11979l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 5, (InterfaceC16588l) interfaceC1220lArr[5].getValue(), c11979l6);
                    i |= 32;
                    break;
                case 6:
                    c11979l7 = (C11979l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 6, (InterfaceC16588l) interfaceC1220lArr[6].getValue(), c11979l7);
                    i |= 64;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return obj;
            }
            obj = null;
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C17761l(i, c11979l, c11979l2, c11979l3, c11979l4, c11979l5, c11979l6, c11979l7);
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
