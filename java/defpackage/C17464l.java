package defpackage;

import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: lٗۡؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17464l {
    public Cloneable admob;
    public Object amazon;
    public Object billing;
    public boolean crashlytics;
    public boolean loadAd;
    public Serializable mopub;
    public Object purchase;
    public boolean yandex;

    public C17464l(InterfaceC3187l interfaceC3187l, C5767l c5767l) {
        this.amazon = interfaceC3187l;
        this.purchase = c5767l;
        this.billing = new C4269l(11);
        this.mopub = new LinkedHashMap();
        this.crashlytics = true;
    }

    public void amazon(String str, boolean z) {
        yandex(str, z ? "1" : "0");
    }

    public void crashlytics(long j, String str) {
        yandex(str, String.valueOf(j));
    }

    public void loadAd(int i, String str) {
        yandex(str, String.valueOf(i));
    }

    public void purchase() {
        InterfaceC3187l interfaceC3187l = (InterfaceC3187l) this.amazon;
        if (((C5268l) interfaceC3187l.loadAd()).subs != EnumC8981l.f18521l) {
            C8339l.smaato("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.yandex) {
                C8339l.smaato("SavedStateRegistry was already attached.");
                return;
            }
            ((C5767l) this.purchase).invoke();
            interfaceC3187l.loadAd().yandex(new C15356l(0, this));
            this.yandex = true;
        }
    }

    public Unit yandex(String str, String str2) {
        if (str2 == null) {
            return null;
        }
        ((LinkedHashMap) this.mopub).put(str, str2);
        return Unit.INSTANCE;
    }

    public C17464l(String str, InterfaceC13540l interfaceC13540l) {
        this.amazon = str;
        this.billing = interfaceC13540l;
        this.purchase = "5.272";
        this.mopub = new LinkedHashMap();
        this.admob = new LinkedHashMap();
    }

    public C17464l() {
        this.billing = C15333l.f29966l;
        this.loadAd = true;
        C9258l c9258l = AbstractC1186l.f3181l;
        this.mopub = C13708l.f26763l;
    }
}
