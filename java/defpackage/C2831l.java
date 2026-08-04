package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؔۖۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2831l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f6161l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f6162l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6163l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f6164l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f6165l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f6166l;

    public /* synthetic */ C2831l(EnumC12999l enumC12999l, Function1 function1, InterfaceC8714l interfaceC8714l, InterfaceC12244l interfaceC12244l, Function0 function0) {
        this.f6163l = 4;
        this.f6162l = enumC12999l;
        this.f6161l = function1;
        this.f6166l = interfaceC8714l;
        this.f6165l = interfaceC12244l;
        this.f6164l = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f6163l;
        int i2 = 22;
        int i3 = 2;
        int i4 = 1;
        Object obj2 = this.f6166l;
        Object obj3 = this.f6164l;
        Object obj4 = this.f6165l;
        Object obj5 = this.f6161l;
        Object obj6 = this.f6162l;
        switch (i) {
            case 0:
                C2429l c2429l = (C2429l) obj6;
                c2429l.yandex = ((C16166l) obj5).crashlytics((String) obj4, (C17423l) obj3, new C2683l(i3, (InterfaceC8714l) obj2));
                return new C9582l(1, c2429l);
            case 1:
                C10585l c10585l = (C10585l) obj;
                C18524l c18524l = ((C14624l) obj5).yandex;
                c10585l.admob = (C0639l) obj6;
                c10585l.subs = (C14966l) obj4;
                c10585l.crashlytics = (C6411l) obj3;
                c10585l.amazon = (Function1) obj2;
                c10585l.purchase = c18524l != null ? c18524l.f36156l : null;
                c10585l.billing = c18524l != null ? c18524l.f36157l : null;
                c10585l.mopub = c18524l != null ? (InterfaceC3114l) AbstractC13402l.loadAd(c18524l, AbstractC4751l.tapsense) : null;
                return Unit.INSTANCE;
            case 2:
                C5073l c5073l = (C5073l) obj6;
                C4975l c4975l = (C4975l) obj5;
                C5073l c5073l2 = (C5073l) obj4;
                C13765l c13765l = (C13765l) obj3;
                C13765l c13765l2 = (C13765l) obj2;
                C1336l c1336l = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(390096321, true, new C3973l(c5073l, 0)), 3);
                InterfaceC12244l interfaceC12244l = c5073l.f11086l;
                if (((C18364l) interfaceC12244l.getValue()).f35878l) {
                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1932175844, true, new C3973l(c5073l, i4)), 3);
                    if (((C18364l) interfaceC12244l.getValue()).f35877l) {
                        List list = ((C18364l) interfaceC12244l.getValue()).f35876l;
                        c1336l.firebase(list.size(), null, new Creturn(list, 22, false), new C15578l(2039820996, true, new C3127l(list, c4975l, c5073l2, i3)));
                        if (((C18364l) interfaceC12244l.getValue()).f35876l.size() < 4) {
                            AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(845546898, true, new C7442l((Object) c4975l, (Object) c5073l2, 26)), 3);
                        }
                    } else {
                        AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-393133120, true, new C0750l(1, c5073l, c13765l)), 3);
                        AbstractC1757l.appmetrica(c1336l, null, null, AbstractC15788l.mopub, 3);
                        AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(442251512, true, new C0750l(0, c5073l, c13765l2)), 3);
                    }
                }
                return Unit.INSTANCE;
            case 3:
                C17299l c17299l = (C17299l) obj6;
                C10700l c10700l = (C10700l) obj5;
                C13250l c13250l = (C13250l) obj4;
                C4154l c4154l = (C4154l) obj3;
                C9122l c9122l = (C9122l) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                C13835l c13835lM4301default = C17299l.m4301default(c17299l.admob);
                if (c13835lM4301default != null) {
                    C0458l c0458l = (C0458l) c17299l.billing;
                    long j = c13835lM4301default.loadAd;
                    long j2 = c13835lM4301default.yandex;
                    ((C13507l) c0458l.f1691l).yandex(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    ((C13507l) c0458l.f1690l).yandex(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                    C13835l c13835lYandex = ((C13835l) c10700l.f21708l).yandex(c13835lM4301default);
                    c10700l.f21708l = c13835lYandex;
                    float fIsPro = c4154l.isPro(c4154l.billing(c13835lYandex.yandex));
                    c13250l.f26029l = fIsPro;
                    c9122l.f18750l = !AbstractC7902l.yandex(fIsPro - fFloatValue);
                }
                return Boolean.valueOf(c13835lM4301default != null);
            case 4:
                EnumC12999l enumC12999l = (EnumC12999l) obj6;
                Function1 function1 = (Function1) obj5;
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj2;
                C1336l c1336l2 = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l2, null, null, new C15578l(903762718, true, new Cprotected(enumC12999l, function1, interfaceC8714l, i2)), 3);
                AbstractC1757l.appmetrica(c1336l2, null, null, AbstractC11156l.amazon, 3);
                c1336l2.firebase(EnumC12999l.f25472l.pro(), null, new C2911l(10), new C15578l(802480018, true, new C2414l(enumC12999l, function1, (InterfaceC12244l) obj4, interfaceC8714l, 4)));
                AbstractC1757l.appmetrica(c1336l2, null, null, new C15578l(-274998554, true, new C0541l((Function0) obj3, interfaceC8714l, 15)), 3);
                return Unit.INSTANCE;
            case 5:
                ((AbstractC10598l) obj).firebase((C12222l) obj6, new C17206l((C9970l) obj5, (String) obj4, (C3469l) obj3, (Function2) obj2, null));
                return Unit.INSTANCE;
            case 6:
                InterfaceC4005l interfaceC4005l = (InterfaceC4005l) obj5;
                C0639l c0639l = (C0639l) obj4;
                C17812l c17812l = (C17812l) obj3;
                C8990l c8990l = (C8990l) obj2;
                C6742l c6742l = (C6742l) obj;
                c6742l.yandex();
                float fAdmob = ((C13404l) obj6).crashlytics.admob();
                if (fAdmob != 0.0f) {
                    long j3 = c0639l.loadAd;
                    int i5 = C12814l.crashlytics;
                    int iAdmob = interfaceC4005l.admob((int) (j3 >> 32));
                    C11224l c11224lAmazon = c17812l.amazon();
                    C8896l c8896lCrashlytics = c11224lAmazon != null ? c11224lAmazon.yandex.crashlytics(iAdmob) : new C8896l(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(c6742l.mo868instanceof(2.0f));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f = fFloor / 2.0f;
                    float f2 = c8896lCrashlytics.yandex + f;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (c6742l.f14144l.f26629l.m4551private() >> 32)) - f;
                    if (f2 > fIntBitsToFloat) {
                        f2 = fIntBitsToFloat;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
                    c6742l.f14144l.purchase(c8990l, (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(c8896lCrashlytics.loadAd)) & 4294967295L), (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(c8896lCrashlytics.amazon))), fFloor, fAdmob);
                }
                return Unit.INSTANCE;
            default:
                C6576l c6576l = (C6576l) obj4;
                C14766l c14766l = (C14766l) obj3;
                C7363l c7363l = (C7363l) obj2;
                WebView webView = new WebView((Context) obj);
                ((Function1) obj6).invoke(webView);
                webView.setLayoutParams((FrameLayout.LayoutParams) obj5);
                Bundle bundle = c6576l.mopub;
                if (bundle != null) {
                    webView.restoreState(bundle);
                }
                webView.setWebChromeClient(c14766l);
                webView.setWebViewClient(c7363l);
                c6576l.admob.setValue(webView);
                return webView;
        }
    }

    public /* synthetic */ C2831l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f6163l = i;
        this.f6162l = obj;
        this.f6161l = obj2;
        this.f6165l = obj3;
        this.f6164l = obj4;
        this.f6166l = obj5;
    }
}
