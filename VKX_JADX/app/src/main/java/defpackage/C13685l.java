package defpackage;

import j$.time.YearMonth;
import j$.time.format.DateTimeParseException;

/* JADX INFO: renamed from: lْۜۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13685l implements InterfaceC16588l {
    public static final C13685l yandex = new C13685l();
    public static final C17606l loadAd = AbstractC16814l.crashlytics("kotlinx.datetime.YearMonth");

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        interfaceC17739l.subscription(((C10480l) obj).toString());
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        C13803l c13803l = C10480l.Companion;
        String strTapsense = interfaceC10726l.tapsense();
        C8688l c8688l = AbstractC8525l.loadAd;
        AbstractC17691l abstractC17691l = (AbstractC17691l) c8688l.getValue();
        c13803l.getClass();
        if (abstractC17691l != ((AbstractC17691l) c8688l.getValue())) {
            return (C10480l) abstractC17691l.crashlytics(strTapsense);
        }
        try {
            return new C10480l(YearMonth.parse(AbstractC3230l.billing(3, strTapsense.toString())));
        } catch (DateTimeParseException e) {
            throw new C14612l(e);
        }
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return loadAd;
    }
}
