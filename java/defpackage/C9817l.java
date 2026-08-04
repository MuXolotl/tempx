package defpackage;

import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍۛٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9817l implements InterfaceC9094l {
    public static final LinkedHashSet billing = new LinkedHashSet();
    public static final C12899l mopub = new C12899l(11);
    public final C12242l amazon;
    public final Function2 crashlytics;
    public final C15053l loadAd;
    public final C8688l purchase;
    public final AbstractC5921l yandex;

    public C9817l(AbstractC5921l abstractC5921l, C15053l c15053l, C12242l c12242l) {
        C8163l c8163l = new C8163l(2);
        this.yandex = abstractC5921l;
        this.loadAd = c15053l;
        this.crashlytics = c8163l;
        this.amazon = c12242l;
        this.purchase = new C8688l(new C11877l(this, 1));
    }

    @Override // defpackage.InterfaceC9094l
    public final InterfaceC5137l yandex() {
        String strTapsense = ((C14025l) this.purchase.getValue()).f27331l.tapsense();
        synchronized (mopub) {
            LinkedHashSet linkedHashSet = billing;
            if (linkedHashSet.contains(strTapsense)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + strTapsense + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            linkedHashSet.add(strTapsense);
        }
        return new C8440l(this.yandex, (C14025l) this.purchase.getValue(), this.loadAd, (InterfaceC4335l) this.crashlytics.invoke((C14025l) this.purchase.getValue(), this.yandex), new C11877l(this, 0));
    }
}
