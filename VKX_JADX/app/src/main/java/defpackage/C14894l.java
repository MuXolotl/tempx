package defpackage;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* JADX INFO: renamed from: lٔٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14894l {
    public final C18662l yandex;
    public final C5138l loadAd = new C5138l((byte) 0, 9);
    public final Object crashlytics = new Object();
    public final LinkedHashMap amazon = new LinkedHashMap();
    public final CopyOnWriteArrayList purchase = new CopyOnWriteArrayList();

    public C14894l(C11969l c11969l, C5172l c5172l, InterfaceC7042l interfaceC7042l) {
        this.yandex = AbstractC11990l.yandex(AbstractC10586l.billing(new C2993l(interfaceC7042l), AbstractC10586l.billing(c11969l.billing, new C0499l("CXCP-AudioRestrictionControllerImpl"))));
        c5172l.crashlytics(2, new RunnableC16112l(8, this));
    }

    public final void amazon(C2667l c2667l) {
        synchronized (this.crashlytics) {
            C17887l c17887lLoadAd = loadAd();
            this.amazon.remove(c2667l);
            C17887l c17887lLoadAd2 = loadAd();
            if (c17887lLoadAd2 != null && !c17887lLoadAd2.equals(c17887lLoadAd)) {
                InterfaceC14029l interfaceC14029l = null;
                AbstractC10999l.mopub(this.yandex, null, 4, new C0384l(this.loadAd, new C13624l(this, c17887lLoadAd2, interfaceC14029l, 1), interfaceC14029l, 24), 1);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void crashlytics() {
        synchronized (this.crashlytics) {
        }
    }

    public final C17887l loadAd() {
        LinkedHashMap linkedHashMap = this.amazon;
        if (linkedHashMap.containsValue(new C17887l(3))) {
            return new C17887l(3);
        }
        synchronized (this.crashlytics) {
        }
        if (linkedHashMap.containsValue(new C17887l(1))) {
            return new C17887l(1);
        }
        crashlytics();
        if (linkedHashMap.containsValue(new C17887l(0))) {
            return new C17887l(0);
        }
        crashlytics();
        return null;
    }

    public final void yandex(C2910l c2910l) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        synchronized (this.crashlytics) {
            try {
                this.purchase.add(c2910l);
                C17887l c17887lLoadAd = loadAd();
                if (c17887lLoadAd != null) {
                    InterfaceC14029l interfaceC14029l = null;
                    AbstractC10999l.mopub(this.yandex, null, 4, new C0384l(this.loadAd, new C13624l(c2910l, c17887lLoadAd, interfaceC14029l, 0), interfaceC14029l, 24), 1);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
