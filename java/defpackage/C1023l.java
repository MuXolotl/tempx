package defpackage;

import j$.time.LocalDateTime;
import j$.time.format.DateTimeParseException;

/* JADX INFO: renamed from: lْؒٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1023l implements InterfaceC16588l {
    public static final C1023l yandex = new C1023l();
    public static final C17606l loadAd = AbstractC16814l.crashlytics("kotlinx.datetime.LocalDateTime");

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        interfaceC17739l.subscription(((C1735l) obj).f4137l.toString());
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        C13435l c13435l = C1735l.Companion;
        String strTapsense = interfaceC10726l.tapsense();
        int i = AbstractC18704l.yandex;
        c13435l.getClass();
        try {
            return new C1735l(LocalDateTime.parse(AbstractC3230l.billing(12, strTapsense.toString())));
        } catch (DateTimeParseException e) {
            throw new C14612l(e);
        }
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return loadAd;
    }
}
