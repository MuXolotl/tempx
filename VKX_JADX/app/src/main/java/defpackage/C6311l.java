package defpackage;

import j$.time.LocalDate;
import j$.time.format.DateTimeParseException;

/* JADX INFO: renamed from: lؙؚؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6311l implements InterfaceC16588l {
    public static final C6311l yandex = new C6311l();
    public static final C17606l loadAd = AbstractC16814l.crashlytics("kotlinx.datetime.LocalDate");

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        interfaceC17739l.subscription(((C0378l) obj).f1462l.toString());
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        C1460l c1460l = C0378l.Companion;
        String strTapsense = interfaceC10726l.tapsense();
        int i = AbstractC9537l.yandex;
        C8688l c8688l = AbstractC8258l.yandex;
        AbstractC17691l abstractC17691l = (AbstractC17691l) c8688l.getValue();
        c1460l.getClass();
        if (abstractC17691l != ((AbstractC17691l) c8688l.getValue())) {
            return (C0378l) abstractC17691l.crashlytics(strTapsense);
        }
        try {
            return new C0378l(LocalDate.parse(AbstractC3230l.billing(6, strTapsense.toString())));
        } catch (DateTimeParseException e) {
            throw new C14612l(e);
        }
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return loadAd;
    }
}
