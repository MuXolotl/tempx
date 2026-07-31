package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: l٘ؓۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17645l implements InterfaceC16588l {
    public abstract Iterator admob(Object obj);

    public abstract Object billing();

    public abstract void firebase(InterfaceC14988l interfaceC14988l, int i, Object obj);

    public final Object isPro(InterfaceC10726l interfaceC10726l) {
        Object objBilling = billing();
        int iMopub = mopub(objBilling);
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(purchase());
        while (true) {
            int iAdmob = interfaceC14988lCrashlytics.admob(purchase());
            if (iAdmob == -1) {
                interfaceC14988lCrashlytics.yandex(purchase());
                return remoteconfig(objBilling);
            }
            firebase(interfaceC14988lCrashlytics, iAdmob + iMopub, objBilling);
        }
    }

    @Override // defpackage.InterfaceC16588l
    public Object loadAd(InterfaceC10726l interfaceC10726l) {
        return isPro(interfaceC10726l);
    }

    public abstract int mopub(Object obj);

    public abstract Object remoteconfig(Object obj);

    public abstract Object smaato(Object obj);

    public abstract int subs(Object obj);
}
