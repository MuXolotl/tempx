package defpackage;

import android.app.Activity;
import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.graphics.Bitmap;
import android.media.MediaDrm;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.view.textclassifier.TextClassifier;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lًٓۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14019l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f27325l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f27326l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14019l(InterfaceC14029l interfaceC14029l, C1130l c1130l) {
        super(2, interfaceC14029l);
        this.f27325l = 25;
        this.f27326l = c1130l;
    }

    /* JADX WARN: Code duplicated, block: B:165:0x043b  */
    /* JADX WARN: Code duplicated, block: B:168:0x0440  */
    /* JADX WARN: Code duplicated, block: B:171:0x0453  */
    /* JADX WARN: Code duplicated, block: B:173:0x0457  */
    /* JADX WARN: Code duplicated, block: B:175:0x0466  */
    /* JADX WARN: Code duplicated, block: B:177:0x046a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0156  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r5v2, types: [lًؔؔ] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r8v105, types: [lؚۜٚ] */
    /* JADX WARN: Type inference failed for: r8v119, types: [lؒٙۡ] */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Exception {
        C0554l c0554l;
        AbstractC18643l abstractC18643l;
        AbstractC18643l abstractC18643l2;
        InterfaceC1837l interfaceC1837l;
        AbstractC0958l abstractC0958l;
        int i = 2;
        boolean z = true;
        z = true;
        ?? r5 = 0;
        Object obj2 = null;
        switch (this.f27325l) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                ((C11655l) this.f27326l).mo1143default();
                return Unit.INSTANCE;
            case 1:
                AbstractC2829l.crashlytics(obj);
                Activity activity = (Activity) this.f27326l;
                AppActivity appActivity = activity instanceof AppActivity ? (AppActivity) activity : null;
                if (appActivity == null) {
                    return null;
                }
                appActivity.premium();
                return Unit.INSTANCE;
            case 2:
                AbstractC2829l.crashlytics(obj);
                C11560l c11560l = ((C7711l) this.f27326l).f30818l;
                (c11560l != null ? c11560l : 0).setCurrentItem(1, true);
                return Unit.INSTANCE;
            case 3:
                AbstractC2829l.crashlytics(obj);
                ((C17284l) this.f27326l).f33537l.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 4:
                AbstractC2829l.crashlytics(obj);
                ((C18306l) this.f27326l).mo1143default();
                return Unit.INSTANCE;
            case 5:
                AbstractC2829l.crashlytics(obj);
                C5803l c5803l = (C5803l) this.f27326l;
                AbstractC10999l.mopub(c5803l.purchase, null, 0, new C6518l(c5803l, r5, i), 3);
                return Unit.INSTANCE;
            case 6:
                AbstractC2829l.crashlytics(obj);
                C13242l c13242l = (C13242l) this.f27326l;
                AbstractC10999l.mopub(c13242l.mopub, null, 0, new C3381l(c13242l, r5, z ? 1 : 0), 3);
                return Unit.INSTANCE;
            case 7:
                AbstractC2829l.crashlytics(obj);
                C11528l c11528l = (C11528l) this.f27326l;
                TextClassifier textClassifierRemoteconfig = AbstractC13950l.remoteconfig(c11528l.loadAd, c11528l.crashlytics);
                c11528l.billing = textClassifierRemoteconfig;
                return textClassifierRemoteconfig;
            case 8:
                AbstractC2829l.crashlytics(obj);
                return ((Function0) this.f27326l).invoke();
            case 9:
                String str = (String) this.f27326l;
                AbstractC2829l.crashlytics(obj);
                C0554l c0554l2 = C16076l.f31498l;
                if (c0554l2 == null) {
                    c0554l2 = null;
                }
                C10507l c10507lCrashlytics = ((C16076l) ((C3342l) c0554l2.f1958l).invoke()).crashlytics();
                if (AbstractC8576l.yandex((c10507lCrashlytics == null || (abstractC18643l2 = c10507lCrashlytics.loadAd) == null) ? null : abstractC18643l2.getYandex(), str)) {
                    c0554l = C16076l.f31498l;
                    if (c0554l == null) {
                        c0554l = null;
                    }
                    if (((C16076l) ((C3342l) c0554l.f1958l).invoke()).purchase() == EnumC11447l.f23032l) {
                        C0554l c0554l3 = C16076l.f31498l;
                        ((C16076l) ((C3342l) (c0554l3 != null ? c0554l3 : null).f1958l).invoke()).isPro();
                    } else {
                        C0554l c0554l4 = C16076l.f31498l;
                        ((C16076l) ((C3342l) (c0554l4 != null ? c0554l4 : null).f1958l).invoke()).smaato();
                    }
                } else {
                    C0554l c0554l5 = C16076l.f31498l;
                    if (c0554l5 == null) {
                        c0554l5 = null;
                    }
                    C10507l c10507lCrashlytics2 = ((C16076l) ((C3342l) c0554l5.f1958l).invoke()).crashlytics();
                    if (AbstractC8576l.yandex((c10507lCrashlytics2 == null || (abstractC18643l = c10507lCrashlytics2.loadAd) == null) ? null : abstractC18643l.startapp(), str)) {
                        c0554l = C16076l.f31498l;
                        if (c0554l == null) {
                            c0554l = null;
                        }
                        if (((C16076l) ((C3342l) c0554l.f1958l).invoke()).purchase() == EnumC11447l.f23032l) {
                            C0554l c0554l6 = C16076l.f31498l;
                            ((C16076l) ((C3342l) (c0554l6 != null ? c0554l6 : null).f1958l).invoke()).isPro();
                        } else {
                            C0554l c0554l7 = C16076l.f31498l;
                            ((C16076l) ((C3342l) (c0554l7 != null ? c0554l7 : null).f1958l).invoke()).smaato();
                        }
                    } else {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 10:
                AbstractC2829l.crashlytics(obj);
                ((C10700l) this.f27326l).f21708l = null;
                return Unit.INSTANCE;
            case 11:
                AbstractC2829l.crashlytics(obj);
                C0203l c0203l = ((C5198l) this.f27326l).f11269l;
                long j = c0203l.crashlytics;
                String str2 = AbstractC8942l.yandex;
                if (j == Thread.currentThread().getId() && c0203l.admob.purchase()) {
                    C8339l.smaato("Cannot close in a transaction block");
                    return null;
                }
                int i2 = 22;
                AbstractC15344l.billing(new C17972l(c0203l, (InterfaceC14029l) r5, i2));
                AbstractC11990l.billing(((C5198l) this.f27326l).f11270l, null);
                C11571l c11571l = ((C5198l) this.f27326l).f11264l;
                AbstractC10999l.subs(c11571l.amazon, new C14019l(c11571l, r5, i2));
                ((C5198l) this.f27326l).f11262l.remoteconfig();
                AutoCloseable autoCloseable = (AutoCloseable) ((C5198l) this.f27326l).f11272l.yandex;
                if (autoCloseable != null) {
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                    } else if (autoCloseable instanceof ExecutorService) {
                        AbstractC14238l.vip((ExecutorService) autoCloseable);
                    } else if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                    } else if (autoCloseable instanceof MediaMetadataRetriever) {
                        ((MediaMetadataRetriever) autoCloseable).release();
                    } else if (autoCloseable instanceof MediaDrm) {
                        ((MediaDrm) autoCloseable).release();
                    } else if (autoCloseable instanceof DrmManagerClient) {
                        ((DrmManagerClient) autoCloseable).release();
                    } else {
                        if (!(autoCloseable instanceof ContentProviderClient)) {
                            C11983l.crashlytics();
                            return null;
                        }
                        ((ContentProviderClient) autoCloseable).release();
                    }
                }
                C5198l c5198l = (C5198l) this.f27326l;
                ((C11534l) c5198l.f33214l).yandex("Realm closed: " + c5198l, new Object[0]);
                return Unit.INSTANCE;
            case 12:
                AbstractC2829l.crashlytics(obj);
                C10814l c10814l = (C10814l) this.f27326l;
                if (c10814l != null && (interfaceC1837l = c10814l.billing) != null) {
                    interfaceC1837l.yandex(c10814l);
                }
                return Unit.INSTANCE;
            case 13:
                AbstractC2829l.crashlytics(obj);
                return (C15067l) this.f27326l;
            case 14:
                AbstractC2829l.crashlytics(obj);
                ((C17517l) this.f27326l).purchase();
                return Unit.INSTANCE;
            case 15:
                AbstractC2829l.crashlytics(obj);
                C6922l c6922l = (C6922l) this.f27326l;
                AbstractC10999l.mopub(c6922l.amazon, null, 0, new C18236l(c6922l, r5, i), 3);
                return Unit.INSTANCE;
            case 16:
                AbstractC2829l.crashlytics(obj);
                ((C9583l) this.f27326l).purchase();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                AbstractC2829l.crashlytics(obj);
                ((C6111l) this.f27326l).f12896l.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                AbstractC2829l.crashlytics(obj);
                return (C14690l) this.f27326l;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                AbstractC2829l.crashlytics(obj);
                C7679l c7679l = (C7679l) this.f27326l;
                Boolean bool = (Boolean) ((C7549l) AbstractC16584l.yandex().billing.admob).f15551l.getValue();
                bool.getClass();
                c7679l.f16103l.setValue(bool);
                return Unit.INSTANCE;
            case 20:
                AbstractC2829l.crashlytics(obj);
                C8884l c8884l = (C8884l) this.f27326l;
                Boolean bool2 = (Boolean) ((C7549l) AbstractC16584l.yandex().billing.admob).f15551l.getValue();
                bool2.getClass();
                c8884l.f18251l.setValue(bool2);
                return Unit.INSTANCE;
            case 21:
                AbstractC2829l.crashlytics(obj);
                C16076l c16076l = VKXApplication.f36632l;
                (c16076l != null ? c16076l : null).ads();
                ((AppActivity) ((C0675l) this.f27326l).isVip()).recreate();
                return Unit.INSTANCE;
            case 22:
                AbstractC2829l.crashlytics(obj);
                C11571l c11571l2 = (C11571l) this.f27326l;
                if (c11571l2.purchase.yandex()) {
                    c11571l2.billing().m1955l();
                }
                return Unit.INSTANCE;
            case 23:
                AbstractC2829l.crashlytics(obj);
                C0203l c0203l2 = (C0203l) this.f27326l;
                if (c0203l2.purchase.yandex()) {
                    c0203l2.billing().m1955l();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                AbstractC2829l.crashlytics(obj);
                C8195l c8195l = (C8195l) this.f27326l;
                C8592l c8592l = new C8592l(((Number) c8195l.f17098l).intValue(), ((Number) c8195l.f17097l).intValue(), C3844l.f7950l);
                ?? r8 = c8592l.f23749l;
                C0869l c0869l = new C0869l();
                r8.amazon(c0869l, c8592l);
                String strBilling = c0869l.premium(c0869l.f2526l).billing();
                C13056l c13056l = new C13056l();
                c13056l.amazon = C17289l.f33554l;
                c13056l.yandex = "open.vkx.app";
                AbstractC11036l.loadAd(c13056l, new String[]{"iac"});
                c13056l.isPro.mo214l("a", strBilling);
                Unit unit = Unit.INSTANCE;
                return c13056l.crashlytics();
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                AbstractC2829l.crashlytics(obj);
                if (!((C1130l) this.f27326l).admob.loadAd()) {
                    C2667l c2667lYandex = ((C1130l) this.f27326l).yandex.yandex();
                    C16047l c16047l = ((C1130l) this.f27326l).yandex;
                    c16047l.crashlytics.loadAd = c16047l.yandex();
                    C7647l c7647l = c16047l.loadAd;
                    C2667l c2667lYandex2 = c16047l.yandex();
                    synchronized (c7647l.yandex) {
                        try {
                            if (AbstractC5088l.firebase("CXCP")) {
                                Log.d("CXCP", "Camera graph updated from " + c7647l.amazon + " to " + c2667lYandex2);
                            }
                            EnumC10062l enumC10062l = c7647l.purchase;
                            EnumC10062l enumC10062l2 = EnumC10062l.f20529l;
                            if (enumC10062l != enumC10062l2) {
                                c7647l.crashlytics(EnumC10062l.f20534l, null);
                                c7647l.crashlytics(enumC10062l2, null);
                            }
                            c7647l.amazon = c2667lYandex2;
                            c7647l.purchase = enumC10062l2;
                            Unit unit2 = Unit.INSTANCE;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c2667lYandex.mopub();
                    Map map = (Map) ((C1130l) this.f27326l).yandex.billing.getValue();
                    C1130l c1130l = (C1130l) this.f27326l;
                    C9395l c9395l = (C9395l) c1130l.isPro.getValue();
                    C10814l c10814l2 = ((C11419l) c9395l.purchase.getValue()).crashlytics() ? (C10814l) c9395l.billing.getValue() : null;
                    if (c10814l2 != null) {
                        List listUnmodifiableList = DesugarCollections.unmodifiableList(c10814l2.mopub.yandex);
                        for (Object obj3 : c10814l2.loadAd()) {
                            if (!listUnmodifiableList.contains((AbstractC0958l) obj3)) {
                                obj2 = obj3;
                                abstractC0958l = (AbstractC0958l) obj2;
                                if (abstractC0958l != null) {
                                }
                            }
                        }
                        abstractC0958l = (AbstractC0958l) obj2;
                        if (abstractC0958l != null) {
                        }
                    }
                    if (AbstractC5088l.firebase("CXCP")) {
                        Log.d("CXCP", "Setting up Surfaces with UseCaseSurfaceManager");
                    }
                    if (((C11419l) ((C9395l) ((C1130l) this.f27326l).isPro.getValue()).purchase.getValue()).crashlytics()) {
                        ((C14750l) C4271l.billing((C4271l) ((C1130l) this.f27326l).subs.getValue(), c2667lYandex, (C9395l) ((C1130l) this.f27326l).isPro.getValue(), map)).mo2154l(C12844l.f25266l);
                    } else if (AbstractC5088l.smaato()) {
                        Log.e("CXCP", "Unable to create capture session due to conflicting configurations");
                    }
                } else if (AbstractC5088l.firebase("CXCP")) {
                    Log.d("CXCP", "UseCaseCamera is closed before starting the CameraGraph, skipping setup.");
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                AbstractC2829l.crashlytics(obj);
                C7545l c7545l = C18718l.purchase;
                Bitmap bitmap = (Bitmap) this.f27326l;
                C1010l c1010lLoadAd = C6565l.ads(bitmap).loadAd();
                C1010l c1010l = DesugarCollections.unmodifiableList(c1010lLoadAd.yandex).isEmpty() ? null : c1010lLoadAd;
                if (c1010l != null) {
                    return c1010l;
                }
                C2934l c2934lAds = C6565l.ads(bitmap);
                ((ArrayList) c2934lAds.f6385l).clear();
                return c2934lAds.loadAd();
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                AbstractC2829l.crashlytics(obj);
                ViewOnAttachStateChangeListenerC5635l viewOnAttachStateChangeListenerC5635l = (ViewOnAttachStateChangeListenerC5635l) this.f27326l;
                C0364l c0364l = viewOnAttachStateChangeListenerC5635l.f11990l;
                if (c0364l != null) {
                    c0364l.amazon();
                }
                viewOnAttachStateChangeListenerC5635l.f11990l = null;
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                AbstractC2829l.crashlytics(obj);
                ((Cconst) ((C18396l) this.f27326l).f35933l).invoke();
                return Unit.INSTANCE;
            default:
                AbstractC2829l.crashlytics(obj);
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(((C0858l) this.f27326l).f2514l.isPro);
                return mediaExtractor.getTrackFormat(0);
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f27325l;
        Object obj2 = this.f27326l;
        switch (i) {
            case 0:
                return new C14019l((C11655l) obj2, interfaceC14029l, 0);
            case 1:
                return new C14019l((Activity) obj2, interfaceC14029l, 1);
            case 2:
                return new C14019l((C7711l) obj2, interfaceC14029l, 2);
            case 3:
                return new C14019l((C17284l) obj2, interfaceC14029l, 3);
            case 4:
                return new C14019l((C18306l) obj2, interfaceC14029l, 4);
            case 5:
                return new C14019l((C5803l) obj2, interfaceC14029l, 5);
            case 6:
                return new C14019l((C13242l) obj2, interfaceC14029l, 6);
            case 7:
                return new C14019l((C11528l) obj2, interfaceC14029l, 7);
            case 8:
                return new C14019l((Function0) obj2, interfaceC14029l, 8);
            case 9:
                return new C14019l((String) obj2, interfaceC14029l, 9);
            case 10:
                return new C14019l((C10700l) obj2, interfaceC14029l, 10);
            case 11:
                return new C14019l((C5198l) obj2, interfaceC14029l, 11);
            case 12:
                return new C14019l((C10814l) obj2, interfaceC14029l, 12);
            case 13:
                return new C14019l((C15067l) obj2, interfaceC14029l, 13);
            case 14:
                return new C14019l((C17517l) obj2, interfaceC14029l, 14);
            case 15:
                return new C14019l((C6922l) obj2, interfaceC14029l, 15);
            case 16:
                return new C14019l((C9583l) obj2, interfaceC14029l, 16);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C14019l((C6111l) obj2, interfaceC14029l, 17);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C14019l((C14690l) obj2, interfaceC14029l, 18);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C14019l((C7679l) obj2, interfaceC14029l, 19);
            case 20:
                return new C14019l((C8884l) obj2, interfaceC14029l, 20);
            case 21:
                return new C14019l((C0675l) obj2, interfaceC14029l, 21);
            case 22:
                return new C14019l((C11571l) obj2, interfaceC14029l, 22);
            case 23:
                return new C14019l((C0203l) obj2, interfaceC14029l, 23);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C14019l((C8195l) obj2, interfaceC14029l, 24);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C14019l(interfaceC14029l, (C1130l) obj2);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C14019l((Bitmap) obj2, interfaceC14029l, 26);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C14019l((ViewOnAttachStateChangeListenerC5635l) obj2, interfaceC14029l, 27);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C14019l((C18396l) obj2, interfaceC14029l, 28);
            default:
                return new C14019l((C0858l) obj2, interfaceC14029l, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27325l) {
            case 0:
                return ((C14019l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C14019l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C14019l) ads((InterfaceC14029l) obj2, (C1215l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C14019l) ads((InterfaceC14029l) obj2, (C7649l) obj)).Signature(Unit.INSTANCE);
            case 4:
                return ((C14019l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 5:
                return ((C14019l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 6:
                return ((C14019l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 7:
                return ((C14019l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 8:
                return ((C14019l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 9:
                return ((C14019l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 10:
                return ((C14019l) ads((InterfaceC14029l) obj2, (Unit) obj)).Signature(Unit.INSTANCE);
            case 11:
                return ((C14019l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 12:
                return ((C14019l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 13:
                C14019l c14019l = (C14019l) ads((InterfaceC14029l) obj2, (C15067l) obj);
                AbstractC2829l.crashlytics(Unit.INSTANCE);
                return (C15067l) c14019l.f27326l;
            case 14:
                return ((C14019l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 15:
                return ((C14019l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 16:
                return ((C14019l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C14019l) ads((InterfaceC14029l) obj2, (C7649l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C14019l c14019l2 = (C14019l) ads((InterfaceC14029l) obj2, (C14690l) obj);
                AbstractC2829l.crashlytics(Unit.INSTANCE);
                return (C14690l) c14019l2.f27326l;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C14019l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 20:
                return ((C14019l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 21:
                return ((C14019l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 22:
                return ((C14019l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 23:
                return ((C14019l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C14019l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C14019l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C14019l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C14019l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C14019l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C14019l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14019l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f27325l = i;
        this.f27326l = obj;
    }
}
