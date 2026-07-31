package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٟۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18536l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ boolean f36179l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f36180l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f36181l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f36182l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f36183l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f36184l;

    public /* synthetic */ C18536l(Set set, Function0 function0, Function0 function1, Function1 function2, boolean z) {
        this.f36181l = 1;
        this.f36183l = set;
        this.f36180l = function0;
        this.f36182l = function1;
        this.f36184l = function2;
        this.f36179l = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fFloatValue;
        int i = this.f36181l;
        boolean z = this.f36179l;
        Object obj2 = this.f36184l;
        Object obj3 = this.f36182l;
        Object obj4 = this.f36180l;
        Object obj5 = this.f36183l;
        switch (i) {
            case 0:
                C10086l c10086l = ((C14783l) obj5).crashlytics;
                Function0 function0 = (Function0) obj4;
                InterfaceC12244l interfaceC12244l = (InterfaceC12244l) obj3;
                InterfaceC12244l interfaceC12244l2 = (InterfaceC12244l) obj2;
                C6148l c6148l = (C6148l) obj;
                float fFloatValue2 = 0.8f;
                float fFloatValue3 = 1.0f;
                if (z) {
                    fFloatValue = ((Boolean) c10086l.getValue()).booleanValue() ? 1.0f : 0.8f;
                } else {
                    fFloatValue = ((Number) interfaceC12244l.getValue()).floatValue();
                }
                c6148l.remoteconfig(fFloatValue);
                if (!z) {
                    fFloatValue2 = ((Number) interfaceC12244l.getValue()).floatValue();
                } else if (((Boolean) c10086l.getValue()).booleanValue()) {
                    fFloatValue2 = 1.0f;
                }
                c6148l.vip(fFloatValue2);
                if (!z) {
                    fFloatValue3 = ((Number) interfaceC12244l2.getValue()).floatValue();
                } else if (!((Boolean) c10086l.getValue()).booleanValue()) {
                    fFloatValue3 = 0.0f;
                }
                c6148l.crashlytics(fFloatValue3);
                c6148l.tapsense(((C1723l) function0.invoke()).yandex);
                return Unit.INSTANCE;
            case 1:
                return new C8954l((Set) obj5, (Function0) obj4, (Function0) obj3, (EnumC9129l) obj, (Function1) obj2, this.f36179l);
            case 2:
                C17812l c17812l = (C17812l) obj5;
                C6523l c6523l = (C6523l) obj4;
                C16173l c16173l = (C16173l) obj3;
                InterfaceC4005l interfaceC4005l = (InterfaceC4005l) obj2;
                C1187l c1187l = (C1187l) obj;
                if (c17812l.loadAd()) {
                    InterfaceC8533l interfaceC8533l = c17812l.crashlytics;
                    if (interfaceC8533l != null) {
                        ((C4666l) interfaceC8533l).loadAd();
                    }
                } else {
                    C6523l.loadAd(c6523l);
                }
                if (c17812l.loadAd() && z) {
                    if (c17812l.yandex() != EnumC7170l.f15003l) {
                        C11224l c11224lAmazon = c17812l.amazon();
                        if (c11224lAmazon != null) {
                            long j = c1187l.yandex;
                            C18595l c18595l = c17812l.amazon;
                            C10403l c10403l = c17812l.license;
                            int iAmazon = interfaceC4005l.amazon(c11224lAmazon.loadAd(j, true));
                            c10403l.invoke(C0639l.yandex((C0639l) c18595l.f36317l, null, AbstractC2296l.loadAd(iAmazon, iAmazon), 5));
                            if (c17812l.yandex.yandex.f7563l.length() > 0) {
                                c17812l.firebase.setValue(EnumC7170l.f15002l);
                            }
                        }
                    } else {
                        c16173l.mopub(c1187l);
                    }
                }
                return Unit.INSTANCE;
            default:
                C12217l c12217l = (C12217l) obj4;
                long jYandex = AbstractC1848l.yandex(c12217l.metrica(z));
                ((C17078l) obj5).f33243l = jYandex;
                c12217l.isVip((EnumC1826l) obj3, jYandex);
                ((C17078l) obj2).f33243l = 0L;
                c12217l.pro = -1;
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C18536l(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.f36181l = i;
        this.f36183l = obj;
        this.f36180l = obj2;
        this.f36179l = z;
        this.f36182l = obj3;
        this.f36184l = obj4;
    }

    public /* synthetic */ C18536l(boolean z, C14783l c14783l, Function0 function0, C9459l c9459l, C9459l c9459l2) {
        this.f36181l = 0;
        this.f36179l = z;
        this.f36183l = c14783l;
        this.f36180l = function0;
        this.f36182l = c9459l;
        this.f36184l = c9459l2;
    }
}
