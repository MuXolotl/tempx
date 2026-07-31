package defpackage;

/* JADX INFO: renamed from: lُۣٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11437l implements InterfaceC13593l {
    public static final /* synthetic */ C13637l loadAd;
    public static final C11437l yandex;

    static {
        C11437l c11437l = new C11437l();
        yandex = c11437l;
        C13637l c13637l = new C13637l("org.mongodb.kbson.serialization.BsonMinKeySerializer.BsonValueJson", c11437l, 1);
        c13637l.smaato("$minKey", false);
        loadAd = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        return new InterfaceC16588l[]{C1313l.yandex};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C13637l c13637l = loadAd;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(c13637l);
        ((AbstractC4072l) interfaceC0039lCrashlytics).signatures(0, ((C7915l) obj).yandex, c13637l);
        interfaceC0039lCrashlytics.yandex(c13637l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        C13637l c13637l = loadAd;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(c13637l);
        boolean z = true;
        int i = 0;
        int iSubscription = 0;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(c13637l);
            if (iAdmob == -1) {
                z = false;
            } else {
                if (iAdmob != 0) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                iSubscription = interfaceC14988lCrashlytics.subscription(c13637l, 0);
                i = 1;
            }
        }
        interfaceC14988lCrashlytics.yandex(c13637l);
        return new C7915l(i, iSubscription);
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return loadAd;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] yandex() {
        return AbstractC3872l.yandex;
    }
}
