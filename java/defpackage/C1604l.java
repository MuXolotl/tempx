package defpackage;

import j$.time.LocalTime;
import j$.time.format.DateTimeParseException;

/* JADX INFO: renamed from: lؓؕٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1604l implements InterfaceC16588l {
    public static final C1604l yandex = new C1604l();
    public static final C17606l loadAd = AbstractC16814l.crashlytics("kotlinx.datetime.LocalTime");

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        interfaceC17739l.subscription(((C5864l) obj).f12356l.toString());
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        C16096l c16096l = C5864l.Companion;
        String strTapsense = interfaceC10726l.tapsense();
        C8688l c8688l = AbstractC12412l.yandex;
        C5990l c5990l = (C5990l) c8688l.getValue();
        c16096l.getClass();
        if (c5990l != ((C5990l) c8688l.getValue())) {
            return (C5864l) c5990l.crashlytics(strTapsense);
        }
        try {
            return new C5864l(LocalTime.parse(strTapsense));
        } catch (DateTimeParseException e) {
            throw new C14612l(e);
        }
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return loadAd;
    }
}
