package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَٛؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10403l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C17812l f21224l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21225l;

    public /* synthetic */ C10403l(C17812l c17812l, int i) {
        this.f21225l = i;
        this.f21224l = c17812l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f21225l;
        C17812l c17812l = this.f21224l;
        switch (i) {
            case 0:
                InterfaceC18212l interfaceC18212l = (InterfaceC18212l) obj;
                C11224l c11224lAmazon = c17812l.amazon();
                if (c11224lAmazon != null) {
                    c11224lAmazon.crashlytics = interfaceC18212l;
                }
                return Unit.INSTANCE;
            case 1:
                C10086l c10086l = c17812l.tapsense;
                C0639l c0639l = (C0639l) obj;
                String str = c0639l.yandex.f7563l;
                C3625l c3625l = c17812l.isPro;
                if (!AbstractC8576l.yandex(str, c3625l != null ? c3625l.f7563l : null)) {
                    c17812l.firebase.setValue(EnumC7170l.f15004l);
                    if (((Boolean) c10086l.getValue()).booleanValue()) {
                        c10086l.setValue(Boolean.FALSE);
                    } else {
                        c17812l.subscription.setValue(Boolean.FALSE);
                    }
                }
                long j = C12814l.loadAd;
                c17812l.billing(j);
                c17812l.purchase(j);
                c17812l.Signature.invoke(c0639l);
                C4224l c4224l = c17812l.loadAd;
                C6931l c6931l = c4224l.yandex;
                if (c6931l != null) {
                    c6931l.subscription(c4224l, null);
                }
                return Unit.INSTANCE;
            case 2:
                c17812l.ads.loadAd(((C14694l) obj).yandex);
                return Unit.INSTANCE;
            case 3:
                return Boolean.valueOf(c17812l.ads.loadAd(((C14694l) obj).yandex));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                c17812l.adcel.setValue(bool);
                return Unit.INSTANCE;
        }
    }
}
