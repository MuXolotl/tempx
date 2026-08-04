package defpackage;

import java.util.Iterator;
import ua.itaysonlab.vkapi2.objects.music.AudioChartInfo;

/* JADX INFO: renamed from: lًؔۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7764l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C7764l yandex;

    static {
        C7764l c7764l = new C7764l();
        yandex = c7764l;
        C13637l c13637l = new C13637l("ua.itaysonlab.vkapi2.objects.music.AudioChartInfo", c7764l, 3);
        c13637l.smaato("position", false);
        c13637l.smaato("state", true);
        c13637l.smaato("stateEnum", true);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = AudioChartInfo.amazon;
        C1313l c1313l = C1313l.yandex;
        return new InterfaceC16588l[]{c1313l, c1313l, interfaceC1220lArr[2].getValue()};
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        Object next;
        AudioChartInfo audioChartInfo = (AudioChartInfo) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = AudioChartInfo.amazon;
        int i = audioChartInfo.yandex;
        EnumC12758l enumC12758l = audioChartInfo.crashlytics;
        int i2 = audioChartInfo.loadAd;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.signatures(0, i, interfaceC18035l);
        if (abstractC4072l.ads() || i2 != -1) {
            abstractC4072l.signatures(1, i2, interfaceC18035l);
        }
        if (abstractC4072l.ads()) {
            abstractC4072l.applovin(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), enumC12758l);
        } else {
            Iterator it = EnumC12758l.f25137l.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((EnumC12758l) next).f25140l != i2);
            EnumC12758l enumC12758l2 = (EnumC12758l) next;
            if (enumC12758l2 == null) {
                enumC12758l2 = EnumC12758l.UNKNOWN;
            }
            if (enumC12758l != enumC12758l2) {
                abstractC4072l.applovin(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), enumC12758l);
            }
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = AudioChartInfo.amazon;
        boolean z = true;
        int i = 0;
        int iSubscription = 0;
        int iSubscription2 = 0;
        EnumC12758l enumC12758l = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 0);
                i |= 1;
            } else if (iAdmob == 1) {
                iSubscription2 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 1);
                i |= 2;
            } else {
                if (iAdmob != 2) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                enumC12758l = (EnumC12758l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), enumC12758l);
                i |= 4;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new AudioChartInfo(i, iSubscription, iSubscription2, enumC12758l);
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
