package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙٕۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15531l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0205l f30342l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30343l;

    public /* synthetic */ C15531l(C0205l c0205l, int i) {
        this.f30343l = i;
        this.f30342l = c0205l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C15812l c15812l;
        C15812l c15812l2;
        C3242l c3242lSubs;
        int i = this.f30343l;
        C0205l c0205l = this.f30342l;
        switch (i) {
            case 0:
                return new C9582l(16, c0205l);
            case 1:
                if (c0205l.f1163l.yandex().loadAd(((Long) obj).longValue())) {
                    c0205l.smaato();
                    c0205l.metrica(null);
                }
                return Unit.INSTANCE;
            case 2:
                long jLongValue = ((Long) obj).longValue();
                C3242l c3242lSubs2 = c0205l.subs();
                if (c3242lSubs2 != null && (c15812l2 = c3242lSubs2.yandex) != null && jLongValue == c15812l2.crashlytics) {
                    c0205l.f1174l.setValue(null);
                }
                C3242l c3242lSubs3 = c0205l.subs();
                if (c3242lSubs3 != null && (c15812l = c3242lSubs3.loadAd) != null && jLongValue == c15812l.crashlytics) {
                    c0205l.f1167l.setValue(null);
                }
                if (c0205l.f1163l.yandex().loadAd(jLongValue)) {
                    c0205l.tapsense();
                }
                C15920l c15920l = (C15920l) c0205l.f1154l.mopub(jLongValue);
                if (c15920l != null) {
                    c15920l.loadAd();
                }
                return Unit.INSTANCE;
            case 3:
                InterfaceC18212l interfaceC18212l = (InterfaceC18212l) obj;
                C8896l c8896l = (C8896l) c0205l.f1166l.getValue();
                if (c8896l == null) {
                    return null;
                }
                InterfaceC18212l interfaceC18212l2 = c0205l.f1170l;
                if (interfaceC18212l2 != null) {
                    return AbstractC17332l.amazon(c8896l, interfaceC18212l2, interfaceC18212l);
                }
                AbstractC14825l.amazon("Required value was null.");
                C17132l.firebase();
                return null;
            case 4:
                InterfaceC18212l interfaceC18212l3 = (InterfaceC18212l) obj;
                C11611l c11611l = c0205l.f1163l;
                c0205l.f1170l = interfaceC18212l3;
                if (interfaceC18212l3 != null && interfaceC18212l3.mopub() && (c3242lSubs = c0205l.subs()) != null && c11611l.yandex().purchase == 0) {
                    ArrayList arrayListPurchase = c11611l.purchase(c0205l.remoteconfig());
                    if (!arrayListPurchase.isEmpty()) {
                        c11611l.firebase.setValue(AbstractC15450l.yandex(c3242lSubs, arrayListPurchase, new C10557l(24), new C2062l(27), new C2125l(c3242lSubs, 1)));
                    }
                    C6523l.loadAd(c0205l.f1160l);
                }
                if (((Boolean) c0205l.f1171l.getValue()).booleanValue() && c0205l.subs() != null) {
                    C1187l c1187l = interfaceC18212l3 != null ? new C1187l(interfaceC18212l3.amazon(0L)) : null;
                    if (!AbstractC8576l.yandex(c0205l.f1173l, c1187l)) {
                        c0205l.f1173l = c1187l;
                        c0205l.ads();
                        c0205l.tapsense();
                    }
                }
                return Unit.INSTANCE;
            case 5:
                C10086l c10086l = c0205l.f1171l;
                EnumC11822l enumC11822l = (EnumC11822l) obj;
                if (!enumC11822l.yandex() && ((Boolean) c10086l.getValue()).booleanValue()) {
                    c0205l.smaato();
                }
                c10086l.setValue(Boolean.valueOf(enumC11822l.yandex()));
                return Unit.INSTANCE;
            case 6:
                c0205l.vip(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            case 7:
                c0205l.metrica((C3242l) obj);
                return Unit.INSTANCE;
            default:
                if (c0205l.f1163l.yandex().loadAd(((Long) obj).longValue())) {
                    c0205l.f1155l.setValue(Unit.INSTANCE);
                    c0205l.ads();
                    c0205l.tapsense();
                }
                return Unit.INSTANCE;
        }
    }
}
