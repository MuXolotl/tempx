package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lُٓٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11029l extends AbstractC16915l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f22219l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f22220l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11029l(int i, Object obj) {
        super(0);
        this.f22220l = i;
        this.f22219l = obj;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:119:0x020c  */
    /* JADX WARN: Code duplicated, block: B:120:0x020f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0213  */
    /* JADX WARN: Code duplicated, block: B:123:0x0216  */
    /* JADX WARN: Code duplicated, block: B:125:0x024c  */
    /* JADX WARN: Code duplicated, block: B:147:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x007c A[LOOP:0: B:13:0x0047->B:23:0x007c, LOOP_END] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        InterfaceC16497l interfaceC16497l;
        C6931l c6931l;
        int i2 = this.f22220l;
        Context context = null;
        interfaceC18212l = null;
        InterfaceC18212l interfaceC18212l = null;
        context = null;
        Object obj = this.f22219l;
        switch (i2) {
            case 0:
                AbstractC11990l.billing(((C12095l) obj).f24020l, null);
                return Unit.INSTANCE;
            case 1:
                return Unit.INSTANCE;
            case 2:
                C18656l c18656l = (C18656l) obj;
                Object objCrashlytics = c18656l.crashlytics();
                EnumC18226l enumC18226l = EnumC18226l.f35692l;
                return Boolean.valueOf(objCrashlytics == enumC18226l && c18656l.amazon.getValue() == enumC18226l);
            case 3:
                return (C8896l) obj;
            case 4:
                return AbstractC8020l.smaato((C12818l) obj);
            case 5:
                boolean zLoadAd = C4999l.loadAd(0L, 0L);
                View view = ((C11096l) obj).yandex;
                if (!zLoadAd) {
                    return new C5502l(0L, AbstractC9361l.loadAd(AbstractC14707l.mopub(0L), AbstractC5998l.yandex(view.getContext())));
                }
                Context context2 = view.getContext();
                Context baseContext = context2;
                while (baseContext instanceof ContextWrapper) {
                    if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService) || (baseContext instanceof Application)) {
                        context = baseContext;
                    } else {
                        ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                        if (contextWrapper.getBaseContext() != null) {
                            baseContext = contextWrapper.getBaseContext();
                        }
                    }
                    if (context != null) {
                        Configuration configuration = context2.getResources().getConfiguration();
                        C8420l c8420lYandex = AbstractC5998l.yandex(context2);
                        long jYandex = AbstractC9027l.yandex(configuration.screenWidthDp, configuration.screenHeightDp);
                        return new C5502l(AbstractC14707l.billing(AbstractC9361l.amazon(jYandex, c8420lYandex)), jYandex);
                    }
                    InterfaceC13564l.yandex.getClass();
                    C13567l c13567l = C9311l.loadAd;
                    i = Build.VERSION.SDK_INT;
                    if (i >= 34) {
                        interfaceC16497l = C17621l.f34289l;
                    } else if (i >= 30) {
                        interfaceC16497l = C4209l.f8639l;
                    } else {
                        interfaceC16497l = C11140l.f22368l;
                    }
                    C9742l c9742lAmazon = interfaceC16497l.amazon(context, c13567l.loadAd);
                    long jWidth = (((long) c9742lAmazon.yandex().width()) << 32) | (((long) c9742lAmazon.yandex().height()) & 4294967295L);
                    return new C5502l(jWidth, AbstractC9361l.loadAd(AbstractC14707l.mopub(jWidth), AbstractC5998l.yandex(context)));
                }
                if (context != null) {
                    Configuration configuration2 = context2.getResources().getConfiguration();
                    C8420l c8420lYandex2 = AbstractC5998l.yandex(context2);
                    long jYandex2 = AbstractC9027l.yandex(configuration2.screenWidthDp, configuration2.screenHeightDp);
                    return new C5502l(AbstractC14707l.billing(AbstractC9361l.amazon(jYandex2, c8420lYandex2)), jYandex2);
                }
                InterfaceC13564l.yandex.getClass();
                C13567l c13567l2 = C9311l.loadAd;
                i = Build.VERSION.SDK_INT;
                if (i >= 34) {
                    interfaceC16497l = C17621l.f34289l;
                } else if (i >= 30) {
                    interfaceC16497l = C4209l.f8639l;
                } else {
                    interfaceC16497l = C11140l.f22368l;
                }
                C9742l c9742lAmazon2 = interfaceC16497l.amazon(context, c13567l2.loadAd);
                long jWidth2 = (((long) c9742lAmazon2.yandex().width()) << 32) | (((long) c9742lAmazon2.yandex().height()) & 4294967295L);
                return new C5502l(jWidth2, AbstractC9361l.loadAd(AbstractC14707l.mopub(jWidth2), AbstractC5998l.yandex(context)));
            case 6:
                C13551l c13551l = (C13551l) obj;
                C10086l c10086l = c13551l.loadAd;
                Boolean bool = Boolean.FALSE;
                c10086l.setValue(bool);
                c13551l.crashlytics(false);
                C14169l c14169l = c13551l.crashlytics;
                ((C10086l) c14169l.yandex).setValue(bool);
                ((C10086l) c14169l.crashlytics).setValue(bool);
                ((C10086l) c14169l.purchase).setValue(bool);
                ((C10086l) c14169l.mopub).setValue(bool);
                c13551l.purchase = C9735l.isPro;
                c13551l.billing = 1.0f;
                c13551l.mopub = 1.0f;
                C13507l c13507l = c13551l.isPro;
                if (c13507l != null) {
                    AbstractC8669l.m2414strictfp(c13507l.amazon, null);
                    c13507l.purchase = 0;
                }
                c13551l.admob = C1723l.loadAd;
                c13551l.subs = 0L;
                return Unit.INSTANCE;
            case 7:
                ((C6543l) obj).m2024l();
                return Unit.INSTANCE;
            case 8:
                return (InputMethodManager) ((View) ((C10111l) obj).f20587l).getContext().getSystemService("input_method");
            case 9:
                C14070l c14070l = ((C3654l) obj).f7667l;
                c14070l.startapp.f29337l = true;
                C4020l c4020l = c14070l.adcel;
                if (c4020l != null) {
                    c4020l.f8267l = true;
                }
                return Unit.INSTANCE;
            case 10:
                C14346l c14346l = (C14346l) obj;
                if (!((Boolean) c14346l.mopub.getValue()).booleanValue() && (c6931l = c14346l.crashlytics) != null) {
                    c6931l.remoteconfig();
                }
                return Unit.INSTANCE;
            case 11:
                C3103l c3103l = (C3103l) ((C11603l) obj).yandex.f7072l;
                if (!c3103l.f6645l) {
                    if (c3103l.f6644l) {
                        AbstractC16941l.yandex("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    c3103l.yandex();
                    c3103l.f6644l = true;
                }
                return Unit.INSTANCE;
            case 12:
                return ((C17110l) obj).amazon;
            case 13:
                return ((C4369l) obj).m1542l();
            case 14:
                C11941l c11941l = (C11941l) obj;
                InterfaceC18212l parentLayoutCoordinates = c11941l.getParentLayoutCoordinates();
                if (parentLayoutCoordinates != null && parentLayoutCoordinates.mopub()) {
                    interfaceC18212l = parentLayoutCoordinates;
                }
                return Boolean.valueOf((interfaceC18212l == null || c11941l.m3294getPopupContentSizebOM6tXw() == null) ? false : true);
            case 15:
                C0151l c0151l = (C0151l) obj;
                c0151l.subs = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    c0151l.yandex();
                    Unit unit = Unit.INSTANCE;
                    return Unit.INSTANCE;
                } finally {
                    Trace.endSection();
                }
            case 16:
                return new C1187l(((C1187l) ((InterfaceC8714l) obj).getValue()).yandex);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                Collection collectionValues = ((C7090l) ((C14632l) obj).f28633l.purchase().crashlytics).values();
                if (!((AbstractC7095l) collectionValues).isEmpty()) {
                    Iterator it = ((C7067l) collectionValues).iterator();
                    while (it.hasNext() && !((C14509l) it.next()).amazon()) {
                    }
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C9117l c9117lYandex = ((C2768l) obj).yandex();
                C3654l c3654l = c9117lYandex.f18732l;
                if (c9117lYandex.f18741l != ((C17893l) ((C4588l) c3654l.startapp()).f9321l).f34846l) {
                    C13660l c13660l = c9117lYandex.f18739l;
                    Object[] objArr = c13660l.crashlytics;
                    long[] jArr = c13660l.yandex;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((255 & j) < 128) {
                                        ((C14346l) objArr[(i3 << 3) + i5]).amazon = true;
                                    }
                                    j >>= 8;
                                }
                                if (i4 == 8) {
                                    if (i3 != length) {
                                        i3++;
                                    }
                                }
                            } else if (i3 != length) {
                                i3++;
                            }
                        }
                    }
                    if (c3654l.f7693l != null) {
                        if (!c3654l.f7667l.purchase) {
                            C3654l.m1370final(c3654l, false, 7);
                        }
                    } else if (!c3654l.ads()) {
                        C3654l.m1371goto(c3654l, false, 7);
                    }
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new BaseInputConnection(((C8483l) obj).yandex, false);
            default:
                Unit unit2 = Unit.INSTANCE;
                ((C3408l) obj).f7260l.setValue(unit2);
                return unit2;
        }
    }
}
