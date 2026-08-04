package defpackage;

/* JADX INFO: renamed from: lِٖؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11871l implements InterfaceC13593l {
    public static final /* synthetic */ C13637l loadAd;
    public static final C11871l yandex;

    static {
        C11871l c11871l = new C11871l();
        yandex = c11871l;
        loadAd = new C13637l("org.mongodb.kbson.serialization.BsonValueSerializer.BsonValueJson", c11871l, 0);
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        return new InterfaceC16588l[0];
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C13637l c13637l = loadAd;
        interfaceC17739l.crashlytics(c13637l).yandex(c13637l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        C13637l c13637l = loadAd;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(c13637l);
        int iAdmob = interfaceC14988lCrashlytics.admob(c13637l);
        if (iAdmob == -1) {
            interfaceC14988lCrashlytics.yandex(c13637l);
            return new C15566l();
        }
        C8936l.mopub(iAdmob);
        return null;
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
