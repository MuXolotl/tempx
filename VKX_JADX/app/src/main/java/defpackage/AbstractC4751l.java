package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lًٜؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4751l {
    public static final C10707l yandex = new C10707l(C5617l.f11937l);
    public static final C10707l loadAd = new C10707l(C5617l.f11965l);
    public static final C10707l crashlytics = new C10707l(C5617l.f11950l);
    public static final C10707l amazon = new C10707l(C5617l.f11945l);
    public static final C10707l purchase = new C10707l(C5617l.f11936l);
    public static final C10707l billing = new C10707l(C5617l.f11956l);
    public static final C10707l mopub = new C10707l(C16395l.f32067l);
    public static final C10707l admob = new C10707l(C5617l.f11955l);
    public static final C10707l subs = new C10707l(C5617l.f11963l);
    public static final C10707l isPro = new C10707l(C5617l.f11958l);
    public static final C10707l firebase = new C10707l(C5617l.f11948l);
    public static final C10707l smaato = new C10707l(C16395l.f32080l);
    public static final C10707l remoteconfig = new C10707l(C16395l.f32079l);
    public static final C10707l vip = new C10707l(C16395l.f32084l);
    public static final C10707l metrica = new C10707l(C16395l.f32071l);
    public static final C10707l startapp = new C10707l(C16395l.f32082l);
    public static final C10707l adcel = new C10707l(C16395l.f32077l);
    public static final C10707l ads = new C10707l(C16395l.f32066l);
    public static final C10707l subscription = new C10707l(C16395l.f32086l);
    public static final C10707l tapsense = new C10707l(C16395l.f32078l);
    public static final C10707l Signature = new C10707l(C16395l.f32072l);
    public static final C10707l license = new C10707l(C16395l.f32085l);
    public static final C10707l pro = new C10707l(C16395l.f32068l);
    public static final C8540l ad = new C8540l(C16395l.f32083l);
    public static final C10707l advert = new C10707l(C5617l.f11949l);

    public static final void loadAd(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final void yandex(InterfaceC11218l interfaceC11218l, C18196l c18196l, Function2 function2, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(1925803616);
        int i3 = i | (c6956l.billing(interfaceC11218l) ? 4 : 2) | (c6956l.billing(c18196l) ? 32 : 16) | (c6956l.admob(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l.m2127for(i3 & 1, (i3 & 147) != 146)) {
            ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = (ViewTreeObserverOnGlobalLayoutListenerC13840l) interfaceC11218l;
            C10092l c10092lYandex = yandex.yandex(viewTreeObserverOnGlobalLayoutListenerC13840l.getAccessibilityManager());
            C10092l c10092lYandex2 = loadAd.yandex(viewTreeObserverOnGlobalLayoutListenerC13840l.m3778getAutofill());
            C10092l c10092lYandex3 = amazon.yandex(viewTreeObserverOnGlobalLayoutListenerC13840l.m3779getAutofillManager());
            C10092l c10092lYandex4 = crashlytics.yandex(viewTreeObserverOnGlobalLayoutListenerC13840l.getAutofillTree());
            C10092l c10092lYandex5 = purchase.yandex(viewTreeObserverOnGlobalLayoutListenerC13840l.getClipboardManager());
            C10092l c10092lYandex6 = billing.yandex(viewTreeObserverOnGlobalLayoutListenerC13840l.getClipboard());
            C10092l c10092lYandex7 = admob.yandex(viewTreeObserverOnGlobalLayoutListenerC13840l.getDensity());
            C10092l c10092lYandex8 = subs.yandex(viewTreeObserverOnGlobalLayoutListenerC13840l.getFocusOwner());
            C10092l c10092lYandex9 = isPro.yandex(viewTreeObserverOnGlobalLayoutListenerC13840l.getFontLoader());
            c10092lYandex9.mopub = false;
            C10092l c10092lYandex10 = firebase.yandex(viewTreeObserverOnGlobalLayoutListenerC13840l.getFontFamilyResolver());
            c10092lYandex10.mopub = false;
            C10092l c10092lYandex11 = smaato.yandex(viewTreeObserverOnGlobalLayoutListenerC13840l.getHapticFeedBack());
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (z || objM2132native == c13863l) {
                objM2132native = new C13488l(viewTreeObserverOnGlobalLayoutListenerC13840l, 3);
                c6956l.m2147try(objM2132native);
            }
            C10092l c10092lCrashlytics = remoteconfig.crashlytics((Function1) objM2132native);
            C10092l c10092lYandex12 = vip.yandex(viewTreeObserverOnGlobalLayoutListenerC13840l.getLayoutDirection());
            boolean z2 = i4 == 4;
            Object objM2132native2 = c6956l.m2132native();
            if (z2 || objM2132native2 == c13863l) {
                i2 = 4;
                objM2132native2 = new C13488l(viewTreeObserverOnGlobalLayoutListenerC13840l, i2);
                c6956l.m2147try(objM2132native2);
            } else {
                i2 = 4;
            }
            C10092l c10092lCrashlytics2 = startapp.crashlytics((Function1) objM2132native2);
            boolean z3 = i4 == i2;
            Object objM2132native3 = c6956l.m2132native();
            boolean z4 = z3;
            int i5 = 5;
            if (z4 || objM2132native3 == c13863l) {
                objM2132native3 = new C13488l(viewTreeObserverOnGlobalLayoutListenerC13840l, i5);
                c6956l.m2147try(objM2132native3);
            }
            C10092l c10092lCrashlytics3 = adcel.crashlytics((Function1) objM2132native3);
            boolean z5 = i4 == 4;
            Object objM2132native4 = c6956l.m2132native();
            int i6 = 6;
            if (z5 || objM2132native4 == c13863l) {
                objM2132native4 = new C13488l(viewTreeObserverOnGlobalLayoutListenerC13840l, i6);
                c6956l.m2147try(objM2132native4);
            }
            C10092l c10092lCrashlytics4 = ads.crashlytics((Function1) objM2132native4);
            C10092l c10092lYandex13 = subscription.yandex(c18196l);
            C10092l c10092lYandex14 = tapsense.yandex(viewTreeObserverOnGlobalLayoutListenerC13840l.getViewConfiguration());
            C10092l c10092lYandex15 = Signature.yandex(viewTreeObserverOnGlobalLayoutListenerC13840l.getWindowInfo());
            boolean z6 = i4 == 4;
            Object objM2132native5 = c6956l.m2132native();
            int i7 = 7;
            if (z6 || objM2132native5 == c13863l) {
                objM2132native5 = new C13488l(viewTreeObserverOnGlobalLayoutListenerC13840l, i7);
                c6956l.m2147try(objM2132native5);
            }
            AbstractC10478l.loadAd(new C10092l[]{c10092lYandex, c10092lYandex2, c10092lYandex3, c10092lYandex4, c10092lYandex5, c10092lYandex6, c10092lYandex7, c10092lYandex8, c10092lYandex9, c10092lYandex10, c10092lYandex11, c10092lCrashlytics, c10092lYandex12, c10092lCrashlytics2, c10092lCrashlytics3, c10092lCrashlytics4, c10092lYandex13, c10092lYandex14, c10092lYandex15, pro.crashlytics((Function1) objM2132native5), mopub.yandex(viewTreeObserverOnGlobalLayoutListenerC13840l.getGraphicsContext()), AbstractC2048l.yandex.yandex(viewTreeObserverOnGlobalLayoutListenerC13840l.getRetainedValuesStore()), metrica.yandex(viewTreeObserverOnGlobalLayoutListenerC13840l.getLocaleList())}, function2, c6956l, ((i3 >> 3) & 112) | 8);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C11834l(interfaceC11218l, c18196l, function2, i, 2);
        }
    }
}
